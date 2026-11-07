import type { ReactNode } from "react";
import { Text as RNText, type StyleProp, type TextStyle } from "react-native";

import { palette, type as typeTokens } from "@anispots/design";

/**
 * Type, once.
 *
 * React Native has no `-webkit-line-clamp` and no user-agent styles, so a heading
 * written per screen drifts in size and weight immediately. These are the six
 * roles from the shared tokens, and screens use the role, not a font size.
 */

type Role = keyof typeof typeTokens;

const base: Record<Role, TextStyle> = {
  display: { fontSize: typeTokens.display.size, fontWeight: "800", letterSpacing: typeTokens.display.tracking, lineHeight: typeTokens.display.size * typeTokens.display.lineHeight },
  title: { fontSize: typeTokens.title.size, fontWeight: "700", letterSpacing: typeTokens.title.tracking, lineHeight: typeTokens.title.size * typeTokens.title.lineHeight },
  section: { fontSize: typeTokens.section.size, fontWeight: "700", letterSpacing: typeTokens.section.tracking },
  body: { fontSize: typeTokens.body.size, lineHeight: typeTokens.body.size * typeTokens.body.lineHeight },
  label: { fontSize: typeTokens.label.size, fontWeight: "600", letterSpacing: typeTokens.label.tracking },
  micro: { fontSize: typeTokens.micro.size, fontWeight: "600", letterSpacing: typeTokens.micro.tracking },
};

export function Typed({
  children,
  role = "body",
  color = palette.text,
  style,
  numberOfLines,
  align,
}: {
  children: ReactNode;
  role?: Role;
  color?: string;
  style?: StyleProp<TextStyle>;
  numberOfLines?: number;
  align?: TextStyle["textAlign"];
}) {
  return (
    <RNText
      numberOfLines={numberOfLines}
      style={[base[role], { color, textAlign: align }, style]}
      // Android clips descenders at small line heights; this keeps them.
      allowFontScaling
      maxFontSizeMultiplier={1.4}
    >
      {children}
    </RNText>
  );
}
