package com.google.android.material.behavior;

import B.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.xo.anilab.R;
import d.AbstractC0628i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.C0955d;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f7038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f7039e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f7042h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f7035a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7040f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7041g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // B.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i6) {
        this.f7040f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f7036b = Y2.b.z(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f7037c = Y2.b.z(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f7038d = Y2.b.A(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1301a.f12620d);
        this.f7039e = Y2.b.A(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1301a.f12619c);
        return false;
    }

    @Override // B.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f7035a;
        if (i6 > 0) {
            if (this.f7041g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f7042h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f7041g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                AbstractC0628i.p(it.next());
                throw null;
            }
            this.f7042h = view.animate().translationY(this.f7040f).setInterpolator(this.f7039e).setDuration(this.f7037c).setListener(new C0955d(3, this));
            return;
        }
        if (i6 >= 0 || this.f7041g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f7042h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f7041g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            AbstractC0628i.p(it2.next());
            throw null;
        }
        this.f7042h = view.animate().translationY(0).setInterpolator(this.f7038d).setDuration(this.f7036b).setListener(new C0955d(3, this));
    }

    @Override // B.b
    public boolean s(View view, int i6, int i7) {
        return i6 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
