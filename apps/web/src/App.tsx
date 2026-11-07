import { Route, Routes } from "react-router-dom";
import { Shell } from "./components/Shell";
import { Home } from "./pages/Home";
import { Search } from "./pages/Search";
import { Browse } from "./pages/Browse";
import { Detail } from "./pages/Detail";
import { Watch } from "./pages/Watch";
import { Downloads } from "./pages/Downloads";
import { Watchlist } from "./pages/Watchlist";
import { Settings } from "./pages/Settings";
import { NotFound } from "./pages/NotFound";

/**
 * The route table.
 *
 * The player is its own route rather than a modal: it gets a URL that can be
 * reloaded, shared and resumed, and it can take over the screen without any
 * "close this overlay" bookkeeping in the pages underneath.
 */
export function App() {
  return (
    <Routes>
      {/* The player owns the whole viewport: no shell, no nav over the video. */}
      <Route path="/watch/:id" element={<Watch />} />

      <Route
        path="*"
        element={
          <Shell>
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/search" element={<Search />} />
              <Route path="/browse" element={<Browse />} />
              <Route path="/browse/:category" element={<Browse />} />
              <Route path="/anime/:id" element={<Detail />} />
              <Route path="/downloads" element={<Downloads />} />
              <Route path="/watchlist" element={<Watchlist />} />
              <Route path="/settings" element={<Settings />} />
              <Route path="*" element={<NotFound />} />
            </Routes>
          </Shell>
        }
      />
    </Routes>
  );
}
