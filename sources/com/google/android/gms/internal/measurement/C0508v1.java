package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0508v1 extends I2 {
    private static final C0508v1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private R2 zzk = C0439j3.f6848A;

    static {
        C0508v1 c0508v1 = new C0508v1();
        zzc = c0508v1;
        I2.h(C0508v1.class, c0508v1);
    }

    public static void A(C0508v1 c0508v1) {
        c0508v1.zzk = C0439j3.f6848A;
    }

    public static /* synthetic */ void C(C0508v1 c0508v1) {
        c0508v1.zze &= -3;
        c0508v1.zzg = zzc.zzg;
    }

    public static C0502u1 D() {
        return (C0502u1) zzc.k();
    }

    public static /* synthetic */ void q(C0508v1 c0508v1, double d6) {
        c0508v1.zze |= 16;
        c0508v1.zzj = d6;
    }

    public static /* synthetic */ void r(C0508v1 c0508v1, long j6) {
        c0508v1.zze |= 4;
        c0508v1.zzh = j6;
    }

    public static void s(C0508v1 c0508v1, C0508v1 c0508v12) {
        R2 r22 = c0508v1.zzk;
        if (!((AbstractC0485r2) r22).f6940w) {
            c0508v1.zzk = r22.d(r22.size() << 1);
        }
        c0508v1.zzk.add(c0508v12);
    }

    public static /* synthetic */ void t(C0508v1 c0508v1, String str) {
        str.getClass();
        c0508v1.zze |= 1;
        c0508v1.zzf = str;
    }

    public static void u(C0508v1 c0508v1, ArrayList arrayList) {
        R2 r22 = c0508v1.zzk;
        if (!((AbstractC0485r2) r22).f6940w) {
            c0508v1.zzk = r22.d(r22.size() << 1);
        }
        AbstractC0474p2.b(arrayList, c0508v1.zzk);
    }

    public static /* synthetic */ void v(C0508v1 c0508v1) {
        c0508v1.zze &= -17;
        c0508v1.zzj = 0.0d;
    }

    public static /* synthetic */ void x(C0508v1 c0508v1) {
        c0508v1.zze &= -5;
        c0508v1.zzh = 0L;
    }

    public static /* synthetic */ void y(C0508v1 c0508v1, String str) {
        str.getClass();
        c0508v1.zze |= 2;
        c0508v1.zzg = str;
    }

    public final long B() {
        return this.zzh;
    }

    public final String E() {
        return this.zzf;
    }

    public final String F() {
        return this.zzg;
    }

    public final List G() {
        return this.zzk;
    }

    public final boolean H() {
        return (this.zze & 16) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 4) != 0;
    }

    public final boolean K() {
        return (this.zze & 1) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new C0508v1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0502u1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C0508v1.class});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0508v1.class) {
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
        return this.zzj;
    }

    public final float w() {
        return this.zzi;
    }

    public final int z() {
        return this.zzk.size();
    }
}
