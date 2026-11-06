package W1;

import X1.C0239g;
import X1.InterfaceC0243k;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import d.AbstractC0628i;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: W1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226u implements InterfaceC0230y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U1.f f4353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U1.b f4354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4355f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4357h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n2.c f4360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0243k f4364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0239g f4367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f4368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f2.h f4369t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4356g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f4358i = new Bundle();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashSet f4359j = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f4370u = new ArrayList();

    public C0226u(A a6, C0239g c0239g, Map map, U1.f fVar, f2.h hVar, Lock lock, Context context) {
        this.f4350a = a6;
        this.f4367r = c0239g;
        this.f4368s = map;
        this.f4353d = fVar;
        this.f4369t = hVar;
        this.f4351b = lock;
        this.f4352c = context;
    }

    public final void a() {
        this.f4362m = false;
        A a6 = this.f4350a;
        a6.f4223o.f4388p = Collections.emptySet();
        for (V1.c cVar : this.f4359j) {
            HashMap map = a6.f4217i;
            if (!map.containsKey(cVar)) {
                map.put(cVar, new U1.b(17, null));
            }
        }
    }

    @Override // W1.InterfaceC0230y
    public final void c(U1.b bVar, V1.d dVar, boolean z5) {
        if (m(1)) {
            k(bVar, dVar, z5);
            if (n()) {
                i();
            }
        }
    }

    @Override // W1.InterfaceC0230y
    public final void d(Bundle bundle) {
        if (m(1)) {
            if (bundle != null) {
                this.f4358i.putAll(bundle);
            }
            if (n()) {
                i();
            }
        }
    }

    @Override // W1.InterfaceC0230y
    public final boolean e() {
        ArrayList arrayList = this.f4370u;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((Future) arrayList.get(i6)).cancel(true);
        }
        arrayList.clear();
        h(true);
        this.f4350a.f();
        return true;
    }

    @Override // W1.InterfaceC0230y
    public final void f(int i6) {
        j(new U1.b(8, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X1.j, n2.c] */
    @Override // W1.InterfaceC0230y
    public final void g() {
        Map map;
        A a6 = this.f4350a;
        a6.f4217i.clear();
        int i6 = 0;
        this.f4362m = false;
        this.f4354e = null;
        this.f4356g = 0;
        this.f4361l = true;
        this.f4363n = false;
        this.f4365p = false;
        HashMap map2 = new HashMap();
        Map map3 = this.f4368s;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = a6.f4216h;
            if (!zHasNext) {
                break;
            }
            V1.d dVar = (V1.d) it.next();
            V1.b bVar = (V1.b) map.get(dVar.f3705b);
            AbstractC1332d.m(bVar);
            V1.b bVar2 = bVar;
            dVar.f3704a.getClass();
            boolean zBooleanValue = ((Boolean) map3.get(dVar)).booleanValue();
            if (bVar2.j()) {
                this.f4362m = true;
                if (zBooleanValue) {
                    this.f4359j.add(dVar.f3705b);
                } else {
                    this.f4361l = false;
                }
            }
            map2.put(bVar2, new C0222p(this, dVar, zBooleanValue));
        }
        if (this.f4362m) {
            C0239g c0239g = this.f4367r;
            AbstractC1332d.m(c0239g);
            AbstractC1332d.m(this.f4369t);
            C0229x c0229x = a6.f4223o;
            c0239g.f4596h = Integer.valueOf(System.identityHashCode(c0229x));
            C0225t c0225t = new C0225t(this);
            this.f4360k = this.f4369t.e(this.f4352c, c0229x.f4379g, c0239g, c0239g.f4595g, c0225t, c0225t);
        }
        this.f4357h = map.size();
        this.f4370u.add(B.f4225a.submit(new r(this, map2, i6)));
    }

    public final void h(boolean z5) {
        n2.c cVar = this.f4360k;
        if (cVar != null) {
            if (cVar.a() && z5) {
                cVar.e();
            }
            cVar.h();
            AbstractC1332d.m(this.f4367r);
            this.f4364o = null;
        }
    }

    public final void i() {
        A a6 = this.f4350a;
        a6.f4211c.lock();
        try {
            a6.f4223o.h();
            a6.f4221m = new C0221o(a6);
            a6.f4221m.g();
            a6.f4212d.signalAll();
            a6.f4211c.unlock();
            B.f4225a.execute(new P(1, this));
            n2.c cVar = this.f4360k;
            if (cVar != null) {
                if (this.f4365p) {
                    InterfaceC0243k interfaceC0243k = this.f4364o;
                    AbstractC1332d.m(interfaceC0243k);
                    cVar.l(interfaceC0243k, this.f4366q);
                }
                h(false);
            }
            Iterator it = this.f4350a.f4217i.keySet().iterator();
            while (it.hasNext()) {
                V1.b bVar = (V1.b) this.f4350a.f4216h.get((V1.c) it.next());
                AbstractC1332d.m(bVar);
                bVar.h();
            }
            this.f4350a.f4224p.a(this.f4358i.isEmpty() ? null : this.f4358i);
        } catch (Throwable th) {
            a6.f4211c.unlock();
            throw th;
        }
    }

    public final void j(U1.b bVar) {
        ArrayList arrayList = this.f4370u;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((Future) arrayList.get(i6)).cancel(true);
        }
        arrayList.clear();
        h(!bVar.b());
        A a6 = this.f4350a;
        a6.f();
        a6.f4224p.b(bVar);
    }

    public final void k(U1.b bVar, V1.d dVar, boolean z5) {
        dVar.f3704a.getClass();
        if ((!z5 || bVar.b() || this.f4353d.a(bVar.f3576x, null, null) != null) && (this.f4354e == null || Integer.MAX_VALUE < this.f4355f)) {
            this.f4354e = bVar;
            this.f4355f = Integer.MAX_VALUE;
        }
        this.f4350a.f4217i.put(dVar.f3705b, bVar);
    }

    public final void l() {
        if (this.f4357h != 0) {
            return;
        }
        if (!this.f4362m || this.f4363n) {
            ArrayList arrayList = new ArrayList();
            int i6 = 1;
            this.f4356g = 1;
            A a6 = this.f4350a;
            this.f4357h = a6.f4216h.size();
            Map map = a6.f4216h;
            for (V1.c cVar : map.keySet()) {
                if (!a6.f4217i.containsKey(cVar)) {
                    arrayList.add((V1.b) map.get(cVar));
                } else if (n()) {
                    i();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f4370u.add(B.f4225a.submit(new r(this, arrayList, i6)));
        }
    }

    public final boolean m(int i6) {
        if (this.f4356g == i6) {
            return true;
        }
        C0229x c0229x = this.f4350a.f4223o;
        c0229x.getClass();
        StringWriter stringWriter = new StringWriter();
        c0229x.e("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f4357h);
        StringBuilder sbN = AbstractC0628i.n("GoogleApiClient connecting is in step ", this.f4356g != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        sbN.append(i6 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", sbN.toString(), new Exception());
        j(new U1.b(8, null));
        return false;
    }

    public final boolean n() {
        U1.b bVar;
        int i6 = this.f4357h - 1;
        this.f4357h = i6;
        if (i6 > 0) {
            return false;
        }
        A a6 = this.f4350a;
        if (i6 < 0) {
            C0229x c0229x = a6.f4223o;
            c0229x.getClass();
            StringWriter stringWriter = new StringWriter();
            c0229x.e("", null, new PrintWriter(stringWriter), null);
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new U1.b(8, null);
        } else {
            bVar = this.f4354e;
            if (bVar == null) {
                return true;
            }
            a6.f4222n = this.f4355f;
        }
        j(bVar);
        return false;
    }

    @Override // W1.InterfaceC0230y
    public final void b() {
    }
}
