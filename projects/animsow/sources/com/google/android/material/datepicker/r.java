package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xo.anilab.R;
import java.util.Calendar;
import v0.W;
import v0.g0;
import v0.u0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f7246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K1.b f7247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7248f;

    public r(ContextThemeWrapper contextThemeWrapper, c cVar, K1.b bVar) {
        n nVar = cVar.f7173w;
        n nVar2 = cVar.f7176z;
        if (nVar.f7233w.compareTo(nVar2.f7233w) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVar2.f7233w.compareTo(cVar.f7174x.f7233w) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i6 = o.f7237d;
        int i7 = k.f7193F0;
        this.f7248f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i6) + (l.a0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f7246d = cVar;
        this.f7247e = bVar;
        if (this.f13071a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f13072b = true;
    }

    @Override // v0.W
    public final int a() {
        return this.f7246d.f7172C;
    }

    @Override // v0.W
    public final long b(int i6) {
        Calendar calendarB = u.b(this.f7246d.f7173w.f7233w);
        calendarB.add(2, i6);
        return new n(calendarB).f7233w.getTimeInMillis();
    }

    @Override // v0.W
    public final void c(u0 u0Var, int i6) {
        q qVar = (q) u0Var;
        c cVar = this.f7246d;
        Calendar calendarB = u.b(cVar.f7173w.f7233w);
        calendarB.add(2, i6);
        n nVar = new n(calendarB);
        qVar.f7244u.setText(nVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f7245v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !nVar.equals(materialCalendarGridView.a().f7239a)) {
            new o(nVar, cVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // v0.W
    public final u0 d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!l.a0(recyclerView.getContext(), android.R.attr.windowFullscreen)) {
            return new q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new g0(-1, this.f7248f));
        return new q(linearLayout, true);
    }
}
