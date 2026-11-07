/**
 * The shapes the app works with.
 *
 * These are deliberately *not* the site's shapes. aniwatchtv.ws answers with
 * server-rendered HTML fragments (`{status, html}`) for its episode endpoints, so
 * the model here is what the parsers produce after reading those fragments. A
 * route change is then a parser change, not a rewrite of every screen.
 */

export type AudioType = "sub" | "hsub" | "dub" | "adub" | "raw";

/** One card in a rail, or a search hit. */
export interface AnimeCard {
  /** Slug with the numeric suffix, e.g. `primal-9050`. */
  id: string;
  /** Display title, already cleaned of the site's whitespace. */
  title: string;
  /** Japanese title when the markup carries one. */
  altTitle?: string;
  poster: string;
  /** `TV`, `MOVIE`, `ONA`, `OVA`, `SPECIAL`. */
  format?: string;
  duration?: string;
  /** Episode count when the card states one; `0` means unknown. */
  episodes?: number;
  /** Sub/dub availability when present. */
  sub?: number;
  dub?: number;
  /** Short synopsis; the hero and the detail screen use it. */
  description?: string;
  /** Age rating-ish badge, e.g. `PG-13`. */
  badge?: string;
}

/** The large slide at the top of Home. */
export interface Spotlight extends AnimeCard {
  /** `#1 Spotlight` and similar, as the site labels it. */
  label?: string;
  quality?: string;
  release?: string;
}

export interface HomeRails {
  spotlight: Spotlight[];
  /** Ordered rails: Trending, Most Popular, Latest, … */
  rails: Rail[];
}

export interface Rail {
  name: string;
  items: AnimeCard[];
  /** Rails that page with `?page=`; most do not. */
  viewAllHref?: string;
}

export interface AnimeDetails extends AnimeCard {
  japanese?: string;
  status?: string;
  premiered?: string;
  score?: string;
  genres: string[];
  studios: string[];
  /** Parent story / side story groupings the site shows. */
  related: AnimeCard[];
  recommendations: AnimeCard[];
  totalEpisodes: number;
  /** AniList / MAL IDs when known, used to build ZokoAnime stream/download URLs. */
  anilistId?: string;
  malId?: string;
}

/**
 * Multi-criteria filter parameters matching the `/filter` system on AniWatch.
 */
export interface FilterParams {
  keyword?: string;
  type?: string;
  status?: string;
  rating?: string;
  score?: string;
  season?: string;
  language?: string;
  sort?: string;
  startYear?: string;
  startMonth?: string;
  startDay?: string;
  endYear?: string;
  endMonth?: string;
  endDay?: string;
  genres?: string[];
  page?: number;
}

/**
 * An episode as the watch page lists it.
 *
 * `id` is the value that goes into `?ep=`, and it is what the servers endpoint
 * wants: it is not the episode number.
 */
export interface Episode {
  id: string;
  number: number;
  title?: string;
  /** True for the episode the page opened on, when known. */
  isFiller?: boolean;
  /** Direct MegaPlay / Anikoto embed URLs when sourced from Anikoto API. */
  embedUrls?: {
    sub?: string;
    dub?: string;
  };
}

/** A player the episode can run in. */
export interface Server {
  name: string;
  audio: AudioType;
  /**
   * The embed URL, obtained by base64-decoding the site's `data-hash`,
   * from Anikoto (`megaplay.buzz`), or from ZokoAnime (`zokoanime.video`).
   */
  embedUrl: string;
  /** Which provider family backs this server (`zoko` | `anikoto` | `megaplay`). */
  provider?: "zoko" | "anikoto" | "megaplay";
}

/** A downloadable file for one episode. */
export interface DownloadLink {
  /** `360p`, `720p`, `1080p`, or a group label when unlabelled. */
  quality: string;
  url: string;
  /** `Kiwi Sub` and similar; the group the site files this under. */
  group?: string;
}

export interface WatchProgress {
  animeId: string;
  episodeNumber: number;
  episodeId: string;
  /** Seconds. */
  position: number;
  /** Seconds; 0 when the player never reported it. */
  duration: number;
  updatedAt: number;
  /**
   * Carried so the "Continue watching" shelf can render from storage alone.
   * Without these the shelf has to re-fetch every anime's detail page just to
   * draw a poster, which is exactly what the user does not want on a cold start.
   */
  animeTitle?: string;
  coverUrl?: string;
  /** `position / duration`, clamped; `undefined` when the length is unknown. */
  fraction?: number;
}

/**
 * A download the user asked for. Persisted, so the library survives a restart
 * and works with the network off.
 */
export interface DownloadEntry {
  id: string;
  animeId: string;
  animeTitle: string;
  /** Saved so the library can be browsed offline, cover included. */
  coverUrl?: string;
  localCoverUri?: string;
  description?: string;
  episodeNumber: number;
  episodeId: string;
  quality: string;
  sourceUrl: string;
  /** Local file once it has landed. */
  localUri?: string;
  /** 0–100. */
  progress: number;
  state: "queued" | "downloading" | "done" | "failed" | "cancelled";
  bytesTotal?: number;
  bytesDone?: number;
  error?: string;
  createdAt: number;
}
