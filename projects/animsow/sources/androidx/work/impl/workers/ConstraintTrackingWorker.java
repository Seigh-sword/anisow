package androidx.work.impl.workers;

import I0.o;
import N0.b;
import T0.i;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import j.RunnableC0835a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f5859G = o.y("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final WorkerParameters f5860B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f5861C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f5862D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final i f5863E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ListenableWorker f5864F;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5860B = workerParameters;
        this.f5861C = new Object();
        this.f5862D = false;
        this.f5863E = new i();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean a() {
        ListenableWorker listenableWorker = this.f5864F;
        return listenableWorker != null && listenableWorker.a();
    }

    @Override // androidx.work.ListenableWorker
    public final void b() {
        ListenableWorker listenableWorker = this.f5864F;
        if (listenableWorker == null || listenableWorker.f5826y) {
            return;
        }
        this.f5864F.f();
    }

    @Override // N0.b
    public final void c(List list) {
    }

    @Override // N0.b
    public final void d(ArrayList arrayList) {
        o.w().u(f5859G, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f5861C) {
            this.f5862D = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final i e() {
        this.f5825x.f5832c.execute(new RunnableC0835a(12, this));
        return this.f5863E;
    }
}
