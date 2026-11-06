package N;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f2032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f2033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f2034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2035d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2032a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2033b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2034c = declaredField3;
            declaredField3.setAccessible(true);
            f2035d = true;
        } catch (ReflectiveOperationException e6) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e6.getMessage(), e6);
        }
    }
}
