package S0;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3074a = I0.o.y("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z5) {
        String str = f3074a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z5 ? 1 : 2, 1);
            I0.o.w().u(str, cls.getName() + " " + (z5 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e6) {
            I0.o.w().u(str, cls.getName() + " could not be " + (z5 ? "enabled" : "disabled"), e6);
        }
    }
}
