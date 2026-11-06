package s1;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: s1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1298g implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1294c f12572b;

    public C1298g(int i6) {
        this.f12571a = i6;
        if (i6 != 1) {
            this.f12572b = new C1294c();
        } else {
            this.f12572b = new C1294c();
        }
    }

    @Override // j1.o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, j1.m mVar) {
        switch (this.f12571a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // j1.o
    public final l1.F b(Object obj, int i6, int i7, j1.m mVar) {
        int i8 = this.f12571a;
        C1294c c1294c = this.f12572b;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return c1294c.c(ImageDecoder.createSource((ByteBuffer) obj), i6, i7, mVar);
            default:
                return c1294c.c(ImageDecoder.createSource(C1.b.b((InputStream) obj)), i6, i7, mVar);
        }
    }
}
