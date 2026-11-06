package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends I2 {
    private static final G0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private M0 zzf;
    private J0 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        G0 g02 = new G0();
        zzc = g02;
        I2.h(G0.class, g02);
    }

    public static /* synthetic */ void p(G0 g02, String str) {
        g02.zze |= 8;
        g02.zzi = str;
    }

    public static G0 q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (A0.f6440a[i6 - 1]) {
            case 1:
                return new G0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new F0(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (G0.class) {
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

    public final J0 r() {
        J0 j02 = this.zzg;
        return j02 == null ? J0.r() : j02;
    }

    public final M0 s() {
        M0 m02 = this.zzf;
        return m02 == null ? M0.s() : m02;
    }

    public final String t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zze & 4) != 0;
    }

    public final boolean w() {
        return (this.zze & 2) != 0;
    }

    public final boolean x() {
        return (this.zze & 8) != 0;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
