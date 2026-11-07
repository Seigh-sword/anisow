/**
 * Probe part 5:
 *   1. Exact markup of a card on `/search?keyword=naruto` and `/home` and `/genres/action`!
 *      Why did `collectCards` or `flw-item` behave the way it did?
 *   2. Exact `/filter` form submit behavior in `frontend-QO4TW5y5.js`
 *   3. Exact Zoko docs URL patterns (`docs-sIsMGsz7.js` and `routes-BMUbY_wy.js`)
 *   4. Anikoto API full docs & whether `/recent-anime` supports any query or if we should index/cache its pages!
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

// 1. Exact card HTML on /search?keyword=naruto
const searchRes = await get("https://aniwatchtv.ws/search?keyword=naruto", { Referer: "https://aniwatchtv.ws/home" });
const flwIdx = searchRes.text.indexOf("flw-item");
notice("1-search-card-html", flwIdx >= 0 ? searchRes.text.slice(flwIdx - 30, flwIdx + 900) : "no flw-item");

// 2. Exact filter form HTML (opening <form ...> tag + hidden inputs + submit button)
const filterRes = await get("https://aniwatchtv.ws/filter", { Referer: "https://aniwatchtv.ws/home" });
const fIdx = filterRes.text.indexOf('name="type"');
notice("2a-filter-form-head", fIdx >= 0 ? filterRes.text.slice(Math.max(0, fIdx - 500), fIdx + 350) : "none");
const gIdx = filterRes.text.indexOf("f-genre-item");
const endFormIdx = filterRes.text.indexOf("</form>", gIdx);
notice("2b-filter-form-tail", endFormIdx >= 0 ? filterRes.text.slice(endFormIdx - 700, endFormIdx + 100) : "none");

// 3. How does frontend-QO4TW5y5.js handle filter & search?
const fe = await get("https://aniwatchtv.ws/build/assets/frontend-QO4TW5y5.js");
const filterJs = [...fe.text.matchAll(/.{0,100}(?:f-genre-item|filter-form|search-suggest|result-).{0,200}/gi)].map((m) => m[0]);
// Also find all `/api/` occurrences in frontend.js
const allApiInFe = [...fe.text.matchAll(/.{0,50}\/api\/[a-z0-9/_-]+.{0,80}/gi)].map((m) => m[0]);
notice("3a-fe-filter-js", filterJs.join(" || ") || "no f-genre-item in frontend.js");
notice("3b-fe-all-apis", allApiInFe.join(" || "));

// Check if /filter page has inline <script> for the filter form!
const filterScripts = [...filterRes.text.matchAll(/<script[^>]*>([\s\S]*?)<\/script>/gi)]
  .map((m) => m[1].trim())
  .filter((s) => s.length > 0);
notice("3c-filter-inline-scripts", filterScripts.join(" ||| "));

// 4. Zoko docs URL patterns
const zokoDocsJs = await get("https://zokoanime.video/assets/docs-sIsMGsz7.js");
const zokoUrls = [...zokoDocsJs.text.matchAll(/.{0,40}(?:stream\/|download\/|zokoanime\.video|postMessage|channel).{0,90}/gi)].map((m) => m[0]);
notice("4-zoko-docs-patterns", zokoUrls.slice(0, 15).join(" || "));

// 5. Anikoto pagination & total count
const anikotoP1 = await get("https://anikotoapi.site/recent-anime?page=1&per_page=100");
let anikotoMeta = "";
try {
  const j = JSON.parse(anikotoP1.text);
  anikotoMeta = JSON.stringify({ ok: j.ok, count: j.data?.length, pagination: j.pagination, domains: j.anikoto_domains, sampleKeys: Object.keys(j.data?.[0] ?? {}) });
} catch (e) {
  anikotoMeta = String(e);
}
notice("5-anikoto-pagination", anikotoMeta);
