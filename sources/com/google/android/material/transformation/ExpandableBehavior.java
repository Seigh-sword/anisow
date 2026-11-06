package com.google.android.material.transformation;

import B.b;
import N.V;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    @Override // B.b
    public abstract void f(View view);

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0628i.p(view2);
        throw null;
    }

    @Override // B.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i6) {
        WeakHashMap weakHashMap = V.f1964a;
        if (!view.isLaidOut()) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i7 = 0; i7 < size; i7++) {
                f(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
