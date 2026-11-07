/**
 * Preview data.
 *
 * The development sandbox this repository is often edited in has no outbound
 * sockets, so the catalogue cannot be reached and every screen would show a
 * retry card. That is correct behaviour and a useless way to look at a design.
 *
 * This module exists only when `VITE_DEMO=1`. It is not a fallback and it never
 * hides a real failure: with the flag unset (the default, and what a deploy
 * does) none of this is reachable. When it is on, the shell shows a badge saying
 * so, so nobody mistakes the sample catalogue for the live one.
 *
 * Posters are generated as inline SVG, which means the preview needs no network
 * at all — not even for artwork.
 */

import type {
  AnimeCard,
  AnimeDetails,
  DownloadLink,
  Episode,
  HomeRails,
  Server,
} from "@anispots/core";

export const DEMO = import.meta.env.VITE_DEMO === "1";

/** A poster with no network: the title's initials on the brand gradient. */
function poster(title: string, from: string, to: string): string {
  const initials = title
    .split(/\s+/)
    .slice(0, 2)
    .map((word) => word[0] ?? "")
    .join("")
    .toUpperCase();

  const svg = `<svg xmlns="http://www.w3.org/2000/svg" width="300" height="450" viewBox="0 0 300 450">
  <defs>
    <linearGradient id="g" x1="0" y1="0" x2="300" y2="450" gradientUnits="userSpaceOnUse">
      <stop stop-color="${from}"/><stop offset="0.55" stop-color="#7B3DFF"/><stop offset="1" stop-color="${to}"/>
    </linearGradient>
    <radialGradient id="v" cx="0.3" cy="0.2" r="0.9">
      <stop stop-color="#ffffff" stop-opacity="0.35"/><stop offset="1" stop-color="#000000" stop-opacity="0.35"/>
    </radialGradient>
  </defs>
  <rect width="300" height="450" fill="url(#g)"/>
  <rect width="300" height="450" fill="url(#v)"/>
  <circle cx="248" cy="64" r="46" fill="#ffffff" opacity="0.12"/>
  <circle cx="54" cy="386" r="70" fill="#000000" opacity="0.18"/>
  <text x="24" y="404" font-family="Inter, system-ui, sans-serif" font-size="72" font-weight="800"
        fill="#ffffff" opacity="0.92">${initials}</text>
</svg>`;

  return `data:image/svg+xml;charset=utf-8,${encodeURIComponent(svg)}`;
}

const TITLES = [
  ["Neon Requiem", "#007BFF", "#FF00FF"],
  ["Glass Horizon", "#12B8FF", "#B300FF"],
  ["Paper Lanterns", "#FF6A00", "#FF00A8"],
  ["Static Bloom", "#00E0B8", "#2C7BFF"],
  ["Midnight Ramen Club", "#FF3D6E", "#7B3DFF"],
  ["The Last Ferry", "#3FA9F5", "#5B2BFF"],
  ["Iron Season", "#FFB000", "#FF2D55"],
  ["Quiet Machines", "#8A6BFF", "#00C2FF"],
  ["Skyline Drift", "#00D2FF", "#3A47D5"],
  ["Salt and Signal", "#9B5DE5", "#F15BB5"],
  ["Sunday Fighters", "#FEE440", "#F15BB5"],
  ["Deep Field", "#00F5D4", "#007BFF"],
] as const;

const cards: AnimeCard[] = TITLES.map(([title, from, to], index) => ({
  id: `demo-title-${index + 1}`,
  title,
  poster: poster(title, from, to),
  format: index % 3 === 0 ? "MOVIE" : "TV",
  episodes: 12,
  sub: 12,
  dub: index % 2 === 0 ? 12 : undefined,
  badge: index === 0 ? "18+" : index % 4 === 0 ? "NEW" : undefined,
  description:
    "A quiet town, a signal nobody can explain, and a cast of people who would rather not talk about it. Sample synopsis used for the offline preview.",
}));

const chunk = (size: number) => (offset: number) =>
  cards.slice(offset, offset + size);

export function demoHome(): HomeRails {
  return {
    spotlight: [
      {
        ...cards[0]!,
        label: "#1 Spotlight",
        description:
          "Every night at 3:04 the city goes silent for eleven seconds. A courier who has stopped sleeping starts timing them, and finds the intervals getting shorter. Sample synopsis for the offline preview.",
      },
      { ...cards[7]!, label: "#2 Spotlight" },
    ],
    rails: [
      { name: "Trending now", items: chunk(8)(0) },
      { name: "New releases", items: chunk(8)(3) },
      { name: "Most popular", items: chunk(8)(5) },
      { name: "Top airing", items: chunk(8)(3) },
    ],
  };
}

export function demoDetails(id: string): AnimeDetails {
  const base = cards.find((card) => card.id === id) ?? cards[0]!;
  return {
    ...base,
    japanese: "デモ・タイトル",
    status: "Currently Airing",
    premiered: "Fall 2026",
    score: "8.7",
    genres: ["Action", "Sci-Fi", "Drama", "Supernatural"],
    studios: ["Studio Sample"],
    related: cards.slice(1, 5),
    recommendations: cards.slice(6, 12),
    totalEpisodes: 12,
    description:
      base.description ??
      "Sample synopsis. The real description comes from the anime's own page once the catalogue is reachable.",
  };
}

export function demoEpisodes(id: string): Episode[] {
  return Array.from({ length: 12 }).map((_, index) => ({
    id: `${id}-ep-${index + 1}`,
    number: index + 1,
    title: index === 0 ? "The Eleven Seconds" : undefined,
  }));
}

export function demoServers(): Server[] {
  return [
    { name: "ZokoAnime", audio: "sub", embedUrl: "demo:sub" },
    { name: "ZokoAnime", audio: "dub", embedUrl: "demo:dub" },
    { name: "MegaPlay", audio: "sub", embedUrl: "demo:mega" },
  ];
}

export function demoDownloadLinks(): DownloadLink[] {
  return [
    { quality: "1080p", url: "demo:file/1080", group: "Kiwi Sub" },
    { quality: "720p", url: "demo:file/720", group: "Kiwi Sub" },
    { quality: "360p", url: "demo:file/360", group: "Kiwi Sub" },
  ];
}

export function demoGenres() {
  return [
    "Action",
    "Adventure",
    "Comedy",
    "Drama",
    "Fantasy",
    "Horror",
    "Mystery",
    "Romance",
    "Sci-Fi",
    "Slice of Life",
    "Sports",
    "Supernatural",
    "Thriller",
  ].map((name) => ({ name, slug: name.toLowerCase().replace(/\s+/g, "-") }));
}

export function demoBrowse(): AnimeCard[] {
  return cards;
}

export function demoSearch(query: string): AnimeCard[] {
  const q = query.trim().toLowerCase();
  if (!q) return cards;
  return cards.filter((card) => card.title.toLowerCase().includes(q));
}

/** True once a request has fallen back to sample data, so the shell can warn. */
let demoActive = false;
export const markDemo = () => {
  demoActive = true;
};
export const isDemoActive = () => demoActive;
