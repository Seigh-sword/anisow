package p1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class D implements y {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Resources f12228x;

    public /* synthetic */ D(Resources resources, int i6) {
        this.f12227w = i6;
        this.f12228x = resources;
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        int i6 = this.f12227w;
        Resources resources = this.f12228x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new m(resources, c1234c.b(Uri.class, AssetFileDescriptor.class));
            default:
                return new m(resources, H.f12233a);
        }
    }
}
