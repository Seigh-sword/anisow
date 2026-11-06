package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends I2 {
    private static final V0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        V0 v02 = new V0();
        zzc = v02;
        I2.h(V0.class, v02);
    }

    public static /* synthetic */ void q(V0 v02, String str) {
        str.getClass();
        v02.zze |= 1;
        v02.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0401d1.f6783a[i6 - 1]) {
            case 1:
                return new V0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new U0(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (V0.class) {
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
        return this.zzi;
    }

    public final String r() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return (this.zze & 2) != 0;
    }

    public final boolean v() {
        return (this.zze & 4) != 0;
    }

    public final boolean w() {
        return (this.zze & 8) != 0;
    }
}
