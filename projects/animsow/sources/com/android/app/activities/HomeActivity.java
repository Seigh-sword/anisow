package com.android.app.activities;

import D4.s;
import J3.G;
import M4.J;
import W.Q;
import W0.a;
import W0.b;
import W0.h;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import androidx.lifecycle.c0;
import c1.C0363d;
import c1.C0365f;
import c1.C0367h;
import c1.C0370k;
import c1.C0373n;
import c1.r;
import c1.t;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.xo.anilab.R;
import d.C0636q;
import g1.C0718d;
import g1.C0719e;
import h0.C0736a;
import h0.W;
import java.util.Timer;
import p3.C1251c;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class HomeActivity extends b {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f6270m0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C1251c f6271c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final c0 f6272d0 = new c0(s.a(C0719e.class), new C0636q(this, 9), new C0636q(this, 8), new a(this, 2));

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final W f6273e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final C0367h f6274f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final C0365f f6275g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final C0370k f6276h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final t f6277i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final C0373n f6278j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public C0363d f6279k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f6280l0;

    public HomeActivity() {
        W wC = this.f8646P.C();
        AbstractC1305a.n(wC, "getSupportFragmentManager(...)");
        this.f6273e0 = wC;
        C0367h c0367h = new C0367h();
        this.f6274f0 = c0367h;
        this.f6275g0 = new C0365f();
        this.f6276h0 = new C0370k();
        this.f6277i0 = new t();
        this.f6278j0 = new C0373n();
        this.f6279k0 = c0367h;
    }

    @Override // W0.b
    public final void n() {
        if (AbstractC1305a.c(this.f6279k0, this.f6274f0)) {
            finish();
            return;
        }
        C1251c c1251c = this.f6271c0;
        if (c1251c != null) {
            ((BottomNavigationView) c1251c.f12319c).setSelectedItemId(R.id.home);
        } else {
            AbstractC1305a.W("binding");
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x007b. Please report as an issue. */
    @Override // W0.b, W0.g, h0.E, d.AbstractActivityC0638s, D.AbstractActivityC0011l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i6;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6280l0 = bundle.getBoolean("APP_OPENED");
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
        int i7 = R.id.bottomNav;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) AbstractC1332d.E(viewInflate, R.id.bottomNav);
        if (bottomNavigationView != null) {
            i7 = R.id.homeFragment;
            FrameLayout frameLayout = (FrameLayout) AbstractC1332d.E(viewInflate, R.id.homeFragment);
            if (frameLayout != null) {
                FrameLayout frameLayout2 = (FrameLayout) AbstractC1332d.E(viewInflate, R.id.moviesFragment);
                if (frameLayout2 != null) {
                    FrameLayout frameLayout3 = (FrameLayout) AbstractC1332d.E(viewInflate, R.id.myListFragment);
                    if (frameLayout3 != null) {
                        FrameLayout frameLayout4 = (FrameLayout) AbstractC1332d.E(viewInflate, R.id.searchFragment);
                        if (frameLayout4 != null) {
                            FrameLayout frameLayout5 = (FrameLayout) AbstractC1332d.E(viewInflate, R.id.seriesFragment);
                            if (frameLayout5 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f6271c0 = new C1251c(constraintLayout, bottomNavigationView, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, 3);
                                switch (3) {
                                }
                                setContentView(constraintLayout);
                                AbstractC1332d.W(this);
                                W w5 = this.f6273e0;
                                w5.getClass();
                                C0736a c0736a = new C0736a(w5);
                                c0736a.h(R.id.homeFragment, this.f6274f0, "homeFragment");
                                c0736a.h(R.id.moviesFragment, this.f6275g0, "moviesFragment");
                                c0736a.h(R.id.seriesFragment, this.f6276h0, "seriesFragment");
                                c0736a.h(R.id.searchFragment, this.f6277i0, "searchFragment");
                                c0736a.h(R.id.myListFragment, this.f6278j0, "myListFragment");
                                c0736a.d(false, true);
                                C1251c c1251c = this.f6271c0;
                                if (c1251c == null) {
                                    AbstractC1305a.W("binding");
                                    throw null;
                                }
                                int i8 = 2;
                                ((BottomNavigationView) c1251c.f12319c).setOnItemSelectedListener(new G(i8, this));
                                new Timer().schedule(new r(i8, this), 100L);
                                c0 c0Var = this.f6272d0;
                                ((C0719e) c0Var.getValue()).f8516b.e(this, new h(0, new Q(8, this)));
                                C0719e c0719e = (C0719e) c0Var.getValue();
                                c0719e.getClass();
                                S3.a.B(U.e(c0719e), J.f1852b, null, new C0718d(c0719e, null), 2);
                                if (this.f6280l0) {
                                    return;
                                }
                                Bundle extras = getIntent().getExtras();
                                if ((extras != null ? extras.getString("OPEN_WEB_URL") : null) != null) {
                                    Bundle extras2 = getIntent().getExtras();
                                    String string = extras2 != null ? extras2.getString("OPEN_WEB_URL") : null;
                                    AbstractC1305a.l(string);
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                                    intent.setFlags(268435456);
                                    startActivity(intent);
                                } else if (p() != null) {
                                    Integer numP = p();
                                    AbstractC1305a.l(numP);
                                    if (numP.intValue() > 0) {
                                        Integer numP2 = p();
                                        AbstractC1305a.l(numP2);
                                        AbstractC1332d.a0(this, numP2.intValue());
                                    }
                                }
                                this.f6280l0 = true;
                                return;
                            }
                            i6 = R.id.seriesFragment;
                        } else {
                            i7 = R.id.searchFragment;
                        }
                    } else {
                        i6 = R.id.myListFragment;
                    }
                    i7 = i6;
                } else {
                    i7 = R.id.moviesFragment;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // d.AbstractActivityC0638s, D.AbstractActivityC0011l, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC1305a.o(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("APP_OPENED", this.f6280l0);
    }

    public final Integer p() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return Integer.valueOf(extras.getInt("OPEN_POST"));
        }
        return null;
    }
}
