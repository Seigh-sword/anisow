package P4;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2698a;

    @Override // P4.h0
    public final InterfaceC0146g a(Q4.B b6) {
        switch (this.f2698a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C0150k();
            default:
                return new C0150k(new k0(b6, null));
        }
    }

    public final String toString() {
        switch (this.f2698a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
