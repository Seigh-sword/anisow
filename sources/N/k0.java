package N;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.measurement.C0396c2;
import com.xo.anilab.R;
import j0.C0839a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2014e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0839a f2015f = new C0839a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2016g = new DecelerateInterpolator();

    public static void e(View view) {
        y2.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.f13816b.setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                e(viewGroup.getChildAt(i6));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z5) {
        y2.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.f13815a = windowInsets;
            if (!z5) {
                View view2 = jVarJ.f13816b;
                int[] iArr = jVarJ.f13819e;
                view2.getLocationOnScreen(iArr);
                z5 = true;
                jVarJ.f13817c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                f(viewGroup.getChildAt(i6), windowInsets, z5);
            }
        }
    }

    public static void g(View view, C0 c02, List list) {
        y2.j jVarJ = j(view);
        if (jVarJ != null) {
            jVarJ.a(c02, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                g(viewGroup.getChildAt(i6), c02, list);
            }
        }
    }

    public static void h(View view, C0396c2 c0396c2) {
        y2.j jVarJ = j(view);
        if (jVarJ != null) {
            View view2 = jVarJ.f13816b;
            int[] iArr = jVarJ.f13819e;
            view2.getLocationOnScreen(iArr);
            int i6 = jVarJ.f13817c - iArr[1];
            jVarJ.f13818d = i6;
            view2.setTranslationY(i6);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                h(viewGroup.getChildAt(i7), c0396c2);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static y2.j j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof j0) {
            return ((j0) tag).f2011a;
        }
        return null;
    }
}
