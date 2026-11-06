package m2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1038g extends Y1.a {
    public static final Parcelable.Creator<C1038g> CREATOR = new X1.M(8);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bundle f10910w;

    public C1038g(Bundle bundle) {
        this.f10910w = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.y0(parcel, 1, this.f10910w);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
