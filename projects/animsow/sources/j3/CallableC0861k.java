package j3;

import a3.C0261b;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p3.C1251c;

/* JADX INFO: renamed from: j3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0861k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f9478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f9479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J0.l f9480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f9481e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0863m f9482f;

    public CallableC0861k(C0863m c0863m, long j6, Throwable th, Thread thread, J0.l lVar) {
        this.f9482f = c0863m;
        this.f9477a = j6;
        this.f9478b = th;
        this.f9479c = thread;
        this.f9480d = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j6 = this.f9477a;
        long j7 = j6 / 1000;
        C0863m c0863m = this.f9482f;
        String strE = c0863m.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
        } else {
            c0863m.f9488c.d();
            C1251c c1251c = c0863m.f9498m;
            c1251c.getClass();
            String strConcat = "Persisting fatal event for session ".concat(strE);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            c1251c.p(this.f9478b, this.f9479c, strE, "crash", j7, true);
            try {
                C1251c c1251c2 = c0863m.f9492g;
                String str = ".ae" + j6;
                c1251c2.getClass();
                if (!new File((File) c1251c2.f12320d, str).createNewFile()) {
                    throw new IOException("Create new file failed.");
                }
            } catch (IOException e6) {
                Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e6);
            }
            J0.l lVar = this.f9480d;
            c0863m.b(false, lVar, false);
            c0863m.c(new C0855e().f9464a, Boolean.valueOf(this.f9481e));
            if (c0863m.f9487b.a()) {
                return ((q2.j) ((AtomicReference) lVar.f1223i).get()).f12351a.g(c0863m.f9490e.f9655a, new C0261b(this, 3, strE));
            }
        }
        return f2.h.l(null);
    }
}
