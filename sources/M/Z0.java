package m;

import F0.C0022i;
import V4.C0176g;
import android.os.CancellationSignal;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10238d;

    public Z0() {
        this.f10237c = new SparseIntArray();
        this.f10238d = new SparseIntArray();
        this.f10235a = false;
        this.f10236b = false;
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f10235a) {
                    return;
                }
                this.f10235a = true;
                this.f10236b = true;
                C0022i c0022i = (C0022i) this.f10237c;
                Object obj = this.f10238d;
                if (c0022i != null) {
                    try {
                        Runnable runnable = (Runnable) c0022i.f530x;
                        F0.w wVar = (F0.w) c0022i.f532z;
                        Runnable runnable2 = (Runnable) c0022i.f531y;
                        if (runnable == null) {
                            wVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f10236b = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f10236b = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public final void b(C0176g... c0176gArr) {
        if (!this.f10235a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[c0176gArr.length];
        for (int i6 = 0; i6 < c0176gArr.length; i6++) {
            strArr[i6] = c0176gArr[i6].f3858a;
        }
        c(strArr);
    }

    public final void c(String... strArr) {
        if (!this.f10235a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f10237c = (String[]) strArr.clone();
    }

    public final int d(int i6, int i7) {
        if (!this.f10236b) {
            return f(i6, i7);
        }
        int i8 = ((SparseIntArray) this.f10238d).get(i6, -1);
        if (i8 != -1) {
            return i8;
        }
        int iF = f(i6, i7);
        ((SparseIntArray) this.f10238d).put(i6, iF);
        return iF;
    }

    public final int e(int i6, int i7) {
        if (!this.f10235a) {
            return i6 % i7;
        }
        int i8 = ((SparseIntArray) this.f10237c).get(i6, -1);
        if (i8 != -1) {
            return i8;
        }
        int i9 = i6 % i7;
        ((SparseIntArray) this.f10237c).put(i6, i9);
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.f10236b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.f10238d
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            int r3 = r3 - r1
            r4 = r2
        L10:
            if (r4 > r3) goto L22
            int r5 = r4 + r3
            int r5 = r5 >>> r1
            int r6 = r0.keyAt(r5)
            if (r6 >= r8) goto L1e
            int r4 = r5 + 1
            goto L10
        L1e:
            int r5 = r5 + (-1)
            r3 = r5
            goto L10
        L22:
            int r4 = r4 - r1
            r3 = -1
            if (r4 < 0) goto L31
            int r5 = r0.size()
            if (r4 >= r5) goto L31
            int r0 = r0.keyAt(r4)
            goto L32
        L31:
            r0 = r3
        L32:
            if (r0 == r3) goto L49
            java.lang.Object r3 = r7.f10238d
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r7.e(r0, r9)
            int r0 = r0 + r1
            if (r0 != r9) goto L4c
            int r3 = r3 + 1
            r0 = r2
            goto L4c
        L49:
            r0 = r2
            r3 = r0
            r4 = r3
        L4c:
            if (r4 >= r8) goto L5e
            int r0 = r0 + 1
            if (r0 != r9) goto L56
            int r3 = r3 + 1
            r0 = r2
            goto L5b
        L56:
            if (r0 <= r9) goto L5b
            int r3 = r3 + 1
            r0 = r1
        L5b:
            int r4 = r4 + 1
            goto L4c
        L5e:
            int r0 = r0 + r1
            if (r0 <= r9) goto L63
            int r3 = r3 + 1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m.Z0.f(int, int):int");
    }

    public final void g() {
        ((SparseIntArray) this.f10237c).clear();
    }

    public final void h(V4.L... lArr) {
        if (!this.f10235a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[lArr.length];
        for (int i6 = 0; i6 < lArr.length; i6++) {
            strArr[i6] = lArr[i6].f3808w;
        }
        i(strArr);
    }

    public final void i(String... strArr) {
        if (!this.f10235a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f10238d = (String[]) strArr.clone();
    }

    public Z0(boolean z5) {
        this.f10235a = z5;
    }
}
