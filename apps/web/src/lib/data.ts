import type { AnimeCard, HomeRails } from "@anispots/core";
import { api, unwrap } from "./api";
import { cached } from "./cache";
import { getContinueWatching, getDownloads } from "./library";
import {
  DEMO,
  demoBrowse,
  demoDetails,
  demoDownloadLinks,
  demoEpisodes,
  demoGenres,
  demoHome,
  demoSearch,
  demoServers,
  markDemo,
} from "./demo";

/**
 * The request layer for screens.
 *
 * Every function here is "give me this screen's data", not "make this HTTP
 * call": it composes the endpoints the screen needs, caches the expensive ones,
 * and returns plain data or throws. Screens then have no knowledge of the site's
 * routes, which is what keeps a route change to a one-file edit.
 *
 * `DEMO` is a build flag, never a fallback: with it off (the default) a failed
 * request throws and the screen shows its retry card.
 */

/** Wrap a loader so the preview build can answer without a network. */
async function attempt<T>(load: () => Promise<T>, fallback: () => T): Promise<T> {
  if (!DEMO) return load();
  try {
    return await load();
  } catch {
    markDemo();
    return fallback();
  }
}

/* ------------------------------------------------------------------- home */

export const loadHome = async (): Promise<HomeRails> =>
  cached("home", () => attempt(() => api.home().then(unwrap), demoHome));

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
  cached(`details:${animeId}`, () =>
    attempt(() => api.details(animeId).then(unwrap), () => demoDetails(animeId)),
  );

export const loadEpisodes = async (animeId: string) =>
  cached(`episodes:${animeId}`, () =>
    attempt(() => api.episodes(animeId).then(unwrap), () => demoEpisodes(animeId)),
  );

/**
 * Servers for one episode.
 *
 * Not cached: the site rotates embeds and a stale URL is a broken player. It is
 * one small request, and the player already owns its own loading state.
 */
export const loadServers = async (episodeId: string) =>
  attempt(() => api.servers(episodeId).then(unwrap), demoServers);

/**
 * Download links for one episode.
 *
 * The site gates this behind an account setting, so `{status:false}` is a normal
 * answer rather than a failure — the sheet explains it instead of looking broken.
 */
export async function loadDownloadLinks(episodeId: string) {
  const result = await attempt(
    () => api.downloads(episodeId),
    () => ({ ok: true as const, data: demoDownloadLinks() }),
  );

  return result.ok
    ? { links: result.data, error: null as string | null }
    : { links: [], error: result.error };
}

/* ----------------------------------------------------------------- search */

export const search = async (query: string) =>
  attempt(() => api.search(query).then(unwrap), () => demoSearch(query));

export const suggest = async (query: string) =>
  attempt(
    () => api.suggest(query).then(unwrap),
    () => demoSearch(query).slice(0, 8),
  );

/* ----------------------------------------------------------------- browse */

export const loadGenres = async () =>
  cached("genres", () => attempt(() => api.genres().then(unwrap), demoGenres));

export const loadBrowse = async (category: string, page = 1) =>
  cached(`browse:${category}:${page}`, () =>
    attempt(() => api.browse(category, page).then(unwrap), demoBrowse),
  );
