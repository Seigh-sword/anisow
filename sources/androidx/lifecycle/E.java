package androidx.lifecycle;

import com.android.app.models.Resource;
import d.AbstractC0628i;
import j.RunnableC0835a;
import java.util.Map;
import n.C1139b;
import o.C1160c;
import o.C1161d;
import o.C1164g;

/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f5549k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1164g f5551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f5554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f5555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RunnableC0835a f5559j;

    public E() {
        this.f5550a = new Object();
        this.f5551b = new C1164g();
        this.f5552c = 0;
        Object obj = f5549k;
        this.f5555f = obj;
        this.f5559j = new RunnableC0835a(9, this);
        this.f5554e = obj;
        this.f5556g = -1;
    }

    public static void a(String str) {
        if (!C1139b.I().f11676h.J()) {
            throw new IllegalStateException(AbstractC0628i.j("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(C c6) {
        if (c6.f5545x) {
            if (!c6.e()) {
                c6.a(false);
                return;
            }
            int i6 = c6.f5546y;
            int i7 = this.f5556g;
            if (i6 >= i7) {
                return;
            }
            c6.f5546y = i7;
            c6.f5544w.a(this.f5554e);
        }
    }

    public final void c(C c6) {
        if (this.f5557h) {
            this.f5558i = true;
            return;
        }
        this.f5557h = true;
        do {
            this.f5558i = false;
            if (c6 != null) {
                b(c6);
                c6 = null;
            } else {
                C1164g c1164g = this.f5551b;
                c1164g.getClass();
                C1161d c1161d = new C1161d(c1164g);
                c1164g.f11717y.put(c1161d, Boolean.FALSE);
                while (c1161d.hasNext()) {
                    b((C) ((Map.Entry) c1161d.next()).getValue());
                    if (this.f5558i) {
                        break;
                    }
                }
            }
        } while (this.f5558i);
        this.f5557h = false;
    }

    public final Object d() {
        Object obj = this.f5554e;
        if (obj != f5549k) {
            return obj;
        }
        return null;
    }

    public final void e(InterfaceC0321v interfaceC0321v, W0.h hVar) {
        Object obj;
        a("observe");
        if (interfaceC0321v.g().f5645d == EnumC0314n.f5631w) {
            return;
        }
        B b6 = new B(this, interfaceC0321v, hVar);
        C1164g c1164g = this.f5551b;
        C1160c c1160cB = c1164g.b(hVar);
        if (c1160cB != null) {
            obj = c1160cB.f11707x;
        } else {
            C1160c c1160c = new C1160c(hVar, b6);
            c1164g.f11718z++;
            C1160c c1160c2 = c1164g.f11716x;
            if (c1160c2 == null) {
                c1164g.f11715w = c1160c;
            } else {
                c1160c2.f11708y = c1160c;
                c1160c.f11709z = c1160c2;
            }
            c1164g.f11716x = c1160c;
            obj = null;
        }
        C c6 = (C) obj;
        if (c6 != null && !c6.d(interfaceC0321v)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c6 != null) {
            return;
        }
        interfaceC0321v.g().a(b6);
    }

    public final void f(Object obj) {
        boolean z5;
        synchronized (this.f5550a) {
            z5 = this.f5555f == f5549k;
            this.f5555f = obj;
        }
        if (z5) {
            C1139b.I().J(this.f5559j);
        }
    }

    public final void g(Object obj) {
        a("setValue");
        this.f5556g++;
        this.f5554e = obj;
        c(null);
    }

    public E(Resource resource) {
        this.f5550a = new Object();
        this.f5551b = new C1164g();
        this.f5552c = 0;
        this.f5555f = f5549k;
        this.f5559j = new RunnableC0835a(9, this);
        this.f5554e = resource;
        this.f5556g = 0;
    }
}
