package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0489s0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f6945A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f6946B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f6947C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6948D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Object f6949E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0489s0(C0466o0 c0466o0, Activity activity, String str, String str2) {
        super(c0466o0, true);
        this.f6945A = 2;
        this.f6949E = activity;
        this.f6946B = str;
        this.f6947C = str2;
        this.f6948D = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        switch (this.f6945A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y y5 = this.f6948D.f6915h;
                AbstractC1332d.m(y5);
                y5.getConditionalUserProperties(this.f6946B, this.f6947C, (Z) this.f6949E);
                break;
            case 1:
                Y y6 = this.f6948D.f6915h;
                AbstractC1332d.m(y6);
                y6.clearConditionalUserProperty(this.f6946B, this.f6947C, (Bundle) this.f6949E);
                break;
            default:
                Y y7 = this.f6948D.f6915h;
                AbstractC1332d.m(y7);
                y7.setCurrentScreen(new e2.b((Activity) this.f6949E), this.f6946B, this.f6947C, this.f6862w);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void b() {
        switch (this.f6945A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((Z) this.f6949E).d(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0489s0(C0466o0 c0466o0, String str, String str2, Object obj, int i6) {
        super(c0466o0, true);
        this.f6945A = i6;
        this.f6946B = str;
        this.f6947C = str2;
        this.f6949E = obj;
        this.f6948D = c0466o0;
    }
}
