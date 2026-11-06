package w1;

import android.view.View;
import android.view.ViewTreeObserver;
import m.RunnableC0969k;

/* JADX INFO: renamed from: w1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1460d implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f13564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1461e f13565x;

    public ViewTreeObserverOnDrawListenerC1460d(C1461e c1461e, View view) {
        this.f13565x = c1461e;
        this.f13564w = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        C1.n.f().post(new RunnableC0969k(this, 15, this));
    }
}
