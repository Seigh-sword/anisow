package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0270d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f5438b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f5437a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f5438b = cls2 != null;
    }

    public static boolean a() {
        return (f5437a == null || f5438b) ? false : true;
    }
}
