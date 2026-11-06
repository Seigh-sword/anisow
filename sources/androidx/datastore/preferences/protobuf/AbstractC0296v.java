package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0296v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0295u f5522a = new C0295u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0295u f5523b;

    static {
        C0295u c0295u;
        try {
            c0295u = (C0295u) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c0295u = null;
        }
        f5523b = c0295u;
    }
}
