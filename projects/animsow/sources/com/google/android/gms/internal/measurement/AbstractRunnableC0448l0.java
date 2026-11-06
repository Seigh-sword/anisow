package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0448l0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f6862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f6863x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f6864y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f6865z;

    public AbstractRunnableC0448l0(C0466o0 c0466o0, boolean z5) {
        this.f6865z = c0466o0;
        c0466o0.f6909b.getClass();
        this.f6862w = System.currentTimeMillis();
        c0466o0.f6909b.getClass();
        this.f6863x = SystemClock.elapsedRealtime();
        this.f6864y = z5;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0466o0 c0466o0 = this.f6865z;
        if (c0466o0.f6914g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e6) {
            c0466o0.c(e6, false, this.f6864y);
            b();
        }
    }
}
