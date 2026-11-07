import { useEffect, useMemo, useState } from "react";
import { FlatList, StyleSheet, TextInput, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { useNavigation, useRoute, type RouteProp } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { Episode } from "@anispots/core";
import { brand, palette, space } from "@anispots/design";
import { loadEpisodes } from "../lib/data";
import { Typed } from "../ui/Text";
import { PressableScale } from "../ui/Glass";
import type { RootStack } from "../navigation/types";

/**
 * The full episode list.
 *
 * A screen rather than a sheet because a 500-episode run is a destination, not a
 * popup: it gets its own scroll position, its own search box, and the back
 * gesture returns to the anime, not to a dismissed overlay.
 */
export function EpisodesScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const route = useRoute<RouteProp<RootStack, "Episodes">>();
  const { id, title } = route.params;

  const [episodes, setEpisodes] = useState<Episode[]>([]);
  const [query, setQuery] = useState("");

  useEffect(() => {
    loadEpisodes(id)
      .then(setEpisodes)
      .catch(() => setEpisodes([]));
  }, [id]);

  const filtered = useMemo(() => {
    const trimmed = query.trim();
    if (!trimmed) return episodes;
    return episodes.filter(
      (episode) =>
        String(episode.number).includes(trimmed) ||
        (episode.title ?? "").toLowerCase().includes(trimmed.toLowerCase()),
    );
  }, [episodes, query]);

  return (
    <View style={styles.root}>
      <SafeAreaView edges={["top"]}>
        <View style={styles.header}>
          <Typed role="micro" color={palette.textFaint} numberOfLines={1}>
            {title}
          </Typed>
          <Typed role="title">Episodes</Typed>

          <View style={styles.field}>
            <TextInput
              value={query}
              onChangeText={setQuery}
              placeholder="Jump to episode…"
              placeholderTextColor={palette.textFaint}
              keyboardType="number-pad"
              style={styles.input}
              selectionColor={brand.start}
            />
          </View>
        </View>
      </SafeAreaView>

      <FlatList
        data={filtered}
        keyExtractor={(episode) => episode.id}
        contentContainerStyle={styles.list}
        renderItem={({ item }) => (
          <PressableScale
            onPress={() => navigation.replace("Watch", { id, episodeId: item.id })}
          >
            <View style={styles.row}>
              <View style={styles.number}>
                <Typed role="micro" color={palette.textMuted}>
                  {item.number}
                </Typed>
              </View>
              <Typed role="label" numberOfLines={1} style={{ flex: 1 }}>
                {item.title ?? `Episode ${item.number}`}
              </Typed>
              <Typed role="micro" color={palette.textFaint}>
                ▶
              </Typed>
            </View>
          </PressableScale>
        )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: palette.ink },
  header: { paddingHorizontal: space.xl, paddingTop: space.sm, gap: 4 },
  field: {
    marginTop: space.md,
    borderRadius: 999,
    backgroundColor: "rgba(255,255,255,0.06)",
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.14)",
    paddingHorizontal: space.md,
  },
  input: { color: palette.text, fontSize: 14, paddingVertical: 10 },
  list: { padding: space.xl, gap: space.sm, paddingBottom: 120 },
  row: {
    flexDirection: "row",
    alignItems: "center",
    gap: space.md,
    padding: space.sm,
    borderRadius: 14,
    backgroundColor: "rgba(255,255,255,0.04)",
  },
  number: {
    width: 34,
    height: 34,
    borderRadius: 10,
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "rgba(255,255,255,0.06)",
  },
});
