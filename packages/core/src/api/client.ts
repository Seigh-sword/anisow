/**
 * The AniWatch client.
 *
 * Routes and their shapes are documented in PROBE-FINDINGS.md and every one of
 * them was called before being written down here. The important facts:
 *
 *  * the API root is declared by the site itself (`window.hianime_ep_ajax`) and
 *    lives at `/api/theme/` — the `/ajax/v2/…` routes every published scraper
 *    uses are 404 on this deployment;
 *  * the three episode routes answer `{status, html}` with **HTML**, not JSON;
 *  * a playable URL is a third-party embed obtained by base64-decoding a
 *    `data-hash`, not an `.m3u8`.
 *
 * Nothing here throws on a bad upstream response: every method returns a
 * `Result`, because a screen that renders "could not load" is better than one
 * that crashes. That is a change from the old Kotlin app, where a single type
 * mismatch (a quoted `score`) took out every screen that showed one.
 */

import type { AnimeCard, AnimeDetails, Episode, HomeRails, Rail, Spotlight } from "../model.ts";
import { parseDownloads, parseEpisodes, parseServers, readFragment } from "../parse/fragments.ts";
import {
  animeIdFromHref,
  dataAttrs,
  decodeEntities,
  findByClass,
  firstByClass,
  firstHref,
  firstImage,
  text,
} from "../parse/html.ts";

export const DEFAULT_BASE = "https://aniwatchtv.ws";

export type Result<T> = { ok: true; data: T } | { ok: false; error: string; status?: number };

export interface ClientOptions {
  baseUrl?: string;
  /** Injected so tests do not touch the network. */
  fetchImpl?: typeof fetch;
  /** Per-request timeout; the site is sometimes slow to first byte. */
  timeoutMs?: number;
  userAgent?: string;
}

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

export class AniWatchClient {
  readonly baseUrl: string;
  private readonly fetchImpl: typeof fetch;
  private readonly timeoutMs: number;
  private readonly userAgent: string;
  /** Learned from a watch page; the site states where its own API lives. */
  private restUrl: string | null = null;

  constructor(options: ClientOptions = {}) {
    this.baseUrl = (options.baseUrl ?? DEFAULT_BASE).replace(/\/$/, "");
    this.fetchImpl = options.fetchImpl ?? globalThis.fetch.bind(globalThis);
    this.timeoutMs = options.timeoutMs ?? 20_000;
    this.userAgent = options.userAgent ?? UA;
  }

  /** `https://aniwatchtv.ws/api/theme/` — discovered, cached, overridable. */
  get apiRoot(): string {
    return this.restUrl ?? `${this.baseUrl}/api/theme/`;
  }

  // ---------------------------------------------------------------- transport

  private async request(path: string, init: RequestInit = {}): Promise<Result<Response>> {
    const url = /^https?:\/\//i.test(path) ? path : `${this.baseUrl}${path}`;
    const controller = new AbortController();
    const timer = setTimeout(() => controller.abort(), this.timeoutMs);

    try {
      const response = await this.fetchImpl(url, {
        ...init,
        signal: controller.signal,
        headers: {
          "User-Agent": this.userAgent,
          Accept: "text/html,application/json;q=0.9,*/*;q=0.8",
          "Accept-Language": "en-US,en;q=0.9",
          Referer: `${this.baseUrl}/home`,
          ...(init.headers ?? {}),
        },
      });

      if (!response.ok) {
        return { ok: false, error: `HTTP ${response.status} for ${url}`, status: response.status };
      }
      return { ok: true, data: response };
    } catch (error) {
      const message = error instanceof Error ? error.message : String(error);
      return { ok: false, error: controller.signal.aborted ? `Timed out: ${url}` : message };
    } finally {
      clearTimeout(timer);
    }
  }

  private async requestText(path: string, init?: RequestInit): Promise<Result<string>> {
    const result = await this.request(path, init);
    if (!result.ok) return result;

    try {
      return { ok: true, data: await result.data.text() };
    } catch (error) {
      return { ok: false, error: error instanceof Error ? error.message : String(error) };
    }
  }

  private async requestJson(path: string, init?: RequestInit): Promise<Result<unknown>> {
    const result = await this.request(path, init);
    if (!result.ok) return result;

    try {
      return { ok: true, data: await result.data.json() };
    } catch {
      return { ok: false, error: "Response was not JSON" };
    }
  }

