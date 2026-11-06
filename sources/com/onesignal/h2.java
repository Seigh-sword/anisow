package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends HandlerThread {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f7832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7833y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ i2 f7834z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2 i2Var, int i6) {
        super("OSH_NetworkHandlerThread_" + i2Var.f7843b);
        this.f7834z = i2Var;
        this.f7831w = i6;
        start();
        this.f7832x = new Handler(getLooper());
    }

    public final void a() {
        if (this.f7834z.f7844c) {
            synchronized (this.f7832x) {
                this.f7833y = 0;
                D d6 = null;
                this.f7832x.removeCallbacksAndMessages(null);
                Handler handler = this.f7832x;
                if (this.f7831w == 0) {
                    d6 = new D(7, this);
                }
                handler.postDelayed(d6, 5000L);
            }
        }
    }
}
