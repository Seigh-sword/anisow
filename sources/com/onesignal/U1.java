package com.onesignal;

import com.amazon.device.iap.PurchasingService;

/* JADX INFO: loaded from: classes.dex */
public final class U1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W1 f7713w;

    public U1(W1 w12) {
        this.f7713w = w12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W1 w12 = this.f7713w;
        PurchasingService.registerListener(w12.f7719a, w12.f7721c);
    }
}
