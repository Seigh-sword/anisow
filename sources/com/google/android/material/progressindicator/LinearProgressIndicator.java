package com.google.android.material.progressindicator;

import K2.d;
import K2.g;
import K2.l;
import K2.m;
import K2.n;
import K2.p;
import K2.q;
import N.V;
import android.content.Context;
import android.util.AttributeSet;
import i.E;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends d {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q qVar = this.f1547w;
        m mVar = new m();
        mVar.f1581a = qVar;
        mVar.f1584b = 300.0f;
        Context context2 = getContext();
        E nVar = qVar.f1609h == 0 ? new n(qVar) : new p(context2, qVar);
        l lVar = new l(context2, qVar);
        lVar.f1582H = mVar;
        lVar.f1583I = nVar;
        nVar.f9145w = lVar;
        setIndeterminateDrawable(lVar);
        setProgressDrawable(new g(getContext(), qVar, mVar));
    }

    @Override // K2.d
    public final void a(int i6, boolean z5) {
        q qVar = this.f1547w;
        if (qVar != null && qVar.f1609h == 0 && isIndeterminate()) {
            return;
        }
        super.a(i6, z5);
    }

    public int getIndeterminateAnimationType() {
        return this.f1547w.f1609h;
    }

    public int getIndicatorDirection() {
        return this.f1547w.f1610i;
    }

    public int getTrackStopIndicatorSize() {
        return this.f1547w.f1612k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        q qVar = this.f1547w;
        boolean z6 = true;
        if (qVar.f1610i != 1) {
            WeakHashMap weakHashMap = V.f1964a;
            if ((getLayoutDirection() != 1 || qVar.f1610i != 2) && (getLayoutDirection() != 0 || qVar.f1610i != 3)) {
                z6 = false;
            }
        }
        qVar.f1611j = z6;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        int paddingRight = i6 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i7 - (getPaddingBottom() + getPaddingTop());
        l indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        g progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i6) {
        l indeterminateDrawable;
        E pVar;
        q qVar = this.f1547w;
        if (qVar.f1609h == i6) {
            return;
        }
        if (b() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        qVar.f1609h = i6;
        qVar.a();
        if (i6 == 0) {
            indeterminateDrawable = getIndeterminateDrawable();
            pVar = new n(qVar);
        } else {
            indeterminateDrawable = getIndeterminateDrawable();
            pVar = new p(getContext(), qVar);
        }
        indeterminateDrawable.f1583I = pVar;
        pVar.f9145w = indeterminateDrawable;
        invalidate();
    }

    @Override // K2.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.f1547w.a();
    }

    public void setIndicatorDirection(int i6) {
        q qVar = this.f1547w;
        qVar.f1610i = i6;
        boolean z5 = true;
        if (i6 != 1) {
            WeakHashMap weakHashMap = V.f1964a;
            if ((getLayoutDirection() != 1 || qVar.f1610i != 2) && (getLayoutDirection() != 0 || i6 != 3)) {
                z5 = false;
            }
        }
        qVar.f1611j = z5;
        invalidate();
    }

    @Override // K2.d
    public void setTrackCornerRadius(int i6) {
        super.setTrackCornerRadius(i6);
        this.f1547w.a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i6) {
        q qVar = this.f1547w;
        if (qVar.f1612k != i6) {
            qVar.f1612k = Math.min(i6, qVar.f1551a);
            qVar.a();
            invalidate();
        }
    }
}
