package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import e4.InterfaceC0674a;
import e4.b;
import java.util.Arrays;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class NewHtcHomeBadger implements InterfaceC0674a {
    @Override // e4.InterfaceC0674a
    public final void a(Context context, ComponentName componentName, int i6) throws b {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i6);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i6);
        if (AbstractC1305a.j(context, intent) || AbstractC1305a.j(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
        } else {
            throw new b("unable to resolve intent: " + intent2.toString());
        }
    }

    @Override // e4.InterfaceC0674a
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
