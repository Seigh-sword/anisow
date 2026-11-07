/**
 * Tests against fragments captured from the live site.
 *
 * The recorded `data-hash` below is the one the probe decoded in CI:
 *   aHR0cHM6Ly96b2tvYW5pbWUudmlkZW8vc3RyZWFtL21hbC82MzgxOC8xL3N1Yg==
 *     -> https://zokoanime.video/stream/mal/63818/1/sub
 * Keeping it here means the parser is pinned to something that actually worked.
 */

import assert from "node:assert/strict";
import { test } from "node:test";

import {
  decodeEmbedHash,
  parseDownloads,
  parseEpisodes,
  parseServers,
  readFragment,
} from "./fragments.ts";
import { animeIdFromHref, firstImage, text } from "./html.ts";

// Captured verbatim from /api/theme/episode/servers?episodeId=136407
const SERVERS_HTML = `
    <div class="ps_-block">
        <div class="server-item" data-type="sub" data-id="136407"
             data-hash="aHR0cHM6Ly96b2tvYW5pbWUudmlkZW8vc3RyZWFtL21hbC82MzgxOC8xL3N1Yg=="
             data-server-name="ZokoAnime">
            <a class="btn" href="javascript:;">ZokoAnime</a>
        </div>
    </div>
`;

test("servers: decodes data-hash into the embed URL", () => {
  const servers = parseServers(readFragment({ status: true, html: SERVERS_HTML }));

  assert.equal(servers.length, 1);
  assert.equal(servers[0]!.name, "ZokoAnime");
  assert.equal(servers[0]!.audio, "sub");
  assert.equal(servers[0]!.embedUrl, "https://zokoanime.video/stream/mal/63818/1/sub");
});

test("servers: a dub block keeps its audio type", () => {
  const html = `<div class="server-item" data-type="dub" data-server-name="MegaPlay"
      data-hash="aHR0cHM6Ly9tZWdhcGxheS5idXp6L2VtYmVkL2FiYw=="><a>MegaPlay</a></div>`;
  const [server] = parseServers(readFragment({ status: true, html }));

  assert.equal(server!.audio, "dub");
  assert.equal(server!.embedUrl, "https://megaplay.buzz/embed/abc");
});

test("servers: an empty fragment is empty, not a crash", () => {
  assert.deepEqual(parseServers(readFragment({ status: false, html: "" })), []);
});

test("servers: markup without a hash is skipped rather than guessed", () => {
  const html = `<div class="server-item" data-type="sub"><a>Broken</a></div>`;
  assert.deepEqual(parseServers(readFragment({ status: true, html })), []);
});

test("decodeEmbedHash rejects non-URL payloads", () => {
  assert.equal(decodeEmbedHash(Buffer.from("not a url").toString("base64")), null);
  assert.equal(decodeEmbedHash("!!!not base64!!!"), null);
});

// Captured from /api/theme/episode/list/9106 (trimmed; the shape is verbatim)
const EPISODES_HTML = `
    <div class="ss-list">
        <a class="ep-item" data-id="136407" data-number="1" href="/watch/x-1?ep=136407">
            <div class="number">1</div><div class="ep-name">Episode 1</div>
        </a>
        <a class="ep-item" data-id="136408" data-number="2" href="/watch/x-1?ep=136408">
            <div class="number">2</div><div class="ep-name">The Second</div>
        </a>
    </div>
`;

test("episodes: reads id and number, drops the 'Episode N' label", () => {
  const episodes = parseEpisodes(readFragment({ status: true, html: EPISODES_HTML, totalItems: 2 }));

  assert.equal(episodes.length, 2);
  assert.deepEqual(
    episodes.map((e) => [e.id, e.number, e.title]),
    [
      ["136407", 1, undefined],
      ["136408", 2, "The Second"],
    ],
  );
});

test("episodes: falls back to ?ep= anchors when ep-item is absent", () => {
  const html = `<a href="/watch/thing-1?ep=99">x</a><a href="/watch/thing-1?ep=100">y</a>`;
  const episodes = parseEpisodes(readFragment({ status: true, html }));

  assert.deepEqual(episodes.map((e) => e.id), ["99", "100"]);
});

// Captured from /api/theme/episode/downloads?episodeId=136407
const DOWNLOADS_HTML = `
    <div class="dl-grp">
        <div class="dl-grp-toggle">Kiwi Sub</div>
        <div class="dl-grp-items">
            <a href="https://cdn.example/one-360p.mp4">360p</a>
            <a href="https://cdn.example/one-1080p.mp4">1080p</a>
            <a href="https://cdn.example/one-720p.mp4">720p</a>
        </div>
    </div>
`;

test("downloads: groups, qualities, best first", () => {
  const links = parseDownloads(readFragment({ status: true, html: DOWNLOADS_HTML }));

  assert.deepEqual(links.map((l) => l.quality), ["1080p", "720p", "360p"]);
  assert.equal(links[0]!.url, "https://cdn.example/one-1080p.mp4");
  assert.equal(links[0]!.group, "Kiwi Sub");
});

test("downloads: relative and duplicate links are not offered", () => {
  const html = `<a href="/download/1">720p</a><a href="https://x/2">720p</a><a href="https://x/2">720p</a>`;
  const links = parseDownloads(readFragment({ status: true, html }));

  assert.equal(links.length, 1);
  assert.equal(links[0]!.url, "https://x/2");
});

test("text and firstImage cope with the lazy-load attributes", () => {
  assert.equal(text("<div> a &amp; b </div>"), "a & b");
  assert.equal(
    firstImage(`<img data-src="https://cdn/x.webp" src="placeholder.gif">`),
    "https://cdn/x.webp",
  );
});

test("animeIdFromHref takes the numeric suffix, watch path or not", () => {
  assert.equal(animeIdFromHref("/watch/primal-9050"), "primal-9050");
  assert.equal(animeIdFromHref("https://aniwatchtv.ws/primal-9050"), "primal-9050");
  assert.equal(animeIdFromHref("/genre/action"), null);
});
