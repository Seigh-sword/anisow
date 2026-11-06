package D4;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f378a;

    static {
        t tVar = null;
        try {
            tVar = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (tVar == null) {
            tVar = new t();
        }
        f378a = tVar;
    }

    public static d a(Class cls) {
        f378a.getClass();
        return new d(cls);
    }
}
