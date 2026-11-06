package b5;

import f5.C0710g;
import f5.G;

/* JADX INFO: loaded from: classes.dex */
public final class w implements f5.C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0710g f6063w = new C0710g();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ z f6066z;

    public w(z zVar) {
        this.f6066z = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r12) {
        /*
            r11 = this;
            b5.z r0 = r11.f6066z
            monitor-enter(r0)
            b5.z r1 = r11.f6066z     // Catch: java.lang.Throwable -> L75
            b5.y r1 = r1.f6083j     // Catch: java.lang.Throwable -> L75
            r1.h()     // Catch: java.lang.Throwable -> L75
        La:
            b5.z r1 = r11.f6066z     // Catch: java.lang.Throwable -> L24
            long r2 = r1.f6075b     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L26
            boolean r2 = r11.f6065y     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            boolean r2 = r11.f6064x     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            b5.b r2 = r1.f6084k     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            r1.j()     // Catch: java.lang.Throwable -> L24
            goto La
        L24:
            r12 = move-exception
            goto L77
        L26:
            b5.y r1 = r1.f6083j     // Catch: java.lang.Throwable -> L75
            r1.l()     // Catch: java.lang.Throwable -> L75
            b5.z r1 = r11.f6066z     // Catch: java.lang.Throwable -> L75
            r1.b()     // Catch: java.lang.Throwable -> L75
            b5.z r1 = r11.f6066z     // Catch: java.lang.Throwable -> L75
            long r1 = r1.f6075b     // Catch: java.lang.Throwable -> L75
            f5.g r3 = r11.f6063w     // Catch: java.lang.Throwable -> L75
            long r3 = r3.f8461x     // Catch: java.lang.Throwable -> L75
            long r9 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L75
            b5.z r1 = r11.f6066z     // Catch: java.lang.Throwable -> L75
            long r2 = r1.f6075b     // Catch: java.lang.Throwable -> L75
            long r2 = r2 - r9
            r1.f6075b = r2     // Catch: java.lang.Throwable -> L75
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            b5.y r0 = r1.f6083j
            r0.h()
            if (r12 == 0) goto L58
            f5.g r12 = r11.f6063w     // Catch: java.lang.Throwable -> L56
            long r0 = r12.f8461x     // Catch: java.lang.Throwable -> L56
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 != 0) goto L58
            r12 = 1
        L54:
            r7 = r12
            goto L5a
        L56:
            r12 = move-exception
            goto L6d
        L58:
            r12 = 0
            goto L54
        L5a:
            b5.z r12 = r11.f6066z     // Catch: java.lang.Throwable -> L56
            b5.s r5 = r12.f6077d     // Catch: java.lang.Throwable -> L56
            int r6 = r12.f6076c     // Catch: java.lang.Throwable -> L56
            f5.g r8 = r11.f6063w     // Catch: java.lang.Throwable -> L56
            r5.J(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L56
            b5.z r12 = r11.f6066z
            b5.y r12 = r12.f6083j
            r12.l()
            return
        L6d:
            b5.z r0 = r11.f6066z
            b5.y r0 = r0.f6083j
            r0.l()
            throw r12
        L75:
            r12 = move-exception
            goto L7f
        L77:
            b5.z r1 = r11.f6066z     // Catch: java.lang.Throwable -> L75
            b5.y r1 = r1.f6083j     // Catch: java.lang.Throwable -> L75
            r1.l()     // Catch: java.lang.Throwable -> L75
            throw r12     // Catch: java.lang.Throwable -> L75
        L7f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.w.b(boolean):void");
    }

    @Override // f5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f6066z) {
            try {
                if (this.f6064x) {
                    return;
                }
                z zVar = this.f6066z;
                if (!zVar.f6081h.f6065y) {
                    if (this.f6063w.f8461x > 0) {
                        while (this.f6063w.f8461x > 0) {
                            b(true);
                        }
                    } else {
                        zVar.f6077d.J(zVar.f6076c, true, null, 0L);
                    }
                }
                synchronized (this.f6066z) {
                    this.f6064x = true;
                }
                this.f6066z.f6077d.flush();
                this.f6066z.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f5.C
    public final G d() {
        return this.f6066z.f6083j;
    }

    @Override // f5.C, java.io.Flushable
    public final void flush() {
        synchronized (this.f6066z) {
            this.f6066z.b();
        }
        while (this.f6063w.f8461x > 0) {
            b(false);
            this.f6066z.f6077d.flush();
        }
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) {
        C0710g c0710g2 = this.f6063w;
        c0710g2.q(c0710g, j6);
        while (c0710g2.f8461x >= 16384) {
            b(false);
        }
    }
}
