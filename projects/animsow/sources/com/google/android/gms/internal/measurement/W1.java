package com.google.android.gms.internal.measurement;

import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f6729a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f6730b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J2 f6731c = new J2();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.gms.internal.measurement.W1.f6730b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.gms.internal.measurement.W1> r0 = com.google.android.gms.internal.measurement.W1.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.W1.f6730b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L53
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.W1.f6729a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.W1.f6729a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.W1.f6729a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2a
            goto L4d
        L2a:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r6 != 0) goto L49
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r7 != 0) goto L48
            goto L49
        L3b:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.W1.f6729a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L48:
            r1 = r5
        L49:
            if (r1 == 0) goto L4d
            com.google.android.gms.internal.measurement.W1.f6729a = r4     // Catch: java.lang.Throwable -> Lf
        L4d:
            if (r1 == 0) goto L51
            com.google.android.gms.internal.measurement.W1.f6730b = r1     // Catch: java.lang.Throwable -> Lf
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.W1.a(android.content.Context):boolean");
    }
}
