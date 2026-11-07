import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

import { getWatchlist, toggleWatchlist, type WatchlistItem } from "../lib/library";
import { Poster } from "../components/Poster";
import { EmptyState } from "../components/States";
import { BrandButton } from "../components/Button";

/**
 * The watchlist.
 *
 * Everything here is local, so it renders synchronously — no loading state, no
 * skeleton. That is deliberate: a saved list that takes a second to appear feels
 * like it might have been lost.
 */
export function Watchlist() {
  const navigate = useNavigate();
  const [items, setItems] = useState<WatchlistItem[]>([]);

  useEffect(() => setItems(getWatchlist()), []);

  const remove = (item: WatchlistItem) => {
    toggleWatchlist({ id: item.id, title: item.title, poster: item.poster });
    setItems(getWatchlist());
  };

  if (items.length === 0) {
    return (
      <div>
        <header style={{ padding: "calc(18px + env(safe-area-inset-top)) var(--s-xl) 0" }}>
          <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Watchlist</h1>
        </header>
        <EmptyState
          title="Nothing saved yet"
          hint="Tap Watchlist on any anime and it will be waiting here — no network needed to see it."
        />
        <div style={{ display: "grid", placeItems: "center" }}>
          <BrandButton onClick={() => navigate("/browse")}>Browse anime</BrandButton>
        </div>
      </div>
    );
  }

  return (
    <div>
      <header
        style={{
          padding: "calc(18px + env(safe-area-inset-top)) var(--s-xl) var(--s-lg)",
          display: "flex",
          alignItems: "baseline",
          justifyContent: "space-between",
        }}
      >
        <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Watchlist</h1>
        <span style={{ fontSize: 12.5, color: "var(--text-faint)" }}>
          {items.length} {items.length === 1 ? "title" : "titles"}
        </span>
      </header>

      <div
        style={{
          display: "grid",
          gridTemplateColumns: "repeat(auto-fill, minmax(104px, 1fr))",
          gap: 12,
          padding: "0 var(--s-xl)",
        }}
      >
        {items.map((item, index) => (
          <div key={item.id} style={{ position: "relative" }} className="rise" >
            <Poster
              anime={{ id: item.id, title: item.title, poster: item.poster }}
              fill
              showTitle
              onOpen={() => navigate(`/anime/${item.id}`)}
            />
            <button
              type="button"
              aria-label={`Remove ${item.title} from watchlist`}
              onClick={() => remove(item)}
              style={{
                position: "absolute",
                top: 5,
                right: 5,
                width: 24,
                height: 24,
                borderRadius: 999,
                display: "grid",
                placeItems: "center",
                border: "1px solid rgba(255,255,255,0.18)",
                background: "rgba(7,8,14,0.72)",
                backdropFilter: "blur(8px)",
                color: "var(--text)",
                cursor: "pointer",
                fontSize: 12,
                zIndex: 3,
              }}
            >
              ✕
            </button>
            <span style={{ display: "none" }}>{index}</span>
          </div>
        ))}
      </div>
    </div>
  );
}
