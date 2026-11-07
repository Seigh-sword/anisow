/**
 * Probe part 7:
 *   1. Remainder of hiSubmitFilter()
 *   2. Remainder of docs-sIsMGsz7.js (functions h and v — postMessage events & downloads!)
 *   3. Server items for naruto-8020
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

// 1. Remainder of hiSubmitFilter
const filterRes = await get("https://aniwatchtv.ws/filter", { Referer: "https://aniwatchtv.ws/home" });
const hiIdx = filterRes.text.lastIndexOf("function hiSubmitFilter");
notice("1-hiSubmitFilter-full", hiIdx >= 0 ? filterRes.text.slice(hiIdx, hiIdx + 900) : "not found");

// 2. Zoko docs functions p, m, h, v raw source (the file is small enough to slice directly!)
const zokoDocsJs = await get("https://zokoanime.video/assets/docs-sIsMGsz7.js");
const fnP = zokoDocsJs.text.indexOf("function p()");
const rest = zokoDocsJs.text.slice(fnP >= 0 ? fnP : 0);
notice("2a-zoko-raw-1", rest.slice(0, 880));
notice("2b-zoko-raw-2", rest.slice(880, 1760));
notice("2c-zoko-raw-3", rest.slice(1760, 2640));
notice("2d-zoko-raw-4", rest.slice(2640, 3520));
notice("2e-zoko-raw-5", rest.slice(3520, 4400));
notice("2f-zoko-raw-6", rest.slice(4400, 5280));
notice("2g-zoko-raw-7", rest.slice(5280, 6160));

// 3. Naruto servers
const epRes = await get("https://aniwatchtv.ws/api/theme/episode/list/8020", { Referer: "https://aniwatchtv.ws/watch/naruto-8020" });
const firstEpId = epRes.text.match(/data-id=\\"(\d+)\\"|data-id="(\d+)"/)?.[1] || epRes.text.match(/ep=(\d+)/)?.[1];
if (firstEpId) {
  const srv = await get(`https://aniwatchtv.ws/api/theme/episode/servers?episodeId=${firstEpId}`, { Referer: "https://aniwatchtv.ws/watch/naruto-8020" });
  const hashes = [...srv.text.matchAll(/data-hash=\\?"([^"\\]+)\\?"/g)].map((m) => {
    try { return Buffer.from(m[1], "base64").toString("utf8"); } catch { return m[1]; }
  });
  notice("3-naruto-servers", `ep=${firstEpId} decoded=${hashes.join(" , ")} raw=${srv.text.slice(0, 500)}`);
} else {
  notice("3-naruto-ep-fail", epRes.text.slice(0, 500));
}
