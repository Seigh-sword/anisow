package T;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class k extends View.BaseSavedState {
    public static final Parcelable.Creator<k> CREATOR = new android.support.v4.media.a(14);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3368w;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC0628i.l(sb, this.f3368w, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f3368w);
    }
}
