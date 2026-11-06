package s1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import m1.InterfaceC1006d;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f12597a = new s();

    public static C1295d a(InterfaceC1006d interfaceC1006d, Drawable drawable, int i6, int i7) {
        Bitmap bitmap;
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z5 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else if (i6 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                sb = new StringBuilder("Unable to draw ");
                sb.append(current);
                str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                sb.append(str);
                Log.w("DrawableToBitmap", sb.toString());
            }
            bitmap = null;
            z5 = true;
        } else if (i7 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
            if (current.getIntrinsicWidth() > 0) {
                i6 = current.getIntrinsicWidth();
            }
            if (current.getIntrinsicHeight() > 0) {
                i7 = current.getIntrinsicHeight();
            }
            Lock lock = C.f12543b;
            lock.lock();
            Bitmap bitmapA = interfaceC1006d.a(i6, i7, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmapA);
                current.setBounds(0, 0, i6, i7);
                current.draw(canvas);
                canvas.setBitmap(null);
                lock.unlock();
                bitmap = bitmapA;
                z5 = true;
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                sb = new StringBuilder("Unable to draw ");
                sb.append(current);
                str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                sb.append(str);
                Log.w("DrawableToBitmap", sb.toString());
            }
            bitmap = null;
            z5 = true;
        }
        if (!z5) {
            interfaceC1006d = f12597a;
        }
        return C1295d.e(bitmap, interfaceC1006d);
    }
}
