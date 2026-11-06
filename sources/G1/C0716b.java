package g1;

import f1.C0694b;

/* JADX INFO: renamed from: g1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0716b extends D4.i implements C4.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8512x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0716b(int i6) {
        super(0);
        this.f8512x = i6;
    }

    @Override // C4.a
    public final Object b() {
        return new C0694b(this.f8512x);
    }
}
