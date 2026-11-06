package m1;

/* JADX INFO: renamed from: m1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005c extends L.i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10442x;

    public /* synthetic */ C1005c(int i6) {
        this.f10442x = i6;
    }

    public final InterfaceC1013k s() {
        switch (this.f10442x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C1004b(this);
            case 1:
                return new C1009g(this);
            default:
                return new C1015m(this);
        }
    }
}
