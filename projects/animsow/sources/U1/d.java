package U1;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Y1.a {
    public static final Parcelable.Creator<d> CREATOR = new M(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f3584y;

    public d() {
        this.f3582w = "CLIENT_TELEMETRY";
        this.f3584y = 1L;
        this.f3583x = -1;
    }

    public final long b() {
        long j6 = this.f3584y;
        return j6 == -1 ? this.f3583x : j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f3582w;
            if (((str != null && str.equals(dVar.f3582w)) || (str == null && dVar.f3582w == null)) && b() == dVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3582w, Long.valueOf(b())});
    }

    public final String toString() {
        C1358b c1358b = new C1358b(this);
        c1358b.c(this.f3582w, "name");
        c1358b.c(Long.valueOf(b()), "version");
        return c1358b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.F0(parcel, 1, this.f3582w);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(this.f3583x);
        long jB = b();
        AbstractC1332d.N0(parcel, 3, 8);
        parcel.writeLong(jB);
        AbstractC1332d.L0(parcel, iJ0);
    }

    public d(int i6, long j6, String str) {
        this.f3582w = str;
        this.f3583x = i6;
        this.f3584y = j6;
    }
}
