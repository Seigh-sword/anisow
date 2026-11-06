package V4;

import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B f3764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f3765b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f3768e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J f3770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public G f3771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G f3772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public G f3773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f3775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public J3.x f3776m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3766c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1486b f3769f = new C1486b(2);

    public static void b(String str, G g4) {
        if (g4.f3779C != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (g4.f3780D != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (g4.f3781E != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (g4.f3782F != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final G a() {
        if (this.f3764a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f3765b == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f3766c >= 0) {
            if (this.f3767d != null) {
                return new G(this);
            }
            throw new IllegalStateException("message == null");
        }
        throw new IllegalStateException("code < 0: " + this.f3766c);
    }
}
