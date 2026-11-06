package i;

import N.V;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9346y;

    public /* synthetic */ w(int i6, Object obj) {
        this.f9345x = i6;
        this.f9346y = obj;
    }

    @Override // N.InterfaceC0092f0
    public final void c() {
        int i6 = this.f9345x;
        Object obj = this.f9346y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                RunnableC0819t runnableC0819t = (RunnableC0819t) obj;
                runnableC0819t.f9342x.f9182R.setAlpha(1.0f);
                H h4 = runnableC0819t.f9342x;
                h4.f9185U.d(null);
                h4.f9185U = null;
                break;
            case 1:
                H h6 = (H) obj;
                h6.f9182R.setAlpha(1.0f);
                h6.f9185U.d(null);
                h6.f9185U = null;
                break;
            default:
                x xVar = (x) obj;
                xVar.f9348b.f9182R.setVisibility(8);
                H h7 = xVar.f9348b;
                PopupWindow popupWindow = h7.f9183S;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (h7.f9182R.getParent() instanceof View) {
                    View view = (View) h7.f9182R.getParent();
                    WeakHashMap weakHashMap = V.f1964a;
                    N.G.c(view);
                }
                h7.f9182R.e();
                h7.f9185U.d(null);
                h7.f9185U = null;
                ViewGroup viewGroup = h7.f9188X;
                WeakHashMap weakHashMap2 = V.f1964a;
                N.G.c(viewGroup);
                break;
        }
    }

    @Override // com.bumptech.glide.c, N.InterfaceC0092f0
    public final void f() {
        int i6 = this.f9345x;
        Object obj = this.f9346y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((RunnableC0819t) obj).f9342x.f9182R.setVisibility(0);
                break;
            case 1:
                H h4 = (H) obj;
                h4.f9182R.setVisibility(0);
                if (h4.f9182R.getParent() instanceof View) {
                    View view = (View) h4.f9182R.getParent();
                    WeakHashMap weakHashMap = V.f1964a;
                    N.G.c(view);
                }
                break;
        }
    }
}
