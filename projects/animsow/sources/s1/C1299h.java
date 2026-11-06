package s1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import m1.InterfaceC1006d;

/* JADX INFO: renamed from: s1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1299h extends AbstractC1296e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f12573c = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(j1.i.f9435a);

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12573c);
    }

    @Override // s1.AbstractC1296e
    public final Bitmap d(InterfaceC1006d interfaceC1006d, Bitmap bitmap, int i6, int i7) {
        float width;
        float height;
        Paint paint = C.f12542a;
        if (bitmap.getWidth() == i6 && bitmap.getHeight() == i7) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i7 > bitmap.getHeight() * i6) {
            width = i7 / bitmap.getHeight();
            width2 = (i6 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i6 / bitmap.getWidth();
            height = (i7 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapA = interfaceC1006d.a(i6, i7, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapA.setHasAlpha(bitmap.hasAlpha());
        C.a(bitmap, bitmapA, matrix);
        return bitmapA;
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        return obj instanceof C1299h;
    }

    @Override // j1.i
    public final int hashCode() {
        return -599754482;
    }
}
