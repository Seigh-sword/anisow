package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0 f7506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7508c = true;

    public D0(Context context, B0 b02, JSONObject jSONObject, boolean z5, Long l5) {
        this.f7507b = z5;
        I0 i02 = new I0(context);
        i02.f7584c = jSONObject;
        i02.f7587f = l5;
        i02.f7585d = z5;
        i02.b(b02);
        this.f7506a = i02;
    }

    public static void a(Context context) {
        Bundle bundleC = OSUtils.c(context);
        String string = bundleC != null ? bundleC.getString("com.onesignal.NotificationServiceExtension") : null;
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7993C;
        if (string == null) {
            AbstractC0603w1.b(enumC0600v1, "No class found, not setting up OSRemoteNotificationReceivedHandler", null);
            return;
        }
        AbstractC0603w1.b(enumC0600v1, "Found class: " + string + ", attempting to call constructor", null);
        try {
            Class.forName(string).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            e6.printStackTrace();
        }
    }

    public final String toString() {
        return "OSNotificationController{notificationJob=" + this.f7506a + ", isRestoring=" + this.f7507b + ", isBackgroundLogic=" + this.f7508c + '}';
    }

    public D0(I0 i02, boolean z5) {
        this.f7507b = z5;
        this.f7506a = i02;
    }
}
