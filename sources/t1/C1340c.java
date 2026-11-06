package t1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.o;
import i1.C0831e;
import m1.C1010h;
import m1.InterfaceC1006d;
import u1.C1358b;
import u1.C1360d;
import u1.C1362f;
import u1.C1365i;

/* JADX INFO: renamed from: t1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1340c extends AbstractC1339b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12722x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1340c(Drawable drawable, int i6) {
        super(drawable);
        this.f12722x = i6;
    }

    @Override // l1.InterfaceC0923B
    public final void b() {
        Bitmap bitmap;
        int i6 = this.f12722x;
        Drawable drawable = this.f12721w;
        switch (i6) {
            case 1:
                ((C1360d) drawable).f12831w.f12824a.f12856l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else if (drawable instanceof C1360d) {
                    bitmap = ((C1360d) drawable).f12831w.f12824a.f12856l;
                }
                bitmap.prepareToDraw();
                break;
        }
    }

    @Override // l1.F
    public final int c() {
        int i6 = this.f12722x;
        Drawable drawable = this.f12721w;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C1365i c1365i = ((C1360d) drawable).f12831w.f12824a;
                C0831e c0831e = (C0831e) c1365i.f12845a;
                return (c0831e.f9396j.length * 4) + c0831e.f9390d.limit() + c0831e.f9395i.length + c1365i.f12858n;
        }
    }

    @Override // l1.F
    public final Class d() {
        switch (this.f12722x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return this.f12721w.getClass();
            default:
                return C1360d.class;
        }
    }

    @Override // l1.F
    public final void f() {
        C1010h c1010h;
        C1010h c1010h2;
        C1010h c1010h3;
        switch (this.f12722x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                C1360d c1360d = (C1360d) this.f12721w;
                c1360d.stop();
                c1360d.f12834z = true;
                C1365i c1365i = c1360d.f12831w.f12824a;
                c1365i.f12847c.clear();
                Bitmap bitmap = c1365i.f12856l;
                if (bitmap != null) {
                    c1365i.f12849e.d(bitmap);
                    c1365i.f12856l = null;
                }
                c1365i.f12850f = false;
                C1362f c1362f = c1365i.f12853i;
                o oVar = c1365i.f12848d;
                if (c1362f != null) {
                    oVar.n(c1362f);
                    c1365i.f12853i = null;
                }
                C1362f c1362f2 = c1365i.f12855k;
                if (c1362f2 != null) {
                    oVar.n(c1362f2);
                    c1365i.f12855k = null;
                }
                C1362f c1362f3 = c1365i.f12857m;
                if (c1362f3 != null) {
                    oVar.n(c1362f3);
                    c1365i.f12857m = null;
                }
                C0831e c0831e = (C0831e) c1365i.f12845a;
                c0831e.f9398l = null;
                byte[] bArr = c0831e.f9395i;
                C1358b c1358b = c0831e.f9389c;
                if (bArr != null && (c1010h3 = (C1010h) c1358b.f12823y) != null) {
                    c1010h3.g(bArr);
                }
                int[] iArr = c0831e.f9396j;
                if (iArr != null && (c1010h2 = (C1010h) c1358b.f12823y) != null) {
                    c1010h2.g(iArr);
                }
                Bitmap bitmap2 = c0831e.f9399m;
                if (bitmap2 != null) {
                    ((InterfaceC1006d) c1358b.f12822x).d(bitmap2);
                }
                c0831e.f9399m = null;
                c0831e.f9390d = null;
                c0831e.f9405s = null;
                byte[] bArr2 = c0831e.f9391e;
                if (bArr2 != null && (c1010h = (C1010h) c1358b.f12823y) != null) {
                    c1010h.g(bArr2);
                }
                c1365i.f12854j = true;
                break;
        }
    }
}
