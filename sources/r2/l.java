package R2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f2991B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AccessibilityManager f2992A;

    public l(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f2992A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l f(ConstraintLayout constraintLayout, CharSequence charSequence) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (!(constraintLayout instanceof CoordinatorLayout)) {
            if (constraintLayout instanceof FrameLayout) {
                if (constraintLayout.getId() == 16908290) {
                    break;
                }
                viewGroup2 = (ViewGroup) constraintLayout;
            }
            if (constraintLayout != 0) {
                Object parent = constraintLayout.getParent();
                constraintLayout = parent instanceof View ? (View) parent : 0;
            }
            if (constraintLayout == 0) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) constraintLayout;
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f2991B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        l lVar = new l(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) lVar.f2979i.getChildAt(0)).getMessageView().setText(charSequence);
        lVar.f2981k = -1;
        return lVar;
    }

    public final void g() {
        n nVarB = n.b();
        int recommendedTimeoutMillis = this.f2981k;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.f2992A.getRecommendedTimeoutMillis(recommendedTimeoutMillis, 3);
        }
        g gVar = this.f2990t;
        synchronized (nVarB.f2997a) {
            try {
                if (nVarB.c(gVar)) {
                    m mVar = nVarB.f2999c;
                    mVar.f2994b = recommendedTimeoutMillis;
                    nVarB.f2998b.removeCallbacksAndMessages(mVar);
                    nVarB.f(nVarB.f2999c);
                } else {
                    m mVar2 = nVarB.f3000d;
                    if (mVar2 == null || gVar == null || mVar2.f2993a.get() != gVar) {
                        nVarB.f3000d = new m(recommendedTimeoutMillis, gVar);
                    } else {
                        nVarB.f3000d.f2994b = recommendedTimeoutMillis;
                    }
                    m mVar3 = nVarB.f2999c;
                    if (mVar3 == null || !nVarB.a(mVar3, 4)) {
                        nVarB.f2999c = null;
                        nVarB.g();
                    }
                }
            } finally {
            }
        }
    }
}
