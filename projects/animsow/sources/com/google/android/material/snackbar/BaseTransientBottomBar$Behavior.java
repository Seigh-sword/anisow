package com.google.android.material.snackbar;

import K1.b;
import R2.g;
import R2.i;
import R2.n;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f7294j = new b(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, B.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b bVar = this.f7294j;
        bVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                n.b().e((g) bVar.f1515x);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            n.b().d((g) bVar.f1515x);
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.f7294j.getClass();
        return view instanceof i;
    }
}
