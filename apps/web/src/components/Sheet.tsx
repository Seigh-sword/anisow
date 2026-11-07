import { useEffect, useRef, type ReactNode } from "react";
import { createPortal } from "react-dom";
import { Glass } from "./Glass";
import { CloseIcon, IconButton } from "./Button";

/**
 * A bottom sheet.
 *
 * Used for the episode list, the download picker and every confirmation. It is a
 * portal rather than an absolutely-positioned div so it is never clipped by a
 * parent's `overflow: hidden` — the usual reason a modal appears inside a card.
 *
 * It traps focus, closes on Escape and on a backdrop click, and locks the page
 * behind it. A sheet that lets the page scroll underneath it feels broken on a
 * phone, which is where this is used most.
 */
export function Sheet({
  open,
  onClose,
  title,
  subtitle,
  children,
  footer,
  maxWidth = 560,
  full,
}: {
  open: boolean;
  onClose: () => void;
  title: string;
  subtitle?: ReactNode;
  children: ReactNode;
  footer?: ReactNode;
  maxWidth?: number;
  /** Taller variant: fills most of the viewport, for the download manager. */
  full?: boolean;
}) {
  const panel = useRef<HTMLDivElement | null>(null);

  useEffect(() => {
    if (!open) return;

    const onKey = (event: KeyboardEvent) => {
      if (event.key === "Escape") {
        event.stopPropagation();
        onClose();
        return;
      }

      if (event.key !== "Tab") return;

      const focusables = panel.current?.querySelectorAll<HTMLElement>(
        'a[href], button:not([disabled]), input, select, textarea, [tabindex]:not([tabindex="-1"])',
      );
      if (!focusables || focusables.length === 0) return;

      const first = focusables[0]!;
      const last = focusables[focusables.length - 1]!;
      if (event.shiftKey && document.activeElement === first) {
        event.preventDefault();
        last.focus();
      } else if (!event.shiftKey && document.activeElement === last) {
        event.preventDefault();
        first.focus();
      }
    };

    const previousOverflow = document.body.style.overflow;
    document.body.style.overflow = "hidden";
    document.addEventListener("keydown", onKey);

    // Move focus in, so the sheet is reachable by keyboard and by screen readers.
    const timer = window.setTimeout(() => {
      const target =
        panel.current?.querySelector<HTMLElement>("[data-autofocus]") ?? panel.current ?? null;
      target?.focus();
    }, 30);

    return () => {
      document.body.style.overflow = previousOverflow;
      document.removeEventListener("keydown", onKey);
      window.clearTimeout(timer);
    };
  }, [open, onClose]);

  if (!open) return null;

  return createPortal(
    <div
      role="presentation"
      style={{
        position: "fixed",
        inset: 0,
        zIndex: 200,
        display: "flex",
        alignItems: "flex-end",
        justifyContent: "center",
      }}
    >
      <div
        onClick={onClose}
        aria-hidden
        style={{
          position: "absolute",
          inset: 0,
          background: "rgba(3,4,8,0.62)",
          backdropFilter: "blur(6px)",
          WebkitBackdropFilter: "blur(6px)",
          animation: "anispots-fade 220ms var(--ease-out) both",
        }}
      />

      <div
        ref={panel}
        role="dialog"
        aria-modal="true"
        aria-label={title}
        tabIndex={-1}
        style={{
          position: "relative",
          width: "100%",
          maxWidth,
          maxHeight: full ? "92dvh" : "84dvh",
          display: "flex",
          flexDirection: "column",
          padding: "0 12px calc(12px + env(safe-area-inset-bottom))",
          animation: "anispots-sheet 320ms var(--ease-out) both",
        }}
      >
        <Glass
          level="floating"
          lit
          radius={26}
          style={{ display: "flex", flexDirection: "column", minHeight: 0, flex: 1, overflow: "hidden" }}
        >
          <header
            style={{
              display: "flex",
              alignItems: "flex-start",
              gap: 12,
              padding: "16px 16px 10px",
              borderBottom: "1px solid rgba(255,255,255,0.08)",
              flex: "0 0 auto",
            }}
          >
            <div style={{ flex: 1, minWidth: 0 }}>
              <h2 style={{ margin: 0, fontSize: 16, fontWeight: 700, letterSpacing: -0.2 }}>{title}</h2>
              {subtitle && (
                <div style={{ marginTop: 3, fontSize: 12.5, color: "var(--text-muted)", lineHeight: 1.4 }}>
                  {subtitle}
                </div>
              )}
            </div>
            <span data-autofocus>
              <IconButton label="Close" onClick={onClose} size={34}>
                <CloseIcon />
              </IconButton>
            </span>
          </header>

          <div style={{ overflowY: "auto", overscrollBehavior: "contain", flex: "1 1 auto", minHeight: 0 }}>
            {children}
          </div>

          {footer && (
            <footer
              style={{
                flex: "0 0 auto",
                display: "flex",
                alignItems: "center",
                gap: 10,
                padding: "12px 16px",
                borderTop: "1px solid rgba(255,255,255,0.08)",
                background: "rgba(255,255,255,0.03)",
              }}
            >
              {footer}
            </footer>
          )}
        </Glass>
      </div>
    </div>,
    document.body,
  );
}

/** The two keyframes the sheet needs; kept with it so it is self-contained. */
const style = document.createElement("style");
style.textContent = `
@keyframes anispots-fade { from { opacity: 0 } to { opacity: 1 } }
@keyframes anispots-sheet {
  from { opacity: 0; transform: translate3d(0, 26px, 0) scale(0.985) }
  to   { opacity: 1; transform: none }
}
@media (prefers-reduced-motion: reduce) {
  @keyframes anispots-sheet { from { opacity: 0 } to { opacity: 1 } }
}
`;
if (typeof document !== "undefined" && !document.getElementById("anispots-sheet-keyframes")) {
  style.id = "anispots-sheet-keyframes";
  document.head.appendChild(style);
}
