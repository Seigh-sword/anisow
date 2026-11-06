package n1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: n1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11691e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f11693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S0.f f11694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11695d;

    static {
        f11691e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C1151g(Context context) {
        this.f11695d = f11691e;
        this.f11692a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f11693b = activityManager;
        this.f11694c = new S0.f(22, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f11695d = 0.0f;
    }
}
