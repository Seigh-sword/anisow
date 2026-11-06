package d3;

/* JADX INFO: loaded from: classes.dex */
public final class n implements D3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8210c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f8211a = f8210c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile D3.c f8212b;

    public n(D3.c cVar) {
        this.f8212b = cVar;
    }

    @Override // D3.c
    public final Object get() {
        Object obj = this.f8211a;
        Object obj2 = f8210c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f8211a;
                    if (obj == obj2) {
                        obj = this.f8212b.get();
                        this.f8211a = obj;
                        this.f8212b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
