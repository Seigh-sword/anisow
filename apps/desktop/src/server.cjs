/**
 * The desktop app's own web server.
 *
 * The browser build needs something same-origin to read the catalogue and the
 * file hosts from, because neither sends CORS headers. In the browser that is
 * `apps/web/server/proxy.mjs`; on the desktop it is this.
 *
 * It is deliberately a separate file from `main.cjs` and has no Electron
 * imports at all, so it can be started, tested and reasoned about on its own.
 *
 * What it does:
 *   * serves the built SPA from `web/` with a client-route fallback;
 *   * `/api/ani/*`     → the catalogue;
 *   * `/api/anikoto/*` → the Anikoto JSON API;
 *   * `/api/zoko/*`    → the ZokoAnime JSON API;
 *   * `/api/mal/*`     → Jikan v4, for cast, seasons and trailers;
 *   * `/api/dl?src=`   → streams a file from an allow-listed host.
 *
 * The allow-list on `/dl` matters: without it the app would be an open relay.
 */

"use strict";

const { createServer } = require("node:http");
const { readFile, stat } = require("node:fs/promises");
const { extname, join, normalize, resolve, sep } = require("node:path");

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

/**
 * Hosts a download may come from.
 *
 * The catalogue serves its files from a handful of CDNs and rotates them, so
 * the list is by suffix rather than by exact host. Anything else is refused.
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
  ".avif": "image/avif",
  ".ico": "image/x-icon",
  ".woff2": "font/woff2",
  ".mp4": "video/mp4",
  ".webm": "video/webm",
  ".txt": "text/plain; charset=utf-8",
};

/** Whether a URL points at a host the app is allowed to download from. */
function allowedFileHost(url) {
  const host = url.hostname.toLowerCase();
  return FILE_HOSTS.some(
    (entry) => host === entry || host.endsWith(`.${entry}`) || host.includes(entry),
  );
}

/**
 * A tiny TTL cache.
 *
 * The Anikoto API allows sixty requests per two minutes and the Jikan API
 * asks for at most three per second, so anything repeated is worth holding
 * on to for a moment.
 */
function createCache(ttlMs) {
  const entries = new Map();
  return {
    get(key) {
      const hit = entries.get(key);
      if (!hit) return undefined;
      if (Date.now() - hit.time > ttlMs) {
        entries.delete(key);
        return undefined;
      }
      return hit.body;
    },
    set(key, body) {
      entries.set(key, { time: Date.now(), body });
      // Keep the map from growing without bound on a long session.
      if (entries.size > 500) {
        const oldest = [...entries.entries()].sort((a, b) => a[1].time - b[1].time);
        for (const [stale] of oldest.slice(0, 100)) entries.delete(stale);
      }
    },
  };
}

/**
 * Build the request handler.
 *
 * @param {object} options
 * @param {string} options.root      Directory holding the built SPA.
 * @param {string} options.catalogue  Catalogue base URL.
 * @param {string} options.anikoto   Anikoto base URL.
 * @param {string} options.zoko      ZokoAnime base URL.
 * @param {string} options.mal       Jikan base URL.
 */
