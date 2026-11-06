package q2;

import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f12351a = new s();

    public j() {
    }

    public final void a(Object obj) {
        this.f12351a.l(obj);
    }

    public final boolean b(Exception exc) {
        s sVar = this.f12351a;
        sVar.getClass();
        AbstractC1332d.n(exc, "Exception must not be null");
        synchronized (sVar.f12374a) {
            try {
                if (sVar.f12376c) {
                    return false;
                }
                sVar.f12376c = true;
                sVar.f12379f = exc;
                sVar.f12375b.l(sVar);
                return true;
            } finally {
            }
        }
    }

    public final void c(Object obj) {
        this.f12351a.n(obj);
    }

    public j(l lVar) {
        l lVar2 = new l(this);
        lVar.getClass();
        ((s) lVar.f12355x).b(k.f12352a, new l(lVar2));
    }
}
