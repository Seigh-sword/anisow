package h0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0313m;
import androidx.lifecycle.EnumC0314n;
import com.google.android.gms.internal.measurement.C0396c2;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.C0629j;
import i0.AbstractC0823c;
import i0.C0822b;
import i0.C0824d;
import i0.C0826f;
import i0.EnumC0821a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.C1144b;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0396c2 f8785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J3.w f8786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0734B f8787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8788d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8789e = -1;

    public c0(C0396c2 c0396c2, J3.w wVar, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        this.f8785a = c0396c2;
        this.f8786b = wVar;
        this.f8787c = abstractComponentCallbacksC0734B;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0734B);
        }
        Bundle bundle = abstractComponentCallbacksC0734B.f8635x;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0734B.f8607R.P();
        abstractComponentCallbacksC0734B.f8634w = 3;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.w();
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0734B);
        }
        if (abstractComponentCallbacksC0734B.f8618c0 != null) {
            Bundle bundle2 = abstractComponentCallbacksC0734B.f8635x;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0734B.f8636y;
            if (sparseArray != null) {
                abstractComponentCallbacksC0734B.f8618c0.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0734B.f8636y = null;
            }
            abstractComponentCallbacksC0734B.f8616a0 = false;
            abstractComponentCallbacksC0734B.L(bundle3);
            if (!abstractComponentCallbacksC0734B.f8616a0) {
                throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onViewStateRestored()"));
            }
            if (abstractComponentCallbacksC0734B.f8618c0 != null) {
                abstractComponentCallbacksC0734B.f8628m0.c(EnumC0313m.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0734B.f8635x = null;
        W w5 = abstractComponentCallbacksC0734B.f8607R;
        w5.f8686H = false;
        w5.f8687I = false;
        w5.f8693O.f8735g = false;
        w5.u(4);
        this.f8785a.p(abstractComponentCallbacksC0734B, false);
    }

    public final void b() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B;
        View view;
        View view2;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = this.f8787c;
        View view3 = abstractComponentCallbacksC0734B2.f8617b0;
        while (true) {
            abstractComponentCallbacksC0734B = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B3 = tag instanceof AbstractComponentCallbacksC0734B ? (AbstractComponentCallbacksC0734B) tag : null;
            if (abstractComponentCallbacksC0734B3 != null) {
                abstractComponentCallbacksC0734B = abstractComponentCallbacksC0734B3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B4 = abstractComponentCallbacksC0734B2.f8608S;
        if (abstractComponentCallbacksC0734B != null && !abstractComponentCallbacksC0734B.equals(abstractComponentCallbacksC0734B4)) {
            int i6 = abstractComponentCallbacksC0734B2.f8610U;
            C0822b c0822b = AbstractC0823c.f9359a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC0734B2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC0734B);
            sb.append(" via container with ID ");
            C0826f c0826f = new C0826f(abstractComponentCallbacksC0734B2, AbstractC0628i.l(sb, i6, " without using parent's childFragmentManager"));
            AbstractC0823c.c(c0826f);
            C0822b c0822bA = AbstractC0823c.a(abstractComponentCallbacksC0734B2);
            if (c0822bA.f9357a.contains(EnumC0821a.f9349A) && AbstractC0823c.e(c0822bA, abstractComponentCallbacksC0734B2.getClass(), C0826f.class)) {
                AbstractC0823c.b(c0822bA, c0826f);
            }
        }
        J3.w wVar = this.f8786b;
        wVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0734B2.f8617b0;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = ((ArrayList) wVar.f1441a).indexOf(abstractComponentCallbacksC0734B2);
            int i7 = iIndexOf - 1;
            while (true) {
                if (i7 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= ((ArrayList) wVar.f1441a).size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B5 = (AbstractComponentCallbacksC0734B) ((ArrayList) wVar.f1441a).get(iIndexOf);
                        if (abstractComponentCallbacksC0734B5.f8617b0 == viewGroup && (view = abstractComponentCallbacksC0734B5.f8618c0) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B6 = (AbstractComponentCallbacksC0734B) ((ArrayList) wVar.f1441a).get(i7);
                    if (abstractComponentCallbacksC0734B6.f8617b0 == viewGroup && (view2 = abstractComponentCallbacksC0734B6.f8618c0) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i7--;
                }
            }
        }
        abstractComponentCallbacksC0734B2.f8617b0.addView(abstractComponentCallbacksC0734B2.f8618c0, iIndexOfChild);
    }

    public final void c() {
        c0 c0Var;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0734B);
        }
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = abstractComponentCallbacksC0734B.f8592C;
        J3.w wVar = this.f8786b;
        if (abstractComponentCallbacksC0734B2 != null) {
            c0Var = (c0) ((HashMap) wVar.f1442b).get(abstractComponentCallbacksC0734B2.f8590A);
            if (c0Var == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0734B + " declared target fragment " + abstractComponentCallbacksC0734B.f8592C + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0734B.f8593D = abstractComponentCallbacksC0734B.f8592C.f8590A;
            abstractComponentCallbacksC0734B.f8592C = null;
        } else {
            String str = abstractComponentCallbacksC0734B.f8593D;
            if (str != null) {
                c0Var = (c0) ((HashMap) wVar.f1442b).get(str);
                if (c0Var == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC0734B);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC0628i.m(sb, abstractComponentCallbacksC0734B.f8593D, " that does not belong to this FragmentManager!"));
                }
            } else {
                c0Var = null;
            }
        }
        if (c0Var != null) {
            c0Var.k();
        }
        W w5 = abstractComponentCallbacksC0734B.f8605P;
        abstractComponentCallbacksC0734B.f8606Q = w5.f8717w;
        abstractComponentCallbacksC0734B.f8608S = w5.f8719y;
        C0396c2 c0396c2 = this.f8785a;
        c0396c2.w(abstractComponentCallbacksC0734B, false);
        ArrayList arrayList = abstractComponentCallbacksC0734B.f8632q0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B3 = ((C0758x) it.next()).f8924a;
            abstractComponentCallbacksC0734B3.f8631p0.a();
            androidx.lifecycle.U.c(abstractComponentCallbacksC0734B3);
            Bundle bundle = abstractComponentCallbacksC0734B3.f8635x;
            abstractComponentCallbacksC0734B3.f8631p0.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC0734B.f8607R.b(abstractComponentCallbacksC0734B.f8606Q, abstractComponentCallbacksC0734B.h(), abstractComponentCallbacksC0734B);
        abstractComponentCallbacksC0734B.f8634w = 0;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.z(abstractComponentCallbacksC0734B.f8606Q.f8643y);
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onAttach()"));
        }
        Iterator it2 = abstractComponentCallbacksC0734B.f8605P.f8710p.iterator();
        while (it2.hasNext()) {
            ((a0) it2.next()).d();
        }
        W w6 = abstractComponentCallbacksC0734B.f8607R;
        w6.f8686H = false;
        w6.f8687I = false;
        w6.f8693O.f8735g = false;
        w6.u(0);
        c0396c2.q(abstractComponentCallbacksC0734B, false);
    }

    public final int d() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (abstractComponentCallbacksC0734B.f8605P == null) {
            return abstractComponentCallbacksC0734B.f8634w;
        }
        int iMin = this.f8789e;
        int iOrdinal = abstractComponentCallbacksC0734B.f8626k0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0734B.f8599J) {
            if (abstractComponentCallbacksC0734B.f8600K) {
                iMin = Math.max(this.f8789e, 2);
                View view = abstractComponentCallbacksC0734B.f8618c0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f8789e < 4 ? Math.min(iMin, abstractComponentCallbacksC0734B.f8634w) : Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC0734B.f8601L && abstractComponentCallbacksC0734B.f8617b0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC0734B.f8596G) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0734B.f8617b0;
        if (viewGroup != null) {
            u0 u0VarM = u0.m(viewGroup, abstractComponentCallbacksC0734B.o());
            u0VarM.getClass();
            s0 s0VarJ = u0VarM.j(abstractComponentCallbacksC0734B);
            int i6 = s0VarJ != null ? s0VarJ.f8887b : 0;
            s0 s0VarK = u0VarM.k(abstractComponentCallbacksC0734B);
            i = s0VarK != null ? s0VarK.f8887b : 0;
            int i7 = i6 == 0 ? -1 : t0.f8898a[u.h.b(i6)];
            if (i7 != -1 && i7 != 1) {
                i = i6;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0734B.f8597H) {
            iMin = abstractComponentCallbacksC0734B.u() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0734B.f8619d0 && abstractComponentCallbacksC0734B.f8634w < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC0734B.f8598I) {
            iMin = Math.max(iMin, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0734B);
        }
        return iMin;
    }

    public final void e() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0734B);
        }
        Bundle bundle = abstractComponentCallbacksC0734B.f8635x;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        int i6 = 1;
        if (abstractComponentCallbacksC0734B.f8624i0) {
            abstractComponentCallbacksC0734B.f8634w = 1;
            abstractComponentCallbacksC0734B.Q();
            return;
        }
        C0396c2 c0396c2 = this.f8785a;
        c0396c2.x(abstractComponentCallbacksC0734B, false);
        abstractComponentCallbacksC0734B.f8607R.P();
        abstractComponentCallbacksC0734B.f8634w = 1;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.f8627l0.a(new C0629j(i6, abstractComponentCallbacksC0734B));
        abstractComponentCallbacksC0734B.A(bundle2);
        abstractComponentCallbacksC0734B.f8624i0 = true;
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC0734B.f8627l0.e(EnumC0313m.ON_CREATE);
        c0396c2.r(abstractComponentCallbacksC0734B, false);
    }

    public final void f() {
        String resourceName;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (abstractComponentCallbacksC0734B.f8599J) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0734B);
        }
        Bundle bundle = abstractComponentCallbacksC0734B.f8635x;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterF = abstractComponentCallbacksC0734B.F(bundle2);
        abstractComponentCallbacksC0734B.f8623h0 = layoutInflaterF;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0734B.f8617b0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i6 = abstractComponentCallbacksC0734B.f8610U;
            if (i6 != 0) {
                if (i6 == -1) {
                    throw new IllegalArgumentException(AbstractC0628i.h("Cannot create fragment ", abstractComponentCallbacksC0734B, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0734B.f8605P.f8718x.A(i6);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0734B.f8602M && !abstractComponentCallbacksC0734B.f8601L) {
                        try {
                            resourceName = abstractComponentCallbacksC0734B.O().getResources().getResourceName(abstractComponentCallbacksC0734B.f8610U);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0734B.f8610U) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0734B);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0822b c0822b = AbstractC0823c.f9359a;
                    C0824d c0824d = new C0824d(abstractComponentCallbacksC0734B, viewGroup, 1);
                    AbstractC0823c.c(c0824d);
                    C0822b c0822bA = AbstractC0823c.a(abstractComponentCallbacksC0734B);
                    if (c0822bA.f9357a.contains(EnumC0821a.f9350B) && AbstractC0823c.e(c0822bA, abstractComponentCallbacksC0734B.getClass(), C0824d.class)) {
                        AbstractC0823c.b(c0822bA, c0824d);
                    }
                }
            }
        }
        abstractComponentCallbacksC0734B.f8617b0 = viewGroup;
        abstractComponentCallbacksC0734B.M(layoutInflaterF, viewGroup, bundle2);
        if (abstractComponentCallbacksC0734B.f8618c0 != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0734B);
            }
            abstractComponentCallbacksC0734B.f8618c0.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0734B.f8618c0.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0734B);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0734B.f8612W) {
                abstractComponentCallbacksC0734B.f8618c0.setVisibility(8);
            }
            if (abstractComponentCallbacksC0734B.f8618c0.isAttachedToWindow()) {
                View view = abstractComponentCallbacksC0734B.f8618c0;
                WeakHashMap weakHashMap = N.V.f1964a;
                N.G.c(view);
            } else {
                View view2 = abstractComponentCallbacksC0734B.f8618c0;
                view2.addOnAttachStateChangeListener(new G(this, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0734B.f8635x;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0734B.K(abstractComponentCallbacksC0734B.f8618c0);
            abstractComponentCallbacksC0734B.f8607R.u(2);
            this.f8785a.C(abstractComponentCallbacksC0734B, abstractComponentCallbacksC0734B.f8618c0, false);
            int visibility = abstractComponentCallbacksC0734B.f8618c0.getVisibility();
            abstractComponentCallbacksC0734B.j().f8937l = abstractComponentCallbacksC0734B.f8618c0.getAlpha();
            if (abstractComponentCallbacksC0734B.f8617b0 != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0734B.f8618c0.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0734B.j().f8938m = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0734B);
                    }
                }
                abstractComponentCallbacksC0734B.f8618c0.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0734B.f8634w = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BF;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0734B);
        }
        boolean zIsChangingConfigurations = true;
        boolean z5 = abstractComponentCallbacksC0734B.f8597H && !abstractComponentCallbacksC0734B.u();
        J3.w wVar = this.f8786b;
        if (z5) {
            wVar.r(abstractComponentCallbacksC0734B.f8590A, null);
        }
        if (!z5) {
            Z z6 = (Z) wVar.f1444d;
            if (z6.f8730b.containsKey(abstractComponentCallbacksC0734B.f8590A) && z6.f8733e && !z6.f8734f) {
                String str = abstractComponentCallbacksC0734B.f8593D;
                if (str != null && (abstractComponentCallbacksC0734BF = wVar.f(str)) != null && abstractComponentCallbacksC0734BF.f8614Y) {
                    abstractComponentCallbacksC0734B.f8592C = abstractComponentCallbacksC0734BF;
                }
                abstractComponentCallbacksC0734B.f8634w = 0;
                return;
            }
        }
        D d6 = abstractComponentCallbacksC0734B.f8606Q;
        if (d6 instanceof androidx.lifecycle.j0) {
            zIsChangingConfigurations = ((Z) wVar.f1444d).f8734f;
        } else {
            Context context = d6.f8643y;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z5 || zIsChangingConfigurations) {
            ((Z) wVar.f1444d).e(abstractComponentCallbacksC0734B, false);
        }
        abstractComponentCallbacksC0734B.f8607R.l();
        abstractComponentCallbacksC0734B.f8627l0.e(EnumC0313m.ON_DESTROY);
        abstractComponentCallbacksC0734B.f8634w = 0;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.f8624i0 = false;
        abstractComponentCallbacksC0734B.C();
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onDestroy()"));
        }
        this.f8785a.s(abstractComponentCallbacksC0734B, false);
        for (c0 c0Var : wVar.h()) {
            if (c0Var != null) {
                String str2 = abstractComponentCallbacksC0734B.f8590A;
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = c0Var.f8787c;
                if (str2.equals(abstractComponentCallbacksC0734B2.f8593D)) {
                    abstractComponentCallbacksC0734B2.f8592C = abstractComponentCallbacksC0734B;
                    abstractComponentCallbacksC0734B2.f8593D = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0734B.f8593D;
        if (str3 != null) {
            abstractComponentCallbacksC0734B.f8592C = wVar.f(str3);
        }
        wVar.p(this);
    }

    public final void h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0734B);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0734B.f8617b0;
        if (viewGroup != null && (view = abstractComponentCallbacksC0734B.f8618c0) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0734B.f8607R.u(1);
        if (abstractComponentCallbacksC0734B.f8618c0 != null) {
            m0 m0Var = abstractComponentCallbacksC0734B.f8628m0;
            m0Var.d();
            if (m0Var.f8846A.f5645d.compareTo(EnumC0314n.f5633y) >= 0) {
                abstractComponentCallbacksC0734B.f8628m0.c(EnumC0313m.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0734B.f8634w = 1;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.D();
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onDestroyView()"));
        }
        s.l lVar = ((C1144b) new androidx.lifecycle.h0(abstractComponentCallbacksC0734B.e(), C1144b.f11683c).a(D4.s.a(C1144b.class))).f11684b;
        if (lVar.f12538y > 0) {
            AbstractC0628i.p(lVar.f12537x[0]);
            throw null;
        }
        abstractComponentCallbacksC0734B.f8603N = false;
        this.f8785a.D(abstractComponentCallbacksC0734B, false);
        abstractComponentCallbacksC0734B.f8617b0 = null;
        abstractComponentCallbacksC0734B.f8618c0 = null;
        abstractComponentCallbacksC0734B.f8628m0 = null;
        abstractComponentCallbacksC0734B.f8629n0.g(null);
        abstractComponentCallbacksC0734B.f8600K = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0734B);
        }
        abstractComponentCallbacksC0734B.f8634w = -1;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.E();
        abstractComponentCallbacksC0734B.f8623h0 = null;
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onDetach()"));
        }
        W w5 = abstractComponentCallbacksC0734B.f8607R;
        if (!w5.f8688J) {
            w5.l();
            abstractComponentCallbacksC0734B.f8607R = new W();
        }
        this.f8785a.u(abstractComponentCallbacksC0734B, false);
        abstractComponentCallbacksC0734B.f8634w = -1;
        abstractComponentCallbacksC0734B.f8606Q = null;
        abstractComponentCallbacksC0734B.f8608S = null;
        abstractComponentCallbacksC0734B.f8605P = null;
        if (!abstractComponentCallbacksC0734B.f8597H || abstractComponentCallbacksC0734B.u()) {
            Z z5 = (Z) this.f8786b.f1444d;
            if (z5.f8730b.containsKey(abstractComponentCallbacksC0734B.f8590A) && z5.f8733e && !z5.f8734f) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0734B);
        }
        abstractComponentCallbacksC0734B.r();
    }

    public final void j() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (abstractComponentCallbacksC0734B.f8599J && abstractComponentCallbacksC0734B.f8600K && !abstractComponentCallbacksC0734B.f8603N) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0734B);
            }
            Bundle bundle = abstractComponentCallbacksC0734B.f8635x;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterF = abstractComponentCallbacksC0734B.F(bundle2);
            abstractComponentCallbacksC0734B.f8623h0 = layoutInflaterF;
            abstractComponentCallbacksC0734B.M(layoutInflaterF, null, bundle2);
            View view = abstractComponentCallbacksC0734B.f8618c0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0734B.f8618c0.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0734B);
                if (abstractComponentCallbacksC0734B.f8612W) {
                    abstractComponentCallbacksC0734B.f8618c0.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0734B.f8635x;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0734B.K(abstractComponentCallbacksC0734B.f8618c0);
                abstractComponentCallbacksC0734B.f8607R.u(2);
                this.f8785a.C(abstractComponentCallbacksC0734B, abstractComponentCallbacksC0734B.f8618c0, false);
                abstractComponentCallbacksC0734B.f8634w = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        J3.w wVar = this.f8786b;
        boolean z5 = this.f8788d;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (z5) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0734B);
                return;
            }
            return;
        }
        try {
            this.f8788d = true;
            boolean z6 = false;
            while (true) {
                int iD = d();
                int i6 = abstractComponentCallbacksC0734B.f8634w;
                int i7 = 3;
                if (iD == i6) {
                    if (!z6 && i6 == -1 && abstractComponentCallbacksC0734B.f8597H && !abstractComponentCallbacksC0734B.u()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0734B);
                        }
                        ((Z) wVar.f1444d).e(abstractComponentCallbacksC0734B, true);
                        wVar.p(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0734B);
                        }
                        abstractComponentCallbacksC0734B.r();
                    }
                    if (abstractComponentCallbacksC0734B.f8622g0) {
                        if (abstractComponentCallbacksC0734B.f8618c0 != null && (viewGroup = abstractComponentCallbacksC0734B.f8617b0) != null) {
                            u0 u0VarM = u0.m(viewGroup, abstractComponentCallbacksC0734B.o());
                            if (abstractComponentCallbacksC0734B.f8612W) {
                                u0VarM.f(this);
                            } else {
                                u0VarM.h(this);
                            }
                        }
                        W w5 = abstractComponentCallbacksC0734B.f8605P;
                        if (w5 != null && abstractComponentCallbacksC0734B.f8596G && W.K(abstractComponentCallbacksC0734B)) {
                            w5.f8685G = true;
                        }
                        abstractComponentCallbacksC0734B.f8622g0 = false;
                        abstractComponentCallbacksC0734B.f8607R.o();
                    }
                    this.f8788d = false;
                    return;
                }
                if (iD <= i6) {
                    switch (i6 - 1) {
                        case -1:
                            i();
                            break;
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0734B.f8634w = 1;
                            break;
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            abstractComponentCallbacksC0734B.f8600K = false;
                            abstractComponentCallbacksC0734B.f8634w = 2;
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0734B);
                            }
                            if (abstractComponentCallbacksC0734B.f8618c0 != null && abstractComponentCallbacksC0734B.f8636y == null) {
                                p();
                            }
                            if (abstractComponentCallbacksC0734B.f8618c0 != null && (viewGroup2 = abstractComponentCallbacksC0734B.f8617b0) != null) {
                                u0.m(viewGroup2, abstractComponentCallbacksC0734B.o()).g(this);
                            }
                            abstractComponentCallbacksC0734B.f8634w = 3;
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            r();
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC0734B.f8634w = 5;
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            l();
                            break;
                    }
                } else {
                    switch (i6 + 1) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            j();
                            f();
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            a();
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            if (abstractComponentCallbacksC0734B.f8618c0 != null && (viewGroup3 = abstractComponentCallbacksC0734B.f8617b0) != null) {
                                u0 u0VarM2 = u0.m(viewGroup3, abstractComponentCallbacksC0734B.o());
                                int visibility = abstractComponentCallbacksC0734B.f8618c0.getVisibility();
                                if (visibility == 0) {
                                    i7 = 2;
                                } else if (visibility == 4) {
                                    i7 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                u0VarM2.e(i7, this);
                            }
                            abstractComponentCallbacksC0734B.f8634w = 4;
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            q();
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC0734B.f8634w = 6;
                            break;
                        case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            n();
                            break;
                    }
                }
                z6 = true;
            }
        } catch (Throwable th) {
            this.f8788d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0734B);
        }
        abstractComponentCallbacksC0734B.f8607R.u(5);
        if (abstractComponentCallbacksC0734B.f8618c0 != null) {
            abstractComponentCallbacksC0734B.f8628m0.c(EnumC0313m.ON_PAUSE);
        }
        abstractComponentCallbacksC0734B.f8627l0.e(EnumC0313m.ON_PAUSE);
        abstractComponentCallbacksC0734B.f8634w = 6;
        abstractComponentCallbacksC0734B.f8616a0 = true;
        this.f8785a.v(abstractComponentCallbacksC0734B, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        Bundle bundle = abstractComponentCallbacksC0734B.f8635x;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0734B.f8635x.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0734B.f8635x.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0734B.f8636y = abstractComponentCallbacksC0734B.f8635x.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0734B.f8637z = abstractComponentCallbacksC0734B.f8635x.getBundle("viewRegistryState");
            b0 b0Var = (b0) abstractComponentCallbacksC0734B.f8635x.getParcelable("state");
            if (b0Var != null) {
                abstractComponentCallbacksC0734B.f8593D = b0Var.f8764I;
                abstractComponentCallbacksC0734B.f8594E = b0Var.f8765J;
                abstractComponentCallbacksC0734B.f8620e0 = b0Var.f8766K;
            }
            if (abstractComponentCallbacksC0734B.f8620e0) {
                return;
            }
            abstractComponentCallbacksC0734B.f8619d0 = true;
        } catch (BadParcelableException e6) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0734B, e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.c0.n():void");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (abstractComponentCallbacksC0734B.f8634w == -1 && (bundle = abstractComponentCallbacksC0734B.f8635x) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new b0(abstractComponentCallbacksC0734B));
        if (abstractComponentCallbacksC0734B.f8634w > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0734B.H(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f8785a.z(abstractComponentCallbacksC0734B, bundle3, false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0734B.f8631p0.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleW = abstractComponentCallbacksC0734B.f8607R.W();
            if (!bundleW.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleW);
            }
            if (abstractComponentCallbacksC0734B.f8618c0 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0734B.f8636y;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0734B.f8637z;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0734B.f8591B;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (abstractComponentCallbacksC0734B.f8618c0 == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0734B + " with view " + abstractComponentCallbacksC0734B.f8618c0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0734B.f8618c0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0734B.f8636y = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0734B.f8628m0.f8847B.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0734B.f8637z = bundle;
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0734B);
        }
        abstractComponentCallbacksC0734B.f8607R.P();
        abstractComponentCallbacksC0734B.f8607R.z(true);
        abstractComponentCallbacksC0734B.f8634w = 5;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.I();
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onStart()"));
        }
        C0323x c0323x = abstractComponentCallbacksC0734B.f8627l0;
        EnumC0313m enumC0313m = EnumC0313m.ON_START;
        c0323x.e(enumC0313m);
        if (abstractComponentCallbacksC0734B.f8618c0 != null) {
            abstractComponentCallbacksC0734B.f8628m0.f8846A.e(enumC0313m);
        }
        W w5 = abstractComponentCallbacksC0734B.f8607R;
        w5.f8686H = false;
        w5.f8687I = false;
        w5.f8693O.f8735g = false;
        w5.u(5);
        this.f8785a.A(abstractComponentCallbacksC0734B, false);
    }

    public final void r() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8787c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0734B);
        }
        W w5 = abstractComponentCallbacksC0734B.f8607R;
        w5.f8687I = true;
        w5.f8693O.f8735g = true;
        w5.u(4);
        if (abstractComponentCallbacksC0734B.f8618c0 != null) {
            abstractComponentCallbacksC0734B.f8628m0.c(EnumC0313m.ON_STOP);
        }
        abstractComponentCallbacksC0734B.f8627l0.e(EnumC0313m.ON_STOP);
        abstractComponentCallbacksC0734B.f8634w = 4;
        abstractComponentCallbacksC0734B.f8616a0 = false;
        abstractComponentCallbacksC0734B.J();
        if (!abstractComponentCallbacksC0734B.f8616a0) {
            throw new v0(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " did not call through to super.onStop()"));
        }
        this.f8785a.B(abstractComponentCallbacksC0734B, false);
    }

    public c0(C0396c2 c0396c2, J3.w wVar, AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, Bundle bundle) {
        this.f8785a = c0396c2;
        this.f8786b = wVar;
        this.f8787c = abstractComponentCallbacksC0734B;
        abstractComponentCallbacksC0734B.f8636y = null;
        abstractComponentCallbacksC0734B.f8637z = null;
        abstractComponentCallbacksC0734B.f8604O = 0;
        abstractComponentCallbacksC0734B.f8600K = false;
        abstractComponentCallbacksC0734B.f8596G = false;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B2 = abstractComponentCallbacksC0734B.f8592C;
        abstractComponentCallbacksC0734B.f8593D = abstractComponentCallbacksC0734B2 != null ? abstractComponentCallbacksC0734B2.f8590A : null;
        abstractComponentCallbacksC0734B.f8592C = null;
        abstractComponentCallbacksC0734B.f8635x = bundle;
        abstractComponentCallbacksC0734B.f8591B = bundle.getBundle("arguments");
    }

    public c0(C0396c2 c0396c2, J3.w wVar, ClassLoader classLoader, N n5, Bundle bundle) {
        this.f8785a = c0396c2;
        this.f8786b = wVar;
        b0 b0Var = (b0) bundle.getParcelable("state");
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BA = n5.a(b0Var.f8767w);
        abstractComponentCallbacksC0734BA.f8590A = b0Var.f8768x;
        abstractComponentCallbacksC0734BA.f8599J = b0Var.f8769y;
        abstractComponentCallbacksC0734BA.f8601L = b0Var.f8770z;
        abstractComponentCallbacksC0734BA.f8602M = true;
        abstractComponentCallbacksC0734BA.f8609T = b0Var.f8756A;
        abstractComponentCallbacksC0734BA.f8610U = b0Var.f8757B;
        abstractComponentCallbacksC0734BA.f8611V = b0Var.f8758C;
        abstractComponentCallbacksC0734BA.f8614Y = b0Var.f8759D;
        abstractComponentCallbacksC0734BA.f8597H = b0Var.f8760E;
        abstractComponentCallbacksC0734BA.f8613X = b0Var.f8761F;
        abstractComponentCallbacksC0734BA.f8612W = b0Var.f8762G;
        abstractComponentCallbacksC0734BA.f8626k0 = EnumC0314n.values()[b0Var.f8763H];
        abstractComponentCallbacksC0734BA.f8593D = b0Var.f8764I;
        abstractComponentCallbacksC0734BA.f8594E = b0Var.f8765J;
        abstractComponentCallbacksC0734BA.f8620e0 = b0Var.f8766K;
        this.f8787c = abstractComponentCallbacksC0734BA;
        abstractComponentCallbacksC0734BA.f8635x = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0734BA.S(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0734BA);
        }
    }
}
