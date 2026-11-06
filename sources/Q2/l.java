package q2;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class l implements f, InterfaceC1262e, InterfaceC1260c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12355x;

    public /* synthetic */ l() {
        this.f12354w = 2;
        this.f12355x = new CountDownLatch(1);
    }

    @Override // q2.InterfaceC1260c
    public final void b() {
        int i6 = this.f12354w;
        Object obj = this.f12355x;
        switch (i6) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ((j) obj).f12351a.m();
                break;
        }
    }

    @Override // q2.f
    public final void c(Object obj) {
        int i6 = this.f12354w;
        Object obj2 = this.f12355x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((l) obj2).b();
                break;
            default:
                ((CountDownLatch) obj2).countDown();
                break;
        }
    }

    @Override // q2.InterfaceC1262e
    public final void g(Exception exc) {
        ((CountDownLatch) this.f12355x).countDown();
    }

    public l(int i6) {
        this.f12354w = i6;
        if (i6 != 3) {
            this.f12355x = new l(3);
        } else {
            this.f12355x = new s();
        }
    }

    public l(j jVar) {
        this.f12354w = 4;
        this.f12355x = jVar;
    }

    public l(l lVar) {
        this.f12354w = 0;
        this.f12355x = lVar;
    }
}
