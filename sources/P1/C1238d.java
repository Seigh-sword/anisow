package p1;

import j1.EnumC0843a;

/* JADX INFO: renamed from: p1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1238d implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f12242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1237c f12243x;

    public C1238d(byte[] bArr, InterfaceC1237c interfaceC1237c) {
        this.f12242w = bArr;
        this.f12243x = interfaceC1237c;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return this.f12243x.b();
    }

    @Override // com.bumptech.glide.load.data.e
    public final EnumC0843a d() {
        return EnumC0843a.f9424w;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        dVar.l(this.f12243x.g(this.f12242w));
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}
