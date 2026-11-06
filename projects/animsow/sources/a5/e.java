package a5;

import f5.C;
import f5.C0710g;
import f5.G;
import f5.o;

/* JADX INFO: loaded from: classes.dex */
public final class e implements C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f5040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f5042y;

    public e(g gVar) {
        this.f5042y = gVar;
        this.f5040w = new o(gVar.f5047d.d());
    }

    @Override // f5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5041x) {
            return;
        }
        this.f5041x = true;
        g gVar = this.f5042y;
        gVar.getClass();
        o oVar = this.f5040w;
        G g4 = oVar.f8474e;
        oVar.f8474e = G.f8433d;
        g4.a();
        g4.b();
        gVar.f5048e = 3;
    }

    @Override // f5.C
    public final G d() {
        return this.f5040w;
    }

    @Override // f5.C, java.io.Flushable
    public final void flush() {
        if (this.f5041x) {
            return;
        }
        this.f5042y.f5047d.flush();
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) {
        if (this.f5041x) {
            throw new IllegalStateException("closed");
        }
        long j7 = c0710g.f8461x;
        byte[] bArr = W4.b.f4484a;
        if (j6 < 0 || 0 > j7 || j7 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f5042y.f5047d.q(c0710g, j6);
    }
}
