import { createClient, type Result } from "@anispots/core";

/**
 * The client, native.
 *
 * There is no origin and no CORS in a native app, so this talks to the catalogue
 * directly — no proxy, no second server. That is one of the two reasons the
 * native build exists rather than shipping the web app in a shell.
 */
export const api = createClient({
  baseUrl: "https://aniwatchtv.ws",
  timeoutMs: 20_000,
});

export function unwrap<T>(result: Result<T>): T {
  if (result.ok) return result.data;
  throw new Error(result.error);
}
