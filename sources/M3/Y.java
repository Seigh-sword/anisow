package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f11439f;

    public final Z a() {
        String str;
        if (this.f11439f == 7 && (str = this.f11435b) != null) {
            return new Z(this.f11434a, str, this.f11436c, this.f11437d, this.f11438e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11439f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f11435b == null) {
            sb.append(" symbol");
        }
        if ((this.f11439f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f11439f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
