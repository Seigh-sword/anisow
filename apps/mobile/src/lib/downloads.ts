import * as FileSystem from "expo-file-system";

import type { DownloadEntry } from "@anispots/core";
import {
  deleteFile,
  downloadId,
  ensureDir,
  fileExists,
  filePathFor,
  getDownloads,
  removeDownloads,
  updateDownload,
  upsertDownload,
} from "./storage";

/**
 * The native download queue.
 *
 * `expo-file-system` does the transfer, which is the whole reason the native app
 * downloads better than the browser: it writes straight to disk with the app's
 * own permissions, so there is no CORS wall, no proxy, and no 30 MB blob sitting
 * in memory. The queue's job is bookkeeping and progress.
 *
 * Progress in file-system is delivered through a callback handle, so each entry
 * keeps its handle and `cancel` calls `stopAsync` — which is a real stop, not an
 * aborted flag the transfer ignores.
 */

const resumables = new Map<string, FileSystem.DownloadResumable>();
const listeners = new Set<() => void>();

export function subscribe(listener: () => void): () => void {
  listeners.add(listener);
  return () => {
    listeners.delete(listener);
  };
}

function notify(): void {
  for (const listener of listeners) listener();
}

const lastWrite = new Map<string, number>();

async function report(id: string, patch: Partial<DownloadEntry>, force = false): Promise<void> {
  const now = Date.now();
  if (!force && now - (lastWrite.get(id) ?? 0) < 250) return;
  lastWrite.set(id, now);
  await updateDownload(id, patch);
  notify();
}

export interface EnqueueInput {
  animeId: string;
  animeTitle: string;
  coverUrl?: string;
  description?: string;
  episodeNumber: number;
  episodeId: string;
  quality: string;
  sourceUrl: string;
}

export async function enqueue(input: EnqueueInput): Promise<DownloadEntry> {
  const entry: DownloadEntry = {
    ...input,
    id: downloadId(input.animeId, input.episodeId, input.quality),
    progress: 0,
    state: "queued",
    bytesDone: 0,
    createdAt: Date.now(),
  };

  await upsertDownload(entry);
  notify();
  void start(entry.id);
  return entry;
}

export async function start(id: string): Promise<void> {
  if (resumables.has(id)) return;

  const entry = (await getDownloads()).find((item) => item.id === id);
  if (!entry || entry.state === "done") return;

  await ensureDir();
  const target = filePathFor(id);

  // A previous partial file must go: `downloadAsync` appends nothing, but a
  // stale file would still be played if the transfer then failed.
  await deleteFile(target);
  await updateDownload(id, { state: "downloading", error: undefined, progress: 0 });
  notify();

  const resumable = FileSystem.createDownloadResumable(
    entry.sourceUrl,
    target,
    {
      // Some file hosts 403 a bare request; the catalogue's own referer is what
      // a browser would send.
      headers: { Referer: "https://aniwatchtv.ws/", "User-Agent": "AniSpots/0.1 (mobile)" },
    },
    (progress) => {
      const total = progress.totalBytesExpectedToWrite || 0;
      const done = progress.totalBytesWritten || 0;
      void report(id, {
        progress: total > 0 ? Math.min(99, Math.round((done / total) * 100)) : 0,
        bytesDone: done,
        bytesTotal: total || undefined,
      });
    },
  );

  resumables.set(id, resumable);

  try {
    const result = await resumable.downloadAsync();
    if (!result?.uri) throw new Error("The file host returned nothing");

    const info = await FileSystem.getInfoAsync(result.uri);
    const size = info.exists && "size" in info ? info.size : undefined;

    await updateDownload(id, {
      state: "done",
      progress: 100,
      localUri: result.uri,
      bytesDone: size,
      bytesTotal: size,
    });
  } catch (cause) {
    await updateDownload(id, {
      state: "failed",
      error: cause instanceof Error ? cause.message : String(cause),
    });
  } finally {
    resumables.delete(id);
    notify();
  }
}

export async function cancel(id: string): Promise<void> {
  const resumable = resumables.get(id);
  if (resumable) {
    try {
      await resumable.pauseAsync();
    } catch {
      // Already finished: nothing to pause.
    }
    resumables.delete(id);
  }

  await updateDownload(id, { state: "cancelled" });
  notify();
}

export async function remove(id: string): Promise<void> {
  await cancel(id);
  const entry = (await getDownloads()).find((item) => item.id === id);
  await deleteFile(entry?.localUri);
  await removeDownloads([id]);
  notify();
}

export async function removeMany(ids: string[]): Promise<void> {
  const entries = await getDownloads();
  for (const id of ids) {
    await cancel(id);
    await deleteFile(entries.find((item) => item.id === id)?.localUri);
  }
  await removeDownloads(ids);
  notify();
}

export async function resumeAll(): Promise<void> {
  for (const entry of await getDownloads()) {
    if (entry.state === "downloading" || entry.state === "queued") {
      await updateDownload(entry.id, { state: "queued" });
      void start(entry.id);
    }
  }
}

/** Drop entries whose file has vanished (an OS cache purge, a restore). */
export async function reconcile(): Promise<void> {
  const entries = await getDownloads();
  const missing: string[] = [];

  for (const entry of entries) {
    if (entry.state !== "done" || !entry.localUri) continue;
    if (!(await fileExists(entry.localUri))) missing.push(entry.id);
  }

  for (const id of missing) {
    await updateDownload(id, { state: "failed", error: "The file is no longer on the device" });
  }

  if (missing.length > 0) notify();
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
