package o2;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Y1.a {
    public static final Parcelable.Creator<g> CREATOR = new M(15);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f12190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f12191x;

    public g(String str, ArrayList arrayList) {
        this.f12190w = arrayList;
        this.f12191x = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        List<String> list = this.f12190w;
        if (list != null) {
            int iJ02 = AbstractC1332d.J0(parcel, 1);
            parcel.writeStringList(list);
            AbstractC1332d.L0(parcel, iJ02);
        }
        AbstractC1332d.F0(parcel, 2, this.f12191x);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
