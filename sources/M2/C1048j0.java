package m2;

import java.lang.Thread;

/* JADX INFO: renamed from: m2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048j0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1042h0 f10963b;

    public C1048j0(C1042h0 c1042h0, String str) {
        this.f10963b = c1042h0;
        this.f10962a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f10963b.f().f10715B.c(th, this.f10962a);
    }
}
