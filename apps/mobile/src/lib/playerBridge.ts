import type { RefObject } from "react";
import type { WebView } from "react-native-webview";

/**
 * The bridge into the embed, on native.
 *
 * Identical contract to the web version — the embed is the same third-party page
 * either way — but the transport differs: a WebView's `injectJavaScript` replaces
 * `postMessage`, and the embed's replies arrive as `onMessage` events that we
 * have to enable by re-sending its own `postMessage` up to React Native.
 *
 * Nothing about the messaging protocol changes, which is why both players can
 * share the command shapes and the resume-by-`time=` rule.
 */

export const PLAYER_CHANNEL = "zokoanime";

export interface ProgressFrame {
  currentTime: number;
  duration: number;
}

export type PlayerCommand =
  | { type: "seek"; time: number }
  | { type: "play" }
  | { type: "pause" }
  | { type: "autoplay"; on: boolean }
  | { type: "autonext"; on: boolean }
  | { type: "state" }
  | { type: "fullscreen"; request: boolean };

/**
 * Script injected at load.
 *
 * The embed talks to `window.parent` with `postMessage`. Inside a WebView that
 * parent is the document itself, so the message never leaves the page. This
 * listener forwards the console-facing frames up through the bridge instead,
 * which is the one piece of glue the native player needs and the web player does
 * not.
 */
export const BRIDGE_SCRIPT = `
(function () {
  if (window.__anispotsBridge) return true;
  window.__anispotsBridge = true;

  window.addEventListener('message', function (event) {
    var data = event.data;
    if (!data || typeof data !== 'object' || data.channel !== '${PLAYER_CHANNEL}') return;
    if (window.ReactNativeWebView) {
      window.ReactNativeWebView.postMessage(JSON.stringify(data));
    }
  });

  // The embed announces itself once it is ready to receive commands.
  window.ReactNativeWebView &&
    window.ReactNativeWebView.postMessage(JSON.stringify({ channel: '${PLAYER_CHANNEL}', type: 'bridge' }));

  true;
})();
true;
`;

export function send(
  ref: RefObject<WebView | null>,
  command: PlayerCommand,
): void {
  const payload = JSON.stringify({ channel: PLAYER_CHANNEL, ...command });
  ref.current?.injectJavaScript(`
    (function () {
      try {
        window.postMessage(${payload}, '*');
        // Some hosts only listen to messages from a parent frame.
        if (window.parent && window.parent !== window) {
          window.parent.postMessage(${payload}, '*');
        }
      } catch (e) {}
    })();
    true;
  `);
}

/** Parse an `onMessage` payload into a progress frame, or `null` if it is not one. */
export function readMessage(raw: string): ProgressFrame | null {
  try {
    const data = JSON.parse(raw) as {
      channel?: string;
      type?: string;
      currentTime?: number;
      duration?: number;
    };
    if (data.channel !== PLAYER_CHANNEL || data.type !== "progress") return null;
    return {
      currentTime: Number(data.currentTime ?? 0) || 0,
      duration: Number(data.duration ?? 0) || 0,
    };
  } catch {
    return null;
  }
}

/**
 * The embed URL with AniSpots' preferences applied.
 *
 * `time` is what makes resume work: the embed starts at that second rather than
 * at zero, so the user does not have to scrub back to where they were.
 */
export function buildEmbedUrl(
  base: string,
  options: { startAt?: number; autoplay?: boolean; autonext?: boolean } = {},
): string {
  const { startAt = 0, autoplay = true, autonext = true } = options;
  const params = [
    `autostart=${autoplay ? 1 : 0}`,
    `autonext=${autonext ? 1 : 0}`,
  ];
  if (startAt > 5) params.push(`time=${Math.floor(startAt)}`);
  return `${base}${base.includes("?") ? "&" : "?"}${params.join("&")}`;
}

/** `1:04:20` / `4:20` — the form a scrubber needs, not a float. */
export function formatTime(seconds: number): string {
  if (!Number.isFinite(seconds) || seconds < 0) return "0:00";
  const total = Math.floor(seconds);
  const hours = Math.floor(total / 3600);
  const minutes = Math.floor((total % 3600) / 60);
  const rest = total % 60;
  const pad = (value: number) => String(value).padStart(2, "0");
  return hours > 0 ? `${hours}:${pad(minutes)}:${pad(rest)}` : `${minutes}:${pad(rest)}`;
}
