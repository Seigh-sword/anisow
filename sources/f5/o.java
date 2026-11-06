package f5;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends G {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f8474e;

    public o(G g4) {
        AbstractC1305a.o(g4, "delegate");
        this.f8474e = g4;
    }

    @Override // f5.G
    public final G a() {
        return this.f8474e.a();
    }

    @Override // f5.G
    public final G b() {
        return this.f8474e.b();
    }

    @Override // f5.G
    public final long c() {
        return this.f8474e.c();
    }

    @Override // f5.G
    public final G d(long j6) {
        return this.f8474e.d(j6);
    }

    @Override // f5.G
    public final boolean e() {
        return this.f8474e.e();
    }

    @Override // f5.G
    public final void f() throws InterruptedIOException {
        this.f8474e.f();
    }

    @Override // f5.G
    public final G g(long j6, TimeUnit timeUnit) {
        AbstractC1305a.o(timeUnit, "unit");
        return this.f8474e.g(j6, timeUnit);
    }
}
