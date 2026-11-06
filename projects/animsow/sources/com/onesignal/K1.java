package com.onesignal;

/* JADX INFO: loaded from: classes.dex */
public final class K1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC0571l1 f7610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f7612y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Throwable f7613z;

    public K1(AbstractC0571l1 abstractC0571l1, int i6, String str, Throwable th) {
        this.f7610w = abstractC0571l1;
        this.f7611x = i6;
        this.f7612y = str;
        this.f7613z = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7610w.H(this.f7611x, this.f7612y, this.f7613z);
    }
}
