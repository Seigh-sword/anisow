package l3;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0941d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10035a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10036b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10037c;

    public C0941d(int i6) {
        this.f10037c = i6;
    }

    public static String a(int i6, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i6 ? strTrim.substring(0, i6) : strTrim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r0.equals(r6) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: "
            java.lang.String r1 = "com.crashlytics.version-control-info"
            monitor-enter(r5)
            int r2 = r5.f10037c     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = a(r2, r1)     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r2 = r5.f10035a     // Catch: java.lang.Throwable -> L35
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L35
            int r3 = r5.f10036b     // Catch: java.lang.Throwable -> L35
            r4 = 0
            if (r2 < r3) goto L37
            java.util.HashMap r2 = r5.f10035a     // Catch: java.lang.Throwable -> L35
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L1f
            goto L37
        L1f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L35
            int r0 = r5.f10036b     // Catch: java.lang.Throwable -> L35
            r6.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            android.util.Log.w(r0, r6, r1)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)
            return r4
        L35:
            r6 = move-exception
            goto L5a
        L37:
            int r0 = r5.f10037c     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = a(r0, r6)     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r0 = r5.f10035a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L4a
            if (r6 != 0) goto L52
            goto L50
        L4a:
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L52
        L50:
            monitor-exit(r5)
            return r4
        L52:
            java.util.HashMap r0 = r5.f10035a     // Catch: java.lang.Throwable -> L35
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)
            r6 = 1
            return r6
        L5a:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C0941d.b(java.lang.String):boolean");
    }

    public final synchronized void c(Map map) {
        try {
            int i6 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f10037c, str);
                if (this.f10035a.size() < this.f10036b || this.f10035a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f10035a.put(strA, str2 == null ? "" : a(this.f10037c, str2));
                } else {
                    i6++;
                }
            }
            if (i6 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i6 + " entries when adding custom keys. Maximum allowable: " + this.f10036b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
