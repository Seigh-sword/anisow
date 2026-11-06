package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends I2 {
    private static final F1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private N2 zzg = V2.f6718A;

    static {
        F1 f12 = new F1();
        zzc = f12;
        I2.h(F1.class, f12);
    }

    public static /* synthetic */ void r(F1 f12, int i6) {
        f12.zze |= 1;
        f12.zzf = i6;
    }

    public static void s(F1 f12, List list) {
        R2 r22 = f12.zzg;
        if (!((AbstractC0485r2) r22).f6940w) {
            f12.zzg = ((V2) r22).d(r22.size() << 1);
        }
        AbstractC0474p2.b(list, f12.zzg);
    }

    public static E1 u() {
        return (E1) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new F1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new E1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (F1.class) {
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
        return this.zzg.size();
    }

    public final long q(int i6) {
        return ((V2) this.zzg).f(i6);
    }

    public final int t() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }
}
