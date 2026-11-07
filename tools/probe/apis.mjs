/**
 * Probe part 8:
 *   1. Remainder of Zoko docs (`docs-sIsMGsz7.js` from 6160 to end) + `api-L1ueWsnh.js` + `download._source._id._episode._track-CVSxf3RN.js`
 *   2. Test why `collectCards` returned `[]` on `/search?keyword=naruto`: import `@anispots/core` right here and run `client.search("naruto")` and `client.home()` and `client.details("naruto-8020")`!
 *   3. Check how `naruto-8020` detail/watch page exposes `mal_id` or `anilist_id` so we can build Zoko URLs for any anime!
 */
import { createClient } from "../../packages/core/src/index.ts";

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

function notice(title, text) {
  const flat = String(text).replace(/[\r\n]+/g, " ").trim().slice(0, 880);
  console.log(`::notice title=${title}::${flat}`);
}

async function get(url, headers = {}) {
  try {
    const res = await fetch(url, {
      headers: { "User-Agent": UA, ...headers },
      signal: AbortSignal.timeout(15000),
    });
    return { status: res.status, text: await res.text() };
  } catch (e) {
    return { status: 0, text: String(e) };
  }
}

// 1. Remainder of Zoko docs
const zokoDocsJs = await get("https://zokoanime.video/assets/docs-sIsMGsz7.js");
const fnP = zokoDocsJs.text.indexOf("function p()");
const rest = zokoDocsJs.text.slice(fnP >= 0 ? fnP : 0);
notice("1a-zoko-raw-8", rest.slice(6160, 7040));
notice("1b-zoko-raw-9", rest.slice(7040, 7920));
notice("1c-zoko-raw-10", rest.slice(7920, 8800));
notice("1d-zoko-raw-11", rest.slice(8800, 9680));

const zokoDl = await get("https://zokoanime.video/assets/download._source._id._episode._track-CVSxf3RN.js");
notice("1e-zoko-dl-js", zokoDl.text.slice(0, 880));

// 2. Run actual @anispots/core client methods against live site!
const client = createClient({ baseUrl: "https://aniwatchtv.ws" });
const sRes = await client.search("naruto");
const dRes = await client.details("naruto-8020");
const eRes = await client.episodes("naruto-8020");
const srvRes = await client.servers("117532");
notice("2a-core-search", JSON.stringify(sRes).slice(0, 880));
notice("2b-core-details-eps", `details=${JSON.stringify(dRes).slice(0, 420)} || eps=${eRes.ok ? eRes.data.length : eRes.error} || servers=${JSON.stringify(srvRes)}`);

// 3. Where are MAL / AniList IDs on naruto-8020 or /watch/naruto-8020?
const detailHtml = await get("https://aniwatchtv.ws/naruto-8020", { Referer: "https://aniwatchtv.ws/home" });
const watchHtml = await get("https://aniwatchtv.ws/watch/naruto-8020", { Referer: "https://aniwatchtv.ws/home" });
// Naruto is MAL 20 and AniList 20. Let's check One Piece (`one-piece-100` or search `one piece`) where MAL=21, AniList=21, or Bleach where MAL=269, AniList=269!
const bleachSearch = await client.search("bleach");
const bleachSlug = bleachSearch.ok && bleachSearch.data[0] ? bleachSearch.data[0].id : "bleach-806";
const bleachWatch = await get(`https://aniwatchtv.ws/watch/${bleachSlug}`, { Referer: "https://aniwatchtv.ws/home" });
const bleachDetail = await get(`https://aniwatchtv.ws/${bleachSlug}`, { Referer: "https://aniwatchtv.ws/home" });
const has269Watch = [...bleachWatch.text.matchAll(/.{0,40}269.{0,40}/g)].map((m) => m[0]).slice(0, 8);
const has269Detail = [...bleachDetail.text.matchAll(/.{0,40}269.{0,40}/g)].map((m) => m[0]).slice(0, 8);
notice("3-bleach-269", `slug=${bleachSlug} watch269=${has269Watch.join(" | ")} detail269=${has269Detail.join(" | ")}`);
