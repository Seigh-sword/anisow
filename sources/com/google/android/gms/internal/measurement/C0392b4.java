package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0392b4 implements Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0444k2 f6765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0444k2 f6766b;

    static {
        C0450l2 c0450l2 = new C0450l2(null, AbstractC0426h2.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        c0450l2.c("measurement.client.ad_id_consent_fix", true);
        c0450l2.c("measurement.service.consent.aiid_reset_fix", false);
        c0450l2.c("measurement.service.consent.aiid_reset_fix2", true);
        c0450l2.c("measurement.service.consent.app_start_fix", true);
        f6765a = c0450l2.c("measurement.service.consent.params_on_fx", true);
        f6766b = c0450l2.c("measurement.service.consent.pfo_on_fx", true);
    }
}
