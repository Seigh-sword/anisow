package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Bitmap f5052A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Uri f5053B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Bundle f5054C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Uri f5055D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Object f5056E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f5057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f5058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f5059y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f5060z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f5057w = str;
        this.f5058x = charSequence;
        this.f5059y = charSequence2;
        this.f5060z = charSequence3;
        this.f5052A = bitmap;
        this.f5053B = uri;
        this.f5054C = bundle;
        this.f5055D = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f5058x) + ", " + ((Object) this.f5059y) + ", " + ((Object) this.f5060z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        Object objBuild = this.f5056E;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f5057w);
            builder.setTitle(this.f5058x);
            builder.setSubtitle(this.f5059y);
            builder.setDescription(this.f5060z);
            builder.setIconBitmap(this.f5052A);
            builder.setIconUri(this.f5053B);
            builder.setExtras(this.f5054C);
            builder.setMediaUri(this.f5055D);
            objBuild = builder.build();
            this.f5056E = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i6);
    }
}
