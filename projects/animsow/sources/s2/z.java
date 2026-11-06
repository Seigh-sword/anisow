package S2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends U.b {
    public static final Parcelable.Creator<z> CREATOR = new g1(11);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f3236y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3237z;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3236y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3237z = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3236y) + "}";
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        TextUtils.writeToParcel(this.f3236y, parcel, i6);
        parcel.writeInt(this.f3237z ? 1 : 0);
    }
}
