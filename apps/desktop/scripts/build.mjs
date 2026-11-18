/**
 * Build the desktop app.
 *
 * Two steps, in order:
 *
 *   1. build the web app, because the desktop app is that app in a window;
 *   2. run electron-builder over the result.
 *
 * Any arguments are passed straight through to electron-builder, so
 *
 *   node scripts/build.mjs --win --x64
 *
 * produces just the Windows installers.
 */

import { execFileSync, spawnSync } from "node:child_process";
import { existsSync, mkdirSync, copyFileSync } from "node:fs";
import { dirname, join, resolve } from "node:path";
import { fileURLToPath } from "node:url";

const HERE = dirname(fileURLToPath(import.meta.url));
const DESKTOP = resolve(HERE, "..");
const REPO = resolve(DESKTOP, "..", "..");
const WEB_DIST = join(REPO, "apps", "web", "dist");
const BUILD_RESOURCES = join(DESKTOP, "build");

/** Run a command, failing loudly. */
function run(command, args, cwd) {
  console.log(`\n> ${command} ${args.join(" ")}`);
  const result = spawnSync(command, args, { cwd, stdio: "inherit", shell: process.platform === "win32" });
  if (result.status !== 0) {
    console.error(`\n${command} failed with exit code ${result.status}.`);
    process.exit(result.status ?? 1);
  }
}

/**
 * The icons electron-builder wants.
 *
 * They are generated rather than committed, so the repository stays free of
 * binaries and the icons always match the brand.
 */
function ensureIcons() {
  mkdirSync(BUILD_RESOURCES, { recursive: true });

  const source = join(REPO, "apps", "web", "public", "favicon.png");
  const fallback = join(REPO, "apps", "mobile", "assets", "icon.png");

  if (existsSync(source)) {
    copyFileSync(source, join(BUILD_RESOURCES, "icon.png"));
  } else if (existsSync(fallback)) {
    copyFileSync(fallback, join(BUILD_RESOURCES, "icon.png"));
  } else {
    console.warn("No source icon found; electron-builder will use its default.");
    return;
  }

  // The Windows icon needs to be an .ico. electron-builder can build one from
  // a PNG, but only if the image is at least 256×256.
  try {
    execFileSync(
      process.execPath,
      [join(REPO, "tools", "assets", "make-icons.mjs")],
      { cwd: REPO, stdio: "inherit" },
    );
  } catch {
    console.warn("Icon generation failed; continuing without it.");
  }
}

console.log("AniSpots desktop build");

// 1. The web app.
run("npm", ["run", "build", "--workspace", "@anispots/web"], REPO);

if (!existsSync(WEB_DIST)) {
  console.error(`The web build did not produce ${WEB_DIST}.`);
  process.exit(1);
}

// 2. Icons.
ensureIcons();

// 3. The package.
const args = ["electron-builder"];
const extra = process.argv.slice(2);
if (extra.length > 0) args.push(...extra);
else args.push("--publish", "never");

run("npx", args, DESKTOP);

console.log("\nDone. The installers are in apps/desktop/dist.");
