package h0;

import N.AbstractC0082a0;
import N.ViewTreeObserverOnPreDrawListenerC0110v;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import d.C0621b;
import d.RunnableC0632m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m.Z0;
import s.C1280b;
import s4.AbstractC1305a;
import s4.C1311g;

/* JADX INFO: renamed from: h0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0750o extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0 f8859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f8860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f8861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f8862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f8863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f8864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1280b f8865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f8866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f8867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1280b f8868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1280b f8869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z0 f8870o = new Z0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f8871p;

    public C0750o(ArrayList arrayList, s0 s0Var, s0 s0Var2, l0 l0Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, C1280b c1280b, ArrayList arrayList4, ArrayList arrayList5, C1280b c1280b2, C1280b c1280b3, boolean z5) {
        this.f8858c = arrayList;
        this.f8859d = s0Var;
        this.f8860e = s0Var2;
        this.f8861f = l0Var;
        this.f8862g = obj;
        this.f8863h = arrayList2;
        this.f8864i = arrayList3;
        this.f8865j = c1280b;
        this.f8866k = arrayList4;
        this.f8867l = arrayList5;
        this.f8868m = c1280b2;
        this.f8869n = c1280b3;
    }

    public static void f(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!AbstractC0082a0.b(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    if (childAt.getVisibility() == 0) {
                        f(arrayList, childAt);
                    }
                }
                return;
            }
            if (arrayList.contains(view)) {
                return;
            }
        } else if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    @Override // h0.q0
    public final boolean a() {
        Object obj;
        Object obj2;
        l0 l0Var = this.f8861f;
        if (l0Var.l()) {
            List<C0751p> list = this.f8858c;
            if ((list instanceof Collection) && list.isEmpty()) {
                obj2 = this.f8862g;
                if (obj2 != null) {
                }
                return true;
            }
            for (C0751p c0751p : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = c0751p.f8875x) == null || !l0Var.m(obj)) {
                    break;
                }
            }
            obj2 = this.f8862g;
            if (obj2 != null || l0Var.m(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // h0.q0
    public final void b(ViewGroup viewGroup) {
        AbstractC1305a.o(viewGroup, "container");
        this.f8870o.a();
    }

    @Override // h0.q0
    public final void c(ViewGroup viewGroup) {
        Object obj;
        StringBuilder sb;
        AbstractC1305a.o(viewGroup, "container");
        boolean zIsLaidOut = viewGroup.isLaidOut();
        List<C0751p> list = this.f8858c;
        if (!zIsLaidOut) {
            for (C0751p c0751p : list) {
                s0 s0Var = (s0) c0751p.f1668w;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + s0Var);
                }
                ((s0) c0751p.f1668w).c(this);
            }
            return;
        }
        Object obj2 = this.f8871p;
        l0 l0Var = this.f8861f;
        s0 s0Var2 = this.f8860e;
        s0 s0Var3 = this.f8859d;
        if (obj2 != null) {
            l0Var.c(obj2);
            if (!Log.isLoggable("FragmentManager", 2)) {
                return;
            } else {
                sb = new StringBuilder("Ending execution of operations from ");
            }
        } else {
            C1311g c1311gG = g(viewGroup, s0Var2, s0Var3);
            ArrayList arrayList = (ArrayList) c1311gG.f12632w;
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(t4.k.W(list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add((s0) ((C0751p) it.next()).f1668w);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                obj = c1311gG.f12633x;
                if (!zHasNext) {
                    break;
                }
                s0 s0Var4 = (s0) it2.next();
                l0Var.u(s0Var4.f8888c, obj, this.f8870o, new RunnableC0747l(s0Var4, this, 1));
            }
            i(arrayList, viewGroup, new C0748m(this, viewGroup, obj));
            if (!Log.isLoggable("FragmentManager", 2)) {
                return;
            } else {
                sb = new StringBuilder("Completed executing operations from ");
            }
        }
        sb.append(s0Var3);
        sb.append(" to ");
        sb.append(s0Var2);
        Log.v("FragmentManager", sb.toString());
    }

    @Override // h0.q0
    public final void d(C0621b c0621b, ViewGroup viewGroup) {
        AbstractC1305a.o(c0621b, "backEvent");
        AbstractC1305a.o(viewGroup, "container");
        Object obj = this.f8871p;
        if (obj != null) {
            this.f8861f.r(obj, c0621b.f8093c);
        }
    }

    @Override // h0.q0
    public final void e(ViewGroup viewGroup) {
        Object obj;
        boolean zIsLaidOut = viewGroup.isLaidOut();
        List list = this.f8858c;
        if (!zIsLaidOut) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                s0 s0Var = (s0) ((C0751p) it.next()).f1668w;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + s0Var);
                }
            }
            return;
        }
        boolean zH = h();
        s0 s0Var2 = this.f8860e;
        s0 s0Var3 = this.f8859d;
        if (zH && (obj = this.f8862g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + s0Var3 + " and " + s0Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (!a() || !h()) {
            return;
        }
        D4.r rVar = new D4.r();
        C1311g c1311gG = g(viewGroup, s0Var2, s0Var3);
        ArrayList arrayList = (ArrayList) c1311gG.f12632w;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(t4.k.W(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((s0) ((C0751p) it2.next()).f1668w);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            Object obj2 = c1311gG.f12633x;
            if (!zHasNext) {
                i(arrayList, viewGroup, new C0749n(this, viewGroup, obj2, rVar));
                return;
            }
            s0 s0Var4 = (s0) it3.next();
            RunnableC0632m runnableC0632m = new RunnableC0632m(5, rVar);
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = s0Var4.f8888c;
            this.f8861f.v(obj2, this.f8870o, runnableC0632m, new RunnableC0747l(s0Var4, this, 0));
        }
    }

    public final C1311g g(ViewGroup viewGroup, s0 s0Var, s0 s0Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        l0 l0Var;
        Object obj2;
        Iterator it;
        C0750o c0750o = this;
        ViewGroup viewGroup2 = viewGroup;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        List list = c0750o.f8858c;
        Iterator it2 = list.iterator();
        View view2 = null;
        boolean z5 = false;
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = c0750o.f8864i;
            arrayList2 = c0750o.f8863h;
            obj = c0750o.f8862g;
            l0Var = c0750o.f8861f;
            if (!zHasNext) {
                break;
            }
            if (((C0751p) it2.next()).f8877z == null || s0Var2 == null || s0Var == null || !(!c0750o.f8865j.isEmpty()) || obj == null) {
                it = it2;
            } else {
                j0 j0Var = e0.f8805a;
                AbstractC1305a.o(s0Var.f8888c, "inFragment");
                AbstractC1305a.o(s0Var2.f8888c, "outFragment");
                C1280b c1280b = c0750o.f8868m;
                AbstractC1305a.o(c1280b, "sharedElements");
                it = it2;
                ViewTreeObserverOnPreDrawListenerC0110v.a(viewGroup2, new c0.n(s0Var, s0Var2, c0750o, 2));
                arrayList2.addAll(c1280b.values());
                ArrayList arrayList3 = c0750o.f8867l;
                if (!arrayList3.isEmpty()) {
                    Object obj3 = arrayList3.get(0);
                    AbstractC1305a.n(obj3, "exitingNames[0]");
                    View view3 = (View) c1280b.getOrDefault((String) obj3, null);
                    l0Var.s(view3, obj);
                    view2 = view3;
                }
                C1280b c1280b2 = c0750o.f8869n;
                arrayList.addAll(c1280b2.values());
                ArrayList arrayList4 = c0750o.f8866k;
                if (!arrayList4.isEmpty()) {
                    Object obj4 = arrayList4.get(0);
                    AbstractC1305a.n(obj4, "enteringNames[0]");
                    View view4 = (View) c1280b2.getOrDefault((String) obj4, null);
                    if (view4 != null) {
                        ViewTreeObserverOnPreDrawListenerC0110v.a(viewGroup2, new c0.n(l0Var, view4, rect, 3));
                        z5 = true;
                    }
                }
                l0Var.w(obj, view, arrayList2);
                l0 l0Var2 = c0750o.f8861f;
                Object obj5 = c0750o.f8862g;
                l0Var2.q(obj5, null, null, obj5, c0750o.f8864i);
            }
            it2 = it;
        }
        Object objO = null;
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = list.iterator();
        Object objO2 = null;
        while (true) {
            obj2 = objO2;
            if (!it3.hasNext()) {
                break;
            }
            Iterator it4 = it3;
            C0751p c0751p = (C0751p) it3.next();
            Object obj6 = objO;
            s0 s0Var3 = (s0) c0751p.f1668w;
            View view5 = view2;
            Object objH = l0Var.h(c0751p.f8875x);
            if (objH != null) {
                ArrayList arrayList6 = new ArrayList();
                View view6 = s0Var3.f8888c.f8618c0;
                Rect rect2 = rect;
                AbstractC1305a.n(view6, "operation.fragment.mView");
                f(arrayList6, view6);
                if (obj != null && (s0Var3 == s0Var2 || s0Var3 == s0Var)) {
                    arrayList6.removeAll(s0Var3 == s0Var2 ? t4.n.m0(arrayList2) : t4.n.m0(arrayList));
                }
                if (arrayList6.isEmpty()) {
                    l0Var.a(view, objH);
                } else {
                    l0Var.b(objH, arrayList6);
                    c0750o.f8861f.q(objH, objH, arrayList6, null, null);
                    if (s0Var3.f8886a == 3) {
                        s0Var3.f8894i = false;
                        ArrayList arrayList7 = new ArrayList(arrayList6);
                        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = s0Var3.f8888c;
                        arrayList7.remove(abstractComponentCallbacksC0734B.f8618c0);
                        l0Var.p(objH, abstractComponentCallbacksC0734B.f8618c0, arrayList7);
                        ViewTreeObserverOnPreDrawListenerC0110v.a(viewGroup2, new RunnableC0632m(6, arrayList6));
                    }
                }
                if (s0Var3.f8886a == 2) {
                    arrayList5.addAll(arrayList6);
                    if (z5) {
                        l0Var.t(objH, rect2);
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Entering Transition: " + objH);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        for (Object obj7 : arrayList6) {
                            AbstractC1305a.n(obj7, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) obj7));
                        }
                    }
                } else {
                    l0Var.s(view5, objH);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view5 = view5;
                        Log.v("FragmentManager", "Exiting Transition: " + objH);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        for (Object obj8 : arrayList6) {
                            AbstractC1305a.n(obj8, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) obj8));
                        }
                    } else {
                        view5 = view5;
                    }
                }
                objO = obj6;
                if (c0751p.f8876y) {
                    objO = l0Var.o(objO, objH);
                    c0750o = this;
                    viewGroup2 = viewGroup;
                    objO2 = obj2;
                } else {
                    objO2 = l0Var.o(obj2, objH);
                    c0750o = this;
                    viewGroup2 = viewGroup;
                }
                it3 = it4;
                view2 = view5;
                rect = rect2;
            } else {
                objO = obj6;
                c0750o = this;
                objO2 = obj2;
                it3 = it4;
                view2 = view5;
                viewGroup2 = viewGroup;
            }
        }
        Object objN = l0Var.n(objO, obj2, obj);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Final merged transition: " + objN);
        }
        return new C1311g(arrayList5, objN);
    }

    public final boolean h() {
        List list = this.f8858c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((s0) ((C0751p) it.next()).f1668w).f8888c.f8598I) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, C4.a aVar) {
        e0.a(4, arrayList);
        l0 l0Var = this.f8861f;
        l0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f8864i;
        int size = arrayList3.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList3.get(i6);
            WeakHashMap weakHashMap = N.V.f1964a;
            arrayList2.add(N.I.k(view));
            N.I.v(view, null);
        }
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
        ArrayList arrayList4 = this.f8863h;
        if (zIsLoggable) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object obj : arrayList4) {
                AbstractC1305a.n(obj, "sharedElementFirstOutViews");
                View view2 = (View) obj;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                WeakHashMap weakHashMap2 = N.V.f1964a;
                sb.append(N.I.k(view2));
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for (Object obj2 : arrayList3) {
                AbstractC1305a.n(obj2, "sharedElementLastInViews");
                View view3 = (View) obj2;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap3 = N.V.f1964a;
                sb2.append(N.I.k(view3));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        aVar.b();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        int i7 = 0;
        while (true) {
            ArrayList arrayList6 = this.f8863h;
            if (i7 >= size2) {
                ViewTreeObserverOnPreDrawListenerC0110v.a(viewGroup, new k0(l0Var, size2, arrayList3, arrayList2, arrayList6, arrayList5, 0));
                e0.a(0, arrayList);
                l0Var.x(this.f8862g, arrayList4, arrayList3);
                return;
            }
            View view4 = (View) arrayList6.get(i7);
            WeakHashMap weakHashMap4 = N.V.f1964a;
            String strK = N.I.k(view4);
            arrayList5.add(strK);
            if (strK != null) {
                N.I.v(view4, null);
                String str = (String) this.f8865j.getOrDefault(strK, null);
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i8))) {
                        N.I.v((View) arrayList3.get(i8), strK);
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
    }
}
