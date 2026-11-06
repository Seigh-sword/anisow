package q2;

import java.util.concurrent.Executor;
import m2.RunnableC1028c1;

/* JADX INFO: loaded from: classes.dex */
public final class p implements q, f, InterfaceC1262e, InterfaceC1260c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f12370x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f12371y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f12372z;

    public p(i.r rVar, InterfaceC1260c interfaceC1260c) {
        this.f12369w = 0;
        this.f12371y = new Object();
        this.f12370x = rVar;
        this.f12372z = interfaceC1260c;
    }

    @Override // q2.q
    public final void a(i iVar) {
        switch (this.f12369w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (((s) iVar).f12377d) {
                    synchronized (this.f12371y) {
                        try {
                            if (((InterfaceC1260c) this.f12372z) != null) {
                                this.f12370x.execute(new o(this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f12371y) {
                    try {
                        if (((InterfaceC1261d) this.f12372z) == null) {
                            return;
                        }
                        this.f12370x.execute(new RunnableC1028c1(this, 6, iVar));
                        return;
                    } finally {
                    }
                }
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (iVar.f() || ((s) iVar).f12377d) {
                    return;
                }
                synchronized (this.f12371y) {
                    try {
                        if (((InterfaceC1262e) this.f12372z) != null) {
                            this.f12370x.execute(new RunnableC1028c1(this, 7, iVar));
                        }
                    } finally {
                    }
                }
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (iVar.f()) {
                    synchronized (this.f12371y) {
                        try {
                            if (((f) this.f12372z) != null) {
                                this.f12370x.execute(new RunnableC1028c1(this, 8, iVar));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f12370x.execute(new RunnableC1028c1(this, 9, iVar));
                return;
        }
    }

    @Override // q2.InterfaceC1260c
    public final void b() {
        ((s) this.f12372z).m();
    }

    @Override // q2.f
    public final void c(Object obj) {
        ((s) this.f12372z).l(obj);
    }

    @Override // q2.InterfaceC1262e
    public final void g(Exception exc) {
        ((s) this.f12372z).k(exc);
    }

    public p(Executor executor, InterfaceC1261d interfaceC1261d) {
        this.f12369w = 1;
        this.f12371y = new Object();
        this.f12370x = executor;
        this.f12372z = interfaceC1261d;
    }

    public p(Executor executor, InterfaceC1262e interfaceC1262e) {
        this.f12369w = 2;
        this.f12371y = new Object();
        this.f12370x = executor;
        this.f12372z = interfaceC1262e;
    }

    public p(Executor executor, f fVar) {
        this.f12369w = 3;
        this.f12371y = new Object();
        this.f12370x = executor;
        this.f12372z = fVar;
    }

    public p(Executor executor, h hVar, s sVar) {
        this.f12369w = 4;
        this.f12370x = executor;
        this.f12371y = hVar;
        this.f12372z = sVar;
    }
}
