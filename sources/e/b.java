package E;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(Context context, int i6) {
        return context.getColor(i6);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
