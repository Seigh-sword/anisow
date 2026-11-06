package s1;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import m1.InterfaceC1006d;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC1296e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f12615d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(j1.i.f9435a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12616c;

    public z() {
        super(0);
        this.f12616c = 14;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12615d);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f12616c).array());
    }

    @Override // s1.AbstractC1296e
    public final Bitmap d(InterfaceC1006d interfaceC1006d, Bitmap bitmap, int i6, int i7) {
        Bitmap bitmapA;
        Paint paint = C.f12542a;
        int i8 = this.f12616c;
        AbstractC1332d.b("roundingRadius must be greater than 0.", i8 > 0);
        int i9 = Build.VERSION.SDK_INT;
        Bitmap.Config config = (i9 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = (i9 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        if (config2.equals(bitmap.getConfig())) {
            bitmapA = bitmap;
        } else {
            bitmapA = interfaceC1006d.a(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapA).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapA2 = interfaceC1006d.a(bitmapA.getWidth(), bitmapA.getHeight(), config);
        bitmapA2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapA, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapA2.getWidth(), bitmapA2.getHeight());
        Lock lock = C.f12543b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapA2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f6 = i8;
            canvas.drawRoundRect(rectF, f6, f6, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapA.equals(bitmap)) {
                interfaceC1006d.d(bitmapA);
            }
            return bitmapA2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        return (obj instanceof z) && this.f12616c == ((z) obj).f12616c;
    }

    @Override // j1.i
    public final int hashCode() {
        return C1.n.g(-569625254, C1.n.g(this.f12616c, 17));
    }
}
