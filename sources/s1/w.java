package s1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import m1.InterfaceC1006d;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1296e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f12600c = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(j1.i.f9435a);

    @Override // j1.i
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12600c);
    }

    @Override // s1.AbstractC1296e
    public final Bitmap d(InterfaceC1006d interfaceC1006d, Bitmap bitmap, int i6, int i7) {
        return C.b(interfaceC1006d, bitmap, i6, i7);
    }

    @Override // j1.i
    public final boolean equals(Object obj) {
        return obj instanceof w;
    }

    @Override // j1.i
    public final int hashCode() {
        return 1572326941;
    }
}
