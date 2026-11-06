package F0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static int a(ViewGroup viewGroup, int i6) {
        return viewGroup.getChildDrawingOrder(i6);
    }

    public static void b(ViewGroup viewGroup, boolean z5) {
        viewGroup.suppressLayout(z5);
    }
}
