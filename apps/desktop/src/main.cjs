/**
 * The desktop shell.
 *
 * A window, the app's own web server, and an updater. Everything else — the
 * catalogue, the file hosts, the Jikan API — is reached through the local
 * server, so the renderer is same-origin and no CORS ever comes up.
 *
 * The app keeps its data in one folder:
 *
 *   Windows   %APPDATA%\anispot
 *   macOS     ~/Library/Application Support/anispot
 *   Linux     ~/.config/anispot
 *
 * That folder holds the program data, the downloads and the update cache. It
 * is created on first run.
 */

"use strict";

const { app, BrowserWindow, dialog, ipcMain, Menu, shell } = require("electron");
const { join, dirname, resolve } = require("node:path");
const { existsSync, mkdirSync } = require("node:fs");
const { startServer } = require("./server.cjs");

const isDev = process.argv.includes("--dev");

/** Where the built SPA lives inside the packaged app. */
function webRoot() {
  if (app.isPackaged) {
    // electron-builder puts `extraResources` next to the app's resources.
    return join(process.resourcesPath, "web");
  }
  return resolve(__dirname, "..", "..", "web", "dist");
}

/**
 * The app's data folder.
 *
 * Electron's own `userData` is used, but with a name of our choosing so the
 * path is stable and obvious: `anispot` on every platform.
 */
function dataDir() {
  return join(app.getPath("appData"), "anispot");
}

/** Where downloaded episodes are written. */
function downloadsDir() {
  return join(dataDir(), "downloads");
}

function ensureDirs() {
  for (const dir of [dataDir(), downloadsDir()]) {
    if (!existsSync(dir)) mkdirSync(dir, { recursive: true });
  }
}

let mainWindow = null;
let serverUrl = "";
let serverHandle = null;

/** The one window the app has. */
function createWindow() {
  mainWindow = new BrowserWindow({
    width: 1280,
    height: 860,
    minWidth: 420,
    minHeight: 620,
    backgroundColor: "#07080E",
    title: "AniSpots",
    show: false,
    autoHideMenuBar: false,
    webPreferences: {
      preload: join(__dirname, "preload.cjs"),
      contextIsolation: true,
      nodeIntegration: false,
      sandbox: false,
      spellcheck: false,
    },
  });

  // A desktop app should feel like one: no tab bar, no address bar, no
  // "save page as" — but external links still open in the real browser.
  mainWindow.webContents.setWindowOpenHandler(({ url }) => {
    if (/^https?:/i.test(url)) void shell.openExternal(url);
    return { action: "deny" };
  });

  mainWindow.webContents.on("will-navigate", (event, url) => {
    const target = new URL(url);
    if (target.hostname !== "127.0.0.1" && target.hostname !== "localhost") {
      event.preventDefault();
      void shell.openExternal(url);
    }
  });

  mainWindow.once("ready-to-show", () => {
    mainWindow?.show();
    if (isDev) mainWindow?.webContents.openDevTools({ mode: "detach" });
  });

  mainWindow.on("closed", () => {
    mainWindow = null;
  });

  if (serverUrl) void mainWindow.loadURL(serverUrl);
}

/** The application menu, with the usual places for things to live. */
function buildMenu() {
  const template = [
    ...(process.platform === "darwin" ? [{ role: "appMenu" }] : []),
    {
      label: "File",
      submenu: [
        {
          label: "Open Downloads Folder",
          click: () => void shell.openPath(downloadsDir()),
        },
        { type: "separator" },
        isDev ? { role: "reload" } : { role: "reload", label: "Reload" },
        { role: "toggleDevTools" },
        { type: "separator" },
        { role: "quit" },
      ],
    },
    { role: "editMenu" },
    {
      label: "View",
      submenu: [
        { role: "reload" },
        { role: "toggleDevTools" },
        { type: "separator" },
        { role: "resetZoom" },
        { role: "zoomIn" },
        { role: "zoomOut" },
        { type: "separator" },
        { role: "togglefullscreen" },
      ],
    },
    { role: "windowMenu" },
    {
      role: "help",
      submenu: [
        {
          label: "Check for Updates",
          click: () => void checkForUpdates(true),
        },
        {
          label: "About AniSpots",
          click: () => {
            dialog.showMessageBox(mainWindow ?? undefined, {
              type: "info",
              title: "AniSpots",
              message: `AniSpots ${app.getVersion()}`,
              detail: `Electron ${process.versions.electron} · Chromium ${process.versions.chrome}\n\nData folder:\n${dataDir()}`,
              buttons: ["OK"],
            });
          },
        },
      ],
    },
  ];

  Menu.setApplicationMenu(Menu.buildFromTemplate(template));
}

