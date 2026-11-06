package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends I2 {
    private static final L0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private G0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        L0 l02 = new L0();
        zzc = l02;
        I2.h(L0.class, l02);
    }

    public static /* synthetic */ void q(L0 l02, String str) {
        l02.zze |= 2;
        l02.zzg = str;
    }

    public static K0 s() {
        return (K0) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (A0.f6440a[i6 - 1]) {
            case 1:
                return new L0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new K0(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (L0.class) {
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
        return this.zzf;
    }

    public final G0 r() {
        G0 g02 = this.zzh;
        return g02 == null ? G0.q() : g02;
    }

    public final String t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final boolean w() {
        return this.zzk;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }

    public final boolean y() {
        return (this.zze & 32) != 0;
    }
}
