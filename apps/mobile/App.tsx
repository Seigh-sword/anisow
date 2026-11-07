import { StatusBar } from "expo-status-bar";
import { SafeAreaProvider } from "react-native-safe-area-context";
import { View } from "react-native";

import { palette } from "@anispots/design";
import { Root } from "./src/navigation/Root";

/**
 * The app root.
 *
 * One provider, one navigator, one status bar style. The dark canvas is set here
 * as well as in the navigator theme so that the very first frame — before React
 * Navigation paints — is the app's colour rather than the platform's white.
 */
export default function App() {
  return (
    <SafeAreaProvider>
      <View style={{ flex: 1, backgroundColor: palette.ink }}>
        <StatusBar style="light" />
        <Root />
      </View>
    </SafeAreaProvider>
  );
}
