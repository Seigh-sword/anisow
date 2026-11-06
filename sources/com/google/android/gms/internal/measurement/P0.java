package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends I2 {
    private static final P0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        P0 p02 = new P0();
        zzc = p02;
        I2.h(P0.class, p02);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        Object obj = null;
        switch (AbstractC0401d1.f6783a[i6 - 1]) {
            case 1:
                return new P0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(2, obj);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", C0413f1.f6796a, "zzg", C0407e1.f6789a});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (P0.class) {
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
        int i6;
        int i7 = this.zzg;
        if (i7 != 0) {
            i6 = 2;
            if (i7 != 1) {
                i6 = i7 != 2 ? 0 : 3;
            }
        } else {
            i6 = 1;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final int r() {
        int iC = H1.a.c(this.zzf);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }
}
