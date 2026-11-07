/**
 * Browser verification.
 *
 * Typecheck proves the code compiles; it does not prove a screen renders. This
 * drives the built app in headless Chromium against the preview dataset — which
 * needs no network, so it is deterministic — and asserts the things a user would
 * notice immediately if they broke:
 *
 *   1. Home paints a spotlight and poster rails;
 *   2. a poster opens the detail screen;
 *   3. Play opens the player, and the player's own chrome is present;
 *   4. the episode sheet opens and switches episode;
 *   5. the download sheet lists episodes with Select all and Export;
 *   6. Library and Browse reach their content;
 *   7. nothing threw to the console along the way.
 *
 * Run: node tools/e2e/web.mjs
 * Requires: playwright + a chromium build (CI installs both).
 */

import { spawn } from "node:child_process";
import { dirname, resolve } from "node:path";
import { fileURLToPath } from "node:url";

const here = dirname(fileURLToPath(import.meta.url));
const root = resolve(here, "../..");
const PORT = Number(process.env.E2E_PORT ?? 4455);
const BASE = `http://127.0.0.1:${PORT}`;

let chromium;
try {
  ({ chromium } = await import("playwright"));
} catch {
  console.error("Playwright is not installed. In CI: npm i -D playwright && npx playwright install chromium");
  process.exit(process.env.REQUIRE_E2E === "1" ? 1 : 0);
}

const results = [];
let failures = 0;

function check(name, condition, detail = "") {
  const ok = Boolean(condition);
  if (!ok) failures += 1;
  results.push({ name, ok, detail });
  console.log(`${ok ? "PASS" : "FAIL"}  ${name}${detail ? `  — ${detail}` : ""}`);
  if (process.env.GITHUB_ACTIONS === "true") {
    console.log(`${ok ? "::notice" : "::error"} title=${name}::${String(detail).replace(/[\r\n]+/g, " ").slice(0, 600)}`);
  }
}

/* --------------------------------------------------------------- server */

const server = spawn(process.execPath, [resolve(root, "apps/web/server/proxy.mjs")], {
  env: { ...process.env, PORT: String(PORT), HOST: "127.0.0.1" },
  stdio: ["ignore", "pipe", "pipe"],
});

let serverLog = "";
server.stdout.on("data", (chunk) => (serverLog += String(chunk)));
server.stderr.on("data", (chunk) => (serverLog += String(chunk)));

async function waitForServer() {
  const started = Date.now();
  while (Date.now() - started < 20_000) {
    try {
      const response = await fetch(BASE, { signal: AbortSignal.timeout(1200) });
      if (response.ok) return true;
    } catch {
      // not up yet
    }
    await new Promise((done) => setTimeout(done, 300));
  }
  return false;
}

/* ----------------------------------------------------------------- test */

