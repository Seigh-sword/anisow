package com.android.app.activities;

import D4.s;
import J3.G;
import W.Q;
import W0.a;
import W0.b;
import W0.d;
import W0.f;
import X0.e;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import d.C0636q;
import d2.AbstractC0651b;
import g1.C0717c;
import o0.H0;
import p3.C1251c;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class CategoryActivity extends b {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f6265g0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C1251c f6266c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SwipeRefreshLayout f6267d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c0 f6268e0 = new c0(s.a(C0717c.class), new C0636q(this, 7), new C0636q(this, 6), new a(this, 1));

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public e f6269f0;

    public static final void p(CategoryActivity categoryActivity, boolean z5) {
        C1251c c1251c = categoryActivity.f6266c0;
        if (c1251c == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) c1251c.f12320d;
        AbstractC1305a.n(linearProgressIndicator, "loader");
        AbstractC1332d.w0(linearProgressIndicator, z5);
        if (z5) {
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = categoryActivity.f6267d0;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        } else {
            AbstractC1305a.W("swipeRefresh");
            throw null;
        }
    }

    @Override // W0.b
    public final void n() {
        finish();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0065. Please report as an issue. */
    @Override // W0.b, W0.g, h0.E, d.AbstractActivityC0638s, D.AbstractActivityC0011l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_category, (ViewGroup) null, false);
        int i6 = R.id.back_btn;
        ImageView imageView = (ImageView) AbstractC1332d.E(viewInflate, R.id.back_btn);
        if (imageView != null) {
            i6 = R.id.loader;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) AbstractC1332d.E(viewInflate, R.id.loader);
            if (linearProgressIndicator != null) {
                i6 = R.id.post_list;
                RecyclerView recyclerView = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.post_list);
                if (recyclerView != null) {
                    i6 = R.id.swipeRefresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC1332d.E(viewInflate, R.id.swipeRefresh);
                    if (swipeRefreshLayout != null) {
                        i6 = R.id.toolbar;
                        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC1332d.E(viewInflate, R.id.toolbar);
                        if (constraintLayout != null) {
                            i6 = R.id.toolbar_title;
                            TextView textView = (TextView) AbstractC1332d.E(viewInflate, R.id.toolbar_title);
                            if (textView != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                this.f6266c0 = new C1251c(constraintLayout2, imageView, linearProgressIndicator, recyclerView, swipeRefreshLayout, constraintLayout, textView, 2);
                                switch (2) {
                                }
                                setContentView(constraintLayout2);
                                C1251c c1251c = this.f6266c0;
                                if (c1251c == null) {
                                    AbstractC1305a.W("binding");
                                    throw null;
                                }
                                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) c1251c.f12322f;
                                AbstractC1305a.n(swipeRefreshLayout2, "swipeRefresh");
                                this.f6267d0 = swipeRefreshLayout2;
                                swipeRefreshLayout2.setOnRefreshListener(new G(1, this));
                                C1251c c1251c2 = this.f6266c0;
                                if (c1251c2 == null) {
                                    AbstractC1305a.W("binding");
                                    throw null;
                                }
                                ((ImageView) c1251c2.f12319c).setOnClickListener(new d(0, this));
                                C1251c c1251c3 = this.f6266c0;
                                if (c1251c3 == null) {
                                    AbstractC1305a.W("binding");
                                    throw null;
                                }
                                TextView textView2 = (TextView) c1251c3.f12324h;
                                Bundle extras = getIntent().getExtras();
                                textView2.setText(extras != null ? extras.getString("CATEGORY_TITLE") : null);
                                q();
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }

    public final void q() {
        e eVar = new e(new H0(1, this));
        this.f6269f0 = eVar;
        C1251c c1251c = this.f6266c0;
        if (c1251c == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ((RecyclerView) c1251c.f12321e).setAdapter(eVar);
        C1251c c1251c2 = this.f6266c0;
        if (c1251c2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ((RecyclerView) c1251c2.f12321e).setNestedScrollingEnabled(false);
        e eVar2 = this.f6269f0;
        if (eVar2 == null) {
            AbstractC1305a.W("postsAdapter");
            throw null;
        }
        eVar2.f(new Q(7, this));
        S3.a.B(AbstractC0651b.q(this), null, null, new f(this, null), 3);
    }
}
