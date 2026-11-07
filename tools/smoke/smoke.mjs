/**
 * The end-to-end smoke test.
 *
 * The development sandbox has no outbound sockets, so the only place the whole
 * chain can be exercised is CI. This script builds the app, starts its real
 * production server (`apps/web/server/proxy.mjs`), and then asks it the same
 * questions the UI asks: what is on the home page, can an anime resolve to an
 * episode, does that episode have a playable embed, and does the download
 * endpoint answer in the shape the parser expects.
 *
 * It is deliberately not a unit test: every path here crosses the network, the
 * proxy and the parsers together, which is exactly the combination that has
 * broken before.
 *
 * Usage: node tools/smoke/smoke.mjs [--port 4321]
 */

import { spawn } from "node:child_process";
import { existsSync } from "node:fs";
import { fileURLToPath } from "node:url";
import { dirname, resolve } from "node:path";

const here = dirname(fileURLToPath(import.meta.url));
const root = resolve(here, "../..");

const portIndex = process.argv.indexOf("--port");
const PORT = portIndex > -1 ? Number(process.argv[portIndex + 1]) : 4321;
const BASE = `http://127.0.0.1:${PORT}`;

const results = [];
let failures = 0;

/**
 * Emit each result as a GitHub annotation as well as to stdout.
 *
 * The job log is a blob download that some environments cannot reach, and the
 * annotations API is the one place the verdicts are always readable — both by a
 * reviewer on the PR and by anything checking the run afterwards.
 */
const IN_ACTIONS = process.env.GITHUB_ACTIONS === "true";

function check(name, condition, detail = "") {
  const ok = Boolean(condition);
  if (!ok) failures += 1;
  results.push({ name, ok, detail });

  const safe = String(detail).replace(/[\r\n]+/g, " ").slice(0, 600);
  console.log(`${ok ? "PASS" : "FAIL"}  ${name}${detail ? `  — ${detail}` : ""}`);

  if (IN_ACTIONS) {
    console.log(`${ok ? "::notice" : "::error"} title=${name}::${safe}`);
  }
}

async function get(path, init) {
  const response = await fetch(`${BASE}${path}`, { ...init, redirect: "follow" });
  return response;
}

async function json(path) {
  const response = await get(path);
  const text = await response.text();
  try {
    return { status: response.status, body: JSON.parse(text) };
  } catch {
    return { status: response.status, body: null, text };
  }
}

/** Poll until the server answers, so the script does not race the boot. */
async function waitForServer(timeoutMs = 20_000) {
  const started = Date.now();
  while (Date.now() - started < timeoutMs) {
    try {
      const response = await fetch(BASE, { signal: AbortSignal.timeout(1500) });
      if (response.ok) return true;
    } catch {
      // not up yet
    }
    await new Promise((done) => setTimeout(done, 400));
  }
  return false;
}

const dist = resolve(root, "apps/web/dist/index.html");
if (!existsSync(dist)) {
  console.error("No build found. Run: npm run build --workspace @anispots/web");
  process.exit(1);
}

const server = spawn(process.execPath, [resolve(root, "apps/web/server/proxy.mjs")], {
  env: { ...process.env, PORT: String(PORT), HOST: "127.0.0.1" },
  stdio: ["ignore", "pipe", "pipe"],
});

let serverLog = "";
server.stdout.on("data", (chunk) => {
  serverLog += String(chunk);
});
server.stderr.on("data", (chunk) => {
  serverLog += String(chunk);
});

const stop = () => {
  if (!server.killed) server.kill("SIGTERM");
};

