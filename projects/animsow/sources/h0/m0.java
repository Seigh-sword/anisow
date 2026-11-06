package h0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.InterfaceC0309i;
import d.RunnableC0632m;
import java.util.LinkedHashMap;
import l0.C0921c;
import z0.C1523d;
import z0.C1524e;
import z0.InterfaceC1525f;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements InterfaceC0309i, InterfaceC1525f, androidx.lifecycle.j0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0323x f8846A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1524e f8847B = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractComponentCallbacksC0734B f8848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.i0 f8849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f8850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.lifecycle.e0 f8851z;

    public m0(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, androidx.lifecycle.i0 i0Var, RunnableC0632m runnableC0632m) {
        this.f8848w = abstractComponentCallbacksC0734B;
        this.f8849x = i0Var;
        this.f8850y = runnableC0632m;
    }

    @Override // androidx.lifecycle.InterfaceC0309i
    public final C0921c a() {
        Application application;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8848w;
        Context applicationContext = abstractComponentCallbacksC0734B.O().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0921c c0921c = new C0921c(0);
        LinkedHashMap linkedHashMap = c0921c.f9835a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.d0.f5619d, application);
        }
        linkedHashMap.put(androidx.lifecycle.U.f5583a, abstractComponentCallbacksC0734B);
        linkedHashMap.put(androidx.lifecycle.U.f5584b, this);
        Bundle bundle = abstractComponentCallbacksC0734B.f8591B;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.U.f5585c, bundle);
        }
        return c0921c;
    }

    @Override // z0.InterfaceC1525f
    public final C1523d b() {
        d();
        return this.f8847B.f14072b;
    }

    public final void c(EnumC0313m enumC0313m) {
        this.f8846A.e(enumC0313m);
    }

    public final void d() {
        if (this.f8846A == null) {
            this.f8846A = new C0323x(this);
            C1524e c1524e = new C1524e(this);
            this.f8847B = c1524e;
            c1524e.a();
            this.f8850y.run();
        }
    }

    @Override // androidx.lifecycle.j0
    public final androidx.lifecycle.i0 e() {
        d();
        return this.f8849x;
    }

    @Override // androidx.lifecycle.InterfaceC0309i
    public final androidx.lifecycle.e0 f() {
        Application application;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8848w;
        androidx.lifecycle.e0 e0VarF = abstractComponentCallbacksC0734B.f();
        if (!e0VarF.equals(abstractComponentCallbacksC0734B.f8630o0)) {
            this.f8851z = e0VarF;
            return e0VarF;
        }
        if (this.f8851z == null) {
            Context applicationContext = abstractComponentCallbacksC0734B.O().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f8851z = new androidx.lifecycle.Y(application, abstractComponentCallbacksC0734B, abstractComponentCallbacksC0734B.f8591B);
        }
        return this.f8851z;
    }

    @Override // androidx.lifecycle.InterfaceC0321v
    public final C0323x g() {
        d();
        return this.f8846A;
    }
}