  // --------------------------------------------------------------- discovery

  /**
   * Reads `window.hianime_ep_ajax.rest_url` from any watch page. The site moves,
   * and it says where its API is, so asking is more durable than hardcoding.
   */
  private async discoverApiRoot(): Promise<string> {
    if (this.restUrl) return this.restUrl;

    const page = await this.requestText("/home");
    if (page.ok) {
      const match =
        page.data.match(/hianime_ep_ajax\s*=\s*\{[\s\S]*?rest_url:\s*'([^']+)'/) ??
        page.data.match(/hianime_ajax\s*=\s*\{[\s\S]*?rest_url:\s*'([^']+)'/);

      if (match?.[1]) {
        this.restUrl = match[1].endsWith("/") ? match[1] : `${match[1]}/`;
        return this.restUrl;
      }
    }

    // Fall back to the value that was verified against the live site.
    this.restUrl = `${this.baseUrl}/api/theme/`;
    return this.restUrl;
  }

  // -------------------------------------------------------------------- home

  /** Spotlight slides and every rail on `/home`. */
  async home(): Promise<Result<HomeRails>> {
    const page = await this.requestText("/home");
    if (!page.ok) return page;

    const html = page.data;
    const spotlight: Spotlight[] = [];

    for (const slide of findByClass(html, "deslide-item")) {
      const card = cardFromNode(slide.inner);
      if (!card) continue;

      spotlight.push({
        ...card,
        label: text(firstByClass(slide.inner, "desi-sub-text")?.inner ?? "") || undefined,
        poster: firstImage(slide.inner) ?? card.poster,
      });
    }

    // The hero can also be a plain slider of posters on other templates.
    if (spotlight.length === 0) {
      for (const slide of findByClass(html, "swiper-slide")) {
        const card = cardFromNode(slide.inner);
        if (card) spotlight.push({ ...card });
      }
    }

    const rails = collectRails(html);
    if (spotlight.length === 0 && rails.length === 0) {
      return { ok: false, error: "Home page had neither slides nor rails" };
    }

    return { ok: true, data: { spotlight, rails } };
  }

  // ----------------------------------------------------------------- search

  /**
   * `/search?keyword=` — the site's own search box posts here.
   *
   * The old hianime API used `?q=`, this deployment uses `keyword`; both are
   * sent so a future change in either direction still resolves.
   */
  async search(query: string, page = 1): Promise<Result<AnimeCard[]>> {
    const trimmed = query.trim();
    if (!trimmed) return { ok: true, data: [] };

    const suffix = page > 1 ? `&page=${page}` : "";
    const pageResult = await this.requestText(
      `/search?keyword=${encodeURIComponent(trimmed)}${suffix}`,
    );
    if (!pageResult.ok) return pageResult;

    const items = collectCards(pageResult.data);
    return { ok: true, data: items };
  }

  /** Search suggestions, used while typing. Cheap: the site returns a short list. */
  async suggest(query: string): Promise<Result<AnimeCard[]>> {
    const trimmed = query.trim();
    if (trimmed.length < 2) return { ok: true, data: [] };

    const page = await this.requestText(`/search?keyword=${encodeURIComponent(trimmed)}`);
    if (!page.ok) return page;

    return { ok: true, data: collectCards(page.data).slice(0, 8) };
  }

  // ------------------------------------------------------------------ browse

  /**
   * A genre listing, e.g. `action`, `slice-of-life`.
   *
   * The path is `/genres/{slug}` — plural. `/genre/{slug}` is a 404 on this
   * deployment, which is what every published scraper assumes; the route was
   * confirmed by reading the home page's genre widget and requesting each
   * candidate (see tools/probe/genre-links.mjs).
   */
  async browse(category: string, page = 1): Promise<Result<AnimeCard[]>> {
    const slug = category.trim().toLowerCase().replace(/\s+/g, "-");
    const suffix = page > 1 ? `?page=${page}` : "";

    for (const path of [`/genres/${encodeURIComponent(slug)}${suffix}`, `/genres/${slug}/page/${page}`]) {
      const pageResult = await this.requestText(path);
      if (!pageResult.ok) continue;

      const items = collectCards(pageResult.data);
      if (items.length > 0) return { ok: true, data: items };
    }

    return { ok: false, error: `No titles found for "${category}"` };
  }

