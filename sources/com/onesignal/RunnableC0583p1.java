package com.onesignal;

/* JADX INFO: renamed from: com.onesignal.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0583p1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0584q f7934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f7935x;

    public RunnableC0583p1(C0584q c0584q, boolean z5) {
        this.f7934w = c0584q;
        this.f7935x = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0603w1.f8053s.getClass();
        C0594t1.d("Running promptLocation() operation from pending queue.");
        AbstractC0603w1.J(this.f7934w, this.f7935x);
    }
}
