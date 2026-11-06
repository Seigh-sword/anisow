package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0472p0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f6919A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6920B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Object f6921C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0472p0(C0466o0 c0466o0, Object obj, int i6) {
        super(c0466o0, true);
        this.f6919A = i6;
        this.f6921C = obj;
        this.f6920B = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        switch (this.f6919A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y y5 = this.f6920B.f6915h;
                AbstractC1332d.m(y5);
                y5.setConditionalUserProperty((Bundle) this.f6921C, this.f6862w);
                break;
            case 1:
                if (((Boolean) this.f6921C) == null) {
                    Y y6 = this.f6920B.f6915h;
                    AbstractC1332d.m(y6);
                    y6.clearMeasurementEnabled(this.f6862w);
                } else {
                    Y y7 = this.f6920B.f6915h;
                    AbstractC1332d.m(y7);
                    y7.setMeasurementEnabled(((Boolean) this.f6921C).booleanValue(), this.f6862w);
                }
                break;
            default:
                Y y8 = this.f6920B.f6915h;
                AbstractC1332d.m(y8);
                y8.registerOnMeasurementEventListener((BinderC0454m0) this.f6921C);
                break;
        }
    }
}
