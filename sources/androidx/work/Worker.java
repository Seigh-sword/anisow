package androidx.work;

import I0.n;
import T0.i;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import j.RunnableC0835a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public i f5829B;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final i e() {
        this.f5829B = new i();
        this.f5825x.f5832c.execute(new RunnableC0835a(11, this));
        return this.f5829B;
    }

    public abstract n g();
}
