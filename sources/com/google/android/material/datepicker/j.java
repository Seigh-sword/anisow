package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import v0.AbstractC1397f0;
import v0.j0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f7190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f7191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f7192c;

    public j(k kVar, r rVar, MaterialButton materialButton) {
        this.f7192c = kVar;
        this.f7190a = rVar;
        this.f7191b = materialButton;
    }

    @Override // v0.j0
    public final void a(RecyclerView recyclerView, int i6) {
        if (i6 == 0) {
            recyclerView.announceForAccessibility(this.f7191b.getText());
        }
    }

    @Override // v0.j0
    public final void b(RecyclerView recyclerView, int i6, int i7) {
        int iL0;
        k kVar = this.f7192c;
        if (i6 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f7194A0.getLayoutManager();
            View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            iL0 = viewN0 == null ? -1 : AbstractC1397f0.H(viewN0);
        } else {
            iL0 = ((LinearLayoutManager) kVar.f7194A0.getLayoutManager()).L0();
        }
        r rVar = this.f7190a;
        Calendar calendarB = u.b(rVar.f7246d.f7173w.f7233w);
        calendarB.add(2, iL0);
        kVar.f7200w0 = new n(calendarB);
        Calendar calendarB2 = u.b(rVar.f7246d.f7173w.f7233w);
        calendarB2.add(2, iL0);
        calendarB2.set(5, 1);
        Calendar calendarB3 = u.b(calendarB2);
        calendarB3.get(2);
        calendarB3.get(1);
        calendarB3.getMaximum(7);
        calendarB3.getActualMaximum(5);
        calendarB3.getTimeInMillis();
        this.f7191b.setText(u.a("yMMMM", Locale.getDefault()).format(new Date(calendarB3.getTimeInMillis())));
    }
}
