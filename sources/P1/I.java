package p1;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class I implements y, J {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12234w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ContentResolver f12235x;

    public /* synthetic */ I(ContentResolver contentResolver, int i6) {
        this.f12234w = i6;
        this.f12235x = contentResolver;
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        switch (this.f12234w) {
        }
        return new K(this);
    }

    @Override // p1.J
    public final com.bumptech.glide.load.data.e h(Uri uri) {
        int i6 = this.f12234w;
        ContentResolver contentResolver = this.f12235x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new com.bumptech.glide.load.data.a(contentResolver, uri, 0);
            default:
                return new com.bumptech.glide.load.data.o(contentResolver, uri, 1);
        }
    }
}
