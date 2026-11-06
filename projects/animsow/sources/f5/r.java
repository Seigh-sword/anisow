package f5;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RandomAccessFile f8484A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8487y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ReentrantLock f8488z = new ReentrantLock();

    public r(boolean z5, RandomAccessFile randomAccessFile) {
        this.f8485w = z5;
        this.f8484A = randomAccessFile;
    }

    public static k c(r rVar) {
        if (!rVar.f8485w) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = rVar.f8488z;
        reentrantLock.lock();
        try {
            if (!(!rVar.f8486x)) {
                throw new IllegalStateException("closed".toString());
            }
            rVar.f8487y++;
            reentrantLock.unlock();
            return new k(rVar, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void close() {
        ReentrantLock reentrantLock = this.f8488z;
        reentrantLock.lock();
        try {
            if (this.f8486x) {
                return;
            }
            this.f8486x = true;
            if (this.f8487y != 0) {
                return;
            }
            synchronized (this) {
                this.f8484A.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f8485w) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.f8488z;
        reentrantLock.lock();
        try {
            if (!(!this.f8486x)) {
                throw new IllegalStateException("closed".toString());
            }
            synchronized (this) {
                this.f8484A.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long g() {
        long length;
        ReentrantLock reentrantLock = this.f8488z;
        reentrantLock.lock();
        try {
            if (!(!this.f8486x)) {
                throw new IllegalStateException("closed".toString());
            }
            synchronized (this) {
                length = this.f8484A.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final l h(long j6) {
        ReentrantLock reentrantLock = this.f8488z;
        reentrantLock.lock();
        try {
            if (!(!this.f8486x)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f8487y++;
            reentrantLock.unlock();
            return new l(this, j6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
