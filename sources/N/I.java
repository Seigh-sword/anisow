package N;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static C0 b(View view, C0 c02, Rect rect) {
        WindowInsets windowInsetsF = c02.f();
        if (windowInsetsF != null) {
            return C0.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return c02;
    }

    public static boolean c(View view, float f6, float f7, boolean z5) {
        return view.dispatchNestedFling(f6, f7, z5);
    }

    public static boolean d(View view, float f6, float f7) {
        return view.dispatchNestedPreFling(f6, f7);
    }

    public static boolean e(View view, int i6, int i7, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i6, i7, iArr, iArr2);
    }

    public static boolean f(View view, int i6, int i7, int i8, int i9, int[] iArr) {
        return view.dispatchNestedScroll(i6, i7, i8, i9, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static C0 j(View view) {
        if (!p0.f2035d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = p0.f2032a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) p0.f2033b.get(obj);
            Rect rect2 = (Rect) p0.f2034c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            L3.c cVar = new L3.c(11, 0);
            ((t0) cVar.f1734x).e(G.c.b(rect.left, rect.top, rect.right, rect.bottom));
            ((t0) cVar.f1734x).g(G.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0 c0B = ((t0) cVar.f1734x).b();
            c0B.f1943a.p(c0B);
            c0B.f1943a.d(view.getRootView());
            return c0B;
        } catch (IllegalAccessException e6) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e6.getMessage(), e6);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f6) {
        view.setElevation(f6);
    }

    public static void t(View view, boolean z5) {
        view.setNestedScrollingEnabled(z5);
    }

    public static void u(View view, InterfaceC0107s interfaceC0107s) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0107s);
        }
        if (interfaceC0107s == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new H(view, interfaceC0107s));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f6) {
        view.setTranslationZ(f6);
    }

    public static void x(View view, float f6) {
        view.setZ(f6);
    }

    public static boolean y(View view, int i6) {
        return view.startNestedScroll(i6);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