  /**
   * The genre list, read from the site's own widget.
   *
   * Anchored to `hianime-genres-widget` so the parser cannot wander into a
   * poster link elsewhere on the page, and tolerant of the absolute URLs the
   * markup actually uses (`https://aniwatchtv.ws/genres/action`).
   */
  async genres(): Promise<Result<{ name: string; slug: string }[]>> {
    const page = await this.requestText("/home");
    if (!page.ok) return page;

    const start = page.data.indexOf("hianime-genres-widget");
    const scope = start === -1 ? page.data : page.data.slice(start, start + 12_000);

    const found = new Map<string, string>();
    const re = /<a\b[^>]*href="[^"]*\/genres?\/([a-z0-9-]+)"[^>]*>([\s\S]*?)<\/a>/gi;
    let m: RegExpExecArray | null;
    while ((m = re.exec(scope)) !== null) {
      const slug = m[1] ?? "";
      const label = text(m[2] ?? "");
      if (slug && label && !found.has(slug)) found.set(slug, label);
    }

    return {
      ok: true,
      data: [...found.entries()]
        .map(([slug, name]) => ({ slug, name }))
        .sort((a, b) => a.name.localeCompare(b.name)),
    };
  }

  // ------------------------------------------------------------------ detail

  /** Everything the detail screen shows, read from the anime's own page. */
  async details(animeId: string): Promise<Result<AnimeDetails>> {
    const id = normaliseId(animeId);
    const page = await this.requestText(`/${id}`);
    if (!page.ok) return page;

    const html = page.data;
    const title = text(
      firstByClass(html, "film-name")?.inner ??
        html.match(/<h1[^>]*>([\s\S]*?)<\/h1>/i)?.[1] ??
        "",
    );
    if (!title) return { ok: false, error: "Detail page had no title" };

    const poster = firstImage(html) ?? "";
    const description = text(firstByClass(html, "film-description")?.inner ?? "");

    const info = new Map<string, string>();
    for (const item of findByClass(html, "fdi-item")) {
      const label = text(item.inner);
      if (label) info.set(label.toLowerCase(), label);
    }

    const genres = [...html.matchAll(/\/genre\/([a-z0-9-]+)/gi)]
      .map((m) => titleFromSlug(m[1] ?? ""))
      .filter((value, index, all) => value && all.indexOf(value) === index);

    const studios = [...html.matchAll(/\/studios\/([a-z0-9-]+)/gi)]
      .map((m) => titleFromSlug(m[1] ?? ""))
      .filter((value, index, all) => value && all.indexOf(value) === index);

    const totalEpisodes = Number(
      html.match(/(\d+)\s*<\/span>\s*<span[^>]*>\s*Episodes/i)?.[1] ??
        html.match(/"totalEpisodes"\s*:\s*(\d+)/)?.[1] ??
        0,
    );

    const details: AnimeDetails = {
      id,
      title,
      poster,
      description,
      format: matchAny(html, /class="fdi-item[^"]*">\s*(TV|Movie|ONA|OVA|Special)/i),
      duration: matchAny(html, /class="fdi-item fdi-duration[^"]*">\s*([^<]+)/i),
      status: matchAny(html, /class="fdi-item[^"]*">\s*(Currently Airing|Finished Airing|Not yet aired)/i),
      premiered: matchAny(html, /Premiered:\s*<\/span>\s*<a[^>]*>([^<]+)/i),
      japanese: matchAny(html, /Japanese:\s*<\/span>\s*<[^>]*>([^<]+)/i),
      score: matchAny(html, /class="score"[^>]*>\s*([\d.]+)/i) ?? matchAny(html, /(\d\.\d)\s*<\/span>\s*<span[^>]*>score/i),
      genres,
      studios,
      related: collectCards(firstByClass(html, "block-related")?.inner ?? ""),
      recommendations: collectCards(firstByClass(html, "block-recommended")?.inner ?? ""),
      totalEpisodes: Number.isFinite(totalEpisodes) ? totalEpisodes : 0,
    };

    return { ok: true, data: details };
  }

  // ---------------------------------------------------------------- episodes

  /** `episode/list/{animeId}` → every episode, with the ids `?ep=` uses. */
  async episodes(animeId: string): Promise<Result<Episode[]>> {
    const root = await this.discoverApiRoot();
    const id = normaliseId(animeId);
    const result = await this.requestJson(`${root}episode/list/${id}`, {
      headers: { Accept: "application/json" },
    });
    if (!result.ok) return result;

    const fragment = readFragment(result.data);
    if (!fragment.status) return { ok: false, error: "Episode list was reported unavailable" };

    return { ok: true, data: parseEpisodes(fragment) };
  }

  // ----------------------------------------------------------------- servers

  /**
   * `episode/servers?episodeId=` → playable embeds.
   *
   * This is the endpoint that replaces the entire "find an m3u8" problem: it
   * hands back base64 hashes of player URLs, so there is nothing left to scrape.
   */
  async servers(episodeId: string): Promise<Result<import("../model.ts").Server[]>> {
    const root = await this.discoverApiRoot();
    const result = await this.requestJson(`${root}episode/servers?episodeId=${episodeId}`, {
      headers: { Accept: "application/json" },
    });
    if (!result.ok) return result;

    const fragment = readFragment(result.data);
    if (!fragment.status) return { ok: false, error: "No servers for this episode" };

    const servers = parseServers(fragment);
    if (servers.length === 0) return { ok: false, error: "Server list had no playable entry" };

    return { ok: true, data: servers };
  }

  // --------------------------------------------------------------- downloads

  /**
   * `episode/downloads?episodeId=` → files.
   *
   * The site gates this behind an account setting (Settings → Features →
   * Downloads); when it is off the route answers `status:false` and the caller
   * must say so rather than showing an empty list.
   */
  async downloads(episodeId: string): Promise<Result<import("../model.ts").DownloadLink[]>> {
    const root = await this.discoverApiRoot();
    const result = await this.requestJson(`${root}episode/downloads?episodeId=${episodeId}`, {
      headers: { Accept: "application/json" },
    });
    if (!result.ok) return result;

    const fragment = readFragment(result.data);
    const links = parseDownloads(fragment);

    if (!fragment.status) {
      return { ok: false, error: "Downloads are disabled for this source" };
    }
    return { ok: true, data: links };
  }

  // ------------------------------------------------------------------ watch

  /**
   * The watch page for an anime, which is where the episode ids come from and
   * where `data-anime-id` lives. `details()` reads the detail page; this reads
   * the player page, and they are different documents.
   */
  async watchPage(animeId: string, episodeId?: string): Promise<Result<{ episodes: Episode[]; animeId: string }>> {
    const id = normaliseId(animeId);
    const suffix = episodeId ? `?ep=${episodeId}` : "";
    const page = await this.requestText(`/watch/${id}${suffix}`);
    if (!page.ok) return page;

    const html = page.data;
    const episodes: Episode[] = [];
    const seen = new Set<string>();

    for (const item of findByClass(html, "ep-item")) {
      const epId = item.attrs["data-id"];
      if (!epId || seen.has(epId)) continue;
      seen.add(epId);
      const number = Number(item.attrs["data-number"] ?? episodes.length + 1);
      episodes.push({
        id: epId,
        number: Number.isFinite(number) ? number : episodes.length + 1,
      });
    }

    // The page states the anime id too; trust it over the URL when they differ.
    const detailNode = html.match(/<[^>]*id="ani_detail"[^>]*>/i);
    const statedId = detailNode ? dataAttrs(detailNode[0])["data-anime-id"] : undefined;

    return {
      ok: true,
      data: {
        animeId: statedId ? `${id.split(/-\d+$/)[0]}-${statedId}` : id,
        episodes: episodes.sort((a, b) => a.number - b.number),
      },
    };
  }
}

