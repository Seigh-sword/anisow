package l;

import N.V;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0913f implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9704x;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0913f(int i6, Object obj) {
        this.f9703w = i6;
        this.f9704x = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f9703w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
            case 1:
                break;
            default:
                S2.m mVar = (S2.m) this.f9704x;
                int i6 = S2.m.f3146S;
                if (mVar.f3163Q != null && (accessibilityManager = mVar.f3162P) != null) {
                    WeakHashMap weakHashMap = V.f1964a;
                    if (mVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new O.b(mVar.f3163Q));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i6 = this.f9703w;
        Object obj = this.f9704x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ViewOnKeyListenerC0916i viewOnKeyListenerC0916i = (ViewOnKeyListenerC0916i) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0916i.f9733U;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0916i.f9733U = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0916i.f9733U.removeGlobalOnLayoutListener(viewOnKeyListenerC0916i.f9718F);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                ViewOnKeyListenerC0906F viewOnKeyListenerC0906F = (ViewOnKeyListenerC0906F) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0906F.f9670L;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0906F.f9670L = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0906F.f9670L.removeGlobalOnLayoutListener(viewOnKeyListenerC0906F.f9664F);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                S2.m mVar = (S2.m) obj;
                int i7 = S2.m.f3146S;
                J3.G g4 = mVar.f3163Q;
                if (g4 != null && (accessibilityManager = mVar.f3162P) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new O.b(g4));
                    break;
                }
                break;
        }
    }
}
