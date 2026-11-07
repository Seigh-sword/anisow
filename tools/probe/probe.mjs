/**
 * Probe: does the aniwatchtv.ws stack resolve to a playable .m3u8?
 *
 * The development sandbox has no direct outbound network (HTTPS page fetching
 * only, no POST, no custom Referer), so the stream chain cannot be executed
 * there. GitHub Actions can. This script asks the questions in order and stops
 * at the first one that fails, so the run log says exactly where the pipe breaks.
 *
 * It is a diagnostic, not part of the app. It writes probe-result.json, which the
 * workflow uploads as an artifact and prints to the job summary.
 */

import axios from "axios";
import * as cheerio from "cheerio";
import { writeFileSync } from "node:fs";

const BASE = process.env.ANIWATCH_BASE || "https://aniwatchtv.ws";
const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

const report = {
  base: BASE,
  startedAt: new Date().toISOString(),
  steps: [],
  verdict: "unknown",
};

/**
 * Findings are echoed as workflow annotations. Raw logs and artifacts are not
 * always reachable over the API, but annotations are, so that is the channel.
 */
function announce(text) {
  const flat = String(text).replace(/\r?\n/g, " ");
  for (let i = 0; i < flat.length; i += 900) {
    // eslint-disable-next-line no-console
    console.log(`::warning::PROBE ${flat.slice(i, i + 900)}`);
  }
}

function step(name, ok, detail) {
  report.steps.push({ name, ok, detail });
  const mark = ok ? "PASS" : "FAIL";
  console.log(`\n[${mark}] ${name}`);
  if (detail !== undefined) {
    console.log(typeof detail === "string" ? detail : JSON.stringify(detail, null, 2));
    announce(`${mark} ${name}: ${JSON.stringify(detail)}`);
  } else {
    announce(`${mark} ${name}`);
  }
}

function fatal(name, detail) {
  step(name, false, detail);
  announce(`VERDICT blocked at ${name}`);
  report.verdict = `blocked at: ${name}`;
  finish(1);
}

function finish(code) {
  report.finishedAt = new Date().toISOString();
  writeFileSync("probe-result.json", JSON.stringify(report, null, 2));
  console.log("\n===== VERDICT =====");
  console.log(report.verdict);
  announce(`FINAL ${report.verdict}`);
  process.exit(code);
}

const client = axios.create({
  timeout: 30000,
  headers: {
    "User-Agent": UA,
    Accept: "text/html,application/json;q=0.9,*/*;q=0.8",
    "Accept-Language": "en-US,en;q=0.9",
  },
  maxRedirects: 5,
  validateStatus: () => true,
});

/** 1. Home page, then keep one anime id to work with. */
async function probeHome() {
  const res = await client.get(`${BASE}/home`);
  if (res.status !== 200) {
    return fatal("GET /home", `HTTP ${res.status} after ${res.request?.res?.responseUrl || ""}`);
  }

  const $ = cheerio.load(res.data);
  const links = new Set();
  $('a[href^="/watch/"], a[href*="aniwatchtv"]').each((_, el) => {
    const href = $(el).attr("href");
    if (!href) return;
    const m = href.match(/\/(?:watch\/)?([a-z0-9-]+-\d+)(?:\?ep=(\d+))?/i);
    if (m) links.add(JSON.stringify({ slug: m[1], ep: m[2] || null }));
  });

  const found = [...links].map((l) => JSON.parse(l));
  if (found.length === 0) {
    return fatal("GET /home parsed", "no anime links found in HTML");
  }

  step("GET /home", true, {
    status: res.status,
    htmlBytes: String(res.data).length,
    sample: found.slice(0, 3),
  });
  return found;
}

/**
 * 2. Watch page: episode ids live in the episode link list here.
 *
 * Not every anime on the home page has episodes yet (upcoming titles and fresh
 * premieres have none), so several seeds are tried. The link shape is also
 * sampled, because "no ?ep=" can mean "wrong page" just as easily as "no
 * episodes", and the sample is what tells them apart.
 */
