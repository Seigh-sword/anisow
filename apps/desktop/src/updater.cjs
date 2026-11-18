/**
 * The updater.
 *
 * `electron-updater` reads the GitHub release feed for this repository and
 * installs a newer build when there is one. Two rules govern how it behaves:
 *
 *   * nothing is downloaded until the user has been told about it;
 *   * nothing is installed until the app is closed, or the user says so now.
 *
 * The logic lives here rather than in `main.cjs` so it can be tested without
 * a window, and so the update rules are in one readable place.
 */

"use strict";

/**
 * Ask the user whether to install an available update.
 *
 * @param {object} options
 * @param {import("electron").Dialog} options.dialog
 * @param {import("electron").BrowserWindow | undefined} options.window
 * @param {import("electron-log") | undefined} options.logger
 * @returns {Promise<"install" | "later" | "unavailable">}
 */
async function promptForUpdate(options) {
  const { dialog, window } = options;

  const { response } = await dialog.showMessageBox(window ?? undefined, {
    type: "info",
    title: "An update is ready",
    message: `AniSpots ${options.version} is available.`,
    detail: "It will be installed the next time you close the app.",
    buttons: ["Install now", "Later"],
    defaultId: 1,
    cancelId: 1,
  });

  return response === 0 ? "install" : "later";
}

/**
 * Wire an updater up to the app.
 *
 * @param {object} options
 * @param {import("electron").autoUpdater} options.updater
 * @param {import("electron").Dialog} options.dialog
 * @param {import("electron").BrowserWindow | undefined} options.window
 * @param {boolean} options.manual  Whether the user asked for the check.
 * @returns {Promise<"installed" | "later" | "current" | "failed" | "skipped">}
 */
async function runUpdateCheck(options) {
  const { updater, dialog, window, manual = false } = options;

  updater.autoDownload = false;
  updater.autoInstallOnAppQuit = true;

  return new Promise((resolve) => {
    let settled = false;

    const finish = (result) => {
      if (settled) return;
      settled = true;
      resolve(result);
    };

    updater.on("update-available", async (info) => {
      const answer = await promptForUpdate({ ...options, version: info?.version ?? "a new version" });
      if (answer === "install") {
        updater.quitAndInstall(false, true);
        finish("installed");
        return;
      }
      finish("later");
    });

    updater.on("update-not-available", () => {
      if (manual) {
        void dialog.showMessageBox(window ?? undefined, {
          type: "info",
          title: "AniSpots",
          message: "AniSpots is up to date.",
          buttons: ["OK"],
        });
      }
      finish("current");
    });

    updater.on("error", (error) => {
      console.error("update check failed:", error);
      if (manual) {
        void dialog.showMessageBox(window ?? undefined, {
          type: "error",
          title: "AniSpots",
          message: "The update check failed.",
          detail: error instanceof Error ? error.message : String(error),
          buttons: ["OK"],
        });
      }
      finish("failed");
    });

    updater.checkForUpdates().catch((error) => {
      console.error("update check failed:", error);
      finish("failed");
    });
  });
}

module.exports = { runUpdateCheck, promptForUpdate };
