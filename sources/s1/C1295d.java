package s1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import l1.InterfaceC0923B;
import m1.InterfaceC1006d;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: s1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1295d implements l1.F, InterfaceC0923B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12565w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f12567y;

    public C1295d(Resources resources, l1.F f6) {
        AbstractC1332d.l(resources, "Argument must not be null");
        this.f12566x = resources;
        AbstractC1332d.l(f6, "Argument must not be null");
        this.f12567y = f6;
    }

    public static C1295d e(Bitmap bitmap, InterfaceC1006d interfaceC1006d) {
        if (bitmap == null) {
            return null;
        }
        return new C1295d(bitmap, interfaceC1006d);
    }

    @Override // l1.F
    public final Object a() {
        int i6 = this.f12565w;
        Object obj = this.f12566x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((l1.F) this.f12567y).a());
        }
    }

    @Override // l1.InterfaceC0923B
    public final void b() {
        switch (this.f12565w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((Bitmap) this.f12566x).prepareToDraw();
                break;
            default:
                l1.F f6 = (l1.F) this.f12567y;
                if (f6 instanceof InterfaceC0923B) {
                    ((InterfaceC0923B) f6).b();
                }
                break;
        }
    }

    @Override // l1.F
    public final int c() {
        switch (this.f12565w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return C1.n.c((Bitmap) this.f12566x);
            default:
                return ((l1.F) this.f12567y).c();
        }
    }

    @Override // l1.F
    public final Class d() {
        switch (this.f12565w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // l1.F
    public final void f() {
        int i6 = this.f12565w;
        Object obj = this.f12567y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((InterfaceC1006d) obj).d((Bitmap) this.f12566x);
                break;
            default:
                ((l1.F) obj).f();
                break;
        }
    }

    public C1295d(Bitmap bitmap, InterfaceC1006d interfaceC1006d) {
        AbstractC1332d.l(bitmap, "Bitmap must not be null");
        this.f12566x = bitmap;
        AbstractC1332d.l(interfaceC1006d, "BitmapPool must not be null");
        this.f12567y = interfaceC1006d;
    }
}
