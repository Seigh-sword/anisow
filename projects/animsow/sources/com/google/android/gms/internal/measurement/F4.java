package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class F4 implements C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0444k2 f6593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0444k2 f6594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0444k2 f6595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0444k2 f6596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0444k2 f6597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0444k2 f6598f;

    static {
        C0450l2 c0450l2 = new C0450l2(null, AbstractC0426h2.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        f6593a = c0450l2.c("measurement.test.boolean_flag", false);
        f6594b = c0450l2.a("measurement.test.cached_long_flag", -1L);
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = AbstractC0420g2.f6817g;
        f6595c = new C0444k2(c0450l2, "measurement.test.double_flag", dValueOf, 1);
        f6596d = c0450l2.a("measurement.test.int_flag", -2L);
        f6597e = c0450l2.a("measurement.test.long_flag", -1L);
        f6598f = c0450l2.b("measurement.test.string_flag", "---");
    }
}
