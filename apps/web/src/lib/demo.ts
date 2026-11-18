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
 * The dataset is deliberately complete rather than minimal. Every screen has
 * something to show: a film with no episodes, a show that has not started, a
 * franchise with four seasons, a cast, a trailer and a week of broadcasts.
 *
 * Posters are generated as inline SVG, which means the preview needs no network
 * at all — not even for artwork.
 */

import type {
  AnimeCard,
  AnimeDetails,
  CastMember,
  DownloadLink,
  Episode,
  HomeRails,
  ScheduleEntry,
  SeasonRelation,
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

/** A portrait for the cast list: a coloured disc with a letter on it. */
function portrait(name: string, hue: number): string {
  const letter = (name.trim()[0] ?? "?").toUpperCase();
  const svg = `<svg xmlns="http://www.w3.org/2000/svg" width="120" height="120" viewBox="0 0 120 120">
  <defs>
    <linearGradient id="p" x1="0" y1="0" x2="120" y2="120" gradientUnits="userSpaceOnUse">
      <stop stop-color="hsl(${hue}, 70%, 52%)"/><stop offset="1" stop-color="hsl(${(hue + 60) % 360}, 70%, 38%)"/>
    </linearGradient>
  </defs>
  <rect width="120" height="120" rx="60" fill="url(#p)"/>
  <text x="60" y="78" text-anchor="middle" font-family="Inter, system-ui, sans-serif" font-size="46"
        font-weight="800" fill="#ffffff" opacity="0.92">${letter}</text>
</svg>`;

  return `data:image/svg+xml;charset=utf-8,${encodeURIComponent(svg)}`;
}

/**
 * The catalogue.
 *
 * The shape of each entry is deliberate: one film, one show that has not
 * started, one with four seasons and one ordinary weekly show, so every
 * branch on the detail screen has something to draw.
 */
interface Sample {
  title: string;
  from: string;
  to: string;
  format: "TV" | "MOVIE" | "ONA";
  status: string;
  genres: string[];
  studios: string[];
  description: string;
  episodes: number;
  score: string;
  popularity: number;
  members: number;
  sourceMaterial: string;
  malId: string;
  days: { day: string; time: string }[];
  season?: number;
}

const SAMPLE: Sample[] = [
  {
    title: "Neon Requiem",
    from: "#007BFF",
    to: "#FF00FF",
    format: "TV",
    status: "Currently Airing",
    genres: ["Action", "Sci-Fi", "Drama", "Supernatural"],
    studios: ["Studio Lantern"],
    description:
      "Every night at 3:04 the city goes silent for eleven seconds. A courier who has stopped sleeping starts timing them, and finds the intervals getting shorter.",
    episodes: 12,
    score: "8.7",
    popularity: 248_193,
    members: 512_004,
    sourceMaterial: "Original",
    malId: "51001",
    days: [{ day: "monday", time: "18:00" }],
    season: 1,
  },
  {
    title: "Glass Horizon",
    from: "#12B8FF",
    to: "#B300FF",
    format: "TV",
    status: "Currently Airing",
    genres: ["Adventure", "Mystery", "Sci-Fi", "Drama"],
    studios: ["Studio Meridian"],
    description:
      "A mapmaker and a smuggler cross a country that rearranges itself at dawn. The border is the least of their problems.",
    episodes: 24,
    score: "8.2",
    popularity: 173_882,
    members: 340_219,
    sourceMaterial: "Manga",
    malId: "51002",
    days: [{ day: "tuesday", time: "19:00" }],
    season: 2,
  },
  {
    title: "Paper Lanterns",
    from: "#FF6A00",
    to: "#FF00A8",
    format: "MOVIE",
    status: "Finished Airing",
    genres: ["Drama", "Romance", "Supernatural"],
    studios: ["Studio Kite"],
    description:
      "A festival of paper lanterns, a promise made in a language nobody speaks any more, and a night that refuses to end.",
    episodes: 1,
    score: "9.0",
    popularity: 402_115,
    members: 688_740,
    sourceMaterial: "Novel",
    malId: "51003",
    days: [],
  },
  {
    title: "Static Bloom",
    from: "#00E0B8",
    to: "#2C7BFF",
    format: "TV",
    status: "Not yet aired",
    genres: ["Action", "Fantasy", "Supernatural"],
    studios: ["Studio Quiet"],
    description:
      "The first season has been announced but not yet broadcast. A city where flowers grow out of broken machines, and the machines are waking up.",
    episodes: 0,
    score: "—",
    popularity: 12_004,
    members: 18_220,
    sourceMaterial: "Original",
    malId: "51004",
    days: [],
  },
  {
    title: "Midnight Ramen Club",
    from: "#FF3D6E",
    to: "#7B3DFF",
    format: "TV",
    status: "Currently Airing",
    genres: ["Comedy", "Slice of Life"],
    studios: ["Studio Warm"],
    description:
      "Four strangers, one counter, and the hour between midnight and three when everybody tells the truth.",
    episodes: 12,
    score: "7.9",
    popularity: 88_230,
    members: 121_007,
    sourceMaterial: "Manga",
    malId: "51005",
    days: [{ day: "thursday", time: "23:00" }],
  },
  {
    title: "The Last Ferry",
    from: "#3FA9F5",
    to: "#5B2BFF",
    format: "TV",
    status: "Currently Airing",
    genres: ["Drama", "Mystery", "Thriller"],
    studios: ["Studio North"],
    description:
      "The last ferry out of the harbour runs at an hour nobody should know. Everyone on it is leaving something behind.",
    episodes: 13,
    score: "8.4",
    popularity: 143_990,
    members: 288_310,
    sourceMaterial: "Original",
    malId: "51006",
    days: [{ day: "friday", time: "20:00" }],
  },
  {
    title: "Quiet Machines",
    from: "#8A6BFF",
    to: "#00C2FF",
    format: "TV",
    status: "Currently Airing",
    genres: ["Sci-Fi", "Slice of Life", "Mystery"],
    studios: ["Studio Lantern"],
    description:
      "The machines were built to keep the city quiet. They are getting better at it than anyone wanted.",
    episodes: 11,
    score: "8.1",
    popularity: 96_442,
    members: 175_220,
    sourceMaterial: "Light novel",
    malId: "51007",
    days: [{ day: "monday", time: "19:00" }],
  },
  {
    title: "Skyline Drift",
    from: "#00D2FF",
    to: "#3A47D5",
    format: "TV",
    status: "Currently Airing",
    genres: ["Action", "Sports", "Comedy"],
    studios: ["Studio Meridian"],
    description:
      "A courier who races between the towers for a living has to race for something that matters.",
    episodes: 25,
    score: "7.6",
    popularity: 64_118,
    members: 102_776,
    sourceMaterial: "Original",
    malId: "51008",
    days: [{ day: "tuesday", time: "20:00" }],
  },
  {
    title: "Salt and Signal",
    from: "#9B5DE5",
    to: "#F15BB5",
    format: "ONA",
    status: "Currently Airing",
    genres: ["Romance", "Drama"],
    studios: ["Studio Kite"],
    description:
      "A radio operator on a salt flat picks up a broadcast that has not been sent yet.",
    episodes: 8,
    score: "8.6",
    popularity: 121_330,
    members: 214_002,
    sourceMaterial: "Original",
    malId: "51009",
    days: [{ day: "wednesday", time: "21:00" }],
  },
  {
    title: "Sunday Fighters",
    from: "#FEE440",
    to: "#F15BB5",
    format: "TV",
    status: "Currently Airing",
    genres: ["Action", "Sports", "Comedy"],
    studios: ["Studio Warm"],
    description:
      "The league plays on Sundays because that is when everybody is free to lose.",
    episodes: 10,
    score: "7.4",
    popularity: 41_220,
    members: 66_310,
    sourceMaterial: "Manga",
    malId: "51010",
    days: [{ day: "sunday", time: "17:00" }],
  },
  {
    title: "Deep Field",
    from: "#00F5D4",
    to: "#007BFF",
    format: "TV",
    status: "Currently Airing",
    genres: ["Sci-Fi", "Mystery", "Thriller", "Drama"],
    studios: ["Studio North"],
    description:
      "The signal from the edge of the observatory is older than the observatory. Nobody has said so out loud yet.",
    episodes: 22,
    score: "9.2",
    popularity: 312_884,
    members: 520_113,
    sourceMaterial: "Novel",
    malId: "51011",
    days: [{ day: "wednesday", time: "20:00" }],
  },
  {
    title: "Hollow Signal",
    from: "#FFB000",
    to: "#FF2D55",
    format: "TV",
    status: "Finished Airing",
    genres: ["Action", "Sci-Fi", "Supernatural"],
    studios: ["Studio Quiet"],
    description:
      "The sequel to a story about a city that learned to listen.",
    episodes: 13,
    score: "8.8",
    popularity: 288_410,
    members: 466_220,
    sourceMaterial: "Original",
    malId: "51012",
    days: [],
    season: 3,
  },
];

const cards: AnimeCard[] = SAMPLE.map((sample, index) => ({
  id: `demo-title-${index + 1}`,
  title: sample.title,
  poster: poster(sample.title, sample.from, sample.to),
  format: sample.format,
  episodes: sample.episodes,
  sub: sample.episodes || undefined,
  dub: index % 2 === 0 ? sample.episodes || undefined : undefined,
  badge: index === 0 ? "18+" : index % 4 === 0 ? "NEW" : undefined,
  description: sample.description,
  genres: sample.genres,
  score: sample.score,
  popularity: sample.popularity,
  studios: sample.studios,
}));

const chunk = (size: number) => (offset: number) => cards.slice(offset, offset + size);

/**
 * The rails, in the order they should appear.
 *
 * What is new, then what has a new episode, then the popular back-catalogue.
 */
export function demoHome(): HomeRails {
  return {
    spotlight: [
      {
        ...cards[0]!,
        label: "#1 Spotlight",
        description:
          "Every night at 3:04 the city goes silent for eleven seconds. A courier who has stopped sleeping starts timing them, and finds the intervals getting shorter.",
      },
      { ...cards[7]!, label: "#2 Spotlight" },
    ],
    rails: [
      { name: "New on AniSpots", items: chunk(8)(3) },
      { name: "Latest Episodes", items: chunk(8)(0) },
      { name: "Trending now", items: chunk(8)(0) },
      { name: "Most popular", items: chunk(8)(5) },
      { name: "Top airing", items: chunk(8)(3) },
    ],
  };
}

/** The cast for a show, drawn from the sample titles. */
function castFor(title: string): CastMember[] {
  const people: [string, string, string][] = [
    ["The Courier", "Rin Aoyama", "Main"],
    ["The Cartographer", "Kenji Morita", "Main"],
    ["The Operator", "Sample Voice Actor", "Supporting"],
    ["The Archivist", "Second Voice Actor", "Supporting"],
    ["The Mechanic", "Third Voice Actor", "Supporting"],
  ];

  return people.map(([character, actor, role], index) => ({
    name: character,
    actor,
    role,
    image: portrait(character, (index * 67 + title.length * 11) % 360),
    voiceActors: [
      { language: "Japanese", name: actor, image: portrait(actor, (index * 83 + 40) % 360) },
      { language: "English", name: `${actor} (EN)` },
    ],
  }));
}

/** The other seasons of a franchise. */
function seasonsFor(title: string): SeasonRelation[] {
  if (title !== "Neon Requiem") {
    return [
      {
        id: "51101",
        title: "Neon Requiem (Director's Cut)",
        relation: "side story",
        format: "TV",
        year: 2026,
        count: 12,
      },
    ];
  }

  return [
    { id: "51101", title: "Neon Requiem Season 1", relation: "parent story", format: "TV", year: 2024, count: 12 },
    { id: "51102", title: "Neon Requiem Season 2", relation: "sequel", format: "TV", year: 2025, count: 12 },
    { id: "51103", title: "Neon Requiem Season 3", relation: "sequel", format: "TV", year: 2026, count: 12 },
    { id: "51104", title: "Neon Requiem: The Quiet Years", relation: "prequel", format: "TV", year: 2023, count: 6 },
  ];
}

export function demoDetails(id: string): AnimeDetails {
  const base = cards.find((card) => card.id === id) ?? cards[0]!;
  const index = cards.findIndex((card) => card.id === id);
  const sample = SAMPLE[index] ?? SAMPLE[0]!;

  const isMovie = sample.format === "MOVIE";
  const isUpcoming = sample.status.toLowerCase().includes("not yet aired");

  return {
    ...base,
    japanese: "デモ・タイトル",
    status: sample.status,
    premiered: "Fall 2026",
    score: sample.score,
    genres: sample.genres,
    studios: sample.studios,
    related: cards.slice(1, 5),
    recommendations: cards.slice(6, 12),
    totalEpisodes: sample.episodes,
    popularity: sample.popularity,
    members: sample.members,
    sourceMaterial: sample.sourceMaterial,
    malId: sample.malId,
    cast: isMovie ? undefined : castFor(sample.title),
    seasons: isMovie || isUpcoming ? undefined : seasonsFor(sample.title),
    trailerEmbedUrl: isMovie
      ? "https://www.youtube-nocookie.com/embed/aqz-KE-bpKQ"
      : "https://www.youtube-nocookie.com/embed/ysz5S6PUM-U",
    trailerYoutubeId: isMovie ? "aqz-KE-bpKQ" : "ysz5S6PUM-U",
    description: sample.description,
  };
}

export function demoEpisodes(id: string): Episode[] {
  const index = cards.findIndex((card) => card.id === id);
  const sample = SAMPLE[index] ?? SAMPLE[0]!;

  // A film and an upcoming show have no episodes to list.
  if (sample.format === "MOVIE" || sample.status.toLowerCase().includes("not yet aired")) {
    return [];
  }

  return Array.from({ length: sample.episodes || 12 }).map((_, position) => ({
    id: `${id}-ep-${position + 1}`,
    number: position + 1,
    title: position === 0 ? "The Eleven Seconds" : undefined,
  }));
}

/**
 * The week's broadcasts.
 *
 * Two shows a day, so the day picker has something to switch between.
 */
export function demoSchedule(day?: string): ScheduleEntry[] {
  const wanted = day?.trim().toLowerCase();

  const entries: ScheduleEntry[] = [];

  for (const sample of SAMPLE) {
    for (const slot of sample.days) {
      if (wanted && slot.day !== wanted) continue;

      const index = SAMPLE.indexOf(sample);
      entries.push({
        ...cards[index]!,
        day: slot.day,
        time: slot.time,
        airingString: `${slot.day[0]!.toUpperCase()}${slot.day.slice(1)}s at ${slot.time} (JST)`,
      });
    }
  }

  return entries;
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
