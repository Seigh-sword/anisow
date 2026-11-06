package F0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f488n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f489o = true;

    public void A(View view, Matrix matrix) {
        if (f488n) {
            try {
                J.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f488n = false;
            }
        }
    }

    public void B(View view, Matrix matrix) {
        if (f489o) {
            try {
                J.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f489o = false;
            }
        }
    }
}
