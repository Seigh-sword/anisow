package o0;

import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: renamed from: o0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1165A extends D4.i implements C4.p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ I f11719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1 f11720y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165A(I i6, C1 c12) {
        super(2);
        this.f11719x = i6;
        this.f11720y = c12;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        P4.c0 c0Var;
        C1222z c1222z = (C1222z) obj;
        C1222z c1222z2 = (C1222z) obj2;
        AbstractC1305a.o(c1222z, "prependHint");
        AbstractC1305a.o(c1222z2, "appendHint");
        I i6 = I.f11773x;
        I i7 = this.f11719x;
        C1 c12 = this.f11720y;
        if (i7 == i6) {
            c1222z.f12165a = c12;
            if (c12 != null) {
                c0Var = c1222z.f12166b;
                c0Var.c(c12);
            }
        } else {
            c1222z2.f12165a = c12;
            if (c12 != null) {
                c0Var = c1222z2.f12166b;
                c0Var.c(c12);
            }
        }
        return C1316l.f12640a;
    }
}
