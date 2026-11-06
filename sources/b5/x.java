package b5;

import f5.C0710g;
import f5.E;
import f5.G;

/* JADX INFO: loaded from: classes.dex */
public final class x implements E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6067A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ z f6068B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0710g f6069w = new C0710g();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0710g f6070x = new C0710g();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f6071y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6072z;

    public x(z zVar, long j6) {
        this.f6068B = zVar;
        this.f6071y = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    @Override // f5.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long G(f5.C0710g r11, long r12) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto La8
        L6:
            b5.z r2 = r10.f6068B
            monitor-enter(r2)
            b5.z r3 = r10.f6068B     // Catch: java.lang.Throwable -> L7b
            b5.y r3 = r3.f6082i     // Catch: java.lang.Throwable -> L7b
            r3.h()     // Catch: java.lang.Throwable -> L7b
            b5.z r3 = r10.f6068B     // Catch: java.lang.Throwable -> L25
            b5.b r4 = r3.f6084k     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L28
            java.io.IOException r3 = r3.f6085l     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L1b
            goto L29
        L1b:
            b5.D r3 = new b5.D     // Catch: java.lang.Throwable -> L25
            b5.z r4 = r10.f6068B     // Catch: java.lang.Throwable -> L25
            b5.b r4 = r4.f6084k     // Catch: java.lang.Throwable -> L25
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r11 = move-exception
            goto L9e
        L28:
            r3 = 0
        L29:
            boolean r4 = r10.f6072z     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L96
            f5.g r4 = r10.f6070x     // Catch: java.lang.Throwable -> L25
            long r5 = r4.f8461x     // Catch: java.lang.Throwable -> L25
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r8 = -1
            if (r7 <= 0) goto L67
            long r12 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L25
            long r11 = r4.G(r11, r12)     // Catch: java.lang.Throwable -> L25
            b5.z r13 = r10.f6068B     // Catch: java.lang.Throwable -> L25
            long r4 = r13.f6074a     // Catch: java.lang.Throwable -> L25
            long r4 = r4 + r11
            r13.f6074a = r4     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L7e
            b5.s r13 = r13.f6077d     // Catch: java.lang.Throwable -> L25
            v0.s r13 = r13.f6034N     // Catch: java.lang.Throwable -> L25
            int r13 = r13.a()     // Catch: java.lang.Throwable -> L25
            int r13 = r13 / 2
            long r6 = (long) r13     // Catch: java.lang.Throwable -> L25
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 < 0) goto L7e
            b5.z r13 = r10.f6068B     // Catch: java.lang.Throwable -> L25
            b5.s r4 = r13.f6077d     // Catch: java.lang.Throwable -> L25
            int r5 = r13.f6076c     // Catch: java.lang.Throwable -> L25
            long r6 = r13.f6074a     // Catch: java.lang.Throwable -> L25
            r4.L(r5, r6)     // Catch: java.lang.Throwable -> L25
            b5.z r13 = r10.f6068B     // Catch: java.lang.Throwable -> L25
            r13.f6074a = r0     // Catch: java.lang.Throwable -> L25
            goto L7e
        L67:
            boolean r4 = r10.f6067A     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L7d
            if (r3 != 0) goto L7d
            b5.z r3 = r10.f6068B     // Catch: java.lang.Throwable -> L25
            r3.j()     // Catch: java.lang.Throwable -> L25
            b5.z r3 = r10.f6068B     // Catch: java.lang.Throwable -> L7b
            b5.y r3 = r3.f6082i     // Catch: java.lang.Throwable -> L7b
            r3.l()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            goto L6
        L7b:
            r11 = move-exception
            goto La6
        L7d:
            r11 = r8
        L7e:
            b5.z r13 = r10.f6068B     // Catch: java.lang.Throwable -> L7b
            b5.y r13 = r13.f6082i     // Catch: java.lang.Throwable -> L7b
            r13.l()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L92
            b5.z r13 = r10.f6068B
            b5.s r13 = r13.f6077d
            r13.u(r11)
            return r11
        L92:
            if (r3 != 0) goto L95
            return r8
        L95:
            throw r3
        L96:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r12 = "stream closed"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L25
            throw r11     // Catch: java.lang.Throwable -> L25
        L9e:
            b5.z r12 = r10.f6068B     // Catch: java.lang.Throwable -> L7b
            b5.y r12 = r12.f6082i     // Catch: java.lang.Throwable -> L7b
            r12.l()     // Catch: java.lang.Throwable -> L7b
            throw r11     // Catch: java.lang.Throwable -> L7b
        La6:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            throw r11
        La8:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r12 = d.AbstractC0628i.g(r0, r12)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.x.G(f5.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j6;
        synchronized (this.f6068B) {
            this.f6072z = true;
            C0710g c0710g = this.f6070x;
            j6 = c0710g.f8461x;
            c0710g.k();
            this.f6068B.notifyAll();
        }
        if (j6 > 0) {
            this.f6068B.f6077d.u(j6);
        }
        this.f6068B.a();
    }

    @Override // f5.E
    public final G d() {
        return this.f6068B.f6082i;
    }
}
