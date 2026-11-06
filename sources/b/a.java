package B;

import android.graphics.drawable.ColorStateListDrawable;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable e(Object obj) {
        return (ColorStateListDrawable) obj;
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof ColorStateListDrawable;
    }
}
