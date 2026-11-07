import { useEffect, useMemo, useState } from "react";
import { useNavigate, useParams, useSearchParams } from "react-router-dom";
import type { FilterParams } from "@anispots/core";

import { loadFilter, loadGenres } from "../lib/data";
import { useAsync } from "../hooks/useAsync";
import { Poster } from "../components/Poster";
import { Glass } from "../components/Glass";
import { BrandButton, GlassButton } from "../components/Button";
import { ErrorState, EmptyState } from "../components/States";

const TYPES = [
  { value: "", label: "All" },
  { value: "tv", label: "TV" },
  { value: "movie", label: "Movie" },
  { value: "ova", label: "OVA" },
  { value: "ona", label: "ONA" },
  { value: "special", label: "Special" },
  { value: "music", label: "Music" },
];

const STATUSES = [
  { value: "", label: "All" },
  { value: "completed", label: "Finished Airing" },
  { value: "releasing", label: "Currently Airing" },
  { value: "not_yet_aired", label: "Not yet aired" },
];

const RATINGS = [
  { value: "", label: "All" },
  { value: "g", label: "G" },
  { value: "pg", label: "PG" },
  { value: "pg_13", label: "PG-13" },
  { value: "r_17", label: "R" },
  { value: "r_plus", label: "R+" },
  { value: "rx", label: "Rx" },
];

const SCORES = [
  { value: "", label: "All" },
  { value: "10", label: "(10) Masterpiece" },
  { value: "9", label: "(9) Great" },
  { value: "8", label: "(8) Very Good" },
  { value: "7", label: "(7) Good" },
  { value: "6", label: "(6) Fine" },
  { value: "5", label: "(5) Average" },
  { value: "4", label: "(4) Bad" },
  { value: "3", label: "(3) Very Bad" },
  { value: "2", label: "(2) Horrible" },
  { value: "1", label: "(1) Appalling" },
];

const SEASONS = [
  { value: "", label: "All" },
  { value: "spring", label: "Spring" },
  { value: "summer", label: "Summer" },
  { value: "fall", label: "Fall" },
  { value: "winter", label: "Winter" },
];

const LANGUAGES = [
  { value: "", label: "All" },
  { value: "sub", label: "SUB" },
  { value: "dub", label: "DUB" },
];

const SORTS = [
  { value: "", label: "Default" },
  { value: "updated_date", label: "Recently Updated" },
  { value: "added_date", label: "Recently Added" },
  { value: "release_date", label: "Released Date" },
  { value: "trending", label: "Trending" },
  { value: "title_az", label: "Name A-Z" },
  { value: "avg_score", label: "Score" },
];

const YEARS = [
  { value: "", label: "Year" },
  ...Array.from({ length: 48 }, (_, i) => {
    const y = String(2027 - i);
    return { value: y, label: y };
  }),
];

const MONTHS = [
  { value: "", label: "Month" },
  { value: "1", label: "Jan" },
  { value: "2", label: "Feb" },
  { value: "3", label: "Mar" },
  { value: "4", label: "Apr" },
  { value: "5", label: "May" },
  { value: "6", label: "Jun" },
  { value: "7", label: "Jul" },
  { value: "8", label: "Aug" },
  { value: "9", label: "Sep" },
  { value: "10", label: "Oct" },
  { value: "11", label: "Nov" },
  { value: "12", label: "Dec" },
];

const DAYS = [
  { value: "", label: "Day" },
  ...Array.from({ length: 31 }, (_, i) => {
    const d = String(i + 1);
    return { value: d, label: d };
  }),
];

