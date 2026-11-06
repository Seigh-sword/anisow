package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import v0.AbstractC1397f0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f7183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f7184y;

    public /* synthetic */ f(k kVar, r rVar, int i6) {
        this.f7182w = i6;
        this.f7184y = kVar;
        this.f7183x = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f7182w;
        r rVar = this.f7183x;
        k kVar = this.f7184y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int iL0 = ((LinearLayoutManager) kVar.f7194A0.getLayoutManager()).L0() - 1;
                if (iL0 >= 0) {
                    Calendar calendarB = u.b(rVar.f7246d.f7173w.f7233w);
                    calendarB.add(2, iL0);
                    kVar.U(new n(calendarB));
                }
                break;
            default:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f7194A0.getLayoutManager();
                View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int iH = (viewN0 == null ? -1 : AbstractC1397f0.H(viewN0)) + 1;
                if (iH < kVar.f7194A0.getAdapter().a()) {
                    Calendar calendarB2 = u.b(rVar.f7246d.f7173w.f7233w);
                    calendarB2.add(2, iH);
                    kVar.U(new n(calendarB2));
                }
                break;
        }
    }
}
