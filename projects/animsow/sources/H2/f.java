package H2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new g1(8);

    public f(Parcel parcel, ClassLoader classLoader) {
        int i6 = parcel.readInt();
        int[] iArr = new int[i6];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i7 = 0; i7 < i6; i7++) {
            put(iArr[i7], parcelableArray[i7]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = keyAt(i7);
            parcelableArr[i7] = (Parcelable) valueAt(i7);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i6);
    }
}
