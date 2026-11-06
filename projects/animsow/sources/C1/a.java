package C1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ByteBuffer f111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112x = -1;

    public a(ByteBuffer byteBuffer) {
        this.f111w = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f111w.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i6) {
        this.f112x = this.f111w.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f111w;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i6 = this.f112x;
        if (i6 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f111w.position(i6);
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        ByteBuffer byteBuffer = this.f111w;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j6, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        ByteBuffer byteBuffer = this.f111w;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i7, byteBuffer.remaining());
        byteBuffer.get(bArr, i6, iMin);
        return iMin;
    }
}
