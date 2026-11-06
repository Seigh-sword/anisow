package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends I2 {
    private static final E0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private R2 zzh = C0439j3.f6848A;
    private boolean zzi;
    private J0 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        E0 e02 = new E0();
        zzc = e02;
        I2.h(E0.class, e02);
    }

    public static void r(E0 e02, int i6, G0 g02) {
        R2 r22 = e02.zzh;
        if (!((AbstractC0485r2) r22).f6940w) {
            e02.zzh = r22.d(r22.size() << 1);
        }
        e02.zzh.set(i6, g02);
    }

    public static /* synthetic */ void s(E0 e02, String str) {
        e02.zze |= 2;
        e02.zzg = str;
    }

    public static D0 u() {
        return (D0) zzc.k();
    }

    public final boolean A() {
        return this.zzm;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    public final boolean D() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (A0.f6440a[i6 - 1]) {
            case 1:
                return new E0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new D0(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", G0.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (E0.class) {
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
        return this.zzh.size();
    }

    public final G0 q(int i6) {
        return (G0) this.zzh.get(i6);
    }

    public final int t() {
        return this.zzf;
    }

    public final J0 v() {
        J0 j02 = this.zzj;
        return j02 == null ? J0.r() : j02;
    }

    public final String w() {
        return this.zzg;
    }

    public final R2 x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzk;
    }

    public final boolean z() {
        return this.zzl;
    }
}
