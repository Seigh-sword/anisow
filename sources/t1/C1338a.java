package t1;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.C0396c2;
import j1.m;
import j1.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import l1.F;
import m1.C1010h;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: t1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1338a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0396c2 f12720b;

    public /* synthetic */ C1338a(C0396c2 c0396c2, int i6) {
        this.f12719a = i6;
        this.f12720b = c0396c2;
    }

    @Override // j1.o
    public final boolean a(Object obj, m mVar) throws IOException {
        int i6 = this.f12719a;
        C0396c2 c0396c2 = this.f12720b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeK = AbstractC1332d.K((List) c0396c2.f6775x, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeK != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeK != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
            default:
                List list = (List) c0396c2.f6775x;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeL = AbstractC1332d.L((C1010h) c0396c2.f6776y, (InputStream) obj, list);
                if (imageHeaderParser$ImageTypeL != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeL != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // j1.o
    public final F b(Object obj, int i6, int i7, m mVar) {
        int i8 = this.f12719a;
        C0396c2 c0396c2 = this.f12720b;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource((ByteBuffer) obj);
                c0396c2.getClass();
                return C0396c2.o(sourceCreateSource, i6, i7, mVar);
            default:
                ImageDecoder.Source sourceCreateSource2 = ImageDecoder.createSource(C1.b.b((InputStream) obj));
                c0396c2.getClass();
                return C0396c2.o(sourceCreateSource2, i6, i7, mVar);
        }
    }
}
