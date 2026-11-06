package F0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0015b f487b;

    static {
        f486a = Build.VERSION.SDK_INT >= 29 ? new P() : new O();
        f487b = new C0015b(Float.class, "translationAlpha", 5);
        new C0015b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i6, int i7, int i8, int i9) {
        f486a.C(view, i6, i7, i8, i9);
    }

    public static void b(View view, int i6) {
        f486a.y(view, i6);
    }
}
