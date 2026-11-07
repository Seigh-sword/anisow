/**
 * AniSpots design tokens.
 *
 * One palette, two renderers. The web layer turns these into CSS variables and
 * `backdrop-filter`; the native layer turns them into `expo-blur` props and
 * `Animated`/Reanimated springs. Keeping the numbers here is what stops the two
 * apps drifting into "sort of the same" — which is what happens when a design is
 * re-typed per platform.
 */

/** The brand gradient: blue into magenta. Used at 135°, never flat. */
export const brand = {
  start: "#007BFF",
  end: "#FF00FF",
  /** Midpoint, for places a two-stop gradient would band. */
  mid: "#7B3DFF",
} as const;

export const palette = {
  /** Base canvas. Everything glass sits on top of this. */
  ink: "#07080E",
  inkSoft: "#0B0D16",
  inkRaised: "#11141F",

  /** Text. */
  text: "#F7F9FF",
  textMuted: "#A7B0C6",
  textFaint: "#6E7789",

  /** Discordant states. */
  danger: "#FF4D6D",
  success: "#41D99B",
  warning: "#FFC24D",
} as const;

/**
 * Glass is a stack, not a colour: a translucent fill, a hairline that catches
 * light on its top edge, a soft inner highlight and a shadow underneath. Any one
 * of those alone reads as "grey box".
 */
export interface GlassLevel {
  fill: string;
  fillStrong: string;
  stroke: string;
  strokeBright: string;
  shadow: string;
  blurPx: number;
  /** Web only: how much of the backdrop to saturate back after blurring. */
  saturation: number;
}

export const glass: Record<"subtle" | "regular" | "strong" | "floating", GlassLevel> = {
  /** Behind content that must stay readable: chips, list rows. */
  subtle: {
    fill: "rgba(255,255,255,0.045)",
    fillStrong: "rgba(255,255,255,0.075)",
    stroke: "rgba(255,255,255,0.10)",
    strokeBright: "rgba(255,255,255,0.22)",
    shadow: "rgba(0,0,0,0.35)",
    blurPx: 12,
    saturation: 1.2,
  },
  /** The default panel. */
  regular: {
    fill: "rgba(255,255,255,0.07)",
    fillStrong: "rgba(255,255,255,0.11)",
    stroke: "rgba(255,255,255,0.14)",
    strokeBright: "rgba(255,255,255,0.30)",
    shadow: "rgba(0,0,0,0.45)",
    blurPx: 20,
    saturation: 1.35,
  },
  /** Bars that float over artwork: bottom nav, player chrome. */
  strong: {
    fill: "rgba(10,12,20,0.55)",
    fillStrong: "rgba(10,12,20,0.72)",
    stroke: "rgba(255,255,255,0.16)",
    strokeBright: "rgba(255,255,255,0.34)",
    shadow: "rgba(0,0,0,0.55)",
    blurPx: 28,
    saturation: 1.5,
  },
  /** Sheets and modals: most opaque, deepest blur. */
  floating: {
    fill: "rgba(12,14,22,0.78)",
    fillStrong: "rgba(12,14,22,0.90)",
    stroke: "rgba(255,255,255,0.18)",
    strokeBright: "rgba(255,255,255,0.38)",
    shadow: "rgba(0,0,0,0.65)",
    blurPx: 36,
    saturation: 1.6,
  },
};

export const radius = {
  xs: 6,
  sm: 10,
  md: 14,
  lg: 20,
  xl: 28,
  pill: 999,
} as const;

/** 4pt scale. Everything spaces on it, so nothing looks accidental. */
export const space = {
  xxs: 2,
  xs: 4,
  sm: 8,
  md: 12,
  lg: 16,
  xl: 24,
  xxl: 32,
  xxxl: 48,
} as const;

export const type = {
  display: { size: 34, weight: "800", tracking: -0.8, lineHeight: 1.05 },
  title: { size: 24, weight: "700", tracking: -0.4, lineHeight: 1.15 },
  section: { size: 18, weight: "700", tracking: -0.2, lineHeight: 1.2 },
  body: { size: 14.5, weight: "400", tracking: 0, lineHeight: 1.5 },
  label: { size: 12, weight: "600", tracking: 0.4, lineHeight: 1.3 },
  micro: { size: 11, weight: "600", tracking: 0.6, lineHeight: 1.2 },
} as const;

/**
 * Poster geometry. 2:3 and taller than wide, which is the point: the old build
 * had landscape art and it made every grid look like a filmstrip of stills.
 */
export const poster = {
  ratio: 2 / 3,
  railWidth: 116,
  railHeight: 174,
  gridWidth: 104,
  gridHeight: 156,
  heroRatio: 16 / 9,
} as const;

/**
 * Motion. Springs, not durations, wherever a thing follows a finger; short
 * eased curves for things that arrive on their own.
 */
export const motion = {
  /** Response to touch. Fast, slightly forward. */
  press: { damping: 18, stiffness: 320, mass: 0.55 },
  /** Sheets and modals arriving. */
  enter: { damping: 22, stiffness: 210, mass: 0.9 },
  /** Layout changes: chips selecting, lists reflowing. */
  layout: { damping: 26, stiffness: 260, mass: 0.8 },
  /** Ambient breathing: hero glow, loading shimmer. */
  ambient: { durationMs: 2400, easing: [0.4, 0, 0.2, 1] },
  /** Screen transitions. */
  screenMs: 220,
} as const;

/** A gradient as a CSS string; the web layer uses this shape directly. */
export const brandGradientCss = (angleDeg = 135): string =>
  `linear-gradient(${angleDeg}deg, ${brand.start} 0%, ${brand.mid} 52%, ${brand.end} 100%)`;

/** The same gradient as stop pairs, for native gradients that want explicit stops. */
export const brandGradientStops = [
  { offset: 0, color: brand.start },
  { offset: 0.52, color: brand.mid },
  { offset: 1, color: brand.end },
] as const;
