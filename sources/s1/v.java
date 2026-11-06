package s1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import f0.C0686c;
import f0.C0690g;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import m1.C1010h;

/* JADX INFO: loaded from: classes.dex */
public final class v implements j1.f {
    @Override // j1.f
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // j1.f
    public final int b(ByteBuffer byteBuffer, C1010h c1010h) {
        AtomicReference atomicReference = C1.b.f113a;
        return d(new C1.a(byteBuffer), c1010h);
    }

    @Override // j1.f
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // j1.f
    public final int d(InputStream inputStream, C1010h c1010h) throws Throwable {
        C0690g c0690g = new C0690g(inputStream);
        C0686c c0686cC = c0690g.c("Orientation");
        int iE = 1;
        if (c0686cC != null) {
            try {
                iE = c0686cC.e(c0690g.f8375f);
            } catch (NumberFormatException unused) {
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }
}
