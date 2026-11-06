package J1;

import q4.InterfaceC1266a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC1266a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1243c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1266a f1244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f1245b;

    public static InterfaceC1266a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f1245b = f1243c;
        aVar.f1244a = bVar;
        return aVar;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        Object obj = this.f1245b;
        Object obj2 = f1243c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1245b;
                    if (obj == obj2) {
                        obj = this.f1244a.get();
                        Object obj3 = this.f1245b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f1245b = obj;
                        this.f1244a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
