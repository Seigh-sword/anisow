package N;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: N.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0110v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f2057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f2059y;

    public ViewTreeObserverOnPreDrawListenerC0110v(View view, Runnable runnable) {
        this.f2057w = view;
        this.f2058x = view.getViewTreeObserver();
        this.f2059y = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0110v viewTreeObserverOnPreDrawListenerC0110v = new ViewTreeObserverOnPreDrawListenerC0110v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0110v);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0110v);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f2058x.isAlive();
        View view = this.f2057w;
        (zIsAlive ? this.f2058x : view.getViewTreeObserver()).removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f2059y.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2058x = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f2058x.isAlive();
        View view2 = this.f2057w;
        (zIsAlive ? this.f2058x : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
