import { useMemo, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import type { AnimeCard, Episode } from "@anispots/core";

import { useAsync } from "../hooks/useAsync";
import { loadDetails, loadEpisodes } from "../lib/data";
import { getProgress, isInWatchlist, toggleWatchlist } from "../lib/library";
import { Glass } from "../components/Glass";
import { Poster } from "../components/Poster";
import { BrandButton, DownloadIcon, GlassButton, PlayIcon } from "../components/Button";
import { ErrorState, PageSkeleton } from "../components/States";
import { EpisodeSheet } from "../components/EpisodeSheet";
import { DownloadSheet } from "../components/DownloadSheet";

/**
 * The detail screen.
 *
 * Art at the top, then the facts, then the episodes. The one thing it does not
 * do is hide the play button behind the episode list: the primary action is
 * always "play the episode you are on, or the first one", because that is what
 * the user came to do, and the old build made them hunt through a grid first.
 */
export function Detail() {
  const { id = "" } = useParams();
  const navigate = useNavigate();
  const [showEpisodes, setShowEpisodes] = useState(false);
  const [showDownloads, setShowDownloads] = useState(false);
  const [inList, setInList] = useState(() => isInWatchlist(id));

  const details = useAsync(`details:${id}`, () => loadDetails(id));
  const episodes = useAsync(`episodes:${id}`, () => loadEpisodes(id));

  const progress = useMemo(() => getProgress(id), [id]);
  const list: Episode[] = episodes.data ?? [];

  const resumeEpisode = useMemo(() => {
    if (!progress || list.length === 0) return undefined;
    return list.find((episode) => episode.id === progress.episodeId);
  }, [progress, list]);

  if (details.error) return <ErrorState message={details.error} onRetry={details.retry} />;
  if (!details.data) return <PageSkeleton />;

  const anime = details.data;

  const watch = (episode?: Episode) => {
    const target = episode ?? resumeEpisode ?? list[0];
    navigate(target ? `/watch/${anime.id}?ep=${target.id}` : `/watch/${anime.id}`);
  };

  return (
    <div>
      {/* Art first: the poster, blurred and bleeding, with the sharp one in front. */}
      <div style={{ position: "relative", isolation: "isolate", overflow: "hidden" }}>
        <img
          src={anime.poster}
          alt=""
          aria-hidden
          style={{
            position: "absolute",
            inset: 0,
            width: "100%",
            height: "100%",
            objectFit: "cover",
            filter: "blur(38px) saturate(1.5)",
            transform: "scale(1.25)",
            opacity: 0.65,
            zIndex: -2,
          }}
        />
        <div
          aria-hidden
          style={{
            position: "absolute",
            inset: 0,
            zIndex: -1,
            background:
              "linear-gradient(180deg, rgba(7,8,14,0.45) 0%, rgba(7,8,14,0.78) 55%, var(--ink) 100%)",
          }}
        />

        <div style={{ display: "flex", gap: 16, padding: "calc(16px + env(safe-area-inset-top)) var(--s-xl) 0" }}>
          <div style={{ flex: "0 0 auto", width: 132 }}>
            <Poster anime={anime} width={132} />
          </div>

          <div style={{ minWidth: 0, paddingTop: 4, flex: 1 }}>
            <h1
              style={{
                margin: 0,
                fontSize: "clamp(20px, 4.4vw, 30px)",
                lineHeight: 1.1,
                letterSpacing: -0.6,
                fontWeight: 800,
              }}
            >
              {anime.title}
            </h1>
            {anime.japanese && (
              <p style={{ margin: "6px 0 0", fontSize: 12.5, color: "var(--text-faint)" }}>{anime.japanese}</p>
            )}

            <div style={{ display: "flex", flexWrap: "wrap", gap: 6, marginTop: 12 }}>
              {[anime.format, anime.status, anime.premiered, anime.score && `★ ${anime.score}`]
                .filter(Boolean)
                .map((label) => (
                  <span
                    key={String(label)}
                    style={{
                      padding: "3px 9px",
                      borderRadius: 999,
                      fontSize: 11.5,
                      fontWeight: 600,
                      color: "var(--text-muted)",
                      border: "1px solid rgba(255,255,255,0.12)",
                      background: "rgba(255,255,255,0.05)",
                    }}
                  >
                    {label}
                  </span>
                ))}
            </div>

            <div style={{ display: "flex", gap: 8, marginTop: 16, flexWrap: "wrap" }}>
              <BrandButton onClick={() => watch()}>
                <PlayIcon />
                {resumeEpisode ? `Resume EP ${resumeEpisode.number}` : "Play"}
              </BrandButton>

              <GlassButton
                active={inList}
                onClick={() => {
                  setInList(
                    toggleWatchlist({ id: anime.id, title: anime.title, poster: anime.poster }),
                  );
                }}
              >
                {inList ? "In watchlist" : "Watchlist"}
              </GlassButton>

              {list.length > 0 && (
                <GlassButton onClick={() => setShowDownloads(true)}>
                  <DownloadIcon />
                  Download
                </GlassButton>
              )}
            </div>
          </div>
        </div>
      </div>

      <div style={{ padding: "var(--s-xl)", display: "grid", gap: "var(--s-xl)" }}>
        {anime.description && (
          <p style={{ margin: 0, fontSize: 14, lineHeight: 1.62, color: "var(--text-muted)" }}>
            {anime.description}
          </p>
        )}

        {anime.genres.length > 0 && (
          <div style={{ display: "flex", flexWrap: "wrap", gap: 8 }}>
            {anime.genres.map((genre) => (
              <button
                key={genre}
                type="button"
                className="pressable"
                onClick={() => navigate(`/browse/${genre.toLowerCase().replace(/\s+/g, "-")}`)}
                style={{ border: "none", background: "none", padding: 0, cursor: "pointer" }}
              >
                <Glass level="subtle" radius={999} style={{ padding: "6px 13px", fontSize: 12.5, fontWeight: 600 }}>
                  {genre}
                </Glass>
              </button>
            ))}
          </div>
        )}

        {/* Episodes: the full grid, and the sheet for picking one from a long run. */}
        <section>
          <header
            style={{
              display: "flex",
              alignItems: "center",
              justifyContent: "space-between",
              marginBottom: "var(--s-md)",
            }}
          >
            <h2 style={{ margin: 0, fontSize: 16, fontWeight: 700 }}>
              Episodes
              {list.length > 0 && (
                <span style={{ marginLeft: 8, fontSize: 12.5, fontWeight: 500, color: "var(--text-faint)" }}>
                  {list.length}
                </span>
              )}
            </h2>
            {list.length > 12 && (
              <button
                type="button"
                onClick={() => setShowEpisodes(true)}
                style={{
                  border: "none",
                  background: "none",
                  color: "var(--brand-start)",
                  fontSize: 13,
                  fontWeight: 600,
                  cursor: "pointer",
                }}
              >
                All episodes
              </button>
            )}
          </header>

          {episodes.error ? (
            <ErrorState message={episodes.error} onRetry={episodes.retry} title="Episodes did not load" />
          ) : episodes.loading ? (
            <div style={{ display: "grid", gap: 8 }}>
              {Array.from({ length: 4 }).map((_, index) => (
                <div key={index} className="shimmer" style={{ height: 46, borderRadius: 14 }} aria-hidden />
              ))}
            </div>
          ) : list.length === 0 ? (
            <p style={{ margin: 0, fontSize: 13.5, color: "var(--text-muted)" }}>
              This title has no episodes listed yet.
            </p>
          ) : (
            <div style={{ display: "grid", gridTemplateColumns: "repeat(auto-fill, minmax(58px, 1fr))", gap: 8 }}>
              {list.slice(0, 24).map((episode) => {
                const current = progress?.episodeId === episode.id;
                return (
                  <button
                    key={episode.id}
                    type="button"
                    onClick={() => watch(episode)}
                    title={episode.title ?? `Episode ${episode.number}`}
                    className="pressable"
                    style={{
                      aspectRatio: "1.35",
                      borderRadius: 12,
                      border: current
                        ? "1px solid rgba(0,123,255,0.7)"
                        : "1px solid rgba(255,255,255,0.10)",
                      background: current ? "rgba(0,123,255,0.16)" : "rgba(255,255,255,0.05)",
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
              {list.length > 24 && (
                <button
                  type="button"
                  onClick={() => setShowEpisodes(true)}
                  className="pressable"
                  style={{
                    aspectRatio: "1.35",
                    borderRadius: 12,
                    border: "1px dashed rgba(255,255,255,0.2)",
                    background: "transparent",
                    color: "var(--text-muted)",
                    fontWeight: 700,
                    fontSize: 12,
                    cursor: "pointer",
                  }}
                >
                  +{list.length - 24}
                </button>
              )}
            </div>
          )}
        </section>

        {anime.recommendations.length > 0 && (
          <section>
            <h2 style={{ margin: "0 0 var(--s-md)", fontSize: 16, fontWeight: 700 }}>Recommended</h2>
            <div className="rail" style={{ paddingInline: 0, marginInline: "calc(var(--s-xl) * -1)" }}>
              {anime.recommendations.slice(0, 12).map((card: AnimeCard) => (
                <Poster key={card.id} anime={card} width={104} onOpen={() => navigate(`/anime/${card.id}`)} />
              ))}
            </div>
          </section>
        )}
      </div>

      <EpisodeSheet
        open={showEpisodes}
        onClose={() => setShowEpisodes(false)}
        episodes={list}
        currentId={progress?.episodeId}
        onPick={(episode) => {
          setShowEpisodes(false);
          watch(episode);
        }}
      />

      <DownloadSheet
        open={showDownloads}
        onClose={() => setShowDownloads(false)}
        target={{
          animeId: anime.id,
          animeTitle: anime.title,
          coverUrl: anime.poster,
          description: anime.description,
        }}
        episodes={list}
      />
    </div>
  );
}
