import { registerRootComponent } from "expo";
import App from "./App";

// Expo's entry point. Kept as `.js` because Metro resolves the app component
// before TypeScript runs, and `registerRootComponent` is the one thing that must
// never be behind a transform.
registerRootComponent(App);
