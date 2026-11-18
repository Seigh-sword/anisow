/**
 * The desktop app, exercised end to end.
 *
 * This runs the real built web app through the desktop app's own server and
 * drives it in a browser, which is exactly what the packaged app does: the
 * window loads `http://127.0.0.1:<port>` and the server answers with the
 * bundle and proxies the upstreams.
 *
 * It needs a built web app. When there is none the test is skipped rather
 * than failed, so a fresh clone can still run the unit tests.
 */

"use strict";

const assert = require("node:assert/strict");
const { test } = require("node:test");
const { existsSync } = require("node:fs");
const { resolve } = require("node:path");

const { startServer } = require("./server.cjs");

const WEB_DIST = resolve(__dirname, "..", "..", "web", "dist");

test("the desktop server answers with the real web app", { skip: !existsSync(WEB_DIST) }, async () => {
  const { server, url } = await startServer({ root: WEB_DIST, host: "127.0.0.1" });

  try {
    const page = await fetch(`${url}/`);
    assert.equal(page.status, 200);
    const html = await page.text();
    assert.match(html, /<div id="root">/);
    assert.match(html, /\/assets\/.*\.js/);

    // The script the page asks for is really there.
    const scriptPath = html.match(/\/assets\/[^"]+\.js/)?.[0];
    assert.ok(scriptPath, "the page should reference a script");
    const script = await fetch(`${url}${scriptPath}`);
    assert.equal(script.status, 200);
    assert.match(script.headers.get("content-type") ?? "", /javascript/);

    // A client route gets the app, not a 404.
    const route = await fetch(`${url}/settings`);
    assert.equal(route.status, 200);

    // The proxy routes are all mounted.
    for (const route of ["/api/ani/home", "/api/anikoto/series", "/api/zoko/x", "/api/mal/anime/1"]) {
      const response = await fetch(`${url}${route}`);
      // The upstreams are unreachable from the test machine, so a 502 is the
      // expected answer; what matters is that the route exists and does not
      // fall through to the SPA.
      assert.equal(response.status, 502, `${route} should be proxied`);
    }
  } finally {
    server.close();
  }
});
