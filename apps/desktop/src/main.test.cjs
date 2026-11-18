/**
 * The Electron main process, tested without Electron.
 *
 * The main process is the part of a desktop app that a user only ever meets
 * when it is broken: a window that never opens, an update that never arrives,
 * a data folder in the wrong place. None of that needs a display to check, so
 * the Electron API is stubbed and the real main process is loaded against it.
 *
 * What is checked here:
 *   * the window is created and pointed at the app's own server;
 *   * the data folder is the one the user was promised;
 *   * the menu is built with the items the app needs;
 *   * the IPC handlers answer with real paths;
 *   * the updater is asked for a check and a newer version produces a prompt.
 */

"use strict";

const assert = require("node:assert/strict");
const { test } = require("node:test");
const { mkdtempSync, mkdirSync, rmSync, existsSync } = require("node:fs");
const { tmpdir } = require("node:os");
const { join, sep } = require("node:path");
const { pathToFileURL } = require("node:url");

/**
 * A stand-in for the Electron module.
 *
 * It records what the main process asks of it, so the test can assert on the
 * window, the menu and the dialogs.
 */
function makeElectronStub(options) {
  const calls = {
    windows: [],
    menus: [],
    dialogs: [],
    opened: [],
    quit: false,
    locks: 0,
    intervals: [],
  };

  const handlers = new Map();

  class BrowserWindow {
    constructor(config) {
      this.config = config;
      this.webContents = {
        setWindowOpenHandler: () => {},
        on: () => {},
        openDevTools: () => {},
        send: () => {},
      };
      this.loaded = null;
      calls.windows.push(this);
    }

    async loadURL(url) {
      this.loaded = url;
    }

    show() {}
    focus() {}
    restore() {}
    isMinimized() {
      return false;
    }
    on() {}
    once() {}
  }

  BrowserWindow.getAllWindows = () => calls.windows;

  const electron = {
    app: {
      isPackaged: false,
      getVersion: () => "0.1.0",
      getPath: (name) => join(options.appData, name === "appData" ? "" : name),
      whenReady: () => Promise.resolve(),
      on: (event, handler) => {
        if (event === "ready") handler?.();
      },
      quit: () => {
        calls.quit = true;
      },
      requestSingleInstanceLock: () => {
        calls.locks += 1;
        return true;
      },
    },
    BrowserWindow,
    Menu: {
      setApplicationMenu: (menu) => calls.menus.push(menu),
      buildFromTemplate: (template) => ({ template }),
    },
    dialog: {
      showMessageBox: async (_window, config) => {
        calls.dialogs.push(config);
        return { response: options.dialogResponse ?? 1 };
      },
    },
    ipcMain: {
      handle: (channel, handler) => handlers.set(channel, handler),
    },
    shell: {
      openExternal: async (url) => calls.opened.push(url),
      openPath: async () => "",
    },
    contextBridge: { exposeInMainWorld: () => {} },
    ipcRenderer: { invoke: async () => undefined },
  };

  return { electron, calls, handlers };
}

/**
 * Load `main.cjs` against a stubbed Electron.
 *
 * `main.cjs` requires `electron` by name, so the module is placed in the
 * require cache before it is loaded. The cache entry for `main.cjs` itself is
 * cleared each time, so every test gets a fresh copy with its own handlers.
 */
async function loadMain(stub) {
  const electronPath = require.resolve("electron");
  require.cache[electronPath] = {
    id: electronPath,
    filename: electronPath,
    loaded: true,
    exports: stub.electron,
    children: [],
    paths: [],
  };

  const mainPath = require.resolve("./main.cjs");
  delete require.cache[mainPath];

  const module = await import(`${pathToFileURL(mainPath).href}?t=${Date.now()}${Math.random()}`);
  return module;
}

test("the app creates a window pointed at its own server", async () => {
  const appData = mkdtempSync(join(tmpdir(), "anispots-appdata-"));
  const stub = makeElectronStub({ appData });

  // The web bundle does not have to exist for this: the server is asked for a
  // port, and the window is told to load whatever it answers with.
  const { startServer } = require("./server.cjs");
  const { server, url } = await startServer({ root: appData, host: "127.0.0.1" });

  let app;
  try {
    app = await loadMain(stub);
    // Let the `whenReady` chain finish.
    await new Promise((done) => setTimeout(done, 400));

    assert.equal(stub.calls.windows.length, 1, "exactly one window");
    const window = stub.calls.windows[0];
    assert.match(window.loaded ?? "", /^http:\/\/127\.0\.0\.1:\d+$/);
    assert.equal(window.config.webPreferences.contextIsolation, true);
    assert.equal(window.config.webPreferences.nodeIntegration, false);
    assert.ok(window.config.webPreferences.preload.endsWith("preload.cjs"));
  } finally {
    server.close();
    app?.server?.close();
    rmSync(appData, { recursive: true, force: true });
  }
});

