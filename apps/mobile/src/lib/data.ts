import type { AnimeCard, HomeRails } from "@anispots/core";
import { api, unwrap } from "./api";
import { getContinueWatching, getDownloads } from "./storage";

/**
 * The request layer, native.
 *
 * Identical responsibilities to the web's: compose the routes a screen needs and
 * return data or throw. No cache module here — a native app reinstalls its JS on
 * every launch, so in-memory caching across sessions was never a thing, and the
 * screens that benefit from it (Home, Browse) already keep their own.
 */

export const loadHome = async (): Promise<HomeRails> => unwrap(await api.home());

export const loadDetails = async (animeId: string) => unwrap(await api.details(animeId));

export const loadEpisodes = async (animeId: string) => unwrap(await api.episodes(animeId));

export const loadServers = async (episodeId: string) => unwrap(await api.servers(episodeId));

export const loadGenres = async () => unwrap(await api.genres());

export const loadBrowse = async (category: string, page = 1) =>
  unwrap(await api.browse(category, page));

export const search = async (query: string) => unwrap(await api.search(query));

export async function loadDownloadLinks(episodeId: string) {
  const result = await api.downloads(episodeId);
  return result.ok
    ? { links: result.data, error: null as string | null }
    : { links: [], error: result.error };
}

/** The user's own shelves, built from storage: playable with no signal. */
export async function localRails(): Promise<{ name: string; items: AnimeCard[] }[]> {
  const rails: { name: string; items: AnimeCard[] }[] = [];

  const watching = (await getContinueWatching()).filter((entry) => entry.coverUrl);
  if (watching.length > 0) {
    rails.push({
      name: "Continue watching",
      items: watching.map((entry) => ({
        id: entry.animeId,
        title: entry.animeTitle ?? `Episode ${entry.episodeNumber}`,
        poster: entry.coverUrl ?? "",
        badge: `EP ${entry.episodeNumber}`,
      })),
    });
  }

  const offline = (await getDownloads()).filter((entry) => entry.state === "done");
  if (offline.length > 0) {
    const seen = new Set<string>();
    const items: AnimeCard[] = [];
    for (const entry of offline) {
      if (seen.has(entry.animeId)) continue;
      seen.add(entry.animeId);
      items.push({
        id: entry.animeId,
        title: entry.animeTitle,
        poster: entry.coverUrl ?? "",
        badge: "Offline",
      });
    }
    rails.push({ name: "Ready offline", items });
  }

  return rails;
}
