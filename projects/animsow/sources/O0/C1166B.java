package o0;

import M4.C0078x;
import M4.InterfaceC0066k;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1430h;
import v4.InterfaceC1431i;

/* JADX INFO: renamed from: o0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1166B extends D4.i implements C4.p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11735y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1166B(int i6, Object obj) {
        super(2);
        this.f11734x = i6;
        this.f11735y = obj;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        int i6 = this.f11734x;
        Object obj3 = this.f11735y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C1222z c1222z = (C1222z) obj;
                C1222z c1222z2 = (C1222z) obj2;
                AbstractC1305a.o(c1222z, "prependHint");
                AbstractC1305a.o(c1222z2, "appendHint");
                C1 c12 = (C1) obj3;
                if (com.bumptech.glide.d.z(c12, c1222z.f12165a, I.f11773x)) {
                    c1222z.f12165a = c12;
                    c1222z.f12166b.c(c12);
                }
                if (com.bumptech.glide.d.z(c12, c1222z2.f12165a, I.f11774y)) {
                    c1222z2.f12165a = c12;
                    c1222z2.f12166b.c(c12);
                }
                return C1316l.f12640a;
            default:
                int iIntValue = ((Number) obj).intValue();
                InterfaceC1430h interfaceC1430h = (InterfaceC1430h) obj2;
                InterfaceC1431i key = interfaceC1430h.getKey();
                InterfaceC1430h interfaceC1430hN = ((Q4.w) obj3).f2876A.n(key);
                if (key != C0078x.f1930x) {
                    return Integer.valueOf(interfaceC1430h != interfaceC1430hN ? Integer.MIN_VALUE : iIntValue + 1);
                }
                M4.b0 b0Var = (M4.b0) interfaceC1430hN;
                M4.b0 b0Var2 = (M4.b0) interfaceC1430h;
                while (true) {
                    M4.b0 parent = null;
                    if (b0Var2 == null) {
                        b0Var2 = null;
                    } else if (b0Var2 != b0Var && (b0Var2 instanceof R4.t)) {
                        InterfaceC0066k interfaceC0066k = (InterfaceC0066k) M4.k0.f1906x.get((M4.k0) b0Var2);
                        if (interfaceC0066k != null) {
                            parent = interfaceC0066k.getParent();
                        }
                        b0Var2 = parent;
                    }
                }
                if (b0Var2 == b0Var) {
                    if (b0Var != null) {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b0Var2 + ", expected child of " + b0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }
}
