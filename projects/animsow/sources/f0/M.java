package F0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends K {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f490p = true;

    public void C(View view, int i6, int i7, int i8, int i9) {
        if (f490p) {
            try {
                L.a(view, i6, i7, i8, i9);
            } catch (NoSuchMethodError unused) {
                f490p = false;
            }
        }
    }
}
