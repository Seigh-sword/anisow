package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends I2 {
    private static final M0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private R2 zzi = C0439j3.f6848A;

    static {
        M0 m02 = new M0();
        zzc = m02;
        I2.h(M0.class, m02);
    }

    public static M0 s() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        int i7 = 1;
        switch (A0.f6440a[i6 - 1]) {
            case 1:
                return new M0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(i7, 0);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", O0.f6650a, "zzg", "zzh", "zzi"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (M0.class) {
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
        return this.zzi.size();
    }

    public final int q() {
        int i6;
        switch (this.zzf) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                i6 = 1;
                break;
            case 1:
                i6 = 2;
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                i6 = 3;
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                i6 = 4;
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                i6 = 5;
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                i6 = 6;
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                i6 = 7;
                break;
            default:
                i6 = 0;
                break;
        }
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final String t() {
        return this.zzg;
    }

    public final List u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return (this.zze & 4) != 0;
    }

    public final boolean x() {
        return (this.zze & 2) != 0;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
