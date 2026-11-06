package m2;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class G1 extends Y1.a {
    public static final Parcelable.Creator<G1> CREATOR = new X1.M(12);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f10632A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f10633B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Double f10634C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f10637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Long f10638z;

    public G1(int i6, String str, long j6, Long l5, Float f6, String str2, String str3, Double d6) {
        this.f10635w = i6;
        this.f10636x = str;
        this.f10637y = j6;
        this.f10638z = l5;
        if (i6 == 1) {
            this.f10634C = f6 != null ? Double.valueOf(f6.doubleValue()) : null;
        } else {
            this.f10634C = d6;
        }
        this.f10632A = str2;
        this.f10633B = str3;
    }

    public final Object a() {
        Long l5 = this.f10638z;
        if (l5 != null) {
            return l5;
        }
        Double d6 = this.f10634C;
        if (d6 != null) {
            return d6;
        }
        String str = this.f10632A;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f10635w);
        AbstractC1332d.F0(parcel, 2, this.f10636x);
        AbstractC1332d.N0(parcel, 3, 8);
        parcel.writeLong(this.f10637y);
        Long l5 = this.f10638z;
        if (l5 != null) {
            AbstractC1332d.N0(parcel, 4, 8);
            parcel.writeLong(l5.longValue());
        }
        AbstractC1332d.F0(parcel, 6, this.f10632A);
        AbstractC1332d.F0(parcel, 7, this.f10633B);
        Double d6 = this.f10634C;
        if (d6 != null) {
            AbstractC1332d.N0(parcel, 8, 8);
            parcel.writeDouble(d6.doubleValue());
        }
        AbstractC1332d.L0(parcel, iJ0);
    }

    public G1(String str, String str2, long j6, Object obj) {
        AbstractC1332d.g(str);
        this.f10635w = 2;
        this.f10636x = str;
        this.f10637y = j6;
        this.f10633B = str2;
        if (obj == null) {
            this.f10638z = null;
            this.f10634C = null;
            this.f10632A = null;
            return;
        }
        if (obj instanceof Long) {
            this.f10638z = (Long) obj;
            this.f10634C = null;
            this.f10632A = null;
        } else if (obj instanceof String) {
            this.f10638z = null;
            this.f10634C = null;
            this.f10632A = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f10638z = null;
            this.f10634C = (Double) obj;
            this.f10632A = null;
        }
    }

    public G1(I1 i12) {
        this(i12.f10649c, i12.f10648b, i12.f10650d, i12.f10651e);
    }
}
