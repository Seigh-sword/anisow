import { createClient, type Result } from "@anispots/core";

/**
 * The one client.
 *
 * In a browser the site cannot be called directly (no CORS headers), so every
 * request goes through `/api/ani`, which Vite proxies in development and a small
 * proxy does in production. In the native app there is no origin, so the client
 * talks to the site itself.
 */
export const api = createClient({
  baseUrl: import.meta.env.VITE_ANI_BASE ?? "/api/ani",
  timeoutMs: 20_000,
});

/** True when the app is talking through the dev proxy rather than the real host. */
export const usingProxy = api.baseUrl === "/api/ani";

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
