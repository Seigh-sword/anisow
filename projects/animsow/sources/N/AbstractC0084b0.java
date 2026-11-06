package N;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: N.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0084b0 {
    public static boolean a(ViewParent viewParent, View view, float f6, float f7, boolean z5) {
        return viewParent.onNestedFling(view, f6, f7, z5);
    }

    public static boolean b(ViewParent viewParent, View view, float f6, float f7) {
        return viewParent.onNestedPreFling(view, f6, f7);
    }

    public static void c(ViewParent viewParent, View view, int i6, int i7, int[] iArr) {
        viewParent.onNestedPreScroll(view, i6, i7, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i6, int i7, int i8, int i9) {
        viewParent.onNestedScroll(view, i6, i7, i8, i9);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i6) {
        viewParent.onNestedScrollAccepted(view, view2, i6);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i6) {
        return viewParent.onStartNestedScroll(view, view2, i6);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
