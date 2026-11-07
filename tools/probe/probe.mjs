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

function step(name, ok, detail) {
  report.steps.push({ name, ok, detail });
  const mark = ok ? "PASS" : "FAIL";
  console.log(`\n[${mark}] ${name}`);
  if (detail !== undefined) {
    console.log(typeof detail === "string" ? detail : JSON.stringify(detail, null, 2));
  }
}

function fatal(name, detail) {
  step(name, false, detail);
  report.verdict = `blocked at: ${name}`;
  finish(1);
}

function finish(code) {
  report.finishedAt = new Date().toISOString();
  writeFileSync("probe-result.json", JSON.stringify(report, null, 2));
  console.log("\n===== VERDICT =====");
  console.log(report.verdict);
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
  return found[0];
}

/** 2. Watch page: episode ids live here, in the episode link list. */
async function probeWatch(seed) {
  const candidates = [
    `${BASE}/watch/${seed.slug}${seed.ep ? `?ep=${seed.ep}` : ""}`,
    `${BASE}/watch/${seed.slug}`,
  ];

  let last = null;
  for (const url of candidates) {
    const res = await client.get(url);
    last = { url, status: res.status };
    if (res.status !== 200) continue;

    const $ = cheerio.load(res.data);
    const episodes = [];
    $('a[href*="?ep="]').each((_, el) => {
      const href = $(el).attr("href") || "";
      const m = href.match(/\?ep=(\d+)/);
      if (m && !episodes.includes(m[1])) episodes.push(m[1]);
    });

    if (episodes.length === 0) {
      last.detail = "no ?ep= links on the watch page";
      continue;
    }

    step("GET /watch", true, {
      url,
      status: res.status,
      htmlBytes: String(res.data).length,
      episodeCount: episodes.length,
      firstEpisodeIds: episodes.slice(0, 3),
    });
    return { url, episodeIds: episodes };
  }

  return fatal("GET /watch", last);
}

/**
 * 3. The AJAX route for servers. The path moved between site generations, so try
 *    the known shapes rather than assuming one.
 */
async function probeServers(episodeId) {
  const paths = [
    `/ajax/v2/episode/servers?episodeId=${episodeId}`,
    `/ajax/episode/servers?episodeId=${episodeId}`,
    `/api/v2/episode/servers?episodeId=${episodeId}`,
    `/ajax/v2/episode/servers/list?episodeId=${episodeId}`,
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
  const seed = await probeHome();
  const watch = await probeWatch(seed);
  const servers = await probeServers(watch.episodeIds[0]);
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
