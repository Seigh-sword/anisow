package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import e4.InterfaceC0674a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EverythingMeHomeBadger implements InterfaceC0674a {
    @Override // e4.InterfaceC0674a
    public final void a(Context context, ComponentName componentName, int i6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i6));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }

    @Override // e4.InterfaceC0674a
    public final List b() {
        return Arrays.asList("me.everything.launcher");
    }
}
