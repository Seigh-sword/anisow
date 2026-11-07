import { useNavigate, useParams } from "react-router-dom";

import { loadBrowse, loadGenres } from "../lib/data";
import { useAsync } from "../hooks/useAsync";
import { Poster } from "../components/Poster";
import { ChipRow } from "../components/Rail";
import { ErrorState, EmptyState } from "../components/States";

/** A fixed row of non-genre shelves the site also serves under `/genre/`. */
const CATEGORIES = [
  { slug: "tv", name: "TV" },
  { slug: "movie", name: "Movies" },
  { slug: "ova", name: "OVA" },
  { slug: "ona", name: "ONA" },
  { slug: "special", name: "Specials" },
];

/**
 * Browse and genre filtering.
 *
 * The genre list is the site's own list — scraped from its genre links — rather
 * than a hard-coded array, so a genre the site adds shows up without a release.
 * Selecting a genre is a route change, which is what makes a filtered view
 * shareable and survivable across a reload.
 */
export function Browse() {
  const { category } = useParams();
  const navigate = useNavigate();

  const genres = useAsync("genres", loadGenres);
  const shelf = useAsync(category ?? null, () => loadBrowse(category!));

  const genreList = genres.data ?? [];

  return (
    <div>
      <header style={{ padding: "calc(18px + env(safe-area-inset-top)) var(--s-xl) var(--s-md)" }}>
        <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Browse</h1>
      </header>

      {/* Genres first: they are the deeper filter, and the long list the user came for. */}
      <section style={{ marginBottom: "var(--s-lg)" }}>
        <h2
          style={{
            margin: "0 0 var(--s-sm)",
            padding: "0 var(--s-xl)",
            fontSize: 12,
            fontWeight: 700,
            letterSpacing: 1.2,
            textTransform: "uppercase",
            color: "var(--text-faint)",
          }}
        >
          Genres
        </h2>

        {genres.loading && (
          <div className="rail" aria-hidden>
            {Array.from({ length: 5 }).map((_, index) => (
              <div key={index} className="shimmer" style={{ width: 84, height: 34, borderRadius: 999 }} />
            ))}
          </div>
        )}

        {genreList.length > 0 && (
          <ChipRow
            genres={genreList}
            active={category}
            onSelect={(slug) =>
              navigate(category === slug ? "/browse" : `/browse/${slug}`)
            }
          />
        )}
      </section>

      <section style={{ marginBottom: "var(--s-xl)" }}>
        <h2
          style={{
            margin: "0 0 var(--s-sm)",
            padding: "0 var(--s-xl)",
            fontSize: 12,
            fontWeight: 700,
            letterSpacing: 1.2,
            textTransform: "uppercase",
            color: "var(--text-faint)",
          }}
        >
          Type
        </h2>
        <ChipRow genres={CATEGORIES} active={category} onSelect={(slug) => navigate(`/browse/${slug}`)} />
      </section>

      <div style={{ padding: "0 var(--s-xl)" }}>
        {shelf.error && <ErrorState message={shelf.error} onRetry={shelf.retry} title="That shelf did not load" />}

        {!category && !genres.loading && (
          <EmptyState title="Pick a genre" hint="Every genre the site offers is listed above." />
        )}

        {shelf.loading && (
          <div style={{ display: "grid", gridTemplateColumns: "repeat(auto-fill, minmax(104px, 1fr))", gap: 12 }}>
            {Array.from({ length: 12 }).map((_, index) => (
              <div key={index} className="shimmer" style={{ aspectRatio: "2/3", borderRadius: 14 }} aria-hidden />
            ))}
          </div>
        )}

        {!shelf.loading && category && (shelf.data?.length ?? 0) === 0 && !shelf.error && (
          <EmptyState title="Nothing here yet" hint="The site returned no titles for this filter." />
        )}

        {!shelf.loading && (shelf.data?.length ?? 0) > 0 && (
          <div style={{ display: "grid", gridTemplateColumns: "repeat(auto-fill, minmax(104px, 1fr))", gap: 12 }}>
            {shelf.data!.map((card, index) => (
              <div key={card.id} className="rise" style={{ animationDelay: `${Math.min(index * 16, 300)}ms` }}>
                <Poster anime={card} fill showTitle onOpen={() => navigate(`/anime/${card.id}`)} />
              </div>
            ))}
          </div>
        )}
      </div>
    </div>
  );
}
