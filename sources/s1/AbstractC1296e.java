package s1;

import android.content.Context;
import android.graphics.Bitmap;
import m1.InterfaceC1006d;

/* JADX INFO: renamed from: s1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1296e implements j1.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12568b;

    public /* synthetic */ AbstractC1296e(int i6) {
        this.f12568b = i6;
    }

    @Override // j1.q
    public final l1.F a(com.bumptech.glide.f fVar, l1.F f6, int i6, int i7) {
        switch (this.f12568b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!C1.n.j(i6, i7)) {
                    throw new IllegalArgumentException("Cannot apply transformation on width: " + i6 + " or height: " + i7 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
                }
                InterfaceC1006d interfaceC1006d = com.bumptech.glide.b.a(fVar).f6296w;
                Bitmap bitmap = (Bitmap) f6.a();
                if (i6 == Integer.MIN_VALUE) {
                    i6 = bitmap.getWidth();
                }
                if (i7 == Integer.MIN_VALUE) {
                    i7 = bitmap.getHeight();
                }
                Bitmap bitmapD = d(interfaceC1006d, bitmap, i6, i7);
                return bitmap.equals(bitmapD) ? f6 : C1295d.e(bitmapD, interfaceC1006d);
            default:
                if (!C1.n.j(i6, i7)) {
                    throw new IllegalArgumentException("Cannot apply transformation on width: " + i6 + " or height: " + i7 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
                }
                InterfaceC1006d interfaceC1006d2 = com.bumptech.glide.b.a(fVar).f6296w;
                Bitmap bitmap2 = (Bitmap) f6.a();
                if (i6 == Integer.MIN_VALUE) {
                    bitmap2.getWidth();
                }
                if (i7 == Integer.MIN_VALUE) {
                    bitmap2.getHeight();
                }
                Bitmap bitmapC = c(fVar.getApplicationContext(), interfaceC1006d2, bitmap2);
                return bitmap2.equals(bitmapC) ? f6 : C1295d.e(bitmapC, interfaceC1006d2);
        }
    }

    public abstract Bitmap c(Context context, InterfaceC1006d interfaceC1006d, Bitmap bitmap);

    public abstract Bitmap d(InterfaceC1006d interfaceC1006d, Bitmap bitmap, int i6, int i7);
}
