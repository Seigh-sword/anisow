package com.android.app.activities;

import D4.s;
import J3.G;
import M4.J;
import R2.l;
import W.Q;
import W0.b;
import W0.h;
import W0.i;
import W0.j;
import X0.d;
import Y0.a;
import Z0.p;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.app.network.responses.PostResponse;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.xo.anilab.R;
import d.C0636q;
import g1.C0725k;
import g1.C0726l;
import o0.H0;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class PostActivity extends b {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f6281j0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public a f6282c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SwipeRefreshLayout f6283d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c0 f6284e0 = new c0(s.a(C0726l.class), new C0636q(this, 11), new C0636q(this, 10), new W0.a(this, 3));

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public d f6285f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public d f6286g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public d f6287h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public PostResponse f6288i0;

    @Override // W0.b
    public final void n() {
        finish();
    }

    @Override // W0.b, W0.g, h0.E, d.AbstractActivityC0638s, D.AbstractActivityC0011l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i6 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_post, (ViewGroup) null, false);
        int i7 = R.id.age;
        TextView textView = (TextView) AbstractC1332d.E(viewInflate, R.id.age);
        if (textView != null) {
            i7 = R.id.ageBlock;
            LinearLayout linearLayout = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.ageBlock);
            if (linearLayout != null) {
                i7 = R.id.back_btn;
                ImageView imageView = (ImageView) AbstractC1332d.E(viewInflate, R.id.back_btn);
                if (imageView != null) {
                    i7 = R.id.background;
                    ImageView imageView2 = (ImageView) AbstractC1332d.E(viewInflate, R.id.background);
                    if (imageView2 != null) {
                        i7 = R.id.content;
                        NestedScrollView nestedScrollView = (NestedScrollView) AbstractC1332d.E(viewInflate, R.id.content);
                        if (nestedScrollView != null) {
                            i7 = R.id.genres;
                            TextView textView2 = (TextView) AbstractC1332d.E(viewInflate, R.id.genres);
                            if (textView2 != null) {
                                i7 = R.id.loader;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) AbstractC1332d.E(viewInflate, R.id.loader);
                                if (linearProgressIndicator != null) {
                                    i7 = R.id.overview;
                                    TextView textView3 = (TextView) AbstractC1332d.E(viewInflate, R.id.overview);
                                    if (textView3 != null) {
                                        i7 = R.id.premiered;
                                        TextView textView4 = (TextView) AbstractC1332d.E(viewInflate, R.id.premiered);
                                        if (textView4 != null) {
                                            i7 = R.id.rating;
                                            TextView textView5 = (TextView) AbstractC1332d.E(viewInflate, R.id.rating);
                                            if (textView5 != null) {
                                                i7 = R.id.ratingBlock;
                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.ratingBlock);
                                                if (linearLayout2 != null) {
                                                    i7 = R.id.relatedBlock;
                                                    LinearLayout linearLayout3 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.relatedBlock);
                                                    if (linearLayout3 != null) {
                                                        i7 = R.id.relatedPostList;
                                                        RecyclerView recyclerView = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.relatedPostList);
                                                        if (recyclerView != null) {
                                                            i7 = R.id.runtime;
                                                            TextView textView6 = (TextView) AbstractC1332d.E(viewInflate, R.id.runtime);
                                                            if (textView6 != null) {
                                                                i7 = R.id.score;
                                                                TextView textView7 = (TextView) AbstractC1332d.E(viewInflate, R.id.score);
                                                                if (textView7 != null) {
                                                                    i7 = R.id.score_block;
                                                                    LinearLayout linearLayout4 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.score_block);
                                                                    if (linearLayout4 != null) {
                                                                        i7 = R.id.seasonsBlock;
                                                                        LinearLayout linearLayout5 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.seasonsBlock);
                                                                        if (linearLayout5 != null) {
                                                                            i7 = R.id.seasonsPostList;
                                                                            RecyclerView recyclerView2 = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.seasonsPostList);
                                                                            if (recyclerView2 != null) {
                                                                                i7 = R.id.share;
                                                                                LinearLayout linearLayout6 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.share);
                                                                                if (linearLayout6 != null) {
                                                                                    i7 = R.id.similarBlock;
                                                                                    LinearLayout linearLayout7 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.similarBlock);
                                                                                    if (linearLayout7 != null) {
                                                                                        i7 = R.id.similarPostList;
                                                                                        RecyclerView recyclerView3 = (RecyclerView) AbstractC1332d.E(viewInflate, R.id.similarPostList);
                                                                                        if (recyclerView3 != null) {
                                                                                            i7 = R.id.status;
                                                                                            TextView textView8 = (TextView) AbstractC1332d.E(viewInflate, R.id.status);
                                                                                            if (textView8 != null) {
                                                                                                i7 = R.id.swipeRefresh;
                                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC1332d.E(viewInflate, R.id.swipeRefresh);
                                                                                                if (swipeRefreshLayout != null) {
                                                                                                    i7 = R.id.title;
                                                                                                    TextView textView9 = (TextView) AbstractC1332d.E(viewInflate, R.id.title);
                                                                                                    if (textView9 != null) {
                                                                                                        i7 = R.id.type;
                                                                                                        TextView textView10 = (TextView) AbstractC1332d.E(viewInflate, R.id.type);
                                                                                                        if (textView10 != null) {
                                                                                                            i7 = R.id.watch;
                                                                                                            LinearLayout linearLayout8 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.watch);
                                                                                                            if (linearLayout8 != null) {
                                                                                                                i7 = R.id.watchlist;
                                                                                                                LinearLayout linearLayout9 = (LinearLayout) AbstractC1332d.E(viewInflate, R.id.watchlist);
                                                                                                                if (linearLayout9 != null) {
                                                                                                                    i7 = R.id.watchlistAdd;
                                                                                                                    ImageView imageView3 = (ImageView) AbstractC1332d.E(viewInflate, R.id.watchlistAdd);
                                                                                                                    if (imageView3 != null) {
                                                                                                                        i7 = R.id.watchlistRemove;
                                                                                                                        ImageView imageView4 = (ImageView) AbstractC1332d.E(viewInflate, R.id.watchlistRemove);
                                                                                                                        if (imageView4 != null) {
                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                            this.f6282c0 = new a(constraintLayout, textView, linearLayout, imageView, imageView2, nestedScrollView, textView2, linearProgressIndicator, textView3, textView4, textView5, linearLayout2, linearLayout3, recyclerView, textView6, textView7, linearLayout4, linearLayout5, recyclerView2, linearLayout6, linearLayout7, recyclerView3, textView8, swipeRefreshLayout, textView9, textView10, linearLayout8, linearLayout9, imageView3, imageView4);
                                                                                                                            setContentView(constraintLayout);
                                                                                                                            AbstractC1332d.W(this);
                                                                                                                            a aVar = this.f6282c0;
                                                                                                                            if (aVar == null) {
                                                                                                                                AbstractC1305a.W("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            SwipeRefreshLayout swipeRefreshLayout2 = aVar.f4773x;
                                                                                                                            AbstractC1305a.n(swipeRefreshLayout2, "swipeRefresh");
                                                                                                                            this.f6283d0 = swipeRefreshLayout2;
                                                                                                                            swipeRefreshLayout2.setOnRefreshListener(new G(3, this));
                                                                                                                            a aVar2 = this.f6282c0;
                                                                                                                            if (aVar2 == null) {
                                                                                                                                AbstractC1305a.W("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            aVar2.f4753d.setOnClickListener(new i(this, i6));
                                                                                                                            a aVar3 = this.f6282c0;
                                                                                                                            if (aVar3 == null) {
                                                                                                                                AbstractC1305a.W("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            aVar3.f4747B.setOnClickListener(new i(this, 1));
                                                                                                                            a aVar4 = this.f6282c0;
                                                                                                                            if (aVar4 == null) {
                                                                                                                                AbstractC1305a.W("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            aVar4.f4758i.setOnClickListener(new j());
                                                                                                                            ((C0726l) this.f6284e0.getValue()).f8524b.e(this, new h(1, new Q(9, this)));
                                                                                                                            q();
                                                                                                                            return;
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // h0.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        p(false);
    }

    public final void p(boolean z5) {
        p pVarO = o();
        Integer numR = r();
        AbstractC1305a.l(numR);
        boolean zF = pVarO.f(numR.intValue());
        a aVar = this.f6282c0;
        if (aVar == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ImageView imageView = aVar.f4748C;
        AbstractC1305a.n(imageView, "watchlistAdd");
        AbstractC1332d.v0(imageView, !zF);
        a aVar2 = this.f6282c0;
        if (aVar2 == null) {
            AbstractC1305a.W("binding");
            throw null;
        }
        ImageView imageView2 = aVar2.f4749D;
        AbstractC1305a.n(imageView2, "watchlistRemove");
        AbstractC1332d.v0(imageView2, zF);
        if (z5) {
            String string = getString(zF ? R.string.added_to_my_list : R.string.removed_from_my_list);
            AbstractC1305a.n(string, "getString(...)");
            a aVar3 = this.f6282c0;
            if (aVar3 != null) {
                l.f(aVar3.f4750a, string).g();
            } else {
                AbstractC1305a.W("binding");
                throw null;
            }
        }
    }

    public final void q() {
        if (r() != null) {
            d dVar = new d(1, new H0(2, this));
            this.f6285f0 = dVar;
            a aVar = this.f6282c0;
            if (aVar == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            aVar.f4768s.setAdapter(dVar);
            a aVar2 = this.f6282c0;
            if (aVar2 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            aVar2.f4768s.setNestedScrollingEnabled(false);
            d dVar2 = new d(3, new H0(3, this));
            this.f6286g0 = dVar2;
            a aVar3 = this.f6282c0;
            if (aVar3 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            aVar3.f4763n.setAdapter(dVar2);
            a aVar4 = this.f6282c0;
            if (aVar4 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            aVar4.f4763n.setNestedScrollingEnabled(false);
            d dVar3 = new d(3, new H0(4, this));
            this.f6287h0 = dVar3;
            a aVar5 = this.f6282c0;
            if (aVar5 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            aVar5.f4771v.setAdapter(dVar3);
            a aVar6 = this.f6282c0;
            if (aVar6 == null) {
                AbstractC1305a.W("binding");
                throw null;
            }
            aVar6.f4771v.setNestedScrollingEnabled(false);
            C0726l c0726l = (C0726l) this.f6284e0.getValue();
            Integer numR = r();
            AbstractC1305a.l(numR);
            int iIntValue = numR.intValue();
            c0726l.getClass();
            S3.a.B(U.e(c0726l), J.f1852b, null, new C0725k(c0726l, iIntValue, null), 2);
        }
    }

    public final Integer r() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return Integer.valueOf(extras.getInt("POST_ID"));
        }
        return null;
    }
}