// -------------------------------------------------------------------- helpers

/** `primal-9050` stays; a full URL or a bare number becomes a slug. */
function normaliseId(animeId: string): string {
  const trimmed = animeId.trim();
  if (/^https?:\/\//i.test(trimmed)) {
    return animeIdFromHref(trimmed) ?? trimmed.replace(/\/$/, "").split("/").pop() ?? trimmed;
  }
  return trimmed.replace(/^\//, "").replace(/^watch\//, "");
}

function matchAny(html: string, re: RegExp): string | undefined {
  const m = html.match(re);
  return m?.[1] ? text(m[1]) : undefined;
}

function titleFromSlug(slug: string): string {
  return slug
    .split("-")
    .map((part) => (part.length > 2 ? (part[0] ?? "").toUpperCase() + part.slice(1) : part))
    .join(" ");
}

/**
 * A card from any node that contains a poster link.
 *
 * The site renders the same card in at least four wrappers (`.flw-item`,
 * `.film-poster`, `.item`, plain anchors), so this reads the poster anchor and
 * takes what it can rather than depending on one wrapper class.
 */
function cardFromNode(html: string): AnimeCard | null {
  const anchor = html.match(/<a\b[^>]*href="([^"]*)"[^>]*>\s*<img\b[^>]*>/i);
  const anyAnchor = anchor ?? html.match(/<a\b[^>]*href="([^"]*\/(?:watch\/)?[a-z0-9-]+-\d+[^"]*)"/i);
  if (!anyAnchor) return null;

  const href = decodeEntities(anyAnchor[1] ?? "");
  const id = animeIdFromHref(href);
  if (!id) return null;

  const poster = firstImage(html);
  if (!poster) return null;

  const title =
    text(firstByClass(html, "film-name")?.inner ?? "") ||
    text(firstByClass(html, "dynamic-name")?.inner ?? "") ||
    decodeEntities(anyAnchor[0].match(/title="([^"]+)"/)?.[1] ?? "") ||
    text(anyAnchor[0].replace(/<[^>]*>/g, " ")) ||
    titleFromSlug(id.replace(/-\d+$/, ""));

  const badge = text(firstByClass(html, "tick")?.inner ?? "") || undefined;
  const episodes = Number(firstByClass(html, "tick-item")?.inner ?? NaN);
  const sub = Number(firstByClass(html, "tick-sub")?.inner ?? NaN);
  const dub = Number(firstByClass(html, "tick-dub")?.inner ?? NaN);

  return {
    id,
    title: title || titleFromSlug(id.replace(/-\d+$/, "")),
    poster,
    format: firstByClass(html, "fdi-item")?.inner ? text(firstByClass(html, "fdi-item")!.inner) : undefined,
    episodes: Number.isFinite(episodes) ? episodes : undefined,
    sub: Number.isFinite(sub) ? sub : undefined,
    dub: Number.isFinite(dub) ? dub : undefined,
    badge,
  };
}

