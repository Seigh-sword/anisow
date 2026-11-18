/**
 * The bridge between the page and the desktop.
 *
 * The renderer is a web page; it has no business knowing about folders on
 * disk. It is given exactly three things:
 *
 *   `anispots.desktop`  — that this is the desktop build;
 *   `anispots.paths()`  — where the data and downloads live;
 *   `anispots.saveFile(name, data)` — write a file into the downloads folder.
 *
 * Context isolation is on, and nothing else from Node is exposed.
 */

"use strict";

const { contextBridge, ipcRenderer } = require("electron");

contextBridge.exposeInMainWorld("anispots", {
  desktop: true,

  /** The folders the app uses on this machine. */
  paths: () => ipcRenderer.invoke("anispots:paths"),

  /** Write a file into the downloads folder and return its path. */
  saveFile: (name, data) => ipcRenderer.invoke("anispots:save-file", { name, data }),
});
