package c0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: c0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0350A implements s1.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ByteBuffer f6095w;

    public C0350A(int i6, ByteBuffer byteBuffer) {
        if (i6 == 1) {
            this.f6095w = byteBuffer;
        } else if (i6 != 2) {
            this.f6095w = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        } else {
            this.f6095w = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    @Override // s1.l
    public final long a(long j6) {
        ByteBuffer byteBuffer = this.f6095w;
        int iMin = (int) Math.min(byteBuffer.remaining(), j6);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // s1.l
    public final int c() {
        return (o() << 8) | o();
    }

    @Override // s1.l
    public final int k(int i6, byte[] bArr) {
        ByteBuffer byteBuffer = this.f6095w;
        int iMin = Math.min(i6, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // s1.l
    public final short o() throws s1.k {
        ByteBuffer byteBuffer = this.f6095w;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new s1.k();
    }
}
