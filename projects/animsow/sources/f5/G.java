package f5;

import d.AbstractC0628i;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f8433d = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8436c;

    public G a() {
        this.f8434a = false;
        return this;
    }

    public G b() {
        this.f8436c = 0L;
        return this;
    }

    public long c() {
        if (this.f8434a) {
            return this.f8435b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public G d(long j6) {
        this.f8434a = true;
        this.f8435b = j6;
        return this;
    }

    public boolean e() {
        return this.f8434a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f8434a && this.f8435b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public G g(long j6, TimeUnit timeUnit) {
        AbstractC1305a.o(timeUnit, "unit");
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("timeout < 0: ", j6).toString());
        }
        this.f8436c = timeUnit.toNanos(j6);
        return this;
    }
}
