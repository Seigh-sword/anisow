package V4;

import d.AbstractC0628i;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: V4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0178i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f3865j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f3866k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f3867l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f3868m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3877i;

    public C0178i(String str, String str2, long j6, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f3869a = str;
        this.f3870b = str2;
        this.f3871c = j6;
        this.f3872d = str3;
        this.f3873e = str4;
        this.f3874f = z5;
        this.f3875g = z6;
        this.f3877i = z7;
        this.f3876h = z8;
    }

    public static int a(int i6, int i7, String str, boolean z5) {
        while (i6 < i7) {
            char cCharAt = str.charAt(i6);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z5)) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(java.lang.String r14, int r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.C0178i.b(java.lang.String, int):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0178i)) {
            return false;
        }
        C0178i c0178i = (C0178i) obj;
        return c0178i.f3869a.equals(this.f3869a) && c0178i.f3870b.equals(this.f3870b) && c0178i.f3872d.equals(this.f3872d) && c0178i.f3873e.equals(this.f3873e) && c0178i.f3871c == this.f3871c && c0178i.f3874f == this.f3874f && c0178i.f3875g == this.f3875g && c0178i.f3876h == this.f3876h && c0178i.f3877i == this.f3877i;
    }

    public final int hashCode() {
        int iE = AbstractC0628i.e(this.f3873e, AbstractC0628i.e(this.f3872d, AbstractC0628i.e(this.f3870b, AbstractC0628i.e(this.f3869a, 527, 31), 31), 31), 31);
        long j6 = this.f3871c;
        return ((((((((iE + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (!this.f3874f ? 1 : 0)) * 31) + (!this.f3875g ? 1 : 0)) * 31) + (!this.f3876h ? 1 : 0)) * 31) + (!this.f3877i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3869a);
        sb.append('=');
        sb.append(this.f3870b);
        if (this.f3876h) {
            long j6 = this.f3871c;
            if (j6 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) Z4.d.f4968a.get()).format(new Date(j6)));
            }
        }
        if (!this.f3877i) {
            sb.append("; domain=");
            sb.append(this.f3872d);
        }
        sb.append("; path=");
        sb.append(this.f3873e);
        if (this.f3874f) {
            sb.append("; secure");
        }
        if (this.f3875g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
