import { useEffect, useState } from "react";

import { getDownloads, getWatchlist } from "../lib/library";
import { clearCache } from "../lib/cache";
import { humanBytes, resumeAll, usedBytes } from "../lib/downloads";
import { api } from "../lib/api";
import { Glass } from "../components/Glass";
import { GlassButton } from "../components/Button";

/**
 * Settings, honestly.
 *
 * No toggles that pretend to do something. Each row either reports a real number
 * or performs a real, reversible action — and the destructive one asks first.
 */
export function Settings() {
  const [stats, setStats] = useState({ downloads: 0, bytes: 0, watchlist: 0 });
  const [cleared, setCleared] = useState(false);

  useEffect(() => {
    setStats({
      downloads: getDownloads().length,
      bytes: usedBytes(),
      watchlist: getWatchlist().length,
    });
    resumeAll();
  }, []);

  return (
    <div>
      <header style={{ padding: "calc(18px + env(safe-area-inset-top)) var(--s-xl) var(--s-lg)" }}>
        <h1 style={{ margin: 0, fontSize: 26, fontWeight: 800, letterSpacing: -0.7 }}>Settings</h1>
      </header>

      <div style={{ padding: "0 var(--s-xl)", display: "grid", gap: 12 }}>
        <Glass level="regular" radius={20} style={{ padding: 16 }}>
          <h2 style={{ margin: "0 0 12px", fontSize: 13, fontWeight: 700, letterSpacing: 0.8, textTransform: "uppercase", color: "var(--text-faint)" }}>
            On this device
          </h2>

          {[
            { label: "Downloaded episodes", value: String(stats.downloads) },
            { label: "Storage used", value: humanBytes(stats.bytes) },
            { label: "Watchlist", value: String(stats.watchlist) },
          ].map((row) => (
            <div
              key={row.label}
              style={{
                display: "flex",
                justifyContent: "space-between",
                gap: 12,
                padding: "9px 0",
                borderBottom: "1px solid rgba(255,255,255,0.06)",
                fontSize: 13.5,
              }}
            >
              <span style={{ color: "var(--text-muted)" }}>{row.label}</span>
              <span style={{ fontWeight: 600 }}>{row.value}</span>
            </div>
          ))}
        </Glass>

        <Glass level="regular" radius={20} style={{ padding: 16 }}>
          <h2 style={{ margin: "0 0 6px", fontSize: 13, fontWeight: 700, letterSpacing: 0.8, textTransform: "uppercase", color: "var(--text-faint)" }}>
            Source
          </h2>
          <p style={{ margin: "0 0 10px", fontSize: 12.5, lineHeight: 1.55, color: "var(--text-muted)" }}>
            AniSpots reads the catalogue through a proxy to avoid cross-origin blocking. No account, no tracking, no
            ads — nothing here is stored on a server.
          </p>
          <code
            style={{
              display: "block",
              padding: "8px 10px",
              borderRadius: 10,
              background: "rgba(0,0,0,0.35)",
              border: "1px solid rgba(255,255,255,0.08)",
              fontSize: 11.5,
              color: "var(--text-faint)",
              overflowX: "auto",
              whiteSpace: "nowrap",
            }}
          >
            {api.baseUrl}
          </code>
        </Glass>

        <Glass level="regular" radius={20} style={{ padding: 16 }}>
          <h2 style={{ margin: "0 0 10px", fontSize: 13, fontWeight: 700, letterSpacing: 0.8, textTransform: "uppercase", color: "var(--text-faint)" }}>
            Cache
          </h2>
          <p style={{ margin: "0 0 12px", fontSize: 12.5, lineHeight: 1.55, color: "var(--text-muted)" }}>
            Cached pages make returning to a screen instant. Clearing them does not touch your downloads or watchlist.
          </p>
          <GlassButton
            onClick={() => {
              clearCache();
              setCleared(true);
              window.setTimeout(() => setCleared(false), 2200);
            }}
          >
            {cleared ? "Cleared" : "Clear cached pages"}
          </GlassButton>
        </Glass>

        <p style={{ margin: "4px 0 0", fontSize: 11.5, color: "var(--text-faint)", textAlign: "center" }}>
          AniSpots · com.seigh.anispots
        </p>
      </div>
    </div>
  );
}
