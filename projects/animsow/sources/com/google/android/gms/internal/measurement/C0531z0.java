package com.google.android.gms.internal.measurement;

import android.app.Activity;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0531z0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f7016A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Activity f7017B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0460n0 f7018C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0531z0(C0460n0 c0460n0, Activity activity, int i6) {
        super((C0466o0) c0460n0.f6894x, true);
        this.f7016A = i6;
        if (i6 == 1) {
            this.f7017B = activity;
            this.f7018C = c0460n0;
            super((C0466o0) c0460n0.f6894x, true);
            return;
        }
        if (i6 == 2) {
            this.f7017B = activity;
            this.f7018C = c0460n0;
            super((C0466o0) c0460n0.f6894x, true);
        } else if (i6 == 3) {
            this.f7017B = activity;
            this.f7018C = c0460n0;
            super((C0466o0) c0460n0.f6894x, true);
        } else if (i6 != 4) {
            this.f7017B = activity;
            this.f7018C = c0460n0;
        } else {
            this.f7017B = activity;
            this.f7018C = c0460n0;
            super((C0466o0) c0460n0.f6894x, true);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        switch (this.f7016A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y y5 = ((C0466o0) this.f7018C.f6894x).f6915h;
                AbstractC1332d.m(y5);
                y5.onActivityResumed(new e2.b(this.f7017B), this.f6863x);
                break;
            case 1:
                Y y6 = ((C0466o0) this.f7018C.f6894x).f6915h;
                AbstractC1332d.m(y6);
                y6.onActivityStarted(new e2.b(this.f7017B), this.f6863x);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Y y7 = ((C0466o0) this.f7018C.f6894x).f6915h;
                AbstractC1332d.m(y7);
                y7.onActivityStopped(new e2.b(this.f7017B), this.f6863x);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                Y y8 = ((C0466o0) this.f7018C.f6894x).f6915h;
                AbstractC1332d.m(y8);
                y8.onActivityPaused(new e2.b(this.f7017B), this.f6863x);
                break;
            default:
                Y y9 = ((C0466o0) this.f7018C.f6894x).f6915h;
                AbstractC1332d.m(y9);
                y9.onActivityDestroyed(new e2.b(this.f7017B), this.f6863x);
                break;
        }
    }
}
