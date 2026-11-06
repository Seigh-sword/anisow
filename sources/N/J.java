package N;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static C0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0 c0G = C0.g(null, rootWindowInsets);
        A0 a02 = c0G.f1943a;
        a02.p(c0G);
        a02.d(view.getRootView());
        return c0G;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i6) {
        view.setScrollIndicators(i6);
    }

    public static void d(View view, int i6, int i7) {
        view.setScrollIndicators(i6, i7);
    }
}
