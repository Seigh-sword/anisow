import { useCallback, useEffect, useMemo, useState } from "react";
import { Alert, FlatList, Image, ScrollView, StyleSheet, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { useFocusEffect, useNavigation } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { DownloadEntry } from "@anispots/core";
import { palette, space } from "@anispots/design";
import { getDownloads, getWatchlist, toggleWatchlist, type WatchlistItem } from "../lib/storage";
import { cancel, humanBytes, reconcile, remove, removeMany, start, subscribe } from "../lib/downloads";
import { Typed } from "../ui/Text";
import { Glass, PressableScale } from "../ui/Glass";
import { Poster } from "../components/Poster";
import type { RootStack } from "../navigation/types";

/**
 * Library: everything that is the user's, not the catalogue's.
 *
 * Grouped downloads first — with their cover, title and description, so this is
 * browsable with the radio off — then the watchlist. Deleting always asks, and
 * the episode-level delete sits inside its anime, because losing a series
 * because one episode was corrupt is the kind of thing a user never forgives.
 */
export function LibraryScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const [entries, setEntries] = useState<DownloadEntry[]>([]);
  const [watchlist, setWatchlist] = useState<WatchlistItem[]>([]);
  const [tab, setTab] = useState<"downloads" | "watchlist">("downloads");

  const refresh = useCallback(() => {
    void getDownloads().then(setEntries);
    void getWatchlist().then(setWatchlist);
  }, []);

  useFocusEffect(
    useCallback(() => {
      refresh();
      void reconcile();
      const unsubscribe = subscribe(() => {
        void getDownloads().then(setEntries);
      });
      return unsubscribe;
    }, [refresh]),
  );

  // Progress arrives through a throttled writer; a slow tick keeps bars honest.
  useEffect(() => {
    const timer = setInterval(() => {
      if (entries.some((entry) => entry.state === "downloading")) refresh();
    }, 800);
    return () => clearInterval(timer);
  }, [entries, refresh]);

  const groups = useMemo(() => {
    const map = new Map<string, { animeId: string; animeTitle: string; coverUrl?: string; description?: string; episodes: DownloadEntry[] }>();

    for (const entry of entries) {
      const existing = map.get(entry.animeId);
      if (existing) existing.episodes.push(entry);
      else
        map.set(entry.animeId, {
          animeId: entry.animeId,
          animeTitle: entry.animeTitle,
          coverUrl: entry.coverUrl,
          description: entry.description,
          episodes: [entry],
        });
    }

    for (const group of map.values()) {
      group.episodes.sort((a, b) => a.episodeNumber - b.episodeNumber);
    }

    return [...map.values()];
  }, [entries]);

  const total = entries.reduce((sum, entry) => sum + (entry.bytesDone ?? 0), 0);

  const confirmDelete = (entry: DownloadEntry) => {
    Alert.alert(
      "Delete this download?",
      `Episode ${entry.episodeNumber} of ${entry.animeTitle}. The file is removed from this device and cannot be recovered.`,
      [
        { text: "Cancel", style: "cancel" },
        { text: "Delete", style: "destructive", onPress: () => void remove(entry.id) },
      ],
    );
  };

  const confirmDeleteGroup = (animeId: string, animeTitle: string) => {
    const ids = entries.filter((entry) => entry.animeId === animeId).map((entry) => entry.id);
    Alert.alert(
      "Delete every episode?",
      `All ${ids.length} downloaded episodes of ${animeTitle} will be removed from this device.`,
      [
        { text: "Cancel", style: "cancel" },
        { text: "Delete all", style: "destructive", onPress: () => void removeMany(ids) },
      ],
    );
  };

  return (
    <View style={styles.root}>
      <SafeAreaView edges={["top"]}>
        <View style={styles.header}>
          <Typed role="title">Library</Typed>
          <Typed role="micro" color={palette.textFaint}>
            {entries.filter((entry) => entry.state === "done").length} files · {humanBytes(total)}
          </Typed>
        </View>

        <View style={styles.tabs}>
          {(["downloads", "watchlist"] as const).map((value) => (
            <PressableScale key={value} onPress={() => setTab(value)} style={{ flex: 1 }}>
              <Glass
                level={tab === value ? "regular" : "subtle"}
                radius={999}
                contentStyle={styles.tab}
              >
                <Typed role="label" color={tab === value ? palette.text : palette.textMuted}>
                  {value === "downloads" ? "Downloads" : "Watchlist"}
                </Typed>
              </Glass>
            </PressableScale>
          ))}
        </View>
      </SafeAreaView>

      {tab === "downloads" ? (
        <FlatList
          data={groups}
          keyExtractor={(group) => group.animeId}
          contentContainerStyle={styles.list}
          ListEmptyComponent={
            <View style={styles.empty}>
              <Typed role="label">Nothing downloaded yet</Typed>
              <Typed
                role="body"
                color={palette.textMuted}
                align="center"
                style={{ marginTop: space.sm, maxWidth: 300 }}
              >
                Open an anime and tap Download. Everything you keep plays with no connection.
              </Typed>
            </View>
          }
          renderItem={({ item: group }) => {
            const done = group.episodes.filter((entry) => entry.state === "done");
            const busy = group.episodes.some(
              (entry) => entry.state === "downloading" || entry.state === "queued",
            );

            return (
              <Glass level="regular" radius={20} contentStyle={{ padding: space.md }}>
                <View style={{ flexDirection: "row", gap: space.md }}>
                  {group.coverUrl ? (
                    <Image source={{ uri: group.coverUrl }} style={styles.cover} />
                  ) : (
                    <View style={[styles.cover, { backgroundColor: palette.inkRaised }]} />
                  )}

                  <View style={{ flex: 1, minWidth: 0 }}>
                    <Typed role="label" numberOfLines={1}>
                      {group.animeTitle}
                    </Typed>
                    <Typed role="micro" color={palette.textFaint} style={{ marginTop: 2 }}>
                      {done.length} of {group.episodes.length} ·{" "}
                      {humanBytes(group.episodes.reduce((sum, entry) => sum + (entry.bytesDone ?? 0), 0))}
                    </Typed>

                    {group.description ? (
                      <Typed
                        role="micro"
                        color={palette.textFaint}
                        numberOfLines={2}
                        style={{ marginTop: 4 }}
                      >
                        {group.description}
                      </Typed>
                    ) : null}

                    <View style={{ flexDirection: "row", gap: space.sm, marginTop: space.sm }}>
                      {done.length > 0 && (
                        <PressableScale
                          onPress={() =>
                            navigation.navigate("Watch", {
                              id: group.animeId,
                              episodeId: done[0]!.episodeId,
                              offline: true,
                            })
                          }
                        >
                          <Glass level="subtle" radius={999} contentStyle={styles.smallButton}>
                            <Typed role="micro">▶ EP {done[0]!.episodeNumber}</Typed>
                          </Glass>
                        </PressableScale>
                      )}

                      {busy && (
                        <PressableScale
                          onPress={() =>
                            group.episodes
                              .filter((entry) => entry.state === "downloading" || entry.state === "queued")
                              .forEach((entry) => void cancel(entry.id))
                          }
                        >
                          <Glass level="subtle" radius={999} contentStyle={styles.smallButton}>
                            <Typed role="micro">Pause</Typed>
                          </Glass>
                        </PressableScale>
                      )}

                      <PressableScale
                        onPress={() => confirmDeleteGroup(group.animeId, group.animeTitle)}
                      >
                        <Glass level="subtle" radius={999} contentStyle={styles.dangerButton}>
                          <Typed role="micro" color={palette.danger}>
                            Delete all
                          </Typed>
                        </Glass>
                      </PressableScale>
                    </View>
                  </View>
                </View>

                <View style={{ marginTop: space.md, gap: 6 }}>
                  {group.episodes.map((entry) => (
                    <View key={entry.id} style={styles.episodeRow}>
                      <View style={styles.episodeNumber}>
                        <Typed role="micro" color={palette.textMuted}>
                          {entry.episodeNumber}
                        </Typed>
                      </View>

                      <View style={{ flex: 1, minWidth: 0 }}>
                        <View style={{ flexDirection: "row", justifyContent: "space-between" }}>
                          <Typed role="micro">{entry.quality}</Typed>
                          <Typed
                            role="micro"
                            color={
                              entry.state === "done"
                                ? palette.success
                                : entry.state === "failed"
                                  ? palette.danger
                                  : palette.textFaint
                            }
                          >
                            {entry.state === "downloading"
                              ? `${entry.progress}%`
                              : entry.state === "done"
                                ? "Ready"
                                : entry.state === "queued"
                                  ? "Queued"
                                  : entry.state === "failed"
                                    ? "Failed"
                                    : "Cancelled"}
                          </Typed>
                        </View>

                        <View style={styles.bar}>
                          <View
                            style={{
                              width: `${entry.state === "done" ? 100 : entry.progress}%`,
                              height: "100%",
                              backgroundColor:
                                entry.state === "failed" ? palette.danger : "#7B3DFF",
                            }}
                          />
                        </View>
                      </View>

                      {(entry.state === "failed" || entry.state === "cancelled") && (
                        <PressableScale onPress={() => void start(entry.id)} hitSlop={8}>
                          <Typed role="micro" color="#7EC0FF">
                            Retry
                          </Typed>
                        </PressableScale>
                      )}

                      <PressableScale onPress={() => confirmDelete(entry)} hitSlop={8}>
                        <Typed role="micro" color={palette.textFaint}>
                          ✕
                        </Typed>
                      </PressableScale>
                    </View>
                  ))}
                </View>
              </Glass>
            );
          }}
        />
      ) : (
        <ScrollView contentContainerStyle={styles.list}>
          {watchlist.length === 0 ? (
            <View style={styles.empty}>
              <Typed role="label">Nothing saved yet</Typed>
              <Typed
                role="body"
                color={palette.textMuted}
                align="center"
                style={{ marginTop: space.sm, maxWidth: 300 }}
              >
                Tap Watchlist on any anime and it will be waiting here, even offline.
              </Typed>
            </View>
          ) : (
            <View style={styles.grid}>
              {watchlist.map((item) => (
                <View key={item.id} style={{ position: "relative" }}>
                  <Poster
                    anime={{ id: item.id, title: item.title, poster: item.poster }}
                    showTitle
                    onPress={() => navigation.navigate("Detail", { id: item.id })}
                  />
                  <PressableScale
                    onPress={async () => {
                      await toggleWatchlist(item);
                      refresh();
                    }}
                    accessibilityLabel={`Remove ${item.title}`}
                    style={styles.removeBadge}
                  >
                    <Typed role="micro">✕</Typed>
                  </PressableScale>
                </View>
              ))}
            </View>
          )}
        </ScrollView>
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: palette.ink },
  header: {
    paddingHorizontal: space.xl,
    paddingTop: space.sm,
    flexDirection: "row",
    alignItems: "baseline",
    justifyContent: "space-between",
  },
  tabs: { flexDirection: "row", gap: space.sm, padding: space.xl },
  tab: { paddingVertical: space.sm, alignItems: "center" },
  list: { paddingHorizontal: space.xl, paddingBottom: 120, gap: space.md },
  empty: { alignItems: "center", paddingVertical: space.xxxl },
  cover: { width: 62, height: 93, borderRadius: 12 },
  smallButton: { paddingHorizontal: space.md, paddingVertical: 6 },
  dangerButton: {
    paddingHorizontal: space.md,
    paddingVertical: 6,
    borderColor: "rgba(255,77,109,0.35)",
  },
  episodeRow: {
    flexDirection: "row",
    alignItems: "center",
    gap: space.sm,
    paddingHorizontal: space.sm,
    paddingVertical: 7,
    borderRadius: 12,
    backgroundColor: "rgba(255,255,255,0.04)",
  },
  episodeNumber: {
    width: 26,
    height: 26,
    borderRadius: 8,
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "rgba(255,255,255,0.07)",
  },
  bar: {
    marginTop: 4,
    height: 3,
    borderRadius: 999,
    backgroundColor: "rgba(255,255,255,0.12)",
    overflow: "hidden",
  },
  grid: { flexDirection: "row", flexWrap: "wrap", gap: space.md },
  removeBadge: {
    position: "absolute",
    top: 4,
    right: 4,
    width: 22,
    height: 22,
    borderRadius: 999,
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "rgba(7,8,14,0.8)",
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.2)",
  },
});
