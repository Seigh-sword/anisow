package com.onesignal;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.onesignal.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0577n1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0558h0 f7901x;

    public /* synthetic */ RunnableC0577n1(C0558h0 c0558h0, int i6) {
        this.f7900w = i6;
        this.f7901x = c0558h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7900w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0603w1.f8053s.getClass();
                C0594t1.d("Running getTags() operation from pending queue.");
                AbstractC0603w1.u(this.f7901x);
                return;
            default:
                ArrayList arrayList = AbstractC0603w1.f8018S;
                synchronized (arrayList) {
                    try {
                        arrayList.add(this.f7901x);
                        if (arrayList.size() > 1) {
                            return;
                        }
                        if (AbstractC0603w1.v() != null) {
                            AbstractC0603w1.C();
                            return;
                        } else {
                            AbstractC0603w1.f8053s.getClass();
                            C0594t1.i("getTags called under a null user!");
                            return;
                        }
                    } finally {
                    }
                }
        }
    }
}
