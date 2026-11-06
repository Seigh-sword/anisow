package P4;

import M4.C0063h;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements M4.K {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c0 f2646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f2647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f2648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC1427e f2649z;

    public a0(c0 c0Var, long j6, Object obj, C0063h c0063h) {
        this.f2646w = c0Var;
        this.f2647x = j6;
        this.f2648y = obj;
        this.f2649z = c0063h;
    }

    @Override // M4.K
    public final void a() {
        c0 c0Var = this.f2646w;
        synchronized (c0Var) {
            if (this.f2647x < c0Var.q()) {
                return;
            }
            Object[] objArr = c0Var.f2665D;
            AbstractC1305a.l(objArr);
            long j6 = this.f2647x;
            if (objArr[((int) j6) & (objArr.length - 1)] == this) {
                d0.c(objArr, j6, d0.f2673a);
                c0Var.l();
            }
        }
    }
}
