package C1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f134a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f135b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Handler f136c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i6 = m.f133a[config.ordinal()];
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2 || i6 == 3) {
            return 2;
        }
        return i6 != 4 ? 4 : 8;
    }

    public static ArrayList e(Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f136c == null) {
            synchronized (n.class) {
                try {
                    if (f136c == null) {
                        f136c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f136c;
    }

    public static int g(int i6, int i7) {
        return (i7 * 31) + i6;
    }

    public static int h(int i6, Object obj) {
        return g(obj == null ? 0 : obj.hashCode(), i6);
    }

    public static int i(int i6, boolean z5) {
        return g(z5 ? 1 : 0, i6);
    }

    public static boolean j(int i6, int i7) {
        return (i6 > 0 || i6 == Integer.MIN_VALUE) && (i7 > 0 || i7 == Integer.MIN_VALUE);
    }
}
