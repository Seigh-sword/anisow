package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import l0.C0921c;
import m0.C1002c;
import s4.AbstractC1305a;
import z0.C1523d;
import z0.InterfaceC1525f;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends g0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f5594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f5595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f5596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0315o f5597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1523d f5598e;

    public Y(Application application, InterfaceC1525f interfaceC1525f, Bundle bundle) {
        d0 d0Var;
        AbstractC1305a.o(interfaceC1525f, "owner");
        this.f5598e = interfaceC1525f.b();
        this.f5597d = interfaceC1525f.g();
        this.f5596c = bundle;
        this.f5594a = application;
        if (application != null) {
            if (d0.f5618c == null) {
                d0.f5618c = new d0(application);
            }
            d0Var = d0.f5618c;
            AbstractC1305a.l(d0Var);
        } else {
            d0Var = new d0(null);
        }
        this.f5595b = d0Var;
    }

    @Override // androidx.lifecycle.e0
    public final b0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.e0
    public final b0 c(Class cls, C0921c c0921c) {
        C1002c c1002c = C1002c.f10437a;
        LinkedHashMap linkedHashMap = c0921c.f9835a;
        String str = (String) linkedHashMap.get(c1002c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(U.f5583a) == null || linkedHashMap.get(U.f5584b) == null) {
            if (this.f5597d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(d0.f5619d);
        boolean zIsAssignableFrom = AbstractC0301a.class.isAssignableFrom(cls);
        Constructor constructorA = Z.a(cls, (!zIsAssignableFrom || application == null) ? Z.f5600b : Z.f5599a);
        return constructorA == null ? this.f5595b.c(cls, c0921c) : (!zIsAssignableFrom || application == null) ? Z.b(cls, constructorA, U.b(c0921c)) : Z.b(cls, constructorA, application, U.b(c0921c));
    }

    public final b0 d(Class cls, String str) {
        AbstractC0315o abstractC0315o = this.f5597d;
        if (abstractC0315o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0301a.class.isAssignableFrom(cls);
        Application application = this.f5594a;
        Constructor constructorA = Z.a(cls, (!zIsAssignableFrom || application == null) ? Z.f5600b : Z.f5599a);
        if (constructorA == null) {
            if (application != null) {
                return this.f5595b.a(cls);
            }
            if (f0.f5625a == null) {
                f0.f5625a = new f0();
            }
            f0 f0Var = f0.f5625a;
            AbstractC1305a.l(f0Var);
            return f0Var.a(cls);
        }
        C1523d c1523d = this.f5598e;
        AbstractC1305a.l(c1523d);
        Bundle bundleA = c1523d.a(str);
        Class[] clsArr = Q.f5574f;
        Q qF = P2.e.f(bundleA, this.f5596c);
        S s5 = new S(str, qF);
        s5.c(abstractC0315o, c1523d);
        EnumC0314n enumC0314n = ((C0323x) abstractC0315o).f5645d;
        if (enumC0314n == EnumC0314n.f5632x || enumC0314n.compareTo(EnumC0314n.f5634z) >= 0) {
            c1523d.d();
        } else {
            abstractC0315o.a(new C0306f(abstractC0315o, c1523d));
        }
        b0 b0VarB = (!zIsAssignableFrom || application == null) ? Z.b(cls, constructorA, qF) : Z.b(cls, constructorA, application, qF);
        b0VarB.a("androidx.lifecycle.savedstate.vm.tag", s5);
        return b0VarB;
    }
}
