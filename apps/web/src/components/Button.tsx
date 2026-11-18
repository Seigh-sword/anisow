import type { CSSProperties, ReactNode } from "react";

/**
 * Buttons, drawn once.
 *
 * `Brand` is the one gradient-filled action per screen. Everything else is
 * glass. Keeping the count at one is what stops a screen looking like a
 * spotlight for buttons rather than for content.
 *
 * Every colour here is a theme variable, not a constant. That is what keeps
 * the two contrast rules true in both modes:
 *
 *   Light Mode  — no dark button with white text;
 *   Dark Mode   — no white button, and no black text.
 */

type Common = {
  children: ReactNode;
  onClick?: () => void;
  disabled?: boolean;
  style?: CSSProperties;
  title?: string;
  type?: "button" | "submit";
};

export function BrandButton({ children, onClick, disabled, style, title, type = "button" }: Common) {
  return (
    <button
      type={type}
      onClick={onClick}
      disabled={disabled}
      title={title}
      className="pressable"
      style={{
        display: "inline-flex",
        alignItems: "center",
        justifyContent: "center",
        gap: 8,
        padding: "11px 22px",
        borderRadius: 999,
        border: "1px solid var(--btn-brand-border)",
        backgroundImage: "var(--btn-brand-bg)",
        backgroundColor: "var(--brand-mid)",
        color: "var(--btn-brand-text)",
        fontWeight: 700,
        fontSize: 14,
        cursor: disabled ? "not-allowed" : "pointer",
        opacity: disabled ? 0.5 : 1,
        boxShadow: "0 14px 32px -14px var(--btn-brand-shadow)",
        ...style,
      }}
    >
      {children}
    </button>
  );
}

export function GlassButton({
  children,
  onClick,
  disabled,
  style,
  title,
  type = "button",
  active,
}: Common & { active?: boolean }) {
  return (
    <button
      type={type}
      onClick={onClick}
      disabled={disabled}
      title={title}
      className="pressable"
      style={{
        display: "inline-flex",
        alignItems: "center",
        justifyContent: "center",
        gap: 8,
        padding: "10px 18px",
        borderRadius: 999,
        border: `1px solid ${active ? "var(--btn-glass-border-active)" : "var(--btn-glass-border)"}`,
        background: active ? "var(--btn-glass-bg-active)" : "var(--btn-glass-bg)",
        backdropFilter: "blur(14px) saturate(1.4)",
        WebkitBackdropFilter: "blur(14px) saturate(1.4)",
        color: "var(--btn-glass-text)",
        fontWeight: 600,
        fontSize: 14,
        cursor: disabled ? "not-allowed" : "pointer",
        opacity: disabled ? 0.5 : 1,
        ...style,
      }}
    >
      {children}
    </button>
  );
}

/** A square icon button: play, seek, close. Always has an accessible label. */
export function IconButton({
  label,
  children,
  onClick,
  size = 40,
  style,
}: {
  label: string;
  children: ReactNode;
  onClick?: () => void;
  size?: number;
  style?: CSSProperties;
}) {
  return (
    <button
      type="button"
      onClick={onClick}
      aria-label={label}
      title={label}
      className="pressable"
      style={{
        width: size,
        height: size,
        display: "grid",
        placeItems: "center",
        borderRadius: 999,
        border: "1px solid var(--btn-glass-border)",
        background: "var(--btn-glass-bg)",
        backdropFilter: "blur(14px)",
        WebkitBackdropFilter: "blur(14px)",
        color: "var(--btn-glass-text)",
        cursor: "pointer",
        flex: "0 0 auto",
        ...style,
      }}
    >
      {children}
    </button>
  );
}

export const PlayIcon = ({ size = 16 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="currentColor" aria-hidden>
    <path d="M8 5.5v13l11-6.5z" />
  </svg>
);

export const PauseIcon = ({ size = 16 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="currentColor" aria-hidden>
    <path d="M7 5h4v14H7zM13 5h4v14h-4z" />
  </svg>
);

export const DownloadIcon = ({ size = 16 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.8" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
    <path d="M12 3v11m0 0 4-4m-4 4-4-4M4 20h16" />
  </svg>
);

export const CheckIcon = ({ size = 16 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2.2" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
    <path d="m4 12.5 5.2 5.2L20 6.5" />
  </svg>
);

export const CloseIcon = ({ size = 16 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" aria-hidden>
    <path d="M6 6l12 12M18 6 6 18" />
  </svg>
);

export const BackIcon = ({ size = 18 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
    <path d="M15 5l-7 7 7 7" />
  </svg>
);

/** The sun and the moon, for the theme toggle. */
export const SunIcon = ({ size = 18 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.9" strokeLinecap="round" aria-hidden>
    <circle cx="12" cy="12" r="4.2" />
    <path d="M12 2.5v2M12 19.5v2M2.5 12h2M19.5 12h2M5.2 5.2l1.4 1.4M17.4 17.4l1.4 1.4M18.8 5.2l-1.4 1.4M6.6 17.4l-1.4 1.4" />
  </svg>
);

export const MoonIcon = ({ size = 18 }: { size?: number }) => (
  <svg width={size} height={size} viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.9" strokeLinecap="round" strokeLinejoin="round" aria-hidden>
    <path d="M20 14.2A8.2 8.2 0 0 1 9.8 4a8.4 8.4 0 1 0 10.2 10.2z" />
  </svg>
);
