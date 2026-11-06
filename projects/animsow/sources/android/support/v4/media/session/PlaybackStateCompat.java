package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new android.support.v4.media.a(8);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f5082A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f5083B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final CharSequence f5084C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f5085D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f5086E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f5087F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Bundle f5088G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f5090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f5091y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f5092z;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final String f5093w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final CharSequence f5094x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f5095y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final Bundle f5096z;

        public CustomAction(Parcel parcel) {
            this.f5093w = parcel.readString();
            this.f5094x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5095y = parcel.readInt();
            this.f5096z = parcel.readBundle(d.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f5094x) + ", mIcon=" + this.f5095y + ", mExtras=" + this.f5096z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f5093w);
            TextUtils.writeToParcel(this.f5094x, parcel, i6);
            parcel.writeInt(this.f5095y);
            parcel.writeBundle(this.f5096z);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f5089w = parcel.readInt();
        this.f5090x = parcel.readLong();
        this.f5092z = parcel.readFloat();
        this.f5085D = parcel.readLong();
        this.f5091y = parcel.readLong();
        this.f5082A = parcel.readLong();
        this.f5084C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5086E = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f5087F = parcel.readLong();
        this.f5088G = parcel.readBundle(d.class.getClassLoader());
        this.f5083B = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f5089w + ", position=" + this.f5090x + ", buffered position=" + this.f5091y + ", speed=" + this.f5092z + ", updated=" + this.f5085D + ", actions=" + this.f5082A + ", error code=" + this.f5083B + ", error message=" + this.f5084C + ", custom actions=" + this.f5086E + ", active item id=" + this.f5087F + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f5089w);
        parcel.writeLong(this.f5090x);
        parcel.writeFloat(this.f5092z);
        parcel.writeLong(this.f5085D);
        parcel.writeLong(this.f5091y);
        parcel.writeLong(this.f5082A);
        TextUtils.writeToParcel(this.f5084C, parcel, i6);
        parcel.writeTypedList(this.f5086E);
        parcel.writeLong(this.f5087F);
        parcel.writeBundle(this.f5088G);
        parcel.writeInt(this.f5083B);
    }
}