const FALLBACK_GENRES = [
  ["action", "Action"],
  ["action-adventure", "Action & Adventure"],
  ["adventure", "Adventure"],
  ["animation", "Animation"],
  ["award-winning", "Award Winning"],
  ["boys-love", "Boys Love"],
  ["cars", "Cars"],
  ["comedy", "Comedy"],
  ["dementia", "Dementia"],
  ["demons", "Demons"],
  ["drama", "Drama"],
  ["ecchi", "Ecchi"],
  ["erotica", "Erotica"],
  ["fantasy", "Fantasy"],
  ["game", "Game"],
  ["girls-love", "Girls Love"],
  ["gourmet", "Gourmet"],
  ["harem", "Harem"],
  ["historical", "Historical"],
  ["horror", "Horror"],
  ["isekai", "Isekai"],
  ["josei", "Josei"],
  ["kids", "Kids"],
  ["magic", "Magic"],
  ["mahou-shoujo", "Mahou Shoujo"],
  ["martial-arts", "Martial Arts"],
  ["mecha", "Mecha"],
  ["military", "Military"],
  ["music", "Music"],
  ["mystery", "Mystery"],
  ["parody", "Parody"],
  ["police", "Police"],
  ["psychological", "Psychological"],
  ["romance", "Romance"],
  ["samurai", "Samurai"],
  ["school", "School"],
  ["sci-fi", "Sci-Fi"],
  ["sci-fi-fantasy", "Sci-Fi & Fantasy"],
  ["seinen", "Seinen"],
  ["shoujo", "Shoujo"],
  ["shoujo-ai", "Shoujo Ai"],
  ["shounen", "Shounen"],
  ["shounen-ai", "Shounen Ai"],
  ["slice-of-life", "Slice of Life"],
  ["space", "Space"],
  ["sports", "Sports"],
  ["strategy-game", "Strategy Game"],
  ["super-power", "Super Power"],
  ["supernatural", "Supernatural"],
  ["suspense", "Suspense"],
  ["thriller", "Thriller"],
  ["urban-fantasy", "Urban Fantasy"],
  ["vampire", "Vampire"],
].map(([slug, name]) => ({ slug: slug!, name: name! }));

const TYPE_SET = new Set(["tv", "movie", "ova", "ona", "special", "music"]);

/**
 * Full multi-criteria Filter & Browse screen.
 *
 * Matches the AniWatch `/filter` experience:
 *  - Type, Status, Rated, Score, Season, Language, Start Date (Y/M/D), End Date (Y/M/D), Sort
 *  - Wrapped multi-select Genre grid (all 50+ genres visible at once, no single-line scroll truncation)
 *  - Instant results loaded by default (never an empty "Pick a genre" screen)
 */
