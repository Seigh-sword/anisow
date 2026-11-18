/**
 * The desktop app's web server, tested without Electron.
 *
 * The server is the part of the desktop app that can go wrong in a way the
 * user would notice — a blocked download, a directory traversal, a cache that
 * serves something stale. None of that needs a browser to check.
 */

"use strict";

const assert = require("node:assert/strict");
const { test } = require("node:test");
const { mkdtempSync, writeFileSync, mkdirSync, rmSync } = require("node:fs");
const { tmpdir } = require("node:os");
const { join } = require("node:path");
const { connect } = require("node:net");

const { createHandler, startServer, allowedFileHost } = require("./server.cjs");

/** A bundle directory with a page and a script in it. */
function makeBundle() {
  const root = mkdtempSync(join(tmpdir(), "anispots-desktop-"));
  writeFileSync(join(root, "index.html"), "<!doctype html><title>AniSpots</title>");
  mkdirSync(join(root, "assets"));
  writeFileSync(join(root, "assets", "app.js"), "console.log('hi');");
  return root;
}

test("the SPA is served and client routes fall back to it", async () => {
  const root = makeBundle();
  const { server, url } = await startServer({ root, host: "127.0.0.1" });

  try {
    const index = await fetch(`${url}/`);
    assert.equal(index.status, 200);
    assert.match(await index.text(), /AniSpots/);

    // A client route has no extension, so it must get the SPA, not a 404.
    const route = await fetch(`${url}/anime/demo-title-1`);
    assert.equal(route.status, 200);
    assert.match(await route.text(), /AniSpots/);

    // A missing file with an extension is a real 404.
    const missing = await fetch(`${url}/assets/nope.js`);
    assert.equal(missing.status, 404);
  } finally {
    server.close();
  }
});

test("hashed assets are served with the right type and cached", async () => {
  const root = makeBundle();
  const { server, url } = await startServer({ root, host: "127.0.0.1" });

  try {
    const asset = await fetch(`${url}/assets/app.js`);
    assert.equal(asset.status, 200);
    assert.match(asset.headers.get("content-type") ?? "", /javascript/);
    assert.match(asset.headers.get("cache-control") ?? "", /immutable/);

    const index = await fetch(`${url}/`);
    assert.match(index.headers.get("cache-control") ?? "", /no-cache/);
  } finally {
    server.close();
  }
});

test("a request cannot climb out of the bundle directory", async () => {
  const base = mkdtempSync(join(tmpdir(), "anispots-outer-"));
  const root = join(base, "bundle");
  mkdirSync(root);
  writeFileSync(join(root, "index.html"), "<!doctype html><title>AniSpots</title>");

  // A file just above the bundle, which must never be readable.
  const outside = join(base, "outside-secret.txt");
  writeFileSync(outside, "OUTSIDE SECRET");

  const { server, port } = await startServer({ root, host: "127.0.0.1" });

  /**
   * A raw HTTP request.
   *
   * `fetch` normalises `..` out of the URL before it goes on the wire, which
   * would hide the very thing this test is checking. The socket does not.
   */
  const raw = (path) =>
    new Promise((done) => {
      const socket = connect(port, "127.0.0.1", () => {
        socket.write(`GET ${path} HTTP/1.1\r\nHost: localhost\r\nConnection: close\r\n\r\n`);
      });
      let buffer = "";
      socket.on("data", (chunk) => {
        buffer += chunk;
      });
      socket.on("end", () => done(buffer));
    });

  try {
    for (const attempt of [
      "/../outside-secret.txt",
      "/%2e%2e/outside-secret.txt",
      "/..%2foutside-secret.txt",
      "/assets/../../outside-secret.txt",
      "/....//outside-secret.txt",
      "/../../../../etc/passwd",
    ]) {
      const response = await raw(attempt);
      assert.ok(
        !response.includes("OUTSIDE SECRET"),
        `${attempt} leaked a file outside the bundle`,
      );
      assert.ok(!response.includes("root:"), `${attempt} leaked the system passwd file`);
    }
  } finally {
    server.close();
    rmSync(base, { recursive: true, force: true });
  }
});

test("downloads are refused from hosts that are not file hosts", async () => {
  const root = makeBundle();
  const { server, url } = await startServer({ root, host: "127.0.0.1" });

  try {
    const evil = await fetch(`${url}/api/dl?src=${encodeURIComponent("http://169.254.169.254/latest/meta-data/")}`);
    assert.equal(evil.status, 403);

    const missing = await fetch(`${url}/api/dl`);
    assert.equal(missing.status, 400);

    const malformed = await fetch(`${url}/api/dl?src=not-a-url`);
    assert.equal(malformed.status, 400);
  } finally {
    server.close();
  }
});

test("only file hosts may be downloaded from", () => {
  assert.equal(allowedFileHost(new URL("https://aniwatchtv.ws/file.mp4")), true);
  assert.equal(allowedFileHost(new URL("https://cdn.megafiles.cc/file.mp4")), true);
  assert.equal(allowedFileHost(new URL("https://evil.example/file.mp4")), false);
  assert.equal(allowedFileHost(new URL("https://localhost/file.mp4")), false);
});

test("an upstream failure is reported as 502, not a crash", async () => {
  const root = makeBundle();
  // A port nothing is listening on, so the fetch fails immediately.
  const { server, url } = await startServer({
    root,
    host: "127.0.0.1",
    catalogue: "http://127.0.0.1:9",
  });

  try {
    const response = await fetch(`${url}/api/ani/home`);
    assert.equal(response.status, 502);
    const body = await response.json();
    assert.equal(body.ok, false);
    assert.ok(typeof body.error === "string");
  } finally {
    server.close();
  }
});

test("the handler can be used without a server, for tests", async () => {
  const root = makeBundle();
  const handler = createHandler({ root });

  const chunks = [];
  const response = {
    statusCode: 0,
    headers: {},
    setHeader(key, value) {
      this.headers[key] = value;
    },
    end(body) {
      if (body) chunks.push(body);
      this.done?.();
    },
    write(chunk) {
      chunks.push(chunk);
    },
  };

  await new Promise((done) => {
    response.done = done;
    handler({ url: "/", headers: {} }, response);
  });

  assert.equal(response.statusCode, 200);
  assert.match(String(chunks.join("")), /AniSpots/);
});
