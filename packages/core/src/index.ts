/**
 * @anispots/core — everything that is not a screen.
 *
 * The app (web, Android, iOS) depends on this and nothing else, so the site can
 * change in one place: `AniWatchClient`. The verified routes live in
 * PROBE-FINDINGS.md at the repository root.
 */

export * from "./model.ts";
export {
  AniWatchClient,
  createClient,
  DEFAULT_ANIKOTO_BASE,
  DEFAULT_BASE,
  DEFAULT_ZOKO_BASE,
} from "./api/client.ts";
export type { ClientOptions, Result } from "./api/client.ts";
export {
  decodeEmbedHash,
  parseDownloads,
  parseEpisodes,
  parseServers,
  readFragment,
} from "./parse/fragments.ts";
export type { FragmentResponse } from "./parse/fragments.ts";
export { animeIdFromHref, decodeEntities, text } from "./parse/html.ts";
