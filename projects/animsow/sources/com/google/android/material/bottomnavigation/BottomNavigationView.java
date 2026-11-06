package com.google.android.material.bottomnavigation;

import H2.m;
import J2.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xo.anilab.R;
import f2.h;
import i.C0803c;
import p1.C1243i;
import r2.AbstractC1274a;
import x2.b;
import x2.c;
import x2.d;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends k {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0803c c0803cF = m.f(getContext(), attributeSet, AbstractC1274a.f12449c, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        setItemHorizontalTranslationEnabled(c0803cF.r(2, true));
        if (c0803cF.G(0)) {
            setMinimumHeight(c0803cF.u(0, 0));
        }
        c0803cF.r(1, true);
        c0803cF.M();
        h.k(this, new C1243i(13, this));
    }

    @Override // J2.k
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i7) != 1073741824 && suggestedMinimumHeight > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i6, i7);
    }

    public void setItemHorizontalTranslationEnabled(boolean z5) {
        b bVar = (b) getMenuView();
        if (bVar.f13680k0 != z5) {
            bVar.setItemHorizontalTranslationEnabled(z5);
            getPresenter().n(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