export function Browse() {
  const { category } = useParams();
  const [searchParams, setSearchParams] = useSearchParams();
  const navigate = useNavigate();

  const genresQuery = useAsync("genres", loadGenres);
  const genreList = useMemo(() => {
    const live = genresQuery.data ?? [];
    if (live.length >= 12) return live;
    return FALLBACK_GENRES;
  }, [genresQuery.data]);

  const initialFromRoute = useMemo((): FilterParams => {
    const gParam = searchParams.get("genres");
    const routeGenres = gParam ? gParam.split(",").filter(Boolean) : [];
    const catSlug = category?.trim().toLowerCase();
    const isType = catSlug ? TYPE_SET.has(catSlug) : false;
    if (catSlug && !isType && !routeGenres.includes(catSlug)) {
      routeGenres.push(catSlug);
    }
    return {
      keyword: searchParams.get("keyword") ?? "",
      type: searchParams.get("type") ?? (isType && catSlug ? catSlug : ""),
      status: searchParams.get("status") ?? "",
      rating: searchParams.get("rating") ?? "",
      score: searchParams.get("score") ?? "",
      season: searchParams.get("season") ?? "",
      language: searchParams.get("language") ?? "",
      sort: searchParams.get("sort") ?? "",
      startYear: searchParams.get("sy") ?? "",
      startMonth: searchParams.get("sm") ?? "",
      startDay: searchParams.get("sd") ?? "",
      endYear: searchParams.get("ey") ?? "",
      endMonth: searchParams.get("em") ?? "",
      endDay: searchParams.get("ed") ?? "",
      genres: routeGenres,
    };
  }, [category, searchParams]);

  const [draft, setDraft] = useState<FilterParams>(initialFromRoute);
  const [applied, setApplied] = useState<FilterParams>(initialFromRoute);

  useEffect(() => {
    setDraft(initialFromRoute);
    setApplied(initialFromRoute);
  }, [initialFromRoute]);

  const shelf = useAsync(
    `filter:${JSON.stringify(applied)}`,
    () => loadFilter(applied),
    [applied],
  );

  const toggleGenre = (slug: string) => {
    const current = draft.genres ?? [];
    const exists = current.includes(slug);
    const nextGenres = exists ? current.filter((g) => g !== slug) : [...current, slug];
    const nextDraft = { ...draft, genres: nextGenres };
    setDraft(nextDraft);

    // If single-clicking a genre, also update the route so `/browse/{slug}` works cleanly
    if (nextGenres.length === 1 && !exists) {
      navigate(`/browse/${slug}`);
    } else if (nextGenres.length === 0 && category) {
      navigate("/browse");
    } else {
      setApplied(nextDraft);
    }
  };

  const applyFilter = () => {
    const nextParams = new URLSearchParams();
    if (draft.keyword?.trim()) nextParams.set("keyword", draft.keyword.trim());
    if (draft.type) nextParams.set("type", draft.type);
    if (draft.status) nextParams.set("status", draft.status);
    if (draft.rating) nextParams.set("rating", draft.rating);
    if (draft.score) nextParams.set("score", draft.score);
    if (draft.season) nextParams.set("season", draft.season);
    if (draft.language) nextParams.set("language", draft.language);
    if (draft.sort) nextParams.set("sort", draft.sort);
    if (draft.startYear) nextParams.set("sy", draft.startYear);
    if (draft.startMonth) nextParams.set("sm", draft.startMonth);
    if (draft.startDay) nextParams.set("sd", draft.startDay);
    if (draft.endYear) nextParams.set("ey", draft.endYear);
    if (draft.endMonth) nextParams.set("em", draft.endMonth);
    if (draft.endDay) nextParams.set("ed", draft.endDay);
    if (draft.genres && draft.genres.length > 0) {
      nextParams.set("genres", draft.genres.join(","));
    }
    setApplied({ ...draft });
    setSearchParams(nextParams, { replace: true });
  };

  const resetFilter = () => {
    const empty: FilterParams = {
      keyword: "",
      type: "",
      status: "",
      rating: "",
      score: "",
      season: "",
      language: "",
      sort: "",
      startYear: "",
      startMonth: "",
      startDay: "",
      endYear: "",
      endMonth: "",
      endDay: "",
      genres: [],
    };
    setDraft(empty);
    setApplied(empty);
    navigate("/browse", { replace: true });
  };

  const selectedGenres = new Set(draft.genres ?? []);
  const activeCount =
    (draft.type ? 1 : 0) +
    (draft.status ? 1 : 0) +
    (draft.rating ? 1 : 0) +
    (draft.score ? 1 : 0) +
    (draft.season ? 1 : 0) +
    (draft.language ? 1 : 0) +
    (draft.sort ? 1 : 0) +
    (draft.startYear || draft.startMonth || draft.startDay ? 1 : 0) +
    (draft.endYear || draft.endMonth || draft.endDay ? 1 : 0) +
    selectedGenres.size;

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
        <div>
          <p style={{ margin: "0 0 4px", fontSize: 12, color: "var(--text-faint)" }}>
            Home · <span style={{ color: "var(--text-muted)" }}>Filter</span>
          </p>
          <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Browse & Filter</h1>
        </div>
        {activeCount > 0 && (
          <GlassButton onClick={resetFilter} style={{ padding: "6px 14px", fontSize: 12.5 }}>
            Reset ({activeCount})
          </GlassButton>
        )}
      </header>

      <div style={{ padding: "0 var(--s-xl)", display: "grid", gap: "var(--s-xl)" }}>
        <Glass level="regular" radius={20} style={{ padding: "20px 20px 22px" }}>
          <h2 style={{ margin: "0 0 14px", fontSize: 15, fontWeight: 800 }}>Filter</h2>

          {/* Row 1 & 2: Filter dropdowns */}
          <div style={{ display: "flex", flexWrap: "wrap", gap: 10, marginBottom: 20 }}>
            <FilterSelect
              label="Type"
              value={draft.type ?? ""}
              options={TYPES}
              onChange={(value) => setDraft((d) => ({ ...d, type: value }))}
            />
            <FilterSelect
              label="Status"
              value={draft.status ?? ""}
              options={STATUSES}
              onChange={(value) => setDraft((d) => ({ ...d, status: value }))}
            />
            <FilterSelect
              label="Rated"
              value={draft.rating ?? ""}
              options={RATINGS}
              onChange={(value) => setDraft((d) => ({ ...d, rating: value }))}
            />
            <FilterSelect
              label="Score"
              value={draft.score ?? ""}
              options={SCORES}
              onChange={(value) => setDraft((d) => ({ ...d, score: value }))}
            />
            <FilterSelect
              label="Season"
              value={draft.season ?? ""}
              options={SEASONS}
              onChange={(value) => setDraft((d) => ({ ...d, season: value }))}
            />
            <FilterSelect
              label="Language"
              value={draft.language ?? ""}
              options={LANGUAGES}
              onChange={(value) => setDraft((d) => ({ ...d, language: value }))}
            />

            <DateGroup
              label="Start Date"
              year={draft.startYear ?? ""}
              month={draft.startMonth ?? ""}
              day={draft.startDay ?? ""}
              onYear={(v) => setDraft((d) => ({ ...d, startYear: v }))}
              onMonth={(v) => setDraft((d) => ({ ...d, startMonth: v }))}
              onDay={(v) => setDraft((d) => ({ ...d, startDay: v }))}
            />

            <DateGroup
              label="End Date"
              year={draft.endYear ?? ""}
              month={draft.endMonth ?? ""}
              day={draft.endDay ?? ""}
              onYear={(v) => setDraft((d) => ({ ...d, endYear: v }))}
              onMonth={(v) => setDraft((d) => ({ ...d, endMonth: v }))}
              onDay={(v) => setDraft((d) => ({ ...d, endDay: v }))}
            />

            <FilterSelect
              label="Sort"
              value={draft.sort ?? ""}
              options={SORTS}
              onChange={(value) => setDraft((d) => ({ ...d, sort: value }))}
            />
          </div>

          {/* Genre multi-select wrapped grid */}
          <h2 style={{ margin: "0 0 12px", fontSize: 15, fontWeight: 800 }}>Genre</h2>

          <div
            role="tablist"
            aria-label="Genres"
            style={{
              display: "flex",
              flexWrap: "wrap",
              gap: 8,
              marginBottom: 20,
            }}
          >
            {genreList.map((genre) => {
              const selected = selectedGenres.has(genre.slug);
              return (
                <button
                  key={genre.slug}
                  role="tab"
                  aria-selected={selected}
                  type="button"
                  onClick={() => toggleGenre(genre.slug)}
                  className="pressable"
                  style={{
                    padding: "7px 13px",
                    borderRadius: 8,
                    fontSize: 12.5,
                    fontWeight: 600,
                    cursor: "pointer",
                    border: selected
                      ? "1px solid rgba(0, 123, 255, 0.75)"
                      : "1px solid rgba(255, 255, 255, 0.12)",
                    background: selected
                      ? "linear-gradient(135deg, rgba(0,123,255,0.28), rgba(255,0,255,0.22))"
                      : "rgba(255, 255, 255, 0.04)",
                    color: selected ? "#fff" : "var(--text-muted)",
                    transition: "all 150ms ease",
                  }}
                >
                  {genre.name}
                </button>
              );
            })}
          </div>

          <div style={{ display: "flex", alignItems: "center", gap: 10 }}>
            <BrandButton onClick={applyFilter} style={{ padding: "10px 24px", borderRadius: 10 }}>
              Filter
            </BrandButton>
            {selectedGenres.size > 0 && (
              <span style={{ fontSize: 12.5, color: "var(--text-faint)" }}>
                {selectedGenres.size} genre{selectedGenres.size > 1 ? "s" : ""} selected
              </span>
            )}
          </div>
        </Glass>

        {/* Results Grid */}
        <section>
          <header
            style={{
              display: "flex",
              alignItems: "baseline",
              justifyContent: "space-between",
              marginBottom: "var(--s-md)",
            }}
          >
            <h2 style={{ margin: 0, fontSize: 18, fontWeight: 700 }}>
              Filter Results
              {!shelf.loading && shelf.data && (
                <span style={{ marginLeft: 8, fontSize: 12.5, fontWeight: 500, color: "var(--text-faint)" }}>
                  {shelf.data.length} titles
                </span>
              )}
            </h2>
          </header>

          {shelf.error && <ErrorState message={shelf.error} onRetry={shelf.retry} title="That filter did not load" />}

          {shelf.loading && (
            <div style={{ display: "grid", gridTemplateColumns: "repeat(auto-fill, minmax(112px, 1fr))", gap: 14 }}>
              {Array.from({ length: 12 }).map((_, index) => (
                <div key={index} className="shimmer" style={{ aspectRatio: "2/3", borderRadius: 14 }} aria-hidden />
              ))}
            </div>
          )}

          {!shelf.loading && (shelf.data?.length ?? 0) === 0 && !shelf.error && (
            <EmptyState title="No matching anime" hint="Try relaxing one of the filters or clearing a genre." />
          )}

          {!shelf.loading && (shelf.data?.length ?? 0) > 0 && (
            <div style={{ display: "grid", gridTemplateColumns: "repeat(auto-fill, minmax(112px, 1fr))", gap: 14 }}>
              {shelf.data!.map((card, index) => (
                <div key={card.id} className="rise" style={{ animationDelay: `${Math.min(index * 16, 300)}ms` }}>
                  <Poster anime={card} fill showTitle onOpen={() => navigate(`/anime/${card.id}`)} />
                </div>
              ))}
            </div>
          )}
        </section>
      </div>
    </div>
  );
}

