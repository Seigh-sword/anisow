package o0;

import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public final class J extends D4.i implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0803c f11777A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f11778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ I f11779y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ G f11780z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(I i6, C0803c c0803c) {
        super(1);
        F f6 = F.f11748c;
        this.f11778x = false;
        this.f11779y = i6;
        this.f11780z = f6;
        this.f11777A = c0803c;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        H hB;
        C1197m c1197m = (C1197m) obj;
        if (c1197m == null || (hB = c1197m.f12013d) == null) {
            hB = H.f11767d;
        }
        H hB2 = c1197m != null ? c1197m.f12014e : null;
        boolean z5 = this.f11778x;
        G g4 = this.f11780z;
        I i6 = this.f11779y;
        if (z5) {
            hB2 = H.f11767d.b(i6, g4);
        } else {
            hB = hB.b(i6, g4);
        }
        return C0803c.i(this.f11777A, c1197m, hB, hB2);
    }
}
