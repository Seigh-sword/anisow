package P2;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2511g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2512h = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f6) {
        float f7 = this.f2509e;
        if (f7 == f6) {
            return;
        }
        float f8 = ((f6 - f7) + 360.0f) % 360.0f;
        if (f8 > 180.0f) {
            return;
        }
        float f9 = this.f2507c;
        float f10 = this.f2508d;
        p pVar = new p(f9, f10, f9, f10);
        pVar.f2498f = this.f2509e;
        pVar.f2499g = f8;
        this.f2512h.add(new n(pVar));
        this.f2509e = f6;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f2511g;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) arrayList.get(i6)).a(matrix, path);
        }
    }

    public final void c(float f6, float f7) {
        q qVar = new q();
        qVar.f2500b = f6;
        qVar.f2501c = f7;
        this.f2511g.add(qVar);
        o oVar = new o(qVar, this.f2507c, this.f2508d);
        float fB = oVar.b() + 270.0f;
        float fB2 = oVar.b() + 270.0f;
        a(fB);
        this.f2512h.add(oVar);
        this.f2509e = fB2;
        this.f2507c = f6;
        this.f2508d = f7;
    }

    public final void d(float f6, float f7, float f8) {
        this.f2505a = 0.0f;
        this.f2506b = f6;
        this.f2507c = 0.0f;
        this.f2508d = f6;
        this.f2509e = f7;
        this.f2510f = (f7 + f8) % 360.0f;
        this.f2511g.clear();
        this.f2512h.clear();
    }
}
