package F0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: F0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0019f extends w {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String[] f519a0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final C0015b f520b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final C0015b f521c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final C0015b f522d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final C0015b f523e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final C0015b f524f0;

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        f520b0 = new C0015b(cls, str, 0);
        String str2 = "bottomRight";
        f521c0 = new C0015b(cls, str2, 1);
        f522d0 = new C0015b(cls, str2, 2);
        f523e0 = new C0015b(cls, str, 3);
        f524f0 = new C0015b(cls, "position", 4);
    }

    public static void S(F f6) {
        View view = f6.f484b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = f6.f483a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", f6.f484b.getParent());
    }

    @Override // F0.w
    public final void f(F f6) {
        S(f6);
    }

    @Override // F0.w
    public final void k(F f6) {
        S(f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    @Override // F0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator o(android.view.ViewGroup r19, F0.F r20, F0.F r21) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.C0019f.o(android.view.ViewGroup, F0.F, F0.F):android.animation.Animator");
    }

    @Override // F0.w
    public final String[] u() {
        return f519a0;
    }
}
