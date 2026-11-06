package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.onesignal.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerThreadC0556g1 extends HandlerThread {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f7816x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static HandlerThreadC0556g1 f7817y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f7818w;

    public HandlerThreadC0556g1() {
        super("com.onesignal.g1");
        start();
        this.f7818w = new Handler(getLooper());
    }

    public static HandlerThreadC0556g1 b() {
        if (f7817y == null) {
            synchronized (f7816x) {
                try {
                    if (f7817y == null) {
                        f7817y = new HandlerThreadC0556g1();
                    }
                } finally {
                }
            }
        }
        return f7817y;
    }

    public final void a(Runnable runnable) {
        synchronized (f7816x) {
            AbstractC0603w1.b(EnumC0600v1.f7992B, "Running destroyTimeout with runnable: " + runnable.toString(), null);
            this.f7818w.removeCallbacks(runnable);
        }
    }

    public final void c(Runnable runnable, long j6) {
        synchronized (f7816x) {
            a(runnable);
            AbstractC0603w1.b(EnumC0600v1.f7992B, "Running startTimeout with timeout: " + j6 + " and runnable: " + runnable.toString(), null);
            this.f7818w.postDelayed(runnable, j6);
        }
    }
}
