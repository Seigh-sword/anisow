/**
 * Probe everything the user pointed out:
 *   1. https://anikotoapi.site/recent-anime and /series/{id} (plus any other endpoints it offers: /search, /anime, /genres, etc.)
 *   2. https://zokoanime.video/docs (what endpoints & embed formats Zoko documents)
 *   3. https://aniwatchtv.ws/filter, /search?keyword=..., and how the Filter form in the screenshot actually works!
 *
 * Emits GitHub Actions ::notice:: annotations so we can read every byte of evidence.
 */

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

function report(title, text) {
  const flat = String(text).replace(/[\r\n]+/g, " ").trim();
  console.log(`[${title}] ${flat}`);
  if (process.env.GITHUB_ACTIONS === "true") {
    for (let i = 0; i < flat.length; i += 800) {
      console.log(`::notice title=${title}${i > 0 ? `+${i}` : ""}::${flat.slice(i, i + 800)}`);
    }
  }
}

async function get(url, headers = {}) {
  try {
    const res = await fetch(url, {
      headers: { "User-Agent": UA, ...headers },
      signal: AbortSignal.timeout(15000),
    });
    const text = await res.text();
    return { ok: res.ok, status: res.status, text };
  } catch (e) {
    return { ok: false, status: 0, text: String(e) };
  }
}

/* --------------------------------------------------- 1. anikotoapi.site */

const anikotoRoot = await get("https://anikotoapi.site/");
report("anikoto-root", `status=${anikotoRoot.status} len=${anikotoRoot.text.length} body=${anikotoRoot.text.slice(0, 1500)}`);

const anikotoDocs = await get("https://anikotoapi.site/docs");
report("anikoto-docs", `status=${anikotoDocs.status} len=${anikotoDocs.text.length} body=${anikotoDocs.text.slice(0, 1500)}`);

const anikotoRecent = await get("https://anikotoapi.site/recent-anime?page=1&per_page=3");
report("anikoto-recent", `status=${anikotoRecent.status} body=${anikotoRecent.text.slice(0, 2000)}`);

let firstSeriesId = "1";
try {
  const parsed = JSON.parse(anikotoRecent.text);
  const rows = parsed.data || parsed.anime || parsed.results || parsed.items || [];
  if (Array.isArray(rows) && rows[0]?.id) firstSeriesId = String(rows[0].id);
} catch {}

const anikotoSeries = await get(`https://anikotoapi.site/series/${firstSeriesId}`);
report("anikoto-series", `id=${firstSeriesId} status=${anikotoSeries.status} body=${anikotoSeries.text.slice(0, 2000)}`);

// Probe possible search/filter endpoints on anikotoapi.site
for (const path of [
  "/search?q=naruto",
  "/search?keyword=naruto",
  "/recent-anime?page=1&per_page=5&search=naruto",
  "/recent-anime?page=1&per_page=5&q=naruto",
  "/recent-anime?page=1&per_page=5&genre=action",
  "/anime?q=naruto",
  "/series?q=naruto",
  "/openapi.json",
  "/swagger.json",
]) {
  const r = await get(`https://anikotoapi.site${path}`);
  report(`anikoto${path}`, `status=${r.status} len=${r.text.length} sample=${r.text.slice(0, 400)}`);
}

/* --------------------------------------------------- 2. zokoanime.video/docs */

const zokoDocs = await get("https://zokoanime.video/docs");
const zokoClean = zokoDocs.text
  .replace(/<script[\s\S]*?<\/script>/gi, " ")
  .replace(/<style[\s\S]*?<\/style>/gi, " ")
  .replace(/<[^>]+>/g, " ")
  .replace(/\s+/g, " ");
report("zoko-docs-text", `status=${zokoDocs.status} len=${zokoDocs.text.length} text=${zokoClean.slice(0, 2400)}`);
report("zoko-docs-raw", zokoDocs.text.slice(0, 2400));

/* --------------------------------------------------- 3. aniwatchtv.ws filter & search */

const filterPage = await get("https://aniwatchtv.ws/filter", { Referer: "https://aniwatchtv.ws/home" });
report("aniwatch-filter-status", `status=${filterPage.status} len=${filterPage.text.length}`);

// Extract the filter form HTML so we see every select, option, and genre input!
const formMatch = filterPage.text.match(/<form[\s\S]*?<\/form>/gi) ?? [];
for (let i = 0; i < formMatch.length; i++) {
  const f = formMatch[i];
  if (f.includes("genre") || f.includes("filter") || f.includes("type") || f.includes("status")) {
    report(`aniwatch-filter-form-${i}`, f.replace(/\s+/g, " ").slice(0, 3200));
  }
}

// Also check how /search?keyword=one+piece and /api/theme/... search work on aniwatchtv.ws
for (const path of [
  "/search?keyword=naruto",
  "/filter?keyword=naruto",
  "/filter?type=1&status=1",
  "/?s=naruto",
  "/api/theme/search?keyword=naruto",
  "/api/theme/search/suggest?keyword=naruto",
  "/wp-json/wp/v2/posts?search=naruto",
]) {
  const r = await get(`https://aniwatchtv.ws${path}`, { Referer: "https://aniwatchtv.ws/home" });
  const cards = [...r.text.matchAll(/class="flw-item"/g)].length;
  const title = r.text.match(/<title[^>]*>([\s\S]{0,80}?)<\/title>/i)?.[1]?.trim() ?? "";
  report(`aniwatch${path}`, `status=${r.status} len=${r.text.length} flw-items=${cards} title="${title}" sample=${r.text.slice(0, 350)}`);
}

// Check the search form in /home to see what action & input name it uses!
const homePage = await get("https://aniwatchtv.ws/home");
const homeForms = [...homePage.text.matchAll(/<form[\s\S]*?<\/form>/gi)].map((m) => m[0].replace(/\s+/g, " "));
report("aniwatch-home-forms", homeForms.join(" ||| ").slice(0, 2400));

// Check the JS on /home for search/suggest/filter endpoints
const scripts = [...homePage.text.matchAll(/<script[^>]*>([\s\S]*?)<\/script>/gi)]
  .map((m) => m[1])
  .filter((s) => s.includes("search") || s.includes("filter") || s.includes("ajax") || s.includes("rest_url"));
report("aniwatch-inline-scripts", scripts.join(" ||| ").replace(/\s+/g, " ").slice(0, 2400));

// Fetch the theme's main JS file if linked
const themeJs = [...homePage.text.matchAll(/src="([^"]*\/(?:theme|build|assets)\/[^"]+\.js[^"]*)"/gi)].map((m) => m[1]);
report("aniwatch-js-urls", themeJs.join(" , "));
for (const jsUrl of themeJs.slice(0, 3)) {
  const full = jsUrl.startsWith("http") ? jsUrl : `https://aniwatchtv.ws${jsUrl}`;
  const jsRes = await get(full);
  report(`js:${jsUrl.split("/").pop()}`, `len=${jsRes.text.length} content=${jsRes.text.replace(/\s+/g, " ").slice(0, 2400)}`);
}

process.exit(0);
