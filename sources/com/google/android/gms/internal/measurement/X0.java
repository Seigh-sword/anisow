package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends I2 {
    private static final X0 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private R2 zzi;
    private R2 zzj;
    private R2 zzk;
    private String zzl;
    private boolean zzm;
    private R2 zzn;
    private R2 zzo;
    private String zzp;
    private String zzq;
    private S0 zzr;
    private Z0 zzs;
    private C0395c1 zzt;
    private C0383a1 zzu;
    private Y0 zzv;

    static {
        X0 x02 = new X0();
        zzc = x02;
        I2.h(X0.class, x02);
    }

    public X0() {
        C0439j3 c0439j3 = C0439j3.f6848A;
        this.zzi = c0439j3;
        this.zzj = c0439j3;
        this.zzk = c0439j3;
        this.zzl = "";
        this.zzn = c0439j3;
        this.zzo = c0439j3;
        this.zzp = "";
        this.zzq = "";
    }

    public static void r(X0 x02) {
        x02.zzk = C0439j3.f6848A;
    }

    public static void s(X0 x02, int i6, V0 v02) {
        R2 r22 = x02.zzj;
        if (!((AbstractC0485r2) r22).f6940w) {
            x02.zzj = r22.d(r22.size() << 1);
        }
        x02.zzj.set(i6, v02);
    }

    public static W0 w() {
        return (W0) zzc.k();
    }

    public static X0 x() {
        return zzc;
    }

    public final String A() {
        return this.zzp;
    }

    public final List B() {
        return this.zzk;
    }

    public final R2 C() {
        return this.zzo;
    }

    public final R2 D() {
        return this.zzn;
    }

    public final R2 E() {
        return this.zzi;
    }

    public final boolean F() {
        return (this.zze & 128) != 0;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final boolean H() {
        return (this.zze & 512) != 0;
    }

    public final boolean I() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0401d1.f6783a[i6 - 1]) {
            case 1:
                return new X0();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new W0(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C0389b1.class, "zzj", V0.class, "zzk", C0.class, "zzl", "zzm", "zzn", N1.class, "zzo", T0.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (X0.class) {
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
        return this.zzn.size();
    }

    public final V0 q(int i6) {
        return (V0) this.zzj.get(i6);
    }

    public final int t() {
        return this.zzj.size();
    }

    public final long u() {
        return this.zzf;
    }

    public final S0 v() {
        S0 s02 = this.zzr;
        return s02 == null ? S0.q() : s02;
    }

    public final C0395c1 y() {
        C0395c1 c0395c1 = this.zzt;
        return c0395c1 == null ? C0395c1.r() : c0395c1;
    }

    public final String z() {
        return this.zzg;
    }
}
