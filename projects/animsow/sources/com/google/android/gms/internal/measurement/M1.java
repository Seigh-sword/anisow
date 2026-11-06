package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class M1 extends I2 {
    private static final M1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private String zzf = "";
    private R2 zzg = C0439j3.f6848A;

    static {
        M1 m12 = new M1();
        zzc = m12;
        I2.h(M1.class, m12);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        H0 h02 = null;
        switch (P1.f6657a[i6 - 1]) {
            case 1:
                return new M1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(15, h02);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", O1.class});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (M1.class) {
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

    public final String q() {
        return this.zzf;
    }

    public final R2 r() {
        return this.zzg;
    }
}
