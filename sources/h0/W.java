package h0;

import D.C0012m;
import N.InterfaceC0102m;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0314n;
import com.google.android.gms.internal.measurement.C0396c2;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.C0618F;
import d.C0625f;
import d.C0635p;
import d.InterfaceC0619G;
import f.C0679e;
import f.InterfaceC0681g;
import g.C0713b;
import i0.AbstractC0823c;
import j.RunnableC0835a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s4.AbstractC1305a;
import z0.C1523d;
import z0.InterfaceC1525f;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N f8679A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final O f8680B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0679e f8681C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0679e f8682D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0679e f8683E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayDeque f8684F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f8685G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f8686H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f8687I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f8688J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f8689K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f8690L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f8691M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f8692N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Z f8693O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final RunnableC0835a f8694P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8696b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f8699e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0618F f8701g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f8708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0396c2 f8709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f8710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final J f8711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final J f8712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J f8713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J f8714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M f8715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public D f8717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.c f8718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0734B f8719y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0734B f8720z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8695a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J3.w f8697c = new J3.w(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f8698d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H f8700f = new H(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0736a f8702h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8703i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final L f8704j = new L(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f8705k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f8706l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f8707m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v6, types: [h0.J] */
    /* JADX WARN: Type inference failed for: r0v7, types: [h0.J] */
    /* JADX WARN: Type inference failed for: r0v8, types: [h0.J] */
    /* JADX WARN: Type inference failed for: r1v11, types: [h0.J] */
    public W() {
        final int i6 = 0;
        Collections.synchronizedMap(new HashMap());
        this.f8708n = new ArrayList();
        this.f8709o = new C0396c2(this);
        this.f8710p = new CopyOnWriteArrayList();
        this.f8711q = new M.a(this) { // from class: h0.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ W f8663b;

            {
                this.f8663b = this;
            }

            @Override // M.a
            public final void a(Object obj) {
                int i7 = i6;
                W w5 = this.f8663b;
                switch (i7) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (w5.L()) {
                            w5.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w5.L() && num.intValue() == 80) {
                            w5.m(false);
                            break;
                        }
                        break;
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        C0012m c0012m = (C0012m) obj;
                        if (w5.L()) {
                            w5.n(c0012m.f206a, false);
                        }
                        break;
                    default:
                        D.N n5 = (D.N) obj;
                        if (w5.L()) {
                            w5.s(n5.f189a, false);
                        }
                        break;
                }
            }
        };
        final int i7 = 1;
        this.f8712r = new M.a(this) { // from class: h0.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ W f8663b;

            {
                this.f8663b = this;
            }

            @Override // M.a
            public final void a(Object obj) {
                int i72 = i7;
                W w5 = this.f8663b;
                switch (i72) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (w5.L()) {
                            w5.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w5.L() && num.intValue() == 80) {
                            w5.m(false);
                            break;
                        }
                        break;
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        C0012m c0012m = (C0012m) obj;
                        if (w5.L()) {
                            w5.n(c0012m.f206a, false);
                        }
                        break;
                    default:
                        D.N n5 = (D.N) obj;
                        if (w5.L()) {
                            w5.s(n5.f189a, false);
                        }
                        break;
                }
            }
        };
        final int i8 = 2;
        this.f8713s = new M.a(this) { // from class: h0.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ W f8663b;

            {
                this.f8663b = this;
            }

            @Override // M.a
            public final void a(Object obj) {
                int i72 = i8;
                W w5 = this.f8663b;
                switch (i72) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (w5.L()) {
                            w5.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w5.L() && num.intValue() == 80) {
                            w5.m(false);
                            break;
                        }
                        break;
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        C0012m c0012m = (C0012m) obj;
                        if (w5.L()) {
                            w5.n(c0012m.f206a, false);
                        }
                        break;
                    default:
                        D.N n5 = (D.N) obj;
                        if (w5.L()) {
                            w5.s(n5.f189a, false);
                        }
                        break;
                }
            }
        };
        final int i9 = 3;
        this.f8714t = new M.a(this) { // from class: h0.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ W f8663b;

            {
                this.f8663b = this;
            }

            @Override // M.a
            public final void a(Object obj) {
                int i72 = i9;
                W w5 = this.f8663b;
                switch (i72) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (w5.L()) {
                            w5.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (w5.L() && num.intValue() == 80) {
                            w5.m(false);
                            break;
                        }
                        break;
                    case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                        C0012m c0012m = (C0012m) obj;
                        if (w5.L()) {
                            w5.n(c0012m.f206a, false);
                        }
                        break;
                    default:
                        D.N n5 = (D.N) obj;
                        if (w5.L()) {
                            w5.s(n5.f189a, false);
                        }
                        break;
                }
            }
        };
        this.f8715u = new M(this);
        this.f8716v = -1;
        this.f8679A = new N(this);
        this.f8680B = new O(this);
        this.f8684F = new ArrayDeque();
        this.f8694P = new RunnableC0835a(8, this);
    }

    public static HashSet F(C0736a c0736a) {
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < c0736a.f8736a.size(); i6++) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = ((d0) c0736a.f8736a.get(i6)).f8793b;
            if (abstractComponentCallbacksC0734B != null && c0736a.f8742g) {
                hashSet.add(abstractComponentCallbacksC0734B);
            }
        }
        return hashSet;
    }

    public static boolean K(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        boolean zK = false;
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 : abstractComponentCallbacksC0734B.f8607R.f8697c.i()) {
            if (abstractComponentCallbacksC0734B2 != null) {
                zK = K(abstractComponentCallbacksC0734B2);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (abstractComponentCallbacksC0734B == null) {
            return true;
        }
        return abstractComponentCallbacksC0734B.f8615Z && (abstractComponentCallbacksC0734B.f8605P == null || M(abstractComponentCallbacksC0734B.f8608S));
    }

    public static boolean N(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (abstractComponentCallbacksC0734B == null) {
            return true;
        }
        W w5 = abstractComponentCallbacksC0734B.f8605P;
        return abstractComponentCallbacksC0734B.equals(w5.f8720z) && N(w5.f8719y);
    }

    public static void c0(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0734B);
        }
        if (abstractComponentCallbacksC0734B.f8612W) {
            abstractComponentCallbacksC0734B.f8612W = false;
            abstractComponentCallbacksC0734B.f8622g0 = !abstractComponentCallbacksC0734B.f8622g0;
        }
    }

    public final void A(T t5, boolean z5) {
        boolean z6;
        if (z5 && (this.f8717w == null || this.f8688J)) {
            return;
        }
        y(z5);
        C0736a c0736a = this.f8702h;
        if (c0736a != null) {
            c0736a.f8753r = false;
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f8702h + " as part of execSingleAction for action " + t5);
            }
            this.f8702h.d(false, false);
            this.f8702h.a(this.f8690L, this.f8691M);
            Iterator it = this.f8702h.f8736a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = ((d0) it.next()).f8793b;
                if (abstractComponentCallbacksC0734B != null) {
                    abstractComponentCallbacksC0734B.f8598I = false;
                }
            }
            this.f8702h = null;
            z6 = true;
        } else {
            z6 = false;
        }
        boolean zA = t5.a(this.f8690L, this.f8691M);
        if (z6 || zA) {
            this.f8696b = true;
            try {
                U(this.f8690L, this.f8691M);
            } finally {
                d();
            }
        }
        g0();
        if (this.f8689K) {
            this.f8689K = false;
            d0();
        }
        ((HashMap) this.f8697c.f1442b).values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0232 A[PHI: r13
      0x0232: PHI (r13v13 int) = (r13v11 int), (r13v14 int) binds: [B:109:0x0222, B:114:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.util.ArrayList r21, java.util.ArrayList r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.W.B(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final AbstractComponentCallbacksC0734B C(int i6) {
        J3.w wVar = this.f8697c;
        for (int size = ((ArrayList) wVar.f1441a).size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) ((ArrayList) wVar.f1441a).get(size);
            if (abstractComponentCallbacksC0734B != null && abstractComponentCallbacksC0734B.f8609T == i6) {
                return abstractComponentCallbacksC0734B;
            }
        }
        for (c0 c0Var : ((HashMap) wVar.f1442b).values()) {
            if (c0Var != null) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = c0Var.f8787c;
                if (abstractComponentCallbacksC0734B2.f8609T == i6) {
                    return abstractComponentCallbacksC0734B2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0734B D(String str) {
        J3.w wVar = this.f8697c;
        for (int size = ((ArrayList) wVar.f1441a).size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) ((ArrayList) wVar.f1441a).get(size);
            if (abstractComponentCallbacksC0734B != null && str.equals(abstractComponentCallbacksC0734B.f8611V)) {
                return abstractComponentCallbacksC0734B;
            }
        }
        for (c0 c0Var : ((HashMap) wVar.f1442b).values()) {
            if (c0Var != null) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = c0Var.f8787c;
                if (str.equals(abstractComponentCallbacksC0734B2.f8611V)) {
                    return abstractComponentCallbacksC0734B2;
                }
            }
        }
        return null;
    }

    public final void E() {
        for (u0 u0Var : e()) {
            if (u0Var.f8906f) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                u0Var.f8906f = false;
                u0Var.i();
            }
        }
    }

    public final ViewGroup G(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        ViewGroup viewGroup = abstractComponentCallbacksC0734B.f8617b0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0734B.f8610U > 0 && this.f8718x.D()) {
            View viewA = this.f8718x.A(abstractComponentCallbacksC0734B.f8610U);
            if (viewA instanceof ViewGroup) {
                return (ViewGroup) viewA;
            }
        }
        return null;
    }

    public final N H() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8719y;
        return abstractComponentCallbacksC0734B != null ? abstractComponentCallbacksC0734B.f8605P.H() : this.f8679A;
    }

    public final O I() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8719y;
        return abstractComponentCallbacksC0734B != null ? abstractComponentCallbacksC0734B.f8605P.I() : this.f8680B;
    }

    public final void J(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0734B);
        }
        if (abstractComponentCallbacksC0734B.f8612W) {
            return;
        }
        abstractComponentCallbacksC0734B.f8612W = true;
        abstractComponentCallbacksC0734B.f8622g0 = true ^ abstractComponentCallbacksC0734B.f8622g0;
        b0(abstractComponentCallbacksC0734B);
    }

    public final boolean L() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8719y;
        if (abstractComponentCallbacksC0734B == null) {
            return true;
        }
        return abstractComponentCallbacksC0734B.s() && this.f8719y.o().L();
    }

    public final void O(int i6, boolean z5) {
        D d6;
        if (this.f8717w == null && i6 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i6 != this.f8716v) {
            this.f8716v = i6;
            J3.w wVar = this.f8697c;
            Iterator it = ((ArrayList) wVar.f1441a).iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) ((HashMap) wVar.f1442b).get(((AbstractComponentCallbacksC0734B) it.next()).f8590A);
                if (c0Var != null) {
                    c0Var.k();
                }
            }
            for (c0 c0Var2 : ((HashMap) wVar.f1442b).values()) {
                if (c0Var2 != null) {
                    c0Var2.k();
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var2.f8787c;
                    if (abstractComponentCallbacksC0734B.f8597H && !abstractComponentCallbacksC0734B.u()) {
                        wVar.p(c0Var2);
                    }
                }
            }
            d0();
            if (this.f8685G && (d6 = this.f8717w) != null && this.f8716v == 7) {
                d6.f8641B.invalidateOptionsMenu();
                this.f8685G = false;
            }
        }
    }

    public final void P() {
        if (this.f8717w == null) {
            return;
        }
        this.f8686H = false;
        this.f8687I = false;
        this.f8693O.f8735g = false;
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null) {
                abstractComponentCallbacksC0734B.f8607R.P();
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i6, int i7) {
        z(false);
        y(true);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8720z;
        if (abstractComponentCallbacksC0734B != null && i6 < 0 && abstractComponentCallbacksC0734B.l().Q()) {
            return true;
        }
        boolean zS = S(this.f8690L, this.f8691M, i6, i7);
        if (zS) {
            this.f8696b = true;
            try {
                U(this.f8690L, this.f8691M);
            } finally {
                d();
            }
        }
        g0();
        if (this.f8689K) {
            this.f8689K = false;
            d0();
        }
        ((HashMap) this.f8697c.f1442b).values().removeAll(Collections.singleton(null));
        return zS;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i6, int i7) {
        boolean z5 = (i7 & 1) != 0;
        int size = -1;
        if (!this.f8698d.isEmpty()) {
            if (i6 < 0) {
                size = z5 ? 0 : this.f8698d.size() - 1;
            } else {
                int size2 = this.f8698d.size() - 1;
                while (size2 >= 0) {
                    C0736a c0736a = (C0736a) this.f8698d.get(size2);
                    if (i6 >= 0 && i6 == c0736a.f8754s) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z5) {
                        while (size2 > 0) {
                            C0736a c0736a2 = (C0736a) this.f8698d.get(size2 - 1);
                            if (i6 < 0 || i6 != c0736a2.f8754s) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f8698d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f8698d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0736a) this.f8698d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0734B + " nesting=" + abstractComponentCallbacksC0734B.f8604O);
        }
        boolean z5 = !abstractComponentCallbacksC0734B.u();
        if (!abstractComponentCallbacksC0734B.f8613X || z5) {
            this.f8697c.q(abstractComponentCallbacksC0734B);
            if (K(abstractComponentCallbacksC0734B)) {
                this.f8685G = true;
            }
            abstractComponentCallbacksC0734B.f8597H = true;
            b0(abstractComponentCallbacksC0734B);
        }
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            if (!((C0736a) arrayList.get(i6)).f8750o) {
                if (i7 != i6) {
                    B(arrayList, arrayList2, i7, i6);
                }
                i7 = i6 + 1;
                if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                    while (i7 < size && ((Boolean) arrayList2.get(i7)).booleanValue() && !((C0736a) arrayList.get(i7)).f8750o) {
                        i7++;
                    }
                }
                B(arrayList, arrayList2, i6, i7);
                i6 = i7 - 1;
            }
            i6++;
        }
        if (i7 != size) {
            B(arrayList, arrayList2, i7, size);
        }
    }

    public final void V(Bundle bundle) {
        int i6;
        C0396c2 c0396c2;
        int i7;
        c0 c0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f8717w.f8643y.getClassLoader());
                this.f8707m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f8717w.f8643y.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        J3.w wVar = this.f8697c;
        ((HashMap) wVar.f1443c).clear();
        ((HashMap) wVar.f1443c).putAll(map);
        X x5 = (X) bundle.getParcelable("state");
        if (x5 == null) {
            return;
        }
        ((HashMap) wVar.f1442b).clear();
        Iterator it = x5.f8725w.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i6 = 2;
            c0396c2 = this.f8709o;
            if (!zHasNext) {
                break;
            }
            Bundle bundleR = wVar.r((String) it.next(), null);
            if (bundleR != null) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) this.f8693O.f8730b.get(((b0) bundleR.getParcelable("state")).f8768x);
                if (abstractComponentCallbacksC0734B != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0734B);
                    }
                    c0Var = new c0(c0396c2, wVar, abstractComponentCallbacksC0734B, bundleR);
                } else {
                    c0Var = new c0(this.f8709o, this.f8697c, this.f8717w.f8643y.getClassLoader(), H(), bundleR);
                }
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = c0Var.f8787c;
                abstractComponentCallbacksC0734B2.f8635x = bundleR;
                abstractComponentCallbacksC0734B2.f8605P = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0734B2.f8590A + "): " + abstractComponentCallbacksC0734B2);
                }
                c0Var.m(this.f8717w.f8643y.getClassLoader());
                wVar.o(c0Var);
                c0Var.f8789e = this.f8716v;
            }
        }
        Z z5 = this.f8693O;
        z5.getClass();
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B3 : new ArrayList(z5.f8730b.values())) {
            if (((HashMap) wVar.f1442b).get(abstractComponentCallbacksC0734B3.f8590A) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0734B3 + " that was not found in the set of active Fragments " + x5.f8725w);
                }
                this.f8693O.h(abstractComponentCallbacksC0734B3);
                abstractComponentCallbacksC0734B3.f8605P = this;
                c0 c0Var2 = new c0(c0396c2, wVar, abstractComponentCallbacksC0734B3);
                c0Var2.f8789e = 1;
                c0Var2.k();
                abstractComponentCallbacksC0734B3.f8597H = true;
                c0Var2.k();
            }
        }
        ArrayList<String> arrayList = x5.f8726x;
        ((ArrayList) wVar.f1441a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BF = wVar.f(str3);
                if (abstractComponentCallbacksC0734BF == null) {
                    throw new IllegalStateException(AbstractC0628i.j("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0734BF);
                }
                wVar.a(abstractComponentCallbacksC0734BF);
            }
        }
        if (x5.f8727y != null) {
            this.f8698d = new ArrayList(x5.f8727y.length);
            int i8 = 0;
            while (true) {
                C0738c[] c0738cArr = x5.f8727y;
                if (i8 >= c0738cArr.length) {
                    break;
                }
                C0738c c0738c = c0738cArr[i8];
                c0738c.getClass();
                C0736a c0736a = new C0736a(this);
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int[] iArr = c0738c.f8781w;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    d0 d0Var = new d0();
                    int i11 = i9 + 1;
                    d0Var.f8792a = iArr[i9];
                    if (Log.isLoggable("FragmentManager", i6)) {
                        Log.v("FragmentManager", "Instantiate " + c0736a + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    d0Var.f8799h = EnumC0314n.values()[c0738c.f8783y[i10]];
                    d0Var.f8800i = EnumC0314n.values()[c0738c.f8784z[i10]];
                    int i12 = i9 + 2;
                    d0Var.f8794c = iArr[i11] != 0;
                    int i13 = iArr[i12];
                    d0Var.f8795d = i13;
                    int i14 = iArr[i9 + 3];
                    d0Var.f8796e = i14;
                    int i15 = i9 + 5;
                    int i16 = iArr[i9 + 4];
                    d0Var.f8797f = i16;
                    i9 += 6;
                    int i17 = iArr[i15];
                    d0Var.f8798g = i17;
                    c0736a.f8737b = i13;
                    c0736a.f8738c = i14;
                    c0736a.f8739d = i16;
                    c0736a.f8740e = i17;
                    c0736a.b(d0Var);
                    i10++;
                    i6 = 2;
                }
                c0736a.f8741f = c0738c.f8771A;
                c0736a.f8743h = c0738c.f8772B;
                c0736a.f8742g = true;
                c0736a.f8744i = c0738c.f8774D;
                c0736a.f8745j = c0738c.f8775E;
                c0736a.f8746k = c0738c.f8776F;
                c0736a.f8747l = c0738c.f8777G;
                c0736a.f8748m = c0738c.f8778H;
                c0736a.f8749n = c0738c.f8779I;
                c0736a.f8750o = c0738c.f8780J;
                c0736a.f8754s = c0738c.f8773C;
                int i18 = 0;
                while (true) {
                    ArrayList arrayList2 = c0738c.f8782x;
                    if (i18 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i18);
                    if (str4 != null) {
                        ((d0) c0736a.f8736a.get(i18)).f8793b = wVar.f(str4);
                    }
                    i18++;
                }
                c0736a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sbL = H1.a.l("restoreAllState: back stack #", i8, " (index ");
                    sbL.append(c0736a.f8754s);
                    sbL.append("): ");
                    sbL.append(c0736a);
                    Log.v("FragmentManager", sbL.toString());
                    PrintWriter printWriter = new PrintWriter(new o0());
                    c0736a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f8698d.add(c0736a);
                i8++;
                i6 = 2;
            }
            i7 = 0;
        } else {
            i7 = 0;
            this.f8698d = new ArrayList();
        }
        this.f8705k.set(x5.f8728z);
        String str5 = x5.f8721A;
        if (str5 != null) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BF2 = wVar.f(str5);
            this.f8720z = abstractComponentCallbacksC0734BF2;
            r(abstractComponentCallbacksC0734BF2);
        }
        ArrayList arrayList3 = x5.f8722B;
        if (arrayList3 != null) {
            for (int i19 = i7; i19 < arrayList3.size(); i19++) {
                this.f8706l.put((String) arrayList3.get(i19), (C0739d) x5.f8723C.get(i19));
            }
        }
        this.f8684F = new ArrayDeque(x5.f8724D);
    }

    public final Bundle W() {
        ArrayList arrayList;
        C0738c[] c0738cArr;
        Bundle bundle = new Bundle();
        E();
        w();
        z(true);
        this.f8686H = true;
        this.f8693O.f8735g = true;
        J3.w wVar = this.f8697c;
        wVar.getClass();
        ArrayList arrayList2 = new ArrayList(((HashMap) wVar.f1442b).size());
        for (c0 c0Var : ((HashMap) wVar.f1442b).values()) {
            if (c0Var != null) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
                wVar.r(abstractComponentCallbacksC0734B.f8590A, c0Var.o());
                arrayList2.add(abstractComponentCallbacksC0734B.f8590A);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0734B + ": " + abstractComponentCallbacksC0734B.f8635x);
                }
            }
        }
        HashMap map = (HashMap) this.f8697c.f1443c;
        if (!map.isEmpty()) {
            J3.w wVar2 = this.f8697c;
            synchronized (((ArrayList) wVar2.f1441a)) {
                try {
                    if (((ArrayList) wVar2.f1441a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) wVar2.f1441a).size());
                        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 : (ArrayList) wVar2.f1441a) {
                            arrayList.add(abstractComponentCallbacksC0734B2.f8590A);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0734B2.f8590A + "): " + abstractComponentCallbacksC0734B2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f8698d.size();
            if (size > 0) {
                c0738cArr = new C0738c[size];
                for (int i6 = 0; i6 < size; i6++) {
                    c0738cArr[i6] = new C0738c((C0736a) this.f8698d.get(i6));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sbL = H1.a.l("saveAllState: adding back stack #", i6, ": ");
                        sbL.append(this.f8698d.get(i6));
                        Log.v("FragmentManager", sbL.toString());
                    }
                }
            } else {
                c0738cArr = null;
            }
            X x5 = new X();
            x5.f8721A = null;
            ArrayList arrayList3 = new ArrayList();
            x5.f8722B = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            x5.f8723C = arrayList4;
            x5.f8725w = arrayList2;
            x5.f8726x = arrayList;
            x5.f8727y = c0738cArr;
            x5.f8728z = this.f8705k.get();
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B3 = this.f8720z;
            if (abstractComponentCallbacksC0734B3 != null) {
                x5.f8721A = abstractComponentCallbacksC0734B3.f8590A;
            }
            arrayList3.addAll(this.f8706l.keySet());
            arrayList4.addAll(this.f8706l.values());
            x5.f8724D = new ArrayList(this.f8684F);
            bundle.putParcelable("state", x5);
            for (String str : this.f8707m.keySet()) {
                bundle.putBundle(AbstractC0628i.q("result_", str), (Bundle) this.f8707m.get(str));
            }
            for (String str2 : map.keySet()) {
                bundle.putBundle(AbstractC0628i.q("fragment_", str2), (Bundle) map.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void X() {
        synchronized (this.f8695a) {
            try {
                if (this.f8695a.size() == 1) {
                    this.f8717w.f8644z.removeCallbacks(this.f8694P);
                    this.f8717w.f8644z.post(this.f8694P);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, boolean z5) {
        ViewGroup viewGroupG = G(abstractComponentCallbacksC0734B);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z5);
    }

    public final void Z(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, EnumC0314n enumC0314n) {
        if (abstractComponentCallbacksC0734B.equals(this.f8697c.f(abstractComponentCallbacksC0734B.f8590A)) && (abstractComponentCallbacksC0734B.f8606Q == null || abstractComponentCallbacksC0734B.f8605P == this)) {
            abstractComponentCallbacksC0734B.f8626k0 = enumC0314n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0734B + " is not an active fragment of FragmentManager " + this);
    }

    public final c0 a(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        String str = abstractComponentCallbacksC0734B.f8625j0;
        if (str != null) {
            AbstractC0823c.d(abstractComponentCallbacksC0734B, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0734B);
        }
        c0 c0VarG = g(abstractComponentCallbacksC0734B);
        abstractComponentCallbacksC0734B.f8605P = this;
        J3.w wVar = this.f8697c;
        wVar.o(c0VarG);
        if (!abstractComponentCallbacksC0734B.f8613X) {
            wVar.a(abstractComponentCallbacksC0734B);
            abstractComponentCallbacksC0734B.f8597H = false;
            if (abstractComponentCallbacksC0734B.f8618c0 == null) {
                abstractComponentCallbacksC0734B.f8622g0 = false;
            }
            if (K(abstractComponentCallbacksC0734B)) {
                this.f8685G = true;
            }
        }
        return c0VarG;
    }

    public final void a0(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (abstractComponentCallbacksC0734B != null) {
            if (!abstractComponentCallbacksC0734B.equals(this.f8697c.f(abstractComponentCallbacksC0734B.f8590A)) || (abstractComponentCallbacksC0734B.f8606Q != null && abstractComponentCallbacksC0734B.f8605P != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0734B + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = this.f8720z;
        this.f8720z = abstractComponentCallbacksC0734B;
        r(abstractComponentCallbacksC0734B2);
        r(this.f8720z);
    }

    public final void b(D d6, com.bumptech.glide.c cVar, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (this.f8717w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8717w = d6;
        this.f8718x = cVar;
        this.f8719y = abstractComponentCallbacksC0734B;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8710p;
        if (abstractComponentCallbacksC0734B != null) {
            copyOnWriteArrayList.add(new P(abstractComponentCallbacksC0734B));
        } else if (d6 instanceof a0) {
            copyOnWriteArrayList.add(d6);
        }
        if (this.f8719y != null) {
            g0();
        }
        if (d6 instanceof InterfaceC0619G) {
            C0618F c0618fX = d6.X();
            this.f8701g = c0618fX;
            c0618fX.a(abstractComponentCallbacksC0734B != null ? abstractComponentCallbacksC0734B : d6, this.f8704j);
        }
        int i6 = 0;
        if (abstractComponentCallbacksC0734B != null) {
            Z z5 = abstractComponentCallbacksC0734B.f8605P.f8693O;
            HashMap map = z5.f8731c;
            Z z6 = (Z) map.get(abstractComponentCallbacksC0734B.f8590A);
            if (z6 == null) {
                z6 = new Z(z5.f8733e);
                map.put(abstractComponentCallbacksC0734B.f8590A, z6);
            }
            this.f8693O = z6;
        } else {
            this.f8693O = d6 instanceof androidx.lifecycle.j0 ? (Z) new androidx.lifecycle.h0(d6.f8641B.e(), Z.f8729h).a(D4.s.a(Z.class)) : new Z(false);
        }
        Z z7 = this.f8693O;
        int i7 = 1;
        z7.f8735g = this.f8686H || this.f8687I;
        this.f8697c.f1444d = z7;
        D d7 = this.f8717w;
        if ((d7 instanceof InterfaceC1525f) && abstractComponentCallbacksC0734B == null) {
            C1523d c1523dB = d7.b();
            c1523dB.c("android:support:fragments", new C0625f(2, this));
            Bundle bundleA = c1523dB.a("android:support:fragments");
            if (bundleA != null) {
                V(bundleA);
            }
        }
        D d8 = this.f8717w;
        if (d8 instanceof InterfaceC0681g) {
            C0635p c0635p = d8.f8641B.f8129D;
            String strQ = AbstractC0628i.q("FragmentManager:", abstractComponentCallbacksC0734B != null ? AbstractC0628i.m(new StringBuilder(), abstractComponentCallbacksC0734B.f8590A, ":") : "");
            this.f8681C = c0635p.c(AbstractC0628i.i(strQ, "StartActivityForResult"), new V3.a(), new K(this, i7));
            this.f8682D = c0635p.c(AbstractC0628i.i(strQ, "StartIntentSenderForResult"), new Q(), new O(this));
            this.f8683E = c0635p.c(AbstractC0628i.i(strQ, "RequestPermissions"), new C0713b(), new K(this, i6));
        }
        D d9 = this.f8717w;
        if (d9 instanceof E.g) {
            d9.T(this.f8711q);
        }
        D d10 = this.f8717w;
        if (d10 instanceof E.h) {
            d10.W(this.f8712r);
        }
        D d11 = this.f8717w;
        if (d11 instanceof D.L) {
            d11.U(this.f8713s);
        }
        D d12 = this.f8717w;
        if (d12 instanceof D.M) {
            d12.V(this.f8714t);
        }
        D d13 = this.f8717w;
        if ((d13 instanceof InterfaceC0102m) && abstractComponentCallbacksC0734B == null) {
            d13.S(this.f8715u);
        }
    }

    public final void b0(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        ViewGroup viewGroupG = G(abstractComponentCallbacksC0734B);
        if (viewGroupG != null) {
            C0760z c0760z = abstractComponentCallbacksC0734B.f8621f0;
            if ((c0760z == null ? 0 : c0760z.f8930e) + (c0760z == null ? 0 : c0760z.f8929d) + (c0760z == null ? 0 : c0760z.f8928c) + (c0760z == null ? 0 : c0760z.f8927b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0734B);
                }
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = (AbstractComponentCallbacksC0734B) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                C0760z c0760z2 = abstractComponentCallbacksC0734B.f8621f0;
                boolean z5 = c0760z2 != null ? c0760z2.f8926a : false;
                if (abstractComponentCallbacksC0734B2.f8621f0 == null) {
                    return;
                }
                abstractComponentCallbacksC0734B2.j().f8926a = z5;
            }
        }
    }

    public final void c(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0734B);
        }
        if (abstractComponentCallbacksC0734B.f8613X) {
            abstractComponentCallbacksC0734B.f8613X = false;
            if (abstractComponentCallbacksC0734B.f8596G) {
                return;
            }
            this.f8697c.a(abstractComponentCallbacksC0734B);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0734B);
            }
            if (K(abstractComponentCallbacksC0734B)) {
                this.f8685G = true;
            }
        }
    }

    public final void d() {
        this.f8696b = false;
        this.f8691M.clear();
        this.f8690L.clear();
    }

    public final void d0() {
        for (c0 c0Var : this.f8697c.h()) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
            if (abstractComponentCallbacksC0734B.f8619d0) {
                if (this.f8696b) {
                    this.f8689K = true;
                } else {
                    abstractComponentCallbacksC0734B.f8619d0 = false;
                    c0Var.k();
                }
            }
        }
    }

    public final HashSet e() {
        Object c0752q;
        HashSet hashSet = new HashSet();
        Iterator it = this.f8697c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((c0) it.next()).f8787c.f8617b0;
            if (viewGroup != null) {
                AbstractC1305a.o(I(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof u0) {
                    c0752q = (u0) tag;
                } else {
                    c0752q = new C0752q(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0752q);
                }
                hashSet.add(c0752q);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new o0());
        D d6 = this.f8717w;
        try {
            if (d6 != null) {
                d6.f8641B.dump("  ", null, printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception e6) {
            Log.e("FragmentManager", "Failed dumping state", e6);
            throw illegalStateException;
        }
    }

    public final HashSet f(ArrayList arrayList, int i6, int i7) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i6 < i7) {
            Iterator it = ((C0736a) arrayList.get(i6)).f8736a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = ((d0) it.next()).f8793b;
                if (abstractComponentCallbacksC0734B != null && (viewGroup = abstractComponentCallbacksC0734B.f8617b0) != null) {
                    hashSet.add(u0.m(viewGroup, this));
                }
            }
            i6++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8719y;
        if (abstractComponentCallbacksC0734B != null) {
            sb.append(abstractComponentCallbacksC0734B.getClass().getSimpleName());
            sb.append("{");
            obj = this.f8719y;
        } else {
            D d6 = this.f8717w;
            if (d6 == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(d6.getClass().getSimpleName());
            sb.append("{");
            obj = this.f8717w;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final c0 g(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        String str = abstractComponentCallbacksC0734B.f8590A;
        J3.w wVar = this.f8697c;
        c0 c0Var = (c0) ((HashMap) wVar.f1442b).get(str);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this.f8709o, wVar, abstractComponentCallbacksC0734B);
        c0Var2.m(this.f8717w.f8643y.getClassLoader());
        c0Var2.f8789e = this.f8716v;
        return c0Var2;
    }

    public final void g0() {
        synchronized (this.f8695a) {
            try {
                if (!this.f8695a.isEmpty()) {
                    L l5 = this.f8704j;
                    l5.f8149a = true;
                    C4.a aVar = l5.f8151c;
                    if (aVar != null) {
                        aVar.b();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z5 = this.f8698d.size() + (this.f8702h != null ? 1 : 0) > 0 && N(this.f8719y);
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z5);
                }
                L l6 = this.f8704j;
                l6.f8149a = z5;
                C4.a aVar2 = l6.f8151c;
                if (aVar2 != null) {
                    aVar2.b();
                }
            } finally {
            }
        }
    }

    public final void h(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0734B);
        }
        if (abstractComponentCallbacksC0734B.f8613X) {
            return;
        }
        abstractComponentCallbacksC0734B.f8613X = true;
        if (abstractComponentCallbacksC0734B.f8596G) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0734B);
            }
            this.f8697c.q(abstractComponentCallbacksC0734B);
            if (K(abstractComponentCallbacksC0734B)) {
                this.f8685G = true;
            }
            b0(abstractComponentCallbacksC0734B);
        }
    }

    public final void i(boolean z5) {
        if (z5 && (this.f8717w instanceof E.g)) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null) {
                abstractComponentCallbacksC0734B.f8616a0 = true;
                if (z5) {
                    abstractComponentCallbacksC0734B.f8607R.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f8716v < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null && !abstractComponentCallbacksC0734B.f8612W && abstractComponentCallbacksC0734B.f8607R.j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f8716v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null && M(abstractComponentCallbacksC0734B) && !abstractComponentCallbacksC0734B.f8612W && abstractComponentCallbacksC0734B.f8607R.k()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0734B);
                z5 = true;
            }
        }
        if (this.f8699e != null) {
            for (int i6 = 0; i6 < this.f8699e.size(); i6++) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = (AbstractComponentCallbacksC0734B) this.f8699e.get(i6);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0734B2)) {
                    abstractComponentCallbacksC0734B2.getClass();
                }
            }
        }
        this.f8699e = arrayList;
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.W.l():void");
    }

    public final void m(boolean z5) {
        if (z5 && (this.f8717w instanceof E.h)) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null) {
                abstractComponentCallbacksC0734B.f8616a0 = true;
                if (z5) {
                    abstractComponentCallbacksC0734B.f8607R.m(true);
                }
            }
        }
    }

    public final void n(boolean z5, boolean z6) {
        if (z6 && (this.f8717w instanceof D.L)) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null && z6) {
                abstractComponentCallbacksC0734B.f8607R.n(z5, true);
            }
        }
    }

    public final void o() {
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.i()) {
            if (abstractComponentCallbacksC0734B != null) {
                abstractComponentCallbacksC0734B.t();
                abstractComponentCallbacksC0734B.f8607R.o();
            }
        }
    }

    public final boolean p() {
        if (this.f8716v < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null && !abstractComponentCallbacksC0734B.f8612W && abstractComponentCallbacksC0734B.f8607R.p()) {
                return true;
            }
        }
        return false;
    }

    public final void q() {
        if (this.f8716v < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null && !abstractComponentCallbacksC0734B.f8612W) {
                abstractComponentCallbacksC0734B.f8607R.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (abstractComponentCallbacksC0734B != null) {
            if (abstractComponentCallbacksC0734B.equals(this.f8697c.f(abstractComponentCallbacksC0734B.f8590A))) {
                abstractComponentCallbacksC0734B.f8605P.getClass();
                boolean zN = N(abstractComponentCallbacksC0734B);
                Boolean bool = abstractComponentCallbacksC0734B.f8595F;
                if (bool == null || bool.booleanValue() != zN) {
                    abstractComponentCallbacksC0734B.f8595F = Boolean.valueOf(zN);
                    W w5 = abstractComponentCallbacksC0734B.f8607R;
                    w5.g0();
                    w5.r(w5.f8720z);
                }
            }
        }
    }

    public final void s(boolean z5, boolean z6) {
        if (z6 && (this.f8717w instanceof D.M)) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
            if (abstractComponentCallbacksC0734B != null && z6) {
                abstractComponentCallbacksC0734B.f8607R.s(z5, true);
            }
        }
    }

    public final boolean t() {
        boolean z5 = false;
        if (this.f8716v >= 1) {
            for (AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B : this.f8697c.j()) {
                if (abstractComponentCallbacksC0734B != null && M(abstractComponentCallbacksC0734B) && !abstractComponentCallbacksC0734B.f8612W && abstractComponentCallbacksC0734B.f8607R.t()) {
                    z5 = true;
                }
            }
        }
        return z5;
    }

    public final void u(int i6) {
        try {
            this.f8696b = true;
            for (c0 c0Var : ((HashMap) this.f8697c.f1442b).values()) {
                if (c0Var != null) {
                    c0Var.f8789e = i6;
                }
            }
            O(i6, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((u0) it.next()).l();
            }
            this.f8696b = false;
            z(true);
        } catch (Throwable th) {
            this.f8696b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strI = AbstractC0628i.i(str, "    ");
        J3.w wVar = this.f8697c;
        wVar.getClass();
        String str2 = str + "    ";
        if (!((HashMap) wVar.f1442b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (c0 c0Var : ((HashMap) wVar.f1442b).values()) {
                printWriter.print(str);
                if (c0Var != null) {
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
                    printWriter.println(abstractComponentCallbacksC0734B);
                    abstractComponentCallbacksC0734B.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = ((ArrayList) wVar.f1441a).size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i6 = 0; i6 < size2; i6++) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = (AbstractComponentCallbacksC0734B) ((ArrayList) wVar.f1441a).get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0734B2.toString());
            }
        }
        ArrayList arrayList = this.f8699e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size; i7++) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B3 = (AbstractComponentCallbacksC0734B) this.f8699e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0734B3.toString());
            }
        }
        int size3 = this.f8698d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size3; i8++) {
                C0736a c0736a = (C0736a) this.f8698d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c0736a.toString());
                c0736a.f(strI, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f8705k.get());
        synchronized (this.f8695a) {
            try {
                int size4 = this.f8695a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size4; i9++) {
                        Object obj = (T) this.f8695a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8717w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8718x);
        if (this.f8719y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8719y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8716v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8686H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8687I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f8688J);
        if (this.f8685G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8685G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((u0) it.next()).l();
        }
    }

    public final void x(T t5, boolean z5) {
        if (!z5) {
            if (this.f8717w == null) {
                if (!this.f8688J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f8686H || this.f8687I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f8695a) {
            try {
                if (this.f8717w != null) {
                    this.f8695a.add(t5);
                    X();
                } else if (!z5) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } finally {
            }
        }
    }

    public final void y(boolean z5) {
        if (this.f8696b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8717w == null) {
            if (!this.f8688J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8717w.f8644z.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5 && (this.f8686H || this.f8687I)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f8690L == null) {
            this.f8690L = new ArrayList();
            this.f8691M = new ArrayList();
        }
    }

    public final boolean z(boolean z5) {
        C0736a c0736a;
        y(z5);
        if (!this.f8703i && (c0736a = this.f8702h) != null) {
            c0736a.f8753r = false;
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f8702h + " as part of execPendingActions for actions " + this.f8695a);
            }
            this.f8702h.d(false, false);
            this.f8695a.add(0, this.f8702h);
            Iterator it = this.f8702h.f8736a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = ((d0) it.next()).f8793b;
                if (abstractComponentCallbacksC0734B != null) {
                    abstractComponentCallbacksC0734B.f8598I = false;
                }
            }
            this.f8702h = null;
        }
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f8690L;
            ArrayList arrayList2 = this.f8691M;
            synchronized (this.f8695a) {
                if (this.f8695a.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f8695a.size();
                    boolean zA = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        zA |= ((T) this.f8695a.get(i6)).a(arrayList, arrayList2);
                    }
                    if (!zA) {
                        break;
                    }
                    z6 = true;
                    this.f8696b = true;
                    try {
                        U(this.f8690L, this.f8691M);
                    } finally {
                        d();
                    }
                } finally {
                    this.f8695a.clear();
                    this.f8717w.f8644z.removeCallbacks(this.f8694P);
                }
            }
        }
        g0();
        if (this.f8689K) {
            this.f8689K = false;
            d0();
        }
        ((HashMap) this.f8697c.f1442b).values().removeAll(Collections.singleton(null));
        return z6;
    }
}
