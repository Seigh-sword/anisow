import { useEffect, useState } from "react";
import { ScrollView, StyleSheet, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { useNavigation } from "@react-navigation/native";
import type { NativeStackNavigationProp } from "@react-navigation/native-stack";

import { palette, space } from "@anispots/design";
import { api } from "../lib/api";
import { getDownloads, getWatchlist, totalBytes } from "../lib/storage";
import { humanBytes, resumeAll } from "../lib/downloads";
import { Typed } from "../ui/Text";
import { Glass, PressableScale } from "../ui/Glass";
import type { RootStack } from "../navigation/types";

/**
 * Settings, native.
 *
 * Mirrors the web Settings page: honest device metrics (downloaded episodes,
 * storage used on disk, watchlist count) and the upstream catalogue source.
 * No fake switches that pretend to do something.
 */
export function SettingsScreen() {
  const navigation = useNavigation<NativeStackNavigationProp<RootStack>>();
  const [stats, setStats] = useState({ downloads: 0, bytes: 0, watchlist: 0 });

  useEffect(() => {
    let cancelled = false;
    (async () => {
      const [downloads, bytes, watchlist] = await Promise.all([
        getDownloads(),
        totalBytes(),
        getWatchlist(),
      ]);
      if (cancelled) return;
      setStats({
        downloads: downloads.length,
        bytes,
        watchlist: watchlist.length,
      });
      await resumeAll();
    })();
    return () => {
      cancelled = true;
    };
  }, []);

  const rows = [
    { label: "Downloaded episodes", value: String(stats.downloads) },
    { label: "Storage used", value: humanBytes(stats.bytes) },
    { label: "Watchlist", value: String(stats.watchlist) },
  ];

  return (
    <View style={styles.root}>
      <SafeAreaView edges={["top"]}>
        <View style={styles.header}>
          <PressableScale onPress={() => navigation.goBack()} accessibilityLabel="Back">
            <Glass level="subtle" radius={999} contentStyle={styles.circle}>
              <Typed>‹</Typed>
            </Glass>
          </PressableScale>
          <Typed role="title">Settings</Typed>
        </View>
      </SafeAreaView>

      <ScrollView contentContainerStyle={styles.content}>
        <Glass level="regular" radius={20} contentStyle={styles.card}>
          <Typed role="micro" color={palette.textFaint} style={styles.sectionTitle}>
            ON THIS DEVICE
          </Typed>

          {rows.map((row, index) => (
            <View
              key={row.label}
              style={[styles.row, index < rows.length - 1 && styles.rowBorder]}
            >
              <Typed role="body" color={palette.textMuted}>
                {row.label}
              </Typed>
              <Typed role="label">{row.value}</Typed>
            </View>
          ))}
        </Glass>

        <Glass level="regular" radius={20} contentStyle={styles.card}>
          <Typed role="micro" color={palette.textFaint} style={styles.sectionTitle}>
            SOURCE
          </Typed>
          <Typed role="body" color={palette.textMuted} style={{ marginBottom: space.md }}>
            AniSpots reads the catalogue directly from the device and saves downloads to local app
            storage. No account, no tracking, no ads — nothing is stored on a server.
          </Typed>
          <View style={styles.codeBox}>
            <Typed role="micro" color={palette.textFaint}>
              {api.baseUrl}
            </Typed>
          </View>
        </Glass>

        <Typed role="micro" color={palette.textFaint} align="center" style={{ marginTop: space.xs }}>
          AniSpots · com.seigh.anispots
        </Typed>
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: palette.ink },
  header: {
    paddingHorizontal: space.xl,
    paddingTop: space.sm,
    paddingBottom: space.md,
    flexDirection: "row",
    alignItems: "center",
    gap: space.md,
  },
  circle: { width: 36, height: 36, alignItems: "center", justifyContent: "center" },
  content: {
    paddingHorizontal: space.xl,
    paddingBottom: 120,
    gap: space.md,
  },
  card: { padding: space.lg },
  sectionTitle: {
    letterSpacing: 0.8,
    marginBottom: space.sm,
  },
  row: {
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
    paddingVertical: 10,
  },
  rowBorder: {
    borderBottomWidth: StyleSheet.hairlineWidth,
    borderBottomColor: "rgba(255,255,255,0.06)",
  },
  codeBox: {
    paddingHorizontal: 10,
    paddingVertical: 8,
    borderRadius: 10,
    backgroundColor: "rgba(0,0,0,0.35)",
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.08)",
  },
});
