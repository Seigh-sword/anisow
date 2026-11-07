import { useMemo } from "react";
import { useNavigate } from "react-router-dom";
import type { AnimeCard, Spotlight as SpotlightData } from "@anispots/core";

import { loadHome, localRails } from "../lib/data";
import { useAsync } from "../hooks/useAsync";
import { Glass } from "../components/Glass";
import { Rail } from "../components/Rail";
import { BrandButton, PlayIcon } from "../components/Button";
import { ErrorState, PageSkeleton } from "../components/States";
import { getProgress } from "../lib/library";

/**
 * The hero.
 *
 * Not a carousel: one spotlight that fills the top of the screen, with the art
 * bleeding under a gradient so the title has a dark bed to sit on. Two actions
 * only — watch, or read more. Everything else belongs to the rails below.
 */
function Spotlight({ item }: { item: SpotlightData }) {
  const navigate = useNavigate();

  return (
    <div
      style={{
        position: "relative",
        minHeight: "clamp(360px, 64vh, 540px)",
        display: "flex",
        alignItems: "flex-end",
        overflow: "hidden",
        isolation: "isolate",
      }}
    >
      <img
        src={item.poster}
        alt=""
        style={{
          position: "absolute",
          inset: 0,
          width: "100%",
          height: "100%",
          objectFit: "cover",
          objectPosition: "center 18%",
          zIndex: -2,
          filter: "saturate(1.08)",
        }}
      />
      <div
        aria-hidden
        style={{
          position: "absolute",
          inset: 0,
          zIndex: -1,
          background:
            "linear-gradient(180deg, rgba(7,8,14,0.26) 0%, rgba(7,8,14,0.52) 40%, rgba(7,8,14,0.94) 76%, var(--ink) 100%)",
        }}
      />
      <div
        aria-hidden
        style={{
          position: "absolute",
          inset: 0,
          zIndex: -1,
          background: "linear-gradient(100deg, rgba(0,123,255,0.22), transparent 58%)",
          mixBlendMode: "screen",
        }}
      />

      <div style={{ padding: "0 var(--s-xl) var(--s-xl)", width: "100%" }}>
        <p
          style={{
            margin: "0 0 8px",
            fontSize: 11,
            fontWeight: 800,
            letterSpacing: 1.8,
            textTransform: "uppercase",
            color: "var(--brand-start)",
          }}
        >
          {item.label ?? "Spotlight"}
        </p>
        <h1
          style={{
            margin: 0,
            fontSize: "clamp(27px, 5.4vw, 44px)",
            lineHeight: 1.05,
            letterSpacing: -1,
            fontWeight: 800,
            maxWidth: "16ch",
            textShadow: "0 8px 34px rgba(0,0,0,0.6)",
          }}
        >
          {item.title}
        </h1>

        {item.description && (
          <p
            className="clamp-3"
            style={{
              margin: "12px 0 0",
              fontSize: 13.5,
              lineHeight: 1.55,
              color: "var(--text-muted)",
              maxWidth: "52ch",
            }}
          >
            {item.description}
          </p>
        )}

        <div style={{ display: "flex", gap: 10, marginTop: 18, flexWrap: "wrap" }}>
          <BrandButton onClick={() => navigate(`/watch/${item.id}`)}>
            <PlayIcon />
            Watch now
          </BrandButton>

          <button
            type="button"
            className="pressable"
            onClick={() => navigate(`/anime/${item.id}`)}
            style={{ border: "none", background: "none", padding: 0, cursor: "pointer" }}
          >
            <Glass level="regular" radius={999} style={{ padding: "11px 20px", fontSize: 14, fontWeight: 600 }}>
              Details
            </Glass>
          </button>
        </div>
      </div>
    </div>
  );
}

export function Home() {
  const state = useAsync("home", loadHome);
  const navigate = useNavigate();

  // Read the local shelves once per render pass; they are cheap (localStorage).
  const mine = useMemo(() => localRails((id) => getProgress(id)?.fraction), []);

  if (state.error) {
    return <ErrorState message={state.error} onRetry={state.retry} title="Home did not load" />;
  }

  if (!state.data) return <PageSkeleton />;

  const { spotlight, rails } = state.data;
  const hero = spotlight[0];

  return (
    <div>
      {hero && <Spotlight item={hero} />}

      <div style={{ marginTop: "var(--s-lg)" }}>
        {mine.map((rail) => (
          <Rail key={rail.name} name={rail.name} items={rail.items} />
        ))}

        {rails.map((rail) => (
          <Rail
            key={rail.name}
            name={rail.name}
            items={rail.items}
            progressFor={(anime: AnimeCard) => getProgress(anime.id)?.fraction}
          />
        ))}

        <div style={{ padding: "0 var(--s-xl) var(--s-xxl)" }}>
          <button
            type="button"
            onClick={() => navigate("/settings")}
            className="pressable"
            style={{ border: "none", background: "none", padding: 0, width: "100%", cursor: "pointer" }}
          >
            <Glass level="subtle" radius={18} style={{ padding: "14px 16px", textAlign: "left" }}>
              <span style={{ fontSize: 13, fontWeight: 600 }}>Settings</span>
              <span style={{ display: "block", marginTop: 2, fontSize: 12, color: "var(--text-faint)" }}>
                Downloads, data and storage
              </span>
            </Glass>
          </button>
        </div>
      </div>
    </div>
  );
}
