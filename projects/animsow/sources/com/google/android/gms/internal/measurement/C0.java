package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends I2 {
    private static final C0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private R2 zzg;
    private R2 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C0 c02 = new C0();
        zzc = c02;
        I2.h(C0.class, c02);
    }

    public C0() {
        C0439j3 c0439j3 = C0439j3.f6848A;
        this.zzg = c0439j3;
        this.zzh = c0439j3;
    }

    public static void r(C0 c02, int i6, E0 e02) {
        R2 r22 = c02.zzh;
        if (!((AbstractC0485r2) r22).f6940w) {
            c02.zzh = r22.d(r22.size() << 1);
        }
        c02.zzh.set(i6, e02);
    }

    public static void s(C0 c02, int i6, L0 l02) {
        R2 r22 = c02.zzg;
        if (!((AbstractC0485r2) r22).f6940w) {
            c02.zzg = r22.d(r22.size() << 1);
        }
        c02.zzg.set(i6, l02);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (A0.f6440a[i6 - 1]) {
            case 1:
                return new C0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new B0(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", L0.class, "zzh", E0.class, "zzi", "zzj"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0.class) {
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

    public final E0 q(int i6) {
        return (E0) this.zzh.get(i6);
    }

    public final int t() {
        return this.zzh.size();
    }

    public final L0 u(int i6) {
        return (L0) this.zzg.get(i6);
    }

    public final int v() {
        return this.zzg.size();
    }

    public final List w() {
        return this.zzh;
    }

    public final List x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
