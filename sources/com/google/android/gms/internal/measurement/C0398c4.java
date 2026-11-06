package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0398c4 implements InterfaceC0404d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0444k2 f6777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0444k2 f6778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0444k2 f6779c;

    static {
        C0450l2 c0450l2 = new C0450l2(null, AbstractC0426h2.a("com.google.android.gms.measurement"), "", "", true, false, true, false, null);
        c0450l2.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f6777a = c0450l2.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f6778b = c0450l2.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f6779c = c0450l2.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
