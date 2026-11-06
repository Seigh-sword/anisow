package q2;

import java.util.concurrent.Executor;
import m2.RunnableC1028c1;

/* JADX INFO: loaded from: classes.dex */
public final class n implements q, f, InterfaceC1262e, InterfaceC1260c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f12365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC1258a f12366y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s f12367z;

    public /* synthetic */ n(Executor executor, InterfaceC1258a interfaceC1258a, s sVar, int i6) {
        this.f12364w = i6;
        this.f12365x = executor;
        this.f12366y = interfaceC1258a;
        this.f12367z = sVar;
    }

    @Override // q2.q
    public final void a(i iVar) {
        int i6 = this.f12364w;
        Executor executor = this.f12365x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                executor.execute(new RunnableC1028c1(this, 4, iVar));
                break;
            default:
                executor.execute(new RunnableC1028c1(this, 5, iVar));
                break;
        }
    }

    @Override // q2.InterfaceC1260c
    public final void b() {
        this.f12367z.m();
    }

    @Override // q2.f
    public final void c(Object obj) {
        this.f12367z.l(obj);
    }

    @Override // q2.InterfaceC1262e
    public final void g(Exception exc) {
        this.f12367z.k(exc);
    }
}