async function probeWatch(seeds) {
  const attempts = [];

  for (const seed of seeds.slice(0, 6)) {
    const url = `${BASE}/watch/${seed.slug}${seed.ep ? `?ep=${seed.ep}` : ""}`;
    const res = await client.get(url);
    if (res.status !== 200) {
      attempts.push({ url, status: res.status });
      continue;
    }

    const html = String(res.data);
    const $ = cheerio.load(html);

    const episodeIds = [];
    const watchHrefs = [];
    $("a[href]").each((_, el) => {
      const href = $(el).attr("href") || "";
      if (!href.includes("/watch/") && !href.includes("?ep=")) return;
      if (watchHrefs.length < 8) watchHrefs.push(href);
      const m = href.match(/[?&]ep=(\d+)/);
      if (m && !episodeIds.includes(m[1])) episodeIds.push(m[1]);
    });

    // Some builds put the id in a data attribute on the list rather than a link.
    if (episodeIds.length === 0) {
      $("[data-id], [data-episode-id], [data-number]").each((_, el) => {
        const id = $(el).attr("data-episode-id") || $(el).attr("data-id");
        if (id && /^\d+$/.test(id) && !episodeIds.includes(id)) episodeIds.push(id);
      });
    }

    if (episodeIds.length === 0) {
      attempts.push({ url, status: res.status, episodeIds: 0, watchHrefs });
      continue;
    }

    step("GET /watch", true, {
      url,
      status: res.status,
      htmlBytes: html.length,
      episodeCount: episodeIds.length,
      firstEpisodeIds: episodeIds.slice(0, 3),
      linkShape: watchHrefs.slice(0, 3),
    });
    return { url, episodeIds };
  }

  return fatal("GET /watch", { attempts });
}

/**
 * 2b. Discovery: this deployment is not the old hianime codebase (its /ajax
 *     routes 404), so the route names have to come from the page itself. Every
 *     candidate is reported rather than assumed.
 */
async function probeDiscovery(watch) {
  const res = await client.get(watch.url);
  const html = String(res.data);

  const take = (re, limit = 6) => {
    const out = new Set();
    for (const m of html.matchAll(re)) {
      out.add(m[0].replace(/&amp;/g, "&"));
      if (out.size >= limit) break;
    }
    return [...out];
  };

  const detail = {
    apiPaths: take(/(?:href|src|url|action)="(\/[a-z0-9/_-]*api[a-z0-9/_.-]*)"/gi),
    episodePaths: take(/"(\/[a-z0-9/_-]*episode[a-z0-9/_.-]*)"/gi),
    playerHosts: take(/https?:\/\/[a-z0-9.-]*(?:megaplay|megacloud|rabbitstream|vidsrc|t-cloud)[a-z0-9./?=&_-]*/gi),
    scriptSrcs: take(/<script[^>]+src="([^"]+)"/gi).map((x) => x.replace(/^<script[^>]+src="/, "").replace(/"$/, "")),
    dataAttrs: take(/data-(?:episode-id|id|server-id|slug|anime-id)="[^"]*"/gi),
    hasNuxt: /__NUXT__/.test(html),
    hasNextData: /__NEXT_DATA__/.test(html),
    hasLivewire: /livewire/.test(html),
    globalConfig: take(/(?:window\.\w+|const\s+\w*config\w*)\s*=\s*\{[\s\S]{0,600}?\};/gi, 6),
  };

  step("discover routes", true, detail);

  // The player host is the useful lead: try it straight away if it is on the page.
  const host = detail.playerHosts[0];
  if (host) {
    const origin = host.match(/^https?:\/\/[a-z0-9.-]+/i)?.[0];
    if (origin) {
      const r = await client.get(origin, { headers: { Referer: watch.url } });
      step("GET player origin", true, {
        origin,
        status: r.status,
        bytes: String(r.data).length,
        head: String(r.data).slice(0, 200),
      });
    }
  }

  return detail;
}

/**
 * 2c. The routes this deployment actually uses.
 *
 * The watch page declares them in `window.hianime_ajax` / `hianime_ep_ajax`,
 * which is the only reliable source: this is not the old hianime codebase and
 * every /ajax/ path 404s.
 */
async function probeDeclaredRoutes(watch) {
  const res = await client.get(watch.url);
  const html = String(res.data);

  const blocks = {};
  for (const name of ["hianime_ajax", "hianime_ep_ajax"]) {
    const m = html.match(new RegExp(`window\\.${name}\\s*=\\s*\\{[\\s\\S]*?\\};`));
    if (!m) continue;
    blocks[name] = m[0];
    const urls = [...m[0].matchAll(/'([^']*\/api\/[^']*)'/g)].map((x) => x[1]);
    blocks[name + "_urls"] = [...new Set(urls)];
  }

  step("declared route config", true, blocks);
  return blocks;
}

/**
 * 3. The AJAX route for servers. The path moved between site generations, so try
 *    the known shapes rather than assuming one.
 */
