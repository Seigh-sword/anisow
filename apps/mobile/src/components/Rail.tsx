import { FlatList, StyleSheet, View } from "react-native";

import type { AnimeCard } from "@anispots/core";
import { brand, poster as posterTokens, space } from "@anispots/design";
import { Poster } from "./Poster";
import { Typed } from "../ui/Text";

/**
 * A horizontal shelf.
 *
 * `FlatList` rather than a `ScrollView` with a map: a poster wall is exactly the
 * case virtualisation exists for, and on Android a 200-card row inside a
 * ScrollView is a frozen main thread.
 */
export function Rail({
  title,
  items,
  onOpen,
  progressFor,
  loading,
}: {
  title: string;
  items: AnimeCard[];
  onOpen: (anime: AnimeCard) => void;
  progressFor?: (anime: AnimeCard) => number | undefined;
  loading?: boolean;
}) {
  return (
    <View style={{ marginBottom: space.xxl }}>
      <View style={styles.header}>
        <Typed role="section">{title}</Typed>
        <View style={styles.rule} />
      </View>

      {loading ? (
        <View style={styles.skeletons}>
          {Array.from({ length: 4 }).map((_, index) => (
            <View
              key={index}
              style={{
                width: posterTokens.railWidth,
                height: posterTokens.railHeight,
                borderRadius: 14,
                backgroundColor: "rgba(255,255,255,0.05)",
              }}
            />
          ))}
        </View>
      ) : (
        <FlatList
          horizontal
          data={items}
          keyExtractor={(item) => item.id}
          showsHorizontalScrollIndicator={false}
          contentContainerStyle={styles.list}
          ItemSeparatorComponent={() => <View style={{ width: space.md }} />}
          renderItem={({ item }) => (
            <Poster anime={item} onPress={onOpen} progress={progressFor?.(item)} />
          )}
        />
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  header: {
    flexDirection: "row",
    alignItems: "center",
    gap: space.md,
    paddingHorizontal: space.xl,
    marginBottom: space.md,
  },
  rule: {
    flex: 1,
    height: 1,
    backgroundColor: brand.start,
    opacity: 0.18,
  },
  list: {
    paddingHorizontal: space.xl,
  },
  skeletons: {
    flexDirection: "row",
    gap: space.md,
    paddingHorizontal: space.xl,
  },
});
