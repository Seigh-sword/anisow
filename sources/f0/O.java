package F0;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class O extends M {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f491q = true;

    @Override // com.bumptech.glide.d
    public void y(View view, int i6) {
        if (Build.VERSION.SDK_INT == 28) {
            super.y(view, i6);
        } else if (f491q) {
            try {
                N.a(view, i6);
            } catch (NoSuchMethodError unused) {
                f491q = false;
            }
        }
    }
}
