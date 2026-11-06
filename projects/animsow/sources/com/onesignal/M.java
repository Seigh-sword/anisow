package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7629c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static J f7631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Thread f7632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f7633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Location f7634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f7635i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f7627a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f7628b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0594t1 f7630d = new C0594t1();

    public static void a(K k5) {
        Thread thread;
        HashMap map = new HashMap();
        synchronized (M.class) {
            ConcurrentHashMap concurrentHashMap = f7628b;
            map.putAll(concurrentHashMap);
            concurrentHashMap.clear();
            thread = f7632f;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((I) map.get((L) it.next())).b(k5);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f7632f) {
            synchronized (M.class) {
                try {
                    if (thread == f7632f) {
                        f7632f = null;
                    }
                } finally {
                }
            }
        }
        AbstractC0603w1.f8056v.getClass();
        E1.g(E1.f7517a, "OS_LAST_LOCATION_TIME", Long.valueOf(System.currentTimeMillis()));
    }

    public static void b(Location location) {
        double longitude;
        AbstractC0603w1.b(EnumC0600v1.f7992B, "LocationController fireCompleteForLocation with location: " + location, null);
        K k5 = new K();
        k5.f7604c = Float.valueOf(location.getAccuracy());
        k5.f7606e = Boolean.valueOf(!AbstractC0603w1.f8049o);
        k5.f7605d = Integer.valueOf(!f7629c ? 1 : 0);
        k5.f7607f = Long.valueOf(location.getTime());
        if (f7629c) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            k5.f7602a = Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue());
            longitude = new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue();
        } else {
            k5.f7602a = Double.valueOf(location.getLatitude());
            longitude = location.getLongitude();
        }
        k5.f7603b = Double.valueOf(longitude);
        a(k5);
        h(f7633g);
    }

    public static void c() {
        C0594t1 c0594t1 = f7630d;
        synchronized (c0594t1) {
            try {
                if (OSUtils.b() == 1 && OSUtils.i()) {
                    AbstractC0595u.c();
                } else if (f()) {
                    synchronized (c0594t1) {
                        B.f7467j = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7 A[Catch: NameNotFoundException -> 0x0077, TryCatch #0 {NameNotFoundException -> 0x0077, blocks: (B:25:0x0058, B:28:0x0074, B:41:0x009f, B:44:0x00a5, B:47:0x00b4, B:49:0x00c5, B:51:0x00d0, B:53:0x00d7, B:54:0x00df, B:31:0x007a, B:36:0x0089, B:40:0x0096), top: B:81:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df A[Catch: NameNotFoundException -> 0x0077, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0077, blocks: (B:25:0x0058, B:28:0x0074, B:41:0x009f, B:44:0x00a5, B:47:0x00b4, B:49:0x00c5, B:51:0x00d0, B:53:0x00d7, B:54:0x00df, B:31:0x007a, B:36:0x0089, B:40:0x0096), top: B:81:0x0058 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r7, boolean r8, boolean r9, com.onesignal.I r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.M.d(android.content.Context, boolean, boolean, com.onesignal.I):void");
    }

    public static J e() {
        if (f7631e == null) {
            synchronized (f7630d) {
                try {
                    if (f7631e == null) {
                        J j6 = new J("OSH_LocationHandlerThread");
                        j6.start();
                        j6.f7592w = new Handler(j6.getLooper());
                        f7631e = j6;
                    }
                } finally {
                }
            }
        }
        return f7631e;
    }

    public static boolean f() {
        return OSUtils.b() == 13 && OSUtils.l();
    }

    public static void g() {
        synchronized (f7630d) {
            try {
                if (OSUtils.b() == 1 && OSUtils.i()) {
                    AbstractC0595u.g();
                } else {
                    if (f()) {
                        B.g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean h(Context context) {
        int iG = AbstractC0571l1.g(context, "android.permission.ACCESS_FINE_LOCATION");
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        if (iG != 0 && AbstractC0571l1.g(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            AbstractC0603w1.b(enumC0600v1, "LocationController scheduleUpdate not possible, location permission not enabled", null);
            return false;
        }
        AbstractC0603w1.f8057w.getClass();
        String str = E1.f7517a;
        if (!E1.b(str, "PREFS_OS_LOCATION_SHARED", true)) {
            AbstractC0603w1.b(enumC0600v1, "LocationController scheduleUpdate not possible, location shared not enabled", null);
            return false;
        }
        AbstractC0603w1.f8056v.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - ((Long) E1.a(str, "OS_LAST_LOCATION_TIME", Long.class, -600000L)).longValue();
        long j6 = (AbstractC0603w1.f8049o ? 300L : 600L) * 1000;
        AbstractC0603w1.b(enumC0600v1, "LocationController scheduleUpdate lastTime: " + jCurrentTimeMillis + " minTime: " + j6, null);
        long j7 = j6 - jCurrentTimeMillis;
        Z0 z0C = Z0.c();
        z0C.getClass();
        AbstractC0603w1.b(EnumC0600v1.f7993C, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j7, null);
        z0C.d(context, j7);
        return true;
    }

    public static void i(boolean z5, int i6) {
        if (!z5) {
            AbstractC0603w1.b(EnumC0600v1.f7992B, "LocationController sendAndClearPromptHandlers from non prompt flow", null);
            return;
        }
        ArrayList arrayList = f7627a;
        synchronized (arrayList) {
            try {
                AbstractC0603w1.b(EnumC0600v1.f7992B, "LocationController calling prompt handlers", null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0584q c0584q = ((C0586q1) it.next()).f7963a;
                    if (c0584q != null) {
                        c0584q.j(i6);
                    }
                }
                f7627a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void j() {
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7998z;
        AbstractC0603w1.b(EnumC0600v1.f7992B, "LocationController startGetLocation with lastLocation: " + f7634h, null);
        try {
            if (OSUtils.b() == 1 && OSUtils.i()) {
                AbstractC0595u.k();
            } else if (f()) {
                B.k();
            } else {
                AbstractC0603w1.b(enumC0600v1, "LocationController startGetLocation not possible, no location dependency found", null);
                c();
            }
        } catch (Throwable th) {
            AbstractC0603w1.b(enumC0600v1, "Location permission exists but there was an error initializing: ", th);
            c();
        }
    }
}
