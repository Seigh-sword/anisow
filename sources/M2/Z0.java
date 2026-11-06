package m2;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends AbstractC1059n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y0 f10838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z0(Y0 y02, InterfaceC1079w0 interfaceC1079w0, int i6) {
        super(interfaceC1079w0);
        this.f10837e = i6;
        this.f10838f = y02;
    }

    @Override // m2.AbstractC1059n
    public final void c() {
        int i6 = this.f10837e;
        Y0 y02 = this.f10838f;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                y02.r();
                if (y02.I()) {
                    y02.f().f10723J.d("Inactivity, disconnecting from the service");
                    y02.H();
                }
                break;
            default:
                y02.f().f10718E.d("Tasks have been queued for a long time");
                break;
        }
    }
}
