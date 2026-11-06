package s1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import m1.InterfaceC1006d;

/* JADX INFO: renamed from: s1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1300i extends AbstractC1296e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f12574c = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(j1.i.f9435a);

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12574c);
    }

    @Override // s1.AbstractC1296e
    public final Bitmap d(InterfaceC1006d interfaceC1006d, Bitmap bitmap, int i6, int i7) {
        Paint paint = C.f12542a;
        if (bitmap.getWidth() > i6 || bitmap.getHeight() > i7) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C.b(interfaceC1006d, bitmap, i6, i7);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        return obj instanceof C1300i;
    }

    @Override // j1.i
    public final int hashCode() {
        return -670243078;
    }
}
