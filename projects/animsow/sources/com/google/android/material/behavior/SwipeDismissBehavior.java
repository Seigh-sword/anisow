package com.google.android.material.behavior;

import B.b;
import N.V;
import O.d;
import V.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p1.C1243i;
import v2.C1421a;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f7043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1243i f7044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7047e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7048f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f7049g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7050h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1421a f7051i = new C1421a(this);

    @Override // B.b
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f7045c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7045c = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7045c = false;
        }
        if (!zO) {
            return false;
        }
        if (this.f7043a == null) {
            this.f7043a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f7051i);
        }
        return !this.f7046d && this.f7043a.p(motionEvent);
    }

    @Override // B.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i6) {
        WeakHashMap weakHashMap = V.f1964a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            V.i(view, 1048576);
            V.g(view, 0);
            if (v(view)) {
                V.j(view, d.f2294j, new K1.b(8, this));
            }
        }
        return false;
    }

    @Override // B.b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.f7043a == null) {
            return false;
        }
        if (this.f7046d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f7043a.j(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}
