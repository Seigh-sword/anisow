import { useCallback, useEffect, useMemo, useRef, useState } from "react";
import { useNavigate, useParams, useSearchParams } from "react-router-dom";
import type { Episode, Server } from "@anispots/core";

import { loadDetails, loadEpisodes, loadServers } from "../lib/data";
import { getProgress, saveProgress } from "../lib/library";
import { fileUrl } from "../lib/downloads";
import { useAsync } from "../hooks/useAsync";
import {
  buildEmbedUrl,
  formatTime,
  onProgress,
  send,
  type ProgressFrame,
} from "../lib/playerBridge";
import { Logo } from "../components/Logo";
import { BrandButton, GlassButton, IconButton } from "../components/Button";
import { Sheet } from "../components/Sheet";
import { DownloadSheet } from "../components/DownloadSheet";
import { EpisodeSheet } from "../components/EpisodeSheet";
import { Glass } from "../components/Glass";

/**
 * The player.
 *
 * This screen is in the URL, not a modal, so it can be reloaded and resumed. It
 * opens straight into the embed — no "tap to start", no server chooser in front
 * of the video — because the requirement is that playback is immediate. Server
 * switching, the episode list, downloads and the offline copy are all one tap
 * away in the chrome around it.
 *
 * AniSpots' own layer sits above the iframe: title, episode stepper, ±10s, the
 * episode sheet and the lock. Subtitles, speed and quality live inside the embed
 * and are reached through its own controls, which are already excellent and are
 * not worth reimplementing badly.
 */

const SEEK_STEP = 10;

