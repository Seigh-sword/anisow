package I0;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f1085i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1090e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1086a = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1091f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1092g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f1093h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f1086a = 1;
        cVar.f1091f = -1L;
        cVar.f1092g = -1L;
        new HashSet();
        cVar.f1087b = false;
        cVar.f1088c = false;
        cVar.f1086a = 1;
        cVar.f1089d = false;
        cVar.f1090e = false;
        cVar.f1093h = eVar;
        cVar.f1091f = -1L;
        cVar.f1092g = -1L;
        f1085i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1087b == cVar.f1087b && this.f1088c == cVar.f1088c && this.f1089d == cVar.f1089d && this.f1090e == cVar.f1090e && this.f1091f == cVar.f1091f && this.f1092g == cVar.f1092g && this.f1086a == cVar.f1086a) {
            return this.f1093h.equals(cVar.f1093h);
        }
        return false;
    }

    public final int hashCode() {
        int iB = ((((((((u.h.b(this.f1086a) * 31) + (this.f1087b ? 1 : 0)) * 31) + (this.f1088c ? 1 : 0)) * 31) + (this.f1089d ? 1 : 0)) * 31) + (this.f1090e ? 1 : 0)) * 31;
        long j6 = this.f1091f;
        int i6 = (iB + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f1092g;
        return this.f1093h.f1096a.hashCode() + ((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }
}
