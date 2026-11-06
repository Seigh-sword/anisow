package N;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: renamed from: N.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111w {
    public static PointerIcon a(Bitmap bitmap, float f6, float f7) {
        return PointerIcon.create(bitmap, f6, f7);
    }

    public static PointerIcon b(Context context, int i6) {
        return PointerIcon.getSystemIcon(context, i6);
    }

    public static PointerIcon c(Resources resources, int i6) {
        return PointerIcon.load(resources, i6);
    }
}
