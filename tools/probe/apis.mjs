/**
 * Probe part 2 — keep ≤8 annotations so GitHub doesn't cap at 10!
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

function stripHtml(html) {
  return html
    .replace(/<script[\s\S]*?<\/script>/gi, " ")
    .replace(/<style[\s\S]*?<\/style>/gi, " ")
    .replace(/<[^>]+>/g, " ")
    .replace(/\s+/g, " ")
    .trim();
}

// 1. Anikoto root docs text
const anikotoRoot = await get("https://anikotoapi.site/");
notice("1-anikoto-docs", stripHtml(anikotoRoot.text));

// 2. Zoko docs text (part 1 and part 2)
const zoko = await get("https://zokoanime.video/docs");
const zokoText = stripHtml(zoko.text);
notice("2a-zoko-docs", zokoText.slice(0, 880));
notice("2b-zoko-docs", zokoText.slice(880, 1760));
notice("2c-zoko-docs", zokoText.slice(1760, 2640));

// 3. AniWatch /filter form selects & inputs
const filterPage = await get("https://aniwatchtv.ws/filter", { Referer: "https://aniwatchtv.ws/home" });
const selects = [];
for (const m of filterPage.text.matchAll(/<select[^>]*name="([^"]+)"[^>]*>([\s\S]*?)<\/select>/gi)) {
  const name = m[1];
  const opts = [...m[2].matchAll(/<option[^>]*value="([^"]*)"[^>]*>([\s\S]*?)<\/option>/gi)]
    .map((o) => `${o[1]}:${o[2].replace(/<[^>]+>/g, "").trim()}`)
    .slice(0, 12);
  selects.push(`${name}=[${opts.join(",")}]`);
}
const inputs = [...filterPage.text.matchAll(/<input[^>]*>/gi)]
  .map((m) => m[0])
  .filter((tag) => /genre|type|status|rated|score|season|language|sort|keyword/i.test(tag))
  .slice(0, 12);
notice("3a-aniwatch-filter-selects", `status=${filterPage.status} selects=${selects.join(" | ")}`);
notice("3b-aniwatch-filter-body", filterPage.text.slice(filterPage.text.indexOf("<form"), filterPage.text.indexOf("</form>") + 7).replace(/\s+/g, " "));

// 4. AniWatch search & filter requests
const searchResults = [];
for (const p of [
  "/search?keyword=one+piece",
  "/filter?keyword=one+piece",
  "/filter?type=tv&status=currently-airing",
  "/filter?genres=action",
  "/api/theme/search/suggest?keyword=one",
  "/api/theme/ajax?action=search&keyword=one",
]) {
  const r = await get(`https://aniwatchtv.ws${p}`, { Referer: "https://aniwatchtv.ws/home" });
  const cards = [...r.text.matchAll(/\/watch\/[a-z0-9-]+-\d+/g)].length;
  searchResults.push(`${p}->${r.status}(${cards}cards,${r.text.length}B,sample:${r.text.slice(0, 100).replace(/\s+/g, " ")})`);
}
notice("4-aniwatch-search-tests", searchResults.join(" ;; "));

// 5. AniWatch home search form + inline script endpoints
const home = await get("https://aniwatchtv.ws/home");
const forms = [...home.text.matchAll(/<form[\s\S]*?<\/form>/gi)].map((m) => m[0].replace(/\s+/g, " "));
const scripts = [...home.text.matchAll(/<script[^>]*>([\s\S]*?)<\/script>/gi)]
  .map((m) => m[1].replace(/\s+/g, " "))
  .filter((s) => s.length > 20 && (s.includes("search") || s.includes("filter") || s.includes("hianime")));
notice("5-aniwatch-home-search", `forms=${forms.join(" || ")} scripts=${scripts.join(" || ")}`);
