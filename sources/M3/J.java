package m3;

import d.AbstractC0628i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f11347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w0 f11349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N0 f11350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M0 f11351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x0 f11352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f11353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f11355m;

    public final K a() {
        String str;
        String str2;
        w0 w0Var;
        if (this.f11355m == 7 && (str = this.f11343a) != null && (str2 = this.f11344b) != null && (w0Var = this.f11349g) != null) {
            return new K(str, str2, this.f11345c, this.f11346d, this.f11347e, this.f11348f, w0Var, this.f11350h, this.f11351i, this.f11352j, this.f11353k, this.f11354l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11343a == null) {
            sb.append(" generator");
        }
        if (this.f11344b == null) {
            sb.append(" identifier");
        }
        if ((this.f11355m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f11355m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f11349g == null) {
            sb.append(" app");
        }
        if ((this.f11355m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
