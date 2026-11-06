package y2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m.g1;

/* JADX INFO: renamed from: y2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1502d extends U.b {
    public static final Parcelable.Creator<C1502d> CREATOR = new g1(5);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f13790A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f13791B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f13792C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f13793y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f13794z;

    public C1502d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13793y = parcel.readInt();
        this.f13794z = parcel.readInt();
        this.f13790A = parcel.readInt() == 1;
        this.f13791B = parcel.readInt() == 1;
        this.f13792C = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f13793y);
        parcel.writeInt(this.f13794z);
        parcel.writeInt(this.f13790A ? 1 : 0);
        parcel.writeInt(this.f13791B ? 1 : 0);
        parcel.writeInt(this.f13792C ? 1 : 0);
    }

    public C1502d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f13793y = bottomSheetBehavior.f7063L;
        this.f13794z = bottomSheetBehavior.f7086e;
        this.f13790A = bottomSheetBehavior.f7080b;
        this.f13791B = bottomSheetBehavior.f7060I;
        this.f13792C = bottomSheetBehavior.f7061J;
    }
}
