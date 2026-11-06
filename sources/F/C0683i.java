package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683i implements Parcelable {
    public static final Parcelable.Creator<C0683i> CREATOR = new android.support.v4.media.a(11);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final IntentSender f8319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Intent f8320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8321y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8322z;

    public C0683i(IntentSender intentSender, Intent intent, int i6, int i7) {
        AbstractC1305a.o(intentSender, "intentSender");
        this.f8319w = intentSender;
        this.f8320x = intent;
        this.f8321y = i6;
        this.f8322z = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        AbstractC1305a.o(parcel, "dest");
        parcel.writeParcelable(this.f8319w, i6);
        parcel.writeParcelable(this.f8320x, i6);
        parcel.writeInt(this.f8321y);
        parcel.writeInt(this.f8322z);
    }
}
