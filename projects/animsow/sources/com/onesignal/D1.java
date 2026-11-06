package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends HandlerThread {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f7509z = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f7510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f7511x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7512y;

    public final synchronized void a() {
        try {
            Handler handler = this.f7510w;
            if (handler == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
            if (this.f7511x == 0) {
                AbstractC0603w1.f8056v.getClass();
                this.f7511x = System.currentTimeMillis();
            }
            long j6 = this.f7511x;
            AbstractC0603w1.f8056v.getClass();
            long jCurrentTimeMillis = (j6 - System.currentTimeMillis()) + 200;
            this.f7510w.postDelayed(new D(4, this), jCurrentTimeMillis);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f7510w = new Handler(getLooper());
        a();
    }
}
