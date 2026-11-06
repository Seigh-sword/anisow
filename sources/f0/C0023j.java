package F0;

import t.AbstractC1324g;
import t.C1321d;
import t.C1323f;

/* JADX INFO: renamed from: F0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0023j extends com.bumptech.glide.c {
    @Override // com.bumptech.glide.c
    public void J(T0.f fVar, T0.f fVar2) {
        fVar.f3394b = fVar2;
    }

    @Override // com.bumptech.glide.c
    public void K(C1323f c1323f, C1323f c1323f2) {
        c1323f.f12660b = c1323f2;
    }

    @Override // com.bumptech.glide.c
    public void L(T0.f fVar, Thread thread) {
        fVar.f3393a = thread;
    }

    @Override // com.bumptech.glide.c
    public void M(C1323f c1323f, Thread thread) {
        c1323f.f12659a = thread;
    }

    @Override // com.bumptech.glide.c
    public boolean h(T0.g gVar, T0.c cVar, T0.c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3400x != cVar) {
                    return false;
                }
                gVar.f3400x = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.c
    public boolean i(AbstractC1324g abstractC1324g, C1321d c1321d, C1321d c1321d2) {
        synchronized (abstractC1324g) {
            try {
                if (abstractC1324g.f12666x != c1321d) {
                    return false;
                }
                abstractC1324g.f12666x = c1321d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.c
    public boolean j(T0.g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3399w != obj) {
                    return false;
                }
                gVar.f3399w = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.c
    public boolean k(AbstractC1324g abstractC1324g, Object obj, Object obj2) {
        synchronized (abstractC1324g) {
            try {
                if (abstractC1324g.f12665w != obj) {
                    return false;
                }
                abstractC1324g.f12665w = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.c
    public boolean l(T0.g gVar, T0.f fVar, T0.f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3401y != fVar) {
                    return false;
                }
                gVar.f3401y = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.c
    public boolean m(AbstractC1324g abstractC1324g, C1323f c1323f, C1323f c1323f2) {
        synchronized (abstractC1324g) {
            try {
                if (abstractC1324g.f12667y != c1323f) {
                    return false;
                }
                abstractC1324g.f12667y = c1323f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
