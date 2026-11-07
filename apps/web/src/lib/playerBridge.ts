/**
 * The bridge into the embed.
 *
 * The player is a third-party page (`zokoanime.video`, `megaplay.buzz`) rendered
 * in an iframe. It owns decoding, subtitles, speed and quality — everything a
 * media element would normally own — so AniSpots does not try to replace it. It
 * drives it instead, over `postMessage`, which the site's own watch script does
 * and which the embed implements:
 *
 *   out  {channel:'zokoanime', type:'seek',  time}      jump to a second
 *        {channel:'zokoanime', type:'play'}
 *        {channel:'zokoanime', type:'pause'}
 *        {channel:'zokoanime', type:'autoplay',  on}
 *        {channel:'zokoanime', type:'autonext',  on}
 *        {channel:'zokoanime', type:'state'}            ask for a progress frame
 *        {channel:'zokoanime', type:'fullscreen', request}
 *   in   ready | progress {currentTime, duration} | complete | ended | error
 *
 * Everything is feature-detected: if a host stops answering, the overlay simply
 * does not get progress, and the iframe's own controls still work. The player
 * therefore degrades to "the embed" rather than to "a black rectangle".
 */

export const PLAYER_CHANNEL = "zokoanime";

export interface ProgressFrame {
  currentTime: number;
  duration: number;
}

type Handler = (frame: ProgressFrame) => void;
type ErrorHandler = (reason: string) => void;
type EndedHandler = () => void;

const handlers = new Set<Handler>();
const errorHandlers = new Set<ErrorHandler>();
const endedHandlers = new Set<EndedHandler>();
let bound = false;

/**
 * A stand-in player for the offline preview.
 *
 * Only reachable with `VITE_DEMO=1`, and only for embeds whose URL starts with
 * `demo:`. It emits the same progress frames a real host would, and answers the
 * same commands, so the chrome — scrubber, +-10s, step — can be exercised with
 * no network. Nothing about the real path changes: `send` still posts messages
 * to a real frame for a real URL.
 */
const demo = {
  time: 0,
  duration: 1440,
  playing: true,
  timer: 0,
};

function demoEmit(): void {
  const frame: ProgressFrame = { currentTime: demo.time, duration: demo.duration };
  for (const handler of handlers) handler(frame);
}

function demoTick(): void {
  if (!demo.playing) return;
  demo.time = Math.min(demo.duration, demo.time + 1);
  demoEmit();
}

function demoApply(command: PlayerCommand): void {
  switch (command.type) {
    case "seek":
      demo.time = Math.max(0, Math.min(demo.duration, command.time));
      demoEmit();
      break;
    case "play":
      demo.playing = true;
      break;
    case "pause":
      demo.playing = false;
      break;
    case "state":
      demoEmit();
      break;
    default:
      break;
  }
}

/** Starts the preview clock; idempotent. */
export function startDemoPlayback(): void {
  bind();
  if (demo.timer) return;
  demo.timer = window.setInterval(demoTick, 1000);
  window.setTimeout(demoEmit, 60);
}

export function stopDemoPlayback(): void {
  window.clearInterval(demo.timer);
  demo.timer = 0;
}

function bind(): void {
  if (bound || typeof window === "undefined") return;
  bound = true;

  window.addEventListener("message", (event: MessageEvent) => {
    const data = event.data as {
      channel?: string;
      type?: string;
      currentTime?: number;
      position?: number;
      duration?: number;
      reason?: string;
      message?: string;
    } | null;
    if (!data || typeof data !== "object") return;
    if (data.channel !== PLAYER_CHANNEL) return;

    if (
      data.type === "progress" ||
      data.type === "time" ||
      data.type === "watching-log" ||
      data.type === "seeked" ||
      data.type === "state" ||
      data.type === "ready"
    ) {
      const current = Number(data.currentTime ?? data.position ?? 0) || 0;
      const duration = Number(data.duration ?? 0) || 0;
      if (duration > 0 || current > 0) {
        const frame: ProgressFrame = { currentTime: current, duration };
        for (const handler of handlers) handler(frame);
      }
      return;
    }

    if (data.type === "error") {
      const reason = String(data.message ?? data.reason ?? "Stream unavailable on this server");
      for (const handler of errorHandlers) handler(reason);
      return;
    }

    if (data.type === "ended" || data.type === "complete") {
      for (const handler of endedHandlers) handler();
    }
  });
}

/** Listen for progress frames from any embed on the page. Returns an unsubscribe. */
export function onProgress(handler: Handler): () => void {
  bind();
  handlers.add(handler);
  return () => handlers.delete(handler);
}

/** Listen for player error events (`{ channel: "zokoanime", type: "error" }`) so we can auto-switch servers. */
export function onPlayerError(handler: ErrorHandler): () => void {
  bind();
  errorHandlers.add(handler);
  return () => errorHandlers.delete(handler);
}

/** Listen for episode completion (`ended` / `complete`). */
export function onPlayerEnded(handler: EndedHandler): () => void {
  bind();
  endedHandlers.add(handler);
  return () => endedHandlers.delete(handler);
}

/** The origins an embed may legitimately live on; messages go to these only. */
const KNOWN_ORIGINS = ["https://zokoanime.video", "https://megaplay.buzz"];

export function embedOrigin(embedUrl: string): string {
  try {
    return new URL(embedUrl).origin;
  } catch {
    return KNOWN_ORIGINS[0]!;
  }
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
 * Send a command to the embed.
 *
 * `targetOrigin` is the embed's own origin, never `*`: a wildcard would leak the
 * command to whatever else the frame might be navigated to.
 */
export function send(
  frame: HTMLIFrameElement | null,
  embedUrl: string,
  command: PlayerCommand,
): void {
  // Sample embeds have no frame; drive the preview clock instead.
  if (embedUrl.startsWith("demo:")) {
    startDemoPlayback();
    demoApply(command);
    return;
  }

  const target = frame?.contentWindow;
  if (!target) return;

  target.postMessage({ channel: PLAYER_CHANNEL, ...command }, embedOrigin(embedUrl));
}

/**
 * The embed URL with AniSpots' preferences applied.
 *
 * `time` is what makes resume work: the embed starts at that second instead of
 * at zero, so the user does not have to scrub back to where they were.
 */
export function buildEmbedUrl(
  base: string,
  options: { startAt?: number; autoplay?: boolean; autonext?: boolean } = {},
): string {
  const { startAt = 0, autoplay = true, autonext = true } = options;

  try {
    const url = new URL(base);
    url.searchParams.set("autostart", autoplay ? "1" : "0");
    url.searchParams.set("autoplay", autoplay ? "1" : "0");
    url.searchParams.set("autonext", autonext ? "1" : "0");
    url.searchParams.set("asi", "1");
    if (url.hostname.includes("zokoanime")) {
      url.searchParams.set("color", "007BFF");
    }
    if (startAt > 5) url.searchParams.set("time", String(Math.floor(startAt)));
    return url.toString();
  } catch {
    return base;
  }
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
