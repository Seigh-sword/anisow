/**
 * Watchlist, watch progress and downloads — the state that has to survive a
 * reload and work with the network off.
 *
 * `localStorage` is the store: it is synchronous (so the first paint already has
 * the data, no flash of empty), survives restarts, and needs no dependency. The
 * native app swaps this module for one backed by `expo-file-system`; the shape of
 * the API is what the screens depend on, not the storage.
 */

import type { DownloadEntry, WatchProgress } from "@anispots/core";

const WATCHLIST_KEY = "anispots.watchlist";
const PROGRESS_KEY = "anispots.progress";
const DOWNLOADS_KEY = "anispots.downloads";

function read<T>(key: string, fallback: T): T {
  try {
    const raw = localStorage.getItem(key);
    return raw ? (JSON.parse(raw) as T) : fallback;
  } catch {
    return fallback;
  }
}

function write(key: string, value: unknown): void {
  try {
    localStorage.setItem(key, JSON.stringify(value));
  } catch {
    // Quota or private mode: the app keeps working, it just forgets.
  }
}

/* --------------------------------------------------------------- watchlist */

export interface WatchlistItem {
  id: string;
  title: string;
  poster: string;
  addedAt: number;
}

export function getWatchlist(): WatchlistItem[] {
  return read<WatchlistItem[]>(WATCHLIST_KEY, []).sort((a, b) => b.addedAt - a.addedAt);
}

export function isInWatchlist(id: string): boolean {
  return getWatchlist().some((item) => item.id === id);
}

export function toggleWatchlist(item: Omit<WatchlistItem, "addedAt">): boolean {
  const current = getWatchlist();
  const exists = current.some((entry) => entry.id === item.id);
  const next = exists
    ? current.filter((entry) => entry.id !== item.id)
    : [{ ...item, addedAt: Date.now() }, ...current];

  write(WATCHLIST_KEY, next);
  return !exists;
}

/* ---------------------------------------------------------------- progress */

export function getProgress(animeId: string): WatchProgress | null {
  const all = read<Record<string, WatchProgress>>(PROGRESS_KEY, {});
  return all[animeId] ?? null;
}

export function saveProgress(progress: WatchProgress): void {
  const all = read<Record<string, WatchProgress>>(PROGRESS_KEY, {});
  all[progress.animeId] = progress;
  write(PROGRESS_KEY, all);
}

/** Everything in flight, newest first: the "Continue watching" rail reads this. */
export function getContinueWatching(): WatchProgress[] {
  const all = read<Record<string, WatchProgress>>(PROGRESS_KEY, {});
  return Object.values(all)
    .filter((entry) => entry.position > 30)
    .sort((a, b) => b.updatedAt - a.updatedAt);
}

export function clearProgress(animeId: string): void {
  const all = read<Record<string, WatchProgress>>(PROGRESS_KEY, {});
  delete all[animeId];
  write(PROGRESS_KEY, all);
}

/* --------------------------------------------------------------- downloads */

export function getDownloads(): DownloadEntry[] {
  return read<DownloadEntry[]>(DOWNLOADS_KEY, []).sort((a, b) => b.createdAt - a.createdAt);
}

export function putDownloads(entries: DownloadEntry[]): void {
  write(DOWNLOADS_KEY, entries);
}

export function upsertDownload(entry: DownloadEntry): void {
  const all = getDownloads();
  const index = all.findIndex((item) => item.id === entry.id);
  if (index === -1) all.unshift(entry);
  else all[index] = entry;
  putDownloads(all);
}

export function updateDownload(id: string, patch: Partial<DownloadEntry>): void {
  const all = getDownloads();
  const index = all.findIndex((item) => item.id === id);
  if (index === -1) return;
  all[index] = { ...all[index]!, ...patch };
  putDownloads(all);
}

export function removeDownloads(ids: string[]): void {
  const drop = new Set(ids);
  putDownloads(getDownloads().filter((item) => !drop.has(item.id)));
}

/** One anime's downloads, grouped for the library screen. */
export function groupDownloads(entries: DownloadEntry[]): {
  animeId: string;
  animeTitle: string;
  coverUrl?: string;
  localCoverUri?: string;
  description?: string;
  episodes: DownloadEntry[];
}[] {
  const groups = new Map<string, ReturnType<typeof groupDownloads>[number]>();

  for (const entry of entries) {
    const existing = groups.get(entry.animeId);
    if (existing) {
      existing.episodes.push(entry);
      continue;
    }
    groups.set(entry.animeId, {
      animeId: entry.animeId,
      animeTitle: entry.animeTitle,
      coverUrl: entry.coverUrl,
      localCoverUri: entry.localCoverUri,
      description: entry.description,
      episodes: [entry],
    });
  }

  for (const group of groups.values()) {
    group.episodes.sort((a, b) => a.episodeNumber - b.episodeNumber);
  }

  return [...groups.values()];
}

export const downloadId = (animeId: string, episodeId: string, quality: string): string =>
  `${animeId}:${episodeId}:${quality}`;
