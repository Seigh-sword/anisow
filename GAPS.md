# What is missing, and why

A map of every gap between this app and a fully working anime client, ordered by
what actually stops it from being usable. Written after checking the live API and
the decompiled original, not from assumption.

## Where the data comes from

```kotlin
// app/src/main/kotlin/com/xo/anilab/data/remote/NetworkModule.kt
const val BASE_URL = "https://anilab2.amdapi.click/api/"
```

That is the **same host the original app used** — `sources/E1/AbstractC0660a.java`
line 61. There is no other API, no API key and no auth header in either app; the
endpoints are `/home`, `/latest`, `/category?id&page`, `/categories`, `/post?id`,
`/search?query&page`, `/config`, `POST /list`. All of them answer today, so the
backend is live — it is not the reason anything is blank.

## The two things that were actually broken

**1. Every screen with a score failed to load.** `/home` and `/post` send
`"score":"8.2"` as a *quoted string*. The models declared `Float?`, so Moshi threw
a bind error, the repository turned it into a network failure, and Home plus every
detail page showed an error instead of content. Fixed: both are `String?` now.

**2. "Watch" could never work on an emulator.** The original never had a player.
It built a `ComponentName(playerConfig.packageName, playerConfig.activityName)`
intent pointing at an app called **KYOTO Player** (`com.kyotoplayer`), and on
failure opened a `market://` store link. A stock emulator has no Play Store, so
that link resolves to nothing: the tap looked like it did nothing. The payload's
player is a *third-party app*, not a screen in this app — there is no video stream
URL anywhere in the API or in the original code.

## Still missing, in priority order

### 1. A built-in video player — the real gap
The API exposes **no stream URL**. `providers` exists in `/post` but is always
`[]` and the original client does not even parse it. Playback depends entirely on
the external KYOTO app, which is the original design and remains the design here.

A real built-in player needs a source, and the options are:
- **Its own scraper**: the player app is what holds the stream logic; this backend
  only names it. Without that app's internals there is nothing to play.
- **A web view fallback**: open the title's share/embed page in a `WebView` with
  media playback enabled. Works today for pages that exist, no scraping needed.
- **Media3/ExoPlayer**: only useful once a URL exists, and ~2 MB of app size.

Recommendation: add the `WebView` fallback next. It is the only option that
produces actual video without reverse-engineering someone else's player.

### 2. Filters that the backend cannot serve
`/search` and `/latest` ignore every extra parameter — `category=`, `type=`,
`genre=` all return byte-identical payloads — and list items carry only `id`,
`poster` and `age`. So:
- a **client-side** Movies/Series filter is impossible (no type field), and
- a **server-side** one does not exist.

What shipped is what the API can do: `/category?id=` as a chip row in Search, plus
free-text search. Sorting and multi-genre filtering would need a different backend
or an N-request fan-out.

### 3. Episode lists
`seasons` is really a list of *related entries* ("Side Story", "Summary",
"Alternative Setting", "Parent Story"), not episodes — even a 1000-episode series
returns a couple of dozen. There is no episode endpoint. An episode list has to be
mapped from those child posts, with no numbering and no per-episode poster.

### 4. Nothing is cached
Every tab reloads from the network; a poster URL is fetched again on each
`onBindViewHolder` (Glide's disk cache helps, but there is no API response cache).
Adding `OkHttp` `Cache` plus `StaleWhileRevalidate` on the poster requests would
make the app usable on a bad connection, and would cut the cold-start cost.

### 5. Tests
There are no unit tests. The static checker (`tools/check_sources.py`) catches
resource/id mistakes only. The repository layer is pure and trivially testable
with a fake `AniLabApi`; that is the cheapest place to start.

### 6. Proper build variants
Debug and release differ only by a suffix. Release lacks `minifyEnabled`,
proguard rules, and any real signing config — CI only produces debug APKs, which
is deliberate (they install without a keystore) but is not shippable.

### 7. Push is configured but unused
`one_signal_app_id` is empty and `google-services.json` is not committed, so no
building block is active. The FCM service and the OneSignal handshake exist and
are correctly guarded; they just have no credentials.

### 8. Quality of life
- No offline watchlist details (watchlist stores ids only, then resolves over the
  network each visit).
- No "continue watching", because there is no playback state.
- Posters are `small`; detail pages could use the `large` variant.
- No empty/season-shelf paging for seasons in one screen.

## Repo housekeeping

- `sources/` — 4,543 decompiled `.java` files, kept deliberately as reference and
  excluded from the build (`sourceSets["main"].kotlin.srcDir("src/main/kotlin")`
  only). It is the only reason the repo is large. `gradle :app:assembleDebug`
  never compiles it, but it is also not in a submodule or archive branch.
- The Android package id, Gradle namespace and class names (`AniLabApp`,
  `AniLabApi`, `AniLabRepository`) still say AniLab. Only the user-visible name is
  **TryAnime**. Renaming the package would keep the old install around as a
  separate app; that can be done in one commit if wanted.
- The CI artifact is still named `anilab-apk`.
