package com.google.android.material.datepicker;

import N.D;
import N.V;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xo.anilab.R;
import java.util.WeakHashMap;
import v0.u0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends u0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f7245v;

    public q(LinearLayout linearLayout, boolean z5) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f7244u = textView;
        WeakHashMap weakHashMap = V.f1964a;
        new D(R.id.tag_accessibility_heading, 3).b(textView, Boolean.TRUE);
        this.f7245v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z5) {
            return;
        }
        textView.setVisibility(8);
    }
}
