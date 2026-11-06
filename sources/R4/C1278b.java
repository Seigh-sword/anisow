package r4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import d.AbstractC0628i;
import j1.i;
import java.security.MessageDigest;
import m1.InterfaceC1006d;
import s1.AbstractC1296e;

/* JADX INFO: renamed from: r4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1278b extends AbstractC1296e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12490c;

    public C1278b(int i6) {
        super(1);
        this.f12490c = i6;
    }

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.ColorFilterTransformation.1" + this.f12490c).getBytes(i.f9435a));
    }

    @Override // s1.AbstractC1296e
    public final Bitmap c(Context context, InterfaceC1006d interfaceC1006d, Bitmap bitmap) {
        Bitmap bitmapA = interfaceC1006d.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapA.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(bitmapA);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(this.f12490c, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapA;
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        return (obj instanceof C1278b) && ((C1278b) obj).f12490c == this.f12490c;
    }

    @Override // j1.i
    public final int hashCode() {
        return (this.f12490c * 10) + 705373712;
    }

    public final String toString() {
        return AbstractC0628i.l(new StringBuilder("ColorFilterTransformation(color="), this.f12490c, ")");
    }
}
