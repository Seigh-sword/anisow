package s1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import i1.C0831e;
import i1.InterfaceC0827a;
import java.io.IOException;
import m1.InterfaceC1006d;
import r1.AbstractC1272a;

/* JADX INFO: renamed from: s1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1294c implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1006d f12564b;

    public C1294c() {
        this.f12563a = 0;
        this.f12564b = new B3.e();
    }

    @Override // j1.o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, j1.m mVar) {
        switch (this.f12563a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1272a.n(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // j1.o
    public final l1.F b(Object obj, int i6, int i7, j1.m mVar) {
        switch (this.f12563a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return c(AbstractC1272a.d(obj), i6, i7, mVar);
            default:
                return C1295d.e(((C0831e) ((InterfaceC0827a) obj)).b(), this.f12564b);
        }
    }

    public final C1295d c(ImageDecoder.Source source, int i6, int i7, j1.m mVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new r1.c(i6, i7, mVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i6 + "x" + i7 + "]");
        }
        return new C1295d(bitmapDecodeBitmap, this.f12564b);
    }

    public C1294c(InterfaceC1006d interfaceC1006d) {
        this.f12563a = 1;
        this.f12564b = interfaceC1006d;
    }
}