export function Watch() {
  const { id = "" } = useParams();
  const [params, setParams] = useSearchParams();
  const navigate = useNavigate();
  const offlineRequested = params.get("offline") === "1";

  const frameRef = useRef<HTMLIFrameElement | null>(null);
  const progressRef = useRef<ProgressFrame>({ currentTime: 0, duration: 0 });
  const savedAt = useRef(0);

  const [frame, setFrame] = useState<ProgressFrame>({ currentTime: 0, duration: 0 });
  const [serverIndex, setServerIndex] = useState(0);
  const [showServers, setShowServers] = useState(false);
  const [showEpisodes, setShowEpisodes] = useState(false);
  const [showDownloads, setShowDownloads] = useState(false);
  const [locked, setLocked] = useState(false);
  const [chromeVisible, setChromeVisible] = useState(true);
  const [offlineSrc, setOfflineSrc] = useState<string | null>(null);
  const [offlineFailed, setOfflineFailed] = useState(false);

  const details = useAsync(`details:${id}`, () => loadDetails(id));
  const episodes = useAsync(`episodes:${id}`, () => loadEpisodes(id));

  const list: Episode[] = episodes.data ?? [];
  const wantedId = params.get("ep");

  const current: Episode | undefined = useMemo(() => {
    if (list.length === 0) return undefined;
    if (wantedId) {
      const found = list.find((episode) => episode.id === wantedId);
      if (found) return found;
    }
    const saved = getProgress(id);
    return list.find((episode) => episode.id === saved?.episodeId) ?? list[0];
  }, [list, wantedId, id]);

  const index = current ? list.findIndex((episode) => episode.id === current.id) : -1;
  const previous = index > 0 ? list[index - 1] : undefined;
  const next = index >= 0 && index < list.length - 1 ? list[index + 1] : undefined;

  const saved = useMemo(() => getProgress(id), [id]);
  const resumeAt = useMemo(() => {
    if (!saved || !current || saved.episodeId !== current.id) return 0;
    return saved.position > 10 ? saved.position : 0;
  }, [saved, current]);

  const servers = useAsync(
    current ? `servers:${current.id}` : null,
    () => loadServers(current!.id),
    [current?.id],
  );

  const serverList: Server[] = servers.data ?? [];
  const server: Server | undefined = serverList[serverIndex] ?? serverList[0];

  /* ------------------------------------------------------------ offline */

  const offline = offlineRequested || offlineFailed;

  useEffect(() => {
    setOfflineSrc(null);
    setOfflineFailed(false);
    if (!current) return;

    // An offline copy is keyed by episode, quality-independent: whatever is on
    // disk for that episode is what plays.
    const entry = (window.localStorage.getItem("anispots.downloads") ?? "")
      ? JSON.parse(window.localStorage.getItem("anispots.downloads") ?? "[]")
      : [];

    const match = (Array.isArray(entry) ? entry : []).find(
      (item: { episodeId?: string; state?: string }) =>
        item.episodeId === current.id && item.state === "done",
    ) as { id?: string } | undefined;

    if (!match?.id) {
      if (offlineRequested) setOfflineFailed(true);
      return;
    }

    let cancelled = false;
    fileUrl(match.id)
      .then((url) => {
        if (cancelled) return;
        if (url) setOfflineSrc(url);
        else setOfflineFailed(true);
      })
      .catch(() => {
        if (!cancelled) setOfflineFailed(true);
      });

    return () => {
      cancelled = true;
    };
  }, [current?.id, offlineRequested]);

  /* ------------------------------------------------------------ progress */

  useEffect(() => {
    const unsubscribe = onProgress((incoming) => {
      progressRef.current = incoming;
      setFrame(incoming);

      // Persist at most every five seconds while it is moving, so a crash or a
      // closed tab loses at most a few seconds of position.
      const now = Date.now();
      if (current && now - savedAt.current > 5000) {
        savedAt.current = now;
        saveProgress({
          animeId: id,
          animeTitle: details.data?.title,
          coverUrl: details.data?.poster,
          episodeNumber: current.number,
          episodeId: current.id,
          position: incoming.currentTime,
          duration: incoming.duration,
          fraction: incoming.duration > 0 ? Math.min(1, incoming.currentTime / incoming.duration) : undefined,
          updatedAt: now,
        });
      }
    });

    return unsubscribe;
  }, [current, id, details.data?.title, details.data?.poster]);

  // Ask the embed for a frame on an interval: hosts differ in how often they
  // volunteer one, and the scrubber must not look frozen.
  useEffect(() => {
    if (!server) return;
    const timer = window.setInterval(() => {
      send(frameRef.current, server.embedUrl, { type: "state" });
    }, 2000);
    return () => window.clearInterval(timer);
  }, [server]);

  // Save on the way out, with the last frame we saw.
  useEffect(() => {
    return () => {
      const last = progressRef.current;
      const episode = current;
      if (!episode || last.currentTime < 5) return;
      saveProgress({
        animeId: id,
        animeTitle: details.data?.title,
        coverUrl: details.data?.poster,
        episodeNumber: episode.number,
        episodeId: episode.id,
        position: last.currentTime,
        duration: last.duration,
        fraction: last.duration > 0 ? Math.min(1, last.currentTime / last.duration) : undefined,
        updatedAt: Date.now(),
      });
    };
  }, [current, id, details.data?.title, details.data?.poster]);

  /* ------------------------------------------------------------- actions */

  const goToEpisode = useCallback(
    (episode: Episode) => {
      setParams((currentParams) => {
        const updated = new URLSearchParams(currentParams);
        updated.set("ep", episode.id);
        updated.delete("offline");
        return updated;
      }, { replace: true });
      setServerIndex(0);
      savedAt.current = 0;
      setFrame({ currentTime: 0, duration: 0 });
      progressRef.current = { currentTime: 0, duration: 0 };
    },
    [setParams],
  );

  const seekBy = (seconds: number) => {
    if (!server) return;
    const target = Math.max(0, progressRef.current.currentTime + seconds);
    send(frameRef.current, server.embedUrl, { type: "seek", time: target });
    setFrame((value) => ({ ...value, currentTime: target }));
    progressRef.current = { ...progressRef.current, currentTime: target };
  };

  // Auto-hide the chrome over the video, the way a player should.
  useEffect(() => {
    if (locked) return;
    let timer = window.setTimeout(() => setChromeVisible(false), 4200);
    const wake = () => {
      setChromeVisible(true);
      window.clearTimeout(timer);
      timer = window.setTimeout(() => setChromeVisible(false), 4200);
    };
    window.addEventListener("pointermove", wake);
    window.addEventListener("keydown", wake);
    return () => {
      window.removeEventListener("pointermove", wake);
      window.removeEventListener("keydown", wake);
      window.clearTimeout(timer);
    };
  }, [locked]);

  /* --------------------------------------------------------------- render */

  const title = details.data?.title ?? "Loading…";
  const step = current ? `EP ${current.number}` : "";
  const embedUrl = server ? buildEmbedUrl(server.embedUrl, { startAt: resumeAt }) : null;
  const progressPercent =
    frame.duration > 0 ? Math.min(100, (frame.currentTime / frame.duration) * 100) : 0;

  return (
    <div style={{ minHeight: "100dvh", background: "#05060b", display: "flex", flexDirection: "column" }}>
      {/* ------------------------------------------------------- top bar */}
      <div
        style={{
          position: "sticky",
          top: 0,
          zIndex: 30,
          display: "flex",
          alignItems: "center",
          gap: 10,
          padding: "calc(10px + env(safe-area-inset-top)) 12px 10px",
          background: "linear-gradient(180deg, rgba(5,6,11,0.95), rgba(5,6,11,0.62) 70%, transparent)",
          opacity: locked ? 0 : chromeVisible ? 1 : 0,
          transition: "opacity 260ms var(--ease-out)",
          pointerEvents: locked || !chromeVisible ? "none" : "auto",
        }}
      >
        <IconButton label="Back" onClick={() => navigate(`/anime/${id}`)} size={36}>
          <svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
            <path d="M15 5l-7 7 7 7" />
          </svg>
        </IconButton>

        <div style={{ minWidth: 0, flex: 1 }}>
          <p
            style={{
              margin: 0,
              fontSize: 13,
              fontWeight: 700,
              overflow: "hidden",
              textOverflow: "ellipsis",
              whiteSpace: "nowrap",
            }}
          >
            {title}
          </p>
          <p style={{ margin: 0, fontSize: 11, color: "var(--text-faint)" }}>
            {step}
            {current?.title ? ` · ${current.title}` : ""}
            {offlineSrc ? " · offline" : ""}
          </p>
        </div>

        <button
          type="button"
          onClick={() => setLocked(true)}
          aria-label="Lock controls"
          style={{
            border: "1px solid rgba(255,255,255,0.14)",
            background: "rgba(255,255,255,0.06)",
            color: "var(--text-muted)",
            borderRadius: 999,
            padding: "6px 12px",
            fontSize: 11.5,
            fontWeight: 700,
            cursor: "pointer",
          }}
        >
          Lock
        </button>
      </div>

      {/* --------------------------------------------------------- stage */}
      <div
        style={{
          position: "relative",
          flex: "1 1 auto",
          display: "grid",
          placeItems: "center",
          padding: "0 8px",
        }}
      >
        <div
          style={{
            position: "relative",
            width: "100%",
            maxWidth: 1080,
            aspectRatio: "16 / 9",
            borderRadius: 16,
            overflow: "hidden",
            background: "#000",
            boxShadow: "0 30px 80px -40px rgba(0,0,0,1)",
            border: "1px solid rgba(255,255,255,0.08)",
          }}
        >
          {offlineSrc ? (
            <video
              src={offlineSrc}
              controls
              autoPlay
              playsInline
              style={{ width: "100%", height: "100%", background: "#000" }}
              onTimeUpdate={(event) => {
                const el = event.currentTarget;
                const value = { currentTime: el.currentTime, duration: el.duration || 0 };
                progressRef.current = value;
                setFrame(value);
              }}
              onEnded={() => next && goToEpisode(next)}
            />
          ) : embedUrl ? (
            <iframe
              ref={frameRef}
              src={embedUrl}
              title={`${title} ${step}`}
              allow="autoplay; fullscreen; encrypted-media; picture-in-picture"
              allowFullScreen
              referrerPolicy="origin"
              style={{ width: "100%", height: "100%", border: "none", background: "#000" }}
              onLoad={() => {
                // Loaded: tell it to start and keep the queue moving.
                if (server) {
                  send(frameRef.current, server.embedUrl, { type: "autoplay", on: true });
                  send(frameRef.current, server.embedUrl, { type: "autonext", on: Boolean(next) });
                }
              }}
            />
          ) : offlineFailed && offlineRequested ? (
            <OfflineMissing onStream={() => navigate(`/watch/${id}?ep=${current?.id ?? ""}`, { replace: true })} />
          ) : servers.error ? (
            <StageMessage
              title="The player did not load"
              body={servers.error}
              action={
                <GlassButton onClick={servers.retry}>Try again</GlassButton>
              }
            />
          ) : (
            <StageMessage
              title="Finding a source…"
              body={`Episode ${current?.number ?? ""} is being connected.`}
              action={<div className="shimmer" style={{ width: 90, height: 4, borderRadius: 999 }} aria-hidden />}
            />
          )}

          {/* Scrubber: reads the embed's progress frames, seeks by message. */}
          {!offlineSrc && server && (
            <div
              style={{
                position: "absolute",
                left: 0,
                right: 0,
                bottom: 0,
                padding: "10px 12px 9px",
                background: "linear-gradient(0deg, rgba(0,0,0,0.82), transparent)",
                opacity: locked ? 0 : chromeVisible ? 1 : 0.18,
                transition: "opacity 260ms var(--ease-out)",
              }}
            >
              <div
                role="slider"
                aria-label="Seek"
                aria-valuemin={0}
                aria-valuemax={Math.round(frame.duration)}
                aria-valuenow={Math.round(frame.currentTime)}
                tabIndex={0}
                onClick={(event) => {
                  if (frame.duration <= 0) return;
                  const box = event.currentTarget.getBoundingClientRect();
                  const ratio = (event.clientX - box.left) / box.width;
                  const target = Math.max(0, Math.min(frame.duration, ratio * frame.duration));
                  send(frameRef.current, server.embedUrl, { type: "seek", time: target });
                  setFrame((value) => ({ ...value, currentTime: target }));
                  progressRef.current = { ...progressRef.current, currentTime: target };
                }}
                style={{
                  position: "relative",
                  height: 14,
                  display: "flex",
                  alignItems: "center",
                  cursor: "pointer",
                }}
              >
                <span
                  style={{
                    position: "absolute",
                    left: 0,
                    right: 0,
                    height: 3,
                    borderRadius: 999,
                    background: "rgba(255,255,255,0.22)",
                  }}
                />
                <span
                  style={{
                    position: "absolute",
                    left: 0,
                    width: `${progressPercent}%`,
                    height: 3,
                    borderRadius: 999,
                    backgroundImage: "var(--brand-gradient)",
                    transition: "width 320ms linear",
                  }}
                />
                <span
                  style={{
                    position: "absolute",
                    left: `${progressPercent}%`,
                    width: 11,
                    height: 11,
                    marginLeft: -5.5,
                    borderRadius: 999,
                    background: "#fff",
                    boxShadow: "0 0 12px rgba(0,123,255,0.9)",
                    transition: "left 320ms linear",
                  }}
                />
              </div>

              <div
                style={{
                  display: "flex",
                  alignItems: "center",
                  gap: 8,
                  marginTop: 4,
                  color: "var(--text)",
                }}
              >
                <span style={{ fontSize: 11, fontVariantNumeric: "tabular-nums", color: "var(--text-muted)" }}>
                  {formatTime(frame.currentTime)} / {formatTime(frame.duration)}
                </span>

                <div style={{ marginLeft: "auto", display: "flex", gap: 6, alignItems: "center" }}>
                  <IconButton label="Back 10 seconds" onClick={() => seekBy(-SEEK_STEP)} size={32}>
                    <svg width="15" height="15" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.9" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
                      <path d="M11 8 5 12l6 4zM20 8l-6 4 6 4z" />
                    </svg>
                  </IconButton>
                  <IconButton label="Forward 10 seconds" onClick={() => seekBy(SEEK_STEP)} size={32}>
                    <svg width="15" height="15" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.9" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
                      <path d="m13 8 6 4-6 4zM4 8l6 4-6 4z" />
                    </svg>
                  </IconButton>
                  <IconButton
                    label="Player settings"
                    onClick={() => setShowServers(true)}
                    size={32}
                  >
                    <svg width="15" height="15" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.9" strokeLinecap="round" aria-hidden>
                      <path d="M4 7h10M18 7h2M4 17h2M10 17h10" />
                      <circle cx="16" cy="7" r="2" />
                      <circle cx="8" cy="17" r="2" />
                    </svg>
                  </IconButton>
                </div>
              </div>
            </div>
          )}

          {/* Lock: a tap-anywhere veil, dismissed by an explicit button. */}
          {locked && (
            <button
              type="button"
              onClick={() => setLocked(false)}
              aria-label="Unlock controls"
              style={{
                position: "absolute",
                inset: 0,
                display: "grid",
                placeItems: "center",
                border: "none",
                background: "rgba(0,0,0,0.06)",
                cursor: "pointer",
                color: "rgba(255,255,255,0.9)",
              }}
            >
              <span
                style={{
                  padding: "8px 16px",
                  borderRadius: 999,
                  border: "1px solid rgba(255,255,255,0.2)",
                  background: "rgba(0,0,0,0.45)",
                  backdropFilter: "blur(10px)",
                  fontSize: 12,
                  fontWeight: 700,
                }}
              >
                🔒 Tap to unlock
              </span>
            </button>
          )}
        </div>
      </div>

      {/* --------------------------------------------------- bottom chrome */}
      <div
        style={{
          display: "grid",
          gap: 10,
          padding: "12px 14px calc(16px + env(safe-area-inset-bottom))",
          opacity: locked ? 0 : 1,
          transition: "opacity 260ms var(--ease-out)",
          pointerEvents: locked ? "none" : "auto",
        }}
      >
        <div style={{ display: "flex", gap: 8, alignItems: "center" }}>
          <GlassButton
            disabled={!previous}
            onClick={() => previous && goToEpisode(previous)}
            style={{ flex: "0 0 auto", padding: "9px 12px" }}
            title="Previous episode"
          >
            <svg width="14" height="14" viewBox="0 0 24 24" fill="currentColor" aria-hidden>
              <path d="M7 5h2v14H7zM19 5v14l-9-7z" />
            </svg>
          </GlassButton>

          <button
            type="button"
            onClick={() => setShowEpisodes(true)}
            className="pressable"
            style={{ flex: 1, border: "none", background: "none", padding: 0, cursor: "pointer" }}
          >
            <Glass level="regular" radius={999} style={{ padding: "9px 14px", fontSize: 13, fontWeight: 700 }}>
              {step || "Episodes"}
              <span style={{ marginLeft: 8, fontWeight: 500, color: "var(--text-faint)", fontSize: 11.5 }}>
                {list.length > 0 ? `of ${list.length}` : ""}
              </span>
            </Glass>
          </button>

          <GlassButton
            disabled={!next}
            onClick={() => next && goToEpisode(next)}
            style={{ flex: "0 0 auto", padding: "9px 12px" }}
            title="Next episode"
          >
            <svg width="14" height="14" viewBox="0 0 24 24" fill="currentColor" aria-hidden>
              <path d="M15 5h2v14h-2zM5 5v14l9-7z" />
            </svg>
          </GlassButton>
        </div>

        <div style={{ display: "flex", gap: 8 }}>
          <GlassButton onClick={() => setShowDownloads(true)} style={{ flex: 1, fontSize: 13 }}>
            <svg width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.8" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
              <path d="M12 3v11m0 0 4-4m-4 4-4-4M4 20h16" />
            </svg>
            Download
          </GlassButton>

          <GlassButton onClick={() => setShowServers(true)} style={{ flex: 1, fontSize: 13 }}>
            {server ? `${server.name} · ${server.audio.toUpperCase()}` : "Sources"}
          </GlassButton>

          <GlassButton onClick={() => navigate(`/anime/${id}`)} style={{ flex: "0 0 auto", fontSize: 13 }}>
            Details
          </GlassButton>
        </div>
      </div>

      {/* ------------------------------------------------------------ sheets */}
      <Sheet
        open={showServers}
        onClose={() => setShowServers(false)}
        title="Sources"
        subtitle="Pick the player and audio track. Subtitles, speed and quality are inside the player."
      >
        {servers.loading && (
          <p style={{ padding: 20, margin: 0, fontSize: 13, color: "var(--text-faint)" }}>Finding sources…</p>
        )}

        {servers.error && (
          <p style={{ padding: 20, margin: 0, fontSize: 13, color: "var(--danger)" }}>{servers.error}</p>
        )}

        <ul style={{ listStyle: "none", margin: 0, padding: 10 }}>
          {serverList.map((item, itemIndex) => {
            const active = itemIndex === serverIndex;
            return (
              <li key={`${item.name}-${item.audio}-${itemIndex}`}>
                <button
                  type="button"
                  onClick={() => {
                    setServerIndex(itemIndex);
                    setShowServers(false);
                    savedAt.current = 0;
                  }}
                  style={{
                    display: "flex",
                    alignItems: "center",
                    gap: 10,
                    width: "100%",
                    padding: "11px 12px",
                    marginBottom: 4,
                    borderRadius: 14,
                    border: active ? "1px solid rgba(0,123,255,0.5)" : "1px solid transparent",
                    background: active ? "rgba(0,123,255,0.14)" : "rgba(255,255,255,0.04)",
                    color: "inherit",
                    textAlign: "left",
                    cursor: "pointer",
                  }}
                >
                  <span style={{ flex: 1, fontSize: 13.5, fontWeight: 600 }}>{item.name}</span>
                  <span
                    style={{
                      padding: "2px 8px",
                      borderRadius: 999,
                      fontSize: 10.5,
                      fontWeight: 800,
                      letterSpacing: 0.4,
                      background: item.audio.startsWith("d") ? "rgba(255,0,255,0.18)" : "rgba(0,123,255,0.18)",
                      color: item.audio.startsWith("d") ? "#FF8CF6" : "#7EC0FF",
                    }}
                  >
                    {item.audio.toUpperCase()}
                  </span>
                </button>
              </li>
            );
          })}
        </ul>

        {!servers.loading && serverList.length === 0 && !servers.error && (
          <p style={{ padding: 20, margin: 0, fontSize: 13, color: "var(--text-faint)", lineHeight: 1.55 }}>
            No source answered for this episode. That usually means the episode was just published and the embed is a
            few minutes behind.
          </p>
        )}
      </Sheet>

      <EpisodeSheet
        open={showEpisodes}
        onClose={() => setShowEpisodes(false)}
        episodes={list}
        currentId={current?.id}
        onPick={(episode) => {
          setShowEpisodes(false);
          goToEpisode(episode);
        }}
      />

      {details.data && (
        <DownloadSheet
          open={showDownloads}
          onClose={() => setShowDownloads(false)}
          target={{
            animeId: id,
            animeTitle: details.data.title,
            coverUrl: details.data.poster,
            description: details.data.description,
          }}
          episodes={list}
        />
      )}

      {/* A way back to the catalogue that never scrolls away. */}
      <div style={{ display: "grid", placeItems: "center", paddingBottom: 8 }}>
        <Logo size={14} />
      </div>
    </div>
  );
}

function StageMessage({
  title,
  body,
  action,
}: {
  title: string;
  body?: string;
  action?: React.ReactNode;
}) {
  return (
    <div style={{ display: "grid", placeItems: "center", gap: 10, padding: 24, textAlign: "center" }}>
      <p style={{ margin: 0, fontSize: 14, fontWeight: 700 }}>{title}</p>
      {body && (
        <p style={{ margin: 0, fontSize: 12.5, lineHeight: 1.5, color: "var(--text-muted)", maxWidth: "42ch" }}>
          {body}
        </p>
      )}
      {action}
    </div>
  );
}

function OfflineMissing({ onStream }: { onStream: () => void }) {
  return (
    <div style={{ display: "grid", placeItems: "center", gap: 12, padding: 24, textAlign: "center" }}>
      <p style={{ margin: 0, fontSize: 14, fontWeight: 700 }}>That episode is not on this device</p>
      <p style={{ margin: 0, fontSize: 12.5, lineHeight: 1.5, color: "var(--text-muted)", maxWidth: "40ch" }}>
        The download may have been deleted, or it is still in the queue. You can stream it instead.
      </p>
      <BrandButton onClick={onStream}>Stream now</BrandButton>
    </div>
  );
}
