package a5;

import f5.C0710g;
import f5.E;
import f5.G;
import f5.o;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements E {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f5028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5029x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f5030y;

    public a(g gVar) {
        this.f5030y = gVar;
        this.f5028w = new o(gVar.f5046c.d());
    }

    @Override // f5.E
    public long G(C0710g c0710g, long j6) throws IOException {
        g gVar = this.f5030y;
        try {
            return gVar.f5046c.G(c0710g, j6);
        } catch (IOException e6) {
            gVar.f5045b.h();
            b();
            throw e6;
        }
    }

    public final void b() {
        g gVar = this.f5030y;
        int i6 = gVar.f5048e;
        if (i6 == 6) {
            return;
        }
        if (i6 != 5) {
            throw new IllegalStateException("state: " + gVar.f5048e);
        }
        o oVar = this.f5028w;
        G g4 = oVar.f8474e;
        oVar.f8474e = G.f8433d;
        g4.a();
        g4.b();
        gVar.f5048e = 6;
    }

    @Override // f5.E
    public final G d() {
        return this.f5028w;
    }
}
