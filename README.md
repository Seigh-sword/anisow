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
- **The watch list** is device-local (DataStore). The backend only resolves ids
  to posts.

## Look

Blue (`#007BFF`) to magenta (`#FF00FF`) gradient on a dark base, with glass
surfaces over the artwork:

- `bg_gradient_brand` — the gradient, for primary actions and accents.
- `bg_glass*` — translucent fills with gradient hairlines, used by the bottom
  bar, toolbar, chips and panels.
- `GradientText` — the gradient as a text fill for the hero and screen titles.

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
- No ad code: the original had no working ad path, and no ad dependency is
  linked.

## Build

```bash
gradle :app:assembleDebug          # -> app/build/outputs/apk/debug/
```

There is no Gradle wrapper in the repository, so use an installed Gradle 8.11
(or run `gradle wrapper` once to get `./gradlew`). CI installs Gradle itself.

Firebase is optional: `app/google-services.json` is gitignored, the plugins are
only applied when it exists, and the SDKs are skipped at runtime when Firebase is
not initialised. Copy `app/google-services.json.example` to enable it locally, or
set a `GOOGLE_SERVICES_JSON` repository secret for CI. The OneSignal app id in
`strings.xml` is empty for the same reason.

## CI

`.github/workflows/build-apk.yml` builds a debug APK on every push to `main` or
the working branch, and on demand. Download it from the run's **Artifacts**
(`anilab-apk`). Debug APKs are signed with the generated debug keystore, so they
install directly.
