package m;

/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10204h;

    public final void a(int i6, int i7) {
        this.f10199c = i6;
        this.f10200d = i7;
        this.f10204h = true;
        if (this.f10203g) {
            if (i7 != Integer.MIN_VALUE) {
                this.f10197a = i7;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f10198b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f10197a = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f10198b = i7;
        }
    }
}
