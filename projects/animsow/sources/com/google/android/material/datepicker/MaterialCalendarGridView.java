package com.google.android.material.datepicker;

import N.V;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f7167w;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u.d(null);
        if (l.a0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.xo.anilab.R.id.cancel_button);
            setNextFocusRightId(com.xo.anilab.R.id.confirm_button);
        }
        this.f7167w = l.a0(getContext(), com.xo.anilab.R.attr.nestedScrollable);
        V.l(this, new g(3, this));
    }

    public final o a() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((o) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o oVar = (o) super.getAdapter();
        oVar.getClass();
        int iMax = Math.max(oVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(oVar.c(), getLastVisiblePosition());
        oVar.getItem(iMax);
        oVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z5, int i6, Rect rect) {
        int iA;
        if (!z5) {
            super.onFocusChanged(false, i6, rect);
            return;
        }
        if (i6 == 33) {
            iA = ((o) super.getAdapter()).c();
        } else {
            if (i6 != 130) {
                super.onFocusChanged(true, i6, rect);
                return;
            }
            iA = ((o) super.getAdapter()).a();
        }
        setSelection(iA);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (!super.onKeyDown(i6, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((o) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i6) {
            return false;
        }
        setSelection(((o) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i6, int i7) {
        if (!this.f7167w) {
            super.onMeasure(i6, i7);
            return;
        }
        super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i6) {
        if (i6 < ((o) super.getAdapter()).a()) {
            i6 = ((o) super.getAdapter()).a();
        }
        super.setSelection(i6);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
