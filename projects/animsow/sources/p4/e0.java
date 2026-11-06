package P4;

import M4.C0063h;
import Q4.AbstractC0168b;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Q4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0063h f2681b;

    @Override // Q4.d
    public final boolean a(AbstractC0168b abstractC0168b) {
        c0 c0Var = (c0) abstractC0168b;
        if (this.f2680a >= 0) {
            return false;
        }
        long j6 = c0Var.f2666E;
        if (j6 < c0Var.f2667F) {
            c0Var.f2667F = j6;
        }
        this.f2680a = j6;
        return true;
    }

    @Override // Q4.d
    public final InterfaceC1427e[] b(AbstractC0168b abstractC0168b) {
        long j6 = this.f2680a;
        this.f2680a = -1L;
        this.f2681b = null;
        return ((c0) abstractC0168b).w(j6);
    }
}
