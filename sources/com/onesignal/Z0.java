package com.onesignal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f7744e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Z0 f7745f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f7746d;

    public static Z0 c() {
        if (f7745f == null) {
            synchronized (f7744e) {
                try {
                    if (f7745f == null) {
                        Z0 z02 = new Z0();
                        z02.f7738a = false;
                        z02.f7746d = 0L;
                        f7745f = z02;
                    }
                } finally {
                }
            }
        }
        return f7745f;
    }

    public final void d(Context context, long j6) {
        Object obj = Y.f7737c;
        synchronized (obj) {
            try {
                if (this.f7746d.longValue() != 0) {
                    AbstractC0603w1.f8056v.getClass();
                    if (System.currentTimeMillis() + j6 > this.f7746d.longValue()) {
                        AbstractC0603w1.b(EnumC0600v1.f7993C, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f7746d, null);
                        return;
                    }
                }
                if (j6 < 5000) {
                    j6 = 5000;
                }
                synchronized (obj) {
                    b(context, j6);
                    AbstractC0603w1.f8056v.getClass();
                    this.f7746d = Long.valueOf(System.currentTimeMillis() + j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
