import { useCallback, useEffect, useState } from "react";
import { Dimensions, ImageBackground, RefreshControl, ScrollView, StyleSheet, View } from "react-native";
import { LinearGradient } from "expo-linear-gradient";
import { useNavigation } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import type { AnimeCard, HomeRails } from "@anispots/core";
import { brand, palette, space } from "@anispots/design";
import { loadHome, localRails } from "../lib/data";
import { Rail } from "../components/Rail";
import { Typed } from "../ui/Text";
import { Glass, GradientSurface, PressableScale } from "../ui/Glass";
import { Logo } from "../components/Logo";
import type { RootStack } from "../navigation/types";

/**
 * Home.
 *
 * The spotlight is a full-bleed image with the title sitting in its own gradient,
 * not a carousel the user has to swipe through to see anything. Below it, the
 * user's own shelves come first — what they were watching, what they already
 * have on disk — and only then the catalogue's rails.
 */
export function HomeScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const [data, setData] = useState<HomeRails | null>(null);
  const [mine, setMine] = useState<{ name: string; items: AnimeCard[] }[]>([]);
  const [error, setError] = useState<string | null>(null);
  const [refreshing, setRefreshing] = useState(false);

  const load = useCallback(async () => {
    setRefreshing(true);
    try {
      const [home, shelves] = await Promise.all([loadHome(), localRails()]);
      setData(home);
      setMine(shelves);
      setError(null);
    } catch (cause) {
      setError(cause instanceof Error ? cause.message : String(cause));
    } finally {
      setRefreshing(false);
    }
  }, []);

  useEffect(() => {
    void load();
  }, [load]);

  const open = (anime: AnimeCard) => navigation.navigate("Detail", { id: anime.id });
  const hero = data?.spotlight[0];
  const width = Dimensions.get("window").width;

  return (
    <ScrollView
      style={styles.root}
      contentContainerStyle={{ paddingBottom: 120 }}
      refreshControl={
        <RefreshControl refreshing={refreshing} onRefresh={load} tintColor={brand.start} />
      }
    >
      {hero ? (
        <ImageBackground
          source={{ uri: hero.poster }}
          style={[styles.hero, { minHeight: Math.max(340, Math.round(width * 0.95)) }]}
          resizeMode="cover"
        >
          <LinearGradient
            colors={["rgba(7,8,14,0.15)", "rgba(7,8,14,0.72)", palette.ink]}
            locations={[0, 0.55, 1]}
            style={StyleSheet.absoluteFill}
          />
          <LinearGradient
            colors={["rgba(0,123,255,0.30)", "transparent"]}
            start={{ x: 0, y: 0 }}
            end={{ x: 1, y: 0 }}
            style={StyleSheet.absoluteFill}
          />

          <View style={styles.heroBody}>
            <View style={styles.brandRow}>
              <Logo size={22} />
              <Typed role="micro" color={brand.start} style={{ letterSpacing: 2 }}>
                ANISPOTS
              </Typed>
            </View>

            <Typed role="display" numberOfLines={3} style={{ marginTop: space.md }}>
              {hero.title}
            </Typed>

            {hero.description ? (
              <Typed
                role="body"
                color={palette.textMuted}
                numberOfLines={3}
                style={{ marginTop: space.md, maxWidth: "94%" }}
              >
                {hero.description}
              </Typed>
            ) : null}

            <View style={{ flexDirection: "row", gap: space.md, marginTop: space.lg }}>
              <PressableScale onPress={() => navigation.navigate("Watch", { id: hero.id })}>
                <GradientSurface style={styles.playButton}>
                  <Typed role="label" style={{ fontSize: 14 }}>
                    ▶  Watch now
                  </Typed>
                </GradientSurface>
              </PressableScale>

              <PressableScale onPress={() => open(hero)}>
                <Glass level="regular" radius={999} contentStyle={styles.ghostButton}>
                  <Typed role="label" style={{ fontSize: 14 }}>
                    Details
                  </Typed>
                </Glass>
              </PressableScale>
            </View>
          </View>
        </ImageBackground>
      ) : (
        <View style={{ height: 220, justifyContent: "flex-end", padding: space.xl }}>
          <Typed role="title">{error ? "Could not reach the catalogue" : "Loading…"}</Typed>
          {error ? (
            <Typed role="body" color={palette.textMuted} style={{ marginTop: space.sm }}>
              {error}
            </Typed>
          ) : null}
        </View>
      )}

      {mine.map((rail) => (
        <Rail key={rail.name} title={rail.name} items={rail.items} onOpen={open} />
      ))}

      {data?.rails.map((rail) => (
        <Rail key={rail.name} title={rail.name} items={rail.items} onOpen={open} />
      ))}

      {!data && !error ? (
        <View style={{ gap: space.xxl }}>
          {Array.from({ length: 3 }).map((_, index) => (
            <Rail key={index} title=" " items={[]} loading onOpen={open} />
          ))}
        </View>
      ) : null}
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: palette.ink },
  hero: {
    justifyContent: "flex-end",
    paddingTop: 64,
  },
  heroBody: {
    paddingHorizontal: space.xl,
    paddingBottom: space.xl,
  },
  brandRow: { flexDirection: "row", alignItems: "center", gap: space.sm },
  playButton: {
    paddingHorizontal: space.xl,
    paddingVertical: space.md,
    alignItems: "center",
    justifyContent: "center",
  },
  ghostButton: { paddingHorizontal: space.lg, paddingVertical: space.md },
});
