package j3;

/* JADX INFO: renamed from: j3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0867q implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0868r f9510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f9511y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f9512z;

    public /* synthetic */ RunnableC0867q(C0868r c0868r, long j6, String str, int i6) {
        this.f9509w = i6;
        this.f9510x = c0868r;
        this.f9511y = j6;
        this.f9512z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f9509w;
        C0868r c0868r = this.f9510x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0868r.f9527o.f9656b.a(new RunnableC0867q(c0868r, this.f9511y, this.f9512z, 1));
                break;
            default:
                C0863m c0863m = c0868r.f9519g;
                C0870t c0870t = c0863m.f9499n;
                if (c0870t == null || !c0870t.f9539e.get()) {
                    c0863m.f9494i.f10040b.g(this.f9512z, this.f9511y);
                }
                break;
        }
    }
}
