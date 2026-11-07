import { Glass } from "./Glass";

/**
 * The three non-content states, drawn once.
 *
 * A failed request must never look like an empty list: one means "something
 * broke, retry", the other means "there is nothing here". Showing the same blank
 * screen for both is the most common way an app lies to its user.
 */

export function RailSkeleton({ width = 116, count = 6 }: { width?: number; count?: number }) {
  return (
    <div className="rail" aria-hidden>
      {Array.from({ length: count }).map((_, index) => (
        <div
          key={index}
          className="shimmer"
          style={{
            width,
            height: Math.round(width / (2 / 3)),
            borderRadius: "var(--r-md)",
            flex: "0 0 auto",
          }}
        />
      ))}
    </div>
  );
}

export function PageSkeleton() {
  return (
    <div style={{ padding: "var(--s-xl)", display: "grid", gap: "var(--s-xl)" }}>
      <div
        className="shimmer"
        style={{ height: 220, borderRadius: "var(--r-xl)" }}
        aria-hidden
      />
      <RailSkeleton />
      <RailSkeleton />
    </div>
  );
}

export function ErrorState({
  message,
  onRetry,
  title = "That did not load",
}: {
  message: string;
  onRetry?: () => void;
  title?: string;
}) {
  return (
    <div style={{ padding: "var(--s-xl)" }}>
      <Glass level="subtle" radius={20} padding={20} style={{ display: "grid", gap: 10 }}>
        <div style={{ display: "flex", alignItems: "center", gap: 10 }}>
          <span
            aria-hidden
            style={{
              width: 28,
              height: 28,
              borderRadius: 999,
              display: "grid",
              placeItems: "center",
              background: "rgba(255,77,109,0.16)",
              color: "var(--danger)",
              fontWeight: 800,
              fontSize: 15,
            }}
          >
            !
          </span>
          <strong style={{ fontSize: 15 }}>{title}</strong>
        </div>
        <p style={{ margin: 0, color: "var(--text-muted)", fontSize: 13.5, lineHeight: 1.5 }}>
          {message}
        </p>
        {onRetry && (
          <button
            type="button"
            onClick={onRetry}
            className="pressable"
            style={{
              justifySelf: "start",
              marginTop: 4,
              padding: "9px 16px",
              borderRadius: 999,
              border: "1px solid rgba(255,255,255,0.16)",
              background: "rgba(255,255,255,0.07)",
              color: "var(--text)",
              fontWeight: 600,
              fontSize: 13,
              cursor: "pointer",
            }}
          >
            Try again
          </button>
        )}
      </Glass>
    </div>
  );
}

export function EmptyState({ title, hint }: { title: string; hint?: string }) {
  return (
    <div style={{ padding: "var(--s-xl)", textAlign: "center" }}>
      <p style={{ margin: 0, fontSize: 15, fontWeight: 600 }}>{title}</p>
      {hint && (
        <p style={{ margin: "6px 0 0", fontSize: 13, color: "var(--text-muted)", lineHeight: 1.5 }}>
          {hint}
        </p>
      )}
    </div>
  );
}
