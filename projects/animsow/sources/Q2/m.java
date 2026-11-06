package q2;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f, InterfaceC1262e, InterfaceC1260c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12356A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12357B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Exception f12358C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12359D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f12360w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s f12362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12363z;

    public m(int i6, s sVar) {
        this.f12361x = i6;
        this.f12362y = sVar;
    }

    public final void a() {
        int i6 = this.f12363z + this.f12356A + this.f12357B;
        int i7 = this.f12361x;
        if (i6 == i7) {
            Exception exc = this.f12358C;
            s sVar = this.f12362y;
            if (exc == null) {
                if (this.f12359D) {
                    sVar.m();
                    return;
                } else {
                    sVar.l(null);
                    return;
                }
            }
            sVar.k(new ExecutionException(this.f12356A + " out of " + i7 + " underlying tasks failed", this.f12358C));
        }
    }

    @Override // q2.InterfaceC1260c
    public final void b() {
        synchronized (this.f12360w) {
            this.f12357B++;
            this.f12359D = true;
            a();
        }
    }

    @Override // q2.f
    public final void c(Object obj) {
        synchronized (this.f12360w) {
            this.f12363z++;
            a();
        }
    }

    @Override // q2.InterfaceC1262e
    public final void g(Exception exc) {
        synchronized (this.f12360w) {
            this.f12356A++;
            this.f12358C = exc;
            a();
        }
    }
}
