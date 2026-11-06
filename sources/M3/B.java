package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f11296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public O0 f11299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f11300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r0 f11301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f11302m;

    public final C a() {
        if (this.f11302m == 1 && this.f11290a != null && this.f11291b != null && this.f11293d != null && this.f11297h != null && this.f11298i != null) {
            return new C(this.f11290a, this.f11291b, this.f11292c, this.f11293d, this.f11294e, this.f11295f, this.f11296g, this.f11297h, this.f11298i, this.f11299j, this.f11300k, this.f11301l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11290a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f11291b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f11302m) == 0) {
            sb.append(" platform");
        }
        if (this.f11293d == null) {
            sb.append(" installationUuid");
        }
        if (this.f11297h == null) {
            sb.append(" buildVersion");
        }
        if (this.f11298i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
