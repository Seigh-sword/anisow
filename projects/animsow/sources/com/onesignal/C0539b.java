package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import k0.AbstractC0888a;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0539b implements S {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7766w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f7768y;

    public C0539b(Context context, Bundle bundle) {
        this.f7767x = bundle;
        this.f7768y = context;
    }

    @Override // com.onesignal.S
    public final void b(T t5) throws Throwable {
        Object obj = this.f7767x;
        switch (this.f7766w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (t5 == null || !t5.a()) {
                    JSONObject jSONObjectF = AbstractC0571l1.f((Bundle) obj);
                    B0 b02 = new B0(jSONObjectF);
                    Context context = this.f7768y;
                    I0 i02 = new I0(context);
                    i02.f7584c = jSONObjectF;
                    i02.f7583b = context;
                    i02.b(b02);
                    AbstractC0571l1.M(new D0(i02, i02.f7585d), true);
                }
                break;
            default:
                AbstractC0888a.a((Intent) obj);
                break;
        }
    }

    public C0539b(FCMIntentService fCMIntentService, Intent intent) {
        this.f7768y = fCMIntentService;
        this.f7767x = intent;
    }
}
