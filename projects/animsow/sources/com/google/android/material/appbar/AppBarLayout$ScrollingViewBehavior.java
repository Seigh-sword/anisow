package com.google.android.material.appbar;

import B.b;
import B.e;
import N.V;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r2.AbstractC1274a;
import t2.c;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7028c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
        }
    }

    @Override // B.b
    public final void f(View view) {
    }

    @Override // B.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = ((e) view2.getLayoutParams()).f37a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) bVar).getClass();
            int i6 = this.f7028c;
            int iO = bottom - (i6 == 0 ? 0 : com.bumptech.glide.c.o((int) (0.0f * i6), 0, i6));
            WeakHashMap weakHashMap = V.f1964a;
            view.offsetTopAndBottom(iO);
        }
        return false;
    }

    @Override // B.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        int i9 = view.getLayoutParams().height;
        if (i9 != -1 && i9 != -2) {
            return false;
        }
        w(coordinatorLayout.j(view));
        return false;
    }

    @Override // B.b
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // t2.c
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i6) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i6);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12439C);
        this.f7028c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
