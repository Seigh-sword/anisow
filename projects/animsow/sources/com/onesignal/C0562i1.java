package com.onesignal;

import android.app.Activity;

/* JADX INFO: renamed from: com.onesignal.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0562i1 extends AbstractC0542c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0548e f7840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RunnableC0570l0 f7841b;

    public C0562i1(RunnableC0570l0 runnableC0570l0, C0548e c0548e) {
        this.f7841b = runnableC0570l0;
        this.f7840a = c0548e;
    }

    @Override // com.onesignal.AbstractC0542c
    public final void a(Activity activity) {
        RunnableC0570l0 runnableC0570l0 = this.f7841b;
        String str = (String) runnableC0570l0.f7874x;
        this.f7840a.getClass();
        C0548e.f7785d.remove(str);
        boolean zE = AbstractC0565j1.e(activity);
        Runnable runnable = (Runnable) runnableC0570l0.f7875y;
        if (zE) {
            runnable.run();
        } else {
            AbstractC0565j1.a(activity, runnable);
        }
    }
}