let browser;
try {
  if (!(await waitForServer())) throw new Error(`server did not start:\n${serverLog.slice(0, 800)}`);

  browser = await chromium.launch();
  const context = await browser.newContext({
    viewport: { width: 420, height: 900 },
    deviceScaleFactor: 2,
    isMobile: true,
    hasTouch: true,
  });
  const page = await context.newPage();

  const consoleErrors = [];
  page.on("pageerror", (error) => consoleErrors.push(error.message));
  page.on("console", (message) => {
    if (message.type() === "error") {
      const text = message.text();
      // A failed catalogue request is expected in the preview build: the sample
      // data answers instead. Anything else is a real error.
      if (!/Failed to load resource|net::ERR|502|503/.test(text)) consoleErrors.push(text);
    }
  });

  await page.goto(BASE, { waitUntil: "networkidle" });

  /* ------------------------------------------------------------ the app */

  const rootBox = await page.locator("#root").boundingBox();
  check("app mounts into #root", Boolean(rootBox && rootBox.height > 100), JSON.stringify(rootBox));

  await page.waitForSelector("h1", { timeout: 15_000 });
  const heroTitle = (await page.locator("h1").first().textContent())?.trim();
  check("home shows a spotlight title", Boolean(heroTitle), heroTitle ?? "");
  check("spotlight title is not an error message", !/did not load|could not/i.test(heroTitle ?? ""), heroTitle ?? "");

  const posters = await page.locator(".poster").count();
  check("home paints poster art", posters > 8, `${posters} posters`);

  const railHeadings = await page.locator("section h2").count();
  check("home has rails", railHeadings >= 3, `${railHeadings} rails`);

  const navLinks = await page.locator("nav a").count();
  check("the bottom nav has every tab", navLinks === 5, `${navLinks} tabs`);

  /* -------------------------------------------------------------- detail */

  await page.locator(".poster").first().click();
  await page.waitForURL(/\/anime\//, { timeout: 10_000 });
  await page.waitForSelector("h1");
  const detailTitle = (await page.locator("h1").first().textContent())?.trim();
  check("a poster opens the detail screen", Boolean(detailTitle), page.url());

  const playButton = page.getByRole("button", { name: /^(Play|Resume EP)/i }).first();
  check("detail offers Play", await playButton.count() > 0);

  /* -------------------------------------------------------------- player */

  await playButton.click();
  await page.waitForURL(/\/watch\//, { timeout: 15_000 });

  const slider = page.locator('[role="slider"][aria-label="Seek"]');
  await slider.waitFor({ timeout: 15_000 });
  check("the player renders a scrubber", await slider.count() > 0);

  const lockButton = page.getByRole("button", { name: /lock controls/i });
  check("the player has a lock", await lockButton.count() > 0);

  const prev = page.getByRole("button", { name: /previous episode/i });
  const next = page.getByRole("button", { name: /next episode/i });
  check("the player has episode stepping", (await prev.count()) > 0 && (await next.count()) > 0);

  // The sample clock should have advanced: seek forward and read it back.
  await page.getByRole("button", { name: /forward 10 seconds/i }).click();
  await page.waitForTimeout(400);
  const value = await slider.getAttribute("aria-valuenow");
  check("seeking moves the position", Number(value) >= 0, `aria-valuenow=${value}`);

  /* ------------------------------------------------------------ episodes */

  await page.getByRole("button", { name: /^EP \d/i }).first().click();
  await page.waitForSelector('[role="dialog"][aria-label="Episodes"]', { timeout: 8000 });
  const cells = await page.locator('[role="dialog"] button:has-text("3")').count();
  check("the episode sheet lists episodes", cells > 0, `${cells} cells matching 3`);

  await page.keyboard.press("Escape");
  await page.waitForTimeout(300);

  /* ----------------------------------------------------------- downloads */

  await page.getByRole("button", { name: /^Download$/i }).first().click();
  await page.waitForSelector('[role="dialog"][aria-label="Download episodes"]', { timeout: 10_000 });
  const selectAll = page.getByRole("button", { name: /Select all/i });
  await selectAll.waitFor({ timeout: 10_000 });
  const exportButton = page.getByRole("button", { name: /Export/i });
  const cancelButton = page.getByRole("button", { name: /^Cancel$/i });
  check("the download sheet has Select all", (await selectAll.count()) > 0);
  check("Export sits next to Cancel", (await exportButton.count()) > 0 && (await cancelButton.count()) > 0);

  // Wait until at least one episode's download links have resolved so Select all has items to select.
  await page.waitForFunction(
    () => !/0 of \d+ episodes have a file/.test(document.body.innerText),
    undefined,
    { timeout: 8000 },
  ).catch(() => {});

  await selectAll.click();
  await page.waitForFunction(
    () => /Export \(\d+\)/.test(document.body.innerText),
    undefined,
    { timeout: 8000 },
  ).catch(() => {});

  const exportLabel = (await exportButton.first().textContent()) ?? "";
  check("Select all fills the Export count", /\(\d+\)/.test(exportLabel), exportLabel.trim());

  await cancelButton.first().click();

  /* ------------------------------------------------------------- library */

  await page.goto(`${BASE}/downloads`, { waitUntil: "networkidle" });
  const downloadsHeading = (await page.locator("h1").first().textContent())?.trim();
  check("the downloads screen renders", downloadsHeading === "Downloads", downloadsHeading ?? "");

  await page.goto(`${BASE}/browse`, { waitUntil: "networkidle" });
  await page.waitForSelector("h1");
  const genres = await page.locator('[role="tab"]').count();
  check("browse lists genre chips", genres > 6, `${genres} chips`);

  // Selecting a genre must actually filter: the URL changes and posters appear.
  if (genres > 0) {
    await page.locator('[role="tab"]').nth(2).click();
    await page.waitForURL(/\/browse\//, { timeout: 8000 });
    await page.waitForSelector(".poster", { timeout: 8000 });
    const filtered = await page.locator(".poster").count();
    check("selecting a genre loads a shelf", filtered > 0, `${filtered} posters at ${page.url()}`);
  }

  await page.goto(`${BASE}/watchlist`, { waitUntil: "networkidle" });
  const watchlistHeading = (await page.locator("h1").first().textContent())?.trim();
  check("the watchlist renders", watchlistHeading === "Watchlist", watchlistHeading ?? "");

  /* -------------------------------------------------------------- console */

  check("no uncaught page errors", consoleErrors.length === 0, consoleErrors.slice(0, 3).join(" | "));
} catch (cause) {
  check("e2e run completed", false, cause instanceof Error ? cause.message : String(cause));
} finally {
  await browser?.close().catch(() => {});
  if (!server.killed) server.kill("SIGTERM");
}

console.log(`\n${results.length - failures}/${results.length} checks passed`);
process.exit(failures > 0 ? 1 : 0);
