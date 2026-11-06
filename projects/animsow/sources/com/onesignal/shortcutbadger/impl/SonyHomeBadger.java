package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import e4.InterfaceC0674a;
import f4.C0703a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SonyHomeBadger implements InterfaceC0674a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f7972a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0703a f7973b;

    @Override // e4.InterfaceC0674a
    public final void a(Context context, ComponentName componentName, int i6) {
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i6));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i6 > 0);
            context.sendBroadcast(intent);
            return;
        }
        if (i6 < 0) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i6));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        Uri uri = this.f7972a;
        if (looperMyLooper != mainLooper) {
            context.getApplicationContext().getContentResolver().insert(uri, contentValues);
            return;
        }
        if (this.f7973b == null) {
            this.f7973b = new C0703a(context.getApplicationContext().getContentResolver());
        }
        this.f7973b.startInsert(0, null, uri, contentValues);
    }

    @Override // e4.InterfaceC0674a
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
