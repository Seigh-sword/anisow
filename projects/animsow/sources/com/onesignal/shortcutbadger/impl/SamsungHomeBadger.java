package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import e4.InterfaceC0674a;
import e4.b;
import java.util.Arrays;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class SamsungHomeBadger implements InterfaceC0674a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f7970b = {"_id", "class"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultBadger f7971a = new DefaultBadger();

    public static ContentValues c(ComponentName componentName, int i6, boolean z5) {
        ContentValues contentValues = new ContentValues();
        if (z5) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i6));
        return contentValues;
    }

    @Override // e4.InterfaceC0674a
    public final void a(Context context, ComponentName componentName, int i6) throws b {
        DefaultBadger defaultBadger = this.f7971a;
        if (defaultBadger != null && AbstractC1305a.j(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            defaultBadger.a(context, componentName, i6);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f7970b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z5 = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, c(componentName, i6, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex("class")))) {
                        z5 = true;
                    }
                }
                if (!z5) {
                    contentResolver.insert(uri, c(componentName, i6, true));
                }
            }
            if (cursorQuery == null || cursorQuery.isClosed()) {
                return;
            }
            cursorQuery.close();
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @Override // e4.InterfaceC0674a
    public final List b() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
