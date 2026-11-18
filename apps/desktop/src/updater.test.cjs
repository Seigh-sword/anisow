/**
 * The updater.
 *
 * Two things matter and are easy to get wrong:
 *
 *   * nothing is downloaded before the user is asked — an app that silently
 *     pulls a hundred megabytes is an app people uninstall;
 *   * a check that fails does not take the app down with it.
 */

"use strict";

const assert = require("node:assert/strict");
const { test } = require("node:test");

const { runUpdateCheck, promptForUpdate } = require("./updater.cjs");

/** A stand-in for `electron-updater`. */
function makeUpdater() {
  const listeners = new Map();
  let installed = false;

  return {
    autoDownload: true,
    autoInstallOnAppQuit: false,
    get installed() {
      return installed;
    },
    on(event, handler) {
      listeners.set(event, handler);
    },
    emit(event, payload) {
      listeners.get(event)?.(payload);
    },
    checkForUpdates() {
      return Promise.resolve();
    },
    quitAndInstall() {
      installed = true;
    },
  };
}

/** A stand-in for `dialog`. */
function makeDialog(response = 1) {
  const shown = [];
  return {
    shown,
    async showMessageBox(_window, config) {
      shown.push(config);
      return { response };
    },
  };
}

test("nothing is downloaded before the user is asked", async () => {
  const updater = makeUpdater();
  const dialog = makeDialog(1);

  const check = runUpdateCheck({ updater, dialog, window: undefined });
  await new Promise((done) => setTimeout(done, 10));

  assert.equal(updater.autoDownload, false, "the download must be off");
  assert.equal(updater.autoInstallOnAppQuit, true);

  updater.emit("update-available", { version: "9.9.9" });
  const result = await check;

  assert.equal(result, "later");
  assert.equal(dialog.shown.length, 1);
  assert.match(dialog.shown[0].message, /9\.9\.9/);
  assert.equal(updater.installed, false);
});

test("choosing 'Install now' installs the update", async () => {
  const updater = makeUpdater();
  const dialog = makeDialog(0);

  const check = runUpdateCheck({ updater, dialog, window: undefined });
  await new Promise((done) => setTimeout(done, 10));

  updater.emit("update-available", { version: "9.9.9" });
  const result = await check;

  assert.equal(result, "installed");
  assert.equal(updater.installed, true);
});

test("an up-to-date app says so when the user asked", async () => {
  const updater = makeUpdater();
  const dialog = makeDialog();

  const check = runUpdateCheck({ updater, dialog, window: undefined, manual: true });
  await new Promise((done) => setTimeout(done, 10));

  updater.emit("update-not-available");
  const result = await check;

  assert.equal(result, "current");
  assert.equal(dialog.shown.length, 1);
  assert.match(dialog.shown[0].message, /up to date/i);
});

test("a silent check does not interrupt the user", async () => {
  const updater = makeUpdater();
  const dialog = makeDialog();

  const check = runUpdateCheck({ updater, dialog, window: undefined, manual: false });
  await new Promise((done) => setTimeout(done, 10));

  updater.emit("update-not-available");
  await check;

  assert.equal(dialog.shown.length, 0, "no dialog for a background check");
});

test("a failing check reports itself and does not throw", async () => {
  const updater = makeUpdater();
  const dialog = makeDialog();

  const check = runUpdateCheck({ updater, dialog, window: undefined, manual: true });
  await new Promise((done) => setTimeout(done, 10));

  updater.emit("error", new Error("the feed is unreachable"));
  const result = await check;

  assert.equal(result, "failed");
  assert.equal(dialog.shown.length, 1);
  assert.match(dialog.shown[0].message, /failed/i);
});

test("a check that throws is caught", async () => {
  const updater = makeUpdater();
  updater.checkForUpdates = () => Promise.reject(new Error("no network"));

  const result = await runUpdateCheck({ updater, dialog: makeDialog(), window: undefined });

  assert.equal(result, "failed");
});

test("the prompt offers a way out", async () => {
  const dialog = makeDialog(1);
  const answer = await promptForUpdate({ dialog, window: undefined, version: "2.0.0" });

  assert.equal(answer, "later");
  assert.deepEqual(dialog.shown[0].buttons, ["Install now", "Later"]);
  assert.equal(dialog.shown[0].cancelId, 1, "the safe answer is the default");
});
