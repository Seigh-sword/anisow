import type { AnimeCard, HomeRails } from "@anispots/core";
import { api, unwrap } from "./api";
import { cached } from "./cache";
import { getContinueWatching, getDownloads } from "./library";

/**
 * The request layer for screens.
 *
 * Every function here is "give me this screen's data", not "make this HTTP
 * call": it composes the endpoints the screen needs, caches the expensive ones,
 * and returns plain data or throws. Screens then have no knowledge of the site's
 * routes, which is what keeps a route change to a one-file edit.
 */

/* ------------------------------------------------------------------- home */

export const loadHome = async (): Promise<HomeRails> =>
  unwrap(await cached("home", () => api.home()));

/**
 * The user's own shelves, shown above the site's rails.
 *
 * This is the difference between a browser and an app: what you were watching
 * and what you already own come first, before anything fetched.
 */
export function localRails(progressFor: (animeId: string) => number | undefined) {
  const rails: { name: string; items: AnimeCard[] }[] = [];

  const watching = getContinueWatching().filter((entry) => entry.coverUrl);
  if (watching.length > 0) {
    rails.push({
      name: "Continue watching",
      items: watching.map((entry) => ({
        id: entry.animeId,
        title: entry.animeTitle ?? `Episode ${entry.episodeNumber}`,
        poster: entry.coverUrl ?? "",
        badge: `EP ${entry.episodeNumber}`,
        progress: progressFor(entry.animeId),
      })),
    });
  }

  const offline = getDownloads().filter((entry) => entry.state === "done");
  if (offline.length > 0) {
    const seen = new Set<string>();
    const items: AnimeCard[] = [];
    for (const entry of offline) {
      if (seen.has(entry.animeId)) continue;
      seen.add(entry.animeId);
      items.push({
        id: entry.animeId,
        title: entry.animeTitle,
        poster: entry.localCoverUri ?? entry.coverUrl ?? "",
        badge: "Offline",
      });
    }
    rails.push({ name: "Ready offline", items });
  }

  return rails;
}

/* ----------------------------------------------------------------- detail */

export const loadDetails = async (animeId: string) =>
  unwrap(await cached(`details:${animeId}`, () => api.details(animeId)));

export const loadEpisodes = async (animeId: string) =>
  unwrap(await cached(`episodes:${animeId}`, () => api.episodes(animeId)));

/**
 * Servers for one episode.
 *
 * Not cached: the site rotates embeds and a stale URL is a broken player. It is
 * one small request, and the player already owns its own loading state.
 */
export const loadServers = async (episodeId: string) =>
  unwrap(await api.servers(episodeId));

/**
 * Download links for one episode.
 *
 * The site gates this behind an account setting, so `{status:false}` is a normal
 * answer rather than a failure — the sheet explains it instead of looking broken.
 */
export async function loadDownloadLinks(episodeId: string) {
  const result = await api.downloads(episodeId);
  return result.ok
    ? { links: result.data, error: null as string | null }
    : { links: [], error: result.error };
}

/* ----------------------------------------------------------------- search */

export const search = async (query: string) => unwrap(await api.search(query));

export const suggest = async (query: string) => unwrap(await api.suggest(query));

/* ----------------------------------------------------------------- browse */

export const loadGenres = async () => unwrap(await cached("genres", () => api.genres()));

export const loadBrowse = async (category: string, page = 1) =>
  unwrap(await cached(`browse:${category}:${page}`, () => api.browse(category, page)));
