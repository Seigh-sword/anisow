package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class N1 extends I2 {
    private static final N1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private R2 zzf = C0439j3.f6848A;
    private L1 zzg;

    static {
        N1 n12 = new N1();
        zzc = n12;
        I2.h(N1.class, n12);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        H0 h02 = null;
        switch (P1.f6657a[i6 - 1]) {
            case 1:
                return new N1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(16, h02);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", O1.class, "zzg"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (N1.class) {
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

    public final L1 p() {
        L1 l12 = this.zzg;
        return l12 == null ? L1.r() : l12;
    }

    public final R2 r() {
        return this.zzf;
    }
}
