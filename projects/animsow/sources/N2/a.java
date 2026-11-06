package N2;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2112a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2113b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f2114c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2115d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f2116e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f2117f = a.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return G.a.d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f2116e, 0)) != 0) {
            Log.w(f2117f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 : iArr) {
            if (i6 == 16842910) {
                z5 = true;
            } else if (i6 == 16842908 || i6 == 16842919 || i6 == 16843623) {
                z6 = true;
            }
        }
        return z5 && z6;
    }
}
