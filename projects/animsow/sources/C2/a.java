package C2;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View.BaseSavedState {
    public static final Parcelable.Creator<a> CREATOR = new M(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f137w;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i6 = this.f137w;
        return AbstractC0628i.m(sb, i6 != 1 ? i6 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeValue(Integer.valueOf(this.f137w));
    }
}
