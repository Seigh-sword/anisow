package C1;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ArrayDeque f117y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InputStream f118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public IOException f119x;

    static {
        char[] cArr = n.f134a;
        f117y = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f118w.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f118w.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        this.f118w.mark(i6);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f118w.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f118w.read();
        } catch (IOException e6) {
            this.f119x = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f118w.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j6) throws IOException {
        try {
            return this.f118w.skip(j6);
        } catch (IOException e6) {
            this.f119x = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f118w.read(bArr);
        } catch (IOException e6) {
            this.f119x = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        try {
            return this.f118w.read(bArr, i6, i7);
        } catch (IOException e6) {
            this.f119x = e6;
            throw e6;
        }
    }
}
