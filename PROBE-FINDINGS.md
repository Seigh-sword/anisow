# aniwatchtv.ws — verified API surface

Every route below was called and answered while writing this document. This is
the replacement for the dead Aniwatch API, and it is the contract the app is
built against.

## Why the old clients fail

`aniwatchtv.ws` is **not** the old hianime/aniwatch codebase. Every `/ajax/v2/…`
route that every published scraper uses returns **404**. That is why
`aniwatch@2.27.9`, `@genga-movie/aniwatch` and `codex0555/Aniwatch-Api` all fail
against it even with the right domain. The routes moved to a REST prefix that the
watch page declares in its own markup.

## The declaration

Every watch page carries:

```js
window.hianime_ajax    = { ajax_url: 'https://aniwatchtv.ws/api/theme/ajax',
                           rest_url: 'https://aniwatchtv.ws/api/theme/', nonce: '' }
window.hianime_ep_ajax = { rest_url: 'https://aniwatchtv.ws/api/theme/' }
```

So the API root is `https://aniwatchtv.ws/api/theme/`. Read it from the page
rather than hardcoding it; it is the site's own statement of where its API lives.

## Endpoints that answered

| Route | Returns |
| --- | --- |
| `GET /api/theme/episode/servers?episodeId={epId}` | `{status, html}` — HTML of the server buttons |
| `GET /api/theme/episode/list/{animeId}` | `{status, totalItems, html}` — HTML of every episode |
| `GET /api/theme/episode/downloads?episodeId={epId}` | `{status, html}` — HTML of download groups |
| `POST /api/theme/continue-watching` | writes watch position (needs an account) |
| `GET /api/theme/auth/state` | session state |

Both `episode/*` routes answer **fragments of HTML, not JSON models**. That is a
deliberate anti-scraping choice: the markup is not in the CDN-cached watch page,
so one page load cannot yield every URL. Any client has to parse the fragments.

## Servers → the actual player URL

This is the part the old scrapers get wrong, and the reason a "stream URL" was
never available:

1. `episode/servers` returns markup whose `.server-item` elements carry a
   **base64 `data-hash`**.
2. The site's own JS does `loadPlayer(atob(hash), …)` — the hash **decodes to the
   player's embed URL**.
3. That embed is a third-party page on one of exactly two hosts:

```js
var PLAYER_ORIGINS = ['https://zokoanime.video', 'https://megaplay.buzz'];
```

4. The embed accepts playback preferences on its query string, which is how the
   site drives it:

| Param | Meaning |
| --- | --- |
| `autostart=true\|false` | begin playing on load |
| `asi=1\|0` | auto-skip intro |
| `autonext=1\|0` | follow with the next episode |
| `time={seconds}` | start offset (used for "continue watching" and comment timestamps) |

5. `zokoanime.video` also accepts commands over `postMessage`
   (`{channel:'zokoanime', type:…}`): `seek {time}`, `play`, `pause`,
   `autoplay|autoskip|autonext {on}`, `state`. It announces `ready`; only after
   that is it driven this way. It posts back `progress {currentTime,duration}`,
   `complete`, `ended`, `error`, and `fullscreen {request|active}`.

**There is no `.m3u8` in any response this site serves.** The video lives inside
the third-party embed, behind its own player. That is the whole architecture, and
it means the embedded URL is the maximum any client can legitimately obtain.

## What this means for the app (decided, not guessed)

Because the media is inside a player we do not control, the app **embeds that
player** rather than reimplementing it:

- **Web**: an `<iframe>` to the embed URL with the prefs above, plus the same
  `postMessage` bridge the site uses — so seek, autoplay, autoskip, autonext and
  progress all work.
- **Android/iOS**: `react-native-webview` at the same URL. Native-side controls
  (episode list, next/prev, downloads, subtitles where the embed exposes them)
  drive the WebView via injected `postMessage`.

What we own and build properly: around the embed — glass UI, vertical posters,
episode selection with `totalItems` paging, the downloads sheet, watch progress,
auto-next at the app level, and every control that does not require owning the
decoder.

What we cannot honestly claim: a custom native decoder with our own subtitle and
quality menus. Those live inside the third-party player, in its UI. Faking them
over an iframe would be a picture of a button.

## Downloads

`episode/downloads` returns groups (`Kiwi Sub → 360p / 720p / 1080p`) whose links
are ordinary files — these **are** downloadable, unlike the stream. So
"download selected episodes / select all / export" is real, using those URLs,
with the anime's cover and description stored alongside for the offline library.
Note the endpoint answers `status:false` unless the account has Settings →
Features → Downloads enabled; the app must handle that rather than showing an
empty sheet.

## Verification status

| Thing | Status |
| --- | --- |
| Site reachable, pages parse | verified (GitHub Actions runner) |
| `/home` listing, slugs, ids | verified |
| Watch page → episode ids | verified (23 ids on one title) |
| `episode/servers` → `{status:true, html}` | verified (direct fetch) |
| `episode/list/{id}` → `totalItems` + html | verified (direct fetch) |
| `episode/downloads` → quality groups | verified (direct fetch) |
| `data-hash` → embed URL decode | verified from the site's own JS (`atob`) |
| Embed hosts, query params, postMessage | verified from the site's own JS |
| `data-hash` decode, live | **verified**: `aHR0cHM6Ly96b2tvYW5pbWUudmlkZW8v…` → `https://zokoanime.video/stream/mal/63818/1/sub` |
| Embed page loads a real player | **verified** — subtitles in 9 languages, speed 0.25×–2× |
| `.m3u8` extraction | **does not exist** on this site |

## The verified chain, in full

```
GET  /home                                     -> rails, slugs, ids
GET  /watch/{slug}-{id}                        -> episode ids (?ep=NNNN)
GET  /api/theme/episode/servers?episodeId=     -> {status,html}
     html .server-item[data-hash] -> base64    -> https://zokoanime.video/stream/mal/{mal}/{ep}/{sub|dub}
GET  https://zokoanime.video/stream/mal/...    -> real player, 9 subtitle langs, 0.25x-2x speed
GET  /api/theme/episode/list/{animeId}         -> totalItems + episode html
GET  /api/theme/episode/downloads?episodeId=   -> 360p / 720p / 1080p download links
```

A live decode, from the probe run: `aHR0cHM6Ly96b2tvYW5pbWUudmlkZW8vc3RyZWFtL21hbC82MzgxOC8xL3N1Yg==`
→ `https://zokoanime.video/stream/mal/63818/1/sub`.

Fetching that embed returns a working video.js page whose own settings menu lists
the subtitle tracks and the speed ladder. So the features the app needs —
subtitles, speed, quality, fullscreen, PiP — **exist inside that player**. The app
embeds it and drives it; it does not reimplement it. That is the honest design,
and it is why the feature list is achievable rather than aspirational.

One caveat worth knowing: the embed refuses playback without a browser session
(it answered `Error Code: 232011` to a bare fetch), which is expected for a
player page and is exactly why the app loads it as an iframe/WebView rather than
trying to extract a media URL.
