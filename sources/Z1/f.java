package z1;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Integer f14078d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14080b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B.f f14081c;

    public f(View view) {
        this.f14079a = view;
    }

    public final int a(int i6, int i7, int i8) {
        int i9 = i7 - i8;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i6 - i8;
        if (i10 > 0) {
            return i10;
        }
        View view = this.f14079a;
        if (view.isLayoutRequested() || i7 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f14078d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC1332d.l(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f14078d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f14078d.intValue();
    }
}
