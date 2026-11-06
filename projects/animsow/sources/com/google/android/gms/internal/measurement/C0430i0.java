package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0430i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU0 = AbstractC1332d.u0(parcel);
        long jH0 = 0;
        long jH02 = 0;
        boolean zD0 = false;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        Bundle bundleU = null;
        String strX4 = null;
        while (parcel.dataPosition() < iU0) {
            int i6 = parcel.readInt();
            switch ((char) i6) {
                case 1:
                    jH0 = AbstractC1332d.h0(parcel, i6);
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    jH02 = AbstractC1332d.h0(parcel, i6);
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    zD0 = AbstractC1332d.d0(parcel, i6);
                    break;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    strX = AbstractC1332d.x(parcel, i6);
                    break;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    strX2 = AbstractC1332d.x(parcel, i6);
                    break;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    strX3 = AbstractC1332d.x(parcel, i6);
                    break;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    bundleU = AbstractC1332d.u(parcel, i6);
                    break;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    strX4 = AbstractC1332d.x(parcel, i6);
                    break;
                default:
                    AbstractC1332d.q0(parcel, i6);
                    break;
            }
        }
        AbstractC1332d.C(parcel, iU0);
        return new C0436j0(jH0, jH02, zD0, strX, strX2, strX3, bundleU, strX4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new C0436j0[i6];
    }
}
