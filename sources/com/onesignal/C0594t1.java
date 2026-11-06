package com.onesignal;

import android.content.Context;

/* JADX INFO: renamed from: com.onesignal.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0594t1 implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C0594t1 f7978a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7979b = false;

    public static void c(int i6, String str) {
        int i7;
        AbstractC0603w1.f8053s.getClass();
        d("registerForPushToken completed with id: " + str + " status: " + i6);
        if (i6 >= 1 ? AbstractC0603w1.f8045k < -6 : !(M1.b().m() != null || ((i7 = AbstractC0603w1.f8045k) != 1 && i7 >= -6))) {
            AbstractC0603w1.f8045k = i6;
        }
        AbstractC0603w1.f8008I = str;
        AbstractC0603w1.f8010K = true;
        OSSubscriptionState oSSubscriptionStateN = AbstractC0603w1.n(AbstractC0603w1.f8028b);
        if (str == null) {
            oSSubscriptionStateN.getClass();
        } else {
            boolean z5 = !str.equals(oSSubscriptionStateN.f7656y);
            oSSubscriptionStateN.f7656y = str;
            if (z5) {
                oSSubscriptionStateN.f7654w.h(oSSubscriptionStateN);
            }
        }
        AbstractC0603w1.d();
    }

    public static void d(String str) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, str, null);
    }

    public static void e(String str) {
        AbstractC0603w1.b(EnumC0600v1.f7997y, str, null);
    }

    public static void f(String str, Exception exc) {
        AbstractC0603w1.b(EnumC0600v1.f7997y, str, exc);
    }

    public static void g(String str) {
        if (f7978a == null) {
            return;
        }
        f7979b = true;
        c(1, str);
    }

    public static void h(String str) {
        AbstractC0603w1.b(EnumC0600v1.f7993C, str, null);
    }

    public static void i(String str) {
        AbstractC0603w1.b(EnumC0600v1.f7998z, str, null);
    }

    @Override // com.onesignal.P1
    public void a(Context context, String str, C0594t1 c0594t1) {
        f7978a = c0594t1;
        new Thread(new Q1(context, c0594t1)).start();
    }
}
