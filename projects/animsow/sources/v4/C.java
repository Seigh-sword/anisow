package V4;

import f5.InterfaceC0711h;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3757a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3759c;

    public C(t tVar, f5.j jVar) {
        this.f3758b = tVar;
        this.f3759c = jVar;
    }

    @Override // V4.E
    public final long a() {
        int i6 = this.f3757a;
        Object obj = this.f3759c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((f5.j) obj).d();
            default:
                return ((E) obj).a();
        }
    }

    @Override // V4.E
    public final t b() {
        return this.f3758b;
    }

    @Override // V4.E
    public final void c(InterfaceC0711h interfaceC0711h) {
        int i6 = this.f3757a;
        Object obj = this.f3759c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                interfaceC0711h.t((f5.j) obj);
                break;
            default:
                ((E) obj).c(interfaceC0711h);
                break;
        }
    }

    public C(E e6, t tVar) {
        this.f3759c = e6;
        this.f3758b = tVar;
    }
}
