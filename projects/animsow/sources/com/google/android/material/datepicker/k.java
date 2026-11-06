package com.google.android.material.datepicker;

import N.V;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import i.ViewOnClickListenerC0802b;
import java.util.ArrayList;
import v0.T;
import v0.x0;

/* JADX INFO: loaded from: classes.dex */
public final class k<S> extends s {

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ int f7193F0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public RecyclerView f7194A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public View f7195B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public View f7196C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public View f7197D0;
    public View E0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f7198u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public c f7199v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public n f7200w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f7201x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public android.support.v4.media.b f7202y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public RecyclerView f7203z0;

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void A(Bundle bundle) {
        super.A(bundle);
        if (bundle == null) {
            bundle = this.f8591B;
        }
        this.f7198u0 = bundle.getInt("THEME_RES_ID_KEY");
        H1.a.o(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f7199v0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        H1.a.o(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f7200w0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i6;
        int i7;
        T t5;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.f7198u0);
        this.f7202y0 = new android.support.v4.media.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVar = this.f7199v0.f7173w;
        int i8 = 1;
        int i9 = 0;
        if (l.a0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i6 = com.xo.anilab.R.layout.mtrl_calendar_vertical;
            i7 = 1;
        } else {
            i6 = com.xo.anilab.R.layout.mtrl_calendar_horizontal;
            i7 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i6, viewGroup, false);
        Resources resources = O().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.xo.anilab.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.xo.anilab.R.dimen.mtrl_calendar_days_of_week_height);
        int i10 = o.f7237d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_calendar_month_vertical_padding) * (i10 - 1)) + (resources.getDimensionPixelSize(com.xo.anilab.R.dimen.mtrl_calendar_day_height) * i10) + resources.getDimensionPixelOffset(com.xo.anilab.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.xo.anilab.R.id.mtrl_calendar_days_of_week);
        V.l(gridView, new g(i9, this));
        int i11 = this.f7199v0.f7170A;
        gridView.setAdapter((ListAdapter) (i11 > 0 ? new e(i11) : new e()));
        gridView.setNumColumns(nVar.f7236z);
        gridView.setEnabled(false);
        this.f7194A0 = (RecyclerView) viewInflate.findViewById(com.xo.anilab.R.id.mtrl_calendar_months);
        m();
        this.f7194A0.setLayoutManager(new h(this, i7, i7));
        this.f7194A0.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f7199v0, new K1.b(10, this));
        this.f7194A0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.xo.anilab.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.xo.anilab.R.id.mtrl_calendar_year_selector_frame);
        this.f7203z0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f7203z0.setLayoutManager(new GridLayoutManager(integer));
            this.f7203z0.setAdapter(new w(this));
            this.f7203z0.g(new i(this));
        }
        if (viewInflate.findViewById(com.xo.anilab.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.xo.anilab.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            V.l(materialButton, new g(2, this));
            View viewFindViewById = viewInflate.findViewById(com.xo.anilab.R.id.month_navigation_previous);
            this.f7195B0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.xo.anilab.R.id.month_navigation_next);
            this.f7196C0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f7197D0 = viewInflate.findViewById(com.xo.anilab.R.id.mtrl_calendar_year_selector_frame);
            this.E0 = viewInflate.findViewById(com.xo.anilab.R.id.mtrl_calendar_day_selector_frame);
            V(1);
            materialButton.setText(this.f7200w0.c());
            this.f7194A0.h(new j(this, rVar, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0802b(3, this));
            this.f7196C0.setOnClickListener(new f(this, rVar, i8));
            this.f7195B0.setOnClickListener(new f(this, rVar, i9));
        }
        if (!l.a0(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (t5 = new T()).f13064a) != (recyclerView = this.f7194A0)) {
            x0 x0Var = t5.f13065b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f5696D0;
                if (arrayList != null) {
                    arrayList.remove(x0Var);
                }
                t5.f13064a.setOnFlingListener(null);
            }
            t5.f13064a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                t5.f13064a.h(x0Var);
                t5.f13064a.setOnFlingListener(t5);
                new Scroller(t5.f13064a.getContext(), new DecelerateInterpolator());
                t5.f();
            }
        }
        this.f7194A0.a0(rVar.f7246d.f7173w.d(this.f7200w0));
        V.l(this.f7194A0, new g(i8, this));
        return viewInflate;
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void H(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7198u0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7199v0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7200w0);
    }

    public final void U(n nVar) {
        RecyclerView recyclerView;
        Q0.e eVar;
        r rVar = (r) this.f7194A0.getAdapter();
        int iD = rVar.f7246d.f7173w.d(nVar);
        int iD2 = iD - rVar.f7246d.f7173w.d(this.f7200w0);
        boolean z5 = Math.abs(iD2) > 3;
        boolean z6 = iD2 > 0;
        this.f7200w0 = nVar;
        int i6 = 2;
        if (z5 && z6) {
            this.f7194A0.a0(iD - 3);
            recyclerView = this.f7194A0;
            eVar = new Q0.e(iD, i6, this);
        } else if (z5) {
            this.f7194A0.a0(iD + 3);
            recyclerView = this.f7194A0;
            eVar = new Q0.e(iD, i6, this);
        } else {
            recyclerView = this.f7194A0;
            eVar = new Q0.e(iD, i6, this);
        }
        recyclerView.post(eVar);
    }

    public final void V(int i6) {
        this.f7201x0 = i6;
        if (i6 == 2) {
            this.f7203z0.getLayoutManager().o0(this.f7200w0.f7235y - ((w) this.f7203z0.getAdapter()).f7252d.f7199v0.f7173w.f7235y);
            this.f7197D0.setVisibility(0);
            this.E0.setVisibility(8);
            this.f7195B0.setVisibility(8);
            this.f7196C0.setVisibility(8);
            return;
        }
        if (i6 == 1) {
            this.f7197D0.setVisibility(8);
            this.E0.setVisibility(0);
            this.f7195B0.setVisibility(0);
            this.f7196C0.setVisibility(0);
            U(this.f7200w0);
        }
    }
}
