package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1088a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f11453e;

    public final C1090b0 a() {
        String str;
        if (this.f11453e == 7 && (str = this.f11449a) != null) {
            return new C1090b0(str, this.f11450b, this.f11451c, this.f11452d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11449a == null) {
            sb.append(" processName");
        }
        if ((this.f11453e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f11453e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f11453e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(AbstractC0628i.k("Missing required properties:", sb));
    }
}
