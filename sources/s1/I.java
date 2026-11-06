package s1;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import d.AbstractC0628i;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m1.InterfaceC1006d;

/* JADX INFO: loaded from: classes.dex */
public final class I implements j1.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j1.l f12550d = new j1.l("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new F(0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j1.l f12551e = new j1.l("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new F(1));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final V0.m f12552f = new V0.m(17);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f12553g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f12554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1006d f12555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V0.m f12556c = f12552f;

    public I(InterfaceC1006d interfaceC1006d, H h4) {
        this.f12555b = interfaceC1006d;
        this.f12554a = h4;
    }

    @Override // j1.o
    public final boolean a(Object obj, j1.m mVar) {
        return true;
    }

    @Override // j1.o
    public final l1.F b(Object obj, int i6, int i7, j1.m mVar) throws IOException {
        long jLongValue = ((Long) mVar.c(f12550d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(AbstractC0628i.g("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) mVar.c(f12551e);
        if (num == null) {
            num = 2;
        }
        o oVar = (o) mVar.c(o.f12584f);
        if (oVar == null) {
            oVar = o.f12583e;
        }
        o oVar2 = oVar;
        this.f12556c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f12554a.k(mediaMetadataRetriever, obj);
            Bitmap bitmapC = c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i6, i7, oVar2);
            int i8 = Build.VERSION.SDK_INT;
            mediaMetadataRetriever.release();
            return C1295d.e(bitmapC, this.f12555b);
        } catch (Throwable th) {
            int i9 = Build.VERSION.SDK_INT;
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(java.lang.Object r15, android.media.MediaMetadataRetriever r16, long r17, int r19, int r20, int r21, s1.o r22) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.I.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, s1.o):android.graphics.Bitmap");
    }
}
