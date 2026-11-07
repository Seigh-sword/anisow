import { useCallback, useEffect, useMemo, useState } from "react";
import { useNavigate } from "react-router-dom";
import type { DownloadEntry } from "@anispots/core";

import { getDownloads, groupDownloads } from "../lib/library";
import {
  cancel,
  fileUrl,
  humanBytes,
  readFile,
  remove,
  resumeAll,
  start,
  subscribe,
  usedBytes,
} from "../lib/downloads";
import { Glass } from "../components/Glass";
import { Sheet } from "../components/Sheet";
import { BrandButton, GlassButton, DownloadIcon } from "../components/Button";
import { EmptyState } from "../components/States";

/**
 * The download library.
 *
 * Grouped by anime, with each anime's cover, title and description restored from
 * its entries — that is what makes this browsable with the network off. Deleting
 * always asks first, and there is a second, narrower delete inside an anime so
 * removing one bad episode does not mean deleting the series.
 */

const STATE_LABEL: Record<DownloadEntry["state"], string> = {
  queued: "Queued",
  downloading: "Downloading",
  done: "Ready",
  failed: "Failed",
  cancelled: "Cancelled",
};

/** Save a stored file to the device: the "Export" half of a download. */
async function exportEntry(entry: DownloadEntry): Promise<void> {
  const blob = await readFile(entry.id);
  if (!blob) return;

  const url = URL.createObjectURL(blob);
  const anchor = document.createElement("a");
  const safe = `${entry.animeTitle} - EP ${entry.episodeNumber} [${entry.quality}]`.replace(/[\\/:*?"<>|]/g, "_");
  anchor.href = url;
  anchor.download = `${safe}.mp4`;
  document.body.appendChild(anchor);
  anchor.click();
  anchor.remove();
  window.setTimeout(() => URL.revokeObjectURL(url), 60_000);
}

export function Downloads() {
  const navigate = useNavigate();
  const [entries, setEntries] = useState<DownloadEntry[]>(() => getDownloads());
  const [pendingDelete, setPendingDelete] = useState<DownloadEntry | null>(null);
  const [pendingGroupDelete, setPendingGroupDelete] = useState<string | null>(null);

  const refresh = useCallback(() => setEntries(getDownloads()), []);

  useEffect(() => {
    const unsubscribe = subscribe(refresh);
    resumeAll();
    refresh();
    return unsubscribe;
  }, [refresh]);

  // Poll the running entries: `subscribe` fires on state changes, but byte
  // progress is written on a throttle and a slow tick keeps the bars honest.
  useEffect(() => {
    const timer = window.setInterval(() => {
      if (getDownloads().some((entry) => entry.state === "downloading")) refresh();
    }, 700);
    return () => window.clearInterval(timer);
  }, [refresh]);

  const groups = useMemo(() => groupDownloads(entries), [entries]);
  const total = usedBytes();

  if (entries.length === 0) {
    return (
      <div>
        <header style={{ padding: "calc(18px + env(safe-area-inset-top)) var(--s-xl) 0" }}>
          <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Downloads</h1>
        </header>
        <EmptyState
          title="Nothing downloaded yet"
          hint="Open an anime, tap Download, then Select all and Export. Everything you keep plays without a connection."
        />
        <div style={{ display: "grid", placeItems: "center" }}>
          <BrandButton onClick={() => navigate("/browse")}>Find something</BrandButton>
        </div>
      </div>
    );
  }

  return (
    <div>
      <header
        style={{
          padding: "calc(18px + env(safe-area-inset-top)) var(--s-xl) var(--s-md)",
          display: "flex",
          alignItems: "baseline",
          justifyContent: "space-between",
          gap: 12,
        }}
      >
        <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Downloads</h1>
        <span style={{ fontSize: 12, color: "var(--text-faint)", whiteSpace: "nowrap" }}>
          {entries.filter((entry) => entry.state === "done").length} files · {humanBytes(total)}
        </span>
      </header>

      <div style={{ padding: "0 var(--s-xl)", display: "grid", gap: 14 }}>
        {groups.map((group) => {
          const done = group.episodes.filter((entry) => entry.state === "done");
          const groupBusy = group.episodes.some(
            (entry) => entry.state === "downloading" || entry.state === "queued",
          );

          return (
            <Glass key={group.animeId} level="regular" radius={20} style={{ padding: 12 }}>
              <div style={{ display: "flex", gap: 12 }}>
                <button
                  type="button"
                  onClick={() => navigate(`/anime/${group.animeId}`)}
                  style={{ border: "none", background: "none", padding: 0, cursor: "pointer", flex: "0 0 auto" }}
                  aria-label={`Open ${group.animeTitle}`}
                >
                  <div
                    className="poster"
                    style={{ width: 64, height: 96, borderRadius: 12 }}
                  >
                    {group.localCoverUri || group.coverUrl ? (
                      <img src={group.localCoverUri ?? group.coverUrl} alt="" />
                    ) : (
                      <div style={{ width: "100%", height: "100%", background: "var(--ink-raised)" }} />
                    )}
                  </div>
                </button>

                <div style={{ flex: 1, minWidth: 0 }}>
                  <div style={{ display: "flex", gap: 8, alignItems: "flex-start" }}>
                    <div style={{ flex: 1, minWidth: 0 }}>
                      <h2
                        style={{
                          margin: 0,
                          fontSize: 14.5,
                          fontWeight: 700,
                          lineHeight: 1.25,
                          overflow: "hidden",
                          textOverflow: "ellipsis",
                          whiteSpace: "nowrap",
                        }}
                      >
                        {group.animeTitle}
                      </h2>
                      <p style={{ margin: "3px 0 0", fontSize: 11.5, color: "var(--text-faint)" }}>
                        {done.length} of {group.episodes.length} episodes ·{" "}
                        {humanBytes(group.episodes.reduce((sum, entry) => sum + (entry.bytesDone ?? 0), 0))}
                      </p>
                    </div>

                    <button
                      type="button"
                      onClick={() => setPendingGroupDelete(group.animeId)}
                      aria-label={`Delete all downloads for ${group.animeTitle}`}
                      style={{
                        flex: "0 0 auto",
                        border: "1px solid rgba(255,77,109,0.3)",
                        background: "rgba(255,77,109,0.10)",
                        color: "var(--danger)",
                        borderRadius: 999,
                        padding: "5px 10px",
                        fontSize: 11.5,
                        fontWeight: 700,
                        cursor: "pointer",
                      }}
                    >
                      Delete all
                    </button>
                  </div>

                  {group.description && (
                    <p className="clamp-2" style={{ margin: "6px 0 0", fontSize: 11.5, lineHeight: 1.45, color: "var(--text-faint)" }}>
                      {group.description}
                    </p>
                  )}

                  <div style={{ display: "flex", gap: 8, marginTop: 9, flexWrap: "wrap" }}>
                    {done.length > 0 && (
                      <GlassButton
                        style={{ padding: "7px 13px", fontSize: 12.5 }}
                        onClick={() => navigate(`/watch/${group.animeId}?ep=${done[0]!.episodeId}&offline=1`)}
                      >
                        Play EP {done[0]!.episodeNumber}
                      </GlassButton>
                    )}
                    {groupBusy && (
                      <GlassButton
                        style={{ padding: "7px 13px", fontSize: 12.5 }}
                        onClick={() => {
                          for (const entry of group.episodes) {
                            if (entry.state === "downloading" || entry.state === "queued") cancel(entry.id);
                          }
                        }}
                      >
                        Pause all
                      </GlassButton>
                    )}
                  </div>
                </div>
              </div>

              <ul style={{ listStyle: "none", margin: "10px 0 0", padding: 0, display: "grid", gap: 6 }}>
                {group.episodes.map((entry) => (
                  <li
                    key={entry.id}
                    style={{
                      display: "flex",
                      alignItems: "center",
                      gap: 10,
                      padding: "7px 9px",
                      borderRadius: 12,
                      background: "rgba(255,255,255,0.04)",
                    }}
                  >
                    <span
                      style={{
                        width: 30,
                        height: 30,
                        flex: "0 0 auto",
                        borderRadius: 9,
                        display: "grid",
                        placeItems: "center",
                        fontSize: 11.5,
                        fontWeight: 700,
                        background: "rgba(255,255,255,0.07)",
                        color: "var(--text-muted)",
                      }}
                    >
                      {entry.episodeNumber}
                    </span>

                    <div style={{ flex: 1, minWidth: 0 }}>
                      <div style={{ display: "flex", justifyContent: "space-between", gap: 8 }}>
                        <span style={{ fontSize: 12.5, fontWeight: 600, color: "var(--text)" }}>
                          {entry.quality}
                        </span>
                        <span
                          style={{
                            fontSize: 11,
                            fontWeight: 600,
                            color:
                              entry.state === "done"
                                ? "var(--success)"
                                : entry.state === "failed"
                                  ? "var(--danger)"
                                  : "var(--text-faint)",
                          }}
                        >
                          {STATE_LABEL[entry.state]}
                          {entry.state === "downloading" && ` ${entry.progress}%`}
                        </span>
                      </div>

                      <div
                        aria-hidden
                        style={{
                          marginTop: 4,
                          height: 3,
                          borderRadius: 999,
                          background: "rgba(255,255,255,0.12)",
                          overflow: "hidden",
                        }}
                      >
                        <div
                          style={{
                            width: `${entry.state === "done" ? 100 : entry.progress}%`,
                            height: "100%",
                            backgroundImage:
                              entry.state === "failed"
                                ? "linear-gradient(90deg, var(--danger), var(--danger))"
                                : "var(--brand-gradient)",
                            transition: "width 320ms var(--ease-out)",
                          }}
                        />
                      </div>
                    </div>

                    {entry.state === "done" && (
                      <>
                        <button
                          type="button"
                          onClick={() => exportEntry(entry)}
                          aria-label={`Export episode ${entry.episodeNumber}`}
                          title="Export"
                          style={{
                            border: "none",
                            background: "none",
                            color: "var(--text-muted)",
                            cursor: "pointer",
                            padding: 4,
                          }}
                        >
                          <DownloadIcon size={15} />
                        </button>
                        <button
                          type="button"
                          onClick={() =>
                            navigate(`/watch/${group.animeId}?ep=${entry.episodeId}&offline=1`)
                          }
                          aria-label={`Play episode ${entry.episodeNumber}`}
                          style={{
                            border: "none",
                            background: "none",
                            color: "var(--brand-start)",
                            cursor: "pointer",
                            padding: 4,
                          }}
                        >
                          <svg width="15" height="15" viewBox="0 0 24 24" fill="currentColor" aria-hidden>
                            <path d="M8 5.5v13l11-6.5z" />
                          </svg>
                        </button>
                      </>
                    )}

                    {(entry.state === "failed" || entry.state === "cancelled" || entry.state === "queued") && (
                      <button
                        type="button"
                        onClick={() => start(entry.id)}
                        style={{
                          border: "none",
                          background: "none",
                          color: "var(--brand-start)",
                          cursor: "pointer",
                          padding: 4,
                          fontSize: 11.5,
                          fontWeight: 700,
                        }}
                      >
                        Retry
                      </button>
                    )}

                    <button
                      type="button"
                      onClick={() => setPendingDelete(entry)}
                      aria-label={`Delete episode ${entry.episodeNumber}`}
                      style={{ border: "none", background: "none", color: "var(--text-faint)", cursor: "pointer", padding: 4 }}
                    >
                      ✕
                    </button>
                  </li>
                ))}
              </ul>
            </Glass>
          );
        })}
      </div>

      {/* Confirmation for one episode. */}
      <Sheet
        open={pendingDelete !== null}
        onClose={() => setPendingDelete(null)}
        title="Delete this download?"
        subtitle={
          pendingDelete
            ? `Episode ${pendingDelete.episodeNumber} of ${pendingDelete.animeTitle}, ${pendingDelete.quality}.`
            : undefined
        }
        footer={
          <>
            <GlassButton onClick={() => setPendingDelete(null)} style={{ flex: 1 }}>
              Cancel
            </GlassButton>
            <BrandButton
              onClick={async () => {
                if (pendingDelete) await remove(pendingDelete.id);
                setPendingDelete(null);
              }}
              style={{ flex: 1, backgroundImage: "linear-gradient(135deg, #FF4D6D, #B3123A)" }}
            >
              Delete
            </BrandButton>
          </>
        }
      >
        <p style={{ margin: 0, padding: 20, fontSize: 13.5, lineHeight: 1.6, color: "var(--text-muted)" }}>
          The file is removed from this device. If it is no longer offered by the site you will not be able to get it
          back, so this cannot be undone.
        </p>
      </Sheet>

      {/* Confirmation for a whole anime. */}
      <Sheet
        open={pendingGroupDelete !== null}
        onClose={() => setPendingGroupDelete(null)}
        title="Delete every episode?"
        subtitle={
          pendingGroupDelete
            ? groups.find((group) => group.animeId === pendingGroupDelete)?.animeTitle
            : undefined
        }
        footer={
          <>
            <GlassButton onClick={() => setPendingGroupDelete(null)} style={{ flex: 1 }}>
              Cancel
            </GlassButton>
            <BrandButton
              onClick={async () => {
                const group = groups.find((item) => item.animeId === pendingGroupDelete);
                if (group) await Promise.all(group.episodes.map((entry) => remove(entry.id)));
                setPendingGroupDelete(null);
              }}
              style={{ flex: 1, backgroundImage: "linear-gradient(135deg, #FF4D6D, #B3123A)" }}
            >
              Delete all
            </BrandButton>
          </>
        }
      >
        <p style={{ margin: 0, padding: 20, fontSize: 13.5, lineHeight: 1.6, color: "var(--text-muted)" }}>
          Every episode of this anime is removed from this device, and you will need a connection to watch it again.
        </p>
      </Sheet>
    </div>
  );
}
