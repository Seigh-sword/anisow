import { createClient, type Result } from "@anispots/core";

/**
 * The one client.
 *
 * In a browser the site cannot be called directly (no CORS headers), so every
 * request goes through `/api/ani`, which Vite proxies in development and a small
 * proxy does in production. In the native app there is no origin, so the client
 * talks to the site itself.
 */
/**
 * `VITE_DEMO=1` points the client at a host that cannot exist, which makes the
 * preview build deterministic: every request fails fast and the sample data
 * answers. Without it the build talks to the real catalogue through
 * `VITE_ANI_BASE` (or the same-origin proxy). It is a build flag, not a runtime
 * switch, so a deployed bundle can never end up in demo mode by configuration.
 */
const DEMO = import.meta.env.VITE_DEMO === "1";
const OFFLINE_BASE = "http://127.0.0.1:9/offline-preview";

export const api = createClient({
  baseUrl: DEMO ? OFFLINE_BASE : (import.meta.env.VITE_ANI_BASE ?? "/api/ani"),
  anikotoBaseUrl: DEMO ? OFFLINE_BASE : (import.meta.env.VITE_ANIKOTO_BASE ?? "/api/anikoto"),
  timeoutMs: DEMO ? 1_500 : 20_000,
});

/** True when the app is talking through the dev proxy rather than the real host. */
export const usingProxy = api.baseUrl === "/api/ani";

/** True in the deterministic preview build. */
export const demoBuild = DEMO;

/**
 * Unwrap a `Result` into a value, or throw the error message.
 *
 * The client returns `Result` so that a screen can decide what to show; the
 * screens are all written in terms of promises that throw, which is what
 * `useAsync` catches. Doing the conversion here keeps that decision in one place
 * instead of at forty call sites.
 */
export function unwrap<T>(result: Result<T>): T {
  if (result.ok) return result.data;
  throw new Error(result.error);
}

export const apiRoot = () => api.apiRoot;
