package m2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1074u extends Y1.a implements Iterable {
    public static final Parcelable.Creator<C1074u> CREATOR = new X1.M(9);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bundle f11108w;

    public C1074u(Bundle bundle) {
        this.f11108w = bundle;
    }

    public final Double b() {
        return Double.valueOf(this.f11108w.getDouble("value"));
    }

    public final Bundle c() {
        return new Bundle(this.f11108w);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.w0(this);
    }

    public final String toString() {
        return this.f11108w.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.y0(parcel, 2, c());
        AbstractC1332d.L0(parcel, iJ0);
    }
}
