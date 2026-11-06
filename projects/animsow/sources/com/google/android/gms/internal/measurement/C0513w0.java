package com.google.android.gms.internal.measurement;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0513w0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f6985A = "Error with data collection. Data lost.";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f6986B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6987C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0513w0(C0466o0 c0466o0, Object obj) {
        super(c0466o0, false);
        this.f6986B = obj;
        this.f6987C = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        Y y5 = this.f6987C.f6915h;
        AbstractC1332d.m(y5);
        y5.logHealthData(5, this.f6985A, new e2.b(this.f6986B), new e2.b(null), new e2.b(null));
    }
}
