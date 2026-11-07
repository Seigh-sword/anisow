/**
 * Generates the store icons and the splash from the same geometry as the logo.
 *
 * A mobile build needs real PNGs: `app.json` points at files, and an app without
 * an icon cannot be installed, let alone published. Rather than commit binaries
 * nobody can edit, this draws them from the mark — the three spots and the play
 * triangle — with a tiny rasteriser, so the icon and the in-app logo can never
 * drift apart.
 *
 * Run: node tools/assets/make-icons.mjs  (or `npm run icons`)
 */

import { mkdir, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import { fileURLToPath } from "node:url";
import { PNG } from "pngjs";

const root = resolve(dirname(fileURLToPath(import.meta.url)), "../..");
const outDir = resolve(root, "apps/mobile/assets");

/* --------------------------------------------------------------- drawing */

const hex = (value) => ({
  r: parseInt(value.slice(1, 3), 16),
  g: parseInt(value.slice(3, 5), 16),
  b: parseInt(value.slice(5, 7), 16),
});

const mix = (a, b, t) => ({
  r: Math.round(a.r + (b.r - a.r) * t),
  g: Math.round(a.g + (b.g - a.g) * t),
  b: Math.round(a.b + (b.b - a.b) * t),
});

const BLUE = hex("#007BFF");
const MID = hex("#7B3DFF");
const MAGENTA = hex("#FF00FF");
const INK = hex("#07080E");
const WHITE = { r: 255, g: 255, b: 255 };

/** Alpha-blend one pixel, clipped. */
function paint(png, x, y, color, alpha = 1) {
  if (x < 0 || y < 0 || x >= png.width || y >= png.height) return;
  const offset = (png.width * y + x) << 2;
  const a = Math.max(0, Math.min(1, alpha));

  png.data[offset] = Math.round(png.data[offset] * (1 - a) + color.r * a);
  png.data[offset + 1] = Math.round(png.data[offset + 1] * (1 - a) + color.g * a);
  png.data[offset + 2] = Math.round(png.data[offset + 2] * (1 - a) + color.b * a);
  png.data[offset + 3] = Math.round(png.data[offset + 3] * (1 - a) + 255 * a);
}

/** Diagonal brand gradient at 135°, the same stops the CSS uses. */
function brandAt(t) {
  if (t < 0.52) return mix(BLUE, MID, t / 0.52);
  return mix(MID, MAGENTA, (t - 0.52) / 0.48);
}

/**
 * Coverage of a circle, supersampled 3×3.
 *
 * The whole reason this file exists: an anti-aliased edge is what separates an
 * icon from a blob, and it is three lines more code than a hard test.
 */
function circleCoverage(x, y, cx, cy, r) {
  let hits = 0;
  for (let sy = 0; sy < 3; sy += 1) {
    for (let sx = 0; sx < 3; sx += 1) {
      const px = x + (sx + 0.5) / 3;
      const py = y + (sy + 0.5) / 3;
      const dx = px - cx;
      const dy = py - cy;
      if (dx * dx + dy * dy <= r * r) hits += 1;
    }
  }
  return hits / 9;
}

/** Coverage of a triangle given by three points, supersampled. */
function triangleCoverage(x, y, p1, p2, p3) {
  const sign = (px, py, ax, ay, bx, by) => (px - bx) * (ay - by) - (ax - bx) * (py - by);

  let hits = 0;
  for (let sy = 0; sy < 3; sy += 1) {
    for (let sx = 0; sx < 3; sx += 1) {
      const px = x + (sx + 0.5) / 3;
      const py = y + (sy + 0.5) / 3;

      const d1 = sign(px, py, p1.x, p1.y, p2.x, p2.y);
      const d2 = sign(px, py, p2.x, p2.y, p3.x, p3.y);
      const d3 = sign(px, py, p3.x, p3.y, p1.x, p1.y);

      const hasNeg = d1 < 0 || d2 < 0 || d3 < 0;
      const hasPos = d1 > 0 || d2 > 0 || d3 > 0;
      if (!(hasNeg && hasPos)) hits += 1;
    }
  }
  return hits / 9;
}

/* ------------------------------------------------------------------ icons */

/**
 * The icon.
 *
 * `inset` is the safe area: platform launchers crop iOS icons to a squircle and
 * Android to a circle, so the mark is drawn inside 68% of the canvas and the
 * gradient fills the rest. A mark at the edge would be clipped on both.
 */
function drawIcon(size, { inset = 0.2, background = true, rounded = false } = {}) {
  const png = new PNG({ width: size, height: size });

  const pad = Math.round(size * inset);
  const box = size - pad * 2;
  const centre = size / 2;

  for (let y = 0; y < size; y += 1) {
    for (let x = 0; x < size; x += 1) {
      if (background) {
        // 135°: t grows towards the bottom-right corner.
        const t = Math.min(1, Math.max(0, (x / size) * 0.5 + (y / size) * 0.5));
        paint(png, x, y, brandAt(t), 1);
      } else {
        paint(png, x, y, INK, 1);
      }
    }
  }

  // Rounded-corner mask, for the assets that are not the launcher icon.
  if (rounded) {
    const r = size * 0.22;
    for (let y = 0; y < size; y += 1) {
      for (let x = 0; x < size; x += 1) {
        const cx = Math.min(Math.max(x, r), size - r);
        const cy = Math.min(Math.max(y, r), size - r);
        const dx = x - cx;
        const dy = y - cy;
        if (dx * dx + dy * dy > r * r) {
          const offset = (size * y + x) << 2;
          png.data[offset + 3] = 0;
        }
      }
    }
  }

  // The mark: a play triangle made of the gradient, on the right of three spots.
  // Optically centred as one group: the spots and the triangle are weighted so
  // the whole mark sits in the middle rather than hugging the right edge.
  const tri = [
    { x: centre - box * 0.14, y: centre - box * 0.25 },
    { x: centre + box * 0.28, y: centre },
    { x: centre - box * 0.14, y: centre + box * 0.25 },
  ];

  const spots = [
    { x: centre - box * 0.30, y: centre - box * 0.17, r: box * 0.062, color: WHITE },
    { x: centre - box * 0.35, y: centre, r: box * 0.046, color: WHITE },
    { x: centre - box * 0.30, y: centre + box * 0.17, r: box * 0.062, color: WHITE },
  ];

  for (let y = 0; y < size; y += 1) {
    for (let x = 0; x < size; x += 1) {
      // Inside the triangle the mark is white so it reads on both gradient ends.
      const cover = triangleCoverage(x, y, tri[0], tri[1], tri[2]);
      if (cover > 0) paint(png, x, y, WHITE, cover * 0.96);

      for (const spot of spots) {
        const spotCover = circleCoverage(x, y, spot.x, spot.y, spot.r);
        if (spotCover > 0) paint(png, x, y, spot.color, spotCover * 0.92);
      }
    }
  }

  return png;
}

/* ----------------------------------------------------------------- splash */

function drawSplash(width, height) {
  const png = new PNG({ width, height });

  for (let y = 0; y < height; y += 1) {
    for (let x = 0; x < width; x += 1) {
      // A dark canvas with the brand glows in two corners, matching the app's
      // `BrandBackdrop`, so the splash does not jump when the UI appears.
      const leftGlow = Math.max(0, 1 - Math.hypot(x / width, y / height) * 1.7);
      const rightGlow = Math.max(0, 1 - Math.hypot(1 - x / width, 0.25 - y / height) * 1.6);

      const base = { r: 7, g: 8, b: 14 };
      const withBlue = mix(base, BLUE, leftGlow * 0.34);
      const withMagenta = mix(withBlue, MAGENTA, rightGlow * 0.26);
      paint(png, x, y, withMagenta, 1);
    }
  }

  const size = Math.round(Math.min(width, height) * 0.34);
  const mark = drawIcon(size, { inset: 0.12, background: false });
  const offsetX = Math.round((width - size) / 2);
  const offsetY = Math.round((height - size) / 2);

  for (let y = 0; y < size; y += 1) {
    for (let x = 0; x < size; x += 1) {
      const src = (size * y + x) << 2;
      const alpha = mark.data[src + 3] / 255;
      if (alpha <= 0) continue;
      paint(
        png,
        offsetX + x,
        offsetY + y,
        { r: mark.data[src], g: mark.data[src + 1], b: mark.data[src + 2] },
        alpha,
      );
    }
  }

  return png;
}

/* ------------------------------------------------------------------- main */

await mkdir(outDir, { recursive: true });

const write = async (name, png) => {
  const buffer = PNG.sync.write(png);
  await writeFile(resolve(outDir, name), buffer);
  console.log(`${name}  ${png.width}×${png.height}  ${(buffer.length / 1024).toFixed(1)} kB`);
};

await write("icon.png", drawIcon(1024));
await write("adaptive-icon.png", drawIcon(1024, { inset: 0.24 }));
await write("splash.png", drawSplash(1242, 2436));
await write("notification-icon.png", drawIcon(96, { inset: 0.06, background: false }));
await write("favicon.png", drawIcon(48, { rounded: false }));

console.log(`\nAssets written to ${outDir}`);
