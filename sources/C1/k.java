package C1;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends FilterInputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129w;

    public k(e eVar) {
        super(eVar);
        this.f129w = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i6 = this.f129w;
        return i6 == Integer.MIN_VALUE ? super.available() : Math.min(i6, super.available());
    }

    public final long b(long j6) {
        int i6 = this.f129w;
        if (i6 == 0) {
            return -1L;
        }
        return (i6 == Integer.MIN_VALUE || j6 <= ((long) i6)) ? j6 : i6;
    }

    public final void c(long j6) {
        int i6 = this.f129w;
        if (i6 == Integer.MIN_VALUE || j6 == -1) {
            return;
        }
        this.f129w = (int) (((long) i6) - j6);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        super.mark(i6);
        this.f129w = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (b(1L) == -1) {
            return -1;
        }
        int i6 = super.read();
        c(1L);
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f129w = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jB = b(j6);
        if (jB == -1) {
            return 0L;
        }
        long jSkip = super.skip(jB);
        c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        int iB = (int) b(i7);
        if (iB == -1) {
            return -1;
        }
        int i8 = super.read(bArr, i6, iB);
        c(i8);
        return i8;
    }
}
