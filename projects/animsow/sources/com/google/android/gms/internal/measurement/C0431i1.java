package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0431i1 extends I2 {
    private static final C0431i1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        C0431i1 c0431i1 = new C0431i1();
        zzc = c0431i1;
        I2.h(C0431i1.class, c0431i1);
    }

    public static /* synthetic */ void A(C0431i1 c0431i1) {
        c0431i1.zze &= -65;
        c0431i1.zzl = zzc.zzl;
    }

    public static /* synthetic */ void B(C0431i1 c0431i1, String str) {
        c0431i1.zze |= 64;
        c0431i1.zzl = str;
    }

    public static C0431i1 C() {
        return zzc;
    }

    public static /* synthetic */ void D(C0431i1 c0431i1) {
        c0431i1.zze &= -33;
        c0431i1.zzk = zzc.zzk;
    }

    public static /* synthetic */ void E(C0431i1 c0431i1, String str) {
        c0431i1.zze |= 32;
        c0431i1.zzk = str;
    }

    public static /* synthetic */ void G(C0431i1 c0431i1) {
        c0431i1.zze &= -17;
        c0431i1.zzj = zzc.zzj;
    }

    public static /* synthetic */ void H(C0431i1 c0431i1, String str) {
        c0431i1.zze |= 16;
        c0431i1.zzj = str;
    }

    public static /* synthetic */ void q(C0431i1 c0431i1) {
        c0431i1.zze &= -5;
        c0431i1.zzh = zzc.zzh;
    }

    public static /* synthetic */ void r(C0431i1 c0431i1, long j6) {
        c0431i1.zze |= 8;
        c0431i1.zzi = j6;
    }

    public static /* synthetic */ void s(C0431i1 c0431i1, String str) {
        c0431i1.zze |= 4;
        c0431i1.zzh = str;
    }

    public static /* synthetic */ void u(C0431i1 c0431i1) {
        c0431i1.zze &= -3;
        c0431i1.zzg = zzc.zzg;
    }

    public static /* synthetic */ void v(C0431i1 c0431i1, long j6) {
        c0431i1.zze |= 128;
        c0431i1.zzm = j6;
    }

    public static /* synthetic */ void w(C0431i1 c0431i1, String str) {
        c0431i1.zze |= 2;
        c0431i1.zzg = str;
    }

    public static /* synthetic */ void x(C0431i1 c0431i1) {
        c0431i1.zze &= -2;
        c0431i1.zzf = zzc.zzf;
    }

    public static /* synthetic */ void y(C0431i1 c0431i1, String str) {
        c0431i1.zze |= 1;
        c0431i1.zzf = str;
    }

    public static C0425h1 z() {
        return (C0425h1) zzc.k();
    }

    public final String F() {
        return this.zzh;
    }

    public final String I() {
        return this.zzg;
    }

    public final String J() {
        return this.zzf;
    }

    public final String K() {
        return this.zzl;
    }

    public final String L() {
        return this.zzk;
    }

    public final String M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 128) != 0;
    }

    public final boolean S() {
        return (this.zze & 64) != 0;
    }

    public final boolean T() {
        return (this.zze & 32) != 0;
    }

    public final boolean U() {
        return (this.zze & 16) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new C0431i1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0425h1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0431i1.class) {
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

    public final long p() {
        return this.zzi;
    }

    public final long t() {
        return this.zzm;
    }
}
