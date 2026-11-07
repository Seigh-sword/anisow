# AniSpots — Watch any Anime

AniSpots is a multi-platform anime discovery, streaming, and offline library client built around the verified `aniwatchtv.ws` API surface (see [`PROBE-FINDINGS.md`](PROBE-FINDINGS.md)). It ships as a workspace monorepo covering Web and native Mobile (Android & iOS via Expo / React Native), sharing a zero-dependency core client, HTML fragment parser, and liquid-glass design system.

*(The original Kotlin Android client and decompiled reference remain in `app/` and `sources/` for historical comparison.)*

---

## Workspace Layout

```
packages/
  core/        @anispots/core — AniWatchClient, HTML & fragment parsers, domain models, unit tests
  design/      @anispots/design — brand palette, typography, spacing tokens, and glass CSS
apps/
  web/         @anispots/web — React 19 + Vite SPA and production proxy server (server/proxy.mjs)
  mobile/      @anispots/mobile — Expo 52 / React Native 0.76 app for Android and iOS
tools/
  assets/      make-icons.mjs — deterministic PNG rasteriser for app icons & splash screens
  e2e/         web.mjs — Playwright Chromium end-to-end verification suite
  smoke/       smoke.mjs — live upstream chain walker through the proxy
  probe/       diagnostic scripts used to verify the live upstream routes
.github/workflows/
  verify.yml   3-job CI gate: Typecheck/Test/Build, Browser E2E, and Live Chain Smoke
```

---

## Architecture & Verified Upstream Chain

Every route in `@anispots/core` was verified against the live deployment before being written (documented in [`PROBE-FINDINGS.md`](PROBE-FINDINGS.md)):

```
GET  /home                                     -> spotlight, rails, and hianime-genres-widget
GET  /genres/{slug}                            -> genre shelves (plural /genres/, not /genre/)
GET  /watch/{slug}-{id}                        -> episode ids (?ep=NNNN)
GET  /api/theme/episode/list/{animeId}         -> {status, totalItems, html} episode list
GET  /api/theme/episode/servers?episodeId=     -> {status, html} server buttons with base64 data-hash
     atob(data-hash)                           -> https://zokoanime.video/stream/mal/{mal}/{ep}/{sub|dub}
GET  /api/theme/episode/downloads?episodeId=   -> {status, html} 360p / 720p / 1080p file links
```

### Key Design Decisions

1. **Result-typed client, zero uncaught parser errors.** Every method on `AniWatchClient` returns `Result<T>` (`{ ok: true, data } | { ok: false, error }`). Upstream markup changes or network blips surface as clean retry states rather than crashing a screen.
2. **Embedded player with `postMessage` bridge.** Because the video stream lives inside `zokoanime.video` / `megaplay.buzz`, both Web (`<iframe>`) and Mobile (`react-native-webview` / `expo-av` for local files) embed the player directly and drive it over the `zokoanime` `postMessage` channel (`seek`, `play`, `pause`, `autoplay`, `autonext`, `state`, and `progress` frames).
3. **First-class offline downloads & library.**
   - **Download picker sheet** on both Detail and Watch screens with **Select all**, quality pills (`1080p`, `720p`, `360p`), and **Export (N)** beside **Cancel**.
   - **Web** streams files through `/api/dl?src=` into IndexedDB blobs; **Mobile** writes directly to `FileSystem.documentDirectory/anispots/*.mp4` via `expo-file-system` `DownloadResumable`.
   - Offline entries store anime title, cover art, and synopsis alongside the episode so the library remains browsable with no network connection.
4. **Deterministic preview build (`VITE_DEMO=1`).** When built with `VITE_DEMO=1`, the web client points at a fast-failing offline endpoint and answers from a self-contained SVG-illustrated sample catalogue. A visible `Preview · sample data` badge in the header ensures sample data is never mistaken for live data.

---

## Visual Language

- **Brand gradient:** Electric blue (`#007BFF`) → violet (`#7B3DFF`) → magenta (`#FF00FF`) on a deep ink canvas (`#07080E`).
- **Liquid glass surfaces:** Three elevation levels (`subtle`, `regular`, `heavy`) with translucent fills, specular top hairlines, and backdrop blur (`backdrop-filter` on web, `expo-blur` + `expo-linear-gradient` on native).
- **One primary gradient button per screen:** `BrandButton` / `GradientSurface` is reserved for the primary action (e.g. *Play* / *Resume EP N* or *Export*); secondary actions use glass pills so the artwork leads.

---

## Commands

```bash
# Install all workspace dependencies
npm install

# Typecheck all packages and apps (@anispots/core, @anispots/design, @anispots/web, @anispots/mobile)
npm run typecheck

# Run parser unit tests (11/11 in packages/core)
npm test

# Start the web dev server (proxies /api/ani -> https://aniwatchtv.ws)
npm run dev

# Start the web dev server in deterministic offline preview mode
npm run dev:demo

# Build web for production and run the production proxy server (:4173)
npm run build
npm start

# Regenerate all 5 mobile & web store PNG assets (icon, adaptive-icon, splash, notification, favicon)
npm run icons

# Export the native Android JS/Hermes bundle via Expo Metro
cd apps/mobile && npx expo export --platform android --output-dir /tmp/anispots-bundle
```

---

## Continuous Integration (`.github/workflows/verify.yml`)

Every push runs three independent verification jobs:

1. **Typecheck, test, build (`build`)** — Runs `tsc --noEmit` across every workspace, runs the `@anispots/core` unit test suite, builds `@anispots/web`, bundles `@anispots/mobile` with `expo export --platform android`, regenerates store icons via `npm run icons`, and verifies the production server answers `200 OK`.
2. **Render the app in a browser (`e2e`)** — Builds the deterministic preview bundle (`build:demo`) and drives it in headless Chromium via Playwright (`tools/e2e/web.mjs`), verifying Home spotlight & rails, Detail navigation, Player scrubber/seek/lock/episode steppers, Episode sheet, Download sheet (`Select all` → `Export (12)`), Downloads, Browse genre chips & filtering, Watchlist, and zero console/page errors.
3. **Walk the live chain (`smoke`)** — Starts `apps/web/server/proxy.mjs` against the live `aniwatchtv.ws` upstream (`tools/smoke/smoke.mjs`) and verifies `/home`, `/genres/action`, watch page episode IDs, `/api/theme/episode/list/{id}`, `/api/theme/episode/servers`, `data-hash` base64 decode to a real player origin, `/api/theme/episode/downloads`, and the `/api/dl` host allow-list.
