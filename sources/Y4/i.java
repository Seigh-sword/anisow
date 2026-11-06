package Y4;

import V4.A;
import V4.B;
import V4.m;
import V4.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import m2.C1017B;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f4887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f4889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f4890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f4891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B f4893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f4894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f4895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public J3.x f4896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4901o;

    public i(x xVar, A a6) {
        g gVar = new g(this);
        this.f4891e = gVar;
        this.f4887a = xVar;
        C1017B c1017b = C1017B.f10489z;
        K1.b bVar = xVar.f3963L;
        c1017b.getClass();
        this.f4888b = (e) bVar.f1515x;
        this.f4889c = a6;
        this.f4890d = (m) xVar.f3953B.f1363x;
        gVar.g(xVar.f3968Q, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        J3.x xVar;
        d dVar;
        synchronized (this.f4888b) {
            this.f4899m = true;
            xVar = this.f4896j;
            c cVar = this.f4894h;
            if (cVar == null || (dVar = cVar.f4857g) == null) {
                dVar = this.f4895i;
            }
        }
        if (xVar != null) {
            ((Z4.c) xVar.f1450f).cancel();
        } else if (dVar != null) {
            W4.b.d(dVar.f4862d);
        }
    }

    public final void b() {
        synchronized (this.f4888b) {
            try {
                if (this.f4901o) {
                    throw new IllegalStateException();
                }
                this.f4896j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IOException c(J3.x xVar, boolean z5, boolean z6, IOException iOException) {
        boolean z7;
        synchronized (this.f4888b) {
            try {
                J3.x xVar2 = this.f4896j;
                if (xVar != xVar2) {
                    return iOException;
                }
                boolean z8 = true;
                if (z5) {
                    z7 = !this.f4897k;
                    this.f4897k = true;
                } else {
                    z7 = false;
                }
                if (z6) {
                    if (!this.f4898l) {
                        z7 = true;
                    }
                    this.f4898l = true;
                }
                if (this.f4897k && this.f4898l && z7) {
                    xVar2.b().f4871m++;
                    this.f4896j = null;
                } else {
                    z8 = false;
                }
                return z8 ? e(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z5;
        synchronized (this.f4888b) {
            z5 = this.f4899m;
        }
        return z5;
    }

    public final IOException e(IOException iOException, boolean z5) {
        d dVar;
        Socket socketG;
        boolean z6;
        synchronized (this.f4888b) {
            if (z5) {
                try {
                    if (this.f4896j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            dVar = this.f4895i;
            socketG = (dVar != null && this.f4896j == null && (z5 || this.f4901o)) ? g() : null;
            if (this.f4895i != null) {
                dVar = null;
            }
            z6 = this.f4901o && this.f4896j == null;
        }
        W4.b.d(socketG);
        if (dVar != null) {
            this.f4890d.getClass();
        }
        if (z6) {
            if (iOException != null) {
            }
            if (!this.f4900n && this.f4891e.i()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            this.f4890d.getClass();
        }
        return iOException;
    }

    public final IOException f(IOException iOException) {
        synchronized (this.f4888b) {
            this.f4901o = true;
        }
        return e(iOException, false);
    }

    public final Socket g() {
        int size = this.f4895i.f4874p.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            }
            if (((Reference) this.f4895i.f4874p.get(i6)).get() == this) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            throw new IllegalStateException();
        }
        d dVar = this.f4895i;
        dVar.f4874p.remove(i6);
        this.f4895i = null;
        if (dVar.f4874p.isEmpty()) {
            dVar.f4875q = System.nanoTime();
            e eVar = this.f4888b;
            eVar.getClass();
            if (dVar.f4869k || eVar.f4877a == 0) {
                eVar.f4880d.remove(dVar);
                return dVar.f4863e;
            }
            eVar.notifyAll();
        }
        return null;
    }
}
