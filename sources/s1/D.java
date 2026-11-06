package s1;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class D implements l1.F {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12545x;

    public /* synthetic */ D(int i6, Object obj) {
        this.f12544w = i6;
        this.f12545x = obj;
    }

    @Override // l1.F
    public final Object a() {
        int i6 = this.f12544w;
        Object obj = this.f12545x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (Bitmap) obj;
            case 1:
                return (byte[]) obj;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return (AnimatedImageDrawable) obj;
            default:
                return obj;
        }
    }

    @Override // l1.F
    public final int c() {
        int i6 = this.f12544w;
        Object obj = this.f12545x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return C1.n.c((Bitmap) obj);
            case 1:
                return ((byte[]) obj).length;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return C1.n.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // l1.F
    public final Class d() {
        switch (this.f12544w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return Drawable.class;
            default:
                return this.f12545x.getClass();
        }
    }

    @Override // l1.F
    public final void f() {
        switch (this.f12544w) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f12545x;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    public D(File file) {
        this.f12544w = 3;
        AbstractC1332d.l(file, "Argument must not be null");
        this.f12545x = file;
    }

    public D(byte[] bArr) {
        this.f12544w = 1;
        AbstractC1332d.l(bArr, "Argument must not be null");
        this.f12545x = bArr;
    }
}
