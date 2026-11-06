package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f5414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f5415b;

    static {
        V v5;
        try {
            v5 = (V) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            v5 = null;
        }
        f5414a = v5;
        f5415b = new V();
    }
}
