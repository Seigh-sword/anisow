package d;

import androidx.lifecycle.AbstractC0315o;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0319t;
import androidx.lifecycle.InterfaceC0321v;
import h0.L;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0615C implements InterfaceC0319t, InterfaceC0622c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC0315o f8076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AbstractC0641v f8077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0616D f8078y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0618F f8079z;

    public C0615C(C0618F c0618f, AbstractC0315o abstractC0315o, L l5) {
        AbstractC1305a.o(l5, "onBackPressedCallback");
        this.f8079z = c0618f;
        this.f8076w = abstractC0315o;
        this.f8077x = l5;
        abstractC0315o.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        if (enumC0313m != EnumC0313m.ON_START) {
            if (enumC0313m != EnumC0313m.ON_STOP) {
                if (enumC0313m == EnumC0313m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0616D c0616d = this.f8078y;
                if (c0616d != null) {
                    c0616d.cancel();
                    return;
                }
                return;
            }
        }
        C0618F c0618f = this.f8079z;
        c0618f.getClass();
        AbstractC0641v abstractC0641v = this.f8077x;
        AbstractC1305a.o(abstractC0641v, "onBackPressedCallback");
        c0618f.f8084b.addLast(abstractC0641v);
        C0616D c0616d2 = new C0616D(c0618f, abstractC0641v);
        abstractC0641v.f8150b.add(c0616d2);
        c0618f.e();
        abstractC0641v.f8151c = new C0617E(1, c0618f);
        this.f8078y = c0616d2;
    }

    @Override // d.InterfaceC0622c
    public final void cancel() {
        this.f8076w.b(this);
        AbstractC0641v abstractC0641v = this.f8077x;
        abstractC0641v.getClass();
        abstractC0641v.f8150b.remove(this);
        C0616D c0616d = this.f8078y;
        if (c0616d != null) {
            c0616d.cancel();
        }
        this.f8078y = null;
    }
}
