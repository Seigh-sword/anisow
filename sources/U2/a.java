package U2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import k.C0882e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3635a = {R.attr.theme, com.xo.anilab.R.attr.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3636b = {com.xo.anilab.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i6, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3636b, i6, i7);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z5 = (context instanceof C0882e) && ((C0882e) context).f9569a == resourceId;
        if (resourceId == 0 || z5) {
            return context;
        }
        C0882e c0882e = new C0882e(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3635a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0882e.getTheme().applyStyle(resourceId2, true);
        }
        return c0882e;
    }
}
