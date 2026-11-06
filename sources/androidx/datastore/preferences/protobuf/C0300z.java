package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0300z implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0300z f5536a = new C0300z();

    @Override // androidx.datastore.preferences.protobuf.Y
    public final boolean a(Class cls) {
        return C.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public final X b(Class cls) {
        if (!C.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (X) C.g(cls.asSubclass(C.class)).f(3);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }
}
