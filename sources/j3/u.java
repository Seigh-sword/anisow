package J3;

import X1.M;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class u extends Y1.a {
    public static final Parcelable.Creator<u> CREATOR = new M(25);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Bundle f1436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t f1437x;

    public u(Bundle bundle) {
        this.f1436w = bundle;
    }

    public final t b() {
        if (this.f1437x == null) {
            Bundle bundle = this.f1436w;
            if (K1.b.v(bundle)) {
                this.f1437x = new t(new K1.b(bundle));
            }
        }
        return this.f1437x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.y0(parcel, 2, this.f1436w);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
