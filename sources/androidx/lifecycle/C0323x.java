package androidx.lifecycle;

import P4.q0;
import d.AbstractC0628i;
import d.C0629j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n.C1139b;
import o.C1158a;
import o.C1160c;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0323x extends AbstractC0315o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1158a f5644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC0314n f5645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f5646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f5650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q0 f5651j;

    public C0323x(InterfaceC0321v interfaceC0321v) {
        AbstractC1305a.o(interfaceC0321v, "provider");
        this.f5635a = new AtomicReference(null);
        this.f5643b = true;
        this.f5644c = new C1158a();
        EnumC0314n enumC0314n = EnumC0314n.f5632x;
        this.f5645d = enumC0314n;
        this.f5650i = new ArrayList();
        this.f5646e = new WeakReference(interfaceC0321v);
        this.f5651j = P4.d0.b(enumC0314n);
    }

    @Override // androidx.lifecycle.AbstractC0315o
    public final void a(InterfaceC0320u interfaceC0320u) {
        InterfaceC0319t c0306f;
        InterfaceC0321v interfaceC0321v;
        AbstractC1305a.o(interfaceC0320u, "observer");
        d("addObserver");
        EnumC0314n enumC0314n = this.f5645d;
        EnumC0314n enumC0314n2 = EnumC0314n.f5631w;
        if (enumC0314n != enumC0314n2) {
            enumC0314n2 = EnumC0314n.f5632x;
        }
        C0322w c0322w = new C0322w();
        HashMap map = AbstractC0325z.f5653a;
        boolean z5 = interfaceC0320u instanceof InterfaceC0319t;
        boolean z6 = interfaceC0320u instanceof c0.m;
        if (z5 && z6) {
            c0306f = new C0306f((c0.m) interfaceC0320u, (InterfaceC0319t) interfaceC0320u);
        } else if (z6) {
            c0306f = new C0306f((c0.m) interfaceC0320u, (InterfaceC0319t) null);
        } else if (z5) {
            c0306f = (InterfaceC0319t) interfaceC0320u;
        } else {
            Class<?> cls = interfaceC0320u.getClass();
            if (AbstractC0325z.b(cls) == 2) {
                Object obj = AbstractC0325z.f5654b.get(cls);
                AbstractC1305a.l(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC0325z.a((Constructor) list.get(0), interfaceC0320u);
                    throw null;
                }
                int size = list.size();
                InterfaceC0308h[] interfaceC0308hArr = new InterfaceC0308h[size];
                if (size > 0) {
                    AbstractC0325z.a((Constructor) list.get(0), interfaceC0320u);
                    throw null;
                }
                c0306f = new C0629j(interfaceC0308hArr);
            } else {
                c0306f = new C0306f(interfaceC0320u);
            }
        }
        c0322w.f5642b = c0306f;
        c0322w.f5641a = enumC0314n2;
        if (((C0322w) this.f5644c.e(interfaceC0320u, c0322w)) == null && (interfaceC0321v = (InterfaceC0321v) this.f5646e.get()) != null) {
            boolean z7 = this.f5647f != 0 || this.f5648g;
            EnumC0314n enumC0314nC = c(interfaceC0320u);
            this.f5647f++;
            while (c0322w.f5641a.compareTo(enumC0314nC) < 0 && this.f5644c.f11704A.containsKey(interfaceC0320u)) {
                this.f5650i.add(c0322w.f5641a);
                C0311k c0311k = EnumC0313m.Companion;
                EnumC0314n enumC0314n3 = c0322w.f5641a;
                c0311k.getClass();
                EnumC0313m enumC0313mA = C0311k.a(enumC0314n3);
                if (enumC0313mA == null) {
                    throw new IllegalStateException("no event up from " + c0322w.f5641a);
                }
                c0322w.a(interfaceC0321v, enumC0313mA);
                ArrayList arrayList = this.f5650i;
                arrayList.remove(arrayList.size() - 1);
                enumC0314nC = c(interfaceC0320u);
            }
            if (!z7) {
                h();
            }
            this.f5647f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0315o
    public final void b(InterfaceC0320u interfaceC0320u) {
        AbstractC1305a.o(interfaceC0320u, "observer");
        d("removeObserver");
        this.f5644c.c(interfaceC0320u);
    }

    public final EnumC0314n c(InterfaceC0320u interfaceC0320u) {
        C0322w c0322w;
        HashMap map = this.f5644c.f11704A;
        C1160c c1160c = map.containsKey(interfaceC0320u) ? ((C1160c) map.get(interfaceC0320u)).f11709z : null;
        EnumC0314n enumC0314n = (c1160c == null || (c0322w = (C0322w) c1160c.f11707x) == null) ? null : c0322w.f5641a;
        ArrayList arrayList = this.f5650i;
        EnumC0314n enumC0314n2 = arrayList.isEmpty() ^ true ? (EnumC0314n) arrayList.get(arrayList.size() - 1) : null;
        EnumC0314n enumC0314n3 = this.f5645d;
        AbstractC1305a.o(enumC0314n3, "state1");
        if (enumC0314n == null || enumC0314n.compareTo(enumC0314n3) >= 0) {
            enumC0314n = enumC0314n3;
        }
        return (enumC0314n2 == null || enumC0314n2.compareTo(enumC0314n) >= 0) ? enumC0314n : enumC0314n2;
    }

    public final void d(String str) {
        if (this.f5643b && !C1139b.I().f11676h.J()) {
            throw new IllegalStateException(AbstractC0628i.j("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(EnumC0313m enumC0313m) {
        AbstractC1305a.o(enumC0313m, "event");
        d("handleLifecycleEvent");
        f(enumC0313m.a());
    }

    public final void f(EnumC0314n enumC0314n) {
        EnumC0314n enumC0314n2 = this.f5645d;
        if (enumC0314n2 == enumC0314n) {
            return;
        }
        EnumC0314n enumC0314n3 = EnumC0314n.f5632x;
        EnumC0314n enumC0314n4 = EnumC0314n.f5631w;
        if (enumC0314n2 == enumC0314n3 && enumC0314n == enumC0314n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0314n + ", but was " + this.f5645d + " in component " + this.f5646e.get()).toString());
        }
        this.f5645d = enumC0314n;
        if (this.f5648g || this.f5647f != 0) {
            this.f5649h = true;
            return;
        }
        this.f5648g = true;
        h();
        this.f5648g = false;
        if (this.f5645d == enumC0314n4) {
            this.f5644c = new C1158a();
        }
    }

    public final void g() {
        EnumC0314n enumC0314n = EnumC0314n.f5633y;
        d("setCurrentState");
        f(enumC0314n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.f5649h = false;
        r8.f5651j.l(r8.f5645d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0323x.h():void");
    }
}