async function probeServers(episodeId, declared = {}) {
  // Declared first: the page knows its own route names, the older guesses did not.
  const declaredAjax = declared.hianime_ajax_urls?.find((u) => u.includes("ajax"));
  const declaredRest = declared.hianime_ajax_urls?.find((u) => u.includes("rest"));
  const epRest = declared.hianime_ep_ajax_urls?.find((u) => u.includes("ajax") || u.includes("rest"));

  const paths = [
    ...(epRest ? [`${epRest.replace(/\/$/, "")}`] : []),
    ...(declaredAjax ? [`${declaredAjax}?action=servers&episodeId=${episodeId}`] : []),
    ...(declaredRest ? [`${declaredRest.replace(/\/$/, "")}/servers?episodeId=${episodeId}`] : []),
    `/ajax/v2/episode/servers?episodeId=${episodeId}`,
    `/ajax/episode/servers?episodeId=${episodeId}`,
  ];

  const attempts = [];
  for (const path of paths) {
    const res = await client.get(`${BASE}${path}`, {
      headers: { "X-Requested-With": "XMLHttpRequest", Referer: `${BASE}/home` },
    });
    const body = typeof res.data === "string" ? res.data : JSON.stringify(res.data);
    attempts.push({ path, status: res.status, bytes: body.length, head: body.slice(0, 120) });

    if (res.status === 200 && body.includes("server-item")) {
      const $ = cheerio.load(body);
      const servers = [];
      $(".server-item").each((_, el) => {
        servers.push({
          name: $(el).find("a").text().trim().toLowerCase(),
          serverId: $(el).attr("data-server-id")?.trim(),
          srcId: $(el).attr("data-id")?.trim(),
          type: $(el).attr("data-type")?.trim(),
        });
      });
      step("GET episode servers", true, { path, status: res.status, servers });
      return servers;
    }
  }

  return fatal("GET episode servers", { attempts });
}

/** 4. Server -> embed URL (this is the MegaCloud/MegaPlay hop). */
async function probeSources(server) {
  const paths = [
    `/ajax/v2/episode/sources?id=${server.srcId}`,
    `/ajax/episode/sources?id=${server.srcId}`,
    `/ajax/v2/episode/sources?episodeId=${server.srcId}`,
  ];

  const attempts = [];
  for (const path of paths) {
    const res = await client.get(`${BASE}${path}`, {
      headers: { "X-Requested-With": "XMLHttpRequest", Referer: `${BASE}/home` },
    });
    const body = typeof res.data === "string" ? res.data : JSON.stringify(res.data);
    attempts.push({ path, status: res.status, bytes: body.length, head: body.slice(0, 200) });

    if (res.status === 200 && body.includes("link")) {
      let json = null;
      try {
        json = JSON.parse(body);
      } catch {
        /* embed pages are not JSON; report as-is */
      }
      step("GET episode sources", true, { path, status: res.status, body: json ?? body.slice(0, 400) });
      return json;
    }
  }

  return fatal("GET episode sources", { attempts, server });
}

/**
 * 5. If we got an embed URL, fetch it and look for what the player would need:
 *    an m3u8, or the packed js that carries it.
 */
async function probeEmbed(sources) {
  const embed = sources?.link || sources?.url || sources?.embed;
  if (!embed) {
    return fatal("embed url present", { sources });
  }

  const res = await client.get(embed, {
    headers: {
      "User-Agent": UA,
      Referer: `${BASE}/`,
      Origin: BASE,
      Accept: "*/*",
    },
  });

  const body = typeof res.data === "string" ? res.data : JSON.stringify(res.data);
  const m3u8 = body.match(/https?:\/\/[^"'\s\\]+\.m3u8[^"'\s\\]*/i);

  step("GET embed", true, {
    embed,
    status: res.status,
    bytes: body.length,
    directM3u8: m3u8 ? m3u8[0] : null,
    hasPackedJs: /eval\(function\(p,a,c,k,e,[dr]/.test(body),
    head: body.slice(0, 300),
  });

  if (m3u8) {
    const playlist = await client.get(m3u8[0], { headers: { Referer: embed, "User-Agent": UA } });
    const text = typeof playlist.data === "string" ? playlist.data : "";
    step("GET m3u8", playlist.status === 200, {
      status: playlist.status,
      isPlaylist: text.includes("#EXTM3U"),
      variants: (text.match(/\.m3u8/g) || []).length,
      head: text.slice(0, 240),
    });
    return m3u8[0];
  }

  return fatal("m3u8 in embed html", {
    hint: "embed needs js unpacking or a second api hop; see head above",
  });
}

try {
  step("dns + tls reach", true, BASE);
  const seeds = await probeHome();

  // A known-good fallback keeps a bad home-page sample from stopping the probe.
  const fallback = [{ slug: "primal-9050", ep: null }];
  const watch = await probeWatch([...seeds, ...fallback]);
  await probeDiscovery(watch);
  const declared = await probeDeclaredRoutes(watch);
  const servers = await probeServers(watch.episodeIds[0], declared);
  const chosen = servers.find((s) => s.type !== "dub") || servers[0];
  const sources = await probeSources(chosen);
  await probeEmbed(sources);

  report.verdict = "stream resolved";
  finish(0);
} catch (e) {
  report.verdict = `threw: ${e.message}`;
  step("unexpected", false, e.stack?.split("\n").slice(0, 4).join("\n"));
  finish(1);
}
