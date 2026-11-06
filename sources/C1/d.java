package C1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f116x;

    public d(InputStream inputStream, long j6) {
        super(inputStream);
        this.f115w = j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f115w - ((long) this.f116x), ((FilterInputStream) this).in.available());
    }

    public final void b(int i6) throws IOException {
        if (i6 >= 0) {
            this.f116x += i6;
            return;
        }
        long j6 = this.f116x;
        long j7 = this.f115w;
        if (j7 - j6 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j7 + ", but read: " + this.f116x);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i6;
        i6 = super.read();
        b(i6 >= 0 ? 1 : -1);
        return i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i6, int i7) {
        int i8;
        i8 = super.read(bArr, i6, i7);
        b(i8);
        return i8;
    }
}
