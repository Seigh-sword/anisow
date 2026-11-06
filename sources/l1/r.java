package l1;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y1.g f9972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f9973y;

    public /* synthetic */ r(u uVar, y1.g gVar, int i6) {
        this.f9971w = i6;
        this.f9973y = uVar;
        this.f9972x = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0930d c0930d;
        switch (this.f9971w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                y1.h hVar = (y1.h) this.f9972x;
                hVar.f13755b.a();
                synchronized (hVar.f13756c) {
                    synchronized (this.f9973y) {
                        try {
                            t tVar = this.f9973y.f9999w;
                            y1.g gVar = this.f9972x;
                            tVar.getClass();
                            if (tVar.f9976w.contains(new s(gVar, C1.f.f121b))) {
                                u uVar = this.f9973y;
                                y1.g gVar2 = this.f9972x;
                                uVar.getClass();
                                try {
                                    ((y1.h) gVar2).h(uVar.f9993P, 5);
                                } finally {
                                }
                            }
                            this.f9973y.c();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                y1.h hVar2 = (y1.h) this.f9972x;
                hVar2.f13755b.a();
                synchronized (hVar2.f13756c) {
                    synchronized (this.f9973y) {
                        try {
                            t tVar2 = this.f9973y.f9999w;
                            y1.g gVar3 = this.f9972x;
                            tVar2.getClass();
                            if (tVar2.f9976w.contains(new s(gVar3, C1.f.f121b))) {
                                this.f9973y.f9995R.b();
                                u uVar2 = this.f9973y;
                                y1.g gVar4 = this.f9972x;
                                uVar2.getClass();
                                try {
                                    ((y1.h) gVar4).k(uVar2.f9995R, uVar2.f9991N, uVar2.f9998U);
                                    this.f9973y.h(this.f9972x);
                                } finally {
                                }
                            }
                            this.f9973y.c();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
