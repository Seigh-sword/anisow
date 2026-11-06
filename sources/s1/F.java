package s1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class F implements j1.k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ByteBuffer f12548x;

    public F(int i6) {
        this.f12547w = i6;
        if (i6 != 1) {
            this.f12548x = ByteBuffer.allocate(8);
        } else {
            this.f12548x = ByteBuffer.allocate(4);
        }
    }

    @Override // j1.k
    public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f12547w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Long l5 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f12548x) {
                    this.f12548x.position(0);
                    messageDigest.update(this.f12548x.putLong(l5.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f12548x) {
                    this.f12548x.position(0);
                    messageDigest.update(this.f12548x.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }
}
