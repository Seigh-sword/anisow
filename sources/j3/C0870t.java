package j3;

import android.util.Log;
import g3.C0730b;
import g3.C0731c;
import g3.InterfaceC0729a;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.C1243i;

/* JADX INFO: renamed from: j3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0870t implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1243i f9535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J0.l f9536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f9537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0729a f9538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f9539e = new AtomicBoolean(false);

    public C0870t(C1243i c1243i, J0.l lVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC0729a interfaceC0729a) {
        this.f9535a = c1243i;
        this.f9536b = lVar;
        this.f9537c = uncaughtExceptionHandler;
        this.f9538d = interfaceC0729a;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!((C0730b) this.f9538d).b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9537c;
        AtomicBoolean atomicBoolean = this.f9539e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f9535a.p(this.f9536b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e6) {
                C0731c c0731c = C0731c.f8531a;
                c0731c.d("An error occurred in the uncaught exception handler", e6);
                if (uncaughtExceptionHandler != null) {
                    c0731c.c("Completed exception processing. Invoking default exception handler.");
                } else {
                    c0731c.c("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
                atomicBoolean.set(false);
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
            }
            System.exit(1);
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
