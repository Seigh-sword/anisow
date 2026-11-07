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

import type { AnimeCard, AnimeDetails, Episode, FilterParams, HomeRails, Rail, Spotlight } from "../model.ts";
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
export const DEFAULT_ANIKOTO_BASE = "https://anikotoapi.site";
export const DEFAULT_ZOKO_BASE = "https://zokoanime.video";

export type Result<T> = { ok: true; data: T } | { ok: false; error: string; status?: number };

export interface ClientOptions {
  baseUrl?: string;
  /** Optional Anikoto API base URL (`/api/anikoto` on web, `https://anikotoapi.site` on native). */
  anikotoBaseUrl?: string;
  /** Optional ZokoAnime API base URL (`https://zokoanime.video`). */
  zokoBaseUrl?: string;
  /** Injected so tests do not touch the network. */
  fetchImpl?: typeof fetch;
  /** Per-request timeout; the site is sometimes slow to first byte. */
  timeoutMs?: number;
  userAgent?: string;
}

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

const TYPE_SLUGS = new Set(["tv", "movie", "ova", "ona", "special", "music"]);

export class AniWatchClient {
  readonly baseUrl: string;
  readonly anikotoBaseUrl: string;
  readonly zokoBaseUrl: string;
  private readonly fetchImpl: typeof fetch;
  private readonly timeoutMs: number;
  private readonly userAgent: string;
  /** Learned from a watch page; the site states where its own API lives. */
  private restUrl: string | null = null;
  /** Cached recent-anime pages from Anikoto API so we respect its 60 req / 120s rate limit. */
  private anikotoCache: { fetchedAt: number; items: any[] } | null = null;

  constructor(options: ClientOptions = {}) {
    this.baseUrl = (options.baseUrl ?? DEFAULT_BASE).replace(/\/$/, "");
    this.anikotoBaseUrl = (options.anikotoBaseUrl ?? DEFAULT_ANIKOTO_BASE).replace(/\/$/, "");
    this.zokoBaseUrl = (options.zokoBaseUrl ?? DEFAULT_ZOKO_BASE).replace(/\/$/, "");
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

    // Enrich Home with a live "Anikoto · Recent Updates" rail when reachable.
    try {
      const anikoto = await this.anikotoRecent(1, 16);
      if (anikoto.ok && anikoto.data.length > 0) {
        rails.push({
          name: "Anikoto · Recent Updates",
          items: anikoto.data,
        });
      }
    } catch {
      // Optional enrichment: never fail Home if Anikoto is unreachable.
    }

    if (spotlight.length === 0 && rails.length === 0) {
      return { ok: false, error: "Home page had neither slides nor rails" };
    }

    return { ok: true, data: { spotlight, rails } };
  }

  // ----------------------------------------------------------------- search

