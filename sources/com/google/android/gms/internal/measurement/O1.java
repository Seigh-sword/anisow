package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O1 extends I2 {
    private static final O1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private R2 zzg = C0439j3.f6848A;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        O1 o12 = new O1();
        zzc = o12;
        I2.h(O1.class, o12);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        H0 h02 = null;
        switch (P1.f6657a[i6 - 1]) {
            case 1:
                return new O1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(17, h02);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", Q1.f6664a, "zzg", O1.class, "zzh", "zzi", "zzj", "zzk"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (O1.class) {
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

    public final double p() {
        return this.zzk;
    }

    public final int q() {
        int iD = H1.a.d(this.zzf);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }

    public final String s() {
        return this.zzh;
    }

    public final String t() {
        return this.zzi;
    }

    public final List u() {
        return this.zzg;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final boolean w() {
        return (this.zze & 8) != 0;
    }

    public final boolean x() {
        return (this.zze & 16) != 0;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }
}
