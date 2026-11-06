package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import e4.InterfaceC0674a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OPPOHomeBader implements InterfaceC0674a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7969a = -1;

    @Override // e4.InterfaceC0674a
    public final void a(Context context, ComponentName componentName, int i6) {
        if (this.f7969a == i6) {
            return;
        }
        this.f7969a = i6;
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i6);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // e4.InterfaceC0674a
    public final List b() {
        return Collections.singletonList("com.oppo.launcher");
    }
}
