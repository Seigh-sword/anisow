import { useEffect, useMemo, useState } from "react";
import type { DownloadLink, Episode } from "@anispots/core";

import { loadDownloadLinks } from "../lib/data";
import { downloadId, getDownloads } from "../lib/library";
import type { DownloadEntry } from "@anispots/core";
import { enqueue } from "../lib/downloads";
import { Sheet } from "./Sheet";
import { BrandButton, CheckIcon, DownloadIcon, GlassButton } from "./Button";

/**
 * The download picker for one anime.
 *
 * Required behaviour, and the reason this is a sheet rather than a button:
 *
 *  * every episode is listed with its available qualities, so "download the
 *    whole thing" is one tap;
 *  * **Select all** sits at the top, **Export** beside **Cancel** at the bottom;
 *  * the cover, title and description are copied into each entry, so the library
 *    can be browsed offline without asking the site anything.
 *
 * The site gates the download endpoint behind an account setting, so an empty
 * answer is explained instead of being shown as an empty list.
 */

export interface DownloadTarget {
  animeId: string;
  animeTitle: string;
  coverUrl?: string;
  description?: string;
}

type EpisodeLinks = { links: DownloadLink[]; error: string | null; loading: boolean };

export function DownloadSheet({
  open,
  onClose,
  target,
  episodes,
  onExported,
}: {
  open: boolean;
  onClose: () => void;
  target: DownloadTarget;
  episodes: Episode[];
  onExported?: (count: number) => void;
}) {
  const [links, setLinks] = useState<Record<string, EpisodeLinks>>({});
  const [selected, setSelected] = useState<Set<string>>(new Set());
  const [quality, setQuality] = useState<string>("720p");
  const [busy, setBusy] = useState(false);

  const existing = useMemo(
    () => new Set(getDownloads().map((entry) => entry.episodeId)),
    [open],
  );

  // Fetch every episode's links as soon as the sheet opens: the user came here to
  // download a run of episodes, and a per-episode fetch on tap would make Select
  // All impossible to honour without a second wave of requests anyway.
  useEffect(() => {
    if (!open) return;

    let cancelled = false;
    setLinks({});

    for (const episode of episodes) {
      setLinks((current) => ({
        ...current,
        [episode.id]: { links: [], error: null, loading: true },
      }));

      loadDownloadLinks(episode.id)
        .then(({ links: found, error }) => {
          if (cancelled) return;
          setLinks((current) => ({ ...current, [episode.id]: { links: found, error, loading: false } }));
        })
        .catch((cause: unknown) => {
          if (cancelled) return;
          setLinks((current) => ({
            ...current,
            [episode.id]: {
              links: [],
              error: cause instanceof Error ? cause.message : String(cause),
              loading: false,
            },
          }));
        });
    }

    return () => {
      cancelled = true;
    };
  }, [open, episodes]);

  /** Qualities any episode offers, most preferred first. */
  const qualities = useMemo(() => {
    const found = new Set<string>();
    for (const entry of Object.values(links)) {
      for (const link of entry.links) found.add(link.quality);
    }
    const order = ["1080p", "720p", "480p", "360p"];
    return [...found].sort((a, b) => {
      const ai = order.indexOf(a);
      const bi = order.indexOf(b);
      return (ai === -1 ? 99 : ai) - (bi === -1 ? 99 : bi);
    });
  }, [links]);

  useEffect(() => {
    if (qualities.length > 0 && !qualities.includes(quality)) setQuality(qualities[0]!);
  }, [qualities, quality]);

  const downloadable = episodes.filter((episode) => (links[episode.id]?.links.length ?? 0) > 0);
  const allSelected = downloadable.length > 0 && downloadable.every((episode) => selected.has(episode.id));

  const anyLoading = Object.values(links).some((entry) => entry.loading);
  const allFailed =
    !anyLoading &&
    episodes.length > 0 &&
    Object.values(links).length > 0 &&
    Object.values(links).every((entry) => entry.links.length === 0);

  const toggle = (episodeId: string) => {
    setSelected((current) => {
      const next = new Set(current);
      if (next.has(episodeId)) next.delete(episodeId);
      else next.add(episodeId);
      return next;
    });
  };

  const toggleAll = () => {
    setSelected(allSelected ? new Set() : new Set(downloadable.map((episode) => episode.id)));
  };

  /** The link for the chosen quality, falling back to the best one on offer. */
  const linkFor = (episode: Episode): DownloadLink | undefined => {
    const found = links[episode.id]?.links ?? [];
    return found.find((link) => link.quality === quality) ?? found[0];
  };

  const exportSelected = async () => {
    if (selected.size === 0) return;
    setBusy(true);

    let count = 0;
    for (const episode of episodes) {
      if (!selected.has(episode.id)) continue;
      const link = linkFor(episode);
      if (!link) continue;

      enqueue({
        id: downloadId(target.animeId, episode.id, link.quality),
        animeId: target.animeId,
        animeTitle: target.animeTitle,
        coverUrl: target.coverUrl,
        description: target.description,
        episodeNumber: episode.number,
        episodeId: episode.id,
        quality: link.quality,
        sourceUrl: link.url,
      });
      count += 1;
    }

    setBusy(false);
    setSelected(new Set());
    onExported?.(count);
    onClose();
  };

  return (
    <Sheet
      open={open}
      onClose={onClose}
      full
      title="Download episodes"
      subtitle={
        allFailed
          ? "The site returned no files"
          : `${downloadable.length} of ${episodes.length} episodes have a file${anyLoading ? " · checking…" : ""}`
      }
      footer={
        <>
          <GlassButton onClick={onClose} style={{ flex: "0 0 auto" }}>
            Cancel
          </GlassButton>
          <BrandButton
            onClick={exportSelected}
            disabled={selected.size === 0 || busy}
            style={{ flex: 1 }}
          >
            <DownloadIcon />
            {busy ? "Starting…" : `Export${selected.size > 0 ? ` (${selected.size})` : ""}`}
          </BrandButton>
        </>
      }
    >
      {allFailed && (
        <div style={{ margin: 16, padding: 14, borderRadius: 16, background: "rgba(255,194,77,0.10)", border: "1px solid rgba(255,194,77,0.28)" }}>
          <p style={{ margin: 0, fontSize: 13, lineHeight: 1.55, color: "var(--text-muted)" }}>
            The site only serves download links when <strong style={{ color: "var(--text)" }}>Downloads</strong> is
            enabled on the account it is using (Settings → Features → Downloads). Nothing is broken on this side —
            streaming and everything else still works.
          </p>
        </div>
      )}

      {!allFailed && (
        <>
          {/* Select all, at the top, where a bulk action belongs. */}
          <div
            style={{
              position: "sticky",
              top: 0,
              zIndex: 2,
              display: "flex",
              alignItems: "center",
              gap: 10,
              padding: "10px 16px",
              background: "rgba(12,14,22,0.92)",
              backdropFilter: "blur(12px)",
              borderBottom: "1px solid rgba(255,255,255,0.08)",
            }}
          >
            <button
              type="button"
              onClick={toggleAll}
              className="pressable"
              style={{
                display: "inline-flex",
                alignItems: "center",
                gap: 8,
                padding: "8px 14px",
                borderRadius: 999,
                border: `1px solid ${allSelected ? "rgba(0,123,255,0.6)" : "rgba(255,255,255,0.16)"}`,
                background: allSelected ? "rgba(0,123,255,0.18)" : "rgba(255,255,255,0.06)",
                color: "var(--text)",
                fontSize: 13,
                fontWeight: 700,
                cursor: "pointer",
              }}
            >
              <span
                aria-hidden
                style={{
                  width: 16,
                  height: 16,
                  borderRadius: 5,
                  display: "grid",
                  placeItems: "center",
                  border: `1.5px solid ${allSelected ? "transparent" : "rgba(255,255,255,0.35)"}`,
                  backgroundImage: allSelected ? "var(--brand-gradient)" : "none",
                  color: "#fff",
                }}
              >
                {allSelected && <CheckIcon size={11} />}
              </span>
              {allSelected ? "Clear all" : "Select all"}
            </button>

            {qualities.length > 0 && (
              <div style={{ display: "flex", gap: 6, marginLeft: "auto", overflowX: "auto" }}>
                {qualities.map((option) => (
                  <button
                    key={option}
                    type="button"
                    onClick={() => setQuality(option)}
                    style={{
                      padding: "6px 11px",
                      borderRadius: 999,
                      fontSize: 12,
                      fontWeight: 700,
                      cursor: "pointer",
                      border: `1px solid ${option === quality ? "rgba(255,0,255,0.55)" : "rgba(255,255,255,0.14)"}`,
                      background: option === quality ? "rgba(255,0,255,0.14)" : "transparent",
                      color: option === quality ? "#fff" : "var(--text-muted)",
                      whiteSpace: "nowrap",
                    }}
                  >
                    {option}
                  </button>
                ))}
              </div>
            )}
          </div>

          <ul style={{ listStyle: "none", margin: 0, padding: "6px 8px 12px" }}>
            {episodes.map((episode) => {
              const state = links[episode.id];
              const link = linkFor(episode);
              const usable = Boolean(link);
              const already = existing.has(episode.id);
              const checked = selected.has(episode.id);

              return (
                <li key={episode.id}>
                  <button
                    type="button"
                    disabled={!usable}
                    onClick={() => usable && toggle(episode.id)}
                    style={{
                      display: "flex",
                      alignItems: "center",
                      gap: 12,
                      width: "100%",
                      padding: "9px 10px",
                      borderRadius: 14,
                      border: "none",
                      background: checked ? "rgba(0,123,255,0.12)" : "transparent",
                      color: "inherit",
                      textAlign: "left",
                      cursor: usable ? "pointer" : "not-allowed",
                      opacity: usable ? 1 : 0.45,
                    }}
                  >
                    <span
                      aria-hidden
                      style={{
                        width: 17,
                        height: 17,
                        flex: "0 0 auto",
                        borderRadius: 5,
                        display: "grid",
                        placeItems: "center",
                        border: `1.5px solid ${checked ? "transparent" : "rgba(255,255,255,0.3)"}`,
                        backgroundImage: checked ? "var(--brand-gradient)" : "none",
                        color: "#fff",
                      }}
                    >
                      {checked && <CheckIcon size={11} />}
                    </span>

                    <span style={{ minWidth: 0, flex: 1 }}>
                      <span style={{ display: "block", fontSize: 13.5, fontWeight: 600 }}>
                        Episode {episode.number}
                        {already && (
                          <span style={{ marginLeft: 8, fontSize: 10.5, fontWeight: 700, color: "var(--success)" }}>
                            SAVED
                          </span>
                        )}
                      </span>
                      <span style={{ display: "block", fontSize: 11.5, color: "var(--text-faint)" }}>
                        {state?.loading
                          ? "Checking…"
                          : usable
                            ? `${link?.quality}${link?.group ? ` · ${link.group}` : ""}`
                            : state?.error ?? "No file offered"}
                      </span>
                    </span>
                  </button>
                </li>
              );
            })}
          </ul>
        </>
      )}
    </Sheet>
  );
}
