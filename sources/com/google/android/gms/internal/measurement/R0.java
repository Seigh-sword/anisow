package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends I2 {
    private static final R0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        R0 r02 = new R0();
        zzc = r02;
        I2.h(R0.class, r02);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        Object obj = null;
        switch (AbstractC0401d1.f6783a[i6 - 1]) {
            case 1:
                return new R0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(5, obj);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (R0.class) {
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
}
