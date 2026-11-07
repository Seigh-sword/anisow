import { useState } from "react";
import { Image, StyleSheet, View } from "react-native";
import { LinearGradient } from "expo-linear-gradient";

import type { AnimeCard } from "@anispots/core";
import { poster as posterTokens, radius, space } from "@anispots/design";
import { PressableScale } from "../ui/Glass";
import { Typed } from "../ui/Text";

/**
 * A poster card, 2:3 and vertical.
 *
 * Same geometry as the web version, from the same token, so the two apps show
 * the same shelf. The gradient fade along the bottom is what lets a badge or a
 * title sit on artwork without a box behind it.
 */
export function Poster({
  anime,
  width = posterTokens.railWidth,
  onPress,
  showTitle = false,
  progress,
  fill = false,
}: {
  anime: AnimeCard;
  width?: number;
  onPress?: (anime: AnimeCard) => void;
  showTitle?: boolean;
  progress?: number;
  /** Fill the parent cell (grids) instead of using a fixed width (rails). */
  fill?: boolean;
}) {
  const [failed, setFailed] = useState(false);
  const height = fill ? undefined : Math.round(width / posterTokens.ratio);

  return (
    <PressableScale
      onPress={() => onPress?.(anime)}
      accessibilityLabel={anime.title}
      style={fill ? { width: "100%" } : { width }}
    >
      <View
        style={[
          styles.frame,
          {
            width: fill ? "100%" : width,
            height,
            aspectRatio: fill ? posterTokens.ratio : undefined,
            borderRadius: radius.md,
            backgroundColor: "#11141F",
          },
        ]}
      >
        {!failed && (
          <Image
            source={{ uri: anime.poster }}
            style={StyleSheet.absoluteFill}
            resizeMode="cover"
            onError={() => setFailed(true)}
          />
        )}

        {failed && (
          <LinearGradient
            colors={["#007BFF", "#7B3DFF", "#FF00FF"]}
            start={{ x: 0, y: 0 }}
            end={{ x: 1, y: 1 }}
            style={StyleSheet.absoluteFill}
          />
        )}

        <LinearGradient
          colors={["transparent", "rgba(4,5,10,0.88)"]}
          style={styles.fade}
          pointerEvents="none"
        />

        {anime.badge && (
          <View style={styles.badge}>
            <Typed role="micro" style={{ fontSize: 9.5 }}>
              {anime.badge}
            </Typed>
          </View>
        )}

        {typeof progress === "number" && progress > 0 && (
          <View style={styles.track} pointerEvents="none">
            <LinearGradient
              colors={["#007BFF", "#FF00FF"]}
              start={{ x: 0, y: 0 }}
              end={{ x: 1, y: 0 }}
              style={{ height: "100%", width: `${Math.min(100, progress * 100)}%` }}
            />
          </View>
        )}
      </View>

      {showTitle && (
        <Typed role="label" numberOfLines={2} style={{ marginTop: space.sm, lineHeight: 16 }}>
          {anime.title}
        </Typed>
      )}
    </PressableScale>
  );
}

const styles = StyleSheet.create({
  frame: {
    overflow: "hidden",
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.10)",
  },
  fade: {
    position: "absolute",
    left: 0,
    right: 0,
    bottom: 0,
    height: "52%",
  },
  badge: {
    position: "absolute",
    top: 6,
    left: 6,
    paddingHorizontal: 6,
    paddingVertical: 2,
    borderRadius: 999,
    backgroundColor: "rgba(6,8,14,0.75)",
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.18)",
  },
  track: {
    position: "absolute",
    left: 6,
    right: 6,
    bottom: 6,
    height: 3,
    borderRadius: 999,
    backgroundColor: "rgba(255,255,255,0.24)",
    overflow: "hidden",
  },
});
