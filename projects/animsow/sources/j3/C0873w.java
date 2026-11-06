package j3;

import android.util.Log;
import d.AbstractC0628i;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0873w extends AbstractRunnableC0853c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f9551x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f9553z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f9550w = "awaitEvenIfOnMainThread task continuation executor";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f9552y = 2;

    public C0873w(ExecutorService executorService, TimeUnit timeUnit) {
        this.f9551x = executorService;
        this.f9553z = timeUnit;
    }

    @Override // j3.AbstractRunnableC0853c
    public final void a() {
        String str = this.f9550w;
        ExecutorService executorService = this.f9551x;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(this.f9552y, this.f9553z)) {
                return;
            }
            String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String strJ = AbstractC0628i.j("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strJ, null);
            }
            executorService.shutdownNow();
        }
    }
}
