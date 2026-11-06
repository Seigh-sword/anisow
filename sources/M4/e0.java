package M4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends k0 implements InterfaceC0071p {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f1883y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b0 b0Var) {
        super(true);
        boolean z5 = true;
        N(b0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k0.f1906x;
        InterfaceC0066k interfaceC0066k = (InterfaceC0066k) atomicReferenceFieldUpdater.get(this);
        C0067l c0067l = interfaceC0066k instanceof C0067l ? (C0067l) interfaceC0066k : null;
        if (c0067l != null) {
            do {
                k0 k0VarK = c0067l.k();
                if (k0VarK.H()) {
                    break;
                }
                InterfaceC0066k interfaceC0066k2 = (InterfaceC0066k) atomicReferenceFieldUpdater.get(k0VarK);
                c0067l = interfaceC0066k2 instanceof C0067l ? (C0067l) interfaceC0066k2 : null;
            } while (c0067l != null);
            z5 = false;
        } else {
            z5 = false;
        }
        this.f1883y = z5;
    }

    @Override // M4.k0
    public final boolean H() {
        return this.f1883y;
    }

    @Override // M4.k0
    public final boolean I() {
        return true;
    }
}
