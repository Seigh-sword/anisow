package B;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends U.b {
    public static final Parcelable.Creator<g> CREATOR = new g1(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SparseArray f55y;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i6 = parcel.readInt();
        int[] iArr = new int[i6];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f55y = new SparseArray(i6);
        for (int i7 = 0; i7 < i6; i7++) {
            this.f55y.append(iArr[i7], parcelableArray[i7]);
        }
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        SparseArray sparseArray = this.f55y;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = this.f55y.keyAt(i7);
            parcelableArr[i7] = (Parcelable) this.f55y.valueAt(i7);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i6);
    }
}
