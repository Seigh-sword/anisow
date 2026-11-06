package V4;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: V4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0173d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3836m;

    static {
        C0172c c0172c = new C0172c();
        c0172c.f3821a = true;
        new C0173d(c0172c);
        C0172c c0172c2 = new C0172c();
        c0172c2.f3823c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        c0172c2.f3822b = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        new C0173d(c0172c2);
    }

    public C0173d(C0172c c0172c) {
        this.f3824a = c0172c.f3821a;
        this.f3825b = false;
        this.f3826c = -1;
        this.f3827d = -1;
        this.f3828e = false;
        this.f3829f = false;
        this.f3830g = false;
        this.f3831h = c0172c.f3822b;
        this.f3832i = -1;
        this.f3833j = c0172c.f3823c;
        this.f3834k = false;
        this.f3835l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static V4.C0173d a(V4.p r22) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.C0173d.a(V4.p):V4.d");
    }

    public final String toString() {
        String string = this.f3836m;
        if (string == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f3824a) {
                sb.append("no-cache, ");
            }
            if (this.f3825b) {
                sb.append("no-store, ");
            }
            int i6 = this.f3826c;
            if (i6 != -1) {
                sb.append("max-age=");
                sb.append(i6);
                sb.append(", ");
            }
            int i7 = this.f3827d;
            if (i7 != -1) {
                sb.append("s-maxage=");
                sb.append(i7);
                sb.append(", ");
            }
            if (this.f3828e) {
                sb.append("private, ");
            }
            if (this.f3829f) {
                sb.append("public, ");
            }
            if (this.f3830g) {
                sb.append("must-revalidate, ");
            }
            int i8 = this.f3831h;
            if (i8 != -1) {
                sb.append("max-stale=");
                sb.append(i8);
                sb.append(", ");
            }
            int i9 = this.f3832i;
            if (i9 != -1) {
                sb.append("min-fresh=");
                sb.append(i9);
                sb.append(", ");
            }
            if (this.f3833j) {
                sb.append("only-if-cached, ");
            }
            if (this.f3834k) {
                sb.append("no-transform, ");
            }
            if (this.f3835l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                string = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                string = sb.toString();
            }
            this.f3836m = string;
        }
        return string;
    }

    public C0173d(boolean z5, boolean z6, int i6, int i7, boolean z7, boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, String str) {
        this.f3824a = z5;
        this.f3825b = z6;
        this.f3826c = i6;
        this.f3827d = i7;
        this.f3828e = z7;
        this.f3829f = z8;
        this.f3830g = z9;
        this.f3831h = i8;
        this.f3832i = i9;
        this.f3833j = z10;
        this.f3834k = z11;
        this.f3835l = z12;
        this.f3836m = str;
    }
}
