/**
 * Probe part 4:
 *   1. Zoko docs chunk + download chunk from zokoanime.video/assets/...
 *   2. AniWatch frontend JS (frontend-QO4TW5y5.js): how does search suggest & filter form submit work?
 *   3. AniWatch /filter sort select & hidden genre input name
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

// 1. Zoko asset chunks
const zokoIndex = await get("https://zokoanime.video/assets/index-Dd1_c_X8.js");
const zokoAssets = [...zokoIndex.text.matchAll(/"(assets\/[^"]+\.js)"/g)].map((m) => m[1]);
notice("1a-zoko-assets", zokoAssets.join(" , "));

const docsAsset = zokoAssets.find((a) => /doc/i.test(a));
if (docsAsset) {
  const d = await get(`https://zokoanime.video/${docsAsset}`);
  // Extract readable string literals from the docs chunk
  const strings = [...d.text.matchAll(/["'`]([^"'`]{12,200})["'`]/g)]
    .map((m) => m[1])
    .filter((s) => /https?:|stream|download|mal|anilist|hianime|epId|track|postMessage|iframe|embed|api/i.test(s));
  notice("1b-zoko-docs-strings1", strings.slice(0, 25).join(" || "));
  notice("1c-zoko-docs-strings2", strings.slice(25, 55).join(" || "));
}

// 2. AniWatch /filter sort select + hidden inputs + genre items
const filterPage = await get("https://aniwatchtv.ws/filter", { Referer: "https://aniwatchtv.ws/home" });
const forms = [...filterPage.text.matchAll(/<form[\s\S]*?<\/form>/gi)].map((m) => m[0]);
const filterForm = forms.find((f) => f.includes('name="type"')) ?? "";
const sortSelect = filterForm.match(/<select[^>]*name="sort"[^>]*>([\s\S]*?)<\/select>/i)?.[0] ?? "none";
const allInputs = [...filterForm.matchAll(/<input[^>]*>/gi)].map((m) => m[0]);
const genresList = [...filterForm.matchAll(/class="[^"]*f-genre-item[^"]*"[^>]*data-id="([^"]+)"[^>]*>([\s\S]*?)<\/div>/gi)]
  .map((m) => `${m[1]}:${m[2].trim()}`);
notice("2a-filter-sort-inputs", `sort=${sortSelect} inputs=${allInputs.join(" ")}`);
notice("2b-filter-all-genres", `count=${genresList.length} list=${genresList.join(" | ")}`);

// 3. AniWatch frontend JS — search for `/api/theme` or `f-genre-item` or `search` or `filter`
const fe = await get("https://aniwatchtv.ws/build/assets/frontend-QO4TW5y5.js");
const apiHits = [...fe.text.matchAll(/.{0,60}(?:api\/theme|f-genre-item|search-input|search-suggest|\/filter|\/search).{0,100}/gi)]
  .map((m) => m[0]);
notice("3a-fe-api-hits1", apiHits.slice(0, 10).join(" || "));
notice("3b-fe-api-hits2", apiHits.slice(10, 22).join(" || "));

// 4. Test real filter combinations on aniwatchtv.ws
const filterTests = [];
for (const q of [
  "/filter?type=tv&status=releasing&sort=default",
  "/filter?genres=action,adventure",
  "/filter?genre=action",
  "/filter?genres%5B%5D=action",
  "/filter?keyword=bleach&type=tv",
]) {
  const r = await get(`https://aniwatchtv.ws${q}`, { Referer: "https://aniwatchtv.ws/filter" });
  const cards = [...r.text.matchAll(/class="flw-item"/g)].length;
  const firstTitle = r.text.match(/class="film-name"[^>]*>[\s\S]*?<a[^>]*>([^<]+)<\/a>/i)?.[1]?.trim() ?? "none";
  filterTests.push(`${q} => ${r.status} (${cards} cards, first="${firstTitle}")`);
}
notice("4-filter-live-tests", filterTests.join(" ;; "));
