import { useEffect, useMemo, useState } from "react";
import { useSearchParams } from "react-router-dom";
import type { ScheduleEntry } from "@anispots/core";
import { Page } from "../components/Shell";
import { Poster } from "../components/Poster";
import { Glass } from "../components/Glass";
import { PageSkeleton, ErrorState, EmptyState } from "../components/States";
import { loadSchedule } from "../lib/data";
import { useNavigate } from "react-router-dom";

/**
 * The airing schedule.
 *
 * The week is the unit people think in — "what is on tonight?" — so the page
 * is a calendar first and a list second. A day can be picked, and the choice
 * goes into the URL so the view can be linked to and survives a reload.
 */

/** The days, in the order they happen. */
const DAYS = [
  { key: "monday", label: "Monday", short: "Mon" },
  { key: "tuesday", label: "Tuesday", short: "Tue" },
  { key: "wednesday", label: "Wednesday", short: "Wed" },
  { key: "thursday", label: "Thursday", short: "Thu" },
  { key: "friday", label: "Friday", short: "Fri" },
  { key: "saturday", label: "Saturday", short: "Sat" },
  { key: "sunday", label: "Sunday", short: "Sun" },
] as const;

type DayKey = (typeof DAYS)[number]["key"];

const isDayKey = (value: string | null): value is DayKey =>
  !!value && DAYS.some((day) => day.key === value);

/** The day a name refers to, for the ones the source spells out. */
const DAY_NAMES: Record<string, DayKey> = {
  monday: "monday",
  tuesday: "tuesday",
  wednesday: "wednesday",
  thursday: "thursday",
  friday: "friday",
  saturday: "saturday",
  sunday: "sunday",
  mon: "monday",
  tue: "tuesday",
  tues: "tuesday",
  wed: "wednesday",
  thu: "thursday",
  thur: "thursday",
  thurs: "thursday",
  fri: "friday",
  sat: "saturday",
  sun: "sunday",
};

/** Normalise whatever the source calls a day into one of ours. */
function normaliseDay(value: string | undefined): DayKey | undefined {
  if (!value) return undefined;
  return DAY_NAMES[value.trim().toLowerCase()];
}

