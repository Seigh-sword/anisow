import AsyncStorage from "@react-native-async-storage/async-storage";
import * as FileSystem from "expo-file-system";

import type { DownloadEntry, WatchProgress } from "@anispots/core";

/**
 * The native store.
 *
 * Same API surface as the web's `library.ts`, different backing: metadata goes
 * into `AsyncStorage` (which is async here, unlike `localStorage`) and files go
 * into the app's document directory, which is what makes a download survive a
 * restart and play with the radio off.
 *
 * The library is cached in memory after the first read because the web version's
 * synchronous reads are what the screens assume; an async store behind the same
 * signatures keeps the screens identical across platforms.
 */

const WATCHLIST_KEY = "anispots.watchlist";
const PROGRESS_KEY = "anispots.progress";
const DOWNLOADS_KEY = "anispots.downloads";

export interface WatchlistItem {
  id: string;
  title: string;
  poster: string;
  addedAt: number;
}

const memory = new Map<string, unknown>();

async function read<T>(key: string, fallback: T): Promise<T> {
  if (memory.has(key)) return memory.get(key) as T;
  try {
    const raw = await AsyncStorage.getItem(key);
    const value = raw ? (JSON.parse(raw) as T) : fallback;
    memory.set(key, value);
    return value;
  } catch {
    return fallback;
  }
}

async function write(key: string, value: unknown): Promise<void> {
  memory.set(key, value);
  try {
    await AsyncStorage.setItem(key, JSON.stringify(value));
  } catch {
    // Storage full or unavailable: the app keeps working for this session.
  }
}

/* -------------------------------------------------------------- watchlist */

export const getWatchlist = (): Promise<WatchlistItem[]> => read(WATCHLIST_KEY, []);

export async function toggleWatchlist(item: Omit<WatchlistItem, "addedAt">): Promise<boolean> {
  const current = await getWatchlist();
  const exists = current.some((entry) => entry.id === item.id);
  const next = exists
    ? current.filter((entry) => entry.id !== item.id)
    : [{ ...item, addedAt: Date.now() }, ...current];
  await write(WATCHLIST_KEY, next);
  return !exists;
}

/* --------------------------------------------------------------- progress */

export const getAllProgress = (): Promise<Record<string, WatchProgress>> => read(PROGRESS_KEY, {});

export async function getProgress(animeId: string): Promise<WatchProgress | null> {
  const all = await getAllProgress();
  return all[animeId] ?? null;
}

export async function saveProgress(progress: WatchProgress): Promise<void> {
  const all = await getAllProgress();
  all[progress.animeId] = progress;
  await write(PROGRESS_KEY, all);
}

export async function getContinueWatching(): Promise<WatchProgress[]> {
  const all = await getAllProgress();
  return Object.values(all)
    .filter((entry) => entry.position > 30)
    .sort((a, b) => b.updatedAt - a.updatedAt);
}

/* -------------------------------------------------------------- downloads */

export const getDownloads = (): Promise<DownloadEntry[]> => read(DOWNLOADS_KEY, []);

export async function putDownloads(entries: DownloadEntry[]): Promise<void> {
  await write(DOWNLOADS_KEY, entries);
}

export async function upsertDownload(entry: DownloadEntry): Promise<void> {
  const all = await getDownloads();
  const index = all.findIndex((item) => item.id === entry.id);
  if (index === -1) all.unshift(entry);
  else all[index] = entry;
  await putDownloads(all);
}

export async function updateDownload(id: string, patch: Partial<DownloadEntry>): Promise<void> {
  const all = await getDownloads();
  const index = all.findIndex((item) => item.id === id);
  if (index === -1) return;
  all[index] = { ...all[index]!, ...patch };
  await putDownloads(all);
}

export async function removeDownloads(ids: string[]): Promise<void> {
  const drop = new Set(ids);
  await putDownloads((await getDownloads()).filter((item) => !drop.has(item.id)));
}

export const downloadId = (animeId: string, episodeId: string, quality: string): string =>
  `${animeId}:${episodeId}:${quality}`;

/* ------------------------------------------------------------------ files */

const DIR = `${FileSystem.documentDirectory}anispots/`;

export async function ensureDir(): Promise<void> {
  const info = await FileSystem.getInfoAsync(DIR);
  if (!info.exists) await FileSystem.makeDirectoryAsync(DIR, { intermediates: true });
}

/** Where an episode's file lives. Extension is `.mp4`; the embed serves mp4. */
export const filePathFor = (id: string): string => `${DIR}${id.replace(/[^a-zA-Z0-9._-]/g, "_")}.mp4`;

export async function fileExists(uri: string): Promise<boolean> {
  const info = await FileSystem.getInfoAsync(uri);
  return info.exists;
}

export async function deleteFile(uri?: string): Promise<void> {
  if (!uri) return;
  try {
    await FileSystem.deleteAsync(uri, { idempotent: true });
  } catch {
    // Already gone is the goal state.
  }
}

export async function totalBytes(): Promise<number> {
  const entries = await getDownloads();
  let sum = 0;
  for (const entry of entries) sum += entry.bytesDone ?? 0;
  return sum;
}
