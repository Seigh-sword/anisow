package com.google.android.gms.internal.measurement;

import android.content.Context;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0420g2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f6817g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Z1 f6818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J2 f6819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicInteger f6820j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0450l2 f6821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f6824d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f6825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6826f;

    static {
        new AtomicReference();
        f6819i = new J2(new J2());
        f6820j = new AtomicInteger();
    }

    public AbstractC0420g2(C0450l2 c0450l2, String str, Object obj) {
        String str2 = c0450l2.f6866a;
        if (str2 == null && c0450l2.f6867b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c0450l2.f6867b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f6821a = c0450l2;
        this.f6822b = str;
        this.f6823c = obj;
        this.f6826f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:12:0x0021, B:14:0x0025, B:16:0x002c, B:18:0x003a, B:20:0x004f, B:22:0x0056, B:29:0x0067, B:30:0x0076, B:25:0x005c, B:38:0x0088, B:40:0x008e, B:53:0x00ac, B:56:0x00b4, B:57:0x00b7, B:58:0x00bb, B:43:0x0095, B:52:0x00aa, B:46:0x009c, B:49:0x00a3, B:59:0x00c0, B:60:0x00c5, B:61:0x00c6), top: B:67:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0420g2.a():java.lang.Object");
    }

    public final Object b(Z1 z12) {
        C0396c2 c0396c2;
        String strI;
        C0450l2 c0450l2 = this.f6821a;
        if (!c0450l2.f6870e) {
            c0450l2.getClass();
            Context context = z12.f6752a;
            synchronized (C0396c2.class) {
                try {
                    if (C0396c2.f6773z == null) {
                        C0396c2.f6773z = AbstractC0651b.h(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C0396c2(context) : new C0396c2(0);
                    }
                    c0396c2 = C0396c2.f6773z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0450l2 c0450l22 = this.f6821a;
            if (c0450l22.f6870e) {
                strI = null;
            } else {
                String str = c0450l22.f6868c;
                strI = this.f6822b;
                if (str == null || !str.isEmpty()) {
                    strI = AbstractC0628i.i(str, strI);
                }
            }
            Object objB = c0396c2.b(strI);
            if (objB != null) {
                return c(objB);
            }
        }
        return null;
    }

    public abstract Object c(Object obj);

    /* JADX WARN: Can't wrap try/catch for region: R(10:19|(1:21)(7:22|(1:24)(1:25)|26|(0)|35|36|37)|30|92|31|32|(1:34)|35|36|37) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.android.gms.internal.measurement.Z1 r10) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0420g2.d(com.google.android.gms.internal.measurement.Z1):java.lang.Object");
    }
}
