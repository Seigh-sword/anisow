package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class p implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f7242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f7243x;

    public p(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f7243x = rVar;
        this.f7242w = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f7242w;
        o oVarA = materialCalendarGridView.a();
        if (i6 < oVarA.a() || i6 > oVarA.c()) {
            return;
        }
        K1.b bVar = this.f7243x.f7247e;
        long jLongValue = materialCalendarGridView.a().getItem(i6).longValue();
        Object obj = bVar.f1515x;
        if (jLongValue < ((d) ((k) obj).f7199v0.f7175y).f7177w) {
            return;
        }
        ((k) obj).getClass();
        throw null;
    }
}
