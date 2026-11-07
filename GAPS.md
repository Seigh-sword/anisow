# Architecture Status & Remaining Boundaries

This document tracks what was previously broken or missing in the legacy AniLab client, what has been solved in the AniSpots (`@anispots/*`) workspace, and the remaining platform boundaries that are inherent to the upstream source.

---

## Resolved in AniSpots (`packages/*` & `apps/*`)

| Gap in legacy client | Status in AniSpots | How it works now |
| --- | --- | --- |
| **No built-in video player** (delegated to uninstalled `com.kyotoplayer` APK) | **Resolved** | `AniWatchClient.servers()` fetches `/api/theme/episode/servers?episodeId=` and base64-decodes `.server-item[data-hash]` into the real player URL (`zokoanime.video` / `megaplay.buzz`). Web embeds it via `<iframe>` and Mobile via `react-native-webview` (plus `expo-av` `<Video>` for downloaded local MP4s), controlled over the `zokoanime` `postMessage` bridge. |
| **Missing episode lists** (`seasons` only returned related series) | **Resolved** | `AniWatchClient.episodes()` reads `/api/theme/episode/list/{animeId}` (`{status, totalItems, html}`) and parses every `.ep-item` with its `data-id`, episode number, and title. Long runs get a searchable `EpisodeSheet` (Web) and `EpisodesScreen` (Mobile). |
| **Broken genre browsing** (`/genre/{slug}` returned 404) | **Resolved** | Probed against the live site (`tools/probe/genre-links.mjs`): the deployment serves `/genres/{slug}` (plural) and lists 48 genres inside `.hianime-genres-widget` on `/home`. Both `genres()` and `browse()` now use the verified plural route and are asserted in CI (`tools/smoke/smoke.mjs`). |
| **No offline downloads** | **Resolved** | `AniWatchClient.downloads()` parses `/api/theme/episode/downloads?episodeId=` into quality groups (`1080p`, `720p`, `360p`). Web downloads through `/api/dl?src=` into IndexedDB; Mobile downloads directly to `FileSystem.documentDirectory/anispots/` via `expo-file-system`. |
| **No watch progress or Continue Watching shelf** | **Resolved** | Both Web (`localStorage`) and Mobile (`AsyncStorage` + in-memory cache) persist playback position every 5 seconds and on unmount, surface a *Continue watching* rail on Home, and resume at `?time={seconds}` on the next play. |
| **Watchlist needed network to render** | **Resolved** | Watchlist and download entries persist `id`, `title`, `poster`, and `description` locally so Library and Watchlist work offline. |
| **No automated tests** | **Resolved** | 3-layer CI in `.github/workflows/verify.yml`: unit tests in `@anispots/core` (11/11), headless Chromium E2E in `tools/e2e/web.mjs`, and live upstream chain verification in `tools/smoke/smoke.mjs`. |
| **App icons & splash screens** | **Resolved** | `tools/assets/make-icons.mjs` deterministically rasterises `icon.png` (1024²), `adaptive-icon.png`, `splash.png` (1242×2436), `notification-icon.png` (96²), and `favicon.png` (48²), wired into `apps/mobile/app.json`. |

---

## Upstream & Environment Boundaries (Known Constraints)

1. **Subtitle tracks and quality switching live inside the embedded player.**
   - *Why:* `aniwatchtv.ws` does not serve raw `.m3u8` manifests in any page or API response; media decoding happens inside `zokoanime.video` / `megaplay.buzz` (verified in [`PROBE-FINDINGS.md`](PROBE-FINDINGS.md)).
   - *Design consequence:* AniSpots owns the outer player chrome (title, episode stepper, ±10s seek, scrubber synced via `postMessage`, controls lock, source/audio switcher, episode picker, and download sheet) while subtitle language (9 tracks) and playback speed (`0.25×`–`2×`) are controlled via the embedded player's own settings menu.

2. **Direct file downloads depend on upstream availability.**
   - *Why:* `/api/theme/episode/downloads?episodeId=` returns `{ status: false }` when the upstream source has not enabled direct file mirrors for that episode or requires an account session with *Settings → Features → Downloads* enabled.
   - *Design consequence:* Both `DownloadSheet` (Web) and `WatchScreen` (Mobile) detect `{ status: false }` or empty link sets and display a clear explanation rather than a broken or empty modal, while streaming continues uninterrupted.

3. **Native binary signing (EAS / Play Store / App Store).**
   - *Status:* `apps/mobile` typechecks cleanly and bundles into a production Hermes bytecode bundle (`npx expo export --platform android`) on every CI run. Producing a signed `.apk` / `.aab` or `.ipa` for store submission requires the owner's Apple Developer / Google Play keystore credentials via `eas build` or `expo prebuild`.
