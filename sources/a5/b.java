package a5;

import f5.C;
import f5.C0710g;
import f5.G;
import f5.InterfaceC0711h;
import f5.o;

/* JADX INFO: loaded from: classes.dex */
public final class b implements C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f5031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5032x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f5033y;

    public b(g gVar) {
        this.f5033y = gVar;
        this.f5031w = new o(gVar.f5047d.d());
    }

    @Override // f5.C, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5032x) {
            return;
        }
        this.f5032x = true;
        this.f5033y.f5047d.z("0\r\n\r\n");
        g gVar = this.f5033y;
        o oVar = this.f5031w;
        gVar.getClass();
        G g4 = oVar.f8474e;
        oVar.f8474e = G.f8433d;
        g4.a();
        g4.b();
        this.f5033y.f5048e = 3;
    }

    @Override // f5.C
    public final G d() {
        return this.f5031w;
    }

    @Override // f5.C, java.io.Flushable
    public final synchronized void flush() {
        if (this.f5032x) {
            return;
        }
        this.f5033y.f5047d.flush();
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) {
        if (this.f5032x) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return;
        }
        g gVar = this.f5033y;
        gVar.f5047d.i(j6);
        InterfaceC0711h interfaceC0711h = gVar.f5047d;
        interfaceC0711h.z("\r\n");
        interfaceC0711h.q(c0710g, j6);
        interfaceC0711h.z("\r\n");
    }
}
