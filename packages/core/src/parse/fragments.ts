/**
 * Parsers for the three HTML fragments the API serves.
 *
 * All three arrive as `{status, html}` and none of them is a JSON model, so these
 * functions are where the site's markup becomes the app's model. Each has a test
 * built from real captured output, which is the only reason a parser like this is
 * safe to write by hand.
 */

import type { AudioType, DownloadLink, Episode, Server } from "../model.ts";
import { decodeEntities, findByClass, firstByClass, firstHref, text } from "./html.ts";

/** `{"status":true,"html":"…"}` — the envelope every episode route uses. */
export interface FragmentResponse {
  status: boolean;
  html: string;
  totalItems?: number;
}

export function readFragment(payload: unknown): FragmentResponse {
  const body = payload as Partial<FragmentResponse> | null;
  return {
    status: Boolean(body?.status),
    html: typeof body?.html === "string" ? body.html : "",
    totalItems: typeof body?.totalItems === "number" ? body.totalItems : undefined,
  };
}

/**
 * `episode/servers` → the playable embed URLs.
 *
 * The markup is:
 *
 * ```html
 * <div class="server-item" data-type="sub" data-hash="aHR0cHM6Ly8…" data-server-name="ZokoAnime">
 *   <a …>ZokoAnime</a>
 * </div>
 * ```
 *
 * `data-hash` is base64 over the embed URL; the site's own JS calls
 * `loadPlayer(atob(hash), …)`. Decoding it is the whole trick, and it is why no
 * published scraper works here — they look for a JSON `sources` array instead.
 */
export function parseServers(fragment: FragmentResponse): Server[] {
  const servers: Server[] = [];

  for (const item of findByClass(fragment.html, "server-item")) {
    const hash = item.attrs["data-hash"] ?? firstByClass(item.inner, "btn")?.attrs["data-hash"];
    if (!hash) continue;

    const embedUrl = decodeEmbedHash(hash);
    if (!embedUrl) continue;

    const audio = normaliseAudio(item.attrs["data-type"]);
    const label = item.attrs["data-server-name"] || text(item.inner) || audio;

    servers.push({ name: label, audio, embedUrl });
  }

  return servers;
}

/** Base64 → UTF-8, in one place so both runtimes agree. */
export function decodeEmbedHash(hash: string): string | null {
  const decoded = base64Decode(hash.trim());
  if (!decoded) return null;
  // Only http(s) embeds are players; anything else is markup drift.
  return /^https?:\/\//i.test(decoded) ? decoded : null;
}

function base64Decode(input: string): string | null {
  const normalised = input.replace(/-/g, "+").replace(/_/g, "/").replace(/\s/g, "");
  const padded = normalised + "=".repeat((4 - (normalised.length % 4)) % 4);

  try {
    if (typeof atob === "function") {
      // atob yields latin1; recover UTF-8 from it.
      const binary = atob(padded);
      const bytes = new Uint8Array(binary.length);
      for (let i = 0; i < binary.length; i += 1) bytes[i] = binary.charCodeAt(i);
      return new TextDecoder().decode(bytes);
    }
    // Node (tests, the probe).
    return Buffer.from(padded, "base64").toString("utf8");
  } catch {
    return null;
  }
}

function normaliseAudio(value: string | undefined): AudioType {
  switch ((value ?? "").toLowerCase()) {
    case "dub":
      return "dub";
    case "adub":
      return "adub";
    case "hsub":
      return "hsub";
    case "raw":
      return "raw";
    default:
      return "sub";
  }
}

/**
 * `episode/list/{animeId}` → the episode list.
 *
 * Each episode is `<div class="ep-item" data-id="…" data-number="…">`; the id is
 * the one the servers endpoint expects. `totalItems` is the count the site
 * paginates by, so it is preferred over counting when present.
 */
export function parseEpisodes(fragment: FragmentResponse): Episode[] {
  const episodes: Episode[] = [];
  const seen = new Set<string>();

  for (const item of findByClass(fragment.html, "ep-item")) {
    const id = item.attrs["data-id"];
    const number = Number(item.attrs["data-number"] ?? NaN);
    if (!id || seen.has(id)) continue;

    seen.add(id);
    // The template renders the number and the name in sibling divs, so the text
    // comes out as "1 Episode 1". Drop the leading number, and treat a bare
    // "Episode N" as no title at all rather than showing it twice.
    const label = text(item.inner).replace(/^\d+\s*/, "").trim();
    const isPlaceholder = /^episode\s*\d*$/i.test(label) || label === "";
    episodes.push({
      id,
      number: Number.isFinite(number) ? number : episodes.length + 1,
      title: isPlaceholder ? undefined : label,
      isFiller: item.attrs["data-filler"] === "1",
    });
  }

  // Older markup only carries anchors with ?ep=; fall back to those so a template
  // change degrades to "no titles" rather than "no episodes".
  if (episodes.length === 0) {
    const re = /<a\b[^>]*\bhref\s*=\s*"([^"]*[?&]ep=(\d+)[^"]*)"/gi;
    let m: RegExpExecArray | null;
    while ((m = re.exec(fragment.html)) !== null) {
      const id = m[2] ?? "";
      if (!id || seen.has(id)) continue;
      seen.add(id);
      episodes.push({ id, number: episodes.length + 1 });
    }
  }

  return episodes.sort((a, b) => a.number - b.number);
}

/**
 * `episode/downloads` → real files, grouped by release and quality.
 *
 * The site renders `Kiwi Sub → 360p / 720p / 1080p` as chips over a panel. The
 * links are ordinary files, which is why downloading works here while streaming
 * does not (the stream is inside a third-party player).
 */
export function parseDownloads(fragment: FragmentResponse): DownloadLink[] {
  const links: DownloadLink[] = [];
  const seen = new Set<string>();

  const groups = findByClass(fragment.html, "dl-grp");

  const push = (anchorHtml: string, group?: string) => {
    const url = firstHref(anchorHtml);
    if (!url || !/^https?:\/\//i.test(url) || seen.has(url)) return;

    seen.add(url);
    const label = text(anchorHtml);
    links.push({
      quality: guessQuality(label) ?? guessQuality(url) ?? "default",
      url: decodeEntities(url),
      group,
    });
  };

  for (const group of groups) {
    const groupLabel = text(firstByClass(group.inner, "dl-grp-toggle")?.inner ?? "");
    for (const anchor of group.inner.match(/<a\b[^>]*>[\s\S]*?<\/a>/gi) ?? []) {
      push(anchor, groupLabel || undefined);
    }
  }

  // Flat layout: links with no group wrapper.
  if (links.length === 0) {
    for (const anchor of fragment.html.match(/<a\b[^>]*>[\s\S]*?<\/a>/gi) ?? []) {
      push(anchor);
    }
  }

  // Highest quality first: that is the order a person expects to pick from.
  return links.sort((a, b) => qualityRank(b.quality) - qualityRank(a.quality));
}

function guessQuality(label: string): string | null {
  const m = label.match(/\b(360|480|720|1080|1440|2160)\s*p\b/i);
  return m ? `${m[1]}p` : null;
}

function qualityRank(quality: string): number {
  const m = quality.match(/^(\d+)p$/);
  return m ? Number(m[1]) : 0;
}
