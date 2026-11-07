import { useCallback, useEffect, useMemo, useRef, useState } from "react";
import {
  ActivityIndicator,
  Modal,
  Pressable,
  ScrollView,
  StyleSheet,
  View,
  useWindowDimensions,
  type GestureResponderEvent,
} from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { WebView } from "react-native-webview";
import { LinearGradient } from "expo-linear-gradient";
import { useNavigation, useRoute, type RouteProp } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { Episode, Server } from "@anispots/core";
import { brand, palette, space } from "@anispots/design";
import { loadDetails, loadDownloadLinks, loadEpisodes, loadServers } from "../lib/data";
import { getProgress, saveProgress, getDownloads } from "../lib/storage";
import { enqueue } from "../lib/downloads";
import {
  BRIDGE_SCRIPT,
  buildEmbedUrl,
  formatTime,
  isPlayerError,
  readMessage,
  send,
  type ProgressFrame,
} from "../lib/playerBridge";
import { Typed } from "../ui/Text";
import { Glass, PressableScale } from "../ui/Glass";
import type { RootStack } from "../navigation/types";

/**
 * The player.
 *
 * Opens straight into the embed: the requirement is that playback is immediate,
 * and everything else — sources, episodes, downloads, lock — is chrome around
 * the picture rather than a gate in front of it.
 *
 * The WebView owns decoding, subtitles, speed and quality. AniSpots owns the
 * shell: resume, ±10s, the episode stepper, the overlay that can be locked so a
 * stray thumb does not scrub mid-episode, and the download path for the episode
 * being watched.
 */
