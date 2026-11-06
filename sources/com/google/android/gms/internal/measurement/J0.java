package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends I2 {
    private static final J0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        J0 j02 = new J0();
        zzc = j02;
        I2.h(J0.class, j02);
    }

    public static J0 r() {
        return zzc;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (A0.f6440a[i6 - 1]) {
            case 1:
                return new J0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                int i7 = 0;
                return new I0(i7, i7);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", N0.f6647a, "zzg", "zzh", "zzi", "zzj"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (J0.class) {
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
        int iB = H1.a.b(this.zzf);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final String s() {
        return this.zzh;
    }

    public final String t() {
        return this.zzj;
    }

    public final String u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 16) != 0;
    }
}