try {
  const up = await waitForServer();
  check("server answers", up, up ? BASE : serverLog.slice(0, 400));
  if (!up) throw new Error("Server never came up");

  /* ------------------------------------------------------------- the app */

  const shell = await get("/");
  check("SPA shell is served", shell.status === 200 && (await shell.text()).includes('<div id="root">'));

  const route = await get("/anime/one-piece-100");
  check("a client route falls back to the shell", route.status === 200);

  /* ---------------------------------------------------------- catalogue */

  const home = await json("/api/ani/home");
  check("proxy reaches the catalogue", home.status === 200, `status ${home.status}`);

  // The proxy hands back the site's HTML; the same reader the app uses is not
  // bundled here, so this checks the shape the client depends on.
  const homeHtml = typeof home.body === "string" ? home.body : home.text ?? "";
  check("home page is HTML", homeHtml.includes("<title"), `${homeHtml.length} bytes`);
  check("home page has poster links", /href="[^"]*\/watch\/[a-z0-9-]+-\d+/.test(homeHtml));
  check("home page declares its API root", homeHtml.includes("hianime_ep_ajax"));

  /* --------------------------------------------------------- chain walk */

  const slug = homeHtml.match(/href="[^"]*\/watch\/([a-z0-9-]+-\d+)"/)?.[1];
  check("a slug can be read off the home page", Boolean(slug), slug ?? "none");

  if (slug) {
    const watch = await get(`/api/ani/watch/${slug}`);
    const watchHtml = await watch.text();
    check("watch page resolves", watch.status === 200, `${watchHtml.length} bytes`);

    const episodeId = watchHtml.match(/data-id="(\d+)"/)?.[1] ?? watchHtml.match(/\?ep=(\d+)/)?.[1];
    check("an episode id is on the watch page", Boolean(episodeId), episodeId ?? "none");

    if (episodeId) {
      const servers = await json(`/api/ani/api/theme/episode/servers?episodeId=${episodeId}`);
      check(
        "servers endpoint answers with {status, html}",
        servers.body && typeof servers.body === "object" && "status" in servers.body,
        `status ${servers.status}`,
      );

      const fragment = servers.body?.html ?? "";
      const hash = fragment.match(/data-hash="([^"]+)"/)?.[1];
      check("servers fragment carries a data-hash", Boolean(hash));

      if (hash) {
        const decoded = Buffer.from(hash, "base64").toString("utf8");
        check("the hash decodes to a player URL", /^https?:\/\//.test(decoded), decoded);
        check("the player URL is a known host", /zokoanime\.video|megaplay\.buzz/.test(decoded), decoded);
      }

      const list = await json(`/api/ani/api/theme/episode/list/${slug.replace(/^.*-(\d+)$/, "$1")}`);
      check(
        "episode list answers with {status, totalItems}",
        list.body && typeof list.body === "object" && "totalItems" in list.body,
        `totalItems=${list.body?.totalItems ?? "?"}`,
      );

      const downloads = await json(`/api/ani/api/theme/episode/downloads?episodeId=${episodeId}`);
      const downloadsBody = downloads.body;
      // `{status:false}` is a legitimate answer: the site gates this feature.
      check(
        "downloads endpoint answers (even if the feature is gated)",
        downloadsBody && typeof downloadsBody === "object" && "status" in downloadsBody,
        `status=${downloadsBody?.status}`,
      );
    }
  }

  /* ------------------------------------------------------------ genres & filter */

  // `/genre/{slug}` is a 404 on this deployment; `/genres/{slug}` is the route.
  const genrePage = await get("/api/ani/genres/action");
  const genreHtml = await genrePage.text();
  const genreCards = [...genreHtml.matchAll(/\/watch\/[a-z0-9-]+-\d+/g)].length;
  check("the genre route answers", genrePage.status === 200, `status ${genrePage.status}`);
  check("the genre route lists titles", genreCards > 5, `${genreCards} watch links`);

  const filterPage = await get("/api/ani/filter?type=tv&status=completed&genre%5B%5D=action&sort=avg_score");
  const filterHtml = await filterPage.text();
  const filterCards = [...filterHtml.matchAll(/\/watch\/[a-z0-9-]+-\d+/g)].length;
  check("the multi-filter route answers with titles", filterPage.status === 200 && filterCards > 5, `${filterCards} watch links`);

  const oldRoute = await get("/api/ani/genre/action");
  check("the old singular route is still a 404 (documented, not assumed)", oldRoute.status === 404, `status ${oldRoute.status}`);

  /* ------------------------------------------------------------ anikoto api */

  const anikotoRecent = await json("/api/anikoto/recent-anime?page=1&per_page=5");
  check(
    "anikoto proxy reaches recent-anime",
    anikotoRecent.status === 200 && Boolean(anikotoRecent.body?.ok),
    `status ${anikotoRecent.status}, items=${anikotoRecent.body?.data?.length ?? 0}`,
  );

  /* ------------------------------------------------------------ the file proxy */

  const blocked = await get("/api/dl?src=http://169.254.169.254/latest/meta-data/");
  check("the file proxy refuses a non-file host", blocked.status === 403, `status ${blocked.status}`);

  const missing = await get("/api/dl");
  check("the file proxy rejects a missing src", missing.status === 400);
} catch (cause) {
  check("smoke run completed", false, cause instanceof Error ? cause.message : String(cause));
} finally {
  stop();
}

console.log(`\n${results.length - failures}/${results.length} checks passed`);
if (serverLog && failures > 0) {
  console.log("\n--- server log ---\n" + serverLog.slice(-2000));
}
process.exit(failures > 0 ? 1 : 0);
