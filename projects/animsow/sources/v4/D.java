package V4;

import f5.InterfaceC0711h;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f3762c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f3760a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3763d = 0;

    public D(int i6, byte[] bArr) {
        this.f3761b = i6;
        this.f3762c = bArr;
    }

    @Override // V4.E
    public final long a() {
        return this.f3761b;
    }

    @Override // V4.E
    public final t b() {
        return this.f3760a;
    }

    @Override // V4.E
    public final void c(InterfaceC0711h interfaceC0711h) {
        interfaceC0711h.f(this.f3762c, this.f3763d, this.f3761b);
    }
}
