package w;

import d2.AbstractC0651b;
import java.util.ArrayList;
import x.o;

/* JADX INFO: renamed from: w.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1443j extends C1437d implements InterfaceC1442i {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C1437d[] f13486q0 = new C1437d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f13487r0 = 0;

    public final void S(int i6, o oVar, ArrayList arrayList) {
        for (int i7 = 0; i7 < this.f13487r0; i7++) {
            C1437d c1437d = this.f13486q0[i7];
            ArrayList arrayList2 = oVar.f13648a;
            if (!arrayList2.contains(c1437d)) {
                arrayList2.add(c1437d);
            }
        }
        for (int i8 = 0; i8 < this.f13487r0; i8++) {
            AbstractC0651b.n(this.f13486q0[i8], i6, arrayList, oVar);
        }
    }

    public void a() {
    }
}
