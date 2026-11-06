package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Parcelable {
    public static final Parcelable.Creator<X> CREATOR = new C0737b(3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f8721A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f8722B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f8723C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f8724D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f8725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f8726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0738c[] f8727y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8728z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f8725w);
        parcel.writeStringList(this.f8726x);
        parcel.writeTypedArray(this.f8727y, i6);
        parcel.writeInt(this.f8728z);
        parcel.writeString(this.f8721A);
        parcel.writeStringList(this.f8722B);
        parcel.writeTypedList(this.f8723C);
        parcel.writeTypedList(this.f8724D);
    }
}
