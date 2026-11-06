package n0;

import androidx.lifecycle.b0;
import d.AbstractC0628i;
import s.l;

/* JADX INFO: renamed from: n0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1144b extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1143a f11683c = new C1143a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f11684b = new l();

    @Override // androidx.lifecycle.b0
    public final void d() {
        l lVar = this.f11684b;
        int i6 = lVar.f12538y;
        if (i6 > 0) {
            AbstractC0628i.p(lVar.f12537x[0]);
            throw null;
        }
        Object[] objArr = lVar.f12537x;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        lVar.f12538y = 0;
    }
}
