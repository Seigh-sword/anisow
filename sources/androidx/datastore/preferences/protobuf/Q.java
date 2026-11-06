package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y[] f5406a;

    @Override // androidx.datastore.preferences.protobuf.Y
    public final boolean a(Class cls) {
        for (Y y5 : this.f5406a) {
            if (y5.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public final X b(Class cls) {
        for (Y y5 : this.f5406a) {
            if (y5.a(cls)) {
                return y5.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
