package com.google.android.gms.measurement;

import K.a;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import k.C0878a;
import m2.C1051k0;
import m2.InterfaceC1055l1;
import m2.N;
import m2.RunnableC1028c1;
import m2.x1;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements InterfaceC1055l1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0878a f7023w;

    @Override // m2.InterfaceC1055l1
    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // m2.InterfaceC1055l1
    public final void b(Intent intent) {
    }

    public final C0878a c() {
        if (this.f7023w == null) {
            this.f7023w = new C0878a(this, 7);
        }
        return this.f7023w;
    }

    @Override // m2.InterfaceC1055l1
    public final boolean d(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        N n5 = C1051k0.b(c().f9565x, null, null).f10983E;
        C1051k0.i(n5);
        n5.f10723J.d("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        N n5 = C1051k0.b(c().f9565x, null, null).f10983E;
        C1051k0.i(n5);
        n5.f10723J.d("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        C0878a c0878aC = c();
        if (intent == null) {
            c0878aC.f().f10715B.d("onRebind called with null intent");
            return;
        }
        c0878aC.getClass();
        c0878aC.f().f10723J.c(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C0878a c0878aC = c();
        N n5 = C1051k0.b(c0878aC.f9565x, null, null).f10983E;
        C1051k0.i(n5);
        String string = jobParameters.getExtras().getString("action");
        n5.f10723J.c(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a aVar = new a(c0878aC, n5, jobParameters, 19, 0);
        x1 x1VarM = x1.m(c0878aC.f9565x);
        x1VarM.g().A(new RunnableC1028c1(x1VarM, aVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        C0878a c0878aC = c();
        if (intent == null) {
            c0878aC.f().f10715B.d("onUnbind called with null intent");
            return true;
        }
        c0878aC.getClass();
        c0878aC.f().f10723J.c(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
