/**
 * The production host.
 *
 * `vite preview` cannot answer `/ani` or `/dl` for the reason the app has two
 * upstreams at all: the catalogue and the file host send no CORS headers, so the
 * browser can only read them through something same-origin. Deploying this app
 * therefore means deploying one small process, not "the SPA plus an nginx
 * snippet the reader has to invent".
 *
 * What it does:
 *   * serves `dist/` with SPA fallback (every route is a client route);
 *   * `/api/ani/*` → the catalogue, with the Referer the site expects;
 *   * `/api/dl?src=` → streams a file with its length intact, so downloads can show
 *     real progress, and only from hosts that are actually file hosts.
 *
 * The allow-list on `/dl` is the important part: an open relay would let anyone
 * use the deployment as an anonymous proxy.
 */

import { createServer } from "node:http";
import { readFile, stat } from "node:fs/promises";
import { extname, join, normalize, resolve } from "node:path";
import { fileURLToPath } from "node:url";

const ROOT = resolve(fileURLToPath(new URL("../dist", import.meta.url)));
const CATALOGUE = process.env.ANI_BASE ?? "https://aniwatchtv.ws";
const ANIKOTO = process.env.ANIKOTO_BASE ?? "https://anikotoapi.site";
const ZOKO = process.env.ZOKO_BASE ?? "https://zokoanime.video";
const PORT = Number(process.env.PORT ?? 4173);
const HOST = process.env.HOST ?? "0.0.0.0";

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

/**
 * Hosts a download may come from.
 *
 * The catalogue serves its files from a handful of CDNs and rotates them, so the
 * list is by suffix rather than exact host. Anything else is refused.
 */
const FILE_HOSTS = [
  "aniwatchtv.ws",
  "megafiles.cc",
  "mega.nz",
  "dood.",
  "streamtape.",
  "kiwi",
  "gofile.io",
  "pixeldrain.com",
  "buzzheavier.com",
  "filemoon.",
  "mp4upload.com",
  "zokoanime.video",
  "megaplay.buzz",
  "nekostream.site",
  "anipixcdn.co",
];

const MIME = {
  ".html": "text/html; charset=utf-8",
  ".js": "text/javascript; charset=utf-8",
  ".mjs": "text/javascript; charset=utf-8",
  ".css": "text/css; charset=utf-8",
  ".json": "application/json; charset=utf-8",
  ".svg": "image/svg+xml",
  ".png": "image/png",
  ".jpg": "image/jpeg",
  ".jpeg": "image/jpeg",
  ".webp": "image/webp",
  ".ico": "image/x-icon",
  ".woff2": "font/woff2",
  ".mp4": "video/mp4",
  ".webm": "video/webm",
  ".txt": "text/plain; charset=utf-8",
};

const allowedFileHost = (url) => {
  const host = url.hostname.toLowerCase();
  return FILE_HOSTS.some((entry) => host === entry || host.endsWith(`.${entry}`) || host.includes(entry));
};

async function serveStatic(request, response) {
  const url = new URL(request.url ?? "/", "http://localhost");
  const requested = normalize(decodeURIComponent(url.pathname)).replace(/^(\.\.[/\\])+/, "");
  let path = join(ROOT, requested);

  // Directory → index.html, then SPA fallback for anything without an extension.
  let info = await stat(path).catch(() => null);
  if (info?.isDirectory()) {
    path = join(path, "index.html");
    info = await stat(path).catch(() => null);
  }

  if (!info) {
    if (extname(requested)) {
      response.statusCode = 404;
      response.end("Not found");
      return;
    }
    path = join(ROOT, "index.html");
    info = await stat(path).catch(() => null);
    if (!info) {
      response.statusCode = 404;
      response.end("Build the app first: npm run build --workspace @anispots/web");
      return;
    }
  }

  const body = await readFile(path);
  const type = MIME[extname(path).toLowerCase()] ?? "application/octet-stream";

  response.setHeader("Content-Type", type);
  // Hashed assets are immutable; HTML must never be cached or a deploy is invisible.
  response.setHeader(
    "Cache-Control",
    path.endsWith("index.html") ? "no-cache" : "public, max-age=31536000, immutable",
  );
  response.setHeader("Content-Length", body.byteLength);
  response.end(body);
}

async function proxyCatalogue(request, response) {
  const url = new URL(request.url ?? "/", "http://localhost");
  const target = `${CATALOGUE}${url.pathname.replace(/^\/api\/ani/, "")}${url.search}`;

  try {
    const upstream = await fetch(target, {
      headers: {
        "User-Agent": UA,
        Accept: request.headers.accept ?? "*/*",
        Referer: `${CATALOGUE}/`,
        Origin: CATALOGUE,
      },
      redirect: "follow",
    });

    const body = await upstream.text();
    response.statusCode = upstream.status;
    response.setHeader("Content-Type", upstream.headers.get("content-type") ?? "text/html; charset=utf-8");
    response.setHeader("Cache-Control", "public, max-age=120");
    response.end(body);
  } catch (cause) {
    response.statusCode = 502;
    response.setHeader("Content-Type", "application/json; charset=utf-8");
    response.end(JSON.stringify({ ok: false, error: cause instanceof Error ? cause.message : "Upstream failed" }));
  }
}

