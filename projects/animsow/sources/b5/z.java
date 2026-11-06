package b5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6074a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f6077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f6078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f6080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f6081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y f6082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f6083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC0346b f6084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IOException f6085l;

    public z(int i6, s sVar, boolean z5, boolean z6, V4.p pVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f6078e = arrayDeque;
        this.f6082i = new y(this);
        this.f6083j = new y(this);
        if (sVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f6076c = i6;
        this.f6077d = sVar;
        this.f6075b = sVar.f6035O.a();
        x xVar = new x(this, sVar.f6034N.a());
        this.f6080g = xVar;
        w wVar = new w(this);
        this.f6081h = wVar;
        xVar.f6067A = z6;
        wVar.f6065y = z5;
        if (pVar != null) {
            arrayDeque.add(pVar);
        }
        if (g() && pVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!g() && pVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            b5.x r0 = r2.f6080g     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f6067A     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1a
            boolean r0 = r0.f6072z     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            b5.w r0 = r2.f6081h     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f6065y     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            boolean r0 = r0.f6064x     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            goto L18
        L16:
            r0 = move-exception
            goto L33
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L29
            b5.b r0 = b5.EnumC0346b.CANCEL
            r1 = 0
            r2.c(r0, r1)
            goto L32
        L29:
            if (r1 != 0) goto L32
            b5.s r0 = r2.f6077d
            int r1 = r2.f6076c
            r0.l(r1)
        L32:
            return
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.z.a():void");
    }

    public final void b() throws IOException {
        w wVar = this.f6081h;
        if (wVar.f6064x) {
            throw new IOException("stream closed");
        }
        if (wVar.f6065y) {
            throw new IOException("stream finished");
        }
        if (this.f6084k != null) {
            IOException iOException = this.f6085l;
            if (iOException == null) {
                throw new D(this.f6084k);
            }
        }
    }

    public final void c(EnumC0346b enumC0346b, IOException iOException) {
        if (d(enumC0346b, iOException)) {
            this.f6077d.f6037Q.l(this.f6076c, enumC0346b);
        }
    }

    public final boolean d(EnumC0346b enumC0346b, IOException iOException) {
        synchronized (this) {
            try {
                if (this.f6084k != null) {
                    return false;
                }
                if (this.f6080g.f6067A && this.f6081h.f6065y) {
                    return false;
                }
                this.f6084k = enumC0346b;
                this.f6085l = iOException;
                notifyAll();
                this.f6077d.l(this.f6076c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(EnumC0346b enumC0346b) {
        if (d(enumC0346b, null)) {
            this.f6077d.K(this.f6076c, enumC0346b);
        }
    }

    public final w f() {
        synchronized (this) {
            try {
                if (!this.f6079f && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f6081h;
    }

    public final boolean g() {
        return this.f6077d.f6040w == ((this.f6076c & 1) == 1);
    }

    public final synchronized boolean h() {
        try {
            if (this.f6084k != null) {
                return false;
            }
            x xVar = this.f6080g;
            if (xVar.f6067A || xVar.f6072z) {
                w wVar = this.f6081h;
                if (wVar.f6065y || wVar.f6064x) {
                    if (this.f6079f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(V4.p pVar, boolean z5) {
        boolean zH;
        synchronized (this) {
            try {
                if (this.f6079f && z5) {
                    this.f6080g.getClass();
                } else {
                    this.f6079f = true;
                    this.f6078e.add(pVar);
                }
                if (z5) {
                    this.f6080g.f6067A = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f6077d.l(this.f6076c);
    }

    public final void j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
