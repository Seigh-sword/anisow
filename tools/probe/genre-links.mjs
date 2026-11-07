/**
 * Where are the genre links?
 *
 * `getGenres()` reads `/genre/{slug}` hrefs out of `/home`. The browser run in CI
 * found only five — so either the home page no longer lists genres, or they live
 * on a different page. This asks the site directly and prints what it finds, so
 * the client is fixed against evidence instead of a guess.
 *
 * Output is deliberately greppable: run in CI, read the annotations.
 */

const BASE = process.env.ANI_BASE ?? "https://aniwatchtv.ws";

const PAGES = ["/home", "/genre/action", "/az-list", "/genre", "/"];

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

const report = (line) => {
  console.log(line);
  if (process.env.GITHUB_ACTIONS === "true") {
    console.log(`::notice::${String(line).replace(/[\r\n]+/g, " ").slice(0, 900)}`);
  }
};

for (const path of PAGES) {
  try {
    const response = await fetch(`${BASE}${path}`, {
      headers: { "User-Agent": UA, Referer: `${BASE}/` },
    });
    const html = await response.text();

    const genreLinks = new Set();
    for (const match of html.matchAll(/href="([^"]*\/genre\/([a-z0-9-]+))"/gi)) {
      genreLinks.add(match[2]);
    }

    // Any navigation container that mentions genre, so the shape is visible.
    const navHint =
      html.match(/<[^>]*class="[^"]*genres?[^"]*"[^>]*>/i)?.[0]?.slice(0, 120) ?? "none";

    report(
      `${path}: ${response.status}, ${html.length} bytes, ${genreLinks.size} genre slugs, first: ${
        [...genreLinks].slice(0, 12).join(", ") || "none"
      }`,
    );
    report(`${path}: first genre-ish element → ${navHint}`);

    if (path === "/home" && genreLinks.size > 0) {
      // How deep were they? An anchor inside a nav/footer is still fine; what
      // matters is the parser's regex reaching them.
      const sample = html.match(/<a[^>]*\/genre\/[a-z0-9-]+[^>]*>[\s\S]{0,80}?<\/a>/i)?.[0];
      report(`/home: sample genre anchor → ${String(sample).replace(/\s+/g, " ").slice(0, 200)}`);
    }
  } catch (cause) {
    report(`${path}: failed — ${cause instanceof Error ? cause.message : String(cause)}`);
  }
}

process.exit(0);
