package B;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import z1.InterfaceC1529d;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f53w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f54x;

    public f(CoordinatorLayout coordinatorLayout) {
        this.f54x = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i6 = this.f53w;
        Object obj = this.f54x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((CoordinatorLayout) obj).p(0);
                break;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                z1.f fVar = (z1.f) ((WeakReference) obj).get();
                if (fVar != null) {
                    ArrayList arrayList = fVar.f14080b;
                    if (!arrayList.isEmpty()) {
                        View view = fVar.f14079a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iA = fVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = fVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((y1.h) ((InterfaceC1529d) it.next())).n(iA, iA2);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(fVar.f14081c);
                            }
                            fVar.f14081c = null;
                            arrayList.clear();
                        }
                    }
                }
                break;
        }
        return true;
    }

    public f(z1.f fVar) {
        this.f54x = new WeakReference(fVar);
    }
}