async function proxyDownload(request, response) {
  const url = new URL(request.url ?? "/", "http://localhost");
  const source = url.searchParams.get("src");

  if (!source) {
    response.statusCode = 400;
    response.end("Missing src");
    return;
  }

  let target;
  try {
    target = new URL(source);
  } catch {
    response.statusCode = 400;
    response.end("Bad src");
    return;
  }

  if (!/^https?:$/.test(target.protocol) || !allowedFileHost(target)) {
    response.statusCode = 403;
    response.end("That host is not a file host");
    return;
  }

  try {
    const upstream = await fetch(target, {
      headers: { "User-Agent": UA, Referer: `${CATALOGUE}/`, Accept: "*/*" },
    });

    response.statusCode = upstream.status;
    response.setHeader("Content-Type", upstream.headers.get("content-type") ?? "video/mp4");
    response.setHeader("Accept-Ranges", upstream.headers.get("accept-ranges") ?? "bytes");
    response.setHeader("Access-Control-Expose-Headers", "Content-Length, Content-Range");

    const length = upstream.headers.get("content-length");
    if (length) response.setHeader("Content-Length", length);

    if (!upstream.body) {
      response.end();
      return;
    }

    const reader = upstream.body.getReader();
    for (;;) {
      const { done, value } = await reader.read();
      if (done) break;
      if (value) response.write(Buffer.from(value));
    }
    response.end();
  } catch (cause) {
    response.statusCode = 502;
    response.end(cause instanceof Error ? cause.message : "Upstream failed");
  }
}

/**
 * In-memory cache for Anikoto API responses (120 seconds TTL) so the backend
 * respects the 60 requests / 120s rate limit and never exposes the user to 429s.
 */
const anikotoCache = new Map();

async function proxyAnikoto(request, response) {
  const url = new URL(request.url ?? "/", "http://localhost");
  const target = `${ANIKOTO}${url.pathname.replace(/^\/api\/anikoto/, "")}${url.search}`;

  const cached = anikotoCache.get(target);
  if (cached && Date.now() - cached.time < 120_000) {
    response.statusCode = 200;
    response.setHeader("Content-Type", "application/json; charset=utf-8");
    response.setHeader("Cache-Control", "public, max-age=120");
    response.end(cached.body);
    return;
  }

  try {
    const upstream = await fetch(target, {
      headers: {
        "User-Agent": UA,
        Accept: "application/json",
        Referer: `${ANIKOTO}/`,
      },
      redirect: "follow",
    });

    const body = await upstream.text();
    if (upstream.ok) {
      anikotoCache.set(target, { time: Date.now(), body });
    }
    response.statusCode = upstream.status;
    response.setHeader("Content-Type", upstream.headers.get("content-type") ?? "application/json; charset=utf-8");
    response.setHeader("Cache-Control", "public, max-age=120");
    response.end(body);
  } catch (cause) {
    response.statusCode = 502;
    response.setHeader("Content-Type", "application/json; charset=utf-8");
    response.end(JSON.stringify({ ok: false, error: cause instanceof Error ? cause.message : "Anikoto upstream failed" }));
  }
}

async function proxyZoko(request, response) {
  const url = new URL(request.url ?? "/", "http://localhost");
  const target = `${ZOKO}${url.pathname.replace(/^\/api\/zoko/, "")}${url.search}`;

  try {
    const upstream = await fetch(target, {
      headers: {
        "User-Agent": UA,
        Accept: "application/json",
        Referer: `${ZOKO}/`,
      },
      redirect: "follow",
    });

    const body = await upstream.text();
    response.statusCode = upstream.status;
    response.setHeader("Content-Type", upstream.headers.get("content-type") ?? "application/json; charset=utf-8");
    response.end(body);
  } catch (cause) {
    response.statusCode = 502;
    response.setHeader("Content-Type", "application/json; charset=utf-8");
    response.end(JSON.stringify({ ok: false, error: cause instanceof Error ? cause.message : "Zoko upstream failed" }));
  }
}

createServer((request, response) => {
  const path = (request.url ?? "/").split("?")[0];

  if (path === "/api/ani" || path.startsWith("/api/ani/")) {
    void proxyCatalogue(request, response);
    return;
  }

  if (path === "/api/anikoto" || path.startsWith("/api/anikoto/")) {
    void proxyAnikoto(request, response);
    return;
  }

  if (path === "/api/zoko" || path.startsWith("/api/zoko/")) {
    void proxyZoko(request, response);
    return;
  }

  if (path === "/api/dl" || path.startsWith("/api/dl/")) {
    void proxyDownload(request, response);
    return;
  }

  void serveStatic(request, response).catch((cause) => {
    response.statusCode = 500;
    response.end(cause instanceof Error ? cause.message : "Server error");
  });
}).listen(PORT, HOST, () => {
  console.log(`AniSpots on http://${HOST}:${PORT}`);
  console.log(`  catalogue ${CATALOGUE}`);
});
