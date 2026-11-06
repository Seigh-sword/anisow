package com.google.android.material.floatingactionbutton;

import B.b;
import B.e;
import H1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends b {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // B.b
    public final /* bridge */ /* synthetic */ boolean e(View view) {
        a.q(view);
        throw null;
    }

    @Override // B.b
    public final void g(e eVar) {
        if (eVar.f44h == 0) {
            eVar.f44h = 80;
        }
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a.q(view);
        throw null;
    }

    @Override // B.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i6) {
        a.q(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12456j);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
