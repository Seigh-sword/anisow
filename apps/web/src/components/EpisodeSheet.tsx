import { useMemo, useState } from "react";
import type { Episode } from "@anispots/core";
import { Sheet } from "./Sheet";
import { Glass } from "./Glass";

/**
 * The episode list, as a sheet.
 *
 * Two views of the same list: a number grid for the usual 12–24 episode run, and
 * a searchable list for the 500-episode shows where a grid is just scroll. The
 * search box only appears when the list is long enough to need it — a filter on
 * six items is furniture.
 */
export function EpisodeSheet({
  open,
  onClose,
  episodes,
  currentId,
  onPick,
  onDownload,
}: {
  open: boolean;
  onClose: () => void;
  episodes: Episode[];
  currentId?: string;
  onPick: (episode: Episode) => void;
  onDownload?: (episode: Episode) => void;
}) {
  const [query, setQuery] = useState("");
  const [mode, setMode] = useState<"grid" | "list">("grid");

  const filtered = useMemo(() => {
    const trimmed = query.trim().toLowerCase();
    if (!trimmed) return episodes;
    return episodes.filter(
      (episode) =>
        String(episode.number).includes(trimmed) ||
        (episode.title ?? "").toLowerCase().includes(trimmed),
    );
  }, [episodes, query]);

  return (
    <Sheet
      open={open}
      onClose={onClose}
      title="Episodes"
      subtitle={`${episodes.length} total${currentId ? " · tap to switch" : ""}`}
      footer={
        episodes.length > 24 ? (
          <div style={{ display: "flex", gap: 8, width: "100%" }}>
            <Glass
              as="button"
              onClick={() => setMode("grid")}
              level={mode === "grid" ? "regular" : "subtle"}
              radius={999}
              style={{
                flex: 1,
                padding: "9px 0",
                border: "none",
                color: "var(--text)",
                fontSize: 13,
                fontWeight: 600,
                cursor: "pointer",
              }}
            >
              Grid
            </Glass>
            <Glass
              as="button"
              onClick={() => setMode("list")}
              level={mode === "list" ? "regular" : "subtle"}
              radius={999}
              style={{
                flex: 1,
                padding: "9px 0",
                border: "none",
                color: "var(--text)",
                fontSize: 13,
                fontWeight: 600,
                cursor: "pointer",
              }}
            >
              List
            </Glass>
          </div>
        ) : undefined
      }
    >
      {episodes.length > 30 && (
        <div style={{ padding: "12px 16px 4px" }}>
          <input
            value={query}
            onChange={(event) => setQuery(event.target.value)}
            inputMode="numeric"
            placeholder="Jump to episode…"
            aria-label="Filter episodes"
            style={{
              width: "100%",
              padding: "10px 14px",
              borderRadius: 999,
              border: "1px solid rgba(255,255,255,0.14)",
              background: "rgba(255,255,255,0.06)",
              color: "var(--text)",
              fontSize: 14,
              outline: "none",
            }}
          />
        </div>
      )}

      {mode === "grid" ? (
        <div
          style={{
            display: "grid",
            gridTemplateColumns: "repeat(auto-fill, minmax(56px, 1fr))",
            gap: 8,
            padding: 16,
          }}
        >
          {filtered.map((episode) => {
            const current = episode.id === currentId;
            return (
              <button
                key={episode.id}
                type="button"
                onClick={() => onPick(episode)}
                title={episode.title ?? `Episode ${episode.number}`}
                className="pressable"
                style={{
                  aspectRatio: "1.3",
                  borderRadius: 12,
                  border: current ? "1px solid rgba(0,123,255,0.75)" : "1px solid rgba(255,255,255,0.10)",
                  background: current ? "rgba(0,123,255,0.18)" : "rgba(255,255,255,0.05)",
                  color: current ? "#fff" : "var(--text-muted)",
                  fontWeight: 700,
                  fontSize: 13.5,
                  cursor: "pointer",
                }}
              >
                {episode.number}
              </button>
            );
          })}
        </div>
      ) : (
        <ul style={{ listStyle: "none", margin: 0, padding: 8 }}>
          {filtered.map((episode) => {
            const current = episode.id === currentId;
            return (
              <li key={episode.id}>
                <div
                  style={{
                    display: "flex",
                    alignItems: "center",
                    gap: 10,
                    padding: "9px 10px",
                    borderRadius: 14,
                    background: current ? "rgba(0,123,255,0.14)" : "transparent",
                  }}
                >
                  <button
                    type="button"
                    onClick={() => onPick(episode)}
                    style={{
                      display: "flex",
                      alignItems: "center",
                      gap: 12,
                      flex: 1,
                      minWidth: 0,
                      border: "none",
                      background: "none",
                      color: "inherit",
                      textAlign: "left",
                      cursor: "pointer",
                      padding: 0,
                    }}
                  >
                    <span
                      style={{
                        width: 34,
                        height: 34,
                        flex: "0 0 auto",
                        display: "grid",
                        placeItems: "center",
                        borderRadius: 10,
                        background: current ? "rgba(0,123,255,0.28)" : "rgba(255,255,255,0.06)",
                        fontSize: 12.5,
                        fontWeight: 700,
                      }}
                    >
                      {episode.number}
                    </span>
                    <span
                      style={{
                        fontSize: 13.5,
                        fontWeight: current ? 700 : 500,
                        color: current ? "#fff" : "var(--text-muted)",
                        overflow: "hidden",
                        textOverflow: "ellipsis",
                        whiteSpace: "nowrap",
                      }}
                    >
                      {episode.title ?? `Episode ${episode.number}`}
                    </span>
                  </button>

                  {onDownload && (
                    <button
                      type="button"
                      onClick={() => onDownload(episode)}
                      aria-label={`Download episode ${episode.number}`}
                      style={{
                        border: "none",
                        background: "none",
                        color: "var(--text-faint)",
                        cursor: "pointer",
                        padding: 6,
                      }}
                    >
                      <svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.8" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
                        <path d="M12 3v11m0 0 4-4m-4 4-4-4M4 20h16" />
                      </svg>
                    </button>
                  )}
                </div>
              </li>
            );
          })}
        </ul>
      )}

      {filtered.length === 0 && (
        <p style={{ padding: 24, textAlign: "center", fontSize: 13, color: "var(--text-faint)", margin: 0 }}>
          No episode matches that.
        </p>
      )}
    </Sheet>
  );
}
