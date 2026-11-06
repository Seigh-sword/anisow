package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends U.b {
    public static final Parcelable.Creator<e> CREATOR = new g1(10);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f2803y;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2803y = parcel.readInt();
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f2803y);
    }

    public e(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f2803y = sideSheetBehavior.f7278h;
    }
}
