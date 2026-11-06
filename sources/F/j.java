package F;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static Drawable a(Resources resources, int i6, Resources.Theme theme) {
        return resources.getDrawable(i6, theme);
    }

    public static Drawable b(Resources resources, int i6, int i7, Resources.Theme theme) {
        return resources.getDrawableForDensity(i6, i7, theme);
    }
}