function createHandler(options) {
  const root = resolve(options.root);
  const catalogue = options.catalogue ?? "https://aniwatchtv.ws";
  const anikoto = options.anikoto ?? "https://anikotoapi.site";
  const zoko = options.zoko ?? "https://zokoanime.video";
  const mal = options.mal ?? "https://api.jikan.moe/v4";

  const anikotoCache = createCache(120_000);
  const malCache = createCache(300_000);

  async function serveStatic(request, response) {
    const url = new URL(request.url ?? "/", "http://localhost");

    /**
     * Resolve the request to a path inside the bundle.
     *
     * `..` is stripped before the path is built, so a request can never climb
     * out of the bundle — not with a literal `..`, not percent-encoded, not
     * with a backslash. The resolved path is then checked against the root
     * as well, because `join` will happily walk upwards.
     */
    const decoded = decodeURIComponent(url.pathname);
    const segments = decoded
      .replace(/\\/g, "/")
      .split("/")
      .filter((segment) => segment !== "" && segment !== "." && segment !== "..");

    const requested = `/${segments.join("/")}`;

    let path = join(root, ...segments);

    // Belt and braces: the resolved path must still be inside the bundle.
    if (path !== root && !path.startsWith(root + sep)) {
      response.statusCode = 403;
      response.end("Forbidden");
      return;
    }

    let info = await stat(path).catch(() => null);
    if (info?.isDirectory()) {
      path = join(path, "index.html");
      info = await stat(path).catch(() => null);
    }

    if (!info) {
      // A path with an extension is a real file that is missing; anything else
      // is a client route, which the SPA answers.
      if (extname(requested)) {
        response.statusCode = 404;
        response.end("Not found");
        return;
      }
      path = join(root, "index.html");
      info = await stat(path).catch(() => null);
      if (!info) {
        response.statusCode = 404;
        response.end("The app was not built. Run: npm run build --workspace @anispots/web");
        return;
      }
    }

    const body = await readFile(path);
    response.statusCode = 200;
    response.setHeader("Content-Type", MIME[extname(path).toLowerCase()] ?? "application/octet-stream");
    response.setHeader(
      "Cache-Control",
      path.endsWith("index.html") ? "no-cache" : "public, max-age=31536000, immutable",
    );
    response.setHeader("Content-Length", body.byteLength);
    response.end(body);
  }

  /** Proxy a JSON or HTML upstream, with an optional cache. */
  async function proxyUpstream(request, response, config) {
    const url = new URL(request.url ?? "/", "http://localhost");
    const target = `${config.base}${url.pathname.replace(config.prefix, "")}${url.search}`;

    if (config.cache) {
      const hit = config.cache.get(target);
      if (hit !== undefined) {
        response.statusCode = 200;
        response.setHeader("Content-Type", config.contentType);
        response.setHeader("Cache-Control", `public, max-age=${Math.floor(config.ttlMs / 1000)}`);
        response.end(hit);
        return;
      }
    }

    try {
      const upstream = await fetch(target, {
        headers: {
          "User-Agent": UA,
          Accept: request.headers.accept ?? "*/*",
          Referer: `${config.base}/`,
          Origin: config.base,
        },
        redirect: "follow",
      });

      const body = await upstream.text();
      if (config.cache && upstream.ok) config.cache.set(target, body);

      response.statusCode = upstream.status;
      response.setHeader(
        "Content-Type",
        upstream.headers.get("content-type") ?? config.contentType,
      );
      if (config.cache) {
        response.setHeader("Cache-Control", `public, max-age=${Math.floor(config.ttlMs / 1000)}`);
      }
      response.end(body);
    } catch (cause) {
      response.statusCode = 502;
      response.setHeader("Content-Type", "application/json; charset=utf-8");
      response.end(
        JSON.stringify({
          ok: false,
          error: cause instanceof Error ? cause.message : "Upstream failed",
        }),
      );
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
        headers: { "User-Agent": UA, Referer: `${catalogue}/`, Accept: "*/*" },
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

  return (request, response) => {
    const path = (request.url ?? "/").split("?")[0];

    if (path === "/api/ani" || path.startsWith("/api/ani/")) {
      void proxyUpstream(request, response, {
        base: catalogue,
        prefix: "/api/ani",
        contentType: "text/html; charset=utf-8",
      });
      return;
    }

    if (path === "/api/anikoto" || path.startsWith("/api/anikoto/")) {
      void proxyUpstream(request, response, {
        base: anikoto,
        prefix: "/api/anikoto",
        contentType: "application/json; charset=utf-8",
        cache: anikotoCache,
        ttlMs: 120_000,
      });
      return;
    }

    if (path === "/api/zoko" || path.startsWith("/api/zoko/")) {
      void proxyUpstream(request, response, {
        base: zoko,
        prefix: "/api/zoko",
        contentType: "application/json; charset=utf-8",
      });
      return;
    }

    if (path === "/api/mal" || path.startsWith("/api/mal/")) {
      void proxyUpstream(request, response, {
        base: mal,
        prefix: "/api/mal",
        contentType: "application/json; charset=utf-8",
        cache: malCache,
        ttlMs: 300_000,
      });
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
  };
}

/**
 * Start the server.
 *
 * @param {object} options  See `createHandler`.
 * @param {number} options.port  0 asks the OS for a free port.
 * @param {string} options.host  Defaults to loopback: the app talks to itself.
 */
function startServer(options) {
  const handler = createHandler(options);
  const server = createServer(handler);

  return new Promise((resolvePromise, rejectPromise) => {
    server.once("error", rejectPromise);
    server.listen(options.port ?? 0, options.host ?? "127.0.0.1", () => {
      const address = server.address();
      const port = typeof address === "object" && address ? address.port : 0;

      // `unref` lets the process exit without the server, which is what a
      // test wants; the app itself quits explicitly.
      if (options.unref) server.unref();

      resolvePromise({
        server,
        port,
        url: `http://${options.host ?? "127.0.0.1"}:${port}`,
      });
    });
  });
}

module.exports = { createHandler, startServer, allowedFileHost, FILE_HOSTS, MIME };
