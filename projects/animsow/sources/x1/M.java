package X1;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Locale;
import m2.B1;
import m2.C1029d;
import m2.C1038g;
import m2.C1074u;
import m2.C1076v;
import m2.G1;
import m2.r1;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4535a;

    public /* synthetic */ M(int i6) {
        this.f4535a = i6;
    }

    public static void a(C0241i c0241i, Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        int i7 = c0241i.f4615w;
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(i7);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(c0241i.f4616x);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(c0241i.f4617y);
        AbstractC1332d.F0(parcel, 4, c0241i.f4618z);
        AbstractC1332d.z0(parcel, 5, c0241i.f4605A);
        AbstractC1332d.G0(parcel, 6, c0241i.f4606B, i6);
        AbstractC1332d.y0(parcel, 7, c0241i.f4607C);
        AbstractC1332d.D0(parcel, 8, c0241i.f4608D, i6);
        AbstractC1332d.G0(parcel, 10, c0241i.f4609E, i6);
        AbstractC1332d.G0(parcel, 11, c0241i.f4610F, i6);
        AbstractC1332d.N0(parcel, 12, 4);
        parcel.writeInt(c0241i.f4611G ? 1 : 0);
        AbstractC1332d.N0(parcel, 13, 4);
        parcel.writeInt(c0241i.f4612H);
        boolean z5 = c0241i.f4613I;
        AbstractC1332d.N0(parcel, 14, 4);
        parcel.writeInt(z5 ? 1 : 0);
        AbstractC1332d.F0(parcel, 15, c0241i.f4614J);
        AbstractC1332d.L0(parcel, iJ0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jH0 = 0;
        int iG0 = 0;
        int iG02 = 0;
        int iG03 = 0;
        int iG04 = 0;
        int iG05 = 0;
        boolean zD0 = false;
        boolean zD02 = false;
        int iG06 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundleU = null;
        U1.b bVar = null;
        x xVar = null;
        Intent intent = null;
        String strX = null;
        Bundle bundleU2 = null;
        Bundle bundleU3 = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        switch (this.f4535a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int iU0 = AbstractC1332d.u0(parcel);
                boolean zD03 = false;
                boolean zD04 = false;
                int iG07 = 0;
                C0246n c0246n = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iU0) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            c0246n = (C0246n) AbstractC1332d.w(parcel, i6, C0246n.CREATOR);
                            break;
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            zD03 = AbstractC1332d.d0(parcel, i6);
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            zD04 = AbstractC1332d.d0(parcel, i6);
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            int iM0 = AbstractC1332d.m0(parcel, i6);
                            int iDataPosition = parcel.dataPosition();
                            if (iM0 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iM0);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            iG07 = AbstractC1332d.g0(parcel, i6);
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            int iM02 = AbstractC1332d.m0(parcel, i6);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM02 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iM02);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            AbstractC1332d.q0(parcel, i6);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU0);
                return new C0240h(c0246n, zD03, zD04, iArr, iG07, iArr2);
            case 1:
                int iU02 = AbstractC1332d.u0(parcel);
                Scope[] scopeArr = C0241i.f4603K;
                Bundle bundle = new Bundle();
                U1.d[] dVarArr = C0241i.f4604L;
                U1.d[] dVarArr2 = dVarArr;
                int iG08 = 0;
                int iG09 = 0;
                int iG010 = 0;
                boolean zD05 = false;
                int iG011 = 0;
                boolean zD06 = false;
                String strX5 = null;
                IBinder iBinderF0 = null;
                Account account = null;
                String strX6 = null;
                while (parcel.dataPosition() < iU02) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iG08 = AbstractC1332d.g0(parcel, i7);
                            break;
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            iG09 = AbstractC1332d.g0(parcel, i7);
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            iG010 = AbstractC1332d.g0(parcel, i7);
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            strX5 = AbstractC1332d.x(parcel, i7);
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            iBinderF0 = AbstractC1332d.f0(parcel, i7);
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) AbstractC1332d.y(parcel, i7, Scope.CREATOR);
                            break;
                        case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle = AbstractC1332d.u(parcel, i7);
                            break;
                        case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                            account = (Account) AbstractC1332d.w(parcel, i7, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC1332d.q0(parcel, i7);
                            break;
                        case '\n':
                            dVarArr = (U1.d[]) AbstractC1332d.y(parcel, i7, U1.d.CREATOR);
                            break;
                        case 11:
                            dVarArr2 = (U1.d[]) AbstractC1332d.y(parcel, i7, U1.d.CREATOR);
                            break;
                        case '\f':
                            zD05 = AbstractC1332d.d0(parcel, i7);
                            break;
                        case '\r':
                            iG011 = AbstractC1332d.g0(parcel, i7);
                            break;
                        case 14:
                            zD06 = AbstractC1332d.d0(parcel, i7);
                            break;
                        case 15:
                            strX6 = AbstractC1332d.x(parcel, i7);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU02);
                return new C0241i(iG08, iG09, iG010, strX5, iBinderF0, scopeArr, bundle, account, dVarArr, dVarArr2, zD05, iG011, zD06, strX6);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                int iU03 = AbstractC1332d.u0(parcel);
                int iG012 = 0;
                String strX7 = null;
                while (parcel.dataPosition() < iU03) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iG0 = AbstractC1332d.g0(parcel, i8);
                    } else if (c6 == 2) {
                        iG012 = AbstractC1332d.g0(parcel, i8);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) AbstractC1332d.w(parcel, i8, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        AbstractC1332d.q0(parcel, i8);
                    } else {
                        strX7 = AbstractC1332d.x(parcel, i8);
                    }
                }
                AbstractC1332d.C(parcel, iU03);
                return new U1.b(iG0, iG012, pendingIntent, strX7);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                int iU04 = AbstractC1332d.u0(parcel);
                long jH02 = -1;
                while (parcel.dataPosition() < iU04) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        strX4 = AbstractC1332d.x(parcel, i9);
                    } else if (c7 == 2) {
                        iG06 = AbstractC1332d.g0(parcel, i9);
                    } else if (c7 != 3) {
                        AbstractC1332d.q0(parcel, i9);
                    } else {
                        jH02 = AbstractC1332d.h0(parcel, i9);
                    }
                }
                AbstractC1332d.C(parcel, iU04);
                return new U1.d(iG06, jH02, strX4);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                int iU05 = AbstractC1332d.u0(parcel);
                boolean zD07 = false;
                boolean zD08 = false;
                boolean zD09 = false;
                boolean zD010 = false;
                String strX8 = null;
                IBinder iBinderF02 = null;
                while (parcel.dataPosition() < iU05) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            strX8 = AbstractC1332d.x(parcel, i10);
                            break;
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            zD07 = AbstractC1332d.d0(parcel, i10);
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            zD08 = AbstractC1332d.d0(parcel, i10);
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            iBinderF02 = AbstractC1332d.f0(parcel, i10);
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            zD09 = AbstractC1332d.d0(parcel, i10);
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            zD010 = AbstractC1332d.d0(parcel, i10);
                            break;
                        default:
                            AbstractC1332d.q0(parcel, i10);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU05);
                return new U1.s(strX8, zD07, zD08, iBinderF02, zD09, zD010);
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                int iU06 = AbstractC1332d.u0(parcel);
                int iG013 = 0;
                int iG014 = 0;
                while (parcel.dataPosition() < iU06) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        zD02 = AbstractC1332d.d0(parcel, i11);
                    } else if (c8 == 2) {
                        strX3 = AbstractC1332d.x(parcel, i11);
                    } else if (c8 == 3) {
                        iG013 = AbstractC1332d.g0(parcel, i11);
                    } else if (c8 != 4) {
                        AbstractC1332d.q0(parcel, i11);
                    } else {
                        iG014 = AbstractC1332d.g0(parcel, i11);
                    }
                }
                AbstractC1332d.C(parcel, iU06);
                return new U1.t(iG013, iG014, strX3, zD02);
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                int iU07 = AbstractC1332d.u0(parcel);
                boolean zD011 = false;
                IBinder iBinderF03 = null;
                while (parcel.dataPosition() < iU07) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        strX2 = AbstractC1332d.x(parcel, i12);
                    } else if (c9 == 2) {
                        iBinderF03 = AbstractC1332d.f0(parcel, i12);
                    } else if (c9 == 3) {
                        zD0 = AbstractC1332d.d0(parcel, i12);
                    } else if (c9 != 4) {
                        AbstractC1332d.q0(parcel, i12);
                    } else {
                        zD011 = AbstractC1332d.d0(parcel, i12);
                    }
                }
                AbstractC1332d.C(parcel, iU07);
                return new U1.u(strX2, iBinderF03, zD0, zD011);
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int iU08 = AbstractC1332d.u0(parcel);
                long jH03 = 0;
                long jH04 = 0;
                long jH05 = 0;
                boolean zD012 = false;
                String strX9 = null;
                String strX10 = null;
                G1 g12 = null;
                String strX11 = null;
                C1076v c1076v = null;
                C1076v c1076v2 = null;
                C1076v c1076v3 = null;
                while (parcel.dataPosition() < iU08) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            strX9 = AbstractC1332d.x(parcel, i13);
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            strX10 = AbstractC1332d.x(parcel, i13);
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            g12 = (G1) AbstractC1332d.w(parcel, i13, G1.CREATOR);
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            jH03 = AbstractC1332d.h0(parcel, i13);
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            zD012 = AbstractC1332d.d0(parcel, i13);
                            break;
                        case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strX11 = AbstractC1332d.x(parcel, i13);
                            break;
                        case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                            c1076v = (C1076v) AbstractC1332d.w(parcel, i13, C1076v.CREATOR);
                            break;
                        case '\t':
                            jH04 = AbstractC1332d.h0(parcel, i13);
                            break;
                        case '\n':
                            c1076v2 = (C1076v) AbstractC1332d.w(parcel, i13, C1076v.CREATOR);
                            break;
                        case 11:
                            jH05 = AbstractC1332d.h0(parcel, i13);
                            break;
                        case '\f':
                            c1076v3 = (C1076v) AbstractC1332d.w(parcel, i13, C1076v.CREATOR);
                            break;
                        default:
                            AbstractC1332d.q0(parcel, i13);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU08);
                return new C1029d(strX9, strX10, g12, jH03, zD012, strX11, c1076v, jH04, c1076v2, jH05, c1076v3);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                int iU09 = AbstractC1332d.u0(parcel);
                while (parcel.dataPosition() < iU09) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        AbstractC1332d.q0(parcel, i14);
                    } else {
                        bundleU3 = AbstractC1332d.u(parcel, i14);
                    }
                }
                AbstractC1332d.C(parcel, iU09);
                return new C1038g(bundleU3);
            case 9:
                int iU010 = AbstractC1332d.u0(parcel);
                while (parcel.dataPosition() < iU010) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        AbstractC1332d.q0(parcel, i15);
                    } else {
                        bundleU2 = AbstractC1332d.u(parcel, i15);
                    }
                }
                AbstractC1332d.C(parcel, iU010);
                return new C1074u(bundleU2);
            case 10:
                int iU011 = AbstractC1332d.u0(parcel);
                long jH06 = 0;
                String strX12 = null;
                C1074u c1074u = null;
                String strX13 = null;
                while (parcel.dataPosition() < iU011) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 2) {
                        strX12 = AbstractC1332d.x(parcel, i16);
                    } else if (c10 == 3) {
                        c1074u = (C1074u) AbstractC1332d.w(parcel, i16, C1074u.CREATOR);
                    } else if (c10 == 4) {
                        strX13 = AbstractC1332d.x(parcel, i16);
                    } else if (c10 != 5) {
                        AbstractC1332d.q0(parcel, i16);
                    } else {
                        jH06 = AbstractC1332d.h0(parcel, i16);
                    }
                }
                AbstractC1332d.C(parcel, iU011);
                return new C1076v(strX12, c1074u, strX13, jH06);
            case 11:
                int iU012 = AbstractC1332d.u0(parcel);
                while (parcel.dataPosition() < iU012) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        strX = AbstractC1332d.x(parcel, i17);
                    } else if (c11 == 2) {
                        jH0 = AbstractC1332d.h0(parcel, i17);
                    } else if (c11 != 3) {
                        AbstractC1332d.q0(parcel, i17);
                    } else {
                        iG05 = AbstractC1332d.g0(parcel, i17);
                    }
                }
                AbstractC1332d.C(parcel, iU012);
                return new r1(iG05, jH0, strX);
            case 12:
                int iU013 = AbstractC1332d.u0(parcel);
                long jH07 = 0;
                int iG015 = 0;
                String strX14 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strX15 = null;
                String strX16 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iU013) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iG015 = AbstractC1332d.g0(parcel, i18);
                            break;
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            strX14 = AbstractC1332d.x(parcel, i18);
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            jH07 = AbstractC1332d.h0(parcel, i18);
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            int iM03 = AbstractC1332d.m0(parcel, i18);
                            if (iM03 != 0) {
                                AbstractC1332d.K0(parcel, iM03, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            int iM04 = AbstractC1332d.m0(parcel, i18);
                            if (iM04 != 0) {
                                AbstractC1332d.K0(parcel, iM04, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            strX15 = AbstractC1332d.x(parcel, i18);
                            break;
                        case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            strX16 = AbstractC1332d.x(parcel, i18);
                            break;
                        case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                            int iM05 = AbstractC1332d.m0(parcel, i18);
                            if (iM05 != 0) {
                                AbstractC1332d.K0(parcel, iM05, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            AbstractC1332d.q0(parcel, i18);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU013);
                return new G1(iG015, strX14, jH07, lValueOf, fValueOf, strX15, strX16, dValueOf);
            case 13:
                int iU014 = AbstractC1332d.u0(parcel);
                long jH08 = 0;
                long jH09 = 0;
                long jH010 = 0;
                long jH011 = 0;
                long jH012 = 0;
                long jH013 = 0;
                long jH014 = 0;
                String strX17 = "";
                String strX18 = strX17;
                String strX19 = strX18;
                String strX20 = strX19;
                boolean zD013 = true;
                boolean zD014 = true;
                int iG016 = 100;
                boolean zD015 = false;
                int iG017 = 0;
                boolean zD016 = false;
                boolean zD017 = false;
                int iG018 = 0;
                String strX21 = null;
                String strX22 = null;
                String strX23 = null;
                String strX24 = null;
                String strX25 = null;
                String strX26 = null;
                String strX27 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList = null;
                String strX28 = null;
                String strX29 = null;
                String strX30 = null;
                long jH015 = -2147483648L;
                while (parcel.dataPosition() < iU014) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            strX21 = AbstractC1332d.x(parcel, i19);
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            strX22 = AbstractC1332d.x(parcel, i19);
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            strX23 = AbstractC1332d.x(parcel, i19);
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            strX24 = AbstractC1332d.x(parcel, i19);
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            jH08 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            jH09 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                            strX25 = AbstractC1332d.x(parcel, i19);
                            break;
                        case '\t':
                            zD013 = AbstractC1332d.d0(parcel, i19);
                            break;
                        case '\n':
                            zD015 = AbstractC1332d.d0(parcel, i19);
                            break;
                        case 11:
                            jH015 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case '\f':
                            strX26 = AbstractC1332d.x(parcel, i19);
                            break;
                        case '\r':
                            jH010 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case 14:
                            jH011 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case 15:
                            iG017 = AbstractC1332d.g0(parcel, i19);
                            break;
                        case 16:
                            zD014 = AbstractC1332d.d0(parcel, i19);
                            break;
                        case 17:
                        case 20:
                        case '!':
                        default:
                            AbstractC1332d.q0(parcel, i19);
                            break;
                        case 18:
                            zD016 = AbstractC1332d.d0(parcel, i19);
                            break;
                        case 19:
                            strX27 = AbstractC1332d.x(parcel, i19);
                            break;
                        case 21:
                            int iM06 = AbstractC1332d.m0(parcel, i19);
                            if (iM06 != 0) {
                                AbstractC1332d.K0(parcel, iM06, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case 22:
                            jH012 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case 23:
                            int iM07 = AbstractC1332d.m0(parcel, i19);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iM07 != 0) {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition3 + iM07);
                                arrayList = arrayListCreateStringArrayList;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 24:
                            strX28 = AbstractC1332d.x(parcel, i19);
                            break;
                        case 25:
                            strX17 = AbstractC1332d.x(parcel, i19);
                            break;
                        case 26:
                            strX18 = AbstractC1332d.x(parcel, i19);
                            break;
                        case 27:
                            strX29 = AbstractC1332d.x(parcel, i19);
                            break;
                        case 28:
                            zD017 = AbstractC1332d.d0(parcel, i19);
                            break;
                        case 29:
                            jH013 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case 30:
                            iG016 = AbstractC1332d.g0(parcel, i19);
                            break;
                        case 31:
                            strX19 = AbstractC1332d.x(parcel, i19);
                            break;
                        case ' ':
                            iG018 = AbstractC1332d.g0(parcel, i19);
                            break;
                        case '\"':
                            jH014 = AbstractC1332d.h0(parcel, i19);
                            break;
                        case '#':
                            strX30 = AbstractC1332d.x(parcel, i19);
                            break;
                        case '$':
                            strX20 = AbstractC1332d.x(parcel, i19);
                            break;
                    }
                }
                AbstractC1332d.C(parcel, iU014);
                return new B1(strX21, strX22, strX23, strX24, jH08, jH09, strX25, zD013, zD015, jH015, strX26, jH010, jH011, iG017, zD014, zD016, strX27, boolValueOf, jH012, arrayList, strX28, strX17, strX18, strX29, zD017, jH013, iG016, strX19, iG018, jH014, strX30, strX20);
            case 14:
                int iU015 = AbstractC1332d.u0(parcel);
                int iG019 = 0;
                while (parcel.dataPosition() < iU015) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iG04 = AbstractC1332d.g0(parcel, i20);
                    } else if (c12 == 2) {
                        iG019 = AbstractC1332d.g0(parcel, i20);
                    } else if (c12 != 3) {
                        AbstractC1332d.q0(parcel, i20);
                    } else {
                        intent = (Intent) AbstractC1332d.w(parcel, i20, Intent.CREATOR);
                    }
                }
                AbstractC1332d.C(parcel, iU015);
                return new o2.b(iG04, iG019, intent);
            case 15:
                int iU016 = AbstractC1332d.u0(parcel);
                ArrayList<String> arrayList2 = null;
                String strX31 = null;
                while (parcel.dataPosition() < iU016) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        int iM08 = AbstractC1332d.m0(parcel, i21);
                        int iDataPosition4 = parcel.dataPosition();
                        if (iM08 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition4 + iM08);
                            arrayList2 = arrayListCreateStringArrayList2;
                        }
                    } else if (c13 != 2) {
                        AbstractC1332d.q0(parcel, i21);
                    } else {
                        strX31 = AbstractC1332d.x(parcel, i21);
                    }
                }
                AbstractC1332d.C(parcel, iU016);
                return new o2.g(strX31, arrayList2);
            case 16:
                int iU017 = AbstractC1332d.u0(parcel);
                while (parcel.dataPosition() < iU017) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        iG03 = AbstractC1332d.g0(parcel, i22);
                    } else if (c14 != 2) {
                        AbstractC1332d.q0(parcel, i22);
                    } else {
                        xVar = (x) AbstractC1332d.w(parcel, i22, x.CREATOR);
                    }
                }
                AbstractC1332d.C(parcel, iU017);
                return new o2.h(iG03, xVar);
            case 17:
                int iU018 = AbstractC1332d.u0(parcel);
                y yVar = null;
                while (parcel.dataPosition() < iU018) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        iG02 = AbstractC1332d.g0(parcel, i23);
                    } else if (c15 == 2) {
                        bVar = (U1.b) AbstractC1332d.w(parcel, i23, U1.b.CREATOR);
                    } else if (c15 != 3) {
                        AbstractC1332d.q0(parcel, i23);
                    } else {
                        yVar = (y) AbstractC1332d.w(parcel, i23, y.CREATOR);
                    }
                }
                AbstractC1332d.C(parcel, iU018);
                return new o2.i(iG02, bVar, yVar);
            case 18:
                u2.b bVar2 = new u2.b();
                bVar2.f12883E = 255;
                bVar2.f12885G = -2;
                bVar2.f12886H = -2;
                bVar2.f12887I = -2;
                bVar2.f12894P = Boolean.TRUE;
                bVar2.f12905w = parcel.readInt();
                bVar2.f12906x = (Integer) parcel.readSerializable();
                bVar2.f12907y = (Integer) parcel.readSerializable();
                bVar2.f12908z = (Integer) parcel.readSerializable();
                bVar2.f12879A = (Integer) parcel.readSerializable();
                bVar2.f12880B = (Integer) parcel.readSerializable();
                bVar2.f12881C = (Integer) parcel.readSerializable();
                bVar2.f12882D = (Integer) parcel.readSerializable();
                bVar2.f12883E = parcel.readInt();
                bVar2.f12884F = parcel.readString();
                bVar2.f12885G = parcel.readInt();
                bVar2.f12886H = parcel.readInt();
                bVar2.f12887I = parcel.readInt();
                bVar2.f12889K = parcel.readString();
                bVar2.f12890L = parcel.readString();
                bVar2.f12891M = parcel.readInt();
                bVar2.f12893O = (Integer) parcel.readSerializable();
                bVar2.f12895Q = (Integer) parcel.readSerializable();
                bVar2.f12896R = (Integer) parcel.readSerializable();
                bVar2.f12897S = (Integer) parcel.readSerializable();
                bVar2.f12898T = (Integer) parcel.readSerializable();
                bVar2.f12899U = (Integer) parcel.readSerializable();
                bVar2.f12900V = (Integer) parcel.readSerializable();
                bVar2.f12903Y = (Integer) parcel.readSerializable();
                bVar2.f12901W = (Integer) parcel.readSerializable();
                bVar2.f12902X = (Integer) parcel.readSerializable();
                bVar2.f12894P = (Boolean) parcel.readSerializable();
                bVar2.f12888J = (Locale) parcel.readSerializable();
                bVar2.f12904Z = (Boolean) parcel.readSerializable();
                return bVar2;
            case 19:
                C2.a aVar = new C2.a(parcel);
                aVar.f137w = ((Integer) parcel.readValue(C2.a.class.getClassLoader())).intValue();
                return aVar;
            case 20:
                return new com.google.android.material.datepicker.c((com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), (com.google.android.material.datepicker.b) parcel.readParcelable(com.google.android.material.datepicker.b.class.getClassLoader()), (com.google.android.material.datepicker.n) parcel.readParcelable(com.google.android.material.datepicker.n.class.getClassLoader()), parcel.readInt());
            case 21:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 22:
                return com.google.android.material.datepicker.n.a(parcel.readInt(), parcel.readInt());
            case 23:
                J2.f fVar = new J2.f();
                fVar.f1319w = parcel.readInt();
                fVar.f1320x = (H2.f) parcel.readParcelable(J2.f.class.getClassLoader());
                return fVar;
            case 24:
                return new com.google.android.material.timepicker.g(parcel);
            default:
                int iU019 = AbstractC1332d.u0(parcel);
                while (parcel.dataPosition() < iU019) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 2) {
                        AbstractC1332d.q0(parcel, i24);
                    } else {
                        bundleU = AbstractC1332d.u(parcel, i24);
                    }
                }
                AbstractC1332d.C(parcel, iU019);
                return new J3.u(bundleU);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f4535a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C0240h[i6];
            case 1:
                return new C0241i[i6];
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new U1.b[i6];
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new U1.d[i6];
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return new U1.s[i6];
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return new U1.t[i6];
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new U1.u[i6];
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1029d[i6];
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                return new C1038g[i6];
            case 9:
                return new C1074u[i6];
            case 10:
                return new C1076v[i6];
            case 11:
                return new r1[i6];
            case 12:
                return new G1[i6];
            case 13:
                return new B1[i6];
            case 14:
                return new o2.b[i6];
            case 15:
                return new o2.g[i6];
            case 16:
                return new o2.h[i6];
            case 17:
                return new o2.i[i6];
            case 18:
                return new u2.b[i6];
            case 19:
                return new C2.a[i6];
            case 20:
                return new com.google.android.material.datepicker.c[i6];
            case 21:
                return new com.google.android.material.datepicker.d[i6];
            case 22:
                return new com.google.android.material.datepicker.n[i6];
            case 23:
                return new J2.f[i6];
            case 24:
                return new com.google.android.material.timepicker.g[i6];
            default:
                return new J3.u[i6];
        }
    }
}
