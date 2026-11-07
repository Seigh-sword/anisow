/**
 * The mark.
 *
 * Three app-style "spots" falling into a play triangle: the name is AniSpots and
 * the product plays things, so the mark says both. It is drawn with the brand
 * gradient so it works on the dark canvas and in a store listing.
 */
export function Logo({ size = 28, withWordmark = false }: { size?: number; withWordmark?: boolean }) {
  const mark = (
    <svg width={size} height={size} viewBox="0 0 32 32" fill="none" aria-hidden>
      <defs>
        <linearGradient id="anispots-logo" x1="0" y1="0" x2="32" y2="32" gradientUnits="userSpaceOnUse">
          <stop stopColor="#007BFF" />
          <stop offset="0.52" stopColor="#7B3DFF" />
          <stop offset="1" stopColor="#FF00FF" />
        </linearGradient>
      </defs>
      <path d="M13 7.5 27 16 13 24.5z" fill="url(#anispots-logo)" />
      <circle cx="7" cy="11" r="2.6" fill="#007BFF" opacity="0.9" />
      <circle cx="6" cy="16" r="2" fill="#7B3DFF" opacity="0.8" />
      <circle cx="7" cy="21" r="2.6" fill="#FF00FF" opacity="0.9" />
    </svg>
  );

  if (!withWordmark) return mark;

  return (
    <span style={{ display: "inline-flex", alignItems: "center", gap: 8 }}>
      {mark}
      <span
        className="brand-text"
        style={{ fontSize: size * 0.62, fontWeight: 800, letterSpacing: -0.4 }}
      >
        AniSpots
      </span>
    </span>
  );
}
