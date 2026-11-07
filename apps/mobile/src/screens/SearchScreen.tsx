import { useEffect, useState } from "react";
import { ActivityIndicator, FlatList, StyleSheet, TextInput, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { useNavigation } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { AnimeCard } from "@anispots/core";
import { brand, palette, space } from "@anispots/design";
import { search } from "../lib/data";
import { Poster } from "../components/Poster";
import { Typed } from "../ui/Text";
import { Glass } from "../ui/Glass";
import type { RootStack } from "../navigation/types";

/**
 * Search.
 *
 * Debounced, because every keystroke going to a server-rendered search is a
 * second of latency per character on a phone. Results replace the hint text
 * rather than pushing it down, so the layout does not jump under a thumb.
 */
export function SearchScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const [text, setText] = useState("");
  const [items, setItems] = useState<AnimeCard[]>([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);
  const [touched, setTouched] = useState(false);

  useEffect(() => {
    const query = text.trim();
    if (query.length < 2) {
      setItems([]);
      setError(null);
      return;
    }

    let cancelled = false;
    setLoading(true);
    const timer = setTimeout(() => {
      search(query)
        .then((list) => {
          if (cancelled) return;
          setItems(list);
          setError(null);
          setTouched(true);
        })
        .catch((cause: unknown) => {
          if (cancelled) return;
          setError(cause instanceof Error ? cause.message : String(cause));
          setTouched(true);
        })
        .finally(() => {
          if (!cancelled) setLoading(false);
        });
    }, 320);

    return () => {
      cancelled = true;
      clearTimeout(timer);
    };
  }, [text]);

  return (
    <View style={styles.root}>
      <SafeAreaView edges={["top"]}>
        <View style={styles.header}>
          <Typed role="title">Search</Typed>

          <Glass level="regular" radius={999} contentStyle={styles.field}>
            <Typed role="label" color={palette.textFaint}>
              ⌕
            </Typed>
            <TextInput
              value={text}
              onChangeText={setText}
              placeholder="Titles, or a genre…"
              placeholderTextColor={palette.textFaint}
              style={styles.input}
              autoCorrect={false}
              autoCapitalize="none"
              returnKeyType="search"
              selectionColor={brand.start}
            />
            {loading ? <ActivityIndicator size="small" color={brand.start} /> : null}
          </Glass>
        </View>
      </SafeAreaView>

      <FlatList
        data={items}
        numColumns={3}
        keyExtractor={(card) => card.id}
        contentContainerStyle={styles.grid}
        columnWrapperStyle={{ gap: space.md }}
        keyboardShouldPersistTaps="handled"
        ListHeaderComponent={
          <View style={{ paddingBottom: space.md }}>
            {error ? (
              <Typed role="body" color={palette.danger}>
                {error}
              </Typed>
            ) : touched && items.length === 0 && !loading ? (
              <Typed role="body" color={palette.textMuted}>
                Nothing for “{text.trim()}”. Try a shorter title.
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
  header: { paddingHorizontal: space.xl, paddingTop: space.sm, paddingBottom: space.lg, gap: space.md },
  field: {
    flexDirection: "row",
    alignItems: "center",
    gap: space.sm,
    paddingHorizontal: space.md,
    paddingVertical: 4,
  },
  input: {
    flex: 1,
    color: palette.text,
    fontSize: 15,
    paddingVertical: 10,
  },
  grid: { paddingHorizontal: space.xl, paddingBottom: 120, gap: space.md },
});
