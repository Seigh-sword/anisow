package f5;

import d2.AbstractC0651b;
import java.util.concurrent.locks.ReentrantLock;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f8466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8467x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8468y;

    public k(r rVar, long j6) {
        AbstractC1305a.o(rVar, "fileHandle");
        this.f8466w = rVar;
        this.f8467x = j6;
    }

    @Override // f5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8468y) {
            return;
        }
        this.f8468y = true;
        r rVar = this.f8466w;
        ReentrantLock reentrantLock = rVar.f8488z;
        reentrantLock.lock();
        try {
            int i6 = rVar.f8487y - 1;
            rVar.f8487y = i6;
            if (i6 == 0) {
                if (rVar.f8486x) {
                    synchronized (rVar) {
                        rVar.f8484A.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // f5.C
    public final G d() {
        return G.f8433d;
    }

    @Override // f5.C, java.io.Flushable
    public final void flush() {
        if (!(!this.f8468y)) {
            throw new IllegalStateException("closed".toString());
        }
        r rVar = this.f8466w;
        synchronized (rVar) {
            rVar.f8484A.getFD().sync();
        }
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) {
        AbstractC1305a.o(c0710g, "source");
        if (!(!this.f8468y)) {
            throw new IllegalStateException("closed".toString());
        }
        r rVar = this.f8466w;
        long j7 = this.f8467x;
        rVar.getClass();
        AbstractC0651b.g(c0710g.f8461x, 0L, j6);
        long j8 = j7 + j6;
        while (j7 < j8) {
            z zVar = c0710g.f8460w;
            AbstractC1305a.l(zVar);
            int iMin = (int) Math.min(j8 - j7, zVar.f8502c - zVar.f8501b);
            byte[] bArr = zVar.f8500a;
            int i6 = zVar.f8501b;
            synchronized (rVar) {
                AbstractC1305a.o(bArr, "array");
                rVar.f8484A.seek(j7);
                rVar.f8484A.write(bArr, i6, iMin);
            }
            int i7 = zVar.f8501b + iMin;
            zVar.f8501b = i7;
            long j9 = iMin;
            j7 += j9;
            c0710g.f8461x -= j9;
            if (i7 == zVar.f8502c) {
                c0710g.f8460w = zVar.a();
                A.a(zVar);
            }
        }
        this.f8467x += j6;
    }
}
