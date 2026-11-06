package o0;

import d.AbstractC0628i;
import t4.C1351h;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1173b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f11890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1168D[] f11891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1351h f11892c;

    public C1173b() {
        int length = I.values().length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            iArr[i6] = 1;
        }
        this.f11890a = iArr;
        int length2 = I.values().length;
        C1168D[] c1168dArr = new C1168D[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            c1168dArr[i7] = null;
        }
        this.f11891b = c1168dArr;
        this.f11892c = new C1351h();
    }

    public final void a(I i6, int i7) {
        AbstractC0628i.o(i7, "state");
        this.f11890a[i6.ordinal()] = i7;
    }
}
