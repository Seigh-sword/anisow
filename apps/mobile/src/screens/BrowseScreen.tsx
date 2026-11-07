import { useCallback, useEffect, useState } from "react";
import { FlatList, StyleSheet, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { useNavigation } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { AnimeCard } from "@anispots/core";
import { palette, space } from "@anispots/design";
import { loadBrowse, loadGenres } from "../lib/data";
import { Poster } from "../components/Poster";
import { Typed } from "../ui/Text";
import { Glass, PressableScale } from "../ui/Glass";
import type { RootStack } from "../navigation/types";

/**
 * Browse.
 *
 * The genre row is the site's own list, so a genre it adds appears without an
 * app update. Selecting one loads the filtered shelf; the header stays put so
 * switching genres never loses the user's place.
 */
export function BrowseScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const [genres, setGenres] = useState<{ name: string; slug: string }[]>([]);
  const [active, setActive] = useState<string | null>(null);
  const [items, setItems] = useState<AnimeCard[]>([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    loadGenres()
      .then(setGenres)
      .catch(() => setGenres([]));
  }, []);

  const load = useCallback(async (slug: string) => {
    setLoading(true);
    setError(null);
    try {
      setItems(await loadBrowse(slug));
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : String(cause));
      setItems([]);
    } finally {
      setLoading(false);
    }
  }, []);

  return (
    <View style={styles.root}>
      <SafeAreaView edges={["top"]}>
        <View style={styles.header}>
          <Typed role="title">Browse</Typed>
        </View>

        <FlatList
          horizontal
          data={genres}
          keyExtractor={(genre) => genre.slug}
          showsHorizontalScrollIndicator={false}
          contentContainerStyle={{ paddingHorizontal: space.xl, gap: space.sm }}
          renderItem={({ item }) => {
            const selected = item.slug === active;
            return (
              <PressableScale
                onPress={() => {
                  const next = selected ? null : item.slug;
                  setActive(next);
                  if (next) void load(next);
                  else setItems([]);
                }}
              >
                <Glass level={selected ? "regular" : "subtle"} radius={999} contentStyle={styles.chip}>
                  <Typed role="label" color={selected ? palette.text : palette.textMuted}>
                    {item.name}
                  </Typed>
                </Glass>
              </PressableScale>
            );
          }}
        />
      </SafeAreaView>

      <FlatList
        data={items}
        numColumns={3}
        keyExtractor={(card) => card.id}
        contentContainerStyle={styles.grid}
        columnWrapperStyle={{ gap: space.md }}
        ListHeaderComponent={
          <View style={{ paddingBottom: space.md }}>
            {error ? (
              <Typed role="body" color={palette.danger}>
                {error}
              </Typed>
            ) : loading ? (
              <Typed role="micro" color={palette.textFaint}>
                Loading…
              </Typed>
            ) : !active ? (
              <Typed role="body" color={palette.textMuted}>
                Pick a genre to see what is in it.
              </Typed>
            ) : items.length === 0 ? (
              <Typed role="body" color={palette.textMuted}>
                Nothing here yet.
              </Typed>
            ) : null}
          </View>
        }
        renderItem={({ item }) => (
          <View style={{ flex: 1, maxWidth: "33.33%" }}>
            <Poster
              anime={item}
              fill
              showTitle
              onPress={() => navigation.navigate("Detail", { id: item.id })}
            />
          </View>
        )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: palette.ink },
  header: { paddingHorizontal: space.xl, paddingTop: space.sm, paddingBottom: space.lg },
  chip: { paddingHorizontal: space.md, paddingVertical: 7 },
  grid: { paddingHorizontal: space.xl, paddingBottom: 120, gap: space.md },
});
