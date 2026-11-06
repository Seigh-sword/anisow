package R0;

import I0.o;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2901b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public I0.g f2904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public I0.g f2905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public I0.c f2909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2917r;

    static {
        o.y("WorkSpec");
    }

    public i(String str, String str2) {
        I0.g gVar = I0.g.f1099c;
        this.f2904e = gVar;
        this.f2905f = gVar;
        this.f2909j = I0.c.f1085i;
        this.f2911l = 1;
        this.f2912m = 30000L;
        this.f2915p = -1L;
        this.f2917r = 1;
        this.f2900a = str;
        this.f2902c = str2;
    }

    public final long a() {
        int i6;
        if (this.f2901b == 1 && (i6 = this.f2910k) > 0) {
            return Math.min(18000000L, this.f2911l == 2 ? this.f2912m * ((long) i6) : (long) Math.scalb(this.f2912m, i6 - 1)) + this.f2913n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f2913n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f2906g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j6 = this.f2913n;
        if (j6 == 0) {
            j6 = this.f2906g + jCurrentTimeMillis2;
        }
        long j7 = this.f2908i;
        long j8 = this.f2907h;
        if (j7 != j8) {
            return j6 + j8 + (j6 == 0 ? j7 * (-1) : 0L);
        }
        return j6 + (j6 != 0 ? j8 : 0L);
    }

    public final boolean b() {
        return !I0.c.f1085i.equals(this.f2909j);
    }

    public final boolean c() {
        return this.f2907h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f2906g != iVar.f2906g || this.f2907h != iVar.f2907h || this.f2908i != iVar.f2908i || this.f2910k != iVar.f2910k || this.f2912m != iVar.f2912m || this.f2913n != iVar.f2913n || this.f2914o != iVar.f2914o || this.f2915p != iVar.f2915p || this.f2916q != iVar.f2916q || !this.f2900a.equals(iVar.f2900a) || this.f2901b != iVar.f2901b || !this.f2902c.equals(iVar.f2902c)) {
            return false;
        }
        String str = this.f2903d;
        if (str == null ? iVar.f2903d == null : str.equals(iVar.f2903d)) {
            return this.f2904e.equals(iVar.f2904e) && this.f2905f.equals(iVar.f2905f) && this.f2909j.equals(iVar.f2909j) && this.f2911l == iVar.f2911l && this.f2917r == iVar.f2917r;
        }
        return false;
    }

    public final int hashCode() {
        int iE = AbstractC0628i.e(this.f2902c, (u.h.b(this.f2901b) + (this.f2900a.hashCode() * 31)) * 31, 31);
        String str = this.f2903d;
        int iHashCode = (this.f2905f.hashCode() + ((this.f2904e.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j6 = this.f2906g;
        int i6 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f2907h;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f2908i;
        int iB = (u.h.b(this.f2911l) + ((((this.f2909j.hashCode() + ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31) + this.f2910k) * 31)) * 31;
        long j9 = this.f2912m;
        int i8 = (iB + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f2913n;
        int i9 = (i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f2914o;
        int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f2915p;
        return u.h.b(this.f2917r) + ((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f2916q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return AbstractC0628i.m(new StringBuilder("{WorkSpec: "), this.f2900a, "}");
    }
}
