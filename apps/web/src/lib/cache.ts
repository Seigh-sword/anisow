/**
 * A tiny request cache.
 *
 * The site is not fast — a cold `/home` is most of a second — and the app revisits
 * the same handful of pages constantly (back from a detail screen, between tabs,
 * after a reload). Caching by key with a short TTL removes almost all of that
 * without pretending to be a real data layer.
 *
 * In-flight requests are shared too: two components asking for the same anime at
 * the same moment must not cost two round trips.
 */

interface Entry<T> {
  value: T;
  at: number;
}

const store = new Map<string, Entry<unknown>>();
const inflight = new Map<string, Promise<unknown>>();

export const DEFAULT_TTL_MS = 5 * 60_000;

export async function cached<T>(
  key: string,
  load: () => Promise<T>,
  ttlMs = DEFAULT_TTL_MS,
): Promise<T> {
  const hit = store.get(key);
  if (hit && Date.now() - hit.at < ttlMs) return hit.value as T;

  const existing = inflight.get(key);
  if (existing) return existing as Promise<T>;

  const promise = load()
    .then((value) => {
      store.set(key, { value, at: Date.now() });
      return value;
    })
    .finally(() => {
      inflight.delete(key);
    });

  inflight.set(key, promise);
  return promise;
}

/** Drop one key, or everything with a prefix (e.g. after a mutation). */
export function invalidate(prefix: string): void {
  for (const key of [...store.keys()]) {
    if (key.startsWith(prefix)) store.delete(key);
  }
}

export function clearCache(): void {
  store.clear();
  inflight.clear();
}
