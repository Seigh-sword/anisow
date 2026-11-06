package com.google.android.gms.internal.measurement;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0507v0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f6975A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Z f6976B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6977C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507v0(C0466o0 c0466o0, Z z5, int i6) {
        super(c0466o0, true);
        this.f6975A = i6;
        this.f6976B = z5;
        this.f6977C = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        switch (this.f6975A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y y5 = this.f6977C.f6915h;
                AbstractC1332d.m(y5);
                y5.getCachedAppInstanceId(this.f6976B);
                break;
            case 1:
                Y y6 = this.f6977C.f6915h;
                AbstractC1332d.m(y6);
                y6.getGmpAppId(this.f6976B);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Y y7 = this.f6977C.f6915h;
                AbstractC1332d.m(y7);
                y7.getCurrentScreenName(this.f6976B);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                Y y8 = this.f6977C.f6915h;
                AbstractC1332d.m(y8);
                y8.generateEventId(this.f6976B);
                break;
            default:
                Y y9 = this.f6977C.f6915h;
                AbstractC1332d.m(y9);
                y9.getCurrentScreenClass(this.f6976B);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void b() {
        int i6 = this.f6975A;
        Z z5 = this.f6976B;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                z5.d(null);
                break;
            case 1:
                z5.d(null);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                z5.d(null);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                z5.d(null);
                break;
            default:
                z5.d(null);
                break;
        }
    }
}
