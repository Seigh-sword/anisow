package J3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: J3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0048d extends FilterInputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1397x;

    public C0048d(InputStream inputStream) {
        super(inputStream);
        this.f1397x = -1L;
        this.f1396w = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f1396w);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        ((FilterInputStream) this).in.mark(i6);
        this.f1397x = this.f1396w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f1396w == 0) {
            return -1;
        }
        int i6 = ((FilterInputStream) this).in.read();
        if (i6 != -1) {
            this.f1396w--;
        }
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f1397x == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f1396w = this.f1397x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j6, this.f1396w));
        this.f1396w -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        long j6 = this.f1396w;
        if (j6 == 0) {
            return -1;
        }
        int i8 = ((FilterInputStream) this).in.read(bArr, i6, (int) Math.min(i7, j6));
        if (i8 != -1) {
            this.f1396w -= (long) i8;
        }
        return i8;
    }
}
