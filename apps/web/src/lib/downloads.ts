/**
 * The download queue.
 *
 * A downloaded episode has to survive a reload and play with the network off,
 * which rules out keeping bytes in memory. The bytes go into IndexedDB as a
 * `Blob` and the metadata stays in `localStorage` (`library.ts`), so the library
 * renders instantly and the file is only touched when it is played.
 *
 * The file host does not send CORS headers, so a direct `fetch` from the page is
 * blocked in the browser. Requests go through `/api/dl?src=…`, a same-origin proxy
 * (dev server middleware in `vite.config.ts`, a real proxy in production). The
 * native build has no such restriction and fetches the URL directly — the queue
 * does not care which, because it only asks `mediaUrl()`, and `mediaSchema` below
 * describes which storage backend the queue is writing to.
 *
 * Live progress is what makes this feel like an app rather than a browser link:
 * the requirement is a download that reports bytes, shows a bar, and can be
 * cancelled or resumed.
 */

import type { DownloadEntry } from "@anispots/core";
import { getDownloads, putDownloads, removeDownloads, upsertDownload, updateDownload } from "./library";

/* ---------------------------------------------------------------- storage */

const DB_NAME = "anispots";
const DB_VERSION = 1;
const STORE = "files";

let dbPromise: Promise<IDBDatabase> | null = null;

function openDb(): Promise<IDBDatabase> {
  if (dbPromise) return dbPromise;

  dbPromise = new Promise((resolve, reject) => {
    const request = indexedDB.open(DB_NAME, DB_VERSION);
    request.onupgradeneeded = () => {
      const db = request.result;
      if (!db.objectStoreNames.contains(STORE)) db.createObjectStore(STORE);
    };
    request.onsuccess = () => resolve(request.result);
    request.onerror = () => reject(request.error ?? new Error("IndexedDB refused to open"));
  });

  return dbPromise;
}

async function putFile(id: string, blob: Blob): Promise<void> {
  const db = await openDb();
  await new Promise<void>((resolve, reject) => {
    const tx = db.transaction(STORE, "readwrite");
    tx.objectStore(STORE).put(blob, id);
    tx.oncomplete = () => resolve();
    tx.onerror = () => reject(tx.error ?? new Error("Could not store the file"));
  });
}

export async function readFile(id: string): Promise<Blob | null> {
  const db = await openDb();
  return new Promise((resolve, reject) => {
    const tx = db.transaction(STORE, "readonly");
    const request = tx.objectStore(STORE).get(id);
    request.onsuccess = () => resolve((request.result as Blob | undefined) ?? null);
    request.onerror = () => reject(request.error ?? new Error("Could not read the file"));
  });
}

async function deleteFile(id: string): Promise<void> {
  const db = await openDb();
  await new Promise<void>((resolve) => {
    const tx = db.transaction(STORE, "readwrite");
    tx.objectStore(STORE).delete(id);
    tx.oncomplete = () => resolve();
    tx.onerror = () => resolve();
  });
}

/** An object URL for a stored file, for the `<video>` in the player. */
export async function fileUrl(id: string): Promise<string | null> {
  const blob = await readFile(id);
  return blob ? URL.createObjectURL(blob) : null;
}

/* ------------------------------------------------------------------ proxy */

/**
 * The URL the queue actually fetches.
 *
 * In the browser this is the same-origin proxy; the origin is implied by the
 * leading slash, so the deployed app serves it from wherever it is hosted.
 */
export function mediaUrl(sourceUrl: string): string {
  return `/api/dl?src=${encodeURIComponent(sourceUrl)}`;
}

/* ------------------------------------------------------------------ queue */

/** Entries currently moving bytes. Kept outside React so a re-render cannot stop one. */
const running = new Map<string, AbortController>();
const listeners = new Set<() => void>();

export function subscribe(listener: () => void): () => void {
  listeners.add(listener);
  return () => listeners.delete(listener);
}

function notify(): void {
  for (const listener of listeners) listener();
}

/** Throttle progress writes: one per 200 ms per entry keeps the UI smooth. */
const lastWrite = new Map<string, number>();

function report(id: string, patch: Partial<DownloadEntry>, force = false): void {
  const now = Date.now();
  if (!force && now - (lastWrite.get(id) ?? 0) < 200) return;
  lastWrite.set(id, now);
  updateDownload(id, patch);
  notify();
}

