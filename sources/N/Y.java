package N;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static int a(ViewConfiguration viewConfiguration, int i6, int i7, int i8) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i6, i7, i8);
    }

    public static int b(ViewConfiguration viewConfiguration, int i6, int i7, int i8) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i6, i7, i8);
    }
}
