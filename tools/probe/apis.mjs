/**
 * Probe part 9:
 *   1. Exact markup of `ani_detail` / `.anisc-poster` / `.anisc-detail` / `.anisc-info` on `https://aniwatchtv.ws/naruto-8020` and `/watch/naruto-8020`
 *   2. Test `https://zokoanime.video/api/downloads/token/anilist/20/1/sub` and `/mal/20/1/sub`!
 *   3. Check how `https://anikotoapi.site/series/8020` vs `https://anikotoapi.site/recent-anime` IDs map to `aniwatchtv.ws` IDs (`naruto-8020` vs `stitch-9553` — wait: Stitch on anikotoapi.site had `id: 9553`! Does `aniwatchtv.ws` have `stitch-9553`?!)
 */
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

// 1. Wait: are Anikoto series IDs (`https://anikotoapi.site/series/{id}`) the EXACT SAME numeric IDs as aniwatchtv.ws (`naruto-8020` -> `8020`)?!
const anikoto8020 = await get("https://anikotoapi.site/series/8020");
const anikoto7922 = await get("https://anikotoapi.site/series/7922"); // bleach-7922!
const anikoto9106 = await get("https://anikotoapi.site/series/9106"); // battle-spirits-9106!
notice("1a-anikoto-8020-naruto", `status=${anikoto8020.status} body=${anikoto8020.text.slice(0, 800)}`);
notice("1b-anikoto-7922-bleach", `status=${anikoto7922.status} body=${anikoto7922.text.slice(0, 800)}`);
notice("1c-anikoto-9106-battle", `status=${anikoto9106.status} body=${anikoto9106.text.slice(0, 800)}`);

// 2. Detail page markup on aniwatchtv.ws/naruto-8020 around film-poster / anisc-poster / anisc-info
const detail = await get("https://aniwatchtv.ws/naruto-8020", { Referer: "https://aniwatchtv.ws/home" });
const pIdx = detail.text.indexOf("film-poster");
notice("2a-detail-poster", pIdx >= 0 ? detail.text.slice(Math.max(0, pIdx - 100), pIdx + 800) : "no film-poster");
const infoIdx = detail.text.indexOf("anisc-info");
notice("2b-detail-info", infoIdx >= 0 ? detail.text.slice(infoIdx, infoIdx + 900) : "no anisc-info");

// 3. Zoko downloads API test
const zokoTok = await get("https://zokoanime.video/api/downloads/token/mal/20/1/sub", { Referer: "https://zokoanime.video/" });
let zokoDlBody = "";
try {
  const { token } = JSON.parse(zokoTok.text);
  if (token) {
    const dlRes = await get(`https://zokoanime.video/api/downloads/mal/20/1/sub?t=${encodeURIComponent(token)}`, { Referer: "https://zokoanime.video/" });
    zokoDlBody = `dlStatus=${dlRes.status} dl=${dlRes.text.slice(0, 650)}`;
  }
} catch {}
notice("3-zoko-downloads", `tokStatus=${zokoTok.status} tok=${zokoTok.text.slice(0, 200)} ${zokoDlBody}`);

// 4. Test /filter with genre[] on aniwatchtv.ws
const fGenre = await get("https://aniwatchtv.ws/filter?type=tv&status=completed&genre%5B%5D=action&sort=avg_score", { Referer: "https://aniwatchtv.ws/filter" });
const fTitles = [...fGenre.text.matchAll(/class="film-name"[^>]*>[\s\S]*?<a[^>]*>([^<]+)<\/a>/gi)].map((m) => m[1].trim());
notice("4-filter-with-genre-array", `status=${fGenre.status} count=${fTitles.length} titles=${fTitles.slice(0, 10).join(" , ")}`);
