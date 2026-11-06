package P4;

import Q4.AbstractC0168b;
import Q4.AbstractC0169c;
import java.util.concurrent.atomic.AtomicReference;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Q4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f2749a = new AtomicReference(null);

    @Override // Q4.d
    public final boolean a(AbstractC0168b abstractC0168b) {
        AtomicReference atomicReference = this.f2749a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(d0.f2674b);
        return true;
    }

    @Override // Q4.d
    public final InterfaceC1427e[] b(AbstractC0168b abstractC0168b) {
        this.f2749a.set(null);
        return AbstractC0169c.f2834a;
    }
}
