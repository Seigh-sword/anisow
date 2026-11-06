package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0675a implements Parcelable {
    public static final Parcelable.Creator<C0675a> CREATOR = new android.support.v4.media.a(10);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Intent f8301x;

    public C0675a(Intent intent, int i6) {
        this.f8300w = i6;
        this.f8301x = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i6 = this.f8300w;
        sb.append(i6 != -1 ? i6 != 0 ? String.valueOf(i6) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f8301x);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        AbstractC1305a.o(parcel, "dest");
        parcel.writeInt(this.f8300w);
        Intent intent = this.f8301x;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i6);
        }
    }
}
