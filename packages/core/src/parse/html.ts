/**
 * Just enough HTML reading for the fragments this API serves.
 *
 * A full DOM parser is ~40 KB and the app only ever needs four things from these
 * fragments: elements with a class, their attributes, their text, and the anchor
 * inside them. So this is a small tag walker rather than a dependency: it stays
 * honest about what it does, and it runs identically on web and in React Native
 * (no `DOM`, no `cheerio`, no native module).
 *
 * It is not a browser parser. It does not build a tree, handle implied tags, or
 * decode every entity. The fragments are machine-generated and regular, which is
 * what makes that acceptable — and every parser below has a test built from real
 * captured output.
 */

export interface RawElement {
  /** Lowercased attribute map. `class` stays `class`. */
  attrs: Record<string, string>;
  /** Inner HTML, unparsed. */
  inner: string;
  /** The raw opening tag, useful for debugging a parser miss. */
  tag: string;
}

export function decodeEntities(text: string): string {
  return text
    .replace(/&lt;/g, "<")
    .replace(/&gt;/g, ">")
    .replace(/&quot;/g, '"')
    .replace(/&#0?39;/g, "'")
    .replace(/&apos;/g, "'")
    .replace(/&nbsp;/g, " ")
    .replace(/&amp;/g, "&");
}

/** Collapse the whitespace the templates are full of. */
export function text(html: string): string {
  return decodeEntities(html.replace(/<[^>]*>/g, " "))
    .replace(/\s+/g, " ")
    .trim();
}

function parseAttrs(raw: string): Record<string, string> {
  const attrs: Record<string, string> = {};
  const re = /([a-zA-Z_:][-a-zA-Z0-9_:.]*)(?:\s*=\s*("([^"]*)"|'([^']*)'|([^\s"'>]+)))?/g;

  let m: RegExpExecArray | null;
  while ((m = re.exec(raw)) !== null) {
    const name = (m[1] ?? "").toLowerCase();
    const value = m[3] ?? m[4] ?? m[5] ?? "";
    attrs[name] = decodeEntities(value);
  }
  return attrs;
}

/**
 * Every element whose class list contains `className`, with its inner HTML.
 *
 * Handles nesting of the same tag by counting openers, which is what keeps
 * `.server-item` from swallowing the rest of the document.
 */
export function findByClass(html: string, className: string, tagName?: string): RawElement[] {
  const out: RawElement[] = [];
  const tag = tagName ?? "[a-zA-Z][a-zA-Z0-9]*";
  const openRe = new RegExp(`<(${tag})\\b([^>]*)>`, "gi");

  let m: RegExpExecArray | null;
  while ((m = openRe.exec(html)) !== null) {
    const attrs = parseAttrs(m[2] ?? "");
    const classes = (attrs.class ?? "").split(/\s+/);
    if (!classes.includes(className)) continue;

    const name = (m[1] ?? "").toLowerCase();
    const start = (m.index ?? 0) + m[0].length;
    const end = findClose(html, name, start);

    out.push({
      attrs,
      inner: html.slice(start, end),
      tag: m[0],
    });

    // Continue after this element; nested matches of the same class are picked
    // up by their own scan when the caller recurses into `inner`.
    openRe.lastIndex = end;
  }

  return out;
}

/** Index of the matching close tag, or the end of input. */
function findClose(html: string, name: string, from: number): number {
  const re = new RegExp(`<(/?)${name}\\b[^>]*>`, "gi");
  re.lastIndex = from;

  let depth = 1;
  let m: RegExpExecArray | null;
  while ((m = re.exec(html)) !== null) {
    if (m[1] === "/") {
      depth -= 1;
      if (depth === 0) return m.index;
    } else if (!m[0].endsWith("/>")) {
      depth += 1;
    }
  }
  return html.length;
}

/** Inner HTML of the first element matching a class, or null. */
export function firstByClass(html: string, className: string, tagName?: string): RawElement | null {
  return findByClass(html, className, tagName)[0] ?? null;
}

/** `href` of the first anchor inside `html`. */
export function firstHref(html: string): string | null {
  const m = html.match(/<a\b[^>]*\bhref\s*=\s*("([^"]*)"|'([^']*)')/i);
  if (!m) return null;
  return decodeEntities(m[2] ?? m[3] ?? "");
}

/** `src`, or lazily loaded `data-src`, of the first image inside `html`. */
export function firstImage(html: string): string | null {
  const tag = html.match(/<img\b[^>]*>/i);
  if (!tag) return null;
  const attrs = parseAttrs(tag[0].replace(/^<img\b/i, "").replace(/>$/, ""));
  return attrs["data-src"] || attrs.src || null;
}

/** Value of `data-*` attributes on the outermost tag of a fragment. */
export function dataAttrs(tagHtml: string): Record<string, string> {
  const attrs = parseAttrs(tagHtml.replace(/^<[a-zA-Z][^>]*?\s/i, "").replace(/\/?>$/, ""));
  const out: Record<string, string> = {};
  for (const [key, value] of Object.entries(attrs)) {
    if (key.startsWith("data-")) out[key] = value;
  }
  return out;
}

/**
 * The anime id at the end of a URL like `/watch/primal-9050` or `/primal-9050`.
 * The numeric suffix is the site's own id and is what the endpoints take.
 */
export function animeIdFromHref(href: string): string | null {
  const m = href.match(/\/(?:watch\/)?([a-z0-9][a-z0-9-]*-\d+)(?:\?|$|"|\/)/i);
  return m?.[1] ?? null;
}
