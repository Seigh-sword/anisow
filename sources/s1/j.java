package s1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class j implements com.bumptech.glide.load.data.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f12575a;

    public j(int i6, byte[] bArr) {
        this.f12575a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i6);
    }

    @Override // com.bumptech.glide.load.data.g
    public final Object a() {
        ByteBuffer byteBuffer = this.f12575a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public final short b(int i6) {
        ByteBuffer byteBuffer = this.f12575a;
        if (byteBuffer.remaining() - i6 >= 2) {
            return byteBuffer.getShort(i6);
        }
        return (short) -1;
    }

    public j(ByteBuffer byteBuffer) {
        this.f12575a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.g
    public final void c() {
    }
}
