import { useState } from "react";
import type { AnimeCard } from "@anispots/core";
import { poster as posterTokens } from "@anispots/design";

interface PosterProps {
  anime: AnimeCard;
  /** Rail cards are wider than grid cards; both stay 2:3. */
  width?: number;
  onOpen?: (anime: AnimeCard) => void;
  /** Shown under the art in grids; rails stay clean. */
  showTitle?: boolean;
  /** A thin progress bar along the bottom, 0–1. */
  progress?: number;
  /**
   * Fill the parent cell instead of using a fixed width. Grids use this so the
   * columns decide the poster size rather than the poster deciding the columns.
   */
  fill?: boolean;
}

/**
 * A poster card.
 *
 * Deliberately 2:3 and vertical. The old build had landscape art, which reads as
 * a strip of stills rather than a shelf of covers. The artwork carries the colour
 * into the card behind it, so a grid looks like a wall of posters instead of a
 * list of rectangles.
 */
export function Poster({
  anime,
  width = posterTokens.railWidth,
  onOpen,
  showTitle,
  progress,
  fill,
}: PosterProps) {
  const [loaded, setLoaded] = useState(false);
  const boxWidth = fill ? "100%" : width;
  const height = fill ? undefined : Math.round(width / posterTokens.ratio);

  return (
    <button
      type="button"
      onClick={() => onOpen?.(anime)}
      aria-label={anime.title}
      className="pressable"
      style={{
        width: boxWidth,
        display: "flex",
        flexDirection: "column",
        gap: 8,
        padding: 0,
        border: "none",
        background: "none",
        color: "inherit",
        textAlign: "left",
        cursor: "pointer",
      }}
    >
      <div
        className="poster"
        style={{
          width: boxWidth,
          height,
          boxShadow: "0 14px 28px -18px rgba(0,0,0,0.9)",
          outline: "1px solid rgba(255,255,255,0.06)",
          outlineOffset: -1,
        }}
      >
        {!loaded && <div className="shimmer" style={{ position: "absolute", inset: 0 }} aria-hidden />}

        <img
          src={anime.poster}
          alt=""
          loading="lazy"
          decoding="async"
          onLoad={() => setLoaded(true)}
          onError={() => setLoaded(true)}
          style={{ opacity: loaded ? 1 : 0, transition: "opacity 320ms ease" }}
        />

        {anime.badge && (
          <span
            style={{
              position: "absolute",
              top: 6,
              left: 6,
              zIndex: 2,
              padding: "2px 6px",
              borderRadius: 999,
              background: "rgba(6,8,14,0.72)",
              border: "1px solid rgba(255,255,255,0.16)",
              fontSize: 10,
              fontWeight: 700,
              letterSpacing: 0.3,
              color: "var(--text)",
              backdropFilter: "blur(6px)",
            }}
          >
            {anime.badge}
          </span>
        )}

        {typeof progress === "number" && progress > 0 && (
          <span
            aria-hidden
            style={{
              position: "absolute",
              left: 6,
              right: 6,
              bottom: 6,
              height: 3,
              zIndex: 2,
              borderRadius: 999,
              background: "rgba(255,255,255,0.22)",
              overflow: "hidden",
            }}
          >
            <span
              style={{
                display: "block",
                width: `${Math.min(100, Math.max(0, progress * 100))}%`,
                height: "100%",
                backgroundImage: "var(--brand-gradient)",
              }}
            />
          </span>
        )}
      </div>

      {showTitle && (
        <span
          style={{
            fontSize: 12.5,
            fontWeight: 600,
            lineHeight: 1.25,
            color: "var(--text)",
            display: "-webkit-box",
            WebkitLineClamp: 2,
            WebkitBoxOrient: "vertical",
            overflow: "hidden",
          }}
        >
          {anime.title}
        </span>
      )}
    </button>
  );
}
