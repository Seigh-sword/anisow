package W1;

import X1.AbstractC0242j;
import X1.C0239g;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import l1.C0924C;
import s.C1280b;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class E implements V1.i, V1.j, Z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0242j f4229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0207a f4230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0924C f4231f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Q f4235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4236k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0211e f4239n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f4228c = new LinkedList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f4232g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f4233h = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f4237l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public U1.b f4238m = null;

    public E(C0211e c0211e, V1.g gVar) {
        this.f4239n = c0211e;
        Looper looper = c0211e.f4312I.getLooper();
        C0239g c0239gB = gVar.a().b();
        f2.h hVar = gVar.f3712c.f3704a;
        AbstractC1332d.m(hVar);
        AbstractC0242j abstractC0242jE = hVar.e(gVar.f3710a, looper, c0239gB, gVar.f3713d, this, this);
        String str = gVar.f3711b;
        if (str != null) {
            abstractC0242jE.f4586x = str;
        }
        this.f4229d = abstractC0242jE;
        this.f4230e = gVar.f3714e;
        this.f4231f = new C0924C(1);
        this.f4234i = gVar.f3715f;
        if (abstractC0242jE.j()) {
            this.f4235j = new Q(c0211e.f4304A, c0211e.f4312I, gVar.a().b());
        } else {
            this.f4235j = null;
        }
    }

    @Override // W1.InterfaceC0210d
    public final void D(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        C0211e c0211e = this.f4239n;
        if (looperMyLooper == c0211e.f4312I.getLooper()) {
            g();
        } else {
            c0211e.f4312I.post(new P(2, this));
        }
    }

    public final void a(U1.b bVar) {
        HashSet hashSet = this.f4232g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        AbstractC0628i.p(it.next());
        if (AbstractC1332d.D(bVar, U1.b.f3574A)) {
            AbstractC0242j abstractC0242j = this.f4229d;
            if (!abstractC0242j.a() || abstractC0242j.f4569g == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    @Override // W1.InterfaceC0210d
    public final void b(int i6) {
        Looper looperMyLooper = Looper.myLooper();
        C0211e c0211e = this.f4239n;
        if (looperMyLooper == c0211e.f4312I.getLooper()) {
            h(i6);
        } else {
            c0211e.f4312I.post(new Q0.e(i6, 1, this));
        }
    }

    public final void c(Status status) {
        AbstractC1332d.e(this.f4239n.f4312I);
        d(status, null, false);
    }

    public final void d(Status status, RuntimeException runtimeException, boolean z5) {
        AbstractC1332d.e(this.f4239n.f4312I);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f4228c.iterator();
        while (it.hasNext()) {
            V v5 = (V) it.next();
            if (!z5 || v5.f4277a == 2) {
                if (status != null) {
                    v5.a(status);
                } else {
                    v5.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    @Override // W1.InterfaceC0216j
    public final void e(U1.b bVar) {
        n(bVar, null);
    }

    public final void f() {
        LinkedList linkedList = this.f4228c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            V v5 = (V) arrayList.get(i6);
            if (!this.f4229d.a()) {
                return;
            }
            if (j(v5)) {
                linkedList.remove(v5);
            }
        }
    }

    public final void g() {
        C0211e c0211e = this.f4239n;
        AbstractC1332d.e(c0211e.f4312I);
        this.f4238m = null;
        a(U1.b.f3574A);
        if (this.f4236k) {
            com.google.android.gms.internal.measurement.X x5 = c0211e.f4312I;
            C0207a c0207a = this.f4230e;
            x5.removeMessages(11, c0207a);
            c0211e.f4312I.removeMessages(9, c0207a);
            this.f4236k = false;
        }
        Iterator it = this.f4233h.values().iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
        f();
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7) {
        /*
            r6 = this;
            W1.e r0 = r6.f4239n
            com.google.android.gms.internal.measurement.X r0 = r0.f4312I
            t0.AbstractC1332d.e(r0)
            r0 = 0
            r6.f4238m = r0
            r1 = 1
            r6.f4236k = r1
            X1.j r2 = r6.f4229d
            java.lang.String r2 = r2.f4568f
            l1.C r3 = r6.f4231f
            r3.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "The connection to Google Play services was lost"
            r4.<init>(r5)
            if (r7 != r1) goto L25
            java.lang.String r7 = " due to service disconnection."
        L21:
            r4.append(r7)
            goto L2b
        L25:
            r5 = 3
            if (r7 != r5) goto L2b
            java.lang.String r7 = " due to dead object exception."
            goto L21
        L2b:
            if (r2 == 0) goto L35
            java.lang.String r7 = " Last reason for disconnect: "
            r4.append(r7)
            r4.append(r2)
        L35:
            java.lang.String r7 = r4.toString()
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r4 = 20
            r2.<init>(r4, r7, r0, r0)
            r3.a(r1, r2)
            W1.a r7 = r6.f4230e
            W1.e r1 = r6.f4239n
            com.google.android.gms.internal.measurement.X r1 = r1.f4312I
            r2 = 9
            android.os.Message r7 = android.os.Message.obtain(r1, r2, r7)
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.sendMessageDelayed(r7, r2)
            W1.a r7 = r6.f4230e
            W1.e r1 = r6.f4239n
            com.google.android.gms.internal.measurement.X r1 = r1.f4312I
            r2 = 11
            android.os.Message r7 = android.os.Message.obtain(r1, r2, r7)
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r1.sendMessageDelayed(r7, r2)
            W1.e r7 = r6.f4239n
            u1.b r7 = r7.f4306C
            java.lang.Object r7 = r7.f12822x
            android.util.SparseIntArray r7 = (android.util.SparseIntArray) r7
            r7.clear()
            java.util.HashMap r7 = r6.f4233h
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L82
            return
        L82:
            java.lang.Object r7 = r7.next()
            d.AbstractC0628i.p(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.E.h(int):void");
    }

    public final void i() {
        C0211e c0211e = this.f4239n;
        com.google.android.gms.internal.measurement.X x5 = c0211e.f4312I;
        C0207a c0207a = this.f4230e;
        x5.removeMessages(12, c0207a);
        com.google.android.gms.internal.measurement.X x6 = c0211e.f4312I;
        x6.sendMessageDelayed(x6.obtainMessage(12, c0207a), c0211e.f4314w);
    }

    public final boolean j(V v5) {
        U1.d dVar;
        if (!(v5 instanceof K)) {
            AbstractC0242j abstractC0242j = this.f4229d;
            v5.d(this.f4231f, abstractC0242j.j());
            try {
                v5.c(this);
            } catch (DeadObjectException unused) {
                b(1);
                abstractC0242j.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        K k5 = (K) v5;
        U1.d[] dVarArrG = k5.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
        } else {
            X1.L l5 = this.f4229d.f4561A;
            U1.d[] dVarArr = l5 == null ? null : l5.f4532x;
            if (dVarArr == null) {
                dVarArr = new U1.d[0];
            }
            C1280b c1280b = new C1280b(dVarArr.length);
            for (U1.d dVar2 : dVarArr) {
                c1280b.put(dVar2.f3582w, Long.valueOf(dVar2.b()));
            }
            int length = dVarArrG.length;
            for (int i6 = 0; i6 < length; i6++) {
                dVar = dVarArrG[i6];
                Long l6 = (Long) c1280b.getOrDefault(dVar.f3582w, null);
                if (l6 == null || l6.longValue() < dVar.b()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            AbstractC0242j abstractC0242j2 = this.f4229d;
            v5.d(this.f4231f, abstractC0242j2.j());
            try {
                v5.c(this);
            } catch (DeadObjectException unused2) {
                b(1);
                abstractC0242j2.i("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f4229d.getClass().getName() + " could not execute call because it requires feature (" + dVar.f3582w + ", " + dVar.b() + ").");
        if (!this.f4239n.f4313J || !k5.f(this)) {
            k5.b(new V1.l(dVar));
            return true;
        }
        F f6 = new F(this.f4230e, dVar);
        int iIndexOf = this.f4237l.indexOf(f6);
        if (iIndexOf >= 0) {
            F f7 = (F) this.f4237l.get(iIndexOf);
            this.f4239n.f4312I.removeMessages(15, f7);
            com.google.android.gms.internal.measurement.X x5 = this.f4239n.f4312I;
            x5.sendMessageDelayed(Message.obtain(x5, 15, f7), 5000L);
        } else {
            this.f4237l.add(f6);
            com.google.android.gms.internal.measurement.X x6 = this.f4239n.f4312I;
            x6.sendMessageDelayed(Message.obtain(x6, 15, f6), 5000L);
            com.google.android.gms.internal.measurement.X x7 = this.f4239n.f4312I;
            x7.sendMessageDelayed(Message.obtain(x7, 16, f6), 120000L);
            U1.b bVar = new U1.b(2, null);
            if (!k(bVar)) {
                this.f4239n.b(bVar, this.f4234i);
            }
        }
        return false;
    }

    public final boolean k(U1.b bVar) {
        synchronized (C0211e.f4302M) {
            this.f4239n.getClass();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [X1.j, n2.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l() {
        U1.b bVar;
        C0211e c0211e = this.f4239n;
        AbstractC1332d.e(c0211e.f4312I);
        AbstractC0242j abstractC0242j = this.f4229d;
        if (abstractC0242j.a() || abstractC0242j.x()) {
            return;
        }
        try {
            int iJ = c0211e.f4306C.j(c0211e.f4304A, abstractC0242j);
            if (iJ != 0) {
                U1.b bVar2 = new U1.b(iJ, null);
                Log.w("GoogleApiManager", "The service for " + abstractC0242j.getClass().getName() + " is not available: " + bVar2.toString());
                n(bVar2, null);
                return;
            }
            G g4 = new G(c0211e, abstractC0242j, this.f4230e);
            if (abstractC0242j.j()) {
                Q q5 = this.f4235j;
                AbstractC1332d.m(q5);
                n2.c cVar = q5.f4270h;
                if (cVar != null) {
                    cVar.h();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(q5));
                C0239g c0239g = q5.f4269g;
                c0239g.f4596h = numValueOf;
                Handler handler = q5.f4266d;
                q5.f4270h = q5.f4267e.e(q5.f4265c, handler.getLooper(), c0239g, c0239g.f4595g, q5, q5);
                q5.f4271i = g4;
                Set set = q5.f4268f;
                if (set == null || set.isEmpty()) {
                    handler.post(new P(0, q5));
                } else {
                    q5.f4270h.k();
                }
            }
            try {
                abstractC0242j.g(g4);
                return;
            } catch (SecurityException e6) {
                e = e6;
                bVar = new U1.b(10);
            }
        } catch (IllegalStateException e7) {
            e = e7;
            bVar = new U1.b(10);
        }
        n(bVar, e);
    }

    public final void m(V v5) {
        AbstractC1332d.e(this.f4239n.f4312I);
        boolean zA = this.f4229d.a();
        LinkedList linkedList = this.f4228c;
        if (zA) {
            if (j(v5)) {
                i();
                return;
            } else {
                linkedList.add(v5);
                return;
            }
        }
        linkedList.add(v5);
        U1.b bVar = this.f4238m;
        if (bVar == null || !bVar.b()) {
            l();
        } else {
            n(this.f4238m, null);
        }
    }

    public final void n(U1.b bVar, RuntimeException runtimeException) {
        n2.c cVar;
        AbstractC1332d.e(this.f4239n.f4312I);
        Q q5 = this.f4235j;
        if (q5 != null && (cVar = q5.f4270h) != null) {
            cVar.h();
        }
        AbstractC1332d.e(this.f4239n.f4312I);
        this.f4238m = null;
        ((SparseIntArray) this.f4239n.f4306C.f12822x).clear();
        a(bVar);
        if ((this.f4229d instanceof Z1.d) && bVar.f3576x != 24) {
            C0211e c0211e = this.f4239n;
            c0211e.f4315x = true;
            com.google.android.gms.internal.measurement.X x5 = c0211e.f4312I;
            x5.sendMessageDelayed(x5.obtainMessage(19), 300000L);
        }
        if (bVar.f3576x == 4) {
            c(C0211e.f4301L);
            return;
        }
        if (this.f4228c.isEmpty()) {
            this.f4238m = bVar;
            return;
        }
        if (runtimeException != null) {
            AbstractC1332d.e(this.f4239n.f4312I);
            d(null, runtimeException, false);
            return;
        }
        if (!this.f4239n.f4313J) {
            c(C0211e.c(this.f4230e, bVar));
            return;
        }
        d(C0211e.c(this.f4230e, bVar), null, true);
        if (this.f4228c.isEmpty() || k(bVar) || this.f4239n.b(bVar, this.f4234i)) {
            return;
        }
        if (bVar.f3576x == 18) {
            this.f4236k = true;
        }
        if (!this.f4236k) {
            c(C0211e.c(this.f4230e, bVar));
            return;
        }
        C0211e c0211e2 = this.f4239n;
        C0207a c0207a = this.f4230e;
        com.google.android.gms.internal.measurement.X x6 = c0211e2.f4312I;
        x6.sendMessageDelayed(Message.obtain(x6, 9, c0207a), 5000L);
    }

    public final void o(U1.b bVar) {
        AbstractC1332d.e(this.f4239n.f4312I);
        AbstractC0242j abstractC0242j = this.f4229d;
        abstractC0242j.i("onSignInFailed for " + abstractC0242j.getClass().getName() + " with " + String.valueOf(bVar));
        n(bVar, null);
    }

    public final void p() {
        C0211e c0211e = this.f4239n;
        AbstractC1332d.e(c0211e.f4312I);
        Status status = C0211e.f4300K;
        c(status);
        C0924C c0924c = this.f4231f;
        c0924c.getClass();
        c0924c.a(false, status);
        for (AbstractC0214h abstractC0214h : (AbstractC0214h[]) this.f4233h.keySet().toArray(new AbstractC0214h[0])) {
            m(new U(new q2.j()));
        }
        a(new U1.b(4));
        AbstractC0242j abstractC0242j = this.f4229d;
        if (abstractC0242j.a()) {
            C0215i c0215i = new C0215i(this);
            abstractC0242j.getClass();
            c0211e.f4312I.post(new P(3, c0215i));
        }
    }

    @Override // W1.Z
    public final void s(U1.b bVar, V1.d dVar, boolean z5) {
        throw null;
    }
}
