package androidx.lifecycle;

import M4.s0;
import android.os.Bundle;
import d.C0629j;
import i.C0803c;
import java.util.LinkedHashMap;
import l0.AbstractC0920b;
import l0.C0919a;
import l0.C0921c;
import m0.C1000a;
import m0.C1002c;
import s4.AbstractC1305a;
import v4.C1433k;
import v4.InterfaceC1432j;
import z0.C1523d;
import z0.InterfaceC1522c;
import z0.InterfaceC1525f;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B3.e f5583a = new B3.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.e f5584b = new B3.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B3.e f5585c = new B3.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P2.e f5586d = new P2.e();

    public static final void a(b0 b0Var, C1523d c1523d, AbstractC0315o abstractC0315o) {
        AbstractC1305a.o(c1523d, "registry");
        AbstractC1305a.o(abstractC0315o, "lifecycle");
        S s5 = (S) b0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (s5 == null || s5.f5582y) {
            return;
        }
        s5.c(abstractC0315o, c1523d);
        EnumC0314n enumC0314n = ((C0323x) abstractC0315o).f5645d;
        if (enumC0314n == EnumC0314n.f5632x || enumC0314n.compareTo(EnumC0314n.f5634z) >= 0) {
            c1523d.d();
        } else {
            abstractC0315o.a(new C0306f(abstractC0315o, c1523d));
        }
    }

    public static final Q b(C0921c c0921c) {
        B3.e eVar = f5583a;
        LinkedHashMap linkedHashMap = c0921c.f9835a;
        InterfaceC1525f interfaceC1525f = (InterfaceC1525f) linkedHashMap.get(eVar);
        if (interfaceC1525f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        j0 j0Var = (j0) linkedHashMap.get(f5584b);
        if (j0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5585c);
        String str = (String) linkedHashMap.get(C1002c.f10437a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC1522c interfaceC1522cB = interfaceC1525f.b().b();
        W w5 = interfaceC1522cB instanceof W ? (W) interfaceC1522cB : null;
        if (w5 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        X xD = d(j0Var);
        Q q5 = (Q) xD.f5593b.get(str);
        if (q5 != null) {
            return q5;
        }
        Class[] clsArr = Q.f5574f;
        w5.c();
        Bundle bundle2 = w5.f5591c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = w5.f5591c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = w5.f5591c;
        if (bundle5 != null && bundle5.isEmpty()) {
            w5.f5591c = null;
        }
        Q qF = P2.e.f(bundle3, bundle);
        xD.f5593b.put(str, qF);
        return qF;
    }

    public static final void c(InterfaceC1525f interfaceC1525f) {
        AbstractC1305a.o(interfaceC1525f, "<this>");
        EnumC0314n enumC0314n = interfaceC1525f.g().f5645d;
        if (enumC0314n != EnumC0314n.f5632x && enumC0314n != EnumC0314n.f5633y) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (interfaceC1525f.b().b() == null) {
            W w5 = new W(interfaceC1525f.b(), (j0) interfaceC1525f);
            interfaceC1525f.b().c("androidx.lifecycle.internal.SavedStateHandlesProvider", w5);
            interfaceC1525f.g().a(new C0629j(w5));
        }
    }

    public static final X d(j0 j0Var) {
        AbstractC1305a.o(j0Var, "<this>");
        T t5 = new T();
        i0 i0VarE = j0Var.e();
        AbstractC0920b abstractC0920bA = j0Var instanceof InterfaceC0309i ? ((InterfaceC0309i) j0Var).a() : C0919a.f9834b;
        AbstractC1305a.o(i0VarE, "store");
        AbstractC1305a.o(abstractC0920bA, "defaultCreationExtras");
        return (X) new C0803c(i0VarE, t5, abstractC0920bA).F(D4.s.a(X.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C1000a e(b0 b0Var) {
        C1000a c1000a;
        InterfaceC1432j interfaceC1432j;
        synchronized (f5586d) {
            c1000a = (C1000a) b0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c1000a == null) {
                try {
                    S4.e eVar = M4.J.f1851a;
                    interfaceC1432j = ((N4.c) R4.p.f3037a).f2282B;
                } catch (IllegalStateException unused) {
                    interfaceC1432j = C1433k.f13309w;
                }
                C1000a c1000a2 = new C1000a(interfaceC1432j.k(new s0(null)));
                b0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c1000a2);
                c1000a = c1000a2;
            }
        }
        return c1000a;
    }
}
