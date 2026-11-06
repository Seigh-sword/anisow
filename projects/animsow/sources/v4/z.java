package V4;

import a3.C0261b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class z extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ A f3985A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0261b f3986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile AtomicInteger f3987z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a6, C0261b c0261b) {
        super("OkHttp %s", new Object[]{a6.f3749y.f3751a.k()});
        this.f3985A = a6;
        this.f3987z = new AtomicInteger(0);
        this.f3986y = c0261b;
    }

    @Override // S0.c
    public final void b() {
        C0261b c0261b = this.f3986y;
        A a6 = this.f3985A;
        Y4.i iVar = a6.f3748x;
        x xVar = a6.f3747w;
        iVar.f4891e.h();
        boolean z5 = false;
        try {
            try {
                try {
                    c0261b.o(a6.a());
                } catch (IOException e6) {
                    e = e6;
                    z5 = true;
                    if (z5) {
                        c5.i.f6262a.m(4, "Callback failure for " + a6.d(), e);
                    } else {
                        c0261b.c(e);
                    }
                } catch (Throwable th) {
                    th = th;
                    z5 = true;
                    a6.f3748x.a();
                    if (!z5) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.addSuppressed(th);
                        c0261b.c(iOException);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                xVar.f3973w.b(this);
                throw th2;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (Throwable th3) {
            th = th3;
        }
        xVar.f3973w.b(this);
    }
}
