package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import k.C0878a;
import k0.AbstractC0888a;
import m.Z;
import m2.BinderC1066p0;
import m2.C1051k0;
import m2.InterfaceC1055l1;
import m2.N;
import m2.RunnableC1028c1;
import m2.x1;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1055l1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0878a f7025w;

    @Override // m2.InterfaceC1055l1
    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // m2.InterfaceC1055l1
    public final void b(Intent intent) {
        AbstractC0888a.a(intent);
    }

    public final C0878a c() {
        if (this.f7025w == null) {
            this.f7025w = new C0878a(this, 7);
        }
        return this.f7025w;
    }

    @Override // m2.InterfaceC1055l1
    public final boolean d(int i6) {
        return stopSelfResult(i6);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C0878a c0878aC = c();
        if (intent == null) {
            c0878aC.f().f10715B.d("onBind called with null intent");
            return null;
        }
        c0878aC.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC1066p0(x1.m(c0878aC.f9565x));
        }
        c0878aC.f().f10718E.c(action, "onBind received unknown action");
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        C0878a c0878aC = c();
        N n5 = C1051k0.b(c0878aC.f9565x, null, null).f10983E;
        C1051k0.i(n5);
        if (intent == null) {
            n5.f10718E.d("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        n5.f10723J.b(Integer.valueOf(i7), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Z z5 = new Z(c0878aC, i7, n5, intent);
        x1 x1VarM = x1.m(c0878aC.f9565x);
        x1VarM.g().A(new RunnableC1028c1(x1VarM, z5));
        return 2;
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
