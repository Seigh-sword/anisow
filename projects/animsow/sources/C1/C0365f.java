package c1;

import J3.G;
import M4.J;
import W.Q;
import a0.C0257e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E;
import androidx.lifecycle.U;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import g1.C0715a;
import g1.C0717c;
import h0.m0;
import h0.n0;
import o0.H0;
import s4.AbstractC1305a;
import s4.InterfaceC1309e;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: c1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0365f extends C0363d {
    public static final /* synthetic */ int E0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Y0.b f6186A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SwipeRefreshLayout f6187B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final c0 f6188C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public X0.d f6189D0;

    public C0365f() {
        InterfaceC1309e interfaceC1309eC = S3.a.C(new C0257e(new n0(2, this), 2));
        this.f6188C0 = new c0(D4.s.a(C0717c.class), new C0360a(interfaceC1309eC, 1), new C0362c(this, interfaceC1309eC, 1), new C0361b(interfaceC1309eC, 1));
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC1305a.o(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_categories, viewGroup, false);
        int i6 = R.id.categoryList;
        RecyclerView recyclerView = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.categoryList);
        if (recyclerView != null) {
            i6 = R.id.loader;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) AbstractC1332d.E(viewInflate, R.id.loader);
            if (linearProgressIndicator != null) {
                i6 = R.id.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC1332d.E(viewInflate, R.id.swipeRefresh);
                if (swipeRefreshLayout != null) {
                    i6 = R.id.title;
                    if (((TextView) AbstractC1332d.E(viewInflate, R.id.title)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f6186A0 = new Y0.b(constraintLayout, recyclerView, linearProgressIndicator, swipeRefreshLayout);
                        AbstractC1305a.n(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void K(View view) {
        AbstractC1305a.o(view, "view");
        this.f6184y0 = (W0.b) N();
        Y0.b bVar = this.f6186A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        SwipeRefreshLayout swipeRefreshLayout = bVar.f4779d;
        AbstractC1305a.n(swipeRefreshLayout, "swipeRefresh");
        this.f6187B0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new G(4, this));
        E e6 = ((C0717c) this.f6188C0.getValue()).f8513b;
        m0 m0Var = this.f8628m0;
        if (m0Var != null) {
            e6.e(m0Var, new W0.h(2, new Q(10, this)));
            W();
        } else {
            throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
    }

    public final void W() {
        X0.d dVar = new X0.d(0, new H0(6, this));
        this.f6189D0 = dVar;
        Y0.b bVar = this.f6186A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        bVar.f4778c.setAdapter(dVar);
        Y0.b bVar2 = this.f6186A0;
        if (bVar2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        bVar2.f4778c.setNestedScrollingEnabled(false);
        C0717c c0717c = (C0717c) this.f6188C0.getValue();
        c0717c.getClass();
        S3.a.B(U.e(c0717c), J.f1852b, null, new C0715a(c0717c, null), 2);
    }
}
