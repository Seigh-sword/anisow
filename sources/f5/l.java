package f5;

import d.AbstractC0628i;
import java.util.concurrent.locks.ReentrantLock;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements E {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f8469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8471y;

    public l(r rVar, long j6) {
        AbstractC1305a.o(rVar, "fileHandle");
        this.f8469w = rVar;
        this.f8470x = j6;
    }

    @Override // f5.E
    public final long G(C0710g c0710g, long j6) {
        long j7;
        long j8;
        long j9;
        int i6;
        AbstractC1305a.o(c0710g, "sink");
        int i7 = 1;
        if (!(!this.f8471y)) {
            throw new IllegalStateException("closed".toString());
        }
        r rVar = this.f8469w;
        long j10 = this.f8470x;
        rVar.getClass();
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6).toString());
        }
        long j11 = j6 + j10;
        long j12 = j10;
        while (true) {
            if (j12 >= j11) {
                j7 = j10;
                break;
            }
            z zVarT = c0710g.T(i7);
            byte[] bArr = zVarT.f8500a;
            int i8 = zVarT.f8502c;
            j7 = j10;
            int iMin = (int) Math.min(j11 - j12, 8192 - i8);
            synchronized (rVar) {
                AbstractC1305a.o(bArr, "array");
                rVar.f8484A.seek(j12);
                i6 = 0;
                while (true) {
                    if (i6 >= iMin) {
                        break;
                    }
                    int i9 = rVar.f8484A.read(bArr, i8, iMin - i6);
                    if (i9 != -1) {
                        i6 += i9;
                    } else if (i6 == 0) {
                        i6 = -1;
                    }
                }
            }
            if (i6 == -1) {
                if (zVarT.f8501b == zVarT.f8502c) {
                    c0710g.f8460w = zVarT.a();
                    A.a(zVarT);
                }
                if (j7 == j12) {
                    j9 = -1;
                    j8 = -1;
                }
            } else {
                zVarT.f8502c += i6;
                long j13 = i6;
                j12 += j13;
                c0710g.f8461x += j13;
                j10 = j7;
                i7 = 1;
            }
        }
        j8 = j12 - j7;
        j9 = -1;
        if (j8 != j9) {
            this.f8470x += j8;
        }
        return j8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8471y) {
            return;
        }
        this.f8471y = true;
        r rVar = this.f8469w;
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

    @Override // f5.E
    public final G d() {
        return G.f8433d;
    }
}