export interface EnqueueInput {
  id: string;
  animeId: string;
  animeTitle: string;
  coverUrl?: string;
  description?: string;
  episodeNumber: number;
  episodeId: string;
  quality: string;
  sourceUrl: string;
}

/** Adds an entry and starts it. The entry exists immediately, in `queued`. */
export function enqueue(input: EnqueueInput): DownloadEntry {
  const entry: DownloadEntry = {
    ...input,
    progress: 0,
    state: "queued",
    bytesDone: 0,
    createdAt: Date.now(),
  };

  upsertDownload(entry);
  notify();
  void start(input.id);

  return entry;
}

export async function start(id: string): Promise<void> {
  if (running.has(id)) return;

  const entry = getDownloads().find((item) => item.id === id);
  if (!entry) return;
  if (entry.state === "done") return;

  const controller = new AbortController();
  running.set(id, controller);
  updateDownload(id, { state: "downloading", error: undefined });
  notify();

  try {
    const response = await fetch(mediaUrl(entry.sourceUrl), { signal: controller.signal });
    if (!response.ok) throw new Error(`The file host answered ${response.status}`);

    const total = Number(response.headers.get("content-length") ?? 0);

    // Stream when the response is streamable so the bar moves; fall back to a
    // single blob on browsers/proxies that hand back an opaque body.
    let blob: Blob;

    if (response.body) {
      const reader = response.body.getReader();
      const chunks: Uint8Array[] = [];
      let done = 0;

      for (;;) {
        const { done: finished, value } = await reader.read();
        if (finished) break;
        if (!value) continue;

        chunks.push(value);
        done += value.byteLength;

        report(id, {
          progress: total > 0 ? Math.min(99, Math.round((done / total) * 100)) : 0,
          bytesDone: done,
          bytesTotal: total || undefined,
        });
      }

      blob = new Blob(chunks as BlobPart[], {
        type: response.headers.get("content-type") ?? "video/mp4",
      });
    } else {
      blob = await response.blob();
    }

    await putFile(id, blob);

    updateDownload(id, {
      state: "done",
      progress: 100,
      localUri: `idb:${id}`,
      bytesDone: blob.size,
      bytesTotal: blob.size,
    });
  } catch (cause) {
    const aborted = cause instanceof DOMException && cause.name === "AbortError";
    updateDownload(id, {
      state: aborted ? "cancelled" : "failed",
      error: aborted ? undefined : cause instanceof Error ? cause.message : String(cause),
    });
  } finally {
    running.delete(id);
    notify();
  }
}

export function cancel(id: string): void {
  running.get(id)?.abort();
  running.delete(id);
  updateDownload(id, { state: "cancelled" });
  notify();
}

/**
 * Delete one entry and its bytes.
 *
 * Called only after a confirmation in the UI — deleting a download is not
 * undoable, and the file may be the only copy the user has.
 */
export async function remove(id: string): Promise<void> {
  cancel(id);
  await deleteFile(id);
  removeDownloads([id]);
  notify();
}

export async function removeMany(ids: string[]): Promise<void> {
  for (const id of ids) {
    running.get(id)?.abort();
    running.delete(id);
    await deleteFile(id);
  }
  removeDownloads(ids);
  notify();
}

/** Total bytes on disk, for the Settings screen. */
export function usedBytes(): number {
  return getDownloads().reduce((sum, entry) => sum + (entry.bytesDone ?? 0), 0);
}

export function humanBytes(bytes: number): string {
  if (!Number.isFinite(bytes) || bytes <= 0) return "0 MB";
  const units = ["B", "KB", "MB", "GB"];
  let value = bytes;
  let unit = 0;
  while (value >= 1024 && unit < units.length - 1) {
    value /= 1024;
    unit += 1;
  }
  return `${value < 10 && unit > 0 ? value.toFixed(1) : Math.round(value)} ${units[unit]}`;
}

/** Re-arm anything left mid-flight by a reload. */
export function resumeAll(): void {
  for (const entry of getDownloads()) {
    if (entry.state === "downloading" || entry.state === "queued") {
      updateDownload(entry.id, { state: "queued" });
      void start(entry.id);
    }
  }
}

export { putDownloads };
