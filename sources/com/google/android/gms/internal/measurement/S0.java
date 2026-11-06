package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends I2 {
    private static final S0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private R2 zzf;
    private R2 zzg;
    private R2 zzh;
    private boolean zzi;
    private R2 zzj;

    static {
        S0 s02 = new S0();
        zzc = s02;
        I2.h(S0.class, s02);
    }

    public S0() {
        C0439j3 c0439j3 = C0439j3.f6848A;
        this.zzf = c0439j3;
        this.zzg = c0439j3;
        this.zzh = c0439j3;
        this.zzj = c0439j3;
    }

    public static S0 q() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        Object obj = null;
        switch (AbstractC0401d1.f6783a[i6 - 1]) {
            case 1:
                return new S0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(3, obj);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", P0.class, "zzg", Q0.class, "zzh", R0.class, "zzi", "zzj", P0.class});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (S0.class) {
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

    public final R2 r() {
        return this.zzh;
    }

    public final List s() {
        return this.zzf;
    }

    public final List t() {
        return this.zzg;
    }

    public final List u() {
        return this.zzj;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }
}