  /**
   * `/search?keyword=` — the site's own search box posts here, supplemented by
   * Anikoto's recent catalogue when matching titles exist.
   */
  async search(query: string, page = 1): Promise<Result<AnimeCard[]>> {
    const trimmed = query.trim();
    if (!trimmed) return { ok: true, data: [] };

    const suffix = page > 1 ? `&page=${page}` : "";
    const pageResult = await this.requestText(
      `/search?keyword=${encodeURIComponent(trimmed)}${suffix}`,
    );

    const items = pageResult.ok ? collectCards(pageResult.data) : [];

    // Also match against Anikoto's recent index so newly updated Anikoto titles surface.
    if (page === 1) {
      try {
        if (!this.anikotoCache || Date.now() - this.anikotoCache.fetchedAt > 120_000) {
          await this.anikotoRecent(1, 100);
        }
        const qLower = trimmed.toLowerCase();
        const anikotoMatches = (this.anikotoCache?.items ?? [])
          .filter((item: any) => {
            const t1 = String(item.title ?? "").toLowerCase();
            const t2 = String(item.alternative ?? "").toLowerCase();
            const t3 = String(item.titles ?? "").toLowerCase();
            return t1.includes(qLower) || t2.includes(qLower) || t3.includes(qLower);
          })
          .map(cardFromAnikoto);

        const seenTitles = new Set(items.map((c) => c.title.toLowerCase()));
        for (const card of anikotoMatches) {
          if (!seenTitles.has(card.title.toLowerCase())) {
            seenTitles.add(card.title.toLowerCase());
            items.push(card);
          }
        }
      } catch {
        // Optional enrichment
      }
    }

    if (!pageResult.ok && items.length === 0) return pageResult;
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
   * Multi-criteria filter matching the full `/filter` form on AniWatch:
   * Type, Status, Rated, Score, Season, Language, Start Date (Y/M/D),
   * End Date (Y/M/D), Sort, Keyword, and multi-select Genres (`genre[]`).
   */
  async filter(params: FilterParams): Promise<Result<AnimeCard[]>> {
    const query = new URLSearchParams();
    if (params.keyword?.trim()) query.set("keyword", params.keyword.trim());
    if (params.type) query.set("type", params.type);
    if (params.status) query.set("status", params.status);
    if (params.rating) query.set("rating", params.rating);
    if (params.score) query.set("score", params.score);
    if (params.season) query.set("season", params.season);
    if (params.language) query.set("language", params.language);
    if (params.sort) query.set("sort", params.sort);
    if (params.startYear) query.set("sy", params.startYear);
    if (params.startMonth) query.set("sm", params.startMonth);
    if (params.startDay) query.set("sd", params.startDay);
    if (params.endYear) query.set("ey", params.endYear);
    if (params.endMonth) query.set("em", params.endMonth);
    if (params.endDay) query.set("ed", params.endDay);
    if (params.genres && params.genres.length > 0) {
      for (const g of params.genres) {
        const slug = g.trim().toLowerCase().replace(/\s+/g, "-");
        if (slug) query.append("genre[]", slug);
      }
    }
    if (params.page && params.page > 1) query.set("page", String(params.page));

    const qs = query.toString();
    const pageResult = await this.requestText(qs ? `/filter?${qs}` : "/filter");
    if (!pageResult.ok) return pageResult;

    return { ok: true, data: collectCards(pageResult.data) };
  }

  /**
   * A genre or type listing, e.g. `action`, `slice-of-life`, `tv`, `movie`.
   *
   * Type slugs (`tv`, `movie`, `ova`, `ona`, `special`, `music`) are queried
   * through `/filter?type={slug}` or `/{slug}`, while genres live under
   * `/genres/{slug}` (plural) or `/filter?genre[]={slug}`.
   */
  async browse(category: string, page = 1): Promise<Result<AnimeCard[]>> {
    const slug = category.trim().toLowerCase().replace(/\s+/g, "-");
    const suffix = page > 1 ? `?page=${page}` : "";

    const paths = TYPE_SLUGS.has(slug)
      ? [`/filter?type=${encodeURIComponent(slug)}${page > 1 ? `&page=${page}` : ""}`, `/${encodeURIComponent(slug)}${suffix}`]
      : [
          `/genres/${encodeURIComponent(slug)}${suffix}`,
          `/filter?genre%5B%5D=${encodeURIComponent(slug)}${page > 1 ? `&page=${page}` : ""}`,
          `/genres/${slug}/page/${page}`,
        ];

    for (const path of paths) {
      const pageResult = await this.requestText(path);
      if (!pageResult.ok) continue;

      const items = collectCards(pageResult.data);
      if (items.length > 0) return { ok: true, data: items };
    }

    return { ok: false, error: `No titles found for "${category}"` };
  }

  /**
   * The genre list, read from the site's `/filter` or `/home` widget.
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

  /** Everything the detail screen shows, read from the anime's own page or Anikoto. */
  async details(animeId: string): Promise<Result<AnimeDetails>> {
    const trimmed = animeId.trim();
    if (trimmed.startsWith("anikoto-")) {
      const anikotoRes = await this.anikotoSeries(trimmed.replace(/^anikoto-/, ""));
      if (anikotoRes.ok) return { ok: true, data: anikotoRes.data.details };
      return anikotoRes;
    }

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

    const posterRaw =
      firstImage(firstByClass(html, "anisc-poster")?.inner ?? "") ??
      firstImage(firstByClass(html, "film-poster")?.inner ?? "") ??
      firstImage(html) ??
      "";
    const poster = resolveMediaUrl(posterRaw, this.baseUrl);

    const description = text(
      firstByClass(html, "film-description")?.inner ??
        firstByClass(html, "overview")?.inner ??
        html.match(/Overview:\s*<\/span>\s*<div[^>]*>([\s\S]*?)<\/div>/i)?.[1] ??
        "",
    );

    const info = new Map<string, string>();
    for (const item of findByClass(html, "fdi-item")) {
      const label = text(item.inner);
      if (label) info.set(label.toLowerCase(), label);
    }

    const genres = [...html.matchAll(/\/genres?\/([a-z0-9-]+)/gi)]
      .map((m) => titleFromSlug(m[1] ?? ""))
      .filter((value, index, all) => value && all.indexOf(value) === index);

    const studios = [...html.matchAll(/\/studios?\/([a-z0-9-]+)/gi)]
      .map((m) => titleFromSlug(m[1] ?? ""))
      .filter((value, index, all) => value && all.indexOf(value) === index);

    const totalEpisodes = Number(
      html.match(/class="tick-item tick-eps"[^>]*>\s*(\d+)/i)?.[1] ??
        html.match(/(\d+)\s*<\/span>\s*<span[^>]*>\s*Episodes/i)?.[1] ??
        html.match(/"totalEpisodes"\s*:\s*(\d+)/)?.[1] ??
        0,
    );

    const anilistId =
      html.match(/anilistcdn\/media\/anime\/(?:banner|cover\/[a-z]+)\/(\d+)-/i)?.[1] ??
      html.match(/"anilist_id"\s*:\s*"?(\d+)"?/i)?.[1];
    const malId = html.match(/"mal_id"\s*:\s*"?(\d+)"?/i)?.[1];

    const details: AnimeDetails = {
      id,
      title,
      poster,
      description,
      format: matchAny(html, /class="fdi-item[^"]*">\s*(TV|Movie|ONA|OVA|Special)/i) ??
        matchAny(html, /href="[^"]*\/(tv|movie|ova|ona|special)"[^>]*>\s*([^<]+)/i),
      duration: matchAny(html, /class="fdi-item fdi-duration[^"]*">\s*([^<]+)/i) ??
        matchAny(html, /Duration:\s*<\/span>\s*<span[^>]*>([^<]+)/i),
      status:
        matchAny(html, /class="fdi-item[^"]*">\s*(Currently Airing|Finished Airing|Not yet aired)/i) ??
        matchAny(html, /Status:\s*<\/span>\s*<span[^>]*>([^<]+)/i),
      premiered:
        matchAny(html, /Premiered:\s*<\/span>\s*<(?:a|span)[^>]*>([^<]+)/i) ??
        matchAny(html, /Aired:\s*<\/span>\s*<span[^>]*>([^<]+)/i),
      japanese: matchAny(html, /Japanese:\s*<\/span>\s*<[^>]*>([^<]+)/i),
      score:
        matchAny(html, /MAL Score:\s*<\/span>\s*<span[^>]*>\s*([\d.]+)/i) ??
        matchAny(html, /class="score"[^>]*>\s*([\d.]+)/i) ??
        matchAny(html, /(\d\.\d+)\s*<\/span>\s*<span[^>]*>score/i),
      genres,
      studios,
      related: collectCards(firstByClass(html, "block-related")?.inner ?? ""),
      recommendations: collectCards(firstByClass(html, "block-recommended")?.inner ?? ""),
      totalEpisodes: Number.isFinite(totalEpisodes) ? totalEpisodes : 0,
      ...(anilistId ? { anilistId } : {}),
      ...(malId ? { malId } : {}),
    };

    return { ok: true, data: details };
  }

  // ---------------------------------------------------------------- episodes

  /**
   * `episode/list/{numericId}` → every episode, with the ids `?ep=` uses.
   *
   * Note: `/api/theme/episode/list/{id}` requires the numeric suffix (e.g.
   * `8020` from `naruto-8020`), NOT the full slug (`naruto-8020` returns 404).
   * If the title is an `anikoto-{id}` series, episodes are read from Anikoto.
   */
  async episodes(animeId: string): Promise<Result<Episode[]>> {
    const trimmed = animeId.trim();
    if (trimmed.startsWith("anikoto-")) {
      const anikotoRes = await this.anikotoSeries(trimmed.replace(/^anikoto-/, ""));
      if (anikotoRes.ok) return { ok: true, data: anikotoRes.data.episodes };
      return anikotoRes;
    }

    const root = await this.discoverApiRoot();
    const slug = normaliseId(animeId);
    const numId = numericIdFromSlug(slug);

    for (const candidate of numId !== slug ? [numId, slug] : [slug]) {
      const result = await this.requestJson(`${root}episode/list/${candidate}`, {
        headers: { Accept: "application/json" },
      });
      if (!result.ok) continue;

      const fragment = readFragment(result.data);
      if (!fragment.status) continue;

      const parsed = parseEpisodes(fragment);
      if (parsed.length > 0) return { ok: true, data: parsed };
    }

    // Fallback: read `.ep-item` directly off the watch page.
    const watch = await this.watchPage(slug);
    if (watch.ok && watch.data.episodes.length > 0) {
      return { ok: true, data: watch.data.episodes };
    }

    return { ok: false, error: "Episode list was reported unavailable" };
  }

  // ----------------------------------------------------------------- servers

  /**
   * `episode/servers?episodeId=` → playable embeds, enriched with ZokoAnime
   * (`https://zokoanime.video/stream/{mal|anilist}/{id}/{ep}/{sub|dub}`) and
   * Anikoto / MegaPlay (`https://megaplay.buzz/stream/s-2/...`) when available.
   */
  async servers(
    episodeId: string,
    context?: {
      episodeNumber?: number;
      anilistId?: string;
      malId?: string;
      embedUrls?: { sub?: string; dub?: string };
    },
  ): Promise<Result<import("../model.ts").Server[]>> {
    const list: import("../model.ts").Server[] = [];

    // 1. Direct Anikoto / MegaPlay embed URLs if carried on the episode
    if (context?.embedUrls?.sub) {
      list.push({
        name: "Anikoto (MegaPlay)",
        audio: "sub",
        embedUrl: context.embedUrls.sub,
        provider: "anikoto",
      });
    }
    if (context?.embedUrls?.dub) {
      list.push({
        name: "Anikoto (MegaPlay)",
        audio: "dub",
        embedUrl: context.embedUrls.dub,
        provider: "anikoto",
      });
    }

    // 2. AniWatch `/api/theme/episode/servers?episodeId=`
    if (!episodeId.startsWith("anikoto-")) {
      const root = await this.discoverApiRoot();
      const result = await this.requestJson(`${root}episode/servers?episodeId=${episodeId}`, {
        headers: { Accept: "application/json" },
      });
      if (result.ok) {
        const fragment = readFragment(result.data);
        if (fragment.status) {
          for (const srv of parseServers(fragment)) {
            if (!list.some((existing) => existing.embedUrl === srv.embedUrl)) {
              list.push(srv);
            }
          }
        }
      }
    }

    // 3. Cross-lookup on Anikoto (`https://anikotoapi.site/series/{id}`) when the episode came
    //    from AniWatch so any matching series in Anikoto's feed contributes its MegaPlay embeds.
    const epNum = context?.episodeNumber ?? 1;
    if (!context?.embedUrls && (context?.malId || context?.anilistId)) {
      try {
        const anikotoMatch = await this.findAnikotoSeries({
          malId: context.malId,
          anilistId: context.anilistId,
        });
        const epMatch = anikotoMatch?.episodes.find((ep) => ep.number === epNum);
        if (epMatch?.embedUrls?.sub && !list.some((s) => s.embedUrl === epMatch.embedUrls!.sub)) {
          list.push({
            name: "Anikoto (MegaPlay)",
            audio: "sub",
            embedUrl: epMatch.embedUrls.sub,
            provider: "anikoto",
          });
        }
        if (epMatch?.embedUrls?.dub && !list.some((s) => s.embedUrl === epMatch.embedUrls!.dub)) {
          list.push({
            name: "Anikoto (MegaPlay)",
            audio: "dub",
            embedUrl: epMatch.embedUrls.dub,
            provider: "anikoto",
          });
        }
      } catch {
        // Optional cross-lookup
      }
    }

    // 4. ZokoAnime direct embeds (`https://zokoanime.video/stream/{mal|anilist}/{id}/{episode}/{track}`)
    //    Added whenever we know the MAL or AniList ID (and episode number) so the user can always
    //    pick between ZokoAnime and Anikoto/MegaPlay, or auto-fallback when one doesn't have the title.
    const zokoSource = context?.malId ? "mal" : context?.anilistId ? "anilist" : null;
    const zokoId = context?.malId ?? context?.anilistId;
    if (zokoSource && zokoId) {
      const hasZokoSub = list.some((s) => s.embedUrl.includes("zokoanime.video") && s.audio === "sub");
      const hasZokoDub = list.some((s) => s.embedUrl.includes("zokoanime.video") && s.audio === "dub");
      if (!hasZokoSub) {
        list.push({
          name: "ZokoAnime",
          audio: "sub",
          embedUrl: `${this.zokoBaseUrl}/stream/${zokoSource}/${zokoId}/${epNum}/sub`,
          provider: "zoko",
        });
      }
      if (!hasZokoDub) {
        list.push({
          name: "ZokoAnime",
          audio: "dub",
          embedUrl: `${this.zokoBaseUrl}/stream/${zokoSource}/${zokoId}/${epNum}/dub`,
          provider: "zoko",
        });
      }
    }

    if (list.length === 0) return { ok: false, error: "Server list had no playable entry" };

    return { ok: true, data: list };
  }

  // --------------------------------------------------------------- anikoto api

  /**
   * Fetch recent anime from `https://anikotoapi.site/recent-anime` (via proxy on web).
   * Cached in-memory for 2 minutes to respect the 60 req / 120s rate limit.
   */
  async anikotoRecent(page = 1, perPage = 40): Promise<Result<AnimeCard[]>> {
    const url = `${this.anikotoBaseUrl}/recent-anime?page=${page}&per_page=${perPage}`;
    const res = await this.requestJson(url, {
      headers: { Accept: "application/json", Referer: "https://anikotoapi.site/" },
    });
    if (!res.ok) return res;

    const payload = res.data as { ok?: boolean; data?: any[] } | null;
    if (!payload?.ok || !Array.isArray(payload.data)) {
      return { ok: false, error: "Anikoto API returned an unexpected payload" };
    }

    if (page === 1) {
      this.anikotoCache = { fetchedAt: Date.now(), items: payload.data };
    }

    return {
      ok: true,
      data: payload.data.map(cardFromAnikoto),
    };
  }

  /**
   * Fetch a single series with all episodes and MegaPlay embed links from
   * `https://anikotoapi.site/series/{id}`.
   */
  async anikotoSeries(
    seriesId: string | number,
  ): Promise<Result<{ details: AnimeDetails; episodes: Episode[] }>> {
    const cleanId = String(seriesId).replace(/^anikoto-/, "");
    const url = `${this.anikotoBaseUrl}/series/${encodeURIComponent(cleanId)}`;
    const res = await this.requestJson(url, {
      headers: { Accept: "application/json", Referer: "https://anikotoapi.site/" },
    });
    if (!res.ok) return res;

    const payload = res.data as {
      ok?: boolean;
      data?: { anime?: any; episodes?: any[] };
    } | null;
    const anime = payload?.data?.anime;
    if (!payload?.ok || !anime) {
      return { ok: false, error: "Series not found on Anikoto API" };
    }

    const rawEpisodes = Array.isArray(payload.data?.episodes) ? payload.data!.episodes : [];
    const episodes: Episode[] = rawEpisodes
      .map((ep: any, idx: number): Episode => ({
        id: `anikoto-${anime.id}-ep-${ep.number ?? idx + 1}`,
        number: Number(ep.number ?? idx + 1),
        title: ep.title && !/^Episode \d+$/i.test(String(ep.title)) ? String(ep.title) : undefined,
        embedUrls: {
          sub: ep.embed_url?.sub || undefined,
          dub: ep.embed_url?.dub || undefined,
        },
      }))
      .sort((a, b) => a.number - b.number);

    const genres: string[] = Array.isArray(anime.terms_by_type?.genre)
      ? anime.terms_by_type.genre.map(String)
      : [];
    const studios: string[] = Array.isArray(anime.terms_by_type?.studios)
      ? anime.terms_by_type.studios.map(String)
      : [];
    const format: string | undefined = Array.isArray(anime.terms_by_type?.type)
      ? anime.terms_by_type.type[0]
      : undefined;

    const details: AnimeDetails = {
      id: `anikoto-${anime.id}`,
      title: String(anime.title || anime.titles || "Untitled"),
      japanese: anime.native ? String(anime.native) : undefined,
      poster: String(anime.poster || anime.background_image || ""),
      description: anime.description ? String(anime.description) : undefined,
      format,
      duration: anime.duration ? String(anime.duration) : undefined,
      status: anime.status ? String(anime.status) : undefined,
      premiered:
        anime.season && anime.year
          ? `${String(anime.season)[0]?.toUpperCase() ?? ""}${String(anime.season).slice(1)} ${anime.year}`
          : anime.aired
            ? String(anime.aired)
            : undefined,
      score: anime.score ? String(anime.score) : undefined,
      badge: anime.rating ? String(anime.rating) : undefined,
      sub: Number(anime.is_sub) || undefined,
      dub: Number(anime.is_dub) || undefined,
      genres,
      studios,
      related: [],
      recommendations: [],
      totalEpisodes: Number(anime.episodes) || episodes.length,
      anilistId: anime.ani_id ? String(anime.ani_id) : undefined,
      malId: anime.mal_id ? String(anime.mal_id) : undefined,
    };

    return { ok: true, data: { details, episodes } };
  }

  /**
   * Look up a title on Anikoto by MAL ID, AniList ID, or title match so any
   * anime opened from AniWatch can also offer Anikoto (`megaplay.buzz`) servers
   * or auto-select Anikoto when another server doesn't have the title.
   */
  async findAnikotoSeries(match: {
    malId?: string;
    anilistId?: string;
    title?: string;
  }): Promise<{ details: AnimeDetails; episodes: Episode[] } | null> {
    if (!this.anikotoCache || Date.now() - this.anikotoCache.fetchedAt > 120_000) {
      await this.anikotoRecent(1, 100);
    }
    const items = this.anikotoCache?.items ?? [];
    const normTitle = match.title?.trim().toLowerCase();

    const hit = items.find((item: any) => {
      if (match.malId && String(item.mal_id) === String(match.malId)) return true;
      if (match.anilistId && String(item.ani_id) === String(match.anilistId)) return true;
      if (normTitle) {
        const t1 = String(item.title ?? "").trim().toLowerCase();
        const t2 = String(item.alternative ?? "").trim().toLowerCase();
        if (t1 === normTitle || t2 === normTitle) return true;
      }
      return false;
    });

    if (!hit?.id) return null;
    const series = await this.anikotoSeries(hit.id);
    return series.ok ? series.data : null;
  }

  // --------------------------------------------------------------- downloads

  /**
   * `episode/downloads?episodeId=` → files, with ZokoAnime download token
   * fallback (`/api/downloads/token/{source}/{id}/{episode}/{track}`) when
   * AniWatch downloads are disabled or empty.
   */
  async downloads(
    episodeId: string,
    context?: {
      episodeNumber?: number;
      anilistId?: string;
      malId?: string;
      track?: "sub" | "dub";
    },
  ): Promise<Result<import("../model.ts").DownloadLink[]>> {
    if (!episodeId.startsWith("anikoto-")) {
      const root = await this.discoverApiRoot();
      const result = await this.requestJson(`${root}episode/downloads?episodeId=${episodeId}`, {
        headers: { Accept: "application/json" },
      });
      if (result.ok) {
        const fragment = readFragment(result.data);
        const links = parseDownloads(fragment);
        if (fragment.status && links.length > 0) {
          return { ok: true, data: links };
        }
      }
    }

    // ZokoAnime download API fallback when MAL or AniList ID is known
    const zokoSource = context?.malId ? "mal" : context?.anilistId ? "anilist" : null;
    const zokoId = context?.malId ?? context?.anilistId;
    const epNum = context?.episodeNumber ?? 1;
    const track = context?.track ?? "sub";

    if (zokoSource && zokoId) {
      const path = `${zokoSource}/${zokoId}/${epNum}/${track}`;
      const tokRes = await this.requestJson(`${this.zokoBaseUrl}/api/downloads/token/${path}`, {
        headers: { Accept: "application/json", Referer: `${this.zokoBaseUrl}/` },
      });
      if (tokRes.ok) {
        const token = (tokRes.data as { token?: string } | null)?.token;
        if (token) {
          const dlRes = await this.requestJson(
            `${this.zokoBaseUrl}/api/downloads/${path}?t=${encodeURIComponent(token)}`,
            { headers: { Accept: "application/json", Referer: `${this.zokoBaseUrl}/` } },
          );
          if (dlRes.ok) {
            const items = (dlRes.data as { downloads?: { label?: string; url?: string; kind?: string }[] } | null)
              ?.downloads;
            if (Array.isArray(items) && items.length > 0) {
              const mapped: import("../model.ts").DownloadLink[] = items
                .filter((item) => item.url)
                .map((item) => ({
                  quality: item.label || "720p",
                  url: String(item.url),
                  group: `Zoko ${(item.kind ?? track).toUpperCase()}`,
                }));
              if (mapped.length > 0) return { ok: true, data: mapped };
            }
          }
        }
      }
    }

    return { ok: false, error: "Downloads are disabled for this source" };
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

/** Extract the numeric suffix (`8020` from `naruto-8020`) required by `episode/list/{id}`. */
function numericIdFromSlug(slug: string): string {
  const m = slug.match(/-(\d+)$/);
  return m?.[1] ?? slug;
}

/** Resolve relative `/storage/...` image paths against the catalogue origin. */
function resolveMediaUrl(url: string, baseUrl: string): string {
  if (!url) return "";
  if (/^(https?:|data:)/i.test(url)) return url;
  if (url.startsWith("//")) return `https:${url}`;
  const origin = /^https?:\/\//i.test(baseUrl) ? baseUrl : DEFAULT_BASE;
  return `${origin.replace(/\/$/, "")}${url.startsWith("/") ? "" : "/"}${url}`;
}

function cardFromAnikoto(item: any): AnimeCard {
  const format = Array.isArray(item.terms_by_type?.type)
    ? String(item.terms_by_type.type[0] ?? "")
    : undefined;
  return {
    id: `anikoto-${item.id}`,
    title: String(item.title || item.titles || "Untitled"),
    altTitle: item.native ? String(item.native) : undefined,
    poster: String(item.poster || item.background_image || ""),
    format: format || undefined,
    duration: item.duration ? String(item.duration) : undefined,
    episodes: Number(item.episodes) || undefined,
    sub: Number(item.is_sub) || undefined,
    dub: Number(item.is_dub) || undefined,
    description: item.description ? String(item.description) : undefined,
    badge: item.rating ? String(item.rating) : undefined,
  };
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

  const rawPoster = firstImage(html);
  if (!rawPoster) return null;
  const poster = resolveMediaUrl(rawPoster, DEFAULT_BASE);

  const title =
    text(firstByClass(html, "film-name")?.inner ?? "") ||
    text(firstByClass(html, "dynamic-name")?.inner ?? "") ||
    decodeEntities(anyAnchor[0].match(/title="([^"]+)"/)?.[1] ?? "") ||
    text(anyAnchor[0].replace(/<[^>]*>/g, " ")) ||
    titleFromSlug(id.replace(/-\d+$/, ""));

  const rateBadge = text(firstByClass(html, "tick-rate")?.inner ?? "") || undefined;
  const epsText = text(
    firstByClass(html, "tick-eps")?.inner ?? firstByClass(html, "tick-item")?.inner ?? "",
  );
  const subText = text(firstByClass(html, "tick-sub")?.inner ?? "");
  const dubText = text(firstByClass(html, "tick-dub")?.inner ?? "");

  const episodes = Number(epsText.replace(/[^\d]/g, "") || NaN);
  const sub = Number(subText.replace(/[^\d]/g, "") || NaN);
  const dub = Number(dubText.replace(/[^\d]/g, "") || NaN);

  const badge =
    rateBadge ||
    (Number.isFinite(sub) && Number.isFinite(dub)
      ? `SUB ${sub} · DUB ${dub}`
      : Number.isFinite(sub)
        ? `SUB ${sub}`
        : Number.isFinite(episodes)
          ? `${episodes} EP`
          : undefined);

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
