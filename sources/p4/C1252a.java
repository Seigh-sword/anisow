package p4;

/* JADX INFO: renamed from: p4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1252a implements InterfaceC1254c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12325c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1254c f12326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f12327b;

    @Override // q4.InterfaceC1266a
    public final Object get() {
        Object obj = this.f12327b;
        Object obj2 = f12325c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f12327b;
                    if (obj == obj2) {
                        obj = this.f12326a.get();
                        Object obj3 = this.f12327b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f12327b = obj;
                        this.f12326a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
