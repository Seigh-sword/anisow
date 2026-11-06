package m2;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1070s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f11083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f11084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f11085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f11086k;

    public C1070s(String str, String str2, long j6) {
        this(str, str2, 0L, 0L, 0L, j6, 0L, null, null, null, null);
    }

    public final C1070s a(Long l5, Long l6, Boolean bool) {
        return new C1070s(this.f11076a, this.f11077b, this.f11078c, this.f11079d, this.f11080e, this.f11081f, this.f11082g, this.f11083h, l5, l6, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C1070s(String str, String str2, long j6, long j7, long j8, long j9, long j10, Long l5, Long l6, Long l7, Boolean bool) {
        AbstractC1332d.g(str);
        AbstractC1332d.g(str2);
        AbstractC1332d.c(j6 >= 0);
        AbstractC1332d.c(j7 >= 0);
        AbstractC1332d.c(j8 >= 0);
        AbstractC1332d.c(j10 >= 0);
        this.f11076a = str;
        this.f11077b = str2;
        this.f11078c = j6;
        this.f11079d = j7;
        this.f11080e = j8;
        this.f11081f = j9;
        this.f11082g = j10;
        this.f11083h = l5;
        this.f11084i = l6;
        this.f11085j = l7;
        this.f11086k = bool;
    }
}
