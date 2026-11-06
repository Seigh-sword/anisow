package r1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import j1.EnumC0844b;
import j1.l;
import j1.m;
import j1.n;
import s1.o;
import s1.r;
import s1.x;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f12429a = x.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC0844b f12432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f12433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f12435g;

    public c(int i6, int i7, m mVar) {
        this.f12430b = i6;
        this.f12431c = i7;
        this.f12432d = (EnumC0844b) mVar.c(r.f12586f);
        this.f12433e = (o) mVar.c(o.f12584f);
        l lVar = r.f12589i;
        this.f12434f = mVar.c(lVar) != null && ((Boolean) mVar.c(lVar)).booleanValue();
        this.f12435g = (n) mVar.c(r.f12587g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        if (this.f12429a.c(this.f12430b, this.f12431c, this.f12434f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f12432d == EnumC0844b.f9429x) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1273b());
        Size size = imageInfo.getSize();
        int width = this.f12430b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f12431c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f12433e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        n nVar = this.f12435g;
        if (nVar != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                if (nVar == n.f9443w && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            }
            if (i6 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
