package m3;

import d.AbstractC0628i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f11323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f11324j;

    public final E a() {
        String str;
        if (this.f11324j == 63 && (str = this.f11316b) != null) {
            return new E(this.f11315a, str, this.f11317c, this.f11318d, this.f11319e, this.f11320f, this.f11321g, this.f11322h, this.f11323i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11324j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f11316b == null) {
            sb.append(" processName");
        }
        if ((this.f11324j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f11324j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f11324j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f11324j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.f11324j & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
