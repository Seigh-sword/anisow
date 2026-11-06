package T1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Y1.a {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Intent f3404w;

    public a(Intent intent) {
        this.f3404w = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.D0(parcel, 1, this.f3404w, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
