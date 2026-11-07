import { useCallback, useEffect, useState } from "react";
import { FlatList, ScrollView, StyleSheet, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { useNavigation, useRoute, type RouteProp } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { AnimeCard, FilterParams } from "@anispots/core";
import { brand, palette, space } from "@anispots/design";
import { loadFilter, loadGenres } from "../lib/data";
import { Poster } from "../components/Poster";
import { Typed } from "../ui/Text";
import { Glass, GradientSurface, PressableScale } from "../ui/Glass";
import type { RootStack, TabParamList } from "../navigation/types";

const TYPES = [
  { value: "", label: "All Types" },
  { value: "tv", label: "TV" },
  { value: "movie", label: "Movie" },
  { value: "ova", label: "OVA" },
  { value: "ona", label: "ONA" },
  { value: "special", label: "Special" },
];

const STATUSES = [
  { value: "", label: "All Status" },
  { value: "releasing", label: "Airing" },
  { value: "completed", label: "Completed" },
  { value: "not_yet_aired", label: "Upcoming" },
];

const LANGUAGES = [
  { value: "", label: "SUB & DUB" },
  { value: "sub", label: "SUB" },
  { value: "dub", label: "DUB" },
];

const SORTS = [
  { value: "", label: "Default" },
  { value: "trending", label: "Trending" },
  { value: "updated_date", label: "Updated" },
  { value: "avg_score", label: "Top Score" },
  { value: "title_az", label: "Name A-Z" },
];

/**
 * Browse & Multi-Filter (Native).
 *
 * Matches the web Filter system: Type, Status, Language, Sort, and multi-select
 * Genres, loading default results immediately so the screen is never empty.
 */
export function BrowseScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const route = useRoute<RouteProp<TabParamList, "Browse">>();
  const [genres, setGenres] = useState<{ name: string; slug: string }[]>([]);
  const [selectedGenres, setSelectedGenres] = useState<string[]>([]);
  const [type, setType] = useState("");
  const [status, setStatus] = useState("");
  const [language, setLanguage] = useState("");
  const [sort, setSort] = useState("");
  const [showAllGenres, setShowAllGenres] = useState(false);

  const [items, setItems] = useState<AnimeCard[]>([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    loadGenres()
      .then(setGenres)
      .catch(() => setGenres([]));
  }, []);

  const runFilter = useCallback(async (params: FilterParams) => {
    setLoading(true);
    setError(null);
    try {
      setItems(await loadFilter(params));
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : String(cause));
      setItems([]);
    } finally {
      setLoading(false);
    }
  }, []);

  useEffect(() => {
    const requested = route.params?.genre;
    if (requested) {
      setSelectedGenres([requested]);
      void runFilter({ type, status, language, sort, genres: [requested] });
    } else {
      void runFilter({ type, status, language, sort, genres: selectedGenres });
    }
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [route.params?.genre]);

  const apply = () => {
    void runFilter({ type, status, language, sort, genres: selectedGenres });
  };

  const toggleGenre = (slug: string) => {
    setSelectedGenres((prev) =>
      prev.includes(slug) ? prev.filter((g) => g !== slug) : [...prev, slug],
    );
  };

  const visibleGenres = showAllGenres ? genres : genres.slice(0, 18);

  return (
    <View style={styles.root}>
      <SafeAreaView edges={["top"]}>
        <View style={styles.header}>
          <Typed role="title">Browse & Filter</Typed>
        </View>
      </SafeAreaView>

      <FlatList
        data={items}
        numColumns={3}
        keyExtractor={(card) => card.id}
        contentContainerStyle={styles.grid}
        columnWrapperStyle={{ gap: space.md }}
        ListHeaderComponent={
          <View style={{ gap: space.md, paddingBottom: space.md }}>
            <ScrollView horizontal showsHorizontalScrollIndicator={false} contentContainerStyle={{ gap: 6 }}>
              {TYPES.map((opt) => (
                <PressableScale key={`type-${opt.value}`} onPress={() => setType(opt.value)}>
                  <Glass level={type === opt.value ? "regular" : "subtle"} radius={999} contentStyle={styles.chip}>
                    <Typed role="micro" color={type === opt.value ? brand.start : palette.textMuted}>
                      {opt.label}
                    </Typed>
                  </Glass>
                </PressableScale>
              ))}
            </ScrollView>

            <ScrollView horizontal showsHorizontalScrollIndicator={false} contentContainerStyle={{ gap: 6 }}>
              {STATUSES.map((opt) => (
                <PressableScale key={`status-${opt.value}`} onPress={() => setStatus(opt.value)}>
                  <Glass level={status === opt.value ? "regular" : "subtle"} radius={999} contentStyle={styles.chip}>
                    <Typed role="micro" color={status === opt.value ? brand.start : palette.textMuted}>
                      {opt.label}
                    </Typed>
                  </Glass>
                </PressableScale>
              ))}
              {LANGUAGES.map((opt) => (
                <PressableScale key={`lang-${opt.value}`} onPress={() => setLanguage(opt.value)}>
                  <Glass level={language === opt.value ? "regular" : "subtle"} radius={999} contentStyle={styles.chip}>
                    <Typed role="micro" color={language === opt.value ? brand.start : palette.textMuted}>
                      {opt.label}
                    </Typed>
                  </Glass>
                </PressableScale>
              ))}
            </ScrollView>

            <ScrollView horizontal showsHorizontalScrollIndicator={false} contentContainerStyle={{ gap: 6 }}>
              {SORTS.map((opt) => (
                <PressableScale key={`sort-${opt.value}`} onPress={() => setSort(opt.value)}>
                  <Glass level={sort === opt.value ? "regular" : "subtle"} radius={999} contentStyle={styles.chip}>
                    <Typed role="micro" color={sort === opt.value ? brand.start : palette.textMuted}>
                      {opt.label}
                    </Typed>
                  </Glass>
                </PressableScale>
              ))}
            </ScrollView>

            <View style={styles.genreWrap}>
              {visibleGenres.map((g) => {
                const active = selectedGenres.includes(g.slug);
                return (
                  <PressableScale key={g.slug} onPress={() => toggleGenre(g.slug)}>
                    <Glass level={active ? "regular" : "subtle"} radius={8} contentStyle={styles.genreChip}>
                      <Typed role="micro" color={active ? palette.text : palette.textMuted}>
                        {g.name}
                      </Typed>
                    </Glass>
                  </PressableScale>
                );
              })}
              {genres.length > 18 && (
                <PressableScale onPress={() => setShowAllGenres((v) => !v)}>
                  <Glass level="subtle" radius={8} contentStyle={styles.genreChip}>
                    <Typed role="micro" color={brand.start}>
                      {showAllGenres ? "Less" : `+${genres.length - 18} more`}
                    </Typed>
                  </Glass>
                </PressableScale>
              )}
            </View>

            <View style={{ flexDirection: "row", gap: space.sm, alignItems: "center" }}>
              <PressableScale onPress={apply}>
                <GradientSurface style={styles.filterBtn}>
                  <Typed role="label">Filter</Typed>
                </GradientSurface>
              </PressableScale>
              {loading && (
                <Typed role="micro" color={palette.textFaint}>
                  Loading…
                </Typed>
              )}
            </View>

            {error ? (
              <Typed role="body" color={palette.danger}>
                {error}
              </Typed>
            ) : !loading && items.length === 0 ? (
              <Typed role="body" color={palette.textMuted}>
                No matching titles found.
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
  header: { paddingHorizontal: space.xl, paddingTop: space.sm, paddingBottom: space.sm },
  chip: { paddingHorizontal: 12, paddingVertical: 7 },
  genreWrap: { flexDirection: "row", flexWrap: "wrap", gap: 6 },
  genreChip: { paddingHorizontal: 10, paddingVertical: 6 },
  filterBtn: { paddingHorizontal: 22, paddingVertical: 10, borderRadius: 10 },
  grid: {
    paddingHorizontal: space.xl,
    paddingTop: space.xs,
    paddingBottom: 120,
    gap: space.lg,
  },
});
