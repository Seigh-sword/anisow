package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class U extends View.BaseSavedState {
    public static final Parcelable.Creator<U> CREATOR = new android.support.v4.media.a(13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10205w;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeByte(this.f10205w ? (byte) 1 : (byte) 0);
    }
}
