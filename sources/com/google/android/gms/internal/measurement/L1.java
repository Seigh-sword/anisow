package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L1 extends I2 {
    private static final L1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private R2 zze = C0439j3.f6848A;

    static {
        L1 l12 = new L1();
        zzc = l12;
        I2.h(L1.class, l12);
    }

    public static L1 r() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        H0 h02 = null;
        switch (P1.f6657a[i6 - 1]) {
            case 1:
                return new L1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(14, h02);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", M1.class});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (L1.class) {
                        try {
                            j22 = zzd;
                            if (j22 == null) {
                                j22 = new J2();
                                zzd = j22;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return j22;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int p() {
        return this.zze.size();
    }

    public final List s() {
        return this.zze;
    }
}
