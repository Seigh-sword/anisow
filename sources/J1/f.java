package j1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import m1.C1010h;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, C1010h c1010h);

    ImageHeaderParser$ImageType c(InputStream inputStream);

    int d(InputStream inputStream, C1010h c1010h);
}
