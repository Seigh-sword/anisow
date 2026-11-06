package com.google.android.gms.internal.measurement;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0501u0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f6964A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f6965B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6966C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0501u0(C0466o0 c0466o0, String str, int i6) {
        super(c0466o0, true);
        this.f6964A = i6;
        this.f6965B = str;
        this.f6966C = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        switch (this.f6964A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y y5 = this.f6966C.f6915h;
                AbstractC1332d.m(y5);
                y5.endAdUnitExposure(this.f6965B, this.f6863x);
                break;
            default:
                Y y6 = this.f6966C.f6915h;
                AbstractC1332d.m(y6);
                y6.beginAdUnitExposure(this.f6965B, this.f6863x);
                break;
        }
    }
}
