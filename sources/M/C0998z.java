package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: m.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0998z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f10427b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0998z f10428c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public R0 f10429a;

    public static synchronized C0998z a() {
        try {
            if (f10428c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10428c;
    }

    public static synchronized void c() {
        if (f10428c == null) {
            C0998z c0998z = new C0998z();
            f10428c = c0998z;
            c0998z.f10429a = R0.c();
            R0 r02 = f10428c.f10429a;
            C0996y c0996y = new C0996y();
            synchronized (r02) {
                r02.f10189e = c0996y;
            }
        }
    }

    public static void d(Drawable drawable, Z0 z02, int[] iArr) {
        PorterDuff.Mode mode = R0.f10182f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = z02.f10236b;
        if (!z5 && !z02.f10235a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterG = null;
        ColorStateList colorStateList = z5 ? (ColorStateList) z02.f10237c : null;
        PorterDuff.Mode mode2 = z02.f10235a ? (PorterDuff.Mode) z02.f10238d : R0.f10182f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterG = R0.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterG);
    }

    public final synchronized Drawable b(Context context, int i6) {
        return this.f10429a.e(context, i6);
    }
}
