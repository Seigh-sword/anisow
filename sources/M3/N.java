package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f11383j;

    public final O a() {
        String str;
        String str2;
        String str3;
        if (this.f11383j == 63 && (str = this.f11375b) != null && (str2 = this.f11381h) != null && (str3 = this.f11382i) != null) {
            return new O(this.f11374a, str, this.f11376c, this.f11377d, this.f11378e, this.f11379f, this.f11380g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11383j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f11375b == null) {
            sb.append(" model");
        }
        if ((this.f11383j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f11383j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f11383j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f11383j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f11383j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f11381h == null) {
            sb.append(" manufacturer");
        }
        if (this.f11382i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
