package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7253w;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7253w = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f7253w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i8 - i6) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f7253w == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f7253w + paddingTop) - childAt.getBaseline();
                childAt.layout(i11, baseline, measuredWidth + i11, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i6, i7);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = Math.max(iMax3, baseline);
                    iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            iMax = Math.max(iMax, Math.max(iMax4, getPaddingBottom()) + iMax3);
            this.f7253w = iMax3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i6, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax, getSuggestedMinimumHeight()), i7, iCombineMeasuredStates << 16));
    }
}