/* --------------------------------------------------------------- updater */

/**
 * The updater.
 *
 * `electron-updater` reads the GitHub release feed for this repository. The
 * check runs on a timer and on demand from the Help menu; when a newer
 * version exists the user is asked before anything is replaced, because
 * restarting an app mid-episode is rude.
 *
 * The rules themselves live in `updater.cjs`, which is testable on its own.
 */
async function checkForUpdates(manual = false) {
  let updater;
  try {
    // Required lazily so the app still starts if the dependency is missing.
    ({ autoUpdater: updater } = require("electron-updater"));
  } catch {
    if (manual) {
      dialog.showMessageBox(mainWindow ?? undefined, {
        type: "error",
        title: "AniSpots",
        message: "Updates are not available in this build.",
        buttons: ["OK"],
      });
    }
    return;
  }

  if (!app.isPackaged) {
    // An unpackaged run has no installed app to replace.
    if (manual) {
      dialog.showMessageBox(mainWindow ?? undefined, {
        type: "info",
        title: "AniSpots",
        message: "Updates apply to installed builds only.",
        buttons: ["OK"],
      });
    }
    return;
  }

  const { runUpdateCheck } = require("./updater.cjs");
  await runUpdateCheck({
    updater,
    dialog,
    window: mainWindow,
    manual,
  });
}

/* ------------------------------------------------------------------- ipc */

ipcMain.handle("anispots:paths", () => ({
  data: dataDir(),
  downloads: downloadsDir(),
  version: app.getVersion(),
  platform: process.platform,
}));

ipcMain.handle("anispots:save-file", async (_event, { name, data }) => {
  const target = join(downloadsDir(), String(name ?? "download.mp4").replace(/[/\\]/g, "_"));
  const { writeFile } = require("node:fs/promises");
  await writeFile(target, Buffer.from(data));
  return target;
});

/* ------------------------------------------------------------------ boot */

// One instance only: a second launch focuses the window that is already open.
if (!app.requestSingleInstanceLock()) {
  app.quit();
} else {
  app.on("second-instance", () => {
    if (mainWindow) {
      if (mainWindow.isMinimized()) mainWindow.restore();
      mainWindow.focus();
    }
  });

  app.whenReady().then(async () => {
    ensureDirs();
    buildMenu();

    const { url, server } = await startServer({
      root: webRoot(),
      catalogue: process.env.ANI_BASE,
      anikoto: process.env.ANIKOTO_BASE,
      zoko: process.env.ZOKO_BASE,
      mal: process.env.MAL_BASE,
      host: "127.0.0.1",
      port: 0,
    });

    serverUrl = url;
    serverHandle = server;
    // The window keeps the app alive, not the server.
    server.unref?.();
    createWindow();

    // The updater checks every six hours.
    const timer = setInterval(() => void checkForUpdates(false), 6 * 60 * 60 * 1000);
    // The timer should not be the reason the process stays alive.
    timer.unref?.();
    setTimeout(() => void checkForUpdates(false), 15_000).unref?.();

    app.on("activate", () => {
      if (BrowserWindow.getAllWindows().length === 0) createWindow();
    });
  });

  app.on("window-all-closed", () => {
    if (process.platform !== "darwin") app.quit();
  });

  app.on("will-quit", () => {
    serverHandle?.close();
  });
}

/**
 * The running app, for tests.
 *
 * The main process is a script, not a library, so the pieces a test needs —
 * the data folder, the server, the window — are exported at the end.
 */
module.exports = {
  dataDir,
  downloadsDir,
  webRoot,
  get server() {
    return serverHandle;
  },
  get url() {
    return serverUrl;
  },
  get window() {
    return mainWindow;
  },
  checkForUpdates,
};
