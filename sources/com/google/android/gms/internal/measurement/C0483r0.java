package com.google.android.gms.internal.measurement;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0483r0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f6934A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f6935B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ String f6936C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ boolean f6937D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6938E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ Object f6939F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483r0(C0466o0 c0466o0, String str) {
        super(c0466o0, true);
        this.f6934A = 0;
        this.f6935B = "fcm";
        this.f6936C = "_ln";
        this.f6939F = str;
        this.f6937D = true;
        this.f6938E = c0466o0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        switch (this.f6934A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y y5 = this.f6938E.f6915h;
                AbstractC1332d.m(y5);
                y5.setUserProperty(this.f6935B, this.f6936C, new e2.b(this.f6939F), this.f6937D, this.f6862w);
                break;
            default:
                Y y6 = this.f6938E.f6915h;
                AbstractC1332d.m(y6);
                y6.getUserProperties(this.f6935B, this.f6936C, this.f6937D, (Z) this.f6939F);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void b() {
        switch (this.f6934A) {
            case 1:
                ((Z) this.f6939F).d(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483r0(C0466o0 c0466o0, String str, String str2, boolean z5, Z z6) {
        super(c0466o0, true);
        this.f6934A = 1;
        this.f6935B = str;
        this.f6936C = str2;
        this.f6937D = z5;
        this.f6939F = z6;
        this.f6938E = c0466o0;
    }
}
