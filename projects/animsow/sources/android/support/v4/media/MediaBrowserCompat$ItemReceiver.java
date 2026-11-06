package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import c.e;
import com.bumptech.glide.d;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends e {
    @Override // c.e
    public final void a(int i6, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(d.class.getClassLoader());
        }
        if (i6 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
