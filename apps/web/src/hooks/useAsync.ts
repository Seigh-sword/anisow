import { useCallback, useEffect, useRef, useState } from "react";

/**
 * One loading pattern for the whole app.
 *
 * Every screen has the same three states — loading, failed, ready — and the same
 * retry affordance. Doing that per screen is how one screen ends up with a
 * spinner that never stops. This keeps the state machine in one place.
 *
 * The `key` short-circuits: when it changes, the previous result is dropped
 * rather than flashed, which is what makes switching tabs feel instant.
 */
export interface AsyncState<T> {
  data: T | null;
  error: string | null;
  loading: boolean;
  /** Re-runs the loader, clearing the error. */
  retry: () => void;
  /** Replaces local data without a request (optimistic updates). */
  set: (value: T) => void;
}

export function useAsync<T>(
  key: string | null,
  load: () => Promise<T>,
  deps: unknown[] = [],
): AsyncState<T> {
  const [data, setData] = useState<T | null>(null);
  const [error, setError] = useState<string | null>(null);
  const [loading, setLoading] = useState(false);
  const [nonce, setNonce] = useState(0);

  // The loader is recreated every render; keeping it in a ref means the effect
  // depends on `key` (the thing that should trigger a reload) and not on the
  // function's identity, which would loop.
  const loadRef = useRef(load);
  loadRef.current = load;

  const currentKey = useRef<string | null>(null);

  useEffect(() => {
    if (key === null) {
      setData(null);
      setError(null);
      setLoading(false);
      currentKey.current = null;
      return;
    }

    // Keep the old data while a new key loads only if it is the same key.
    if (currentKey.current !== key) {
      setData(null);
      setError(null);
      currentKey.current = key;
    }

    let cancelled = false;
    setLoading(true);

    loadRef
      .current()
      .then((value) => {
        if (cancelled) return;
        setData(value);
        setError(null);
      })
      .catch((cause: unknown) => {
        if (cancelled) return;
        setError(cause instanceof Error ? cause.message : String(cause));
      })
      .finally(() => {
        if (!cancelled) setLoading(false);
      });

    return () => {
      cancelled = true;
    };
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [key, nonce, ...deps]);

  const retry = useCallback(() => setNonce((value) => value + 1), []);

  return { data, error, loading, retry, set: setData };
}
