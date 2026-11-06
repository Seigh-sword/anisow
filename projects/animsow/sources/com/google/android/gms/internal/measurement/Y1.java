package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 implements InterfaceC0390b2 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C1280b f6739D = new C1280b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f6740E = {"key", "value"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f6741A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile Map f6742B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f6743C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ContentResolver f6744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f6745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f6746y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c0.x f6747z;

    public Y1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        c0.x xVar = new c0.x(this, 2);
        this.f6747z = xVar;
        this.f6741A = new Object();
        this.f6743C = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f6744w = contentResolver;
        this.f6745x = uri;
        this.f6746y = runnable;
        contentResolver.registerContentObserver(uri, false, xVar);
    }

    public static Y1 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        Y1 y12;
        synchronized (Y1.class) {
            C1280b c1280b = f6739D;
            y12 = (Y1) c1280b.getOrDefault(uri, null);
            if (y12 == null) {
                try {
                    Y1 y13 = new Y1(contentResolver, uri, runnable);
                    try {
                        c1280b.put(uri, y13);
                    } catch (SecurityException unused) {
                    }
                    y12 = y13;
                } catch (SecurityException unused2) {
                }
            }
        }
        return y12;
    }

    public static synchronized void d() {
        try {
            for (Y1 y12 : (s.j) f6739D.values()) {
                y12.f6744w.unregisterContentObserver(y12.f6747z);
            }
            f6739D.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0390b2
    public final /* synthetic */ Object b(String str) {
        return (String) c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map c() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f6742B
            if (r0 != 0) goto L52
            java.lang.Object r1 = r5.f6741A
            monitor-enter(r1)
            java.util.Map r0 = r5.f6742B     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L4e
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L48
            K1.b r2 = new K1.b     // Catch: java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f java.lang.SecurityException -> L31
            r3 = 3
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f java.lang.SecurityException -> L31
            java.lang.Object r2 = r2.B()     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f
            goto L25
        L1a:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f java.lang.SecurityException -> L31
            java.lang.Object r2 = r2.B()     // Catch: java.lang.Throwable -> L33
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f java.lang.SecurityException -> L31
        L25:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f java.lang.SecurityException -> L31
        L27:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L48
            goto L44
        L2b:
            r2 = move-exception
            goto L4a
        L2d:
            r2 = move-exception
            goto L38
        L2f:
            r2 = move-exception
            goto L38
        L31:
            r2 = move-exception
            goto L38
        L33:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f java.lang.SecurityException -> L31
            throw r2     // Catch: java.lang.Throwable -> L2b java.lang.IllegalStateException -> L2d android.database.sqlite.SQLiteException -> L2f java.lang.SecurityException -> L31
        L38:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L2b
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L2b
            goto L27
        L44:
            r5.f6742B = r2     // Catch: java.lang.Throwable -> L48
            r0 = r2
            goto L4e
        L48:
            r0 = move-exception
            goto L50
        L4a:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L48
            throw r2     // Catch: java.lang.Throwable -> L48
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            goto L52
        L50:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r0
        L52:
            if (r0 == 0) goto L55
            return r0
        L55:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Y1.c():java.util.Map");
    }
}
