package c1;

import J3.G;
import W.Q;
import a0.C0257e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import d2.AbstractC0651b;
import g1.C0724j;
import h0.n0;
import o0.H0;
import s4.AbstractC1305a;
import s4.InterfaceC1309e;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: c1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373n extends C0363d {
    public static final /* synthetic */ int E0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Y0.b f6211A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SwipeRefreshLayout f6212B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final c0 f6213C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public X0.e f6214D0;

    public C0373n() {
        InterfaceC1309e interfaceC1309eC = S3.a.C(new C0257e(new n0(5, this), 5));
        this.f6213C0 = new c0(D4.s.a(C0724j.class), new C0360a(interfaceC1309eC, 4), new C0362c(this, interfaceC1309eC, 4), new C0361b(interfaceC1309eC, 4));
    }

    public static final void W(C0373n c0373n, boolean z5) {
        Y0.b bVar = c0373n.f6211A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        LinearProgressIndicator linearProgressIndicator = bVar.f4777b;
        AbstractC1305a.n(linearProgressIndicator, "loader");
        AbstractC1332d.w0(linearProgressIndicator, z5);
        if (z5) {
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = c0373n.f6212B0;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        } else {
            AbstractC1305a.W("swipeRefresh");
            throw null;
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC1305a.o(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_list, viewGroup, false);
        int i6 = R.id.loader;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) AbstractC1332d.E(viewInflate, R.id.loader);
        if (linearProgressIndicator != null) {
            i6 = R.id.post_list;
            RecyclerView recyclerView = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.post_list);
            if (recyclerView != null) {
                i6 = R.id.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC1332d.E(viewInflate, R.id.swipeRefresh);
                if (swipeRefreshLayout != null) {
                    i6 = R.id.title;
                    if (((TextView) AbstractC1332d.E(viewInflate, R.id.title)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f6211A0 = new Y0.b(constraintLayout, linearProgressIndicator, recyclerView, swipeRefreshLayout, 2);
                        AbstractC1305a.n(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void G() throws Throwable {
        this.f8616a0 = true;
        Z0.p pVarU = U();
        pVarU.getClass();
        if (((Boolean) S3.a.J(new Z0.k(pVarU, null))).booleanValue()) {
            Z0.p pVarU2 = U();
            pVarU2.getClass();
            S3.a.J(new Z0.o(pVarU2, false, null));
            X();
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void K(View view) {
        AbstractC1305a.o(view, "view");
        this.f6184y0 = (W0.b) N();
        Y0.b bVar = this.f6211A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        SwipeRefreshLayout swipeRefreshLayout = bVar.f4779d;
        AbstractC1305a.n(swipeRefreshLayout, "swipeRefresh");
        this.f6212B0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new G(7, this));
        X();
    }

    public final void X() {
        X0.e eVar = new X0.e(new H0(9, this));
        this.f6214D0 = eVar;
        Y0.b bVar = this.f6211A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        bVar.f4778c.setAdapter(eVar);
        Y0.b bVar2 = this.f6211A0;
        if (bVar2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        bVar2.f4778c.setNestedScrollingEnabled(false);
        X0.e eVar2 = this.f6214D0;
        if (eVar2 == null) {
            AbstractC1305a.W("postsAdapter");
            throw null;
        }
        eVar2.f(new Q(13, this));
        S3.a.B(AbstractC0651b.q(this), null, null, new C0372m(this, null), 3);
    }
}
