package s;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: s.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1284f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12515e;

    public C1284f(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f12513c = i6;
        this.f12511a = new LinkedHashMap(0, 0.75f, true);
    }

    public Object a(Object obj) {
        return null;
    }

    public final Object b(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f12511a.get(obj);
                if (obj2 != null) {
                    this.f12514d++;
                    return obj2;
                }
                this.f12515e++;
                Object objA = a(obj);
                if (objA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        objPut = this.f12511a.put(obj, objA);
                        if (objPut != null) {
                            this.f12511a.put(obj, objPut);
                        } else {
                            this.f12512b++;
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    return objPut;
                }
                d(this.f12513c);
                return objA;
            } finally {
            }
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f12512b++;
                objPut = this.f12511a.put(obj, obj2);
                if (objPut != null) {
                    this.f12512b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d(this.f12513c);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f12512b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L47
            java.util.LinkedHashMap r0 = r2.f12511a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.f12512b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L47
            goto L14
        L12:
            r3 = move-exception
            goto L66
        L14:
            int r0 = r2.f12512b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L45
            java.util.LinkedHashMap r0 = r2.f12511a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L45
        L21:
            java.util.LinkedHashMap r0 = r2.f12511a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r0 = r2.f12511a     // Catch: java.lang.Throwable -> L12
            r0.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r0 = r2.f12512b     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + (-1)
            r2.f12512b = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1284f.d(int):void");
    }

    public final synchronized String toString() {
        int i6;
        try {
            int i7 = this.f12514d;
            int i8 = this.f12515e + i7;
            i6 = i8 != 0 ? (i7 * 100) / i8 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f12513c + ",hits=" + this.f12514d + ",misses=" + this.f12515e + ",hitRate=" + i6 + "%]";
    }
}
