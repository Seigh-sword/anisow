/**
 * Where are the genre links, and what do they point at?
 *
 * A first run answered the first half: `/home` carries a
 * `<section class="hianime-genres-widget">` but no `/genre/{slug}` hrefs, and
 * `/genre/action` is a **404** — so `getGenres()` and `browse()` were both built
 * against a path this deployment does not serve.
 *
 * This run reads the widget, prints the hrefs that are actually in it, then
 * requests the discovered paths to see which ones answer with a shelf. The fix
 * to the client is whatever this prints, not a guess.
 */

const BASE = process.env.ANI_BASE ?? "https://aniwatchtv.ws";

const UA =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36";

const report = (line) => {
  console.log(line);
  if (process.env.GITHUB_ACTIONS === "true") {
    console.log(`::notice::${String(line).replace(/[\r\n]+/g, " ").slice(0, 900)}`);
  }
};

async function get(path) {
  const response = await fetch(`${BASE}${path}`, {
    headers: { "User-Agent": UA, Referer: `${BASE}/` },
  });
  return { status: response.status, html: await response.text() };
}

/* --------------------------------------------------------- the home page */

const home = await get("/home");

// The widget, and everything it links to.
const widgetStart = home.html.indexOf("hianime-genres-widget");
if (widgetStart === -1) {
  report("home: no genre widget found at all");
} else {
  const chunk = home.html.slice(widgetStart, widgetStart + 6000);
  const hrefs = [...chunk.matchAll(/href="([^"]+)"/g)].map((match) => match[1]).filter(Boolean);

  report(`home: genre widget has ${hrefs.length} links`);
  report(`home: first links → ${hrefs.slice(0, 14).join("  ")}`);

  // The label of each link, so the shape of a slug is unambiguous.
  const labels = [...chunk.matchAll(/<a[^>]*href="([^"]+)"[^>]*>([\s\S]{0,40}?)<\/a>/g)]
    .slice(0, 10)
    .map((match) => `${match[1]} = ${String(match[2]).replace(/<[^>]*>/g, "").replace(/\s+/g, " ").trim()}`);

  report(`home: labelled links → ${labels.join(" | ")}`);

  // Every distinct path prefix the page links to: this is how the real browse
  // route announces itself when the obvious one 404s.
  const prefixes = new Map();
  for (const match of home.html.matchAll(/href="(?:https?:\/\/[^/]+)?\/([a-z0-9-]+)\//gi)) {
    const key = match[1];
    prefixes.set(key, (prefixes.get(key) ?? 0) + 1);
  }
  report(
    `home: path prefixes → ${[...prefixes.entries()]
      .sort((a, b) => b[1] - a[1])
      .slice(0, 14)
      .map(([key, count]) => `${key}(${count})`)
      .join(" ")}`,
  );
}

/* ------------------------------------------------- verify the candidates */

const candidates = [
  "/genres",
  "/genres/action",
  "/genre/action",
  "/category/action",
  "/browse/action",
  ...(home.html.includes("/genre/") ? [] : []),
];

for (const path of candidates) {
  try {
    const { status, html } = await get(path);
    const posters = [...html.matchAll(/\/watch\/[a-z0-9-]+-\d+/g)].length;
    const title = html.match(/<title[^>]*>([\s\S]{0,80}?)<\/title>/i)?.[1]?.trim();
    report(`candidate ${path}: ${status}, ${html.length} bytes, ${posters} watch links, title "${title ?? ""}"`);
  } catch (cause) {
    report(`candidate ${path}: failed — ${cause instanceof Error ? cause.message : String(cause)}`);
  }
}

process.exit(0);