export function WatchScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const route = useRoute<RouteProp<RootStack, "Watch">>();
  const { id, episodeId } = route.params;
  const { width, height } = useWindowDimensions();

  const webview = useRef<WebView | null>(null);
  const lastFrame = useRef<ProgressFrame>({ currentTime: 0, duration: 0 });
  const savedAt = useRef(0);

  const [frame, setFrame] = useState<ProgressFrame>({ currentTime: 0, duration: 0 });
  const [episodes, setEpisodes] = useState<Episode[]>([]);
  const [servers, setServers] = useState<Server[]>([]);
  const [serverIndex, setServerIndex] = useState(0);
  const [title, setTitle] = useState("");
  const [poster, setPoster] = useState<string | undefined>();
  const [description, setDescription] = useState<string | undefined>();
  const [anilistId, setAnilistId] = useState<string | undefined>();
  const [malId, setMalId] = useState<string | undefined>();
  const [chosen, setChosen] = useState<string | null>(episodeId ?? null);
  const [resumeAt, setResumeAt] = useState(0);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const [locked, setLocked] = useState(false);
  const [showServers, setShowServers] = useState(false);
  const [showEpisodes, setShowEpisodes] = useState(false);
  const [downloading, setDownloading] = useState(false);
  const [downloadNote, setDownloadNote] = useState<string | null>(null);

  /* ------------------------------------------------------------- metadata */

  useEffect(() => {
    let cancelled = false;

    (async () => {
      try {
        const [details, list] = await Promise.all([loadDetails(id), loadEpisodes(id)]);
        if (cancelled) return;

        setTitle(details.title);
        setPoster(details.poster);
        setDescription(details.description);
        setAnilistId(details.anilistId);
        setMalId(details.malId);
        setEpisodes(list);

        const saved = await getProgress(id);
        const candidate =
          list.find((episode) => episode.id === (chosen ?? saved?.episodeId)) ?? list[0] ?? null;

        if (candidate) {
          setChosen(candidate.id);
          if (saved && saved.episodeId === candidate.id && saved.position > 10) {
            setResumeAt(saved.position);
          }
        }
      } catch (cause) {
        if (!cancelled) setError(cause instanceof Error ? cause.message : String(cause));
      }
    })();

    return () => {
      cancelled = true;
    };
    // `chosen` is intentionally read once: this is the first-load effect.
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [id]);

  /* -------------------------------------------------------------- servers */

  useEffect(() => {
    if (!chosen) return;
    let cancelled = false;
    const epObj = episodes.find((item) => item.id === chosen);

    setLoading(true);
    loadServers(chosen, {
      episodeNumber: epObj?.number,
      anilistId,
      malId,
      embedUrls: epObj?.embedUrls,
    })
      .then((list) => {
        if (cancelled) return;
        setServers(list);
        setServerIndex(0);
        setLoading(false);
        if (list.length === 0) setError("No source answered for this episode yet.");
      })
      .catch((cause: unknown) => {
        if (cancelled) return;
        setError(cause instanceof Error ? cause.message : String(cause));
        setLoading(false);
      });

    return () => {
      cancelled = true;
    };
  }, [chosen, episodes, anilistId, malId]);

  /* ------------------------------------------------------------- progress */

  const persist = useCallback(
    async (value: ProgressFrame) => {
      const episode = episodes.find((item) => item.id === chosen);
      if (!episode || value.currentTime < 5) return;

      await saveProgress({
        animeId: id,
        animeTitle: title,
        coverUrl: poster,
        episodeNumber: episode.number,
        episodeId: episode.id,
        position: value.currentTime,
        duration: value.duration,
        fraction: value.duration > 0 ? Math.min(1, value.currentTime / value.duration) : undefined,
        updatedAt: Date.now(),
      });
    },
    [chosen, episodes, id, poster, title],
  );

  // Ask the embed for a frame every couple of seconds: hosts differ in how often
  // they volunteer one, and a frozen scrubber reads as a broken player.
  useEffect(() => {
    const timer = setInterval(() => {
      if (servers.length > 0) send(webview, { type: "state" });
    }, 2000);
    return () => clearInterval(timer);
  }, [servers.length]);

  // Save on the way out, so closing the screen never loses the position.
  useEffect(() => {
    return () => {
      void persist(lastFrame.current);
    };
  }, [persist]);

  const current = episodes.find((episode) => episode.id === chosen);
  const index = current ? episodes.findIndex((episode) => episode.id === current.id) : -1;
  const previous = index > 0 ? episodes[index - 1] : undefined;
  const next = index >= 0 && index < episodes.length - 1 ? episodes[index + 1] : undefined;
  const server = servers[serverIndex] ?? servers[0];

  const embedUrl = useMemo(
    () =>
      server
        ? buildEmbedUrl(server.embedUrl, { startAt: resumeAt, autonext: Boolean(next) })
        : null,
    [server, resumeAt, next],
  );

  const goTo = (episode: Episode) => {
    setShowEpisodes(false);
    setResumeAt(0);
    setFrame({ currentTime: 0, duration: 0 });
    lastFrame.current = { currentTime: 0, duration: 0 };
    setChosen(episode.id);
  };

  const seekBy = (delta: number) => {
    const target = Math.max(0, lastFrame.current.currentTime + delta);
    send(webview, { type: "seek", time: target });
    setFrame((value) => ({ ...value, currentTime: target }));
    lastFrame.current = { ...lastFrame.current, currentTime: target };
  };

  const onScrub = (event: GestureResponderEvent) => {
    if (frame.duration <= 0) return;
    const ratio = Math.min(1, Math.max(0, event.nativeEvent.locationX / (width - space.lg * 2)));
    const target = ratio * frame.duration;
    send(webview, { type: "seek", time: target });
    setFrame((value) => ({ ...value, currentTime: target }));
    lastFrame.current = { ...lastFrame.current, currentTime: target };
  };

  /** Download the episode being watched, at the quality the source offers. */
  const downloadThis = async () => {
    if (!current) return;
    setDownloading(true);
    setDownloadNote(null);

    try {
      const already = (await getDownloads()).find((entry) => entry.episodeId === current.id);
      if (already) {
        setDownloadNote(
          already.state === "done" ? "Already saved to this device." : "Already in the queue.",
        );
        return;
      }

      // The episode's own file list is site-gated; the embed's stream URL is not
      // a file, so this asks the same endpoint the episode screen does.
      const { links, error: linkError } = await loadDownloadLinks(current.id, {
        episodeNumber: current.number,
        anilistId,
        malId,
      });

      if (linkError || links.length === 0) {
        setDownloadNote(
          "The site is not serving files for this episode. Downloads have to be enabled on its side; streaming still works.",
        );
        return;
      }

      const best = links[0]!;
      await enqueue({
        animeId: id,
        animeTitle: title,
        coverUrl: poster,
        description,
        episodeNumber: current.number,
        episodeId: current.id,
        quality: best.quality,
        sourceUrl: best.url,
      });

      setDownloadNote(`Saving episode ${current.number} (${best.quality}). Check Library for progress.`);
    } catch (cause) {
      setDownloadNote(cause instanceof Error ? cause.message : String(cause));
    } finally {
      setDownloading(false);
    }
  };

  const percent = frame.duration > 0 ? Math.min(100, (frame.currentTime / frame.duration) * 100) : 0;

  return (
    <View style={styles.root}>
      <SafeAreaView edges={["top"]} style={{ backgroundColor: "#05060b" }}>
        {/* ------------------------------------------------------- top bar */}
        <View style={[styles.topBar, { opacity: locked ? 0 : 1 }]} pointerEvents={locked ? "none" : "auto"}>
          <PressableScale onPress={() => navigation.goBack()} accessibilityLabel="Back" hitSlop={10}>
            <Glass level="subtle" radius={999} contentStyle={styles.circle}>
              <Typed>‹</Typed>
            </Glass>
          </PressableScale>

          <View style={{ flex: 1, minWidth: 0 }}>
            <Typed role="label" numberOfLines={1}>
              {title || "Loading…"}
            </Typed>
            <Typed role="micro" color={palette.textFaint} numberOfLines={1}>
              {current ? `EP ${current.number}` : ""}
              {current?.title ? ` · ${current.title}` : ""}
            </Typed>
          </View>

          <PressableScale onPress={() => setLocked(true)} accessibilityLabel="Lock controls">
            <Glass level="subtle" radius={999} contentStyle={styles.lockButton}>
              <Typed role="micro" color={palette.textMuted}>
                Lock
              </Typed>
            </Glass>
          </PressableScale>
        </View>
      </SafeAreaView>

      {/* ---------------------------------------------------------- stage */}
      <View style={[styles.stage, { height: Math.min(width * 0.5625, height * 0.5) }]}>
        {embedUrl ? (
          <WebView
            ref={webview}
            source={{ uri: embedUrl }}
            style={{ flex: 1, backgroundColor: "#000" }}
            injectedJavaScript={BRIDGE_SCRIPT}
            injectedJavaScriptBeforeContentLoaded={BRIDGE_SCRIPT}
            onMessage={(event) => {
              const raw = event.nativeEvent.data;
              const err = isPlayerError(raw);
              if (err && servers.length > 1) {
                const nextIdx = (serverIndex + 1) % servers.length;
                if (nextIdx !== serverIndex) {
                  setServerIndex(nextIdx);
                  setDownloadNote(
                    `Auto-selected ${servers[nextIdx]!.name} (${servers[nextIdx]!.audio.toUpperCase()}) because the previous server was unavailable.`,
                  );
                }
                return;
              }

              const value = readMessage(raw);
              if (!value) return;
              lastFrame.current = value;
              setFrame(value);

              const now = Date.now();
              if (now - savedAt.current > 5000) {
                savedAt.current = now;
                void persist(value);
              }
            }}
            // The embed needs a normal browser identity, storage and autoplay;
            // without these it renders its own "unsupported browser" page.
            userAgent="Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"
            allowsInlineMediaPlayback
            allowsFullscreenVideo
            mediaPlaybackRequiresUserAction={false}
            javaScriptEnabled
            domStorageEnabled
            originWhitelist={["*"]}
            onLoadEnd={() => {
              send(webview, { type: "autoplay", on: true });
              send(webview, { type: "autonext", on: Boolean(next) });
            }}
            onError={() => setError("The player did not load. Try another source.")}
          />
        ) : (
          <View style={styles.stageCenter}>
            {loading ? (
              <>
                <ActivityIndicator color={brand.start} />
                <Typed role="body" color={palette.textMuted} style={{ marginTop: space.md }}>
                  Finding a source…
                </Typed>
              </>
            ) : (
              <>
                <Typed role="label">No source yet</Typed>
                <Typed
                  role="body"
                  color={palette.textMuted}
                  align="center"
                  style={{ marginTop: space.sm, maxWidth: 280 }}
                >
                  {error ?? "This episode has not been published to a player."}
                </Typed>
              </>
            )}
          </View>
        )}

        {/* Scrubber, drawn over the picture. */}
        {embedUrl && !locked ? (
          <View style={styles.scrubWrap}>
            <Pressable onPress={onScrub} style={styles.scrubHit}>
              <View style={styles.scrubTrack}>
                <LinearGradient
                  colors={[brand.start, brand.end]}
                  start={{ x: 0, y: 0 }}
                  end={{ x: 1, y: 0 }}
                  style={{ width: `${percent}%`, height: "100%" }}
                />
              </View>
              <View style={[styles.knob, { left: `${percent}%` }]} />
            </Pressable>

            <View style={styles.scrubRow}>
              <Typed role="micro" color={palette.textMuted}>
                {formatTime(frame.currentTime)} / {formatTime(frame.duration)}
              </Typed>

              <View style={{ flexDirection: "row", gap: space.sm, marginLeft: "auto" }}>
                <PressableScale onPress={() => seekBy(-10)} accessibilityLabel="Back ten seconds">
                  <Glass level="subtle" radius={999} contentStyle={styles.seek}>
                    <Typed role="micro">−10</Typed>
                  </Glass>
                </PressableScale>
                <PressableScale onPress={() => seekBy(10)} accessibilityLabel="Forward ten seconds">
                  <Glass level="subtle" radius={999} contentStyle={styles.seek}>
                    <Typed role="micro">+10</Typed>
                  </Glass>
                </PressableScale>
              </View>
            </View>
          </View>
        ) : null}

        {/* Lock veil: swallows every touch until deliberately dismissed. */}
        {locked ? (
          <Pressable style={styles.lockVeil} onPress={() => setLocked(false)}>
            <Glass level="strong" radius={999} contentStyle={styles.lockPill}>
              <Typed role="micro">🔒 Tap to unlock</Typed>
            </Glass>
          </Pressable>
        ) : null}
      </View>

      {/* ------------------------------------------------- bottom chrome */}
      {!locked && (
        <View style={styles.chrome}>
          <View style={{ flexDirection: "row", gap: space.sm, alignItems: "center" }}>
            <PressableScale
              onPress={() => previous && goTo(previous)}
              disabled={!previous}
              accessibilityLabel="Previous episode"
            >
              <Glass level="regular" radius={999} contentStyle={styles.stepButton}>
                <Typed role="label">⏮</Typed>
              </Glass>
            </PressableScale>

            <PressableScale
              onPress={() => setShowEpisodes(true)}
              style={{ flex: 1 }}
              accessibilityLabel="Episode list"
            >
              <Glass level="regular" radius={999} contentStyle={styles.episodeButton}>
                <Typed role="label">
                  {current ? `EP ${current.number}` : "Episodes"}
                  <Typed role="micro" color={palette.textFaint}>
                    {episodes.length > 0 ? `  of ${episodes.length}` : ""}
                  </Typed>
                </Typed>
              </Glass>
            </PressableScale>

            <PressableScale
              onPress={() => next && goTo(next)}
              disabled={!next}
              accessibilityLabel="Next episode"
            >
              <Glass level="regular" radius={999} contentStyle={styles.stepButton}>
                <Typed role="label">⏭</Typed>
              </Glass>
            </PressableScale>
          </View>

          <View style={{ flexDirection: "row", gap: space.sm }}>
            <PressableScale onPress={downloadThis} disabled={downloading} style={{ flex: 1 }}>
              <Glass level="regular" radius={999} contentStyle={styles.wideButton}>
                <Typed role="label">{downloading ? "Starting…" : "Download"}</Typed>
              </Glass>
            </PressableScale>

            <PressableScale onPress={() => setShowServers(true)} style={{ flex: 1 }}>
              <Glass level="regular" radius={999} contentStyle={styles.wideButton}>
                <Typed role="label" numberOfLines={1}>
                  {server ? `${server.name} · ${server.audio.toUpperCase()}` : "Sources"}
                </Typed>
              </Glass>
            </PressableScale>
          </View>

          {downloadNote ? (
            <Typed role="micro" color={palette.textMuted} align="center" style={{ marginTop: space.xs }}>
              {downloadNote}
            </Typed>
          ) : null}
        </View>
      )}

      {/* ---------------------------------------------------------- sheets */}
      <Modal visible={showServers} transparent animationType="slide" onRequestClose={() => setShowServers(false)}>
        <Pressable style={styles.backdrop} onPress={() => setShowServers(false)} />
        <SafeAreaView edges={["bottom"]} style={styles.sheetHost}>
          <Glass level="floating" radius={26}>
            <View style={styles.sheetHeader}>
              <Typed role="section">Sources</Typed>
              <Typed role="micro" color={palette.textFaint}>
                Subtitles, speed and quality live in the player
              </Typed>
            </View>

            <ScrollView style={{ maxHeight: 340 }}>
              {servers.map((item, itemIndex) => (
                <Pressable
                  key={`${item.name}-${itemIndex}`}
                  onPress={() => {
                    setServerIndex(itemIndex);
                    setShowServers(false);
                  }}
                  style={[
                    styles.serverRow,
                    itemIndex === serverIndex && { backgroundColor: "rgba(0,123,255,0.14)" },
                  ]}
                >
                  <Typed role="label" style={{ flex: 1 }}>
                    {item.name}
                  </Typed>
                  <Typed role="micro" color={item.audio.startsWith("d") ? "#FF8CF6" : "#7EC0FF"}>
                    {item.audio.toUpperCase()}
                  </Typed>
                </Pressable>
              ))}
            </ScrollView>
          </Glass>
        </SafeAreaView>
      </Modal>

      <Modal visible={showEpisodes} transparent animationType="slide" onRequestClose={() => setShowEpisodes(false)}>
        <Pressable style={styles.backdrop} onPress={() => setShowEpisodes(false)} />
        <SafeAreaView edges={["bottom"]} style={styles.sheetHost}>
          <Glass level="floating" radius={26}>
            <View style={styles.sheetHeader}>
              <Typed role="section">Episodes</Typed>
              <Typed role="micro" color={palette.textFaint}>
                {episodes.length} total
              </Typed>
            </View>

            <ScrollView contentContainerStyle={styles.episodeGrid} style={{ maxHeight: 420 }}>
              {episodes.map((episode) => {
                const active = episode.id === chosen;
                return (
                  <Pressable
                    key={episode.id}
                    onPress={() => goTo(episode)}
                    style={[styles.episodeCell, active && styles.episodeCellActive]}
                  >
                    <Typed role="label" color={active ? palette.text : palette.textMuted}>
                      {episode.number}
                    </Typed>
                  </Pressable>
                );
              })}
            </ScrollView>
          </Glass>
        </SafeAreaView>
      </Modal>
    </View>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: "#05060b" },
  topBar: {
    flexDirection: "row",
    alignItems: "center",
    gap: space.md,
    paddingHorizontal: space.md,
    paddingBottom: space.sm,
  },
  circle: { width: 36, height: 36, alignItems: "center", justifyContent: "center" },
  lockButton: { paddingHorizontal: space.md, paddingVertical: 6 },
  stage: {
    width: "100%",
    backgroundColor: "#000",
    borderTopWidth: StyleSheet.hairlineWidth,
    borderBottomWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.10)",
  },
  stageCenter: { flex: 1, alignItems: "center", justifyContent: "center", padding: space.xl },
  scrubWrap: {
    position: "absolute",
    left: 0,
    right: 0,
    bottom: 0,
    paddingHorizontal: space.lg,
    paddingBottom: space.sm,
    paddingTop: space.xl,
    backgroundColor: "rgba(0,0,0,0.35)",
  },
  scrubHit: { height: 22, justifyContent: "center" },
  scrubTrack: {
    height: 3,
    borderRadius: 999,
    backgroundColor: "rgba(255,255,255,0.24)",
    overflow: "hidden",
  },
  knob: {
    position: "absolute",
    width: 11,
    height: 11,
    marginLeft: -5.5,
    borderRadius: 999,
    backgroundColor: "#fff",
  },
  scrubRow: { flexDirection: "row", alignItems: "center", marginTop: space.xs },
  seek: { paddingHorizontal: space.md, paddingVertical: 5 },
  lockVeil: {
    ...StyleSheet.absoluteFillObject,
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "rgba(0,0,0,0.10)",
  },
  lockPill: { paddingHorizontal: space.lg, paddingVertical: space.sm },
  chrome: { padding: space.md, gap: space.sm },
  stepButton: { width: 46, height: 42, alignItems: "center", justifyContent: "center" },
  episodeButton: { height: 42, alignItems: "center", justifyContent: "center" },
  wideButton: { height: 42, alignItems: "center", justifyContent: "center" },
  backdrop: { ...StyleSheet.absoluteFillObject, backgroundColor: "rgba(3,4,8,0.66)" },
  sheetHost: { marginTop: "auto", paddingHorizontal: space.md },
  sheetHeader: { padding: space.lg, gap: 2 },
  serverRow: {
    flexDirection: "row",
    alignItems: "center",
    marginHorizontal: space.md,
    marginBottom: space.xs,
    paddingHorizontal: space.md,
    paddingVertical: space.md,
    borderRadius: 14,
    backgroundColor: "rgba(255,255,255,0.04)",
  },
  episodeGrid: {
    flexDirection: "row",
    flexWrap: "wrap",
    gap: space.sm,
    padding: space.lg,
  },
  episodeCell: {
    width: 54,
    height: 42,
    borderRadius: 12,
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "rgba(255,255,255,0.05)",
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.12)",
  },
  episodeCellActive: {
    backgroundColor: "rgba(0,123,255,0.20)",
    borderColor: "rgba(0,123,255,0.6)",
  },
});
