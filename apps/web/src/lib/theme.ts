/**
 * The theme.
 *
 * Two modes, and the choice survives a reload. The mode is a `data-theme`
 * attribute on the document element, so the CSS variables that do the actual
 * work live in one place and every surface follows them.
 *
 * The attribute is set before the first paint — the module reads the stored
 * preference as soon as it is imported — so there is never a flash of the
 * wrong theme on a reload.
 */

import { useCallback, useEffect, useState } from "react";

export type Theme = "light" | "dark";

/** Where the preference is kept. */
const STORAGE_KEY = "anispots.theme";

/** What a person gets who has never chosen. */
const DEFAULT_THEME: Theme = "dark";

/** The attribute the CSS keys off. */
const ATTRIBUTE = "data-theme";

function isTheme(value: unknown): value is Theme {
  return value === "light" || value === "dark";
}

/**
 * The stored preference.
 *
 * Reading it can throw in private-browsing modes where localStorage is
 * unavailable, so the default is returned instead of letting that break the
 * page.
 */
export function getTheme(): Theme {
  try {
    const stored = window.localStorage.getItem(STORAGE_KEY);
    if (isTheme(stored)) return stored;
  } catch {
    // Storage is not available; fall through to the default.
  }
  return DEFAULT_THEME;
}

/** Write the preference and apply it. */
export function setTheme(theme: Theme): Theme {
  try {
    window.localStorage.setItem(STORAGE_KEY, theme);
  } catch {
    // The theme still applies for this session even if it cannot be stored.
  }
  applyThemeToDocument(theme);
  return theme;
}

/**
 * Put the theme on the document.
 *
 * This is what the CSS sees. It also sets `color-scheme`, so the browser's
 * own scrollbars and form controls match the mode.
 */
export function applyThemeToDocument(theme: Theme): void {
  const root = document.documentElement;
  root.setAttribute(ATTRIBUTE, theme);
  root.style.colorScheme = theme;
}

/** Switch to the other mode. */
export function toggleTheme(): Theme {
  return setTheme(getTheme() === "dark" ? "light" : "dark");
}

/**
 * The current theme, and a way to change it.
 *
 * The value is kept in state so a component re-renders when it changes, and
 * the state is the single source of truth for the rest of the tree.
 */
export function useTheme(): {
  theme: Theme;
  setTheme: (theme: Theme) => void;
  toggleTheme: () => void;
} {
  const [theme, setThemeState] = useState<Theme>(getTheme);

  useEffect(() => {
    applyThemeToDocument(theme);
  }, [theme]);

  const choose = useCallback((next: Theme) => {
    setTheme(next);
    setThemeState(next);
  }, []);

  const toggle = useCallback(() => {
    setThemeState((current) => {
      const next = current === "dark" ? "light" : "dark";
      setTheme(next);
      return next;
    });
  }, []);

  return { theme, setTheme: choose, toggleTheme: toggle };
}

// Apply the stored theme as soon as this module is loaded, which happens
// before the first render, so a reload never flashes the wrong theme.
if (typeof window !== "undefined") {
  applyThemeToDocument(getTheme());
}
