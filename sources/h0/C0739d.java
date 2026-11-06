package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: h0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739d implements Parcelable {
    public static final Parcelable.Creator<C0739d> CREATOR = new C0737b(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f8790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f8791x;

    public C0739d(Parcel parcel) {
        this.f8790w = parcel.createStringArrayList();
        this.f8791x = parcel.createTypedArrayList(C0738c.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f8790w);
        parcel.writeTypedList(this.f8791x);
    }
}
