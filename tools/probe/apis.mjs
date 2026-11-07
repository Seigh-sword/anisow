/**
 * Probe part 6:
 *   1. hiSubmitFilter() definition on /filter
 *   2. Zoko docs full text (converting JSX/strings in docs-sIsMGsz7.js into readable text)
 *   3. Detail page HTML on aniwatchtv.ws (`naruto-8020` vs `/watch/naruto-8020`): where is `mal_id` / `ani_id` / `syncData`?
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

// 1. hiSubmitFilter on /filter
const filterRes = await get("https://aniwatchtv.ws/filter", { Referer: "https://aniwatchtv.ws/home" });
const hiIdx = filterRes.text.lastIndexOf("hiSubmitFilter");
notice("1-hiSubmitFilter", hiIdx >= 0 ? filterRes.text.slice(Math.max(0, hiIdx - 400), hiIdx + 1200) : "not found");

// 2. Zoko docs full text from docs-sIsMGsz7.js
const zokoDocsJs = await get("https://zokoanime.video/assets/docs-sIsMGsz7.js");
// Extract all string literals in order so we can read the entire documentation page!
const docText = [...zokoDocsJs.text.matchAll(/[`"']([^`"'\n\\]{3,220})[`"']/g)]
  .map((m) => m[1])
  .filter((s) => !/^(div|span|code|pre|section|h[1-6]|p|ul|li|table|thead|tbody|tr|th|td|flex|grid|text-|bg-|border-|px-|py-|mt-|mb-|gap-|rounded|font-|items-|justify-|w-|h-|min-|max-|overflow-|whitespace-)/.test(s))
  .join(" | ");
notice("2a-zoko-docs-1", docText.slice(0, 880));
notice("2b-zoko-docs-2", docText.slice(880, 1760));
notice("2c-zoko-docs-3", docText.slice(1760, 2640));
notice("2d-zoko-docs-4", docText.slice(2640, 3520));
notice("2e-zoko-docs-5", docText.slice(3520, 4400));

// 3. AniWatch watch page server items for naruto-8020 (first episode)
const watchRes = await get("https://aniwatchtv.ws/watch/naruto-8020", { Referer: "https://aniwatchtv.ws/home" });
const epId = watchRes.text.match(/data-id="(\d+)"[^>]*data-number="1"|data-number="1"[^>]*data-id="(\d+)"/i);
const firstEp = epId?.[1] || epId?.[2] || watchRes.text.match(/class="[^"]*ep-item[^"]*"[^>]*data-id="(\d+)"/i)?.[1];
if (firstEp) {
  const srv = await get(`https://aniwatchtv.ws/api/theme/episode/servers?episodeId=${firstEp}`, { Referer: "https://aniwatchtv.ws/watch/naruto-8020" });
  const hashes = [...srv.text.matchAll(/data-hash="([^"]+)"/g)].map((m) => {
    try { return `${m[1]} => ${Buffer.from(m[1], "base64").toString("utf8")}`; } catch { return m[1]; }
  });
  notice("3-naruto-servers", `ep=${firstEp} hashes=${hashes.join(" | ")} raw=${srv.text.slice(0, 500)}`);
}
