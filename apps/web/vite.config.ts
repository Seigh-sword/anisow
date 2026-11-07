import { defineConfig, type Plugin } from "vite";
import react from "@vitejs/plugin-react";

/**
 * Two upstreams, because the app has two jobs.
 *
 *  * `/api/ani` → the catalogue. `aniwatchtv.ws` sends no CORS headers, so a page on
 *    another origin cannot read its responses. A proxy is the standard answer.
 *  * `/api/dl` → the file host. Same problem on downloads; this one also streams the
 *    body through untouched and passes the length back, which is what lets the
 *    download manager draw a real progress bar.
 *
 * `allowedHosts` and HMR are set so the sandbox preview host — a domain the dev
 * server cannot know in advance — is accepted.
 */

const CATALOGUE = "https://aniwatchtv.ws";

/**
 * A streaming proxy for the file host.
 *
 * Written as a plugin rather than `server.proxy` because the target is not fixed:
 * the source is a query parameter, and the URL has to be validated before it is
 * fetched (an open proxy on a deployed host would be a gift to anyone scanning).
 */
function downloadProxy(): Plugin {
  return {
    name: "anispots-download-proxy",
    configureServer(server) {
      server.middlewares.use("/api/dl", async (request, response) => {
        const url = new URL(request.url ?? "", "http://localhost");
        const source = url.searchParams.get("src");

        if (!source) {
          response.statusCode = 400;
          response.end("Missing src");
          return;
        }

        let target: URL;
        try {
          target = new URL(source);
        } catch {
          response.statusCode = 400;
          response.end("Bad src");
          return;
        }

        if (target.protocol !== "https:" && target.protocol !== "http:") {
          response.statusCode = 400;
          response.end("Bad protocol");
          return;
        }

        try {
          const upstream = await fetch(target, {
            headers: {
              Referer: `${CATALOGUE}/`,
              // Some CDNs check this and hand back a 403 without it.
              "User-Agent":
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36",
            },
          });

          response.statusCode = upstream.status;
          response.setHeader("Content-Type", upstream.headers.get("content-type") ?? "video/mp4");
          response.setHeader("Accept-Ranges", upstream.headers.get("accept-ranges") ?? "bytes");

          const length = upstream.headers.get("content-length");
          if (length) response.setHeader("Content-Length", length);

          // The download manager reads this to size the bar; without exposing it
          // the browser hides the header on a cross-origin response.
          response.setHeader("Access-Control-Expose-Headers", "Content-Length, Content-Range");

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
      });
    },
  };
}

export default defineConfig({
  plugins: [react(), downloadProxy()],
  server: {
    host: "0.0.0.0",
    port: 5173,
    strictPort: true,
    allowedHosts: true,
    proxy: {
      "/api/ani": {
        target: CATALOGUE,
        changeOrigin: true,
        secure: true,
        rewrite: (path) => path.replace(/^\/api\/ani/, ""),
        headers: {
          Referer: `${CATALOGUE}/`,
          Origin: CATALOGUE,
        },
      },
    },
  },
  preview: {
    host: "0.0.0.0",
    port: 4173,
    allowedHosts: true,
  },
});