function FilterSelect({
  label,
  value,
  options,
  onChange,
}: {
  label: string;
  value: string;
  options: { value: string; label: string }[];
  onChange: (value: string) => void;
}) {
  return (
    <label
      style={{
        display: "inline-flex",
        alignItems: "center",
        gap: 8,
        padding: "6px 11px",
        borderRadius: 9,
        border: "1px solid rgba(255,255,255,0.12)",
        background: "rgba(255,255,255,0.04)",
        fontSize: 12.5,
      }}
    >
      <span style={{ color: "var(--text-muted)", fontWeight: 600 }}>{label}</span>
      <select
        aria-label={label}
        value={value}
        onChange={(e) => onChange(e.target.value)}
        style={{
          border: "none",
          background: "transparent",
          color: "var(--brand-start)",
          fontWeight: 700,
          fontSize: 12.5,
          outline: "none",
          cursor: "pointer",
        }}
      >
        {options.map((opt) => (
          <option key={opt.value} value={opt.value} style={{ background: "#0d0f18", color: "#fff" }}>
            {opt.label}
          </option>
        ))}
      </select>
    </label>
  );
}

function DateGroup({
  label,
  year,
  month,
  day,
  onYear,
  onMonth,
  onDay,
}: {
  label: string;
  year: string;
  month: string;
  day: string;
  onYear: (v: string) => void;
  onMonth: (v: string) => void;
  onDay: (v: string) => void;
}) {
  const selectStyle = {
    border: "none",
    background: "rgba(0,0,0,0.28)",
    color: "var(--brand-start)",
    fontWeight: 700,
    fontSize: 12,
    padding: "4px 6px",
    borderRadius: 6,
    outline: "none",
    cursor: "pointer",
  } as const;

  return (
    <div
      style={{
        display: "inline-flex",
        alignItems: "center",
        gap: 6,
        padding: "5px 10px",
        borderRadius: 9,
        border: "1px solid rgba(255,255,255,0.12)",
        background: "rgba(255,255,255,0.04)",
        fontSize: 12.5,
      }}
    >
      <span style={{ color: "var(--text-muted)", fontWeight: 600, marginRight: 2 }}>{label}</span>
      <select aria-label={`${label} Year`} value={year} onChange={(e) => onYear(e.target.value)} style={selectStyle}>
        {YEARS.map((opt) => (
          <option key={opt.value} value={opt.value} style={{ background: "#0d0f18", color: "#fff" }}>
            {opt.label}
          </option>
        ))}
      </select>
      <select aria-label={`${label} Month`} value={month} onChange={(e) => onMonth(e.target.value)} style={selectStyle}>
        {MONTHS.map((opt) => (
          <option key={opt.value} value={opt.value} style={{ background: "#0d0f18", color: "#fff" }}>
            {opt.label}
          </option>
        ))}
      </select>
      <select aria-label={`${label} Day`} value={day} onChange={(e) => onDay(e.target.value)} style={selectStyle}>
        {DAYS.map((opt) => (
          <option key={opt.value} value={opt.value} style={{ background: "#0d0f18", color: "#fff" }}>
            {opt.label}
          </option>
        ))}
      </select>
    </div>
  );
}
