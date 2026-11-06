package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0271d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0269c0 f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0269c0 f5440b;

    static {
        C0269c0 c0269c0;
        try {
            c0269c0 = (C0269c0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c0269c0 = null;
        }
        f5439a = c0269c0;
        f5440b = new C0269c0();
    }
}
