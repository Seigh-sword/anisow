# AniLab — Kotlin rewrite

AniLab is an anime streaming client. `sources/` holds the decompiled original for
reference; `app/` is a from-scratch Kotlin implementation of the same app.

## Layout

```
app/src/main/kotlin/com/xo/anilab/
  core/      Resource states, view extensions, the gradient text helper
  data/      models, Retrofit API, repository, watch-list and notice stores
  di/        service locator
  player/    hand-off to the external player
  push/      Firebase messaging service
  ui/        one package per feature
app/src/main/res/    layouts, theme, drawables
tools/check_sources.py   static audit of ids, resources and @refs
.github/workflows/   CI that builds an installable APK
```

Each feature owns its package: `home`, `latest`, `categories`, `category`,
`search`, `mylist`, `post`, `notice`, plus `common` for the adapters several
screens share.

## Architecture

- **Unidirectional data flow.** View models expose `StateFlow<Resource<T>>`;
  screens render and forward events, nothing else.
- **`Resource`** has three states and carries the last good data through a
  reload, so a pull-to-refresh does not blank the screen.
- **One repository** turns transport exceptions into a failure state with a
  message, so no caller catches network errors.
- **Paging** is a page counter plus a `hasMore` flag, driven by one scroll
  listener. A failed page does not advance the counter, so scrolling retries it.
- **Re-entrancy is a job, not a flag.** A refresh or a new search cancels the
  request it supersedes. A boolean guard drops the newer request instead, which
  is how the earlier search silently showed one query's results for another.
- **The watch list** is device-local (DataStore). The backend only resolves ids
  to posts.

## Look

Blue (`#007BFF`) to magenta (`#FF00FF`) gradient on a dark base, with glass
surfaces over the artwork:

- `bg_gradient_brand` — the gradient, for primary actions and accents
  (`brand_start` `#FF007BFF` → `brand_end` `#FFFF00FF`).
- `bg_glass`, `bg_glass_chip`, `bg_glass_bar`, `bg_glass_circle`,
  `bg_window` — translucent fills with a gradient hairline, used by the bottom
  bar, toolbars, chips and sheets. The bottom bar floats, so posters scroll
  under it.
- `GradientText` — the gradient as a text fill for the hero and the four screen
  titles. It is a `LinearGradient` shader on the paint, rebuilt only when the
  text geometry changes.

**On the "real" blur:** Android has no backdrop blur before API 31
(`RenderEffect` is Android 12+), so the bloom on a panel is faked honestly with
translucency, a hairline and elevation. Everything reads correctly from API 23.
If you want a blurred backdrop specifically, it has to be API 31+ only — say so
and it can be added as an opt-in layer.

## Behaviour preserved

- Five tabs swapped in place; the home feed is shared with the activity so it
  loads once.
- The detail screen reloads itself with a season's id when a season is picked.
- Playing hands the episode to an external player: a component intent with the
  player package and activity, carrying `POST_ID` and `POST_TITLE`. When nothing
  handles it, a sheet offers the store link.
- Notices from `/config` are shown once per install; a `force` notice cannot be
  dismissed and a `persistent` one returns every launch.
- Push payloads can target a URL or a post id; both open from the launcher.

## Behaviour changed

- The start-up `Timer` + `APP_OPENED` flag became lifecycle handling.
- Search is debounced instead of firing per keystroke.
- `printStackTrace` error paths became one central handler; failures travel as
  `Resource.Failure`.
- A failed first load is retried once from `HomeActivity`; the original left the
  feed empty with nothing to tap.
- Empty states are on screen. Search said "nothing here yet" in a toast that
  disappeared, and an empty watch list was a blank grid under a heading that
  renamed itself.
- **No ads.** The decompiled original had no working ad path and no ad SDK
  linked, so there was nothing to remove and nothing is referenced: no AdMob
  dependency, no ad identifier, no ad layout.

## Removed

- OneSignal is only initialised when `one_signal_app_id` is non-empty; a build
  without the id has no push SDK code path at all.
- `core/Glass.kt`, `core/Connectivity.kt` and the fake-blur helpers were
  dropped: they did nothing the drawables do not do correctly.
- Unused strings, colours and drawables (`error_generic`, `empty_result_body`,
  `color_surface_elevated`, `color_shadow`, `bg_chip`) went with them.

## Build

```bash
gradle :app:assembleDebug          # -> app/build/outputs/apk/debug/
python3 tools/check_sources.py     # ids, R refs, dangling @refs
```

The static checker exists because ids and resource names are strings the Kotlin
compiler only checks in a full build; it turns a two-minute CI failure into a
one-second local one. It runs as the first step of CI.

There is no Gradle wrapper in the repository, so use an installed Gradle 8.14
(or run `gradle wrapper` once to get `./gradlew`). CI installs Gradle itself.
Gradle 9 is not supported by AGP 8.7, which is why CI pins the last 8.x.

Firebase is optional: `app/google-services.json` is gitignored, the plugins are
only applied when it exists, and the SDKs are skipped at runtime when Firebase is
not initialised. Copy `app/google-services.json.example` to enable it locally, or
set a `GOOGLE_SERVICES_JSON` repository secret for CI. The OneSignal app id in
`strings.xml` is empty for the same reason.

## CI

`.github/workflows/build-apk.yml` builds a debug APK on every push to `main` or
the working branch, and on demand:

1. JDK 17, Android SDK packages (`platforms;android-35`, `build-tools;35.0.0`)
   and Gradle, installed explicitly so a failure names the step.
2. `tools/check_sources.py`, which fails in seconds on a bad id.
3. `:app:assembleDebug`. Compiler errors are re-emitted as `::error::`
   annotations, because annotations are readable from the API even when the raw
   job log is not.
4. The APK is copied to `dist/anilab-debug-<sha>.apk` and uploaded as the
   `anilab-apk` artifact; a red build uploads `build-logs` instead.

Debug APKs are signed with the generated debug keystore, so they install
directly. Download the artifact, unzip it, and open the `.apk` on the phone
(allow "install unknown apps" for the file manager once).
