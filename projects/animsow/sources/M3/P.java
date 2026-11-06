package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F0 f11395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G0 f11396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H0 f11397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K0 f11398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f11399g;

    public final Q a() {
        String str;
        F0 f02;
        G0 g02;
        if (this.f11399g == 1 && (str = this.f11394b) != null && (f02 = this.f11395c) != null && (g02 = this.f11396d) != null) {
            return new Q(this.f11393a, str, f02, g02, this.f11397e, this.f11398f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f11399g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f11394b == null) {
            sb.append(" type");
        }
        if (this.f11395c == null) {
            sb.append(" app");
        }
        if (this.f11396d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
