package B;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public boolean e(View view) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i6) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        return false;
    }

    public boolean m(View view) {
        return false;
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
    }

    public Parcelable r(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean s(View view, int i6, int i7) {
        return false;
    }

    public boolean u(View view, MotionEvent motionEvent) {
        return false;
    }

    public void i() {
    }

    public void f(View view) {
    }

    public void g(e eVar) {
    }

    public void p(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void q(View view, Parcelable parcelable) {
    }

    public void t(View view, View view2, int i6) {
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr, int i8) {
    }
}
