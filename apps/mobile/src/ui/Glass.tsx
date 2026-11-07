import type { ReactNode } from "react";
import { Pressable, StyleSheet, View, type StyleProp, type ViewStyle } from "react-native";
import { BlurView } from "expo-blur";
import { LinearGradient } from "expo-linear-gradient";

import { brandGradientStops, glass as glassTokens, radius } from "@anispots/design";

/**
 * Glass, on native.
 *
 * The web version composites four layers in CSS; here each one is a view:
 *
 *   1. `BlurView` with a tint and an intensity from the shared token;
 *   2. a translucent fill on top of it, because iOS and Android blur differently
 *      and the fill is what makes the two platforms look like one app;
 *   3. a hairline border, which RN cannot gradient-fill, so `lit` adds a gradient
 *      overlay clipped by the border radius instead of fake-ing a coloured edge;
 *   4. a shadow, supplied by the consumer where it matters (Android ignores
 *      most of them without elevation).
 *
 * `overflow: hidden` on the container is load-bearing: without it the blurred
 * layer ignores the radius on Android and paints square corners.
 */

export type GlassLevel = keyof typeof glassTokens;

export function Glass({
  children,
  level = "regular",
  lit = false,
  style,
  contentStyle,
  radius: cornerRadius = radius.lg,
}: {
  children?: ReactNode;
  level?: GlassLevel;
  lit?: boolean;
  style?: StyleProp<ViewStyle>;
  contentStyle?: StyleProp<ViewStyle>;
  radius?: number;
}) {
  const token = glassTokens[level];

  return (
    <View
      style={[
        styles.shell,
        { borderRadius: cornerRadius, shadowColor: "#000", shadowOpacity: 0.45, shadowRadius: 22, shadowOffset: { width: 0, height: 12 } },
        style,
      ]}
    >
      <BlurView
        intensity={token.blurPx * 2.2}
        tint="dark"
        style={[StyleSheet.absoluteFill, { borderRadius: cornerRadius }]}
      />
      <View
        style={[
          StyleSheet.absoluteFill,
          { borderRadius: cornerRadius, backgroundColor: token.fill },
        ]}
      />
      {lit && (
        <LinearGradient
          colors={["rgba(0,123,255,0.85)", "rgba(123,61,255,0.25)", "rgba(255,0,255,0.85)"]}
          start={{ x: 0, y: 0 }}
          end={{ x: 1, y: 1 }}
          style={[StyleSheet.absoluteFill, { borderRadius: cornerRadius, opacity: 0.55 }]}
          pointerEvents="none"
        >
          {/* Punch the middle out: that leaves a hairline of gradient. */}
          <View
            style={{
              position: "absolute",
              left: 1,
              right: 1,
              top: 1,
              bottom: 1,
              borderRadius: cornerRadius - 1,
              backgroundColor: "rgba(7,8,14,0)" ,
            }}
          />
        </LinearGradient>
      )}

      <View
        style={[
          styles.border,
          { borderRadius: cornerRadius, borderColor: token.stroke },
        ]}
        pointerEvents="none"
      />
      <View style={[{ flexGrow: 0 }, contentStyle]}>{children}</View>
    </View>
  );
}

/**
 * The brand gradient as a surface.
 *
 * Separate from `Glass` because a gradient fill is opaque by design: it is for
 * the one primary action on a screen, never for a panel.
 */
export function GradientSurface({
  children,
  style,
  radius: cornerRadius = radius.pill,
  angle = "diagonal",
}: {
  children?: ReactNode;
  style?: StyleProp<ViewStyle>;
  radius?: number;
  angle?: "diagonal" | "horizontal";
}) {
  return (
    <LinearGradient
      colors={brandGradientStops.map((stop) => stop.color) as [string, string, ...string[]]}
      locations={[0, 0.52, 1]}
      start={{ x: 0, y: 0 }}
      end={angle === "diagonal" ? { x: 1, y: 1 } : { x: 1, y: 0 }}
      style={[{ borderRadius: cornerRadius }, style]}
    >
      {children}
    </LinearGradient>
  );
}

/** A pressable surface that shrinks slightly: the native half of `.pressable`. */
export function PressableScale({
  children,
  onPress,
  disabled,
  style,
  accessibilityLabel,
  hitSlop = 6,
}: {
  children: ReactNode;
  onPress?: () => void;
  disabled?: boolean;
  style?: StyleProp<ViewStyle>;
  accessibilityLabel?: string;
  hitSlop?: number;
}) {
  return (
    <Pressable
      onPress={onPress}
      disabled={disabled}
      accessibilityRole="button"
      accessibilityLabel={accessibilityLabel}
      hitSlop={hitSlop}
      style={({ pressed }) => [
        { transform: [{ scale: pressed ? 0.965 : 1 }], opacity: disabled ? 0.45 : 1 },
        style,
      ]}
    >
      {children}
    </Pressable>
  );
}

const styles = StyleSheet.create({
  shell: {
    overflow: "hidden",
    backgroundColor: "transparent",
  },
  border: {
    position: "absolute",
    left: 0,
    right: 0,
    top: 0,
    bottom: 0,
    borderWidth: 1,
  },
});
