package T0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = g.f3397C;
        }
        if (!g.f3396B.j(this, null, obj)) {
            return false;
        }
        g.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        th.getClass();
        if (!g.f3396B.j(this, null, new b(th))) {
            return false;
        }
        g.c(this);
        return true;
    }

    public final boolean l(X2.a aVar) {
        b bVar;
        aVar.getClass();
        Object obj = this.f3399w;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!g.f3396B.j(this, null, g.f(aVar))) {
                    return false;
                }
                g.c(this);
            } else {
                e eVar = new e(this, aVar);
                if (g.f3396B.j(this, null, eVar)) {
                    try {
                        aVar.a(eVar, h.f3402w);
                    } catch (Throwable th) {
                        try {
                            bVar = new b(th);
                        } catch (Throwable unused) {
                            bVar = b.f3379b;
                        }
                        g.f3396B.j(this, eVar, bVar);
                    }
                } else {
                    obj = this.f3399w;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        aVar.cancel(((a) obj).f3377a);
        return false;
    }
}
