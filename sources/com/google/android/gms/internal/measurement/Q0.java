package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends I2 {
    private static final Q0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        Q0 q02 = new Q0();
        zzc = q02;
        I2.h(Q0.class, q02);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        Object obj = null;
        switch (AbstractC0401d1.f6783a[i6 - 1]) {
            case 1:
                return new Q0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(4, obj);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                C0413f1 c0413f1 = C0413f1.f6796a;
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", c0413f1, "zzg", c0413f1});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (Q0.class) {
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

    public final int q() {
        int iC = H1.a.c(this.zzg);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public final int r() {
        int iC = H1.a.c(this.zzf);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }
}
