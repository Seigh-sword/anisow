package m;

import android.os.Parcel;
import android.os.Parcelable;
import t2.C1342a;
import y2.C1502d;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10271a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10271a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new h1(parcel, null);
            case 1:
                return new B.g(parcel, null);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (parcel.readParcelable(null) == null) {
                    return U.b.f3568x;
                }
                throw new IllegalStateException("superState must be null");
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new v0.o0(parcel, null);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return new C1342a(parcel, null);
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return new C1502d(parcel, (ClassLoader) null);
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new z2.b(parcel, null);
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new H2.a(parcel, null);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return new H2.f(parcel, null);
            case 9:
                return new J2.j(parcel, null);
            case 10:
                return new Q2.e(parcel, (ClassLoader) null);
            default:
                return new S2.z(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f10271a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new h1[i6];
            case 1:
                return new B.g[i6];
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new U.b[i6];
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new v0.o0[i6];
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return new C1342a[i6];
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return new C1502d[i6];
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new z2.b[i6];
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new H2.a[i6];
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return new H2.f[i6];
            case 9:
                return new J2.j[i6];
            case 10:
                return new Q2.e[i6];
            default:
                return new S2.z[i6];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f10271a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new h1(parcel, classLoader);
            case 1:
                return new B.g(parcel, classLoader);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return U.b.f3568x;
                }
                throw new IllegalStateException("superState must be null");
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new v0.o0(parcel, classLoader);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return new C1342a(parcel, classLoader);
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return new C1502d(parcel, classLoader);
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new z2.b(parcel, classLoader);
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new H2.a(parcel, classLoader);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return new H2.f(parcel, classLoader);
            case 9:
                return new J2.j(parcel, classLoader);
            case 10:
                return new Q2.e(parcel, classLoader);
            default:
                return new S2.z(parcel, classLoader);
        }
    }
}
