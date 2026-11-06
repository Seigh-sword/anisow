# AniLab — Kotlin rewrite

AniLab is an anime streaming client. This repository holds the decompiled
original (`sources/`) and a from-scratch Kotlin implementation of the same app
in `app/`.

## Layout

```
sources/            decompiled Java, kept for reference only
app/                the Kotlin app
  src/main/kotlin/com/xo/anilab/
    core/           Resource states, view extensions
    data/           models, Retrofit API, repository, watch-list store
    di/             service locator
    player/         hand-off to the external player
    push/           Firebase messaging service
    ui/             one package per feature
  src/main/res/     shared resources
gradle/             version catalog
```

Each feature lives in its own package: `home`, `latest`, `categories`,
`category`, `search`, `mylist`, `post`, plus `common` for the adapters that
several screens share.

## Architecture

- **Unidirectional data flow.** View models expose `StateFlow<Resource<T>>`;
  fragments and activities only render and forward events.
- **`Resource`** has three states and carries the last good data through a
  reload, so a pull-to-refresh does not blank the screen.
- **One repository** converts transport exceptions into a failure state with a
  message. Nothing above it catches network errors.
- **Paging** is a page counter with a `hasMore` flag (`Paged`), driven by
  `PagingScrollListener`. A failed page does not advance the counter, so
  scrolling again retries it.
- **The watch list** is device-local (DataStore, comma-separated ids). The
  backend only resolves ids to posts.

## Behaviour preserved from the original

- Five tabs, swapped in place rather than through a navigation graph; the home
  feed is shared with the activity so it loads once.
- The detail screen reloads itself with the season's id when a season is picked.
- Playing hands the episode to an external player: a component intent with the
  player package and activity, carrying `POST_ID` and `POST_TITLE`. When no app
  handles it, a sheet offers the download link instead.
- Push notifications can target a URL or a post id; both open from the launcher
  activity.

## Behaviour changed

- The start-up `Timer` + `APP_OPENED` flag that delayed the notification intent
  became ordinary lifecycle handling.
- Search is debounced instead of firing per keystroke.
- `synchronized` database access and `printStackTrace` error handling are gone;
  failures go through `Resource.Failure`.
- The AdMob dependency is dropped. The original links it but never shows an ad:
  no request is created and no banner is attached.

## Build

Create `app/google-services.json` from `app/google-services.json.example`, or
build without it — the Firebase plugins are only applied when the file exists,
and the SDKs are skipped at runtime when Firebase is not initialised. The
OneSignal app id in `strings.xml` is empty for the same reason.
