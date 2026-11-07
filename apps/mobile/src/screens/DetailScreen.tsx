import { useEffect, useState } from "react";
import { ActivityIndicator, Image, ImageBackground, ScrollView, StyleSheet, View } from "react-native";
import { LinearGradient } from "expo-linear-gradient";
import { SafeAreaView } from "react-native-safe-area-context";
import { useNavigation, useRoute, type RouteProp } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { AnimeDetails, Episode } from "@anispots/core";
import { brand, palette, space } from "@anispots/design";
import { loadDetails, loadEpisodes } from "../lib/data";
import { getProgress, getWatchlist, toggleWatchlist } from "../lib/storage";
import { Typed } from "../ui/Text";
import { Glass, GradientSurface, PressableScale } from "../ui/Glass";
import type { RootStack } from "../navigation/types";

/**
 * Detail.
 *
 * The poster bleeds behind the whole header, so the page opens *inside* the
 * artwork rather than above a thumbnail. Play is the one gradient button, and it
 * resumes: the episode and second the user left off at, not episode one.
 */
export function DetailScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const route = useRoute<RouteProp<RootStack, "Detail">>();
  const { id } = route.params;

  const [details, setDetails] = useState<AnimeDetails | null>(null);
  const [episodes, setEpisodes] = useState<Episode[]>([]);
  const [resume, setResume] = useState<Episode | undefined>();
  const [saved, setSaved] = useState(false);
  const [inList, setInList] = useState(false);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    let cancelled = false;

    (async () => {
      try {
        const [info, list] = await Promise.all([loadDetails(id), loadEpisodes(id)]);
        if (cancelled) return;

        setDetails(info);
        setEpisodes(list);

        const [progress, watchlist] = await Promise.all([getProgress(id), getWatchlist()]);
        if (cancelled) return;
        const position = progress ? list.find((episode) => episode.id === progress.episodeId) : undefined;
        setResume(position);
        setSaved(Boolean(progress));
        setInList(watchlist.some((entry) => entry.id === id));
      } catch (cause) {
        if (!cancelled) setError(cause instanceof Error ? cause.message : String(cause));
      }
    })();

    return () => {
      cancelled = true;
    };
  }, [id]);

  if (error) {
    return (
      <View style={[styles.root, styles.center]}>
        <Typed role="title">That did not load</Typed>
        <Typed role="body" color={palette.textMuted} align="center" style={{ marginTop: space.sm }}>
          {error}
        </Typed>
      </View>
    );
  }

  if (!details) {
    return (
      <View style={[styles.root, styles.center]}>
        <ActivityIndicator color={brand.start} />
      </View>
    );
  }

  const target = resume ?? episodes[0];
  const watch = () =>
    navigation.navigate("Watch", { id, episodeId: target?.id });

  return (
    <ImageBackground source={{ uri: details.poster }} style={styles.root} blurRadius={28}>
      <LinearGradient
        colors={["rgba(7,8,14,0.55)", "rgba(7,8,14,0.92)", palette.ink]}
        style={StyleSheet.absoluteFill}
      />

      <ScrollView contentContainerStyle={{ paddingBottom: 120 }}>
        <SafeAreaView edges={["top"]}>
          <View style={styles.header}>
            <PressableScale onPress={() => navigation.goBack()} accessibilityLabel="Back">
              <Glass level="subtle" radius={999} contentStyle={styles.circle}>
                <Typed>‹</Typed>
              </Glass>
            </PressableScale>
          </View>

          <View style={styles.heroRow}>
            <Image source={{ uri: details.poster }} style={styles.poster} resizeMode="cover" />

            <View style={{ flex: 1, minWidth: 0 }}>
              <Typed role="title" numberOfLines={3}>
                {details.title}
              </Typed>
              {details.japanese ? (
                <Typed role="micro" color={palette.textFaint} style={{ marginTop: 4 }}>
                  {details.japanese}
                </Typed>
              ) : null}

              <View style={styles.chips}>
                {[details.format, details.status, details.score && `★ ${details.score}`]
                  .filter(Boolean)
                  .map((label) => (
                    <View key={String(label)} style={styles.chip}>
                      <Typed role="micro" color={palette.textMuted}>
                        {label}
                      </Typed>
                    </View>
                  ))}
              </View>

              <View style={{ flexDirection: "row", gap: space.sm, marginTop: space.lg }}>
                <PressableScale onPress={watch}>
                  <GradientSurface style={styles.play}>
                    <Typed role="label">
                      ▶  {resume ? `Resume EP ${resume.number}` : "Play"}
                    </Typed>
                  </GradientSurface>
                </PressableScale>

                <PressableScale
                  onPress={async () => {
                    const now = await toggleWatchlist({
                      id: details.id,
                      title: details.title,
                      poster: details.poster,
                    });
                    setInList(now);
                  }}
                >
                  <Glass level="regular" radius={999} contentStyle={styles.ghost}>
                    <Typed role="label">{inList ? "Saved" : "Watchlist"}</Typed>
                  </Glass>
                </PressableScale>
              </View>
            </View>
          </View>
        </SafeAreaView>

        <View style={{ padding: space.xl, gap: space.xl }}>
          {details.description ? (
            <Typed role="body" color={palette.textMuted}>
              {details.description}
            </Typed>
          ) : null}

          {details.genres.length > 0 && (
            <View style={{ flexDirection: "row", flexWrap: "wrap", gap: space.sm }}>
              {details.genres.map((genre) => (
                <PressableScale
                  key={genre}
                  onPress={() =>
                    navigation.navigate("Tabs", {
                      screen: "Browse",
                      params: { genre: genre.toLowerCase().replace(/\s+/g, "-") },
                    } as never)
                  }
                >
                  <Glass level="subtle" radius={999} contentStyle={styles.genre}>
                    <Typed role="micro" color={palette.textMuted}>
                      {genre}
                    </Typed>
                  </Glass>
                </PressableScale>
              ))}
            </View>
          )}

          <View>
            <View style={styles.sectionHeader}>
              <Typed role="section">Episodes</Typed>
              <Typed role="micro" color={palette.textFaint}>
                {episodes.length} · {saved ? "resume available" : "not started"}
              </Typed>
            </View>

            <View style={styles.episodeGrid}>
              {episodes.slice(0, 30).map((episode) => {
                const active = resume?.id === episode.id;
                return (
                  <PressableScale
                    key={episode.id}
                    onPress={() => navigation.navigate("Watch", { id, episodeId: episode.id })}
                  >
                    <View style={[styles.episodeCell, active && styles.episodeCellActive]}>
                      <Typed role="label" color={active ? palette.text : palette.textMuted}>
                        {episode.number}
                      </Typed>
                    </View>
                  </PressableScale>
                );
              })}

              {episodes.length > 30 && (
                <PressableScale
                  onPress={() => navigation.navigate("Episodes", { id, title: details.title })}
                >
                  <View style={[styles.episodeCell, { borderStyle: "dashed" }]}>
                    <Typed role="micro" color={palette.textMuted}>
                      +{episodes.length - 30}
                    </Typed>
                  </View>
                </PressableScale>
              )}
            </View>
          </View>

          {details.recommendations.length > 0 && (
            <View>
              <Typed role="section" style={{ marginBottom: space.md }}>
                Recommended
              </Typed>
              <ScrollView horizontal showsHorizontalScrollIndicator={false}>
                <View style={{ flexDirection: "row", gap: space.md }}>
                  {details.recommendations.slice(0, 12).map((card) => (
                    <PressableScale
                      key={card.id}
                      onPress={() => navigation.push("Detail", { id: card.id })}
                    >
                      <Image source={{ uri: card.poster }} style={styles.miniPoster} />
                      <Typed role="micro" numberOfLines={2} style={{ width: 84, marginTop: 6 }}>
                        {card.title}
                      </Typed>
                    </PressableScale>
                  ))}
                </View>
              </ScrollView>
            </View>
          )}
        </View>
      </ScrollView>
    </ImageBackground>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: palette.ink },
  center: { alignItems: "center", justifyContent: "center", padding: space.xl },
  header: { paddingHorizontal: space.xl, paddingTop: space.sm },
  circle: { width: 36, height: 36, alignItems: "center", justifyContent: "center" },
  heroRow: {
    flexDirection: "row",
    gap: space.lg,
    paddingHorizontal: space.xl,
    paddingTop: space.lg,
  },
  poster: {
    width: 116,
    height: 174,
    borderRadius: 14,
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.14)",
  },
  chips: { flexDirection: "row", flexWrap: "wrap", gap: 6, marginTop: space.md },
  chip: {
    paddingHorizontal: 8,
    paddingVertical: 2,
    borderRadius: 999,
    backgroundColor: "rgba(255,255,255,0.06)",
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.12)",
  },
  play: { paddingHorizontal: space.lg, paddingVertical: space.md },
  ghost: { paddingHorizontal: space.md, paddingVertical: space.md },
  genre: { paddingHorizontal: space.md, paddingVertical: 6 },
  sectionHeader: {
    flexDirection: "row",
    alignItems: "baseline",
    justifyContent: "space-between",
    marginBottom: space.md,
  },
  episodeGrid: { flexDirection: "row", flexWrap: "wrap", gap: space.sm },
  episodeCell: {
    width: 52,
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
  miniPoster: { width: 84, height: 126, borderRadius: 10 },
});
