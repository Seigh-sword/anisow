package M4;

import j3.C0848A;

/* JADX INFO: loaded from: classes.dex */
public abstract class N implements Runnable, Comparable, K {
    private volatile Object _heap;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1857x;

    @Override // M4.K
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0848A c0848a = B.f1837b;
                if (obj == c0848a) {
                    return;
                }
                O o3 = obj instanceof O ? (O) obj : null;
                if (o3 != null) {
                    synchronized (o3) {
                        if (c() != null) {
                            o3.b(this.f1857x);
                        }
                    }
                }
                this._heap = c0848a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final R4.y c() {
        Object obj = this._heap;
        if (obj instanceof R4.y) {
            return (R4.y) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = this.f1856w - ((N) obj).f1856w;
        if (j6 > 0) {
            return 1;
        }
        return j6 < 0 ? -1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004c A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:9:0x000b, B:11:0x0010, B:13:0x0014, B:23:0x002b, B:33:0x0043, B:35:0x004c, B:36:0x004e, B:26:0x0030, B:30:0x003a), top: B:45:0x000b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(long r9, M4.O r11, M4.P r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L25
            j3.A r1 = M4.B.f1837b     // Catch: java.lang.Throwable -> L25
            if (r0 != r1) goto La
            monitor-exit(r8)
            r9 = 2
            return r9
        La:
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L25
            M4.N[] r0 = r11.f3049a     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e
            goto L14
        L13:
            r0 = 0
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = M4.P.f1859C     // Catch: java.lang.Throwable -> L2e
            r12.getClass()     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = M4.P.f1861E     // Catch: java.lang.Throwable -> L2e
            int r12 = r2.get(r12)     // Catch: java.lang.Throwable -> L2e
            if (r12 == 0) goto L27
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            r9 = 1
            return r9
        L25:
            r9 = move-exception
            goto L56
        L27:
            r2 = 0
            if (r0 != 0) goto L30
        L2b:
            r11.f1858c = r9     // Catch: java.lang.Throwable -> L2e
            goto L43
        L2e:
            r9 = move-exception
            goto L54
        L30:
            long r4 = r0.f1856w     // Catch: java.lang.Throwable -> L2e
            long r6 = r4 - r9
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 < 0) goto L39
            goto L3a
        L39:
            r9 = r4
        L3a:
            long r4 = r11.f1858c     // Catch: java.lang.Throwable -> L2e
            long r4 = r9 - r4
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 <= 0) goto L43
            goto L2b
        L43:
            long r9 = r8.f1856w     // Catch: java.lang.Throwable -> L2e
            long r4 = r11.f1858c     // Catch: java.lang.Throwable -> L2e
            long r9 = r9 - r4
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L4e
            r8.f1856w = r4     // Catch: java.lang.Throwable -> L2e
        L4e:
            r11.a(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            return r1
        L54:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L56:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.N.d(long, M4.O, M4.P):int");
    }

    public final void e(O o3) {
        if (this._heap == B.f1837b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = o3;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1856w + ']';
    }
}
