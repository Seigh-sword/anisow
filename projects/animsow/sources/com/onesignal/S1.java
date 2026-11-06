package com.onesignal;

import android.content.Context;
import com.huawei.hms.common.ApiException;

/* JADX INFO: loaded from: classes.dex */
public final class S1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f7700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0594t1 f7701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ T1 f7702y;

    public S1(T1 t12, Context context, C0594t1 c0594t1) {
        this.f7702y = t12;
        this.f7700w = context;
        this.f7701x = c0594t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0594t1 c0594t1 = this.f7701x;
        try {
            this.f7702y.c(this.f7700w, c0594t1);
        } catch (ApiException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "HMS ApiException getting Huawei push token!", e6);
            int i6 = e6.getStatusCode() == 907135000 ? -26 : -27;
            c0594t1.getClass();
            C0594t1.c(i6, null);
        }
    }
}
