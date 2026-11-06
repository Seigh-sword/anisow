package m2;

import j.RunnableC0835a;
import u1.C1358b;

/* JADX INFO: renamed from: m2.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1061n1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f11038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f11039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1358b f11040y;

    public RunnableC1061n1(C1358b c1358b, long j6, long j7) {
        this.f11040y = c1358b;
        this.f11038w = j6;
        this.f11039x = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C1052k1) this.f11040y.f12823y).g().A(new RunnableC0835a(18, this));
    }
}
