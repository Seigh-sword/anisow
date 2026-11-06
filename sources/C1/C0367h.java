package c1;

import J3.G;
import M4.J;
import W.Q;
import a0.C0257e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.E;
import androidx.lifecycle.U;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.app.models.Featured;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import g1.C0720f;
import g1.C0721g;
import h0.m0;
import h0.n0;
import s4.AbstractC1305a;
import s4.InterfaceC1309e;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: c1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0367h extends C0363d {

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ int f6192F0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Y0.c f6193A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SwipeRefreshLayout f6194B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final c0 f6195C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public X0.d f6196D0;
    public Featured E0;

    public C0367h() {
        InterfaceC1309e interfaceC1309eC = S3.a.C(new C0257e(new n0(3, this), 3));
        this.f6195C0 = new c0(D4.s.a(C0721g.class), new C0360a(interfaceC1309eC, 2), new C0362c(this, interfaceC1309eC, 2), new C0361b(interfaceC1309eC, 2));
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC1305a.o(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        int i6 = R.id.content;
        NestedScrollView nestedScrollView = (NestedScrollView) AbstractC1332d.E(viewInflate, R.id.content);
        if (nestedScrollView != null) {
            i6 = R.id.featured;
            if (((FrameLayout) AbstractC1332d.E(viewInflate, R.id.featured)) != null) {
                i6 = R.id.featuredAge;
                TextView textView = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredAge);
                if (textView != null) {
                    i6 = R.id.featuredAgeBlock;
                    LinearLayout linearLayout = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.featuredAgeBlock);
                    if (linearLayout != null) {
                        i6 = R.id.featuredGenres;
                        TextView textView2 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredGenres);
                        if (textView2 != null) {
                            i6 = R.id.featuredImage;
                            ImageView imageView = (ImageView) AbstractC1332d.E(viewInflate, R.id.featuredImage);
                            if (imageView != null) {
                                i6 = R.id.featuredPremiered;
                                TextView textView3 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredPremiered);
                                if (textView3 != null) {
                                    i6 = R.id.featuredRating;
                                    TextView textView4 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredRating);
                                    if (textView4 != null) {
                                        i6 = R.id.featuredRatingBlock;
                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.featuredRatingBlock);
                                        if (linearLayout2 != null) {
                                            i6 = R.id.featuredRuntime;
                                            TextView textView5 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredRuntime);
                                            if (textView5 != null) {
                                                i6 = R.id.featuredScore;
                                                TextView textView6 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredScore);
                                                if (textView6 != null) {
                                                    i6 = R.id.featuredScoreblock;
                                                    LinearLayout linearLayout3 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.featuredScoreblock);
                                                    if (linearLayout3 != null) {
                                                        i6 = R.id.featuredShare;
                                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.featuredShare);
                                                        if (linearLayout4 != null) {
                                                            i6 = R.id.featuredStatus;
                                                            TextView textView7 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredStatus);
                                                            if (textView7 != null) {
                                                                i6 = R.id.featuredTitle;
                                                                TextView textView8 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredTitle);
                                                                if (textView8 != null) {
                                                                    i6 = R.id.featuredType;
                                                                    TextView textView9 = (TextView) AbstractC1332d.E(viewInflate, R.id.featuredType);
                                                                    if (textView9 != null) {
                                                                        i6 = R.id.featuredWatch;
                                                                        LinearLayout linearLayout5 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.featuredWatch);
                                                                        if (linearLayout5 != null) {
                                                                            i6 = R.id.featuredWatchlist;
                                                                            LinearLayout linearLayout6 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.featuredWatchlist);
                                                                            if (linearLayout6 != null) {
                                                                                i6 = R.id.loader;
                                                                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) AbstractC1332d.E(viewInflate, R.id.loader);
                                                                                if (linearProgressIndicator != null) {
                                                                                    i6 = R.id.section_list;
                                                                                    RecyclerView recyclerView = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.section_list);
                                                                                    if (recyclerView != null) {
                                                                                        i6 = R.id.swipeRefresh;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC1332d.E(viewInflate, R.id.swipeRefresh);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            i6 = R.id.watchlistAdd;
                                                                                            ImageView imageView2 = (ImageView) AbstractC1332d.E(viewInflate, R.id.watchlistAdd);
                                                                                            if (imageView2 != null) {
                                                                                                i6 = R.id.watchlistRemove;
                                                                                                ImageView imageView3 = (ImageView) AbstractC1332d.E(viewInflate, R.id.watchlistRemove);
                                                                                                if (imageView3 != null) {
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                    this.f6193A0 = new Y0.c(constraintLayout, nestedScrollView, textView, linearLayout, textView2, imageView, textView3, textView4, linearLayout2, textView5, textView6, linearLayout3, linearLayout4, textView7, textView8, textView9, linearLayout5, linearLayout6, linearProgressIndicator, recyclerView, swipeRefreshLayout, imageView2, imageView3);
                                                                                                    AbstractC1305a.n(constraintLayout, "getRoot(...)");
                                                                                                    return constraintLayout;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public final void G() {
        this.f8616a0 = true;
        if (this.E0 != null) {
            W(false);
        }
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void K(View view) {
        AbstractC1305a.o(view, "view");
        Y0.c cVar = this.f6193A0;
        if (cVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        SwipeRefreshLayout swipeRefreshLayout = cVar.f4800u;
        AbstractC1305a.n(swipeRefreshLayout, "swipeRefresh");
        this.f6194B0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new G(5, this));
        c0 c0Var = this.f6195C0;
        E e6 = ((C0721g) c0Var.getValue()).f8519b;
        m0 m0Var = this.f8628m0;
        if (m0Var == null) {
            throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        e6.e(m0Var, new W0.h(3, new Q(11, this)));
        C0721g c0721g = (C0721g) c0Var.getValue();
        c0721g.getClass();
        S3.a.B(U.e(c0721g), J.f1852b, null, new C0720f(c0721g, null), 2);
    }

    public final void W(boolean z5) {
        Z0.p pVarU = U();
        Featured featured = this.E0;
        if (featured == null) {
            AbstractC1305a.W("featured");
            throw null;
        }
        boolean zF = pVarU.f(featured.getId());
        Y0.c cVar = this.f6193A0;
        if (cVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ImageView imageView = cVar.f4801v;
        AbstractC1305a.n(imageView, "watchlistAdd");
        AbstractC1332d.v0(imageView, !zF);
        Y0.c cVar2 = this.f6193A0;
        if (cVar2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ImageView imageView2 = cVar2.f4802w;
        AbstractC1305a.n(imageView2, "watchlistRemove");
        AbstractC1332d.v0(imageView2, zF);
        if (z5) {
            String strP = p(zF ? R.string.added_to_my_list : R.string.removed_from_my_list);
            AbstractC1305a.n(strP, "getString(...)");
            Y0.c cVar3 = this.f6193A0;
            if (cVar3 != null) {
                R2.l.f(cVar3.f4780a, strP).g();
            } else {
                AbstractC1305a.W("binding");
                throw null;
            }
        }
    }
}
