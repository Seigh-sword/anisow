package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0519x0 extends AbstractRunnableC0448l0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f6992A = 2;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f6993B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Object f6994C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Object f6995D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519x0(C0460n0 c0460n0, Activity activity, Z z5) {
        super((C0466o0) c0460n0.f6894x, true);
        this.f6993B = activity;
        this.f6994C = z5;
        this.f6995D = c0460n0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void a() {
        Bundle bundle;
        switch (this.f6992A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y y5 = ((C0466o0) this.f6995D).f6915h;
                AbstractC1332d.m(y5);
                y5.getMaxUserProperties((String) this.f6993B, (Z) this.f6994C);
                break;
            case 1:
                if (((Bundle) this.f6993B) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f6993B).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f6993B).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                Y y6 = ((C0466o0) ((C0460n0) this.f6995D).f6894x).f6915h;
                AbstractC1332d.m(y6);
                y6.onActivityCreated(new e2.b((Activity) this.f6994C), bundle, this.f6863x);
                break;
            default:
                Y y7 = ((C0466o0) ((C0460n0) this.f6995D).f6894x).f6915h;
                AbstractC1332d.m(y7);
                y7.onActivitySaveInstanceState(new e2.b((Activity) this.f6993B), (Z) this.f6994C, this.f6863x);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0448l0
    public final void b() {
        switch (this.f6992A) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((Z) this.f6994C).d(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519x0(C0460n0 c0460n0, Bundle bundle, Activity activity) {
        super((C0466o0) c0460n0.f6894x, true);
        this.f6993B = bundle;
        this.f6994C = activity;
        this.f6995D = c0460n0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519x0(C0466o0 c0466o0, String str, Z z5) {
        super(c0466o0, true);
        this.f6993B = str;
        this.f6994C = z5;
        this.f6995D = c0466o0;
    }
}
