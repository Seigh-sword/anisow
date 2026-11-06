package com.onesignal;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.onesignal.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0565j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7855a = b(24);

    public static void a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new RunnableC0570l0("decorViewReady:" + runnable, runnable, 7));
    }

    public static int b(int i6) {
        return (int) (i6 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int[] c(Activity activity) {
        float safeInsetRight;
        float safeInsetLeft;
        DisplayCutout cutout;
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
        View viewFindViewById = activity.getWindow().findViewById(R.id.content);
        float top = (r0.top - viewFindViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (viewFindViewById.getBottom() - r0.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            safeInsetRight = 0.0f;
            safeInsetLeft = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight() / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft() / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(safeInsetRight), Math.round(safeInsetLeft)};
    }

    public static int d(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        int height = decorView.getHeight();
        return rootWindowInsets == null ? height : (height - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    public static boolean e(Activity activity) {
        return (activity.getWindow().getDecorView().getApplicationWindowToken() != null) && (activity.getWindow().getDecorView().getRootWindowInsets() != null);
    }

    public static boolean f(WeakReference weakReference) {
        View decorView;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            decorView = window.getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            decorView = null;
        }
        return decorView != null && displayMetrics.heightPixels - rect.bottom > f7855a;
    }
}