export function SchedulePage() {
  const [params, setParams] = useSearchParams();
  const navigate = useNavigate();

  const requested = params.get("day");
  const selected: DayKey | undefined = isDayKey(requested) ? requested : undefined;

  const [entries, setEntries] = useState<ScheduleEntry[] | undefined>(undefined);
  const [error, setError] = useState<string | undefined>(undefined);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    let cancelled = false;
    setLoading(true);
    setError(undefined);

    loadSchedule()
      .then((result) => {
        if (cancelled) return;
        setEntries(result);
      })
      .catch((cause: unknown) => {
        if (cancelled) return;
        setError(cause instanceof Error ? cause.message : "The schedule did not load");
      })
      .finally(() => {
        if (!cancelled) setLoading(false);
      });

    return () => {
      cancelled = true;
    };
  }, []);

  /**
   * The entries, grouped by day.
   *
   * The whole week is loaded once and grouped here, so picking a day is
   * instant rather than another round trip.
   */
  const grouped = useMemo(() => {
    const map = new Map<DayKey, ScheduleEntry[]>();
    for (const day of DAYS) map.set(day.key, []);

    for (const entry of entries ?? []) {
      const day = normaliseDay(entry.day);
      if (!day) continue;
      map.get(day)?.push(entry);
    }

    // Within a day, the earlier broadcast comes first.
    for (const list of map.values()) {
      list.sort((a, b) => (a.time ?? "99:99").localeCompare(b.time ?? "99:99"));
    }

    return map;
  }, [entries]);

  const total = useMemo(
    () => [...grouped.values()].reduce((sum, list) => sum + list.length, 0),
    [grouped],
  );

  const visible = selected ? [selected] : DAYS.map((day) => day.key);

  const choose = (day: DayKey | undefined) => {
    if (day) setParams({ day });
    else setParams({});
  };

  return (
    <Page>
      <div style={{ padding: "calc(28px + env(safe-area-inset-top)) var(--s-xl) 0" }}>
        <p style={{ margin: 0, fontSize: 12, fontWeight: 700, letterSpacing: 0.4, color: "var(--text-faint)" }}>
          AniSpots · Airing Schedule
        </p>
        <h1 style={{ margin: "6px 0 8px", fontSize: 28, letterSpacing: -0.6, color: "var(--text)" }}>
          Airing Schedule
        </h1>
        <p style={{ margin: "0 0 var(--s-lg)", fontSize: 13.5, lineHeight: 1.55, color: "var(--text-muted)", maxWidth: 520 }}>
          What airs, and when. Times are shown in the broadcaster&apos;s local time (JST) — pick a day
          to see just that day&apos;s lineup.
        </p>
      </div>

      {/* The day picker. */}
      <div
        data-testid="schedule-days"
        role="tablist"
        aria-label="Day of the week"
        style={{
          display: "flex",
          gap: 8,
          overflowX: "auto",
          padding: "0 var(--s-xl) var(--s-md)",
          scrollbarWidth: "none",
        }}
      >
        <DayTab label="All Days" count={total} active={!selected} onClick={() => choose(undefined)} />
        {DAYS.map((day) => (
          <DayTab
            key={day.key}
            label={day.short}
            count={grouped.get(day.key)?.length ?? 0}
            active={selected === day.key}
            onClick={() => choose(day.key)}
          />
        ))}
      </div>

      {loading && <PageSkeleton />}

      {!loading && error && (
        <ErrorState message={error} onRetry={() => window.location.reload()} title="The schedule did not load" />
      )}

      {!loading && !error && total === 0 && (
        <EmptyState
          title="Nothing is scheduled"
          hint="The schedule is empty right now. Try again in a little while."
        />
      )}

      {!loading && !error &&
        visible.map((dayKey) => {
          const list = grouped.get(dayKey) ?? [];
          if (list.length === 0) return null;

          const day = DAYS.find((entry) => entry.key === dayKey);
          return (
            <section
              key={dayKey}
              data-testid={`schedule-day-${dayKey}`}
              style={{ padding: "0 var(--s-xl) var(--s-xl)" }}
            >
              <header
                style={{
                  display: "flex",
                  alignItems: "baseline",
                  justifyContent: "space-between",
                  marginBottom: "var(--s-md)",
                }}
              >
                <h2 style={{ margin: 0, fontSize: 18, fontWeight: 700, letterSpacing: -0.3, color: "var(--text)" }}>
                  {day?.label ?? dayKey}
                </h2>
                <span style={{ fontSize: 12, color: "var(--text-faint)" }}>
                  {list.length} {list.length === 1 ? "title" : "titles"}
                </span>
              </header>

              <ul style={{ listStyle: "none", margin: 0, padding: 0, display: "grid", gap: "var(--s-md)" }}>
                {list.map((entry) => (
                  <li key={`${entry.id}-${entry.time ?? ""}`}>
                    <Glass
                      level="subtle"
                      radius={18}
                      style={{
                        display: "flex",
                        alignItems: "center",
                        gap: "var(--s-md)",
                        padding: "var(--s-md)",
                      }}
                    >
                      <Poster
                        anime={entry}
                        width={44}
                        onOpen={() => navigate(`/anime/${entry.id}`)}
                      />

                      <div style={{ flex: 1, minWidth: 0 }}>
                        <button
                          type="button"
                          onClick={() => navigate(`/anime/${entry.id}`)}
                          style={{
                            display: "block",
                            width: "100%",
                            textAlign: "left",
                            border: "none",
                            background: "none",
                            padding: 0,
                            cursor: "pointer",
                            color: "var(--text)",
                            fontSize: 14.5,
                            fontWeight: 700,
                            letterSpacing: -0.2,
                            whiteSpace: "nowrap",
                            overflow: "hidden",
                            textOverflow: "ellipsis",
                          }}
                        >
                          {entry.title}
                        </button>

                        <p
                          style={{
                            margin: "3px 0 0",
                            fontSize: 12,
                            color: "var(--text-muted)",
                            whiteSpace: "nowrap",
                            overflow: "hidden",
                            textOverflow: "ellipsis",
                          }}
                        >
                          {entry.airingString ?? entry.time ?? "Time to be announced"}
                        </p>

                        {(entry.genres?.length ?? 0) > 0 && (
                          <p
                            style={{
                              margin: "4px 0 0",
                              fontSize: 11,
                              color: "var(--text-faint)",
                              whiteSpace: "nowrap",
                              overflow: "hidden",
                              textOverflow: "ellipsis",
                            }}
                          >
                            {entry.format ? `${entry.format} · ` : ""}
                            {entry.genres?.slice(0, 3).join(" · ")}
                          </p>
                        )}
                      </div>

                      {entry.time && (
                        <span
                          style={{
                            flex: "0 0 auto",
                            padding: "4px 10px",
                            borderRadius: 999,
                            border: "1px solid var(--stroke-subtle)",
                            background: "var(--surface-pill)",
                            fontSize: 11.5,
                            fontWeight: 700,
                            color: "var(--text)",
                          }}
                        >
                          {entry.time}
                        </span>
                      )}
                    </Glass>
                  </li>
                ))}
              </ul>
            </section>
          );
        })}
    </Page>
  );
}

/** One button in the day picker. */
function DayTab({
  label,
  count,
  active,
  onClick,
}: {
  label: string;
  count: number;
  active: boolean;
  onClick: () => void;
}) {
  return (
    <button
      type="button"
      role="tab"
      aria-selected={active}
      onClick={onClick}
      className="pressable"
      style={{
        flex: "0 0 auto",
        display: "inline-flex",
        alignItems: "center",
        gap: 6,
        padding: "8px 14px",
        borderRadius: 999,
        border: `1px solid ${active ? "var(--btn-glass-border-active)" : "var(--stroke-subtle)"}`,
        background: active ? "var(--surface-pill-active)" : "var(--surface-pill)",
        color: active ? "var(--text)" : "var(--text-muted)",
        fontSize: 12.5,
        fontWeight: 700,
        cursor: "pointer",
        whiteSpace: "nowrap",
      }}
    >
      {label}
      <span style={{ color: "var(--text-faint)", fontWeight: 600 }}>{count}</span>
    </button>
  );
}
