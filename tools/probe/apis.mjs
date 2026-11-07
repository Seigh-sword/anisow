/**
 * Probe part 3:
 *   1. Full zokoanime.video/docs content (both HTML/text and any linked JS/API if it's an SPA)
 *   2. Exact AniWatch /filter form (sort options, genre input names/values)
 *   3. Exact AniWatch detail page markup (where mal_id / anilist_id / syncData live so we can construct Zoko & Anikoto URLs directly!)
 *   4. Exact AniWatch search suggest endpoint (check theme JS for the real URL)
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

// 1. Zoko docs raw HTML + any JS bundle it loads
const zoko = await get("https://zokoanime.video/docs");
notice("1a-zoko-html", zoko.text.slice(0, 880));
notice("1b-zoko-html2", zoko.text.slice(880, 1760));
const zokoScripts = [...zoko.text.matchAll(/src="([^"]+\.js[^"]*)"/gi)].map((m) => m[1]);
if (zokoScripts.length > 0) {
  const sUrl = zokoScripts[0].startsWith("http") ? zokoScripts[0] : `https://zokoanime.video${zokoScripts[0]}`;
  const js = await get(sUrl);
  // Look for stream/, api/, mal, anilist, imdb, postMessage, etc. in the JS bundle
  const hits = [...js.text.matchAll(/.{0,60}(?:stream\/|zokoanime|anilist|mal|episode|embed|api\/).{0,80}/gi)]
    .map((m) => m[0])
    .slice(0, 15);
  notice("1c-zoko-js", `script=${sUrl} len=${js.text.length} hits=${hits.join(" || ")}`);
} else {
  notice("1c-zoko-html3", zoko.text.slice(1760, 3500));
}

// 2. AniWatch /filter form — find the filter form specifically (the one with select name="type")
const filterPage = await get("https://aniwatchtv.ws/filter", { Referer: "https://aniwatchtv.ws/home" });
const forms = [...filterPage.text.matchAll(/<form[\s\S]*?<\/form>/gi)].map((m) => m[0]);
const filterForm = forms.find((f) => f.includes('name="type"') || f.includes('name="status"')) ?? "";
const selects = [];
for (const m of filterForm.matchAll(/<select[^>]*name="([^"]+)"[^>]*>([\s\S]*?)<\/select>/gi)) {
  const opts = [...m[2].matchAll(/<option[^>]*value="([^"]*)"[^>]*>([\s\S]*?)<\/option>/gi)]
    .map((o) => `${o[1]}:${o[2].replace(/<[^>]+>/g, "").trim()}`);
  selects.push(`${m[1]}=[${opts.join(",")}]`);
}
notice("2a-filter-selects-tail", selects.slice(-5).join(" | "));
// How are genres represented inside filterForm?
const genrePos = filterForm.toLowerCase().indexOf("genre");
notice("2b-filter-genres-markup", genrePos >= 0 ? filterForm.slice(genrePos, genrePos + 1400) : "no genre in form");

// 3. AniWatch watch/detail page — does it expose mal_id or anilist_id?
const searchPage = await get("https://aniwatchtv.ws/search?keyword=naruto", { Referer: "https://aniwatchtv.ws/home" });
const firstWatch = searchPage.text.match(/href="([^"]*\/watch\/([a-z0-9-]+-\d+))"/i);
const slug = firstWatch?.[2] ?? "naruto-677";
const detailPage = await get(`https://aniwatchtv.ws/${slug}`, { Referer: "https://aniwatchtv.ws/home" });
const watchPage = await get(`https://aniwatchtv.ws/watch/${slug}`, { Referer: "https://aniwatchtv.ws/home" });
const malMatches = [
  ...(detailPage.text.matchAll(/.{0,50}(?:mal_id|anilist|syncData|data-mal|data-id).{0,80}/gi)),
  ...(watchPage.text.matchAll(/.{0,50}(?:mal_id|anilist|syncData|data-mal|hianime).{0,80}/gi)),
].map((m) => m[0].trim()).slice(0, 12);
notice("3-detail-watch-ids", `slug=${slug} detailStatus=${detailPage.status}(${detailPage.text.length}B) watchStatus=${watchPage.status} matches=${malMatches.join(" || ")}`);

// 4. AniWatch theme JS — how does search autocomplete and filter submission work?
const jsUrls = [...watchPage.text.matchAll(/src="([^"]+\.js[^"]*)"/gi)].map((m) => m[1]);
const jsSnippets = [];
for (const u of jsUrls) {
  if (/jquery|bootstrap|swiper|lazyload|analytics|cloudflare/i.test(u)) continue;
  const full = u.startsWith("http") ? u : `https://aniwatchtv.ws${u}`;
  const r = await get(full);
  const endpoints = [...r.text.matchAll(/.{0,40}(?:\/api\/|search|suggest|filter|genres).{0,60}/gi)].map((m) => m[0].trim()).slice(0, 10);
  jsSnippets.push(`${u}(${r.text.length}B): ${endpoints.join(" ; ")}`);
}
notice("4-aniwatch-theme-js", jsSnippets.join(" ||| "));
