package com.onesignal;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends TimerTask {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f7742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0540b0 f7743x;

    public Z(C0540b0 c0540b0, String str) {
        this.f7743x = c0540b0;
        this.f7742w = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C0540b0 c0540b0 = this.f7743x;
        c0540b0.f7771b.remove(this.f7742w);
        c0540b0.f7770a.a();
    }
}
