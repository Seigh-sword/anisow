import { NavigationContainer, DarkTheme, type Theme } from "@react-navigation/native";
import { createNativeStackNavigator } from "@react-navigation/native-stack";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { BlurView } from "expo-blur";
import { Pressable as RNPressable, StyleSheet, View } from "react-native";
import Svg, { Path } from "react-native-svg";

import { brand, palette, radius } from "@anispots/design";
import { HomeScreen } from "../screens/HomeScreen";
import { BrowseScreen } from "../screens/BrowseScreen";
import { SearchScreen } from "../screens/SearchScreen";
import { LibraryScreen } from "../screens/LibraryScreen";
import { DetailScreen } from "../screens/DetailScreen";
import { WatchScreen } from "../screens/WatchScreen";
import { EpisodesScreen } from "../screens/EpisodesScreen";
import { Typed } from "../ui/Text";
import type { RootStack, TabParamList } from "./types";

/**
 * Navigation.
 *
 * A stack over tabs, with the player as its own full-screen route: it must be
 * able to take the whole viewport, and it must not sit inside a tab that can be
 * swiped away from under it.
 *
 * The tab bar is a blurred, floating pill rather than the platform default. That
 * is the one piece of chrome the user sees on every screen, so it is where the
 * design language is most visible — and it is why the content is padded for it.
 */

const Stack = createNativeStackNavigator<RootStack>();
const Tabs = createBottomTabNavigator<TabParamList>();

const theme: Theme = {
  ...DarkTheme,
  colors: {
    ...DarkTheme.colors,
    background: palette.ink,
    card: palette.ink,
    text: palette.text,
    border: "rgba(255,255,255,0.10)",
    primary: brand.start,
  },
};

const icons: Record<keyof TabParamList, string> = {
  Home: "M3 10.5 12 3l9 7.5V21h-6v-6H9v6H3z",
  Browse: "M4 5h7v7H4zM13 5h7v7h-7zM4 14h7v7H4zM13 14h7v7h-7z",
  Search: "M10.5 4a6.5 6.5 0 1 0 0 13 6.5 6.5 0 0 0 0-13M20 20l-4.6-4.6",
  Library: "M6 3h12v18l-6-4.5L6 21z",
};

function TabBar({ state, navigation }: { state: any; navigation: any }) {
  return (
    <View style={styles.tabHost} pointerEvents="box-none">
      <BlurView intensity={70} tint="dark" style={styles.tabBar}>
        <View style={styles.tabBorder} pointerEvents="none" />
        {state.routes.map((route: { key: string; name: keyof TabParamList }, index: number) => {
          const focused = state.index === index;

          return (
            <TabButton
              key={route.key}
              focused={focused}
              label={route.name}
              d={icons[route.name]}
              onPress={() => {
                const event = navigation.emit({
                  type: "tabPress",
                  target: route.key,
                  canPreventDefault: true,
                });
                if (!focused && !event.defaultPrevented) navigation.navigate(route.name);
              }}
            />
          );
        })}
      </BlurView>
    </View>
  );
}

function TabButton({
  focused,
  label,
  d,
  onPress,
}: {
  focused: boolean;
  label: string;
  d: string;
  onPress: () => void;
}) {
  return (
    <RNPressable onPress={onPress} style={styles.tab} accessibilityRole="tab" accessibilityLabel={label}>
      <Svg width={22} height={22} viewBox="0 0 24 24" fill="none">
        <Path
          d={d}
          stroke={focused ? brand.start : palette.textFaint}
          strokeWidth={1.7}
          strokeLinecap="round"
          strokeLinejoin="round"
        />
      </Svg>
      <Typed role="micro" color={focused ? palette.text : palette.textFaint} style={{ fontSize: 10 }}>
        {label}
      </Typed>
      {focused && <View style={styles.activeRule} />}
    </RNPressable>
  );
}

function TabNavigator() {
  return (
    <Tabs.Navigator
      tabBar={(props) => <TabBar {...props} />}
      screenOptions={{ headerShown: false, sceneStyle: { backgroundColor: palette.ink } }}
    >
      <Tabs.Screen name="Home" component={HomeScreen} />
      <Tabs.Screen name="Browse" component={BrowseScreen} />
      <Tabs.Screen name="Search" component={SearchScreen} />
      <Tabs.Screen name="Library" component={LibraryScreen} />
    </Tabs.Navigator>
  );
}

export function Root() {
  return (
    <NavigationContainer theme={theme}>
      <Stack.Navigator
        screenOptions={{
          headerShown: false,
          contentStyle: { backgroundColor: palette.ink },
          animation: "slide_from_right",
        }}
      >
        <Stack.Screen name="Tabs" component={TabNavigator} />
        <Stack.Screen name="Detail" component={DetailScreen} />
        <Stack.Screen name="Episodes" component={EpisodesScreen} />
        <Stack.Screen
          name="Watch"
          component={WatchScreen}
          options={{ animation: "fade", presentation: "fullScreenModal", gestureEnabled: false }}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  tabHost: {
    position: "absolute",
    left: 0,
    right: 0,
    bottom: 0,
    paddingHorizontal: 12,
    paddingBottom: 18,
  },
  tabBar: {
    flexDirection: "row",
    alignItems: "center",
    borderRadius: 22,
    overflow: "hidden",
    paddingVertical: 8,
    backgroundColor: "rgba(10,12,20,0.62)",
    shadowColor: "#000",
    shadowOpacity: 0.6,
    shadowRadius: 24,
    shadowOffset: { width: 0, height: 10 },
  },
  tabBorder: {
    ...StyleSheet.absoluteFillObject,
    borderRadius: 22,
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: "rgba(255,255,255,0.16)",
  },
  tab: {
    flex: 1,
    alignItems: "center",
    gap: 3,
    paddingVertical: 4,
  },
  activeRule: {
    position: "absolute",
    top: -8,
    width: 18,
    height: 2,
    borderRadius: radius.pill,
    backgroundColor: brand.start,
  },
});
