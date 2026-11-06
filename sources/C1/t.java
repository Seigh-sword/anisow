package c1;

import J3.G;
import W.Q;
import a0.C0257e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import d2.AbstractC0651b;
import g1.C0727m;
import h0.n0;
import java.util.Timer;
import m2.C0;
import o0.H0;
import s4.AbstractC1305a;
import s4.InterfaceC1309e;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class t extends C0363d {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ int f6226I0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public android.support.v4.media.b f6227A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SwipeRefreshLayout f6228B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public EditText f6229C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final c0 f6230D0;
    public X0.e E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public String f6231F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public Timer f6232G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final long f6233H0;

    public t() {
        InterfaceC1309e interfaceC1309eC = S3.a.C(new C0257e(new n0(6, this), 6));
        this.f6230D0 = new c0(D4.s.a(C0727m.class), new C0360a(interfaceC1309eC, 5), new C0362c(this, interfaceC1309eC, 5), new C0361b(interfaceC1309eC, 5));
        this.f6231F0 = "";
        this.f6232G0 = new Timer();
        this.f6233H0 = 500L;
    }

    public static final void W(t tVar, boolean z5) {
        android.support.v4.media.b bVar = tVar.f6227A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) bVar.f5067c;
        AbstractC1305a.n(linearProgressIndicator, "loader");
        AbstractC1332d.w0(linearProgressIndicator, z5);
        if (z5) {
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = tVar.f6228B0;
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
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search, viewGroup, false);
        int i6 = R.id.clearBtn;
        ImageView imageView = (ImageView) AbstractC1332d.E(viewInflate, R.id.clearBtn);
        if (imageView != null) {
            i6 = R.id.loader;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) AbstractC1332d.E(viewInflate, R.id.loader);
            if (linearProgressIndicator != null) {
                i6 = R.id.post_list;
                RecyclerView recyclerView = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.post_list);
                if (recyclerView != null) {
                    i6 = R.id.searchContainer;
                    LinearLayout linearLayout = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.searchContainer);
                    if (linearLayout != null) {
                        i6 = R.id.searchInput;
                        EditText editText = (EditText) AbstractC1332d.E(viewInflate, R.id.searchInput);
                        if (editText != null) {
                            i6 = R.id.swipeRefresh;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC1332d.E(viewInflate, R.id.swipeRefresh);
                            if (swipeRefreshLayout != null) {
                                i6 = R.id.title;
                                TextView textView = (TextView) AbstractC1332d.E(viewInflate, R.id.title);
                                if (textView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.f6227A0 = new android.support.v4.media.b(constraintLayout, imageView, linearProgressIndicator, recyclerView, linearLayout, editText, swipeRefreshLayout, textView);
                                    AbstractC1305a.n(constraintLayout, "getRoot(...)");
                                    return constraintLayout;
                                }
                            }
                        }
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
        android.support.v4.media.b bVar = this.f6227A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) bVar.f5071g;
        AbstractC1305a.n(swipeRefreshLayout, "swipeRefresh");
        this.f6228B0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new G(8, this));
        android.support.v4.media.b bVar2 = this.f6227A0;
        if (bVar2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        EditText editText = (EditText) bVar2.f5070f;
        AbstractC1305a.n(editText, "searchInput");
        this.f6229C0 = editText;
        editText.addTextChangedListener(new s(this));
        android.support.v4.media.b bVar3 = this.f6227A0;
        if (bVar3 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ((RecyclerView) bVar3.f5068d).setOnTouchListener(new o(0, this));
        Z();
        android.support.v4.media.b bVar4 = this.f6227A0;
        if (bVar4 != null) {
            ((ImageView) bVar4.f5066b).setOnClickListener(new W0.d(1, this));
        } else {
            AbstractC1305a.W("binding");
            throw null;
        }
    }

    public final void X() {
        if (K4.h.d0(this.f6231F0)) {
            X0.e eVar = new X0.e(new H0(10, this));
            this.E0 = eVar;
            android.support.v4.media.b bVar = this.f6227A0;
            if (bVar == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            ((RecyclerView) bVar.f5068d).setAdapter(eVar);
            android.support.v4.media.b bVar2 = this.f6227A0;
            if (bVar2 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            ((RecyclerView) bVar2.f5068d).setNestedScrollingEnabled(false);
            SwipeRefreshLayout swipeRefreshLayout = this.f6228B0;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
                return;
            } else {
                AbstractC1305a.W("swipeRefresh");
                throw null;
            }
        }
        X0.e eVar2 = new X0.e(new H0(11, this));
        this.E0 = eVar2;
        android.support.v4.media.b bVar3 = this.f6227A0;
        if (bVar3 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ((RecyclerView) bVar3.f5068d).setAdapter(eVar2);
        android.support.v4.media.b bVar4 = this.f6227A0;
        if (bVar4 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ((RecyclerView) bVar4.f5068d).setNestedScrollingEnabled(false);
        X0.e eVar3 = this.E0;
        if (eVar3 == null) {
            AbstractC1305a.W("postsAdapter");
            throw null;
        }
        eVar3.f(new Q(14, this));
        S3.a.B(AbstractC0651b.q(this), null, null, new q(this, null), 3);
    }

    public final void Y() {
        if (K4.h.d0(this.f6231F0)) {
            EditText editText = this.f6229C0;
            if (editText == null) {
                AbstractC1305a.W("searchInput");
                throw null;
            }
            editText.requestFocus();
            try {
                new Timer().schedule(new r(0, this), 200L);
            } catch (Exception e6) {
                C0.h().a(e6);
                e6.printStackTrace();
            }
        }
    }

    public final void Z() {
        android.support.v4.media.b bVar = this.f6227A0;
        if (bVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ImageView imageView = (ImageView) bVar.f5066b;
        AbstractC1305a.n(imageView, "clearBtn");
        EditText editText = this.f6229C0;
        if (editText == null) {
            AbstractC1305a.W("searchInput");
            throw null;
        }
        AbstractC1305a.n(editText.getText(), "getText(...)");
        AbstractC1332d.v0(imageView, !K4.h.d0(r1));
    }
}
