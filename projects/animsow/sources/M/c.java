package M;

import s4.AbstractC1305a;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f1751z;

    public c(int i6) {
        super(i6, 1);
        this.f1751z = new Object();
    }

    @Override // u.e, M.b
    public final boolean d(Object obj) {
        boolean zD;
        AbstractC1305a.o(obj, "instance");
        synchronized (this.f1751z) {
            zD = super.d(obj);
        }
        return zD;
    }

    @Override // u.e, M.b
    public final Object h() {
        Object objH;
        synchronized (this.f1751z) {
            objH = super.h();
        }
        return objH;
    }
}
