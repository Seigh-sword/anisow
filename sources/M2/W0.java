package m2;

/* JADX INFO: loaded from: classes.dex */
public final class W0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ U0 f10796x;

    public /* synthetic */ W0(U0 u02, int i6) {
        this.f10795w = i6;
        this.f10796x = u02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10795w;
        U0 u02 = this.f10796x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                u02.f10771A = u02.f10776F;
                break;
            default:
                u02.f10776F = null;
                break;
        }
    }
}
