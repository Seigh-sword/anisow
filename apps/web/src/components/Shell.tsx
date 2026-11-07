import type { ReactNode } from "react";
import { NavLink, useLocation } from "react-router-dom";
import { Glass } from "./Glass";
import { DEMO, isDemoActive } from "../lib/demo";

/**
 * The app frame: a brand backdrop, a scroll area that floats above the nav, and
 * the nav itself as a glass bar with a gradient rim.
 *
 * The nav is fixed and the content scrolls under it — that is the whole point of
 * glass here. A solid bar would be a footer; a translucent one is a window onto
 * the posters sliding beneath it.
 */

interface Tab {
  to: string;
  label: string;
  icon: ReactNode;
}

const Icon = ({ path }: { path: string }) => (
  <svg width="22" height="22" viewBox="0 0 24 24" fill="none" aria-hidden>
    <path d={path} stroke="currentColor" strokeWidth="1.7" strokeLinecap="round" strokeLinejoin="round" />
  </svg>
);

const TABS: Tab[] = [
  { to: "/", label: "Home", icon: <Icon path="M3 10.5 12 3l9 7.5V21h-6v-6H9v6H3z" /> },
  { to: "/browse", label: "Browse", icon: <Icon path="M4 5h7v7H4zM13 5h7v7h-7zM4 14h7v7H4zM13 14h7v7h-7z" /> },
  { to: "/search", label: "Search", icon: <Icon path="M10.5 4a6.5 6.5 0 1 0 0 13 6.5 6.5 0 0 0 0-13M20 20l-4.6-4.6" /> },
  { to: "/downloads", label: "Downloads", icon: <Icon path="M12 3v11m0 0 4-4m-4 4-4-4M4 20h16" /> },
  { to: "/watchlist", label: "Watchlist", icon: <Icon path="M6 3h12v18l-6-4.5L6 21z" /> },
];

/** The page's own content, padded so the floating nav never covers it. */
export function Page({ children }: { children: ReactNode }) {
  return (
    <div
      style={{
        minHeight: "100dvh",
        paddingBottom: 108,
        position: "relative",
        zIndex: 1,
      }}
    >
      {children}
    </div>
  );
}

/** Ambient colour behind everything: the brand gradient, breathing. */
export function BrandBackdrop() {
  return (
    <div aria-hidden style={{ position: "fixed", inset: 0, zIndex: 0, overflow: "hidden" }}>
      <div
        style={{
          position: "absolute",
          width: 720,
          height: 720,
          left: "-16%",
          top: "-24%",
          borderRadius: "50%",
          background: "radial-gradient(circle, rgba(0,123,255,0.34), transparent 62%)",
          filter: "blur(28px)",
        }}
        className="ambient-glow"
      />
      <div
        style={{
          position: "absolute",
          width: 640,
          height: 640,
          right: "-18%",
          top: "8%",
          borderRadius: "50%",
          background: "radial-gradient(circle, rgba(255,0,255,0.26), transparent 64%)",
          filter: "blur(30px)",
          animationDelay: "1.6s",
        }}
        className="ambient-glow"
      />
      <div
        style={{
          position: "absolute",
          inset: 0,
          background: "linear-gradient(180deg, rgba(7,8,14,0.35), rgba(7,8,14,0.92) 60%, #07080E)",
        }}
      />
    </div>
  );
}

export function BottomNav() {
  const location = useLocation();

  return (
    <nav
      aria-label="Main"
      style={{
        position: "fixed",
        left: 0,
        right: 0,
        bottom: 0,
        zIndex: 50,
        padding: "0 12px calc(14px + env(safe-area-inset-bottom))",
        pointerEvents: "none",
      }}
    >
      <Glass
        level="strong"
        lit
        specular
        radius={22}
        style={{
          pointerEvents: "auto",
          margin: "0 auto",
          maxWidth: 560,
          padding: "8px 6px",
        }}
      >
        <ul
          style={{
            display: "grid",
            gridTemplateColumns: `repeat(${TABS.length}, 1fr)`,
            gap: 2,
            listStyle: "none",
            margin: 0,
            padding: 0,
          }}
        >
          {TABS.map((tab) => {
            const active =
              tab.to === "/" ? location.pathname === "/" : location.pathname.startsWith(tab.to);

            return (
              <li key={tab.to}>
                <NavLink
                  to={tab.to}
                  style={{
                    display: "flex",
                    flexDirection: "column",
                    alignItems: "center",
                    gap: 3,
                    padding: "7px 2px",
                    borderRadius: 16,
                    textDecoration: "none",
                    color: active ? "var(--text)" : "var(--text-faint)",
                    background: active ? "rgba(255,255,255,0.09)" : "transparent",
                    transition: "color 180ms ease, background 180ms ease",
                    position: "relative",
                  }}
                >
                  <span style={{ color: active ? "var(--brand-start)" : undefined }}>{tab.icon}</span>
                  <span style={{ fontSize: 10.5, fontWeight: 600, letterSpacing: 0.2 }}>
                    {tab.label}
                  </span>
                  {active && (
                    <span
                      aria-hidden
                      style={{
                        position: "absolute",
                        top: 0,
                        left: "50%",
                        translate: "-50% 0",
                        width: 18,
                        height: 2,
                        borderRadius: 999,
                        backgroundImage: "var(--brand-gradient)",
                      }}
                    />
                  )}
                </NavLink>
              </li>
            );
          })}
        </ul>
      </Glass>
    </nav>
  );
}

/** Says, once and quietly, that the catalogue on screen is sample data. */
function DemoBadge() {
  if (!DEMO) return null;

  return (
    <div
      style={{
        position: "fixed",
        top: "calc(8px + env(safe-area-inset-top))",
        left: "50%",
        translate: "-50% 0",
        zIndex: 60,
        pointerEvents: "none",
      }}
    >
      <span
        style={{
          display: "inline-flex",
          alignItems: "center",
          gap: 6,
          padding: "4px 10px",
          borderRadius: 999,
          border: "1px solid rgba(255,194,77,0.4)",
          background: "rgba(255,194,77,0.12)",
          backdropFilter: "blur(10px)",
          fontSize: 10,
          fontWeight: 800,
          letterSpacing: 0.9,
          color: "var(--warning)",
        }}
      >
        PREVIEW DATA{isDemoActive() ? "" : " · LIVE PENDING"}
      </span>
    </div>
  );
}

export function Shell({ children }: { children: ReactNode }) {
  return (
    <>
      <BrandBackdrop />
      <DemoBadge />
      <Page>{children}</Page>
      <BottomNav />
    </>
  );
}
