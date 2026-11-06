package androidx.work;

import T0.i;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5823A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f5824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WorkerParameters f5825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f5826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5827z;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f5824w = context;
        this.f5825x = workerParameters;
    }

    public boolean a() {
        return this.f5823A;
    }

    public void b() {
    }

    public abstract i e();

    public final void f() {
        this.f5826y = true;
        b();
    }
}
