package com.onesignal.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import e4.InterfaceC0674a;
import e4.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class XiaomiHomeBadger implements InterfaceC0674a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResolveInfo f7974a;

    @Override // e4.InterfaceC0674a
    public final void a(Context context, ComponentName componentName, int i6) throws b {
        Object objValueOf;
        try {
            Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i6 == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = Integer.valueOf(i6);
                } catch (Exception unused) {
                    declaredField.set(objNewInstance, Integer.valueOf(i6));
                }
            }
            declaredField.set(objNewInstance, String.valueOf(objValueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i6 == 0 ? "" : Integer.valueOf(i6)));
            if (AbstractC1305a.j(context, intent)) {
                context.sendBroadcast(intent);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            if (this.f7974a == null) {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.HOME");
                this.f7974a = context.getPackageManager().resolveActivity(intent2, 65536);
            }
            if (this.f7974a != null) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                Notification notificationBuild = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f7974a.getIconResource()).build();
                try {
                    Object obj = notificationBuild.getClass().getDeclaredField("extraNotification").get(notificationBuild);
                    obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i6));
                    notificationManager.notify(0, notificationBuild);
                } catch (Exception e6) {
                    throw new b("not able to set badge", e6);
                }
            }
        }
    }

    @Override // e4.InterfaceC0674a
    public final List b() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }
}
