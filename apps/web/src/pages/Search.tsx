import { useEffect, useMemo, useRef, useState } from "react";
import { useNavigate } from "react-router-dom";
import type { AnimeCard } from "@anispots/core";

import { search, suggest } from "../lib/data";
import { useAsync } from "../hooks/useAsync";
import { Poster } from "../components/Poster";
import { Glass } from "../components/Glass";
import { ErrorState, EmptyState } from "../components/States";

/**
 * Search.
 *
 * Typing hits the suggestion endpoint (debounced, and only past two characters),
 * submitting hits the real search. The two are separate because they behave
 * differently: one has to feel instant, the other has to be complete.
 */
export function Search() {
  const navigate = useNavigate();
  const [text, setText] = useState("");
  const [submitted, setSubmitted] = useState("");
  const [hints, setHints] = useState<AnimeCard[]>([]);
  const [showHints, setShowHints] = useState(false);
  const inputRef = useRef<HTMLInputElement | null>(null);

  const results = useAsync(submitted || null, () => search(submitted));

  useEffect(() => {
    const query = text.trim();
    if (query.length < 2) {
      setHints([]);
      return;
    }

    let cancelled = false;
    const timer = window.setTimeout(() => {
      suggest(query)
        .then((list) => {
          if (!cancelled) setHints(list);
        })
        .catch(() => {
          if (!cancelled) setHints([]);
        });
    }, 220);

    return () => {
      cancelled = true;
      window.clearTimeout(timer);
    };
  }, [text]);

  const canShowHints = showHints && hints.length > 0 && text.trim() !== submitted;

  const list = useMemo(() => results.data ?? [], [results.data]);

  return (
    <div>
      <header style={{ padding: "calc(18px + env(safe-area-inset-top)) var(--s-xl) var(--s-lg)" }}>
        <h1 style={{ margin: "0 0 14px", fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Search</h1>

        <form
          onSubmit={(event) => {
            event.preventDefault();
            setShowHints(false);
            inputRef.current?.blur();
            setSubmitted(text.trim());
          }}
        >
          <div style={{ position: "relative" }}>
            <Glass level="regular" radius={999} style={{ display: "flex", alignItems: "center", padding: "4px 6px 4px 14px" }}>
              <svg width="17" height="17" viewBox="0 0 24 24" fill="none" stroke="var(--text-faint)" strokeWidth="1.9" strokeLinecap="round" aria-hidden>
                <path d="M10.5 4a6.5 6.5 0 1 0 0 13 6.5 6.5 0 0 0 0-13M20 20l-4.6-4.6" />
              </svg>
              <input
                ref={inputRef}
                value={text}
                onChange={(event) => {
                  setText(event.target.value);
                  setShowHints(true);
                }}
                onFocus={() => setShowHints(true)}
                onBlur={() => window.setTimeout(() => setShowHints(false), 120)}
                placeholder="Titles, or a genre…"
                aria-label="Search anime"
                enterKeyHint="search"
                style={{
                  flex: 1,
                  border: "none",
                  background: "none",
                  color: "var(--text)",
                  fontSize: 15,
                  padding: "10px 8px",
                  outline: "none",
                  minWidth: 0,
                }}
              />
              {text && (
                <button
                  type="button"
                  aria-label="Clear"
                  onClick={() => {
                    setText("");
                    setSubmitted("");
                    inputRef.current?.focus();
                  }}
                  style={{ border: "none", background: "none", color: "var(--text-faint)", cursor: "pointer", padding: 8 }}
                >
                  ✕
                </button>
              )}
              <button
                type="submit"
                className="pressable"
                style={{
                  border: "none",
                  borderRadius: 999,
                  padding: "8px 16px",
                  backgroundImage: "var(--brand-gradient)",
                  color: "#fff",
                  fontWeight: 700,
                  fontSize: 13,
                  cursor: "pointer",
                }}
              >
                Go
              </button>
            </Glass>

            {canShowHints && (
              <div
                style={{
                  position: "absolute",
                  left: 0,
                  right: 0,
                  top: "calc(100% + 8px)",
                  zIndex: 20,
                }}
              >
                <Glass level="floating" radius={20} style={{ overflow: "hidden" }}>
                  {hints.slice(0, 6).map((card) => (
                    <button
                      key={card.id}
                      type="button"
                      onMouseDown={() => navigate(`/anime/${card.id}`)}
                      style={{
                        display: "flex",
                        alignItems: "center",
                        gap: 10,
                        width: "100%",
                        padding: "9px 12px",
                        border: "none",
                        background: "none",
                        color: "inherit",
                        textAlign: "left",
                        cursor: "pointer",
                      }}
                    >
                      <img
                        src={card.poster}
                        alt=""
                        style={{ width: 30, height: 45, objectFit: "cover", borderRadius: 6, flex: "0 0 auto" }}
                      />
                      <span style={{ minWidth: 0 }}>
                        <span style={{ display: "block", fontSize: 13.5, fontWeight: 600, overflow: "hidden", textOverflow: "ellipsis", whiteSpace: "nowrap" }}>
                          {card.title}
                        </span>
                        {card.format && (
                          <span style={{ fontSize: 11, color: "var(--text-faint)" }}>{card.format}</span>
                        )}
                      </span>
                    </button>
                  ))}
                </Glass>
              </div>
            )}
          </div>
        </form>
      </header>

      {results.error && <ErrorState message={results.error} onRetry={results.retry} title="Search failed" />}

      {results.loading && (
        <div style={{ display: "grid", gridTemplateColumns: "repeat(auto-fill, minmax(104px, 1fr))", gap: 12, padding: "0 var(--s-xl)" }}>
          {Array.from({ length: 9 }).map((_, index) => (
            <div key={index} className="shimmer" style={{ aspectRatio: "2/3", borderRadius: 14 }} aria-hidden />
          ))}
        </div>
      )}

      {!results.loading && !submitted && (
        <EmptyState title="Find something to watch" hint="Search by title, or browse by genre from the Browse tab." />
      )}

      {!results.loading && submitted && list.length === 0 && !results.error && (
        <EmptyState title={`Nothing for "${submitted}"`} hint="Try a shorter title, or the Japanese name." />
      )}

      {list.length > 0 && (
        <div
          style={{
            display: "grid",
            gridTemplateColumns: "repeat(auto-fill, minmax(104px, 1fr))",
            gap: 12,
            padding: "0 var(--s-xl)",
          }}
        >
          {list.map((card, index) => (
            <div key={card.id} className="rise" style={{ animationDelay: `${Math.min(index * 18, 260)}ms` }}>
              <Poster
                anime={card}
                fill
                showTitle
                onOpen={() => navigate(`/anime/${card.id}`)}
              />
            </div>
          ))}
        </div>
      )}
    </div>
  );
}
