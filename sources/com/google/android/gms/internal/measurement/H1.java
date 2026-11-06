package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class H1 extends I2 {
    private static final H1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        H1 h12 = new H1();
        zzc = h12;
        I2.h(H1.class, h12);
    }

    public static G1 B() {
        return (G1) zzc.k();
    }

    public static /* synthetic */ void q(H1 h12, double d6) {
        h12.zze |= 32;
        h12.zzk = d6;
    }

    public static /* synthetic */ void r(H1 h12, long j6) {
        h12.zze |= 8;
        h12.zzi = j6;
    }

    public static /* synthetic */ void s(H1 h12, String str) {
        str.getClass();
        h12.zze |= 2;
        h12.zzg = str;
    }

    public static /* synthetic */ void t(H1 h12) {
        h12.zze &= -33;
        h12.zzk = 0.0d;
    }

    public static /* synthetic */ void v(H1 h12) {
        h12.zze &= -9;
        h12.zzi = 0L;
    }

    public static /* synthetic */ void w(H1 h12, long j6) {
        h12.zze |= 1;
        h12.zzf = j6;
    }

    public static /* synthetic */ void x(H1 h12, String str) {
        str.getClass();
        h12.zze |= 4;
        h12.zzh = str;
    }

    public static /* synthetic */ void z(H1 h12) {
        h12.zze &= -5;
        h12.zzh = zzc.zzh;
    }

    public final long A() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final String D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zze & 32) != 0;
    }

    public final boolean F() {
        return (this.zze & 16) != 0;
    }

    public final boolean G() {
        return (this.zze & 8) != 0;
    }

    public final boolean H() {
        return (this.zze & 1) != 0;
    }

    public final boolean I() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new H1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new G1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (H1.class) {
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

    public final float u() {
        return this.zzj;
    }

    public final long y() {
        return this.zzi;
    }
}
