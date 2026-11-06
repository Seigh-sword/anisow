package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0525y0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f7002B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f7003C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Bundle f7004D;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f7007G;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Long f7001A = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ boolean f7005E = true;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ boolean f7006F = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525y0(C0466o0 c0466o0, String str, String str2, Bundle bundle) {
        super(c0466o0, true);
        this.f7002B = str;
        this.f7003C = str2;
        this.f7004D = bundle;
        this.f7007G = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        Long l5 = this.f7001A;
        long jLongValue = l5 == null ? this.f6862w : l5.longValue();
        Y y5 = this.f7007G.f6915h;
        AbstractC1332d.m(y5);
        y5.logEvent(this.f7002B, this.f7003C, this.f7004D, this.f7005E, this.f7006F, jLongValue);
    }
}
