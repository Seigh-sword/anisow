/**
 * The route table, as types.
 *
 * Both navigators are typed from here so a screen cannot be navigated to with
 * the wrong parameter — `Watch` needs an id, and it also accepts a chosen
 * episode, which is the one place a typo costs a real bug rather than a warning.
 */

export type RootStack = {
  Tabs: undefined;
  Detail: { id: string };
  Watch: { id: string; episodeId?: string; offline?: boolean };
  Episodes: { id: string; title: string };
  Downloads: undefined;
};

export type TabParamList = {
  Home: undefined;
  Browse: undefined;
  Search: undefined;
  Library: undefined;
};
