import type { AnimeCard } from "@anispots/core";
import { useNavigate } from "react-router-dom";
import { Glass } from "./Glass";
import { Poster } from "./Poster";
import { RailSkeleton } from "./States";

/**
 * A horizontal shelf of posters.
 *
 * `scroll-snap` and `overscroll-behavior` make it behave like a shelf rather than
 * a page: it stops where a card starts, and swiping past the end does not drag
 * the page behind it.
 */
export function Rail({
  name,
  items,
  loading,
  onOpen,
  progressFor,
}: {
  name: string;
  items: AnimeCard[];
  loading?: boolean;
  onOpen?: (anime: AnimeCard) => void;
  progressFor?: (anime: AnimeCard) => number | undefined;
}) {
  const navigate = useNavigate();
  const open = onOpen ?? ((anime: AnimeCard) => navigate(`/anime/${anime.id}`));

  return (
    <section style={{ marginBottom: "var(--s-xxl)" }}>
      <header
        style={{
          display: "flex",
          alignItems: "baseline",
          justifyContent: "space-between",
          padding: "0 var(--s-xl)",
          marginBottom: "var(--s-md)",
        }}
      >
        <h2
          style={{
            margin: 0,
            fontSize: 18,
            fontWeight: 700,
            letterSpacing: -0.2,
          }}
        >
          {name}
        </h2>
        <span aria-hidden style={{ height: 2, flex: 1, marginLeft: 14, background: "linear-gradient(90deg, rgba(255,255,255,0.14), transparent)" }} />
      </header>

      {loading ? (
        <RailSkeleton />
      ) : (
        <div className="rail" role="list">
          {items.map((anime, index) => (
            <div role="listitem" key={anime.id} className="rise" style={{ animationDelay: `${Math.min(index * 32, 240)}ms` }}>
              <Poster anime={anime} onOpen={open} progress={progressFor?.(anime)} />
            </div>
          ))}
        </div>
      )}
    </section>
  );
}

/** The row of genre chips used by Home and Browse. */
export function ChipRow({
  genres,
  active,
  onSelect,
}: {
  genres: { slug: string; name: string }[];
  active?: string;
  onSelect: (slug: string) => void;
}) {
  return (
    <div
      className="rail"
      style={{ gap: "var(--s-sm)", paddingBottom: 4 }}
      role="tablist"
      aria-label="Genres"
    >
      {genres.map((genre) => {
        const selected = genre.slug === active;
        return (
          <button
            key={genre.slug}
            type="button"
            role="tab"
            aria-selected={selected}
            onClick={() => onSelect(genre.slug)}
            className="pressable"
            style={{ border: "none", background: "none", padding: 0, cursor: "pointer" }}
          >
            <Glass
              level={selected ? "regular" : "subtle"}
              radius={999}
              style={{
                padding: "7px 14px",
                fontSize: 13,
                fontWeight: 600,
                whiteSpace: "nowrap",
                color: selected ? "#fff" : "var(--text-muted)",
                backgroundImage: selected ? "var(--brand-gradient)" : undefined,
                borderColor: selected ? "transparent" : undefined,
              }}
            >
              {genre.name}
            </Glass>
          </button>
        );
      })}
    </div>
  );
}
