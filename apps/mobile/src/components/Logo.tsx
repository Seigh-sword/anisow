import { View } from "react-native";
import { LinearGradient } from "expo-linear-gradient";
import Svg, { Circle, Path } from "react-native-svg";

import { brand } from "@anispots/design";

/**
 * The mark.
 *
 * Same geometry as the web logo — three spots falling into a play triangle — so
 * the icon and the app are recognisably the same product.
 */
export function Logo({ size = 28 }: { size?: number }) {
  return (
    <Svg width={size} height={size} viewBox="0 0 32 32">
      <Path d="M13 7.5 27 16 13 24.5z" fill={brand.start} />
      <Circle cx="7" cy="11" r="2.6" fill={brand.start} opacity={0.9} />
      <Circle cx="6" cy="16" r="2" fill={brand.mid} opacity={0.8} />
      <Circle cx="7" cy="21" r="2.6" fill={brand.end} opacity={0.9} />
    </Svg>
  );
}

/** The same mark with the brand gradient behind it, for headers and splash. */
export function LogoBadge({ size = 40 }: { size?: number }) {
  return (
    <LinearGradient
      colors={[brand.start, brand.mid, brand.end]}
      start={{ x: 0, y: 0 }}
      end={{ x: 1, y: 1 }}
      style={{
        width: size,
        height: size,
        borderRadius: size * 0.28,
        alignItems: "center",
        justifyContent: "center",
      }}
    >
      <View style={{ transform: [{ scale: 1 }] }}>
        <Logo size={size * 0.66} />
      </View>
    </LinearGradient>
  );
}
