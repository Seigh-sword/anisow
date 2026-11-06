package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC0912e;

/* JADX INFO: loaded from: classes.dex */
public final class S implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f10190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ T f10191x;

    public S(T t5, ViewTreeObserverOnGlobalLayoutListenerC0912e viewTreeObserverOnGlobalLayoutListenerC0912e) {
        this.f10191x = t5;
        this.f10190w = viewTreeObserverOnGlobalLayoutListenerC0912e;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f10191x.f10196c0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f10190w);
        }
    }
}
