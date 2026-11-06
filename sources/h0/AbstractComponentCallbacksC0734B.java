package h0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0314n;
import androidx.lifecycle.InterfaceC0309i;
import androidx.lifecycle.InterfaceC0321v;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.RunnableC0632m;
import f.AbstractC0680f;
import f.C0679e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C0921c;
import n0.C1144b;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import z0.C1523d;
import z0.C1524e;
import z0.InterfaceC1525f;

/* JADX INFO: renamed from: h0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0734B implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0321v, androidx.lifecycle.j0, InterfaceC0309i, InterfaceC1525f {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Object f8589s0 = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Bundle f8591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AbstractComponentCallbacksC0734B f8592C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f8594E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f8596G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f8597H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f8598I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f8599J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f8600K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f8601L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f8602M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f8603N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f8604O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public W f8605P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public D f8606Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public AbstractComponentCallbacksC0734B f8608S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f8609T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f8610U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public String f8611V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f8612W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f8613X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f8614Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f8616a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ViewGroup f8617b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public View f8618c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f8619d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C0760z f8621f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f8622g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public LayoutInflater f8623h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f8624i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f8625j0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C0323x f8627l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public m0 f8628m0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public androidx.lifecycle.Y f8630o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C1524e f8631p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f8632q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final C0758x f8633r0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f8635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SparseArray f8636y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Bundle f8637z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8634w = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f8590A = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f8593D = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Boolean f8595F = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public W f8607R = new W();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final boolean f8615Z = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f8620e0 = true;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public EnumC0314n f8626k0 = EnumC0314n.f5629A;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final androidx.lifecycle.E f8629n0 = new androidx.lifecycle.E();

    public AbstractComponentCallbacksC0734B() {
        new AtomicInteger();
        this.f8632q0 = new ArrayList();
        this.f8633r0 = new C0758x(this);
        q();
    }

    public void A(Bundle bundle) {
        this.f8616a0 = true;
        Q();
        W w5 = this.f8607R;
        if (w5.f8716v >= 1) {
            return;
        }
        w5.f8686H = false;
        w5.f8687I = false;
        w5.f8693O.f8735g = false;
        w5.u(1);
    }

    public View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void C() {
        this.f8616a0 = true;
    }

    public void D() {
        this.f8616a0 = true;
    }

    public void E() {
        this.f8616a0 = true;
    }

    public LayoutInflater F(Bundle bundle) {
        D d6 = this.f8606Q;
        if (d6 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        E e6 = d6.f8641B;
        LayoutInflater layoutInflaterCloneInContext = e6.getLayoutInflater().cloneInContext(e6);
        layoutInflaterCloneInContext.setFactory2(this.f8607R.f8700f);
        return layoutInflaterCloneInContext;
    }

    public void G() {
        this.f8616a0 = true;
    }

    public void I() {
        this.f8616a0 = true;
    }

    public void J() {
        this.f8616a0 = true;
    }

    public void L(Bundle bundle) {
        this.f8616a0 = true;
    }

    public void M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8607R.P();
        this.f8603N = true;
        this.f8628m0 = new m0(this, e(), new RunnableC0632m(8, this));
        View viewB = B(layoutInflater, viewGroup);
        this.f8618c0 = viewB;
        if (viewB == null) {
            if (this.f8628m0.f8846A != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f8628m0 = null;
            return;
        }
        this.f8628m0.d();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f8618c0 + " for Fragment " + this);
        }
        com.bumptech.glide.c.N(this.f8618c0, this.f8628m0);
        View view = this.f8618c0;
        m0 m0Var = this.f8628m0;
        AbstractC1305a.o(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, m0Var);
        AbstractC1332d.p0(this.f8618c0, this.f8628m0);
        this.f8629n0.g(this.f8628m0);
    }

    public final E N() {
        E eD = d();
        if (eD != null) {
            return eD;
        }
        throw new IllegalStateException(AbstractC0628i.h("Fragment ", this, " not attached to an activity."));
    }

    public final Context O() {
        Context contextM = m();
        if (contextM != null) {
            return contextM;
        }
        throw new IllegalStateException(AbstractC0628i.h("Fragment ", this, " not attached to a context."));
    }

    public final View P() {
        View view = this.f8618c0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC0628i.h("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void Q() {
        Bundle bundle;
        Bundle bundle2 = this.f8635x;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f8607R.V(bundle);
        W w5 = this.f8607R;
        w5.f8686H = false;
        w5.f8687I = false;
        w5.f8693O.f8735g = false;
        w5.u(1);
    }

    public final void R(int i6, int i7, int i8, int i9) {
        if (this.f8621f0 == null && i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            return;
        }
        j().f8927b = i6;
        j().f8928c = i7;
        j().f8929d = i8;
        j().f8930e = i9;
    }

    public final void S(Bundle bundle) {
        W w5 = this.f8605P;
        if (w5 != null && (w5.f8686H || w5.f8687I)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f8591B = bundle;
    }

    public final void T(Intent intent) {
        D d6 = this.f8606Q;
        if (d6 == null) {
            throw new IllegalStateException(AbstractC0628i.h("Fragment ", this, " not attached to Activity"));
        }
        d6.Y(this, intent, -1);
    }

    @Override // androidx.lifecycle.InterfaceC0309i
    public final C0921c a() {
        Application application;
        Context applicationContext = O().getApplicationContext();
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
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + O().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0921c c0921c = new C0921c(0);
        LinkedHashMap linkedHashMap = c0921c.f9835a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.d0.f5619d, application);
        }
        linkedHashMap.put(androidx.lifecycle.U.f5583a, this);
        linkedHashMap.put(androidx.lifecycle.U.f5584b, this);
        Bundle bundle = this.f8591B;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.U.f5585c, bundle);
        }
        return c0921c;
    }

    @Override // z0.InterfaceC1525f
    public final C1523d b() {
        return this.f8631p0.f14072b;
    }

    @Override // androidx.lifecycle.j0
    public final androidx.lifecycle.i0 e() {
        if (this.f8605P == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (n() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f8605P.f8693O.f8732d;
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) map.get(this.f8590A);
        if (i0Var != null) {
            return i0Var;
        }
        androidx.lifecycle.i0 i0Var2 = new androidx.lifecycle.i0();
        map.put(this.f8590A, i0Var2);
        return i0Var2;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public androidx.lifecycle.e0 f() {
        Application application;
        if (this.f8605P == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f8630o0 == null) {
            Context applicationContext = O().getApplicationContext();
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
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + O().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f8630o0 = new androidx.lifecycle.Y(application, this, this.f8591B);
        }
        return this.f8630o0;
    }

    @Override // androidx.lifecycle.InterfaceC0321v
    public final C0323x g() {
        return this.f8627l0;
    }

    public com.bumptech.glide.c h() {
        return new C0759y(this);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f8609T));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f8610U));
        printWriter.print(" mTag=");
        printWriter.println(this.f8611V);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f8634w);
        printWriter.print(" mWho=");
        printWriter.print(this.f8590A);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f8604O);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f8596G);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f8597H);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f8599J);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f8600K);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f8612W);
        printWriter.print(" mDetached=");
        printWriter.print(this.f8613X);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f8615Z);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f8614Y);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f8620e0);
        if (this.f8605P != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f8605P);
        }
        if (this.f8606Q != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f8606Q);
        }
        if (this.f8608S != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f8608S);
        }
        if (this.f8591B != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f8591B);
        }
        if (this.f8635x != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f8635x);
        }
        if (this.f8636y != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f8636y);
        }
        if (this.f8637z != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f8637z);
        }
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BF = this.f8592C;
        if (abstractComponentCallbacksC0734BF == null) {
            W w5 = this.f8605P;
            abstractComponentCallbacksC0734BF = (w5 == null || (str2 = this.f8593D) == null) ? null : w5.f8697c.f(str2);
        }
        if (abstractComponentCallbacksC0734BF != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC0734BF);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f8594E);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C0760z c0760z = this.f8621f0;
        printWriter.println(c0760z == null ? false : c0760z.f8926a);
        C0760z c0760z2 = this.f8621f0;
        if (c0760z2 != null && c0760z2.f8927b != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C0760z c0760z3 = this.f8621f0;
            printWriter.println(c0760z3 == null ? 0 : c0760z3.f8927b);
        }
        C0760z c0760z4 = this.f8621f0;
        if (c0760z4 != null && c0760z4.f8928c != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C0760z c0760z5 = this.f8621f0;
            printWriter.println(c0760z5 == null ? 0 : c0760z5.f8928c);
        }
        C0760z c0760z6 = this.f8621f0;
        if (c0760z6 != null && c0760z6.f8929d != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C0760z c0760z7 = this.f8621f0;
            printWriter.println(c0760z7 == null ? 0 : c0760z7.f8929d);
        }
        C0760z c0760z8 = this.f8621f0;
        if (c0760z8 != null && c0760z8.f8930e != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C0760z c0760z9 = this.f8621f0;
            printWriter.println(c0760z9 == null ? 0 : c0760z9.f8930e);
        }
        if (this.f8617b0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f8617b0);
        }
        if (this.f8618c0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f8618c0);
        }
        if (m() != null) {
            s.l lVar = ((C1144b) new androidx.lifecycle.h0(e(), C1144b.f11683c).a(D4.s.a(C1144b.class))).f11684b;
            if (lVar.f12538y > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (lVar.f12538y > 0) {
                    AbstractC0628i.p(lVar.f12537x[0]);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(lVar.f12536w[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f8607R + ":");
        this.f8607R.v(AbstractC0628i.i(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final C0760z j() {
        if (this.f8621f0 == null) {
            C0760z c0760z = new C0760z();
            Object obj = f8589s0;
            c0760z.f8934i = obj;
            c0760z.f8935j = obj;
            c0760z.f8936k = obj;
            c0760z.f8937l = 1.0f;
            c0760z.f8938m = null;
            this.f8621f0 = c0760z;
        }
        return this.f8621f0;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final E d() {
        D d6 = this.f8606Q;
        if (d6 == null) {
            return null;
        }
        return (E) d6.f8642x;
    }

    public final W l() {
        if (this.f8606Q != null) {
            return this.f8607R;
        }
        throw new IllegalStateException(AbstractC0628i.h("Fragment ", this, " has not been attached yet."));
    }

    public Context m() {
        D d6 = this.f8606Q;
        if (d6 == null) {
            return null;
        }
        return d6.f8643y;
    }

    public final int n() {
        EnumC0314n enumC0314n = this.f8626k0;
        return (enumC0314n == EnumC0314n.f5632x || this.f8608S == null) ? enumC0314n.ordinal() : Math.min(enumC0314n.ordinal(), this.f8608S.n());
    }

    public final W o() {
        W w5 = this.f8605P;
        if (w5 != null) {
            return w5;
        }
        throw new IllegalStateException(AbstractC0628i.h("Fragment ", this, " not associated with a fragment manager."));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f8616a0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        N().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f8616a0 = true;
    }

    public final String p(int i6) {
        return O().getResources().getString(i6);
    }

    public final void q() {
        this.f8627l0 = new C0323x(this);
        this.f8631p0 = new C1524e(this);
        this.f8630o0 = null;
        ArrayList arrayList = this.f8632q0;
        C0758x c0758x = this.f8633r0;
        if (arrayList.contains(c0758x)) {
            return;
        }
        if (this.f8634w < 0) {
            arrayList.add(c0758x);
            return;
        }
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0758x.f8924a;
        abstractComponentCallbacksC0734B.f8631p0.a();
        androidx.lifecycle.U.c(abstractComponentCallbacksC0734B);
        Bundle bundle = abstractComponentCallbacksC0734B.f8635x;
        abstractComponentCallbacksC0734B.f8631p0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void r() {
        q();
        this.f8625j0 = this.f8590A;
        this.f8590A = UUID.randomUUID().toString();
        this.f8596G = false;
        this.f8597H = false;
        this.f8599J = false;
        this.f8600K = false;
        this.f8602M = false;
        this.f8604O = 0;
        this.f8605P = null;
        this.f8607R = new W();
        this.f8606Q = null;
        this.f8609T = 0;
        this.f8610U = 0;
        this.f8611V = null;
        this.f8612W = false;
        this.f8613X = false;
    }

    public final boolean s() {
        return this.f8606Q != null && this.f8596G;
    }

    public final void startActivityForResult(Intent intent, int i6) throws Exception {
        if (this.f8606Q == null) {
            throw new IllegalStateException(AbstractC0628i.h("Fragment ", this, " not attached to Activity"));
        }
        W wO = o();
        if (wO.f8681C == null) {
            wO.f8717w.Y(this, intent, i6);
            return;
        }
        String str = this.f8590A;
        S s5 = new S();
        s5.f8673w = str;
        s5.f8674x = i6;
        wO.f8684F.addLast(s5);
        C0679e c0679e = wO.f8681C;
        AbstractC0680f abstractC0680f = c0679e.f8305a;
        LinkedHashMap linkedHashMap = abstractC0680f.f8309b;
        String str2 = c0679e.f8306b;
        Object obj = linkedHashMap.get(str2);
        m3.v0 v0Var = c0679e.f8307c;
        if (obj == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + v0Var + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj).intValue();
        ArrayList arrayList = abstractC0680f.f8311d;
        arrayList.add(str2);
        try {
            abstractC0680f.b(iIntValue, v0Var, intent);
        } catch (Exception e6) {
            arrayList.remove(str2);
            throw e6;
        }
    }

    public final boolean t() {
        if (!this.f8612W) {
            W w5 = this.f8605P;
            if (w5 != null) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8608S;
                w5.getClass();
                if (abstractComponentCallbacksC0734B != null && abstractComponentCallbacksC0734B.t()) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f8590A);
        if (this.f8609T != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8609T));
        }
        if (this.f8611V != null) {
            sb.append(" tag=");
            sb.append(this.f8611V);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.f8604O > 0;
    }

    public final boolean v() {
        View view;
        return (!s() || t() || (view = this.f8618c0) == null || view.getWindowToken() == null || this.f8618c0.getVisibility() != 0) ? false : true;
    }

    public void w() {
        this.f8616a0 = true;
    }

    public void x(int i6, int i7, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i7 + " data: " + intent);
        }
    }

    public void y(Activity activity) {
        this.f8616a0 = true;
    }

    public void z(Context context) {
        this.f8616a0 = true;
        D d6 = this.f8606Q;
        Activity activity = d6 == null ? null : d6.f8642x;
        if (activity != null) {
            this.f8616a0 = false;
            y(activity);
        }
    }

    public void H(Bundle bundle) {
    }

    public void K(View view) {
    }
}
