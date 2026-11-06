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
public class AdwHomeBadger implements InterfaceC0674a {
    @Override // e4.InterfaceC0674a
    public final void a(Context context, ComponentName componentName, int i6) throws b {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i6);
        if (AbstractC1305a.j(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new b("unable to resolve intent: " + intent.toString());
        }
    }

    @Override // e4.InterfaceC0674a
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