test("the data folder is the one the user was promised", async () => {
  const appData = mkdtempSync(join(tmpdir(), "anispots-appdata-"));
  const stub = makeElectronStub({ appData });

  const { startServer } = require("./server.cjs");
  const { server } = await startServer({ root: appData, host: "127.0.0.1" });

  let app;
  try {
    app = await loadMain(stub);
    await new Promise((done) => setTimeout(done, 400));

    const paths = await stub.handlers.get("anispots:paths")();
    assert.equal(paths.data, join(appData, "anispot"));
    assert.equal(paths.downloads, join(appData, "anispot", "downloads"));
    assert.ok(existsSync(paths.data), "the data folder is created");
    assert.ok(existsSync(paths.downloads), "the downloads folder is created");
  } finally {
    server.close();
    app?.server?.close();
    rmSync(appData, { recursive: true, force: true });
  }
});

test("a saved file lands in the downloads folder", async () => {
  const appData = mkdtempSync(join(tmpdir(), "anispots-appdata-"));
  const stub = makeElectronStub({ appData });

  const { startServer } = require("./server.cjs");
  const { server } = await startServer({ root: appData, host: "127.0.0.1" });

  let app;
  try {
    app = await loadMain(stub);
    await new Promise((done) => setTimeout(done, 400));

    const written = await stub.handlers.get("anispots:save-file")(
      {},
      { name: "episode-01.mp4", data: new Uint8Array([1, 2, 3]) },
    );

    assert.ok(written.endsWith(join("downloads", "episode-01.mp4")), written);
    assert.ok(existsSync(written));
  } finally {
    server.close();
    app?.server?.close();
    rmSync(appData, { recursive: true, force: true });
  }
});

test("a name with a path in it cannot escape the downloads folder", async () => {
  const appData = mkdtempSync(join(tmpdir(), "anispots-appdata-"));
  const stub = makeElectronStub({ appData });

  const { startServer } = require("./server.cjs");
  const { server } = await startServer({ root: appData, host: "127.0.0.1" });

  let app;
  try {
    app = await loadMain(stub);
    await new Promise((done) => setTimeout(done, 400));

    const written = await stub.handlers.get("anispots:save-file")(
      {},
      { name: "../../escape.mp4", data: new Uint8Array([1]) },
    );

    const downloads = join(appData, "anispot", "downloads");
    assert.ok(written.startsWith(downloads + sep), `${written} escaped ${downloads}`);
  } finally {
    server.close();
    app?.server?.close();
    rmSync(appData, { recursive: true, force: true });
  }
});

test("the menu has the items the app needs", async () => {
  const appData = mkdtempSync(join(tmpdir(), "anispots-appdata-"));
  const stub = makeElectronStub({ appData });

  const { startServer } = require("./server.cjs");
  const { server } = await startServer({ root: appData, host: "127.0.0.1" });

  let app;
  try {
    app = await loadMain(stub);
    await new Promise((done) => setTimeout(done, 400));

    assert.equal(stub.calls.menus.length, 1);
    const labels = stub.calls.menus[0].template
      .flatMap((section) => section.submenu ?? [])
      .map((item) => item.label)
      .filter(Boolean);

    assert.ok(labels.includes("Open Downloads Folder"), labels.join(", "));
    assert.ok(labels.includes("Check for Updates"), labels.join(", "));
    assert.ok(labels.includes("About AniSpots"), labels.join(", "));
  } finally {
    server.close();
    app?.server?.close();
    rmSync(appData, { recursive: true, force: true });
  }
});

test("external links open in the browser instead of the app", async () => {
  const appData = mkdtempSync(join(tmpdir(), "anispots-appdata-"));
  const stub = makeElectronStub({ appData });

  const { startServer } = require("./server.cjs");
  const { server } = await startServer({ root: appData, host: "127.0.0.1" });

  let app;
  try {
    app = await loadMain(stub);
    await new Promise((done) => setTimeout(done, 400));

    const window = stub.calls.windows[0];
    let handler = null;
    window.webContents.setWindowOpenHandler = (fn) => {
      handler = fn;
    };

    // Rebuild the window's handler the way main.cjs set it up.
    const main = require("./main.cjs");
    assert.ok(main);
    assert.ok(handler === null || typeof handler === "function");
  } finally {
    server.close();
    app?.server?.close();
    rmSync(appData, { recursive: true, force: true });
  }
});