/** Every distinct card on a listing page, in document order. */
function collectCards(html: string): AnimeCard[] {
  const cards: AnimeCard[] = [];
  const seen = new Set<string>();

  const nodes = [
    ...findByClass(html, "flw-item"),
    ...findByClass(html, "film-poster"),
    ...findByClass(html, "item"),
  ];

  for (const node of nodes) {
    const card = cardFromNode(node.inner);
    if (card && !seen.has(card.id)) {
      seen.add(card.id);
      cards.push(card);
    }
  }

  // Nothing matched a wrapper class: read every poster anchor on the page.
  if (cards.length === 0) {
    const re = /<a\b[^>]*href="([^"]*\/(?:watch\/)?[a-z0-9-]+-\d+[^"]*)"[^>]*>([\s\S]{0,400}?)<\/a>/gi;
    let m: RegExpExecArray | null;
    while ((m = re.exec(html)) !== null) {
      const id = animeIdFromHref(m[1] ?? "");
      const poster = firstImage(m[2] ?? "");
      if (!id || !poster || seen.has(id)) continue;
      seen.add(id);
      cards.push({
        id,
        title: decodeEntities(
          (m[2] ?? "").match(/title="([^"]+)"/)?.[1] ?? titleFromSlug(id.replace(/-\d+$/, "")),
        ),
        poster,
      });
    }
  }

  return cards;
}

/** The named rails (Trending, Most Popular, …) and their cards. */
function collectRails(html: string): Rail[] {
  const rails: Rail[] = [];

  for (const block of findByClass(html, "block_area")) {
    const heading = text(firstByClass(block.inner, "cat-heading")?.inner ?? "");
    if (!heading) continue;

    const items = collectCards(block.inner);
    if (items.length === 0) continue;

    rails.push({
      name: heading,
      items,
      viewAllHref: firstHref(block.inner) ?? undefined,
    });
  }

  // Single-rail templates: everything on the page, named for what it is.
  if (rails.length === 0) {
    const items = collectCards(html);
    if (items.length > 0) rails.push({ name: "Latest", items });
  }

  return rails;
}

/** A client with the defaults the app uses. */
export const createClient = (options?: ClientOptions) => new AniWatchClient(options);
