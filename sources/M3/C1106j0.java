package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1106j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f11552e;

    public final C1108k0 a() {
        String str;
        String str2;
        if (this.f11552e == 3 && (str = this.f11549b) != null && (str2 = this.f11550c) != null) {
            return new C1108k0(this.f11548a, str, str2, this.f11551d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11552e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f11549b == null) {
            sb.append(" version");
        }
        if (this.f11550c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f11552e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
