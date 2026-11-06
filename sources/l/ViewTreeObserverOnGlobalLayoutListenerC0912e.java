package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.P0;
import m.T;
import m.W;

/* JADX INFO: renamed from: l.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0912e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9702x;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0912e(int i6, Object obj) {
        this.f9701w = i6;
        this.f9702x = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i6 = this.f9701w;
        Object obj = this.f9702x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ViewOnKeyListenerC0916i viewOnKeyListenerC0916i = (ViewOnKeyListenerC0916i) obj;
                if (viewOnKeyListenerC0916i.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0916i.f9717E;
                    if (arrayList.size() > 0 && !((C0915h) arrayList.get(0)).f9710a.f10157U) {
                        View view = viewOnKeyListenerC0916i.f9724L;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0915h) it.next()).f9710a.f();
                            }
                        } else {
                            viewOnKeyListenerC0916i.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0906F viewOnKeyListenerC0906F = (ViewOnKeyListenerC0906F) obj;
                if (viewOnKeyListenerC0906F.a()) {
                    P0 p02 = viewOnKeyListenerC0906F.f9663E;
                    if (!p02.f10157U) {
                        View view2 = viewOnKeyListenerC0906F.f9668J;
                        if (view2 != null && view2.isShown()) {
                            p02.f();
                        } else {
                            viewOnKeyListenerC0906F.dismiss();
                        }
                    }
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                W w5 = (W) obj;
                if (!w5.getInternalPopup().a()) {
                    w5.f10211B.d(w5.getTextDirection(), w5.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = w5.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                T t5 = (T) obj;
                W w6 = t5.f10196c0;
                if (w6.isAttachedToWindow() && w6.getGlobalVisibleRect(t5.f10194a0)) {
                    t5.s();
                    t5.f();
                } else {
                    t5.dismiss();
                }
                break;
        }
    }
}
