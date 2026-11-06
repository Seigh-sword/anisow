package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0449l1 extends I2 {
    private static final C0449l1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C0449l1 c0449l1 = new C0449l1();
        zzc = c0449l1;
        I2.h(C0449l1.class, c0449l1);
    }

    public static /* synthetic */ void A(C0449l1 c0449l1, boolean z5) {
        c0449l1.zze |= 8;
        c0449l1.zzi = z5;
    }

    public static C0443k1 p() {
        return (C0443k1) zzc.k();
    }

    public static /* synthetic */ void q(C0449l1 c0449l1, boolean z5) {
        c0449l1.zze |= 32;
        c0449l1.zzk = z5;
    }

    public static /* synthetic */ void r(C0449l1 c0449l1, boolean z5) {
        c0449l1.zze |= 16;
        c0449l1.zzj = z5;
    }

    public static C0449l1 s() {
        return zzc;
    }

    public static /* synthetic */ void t(C0449l1 c0449l1, boolean z5) {
        c0449l1.zze |= 1;
        c0449l1.zzf = z5;
    }

    public static /* synthetic */ void u(C0449l1 c0449l1, boolean z5) {
        c0449l1.zze |= 64;
        c0449l1.zzl = z5;
    }

    public static /* synthetic */ void w(C0449l1 c0449l1, boolean z5) {
        c0449l1.zze |= 2;
        c0449l1.zzg = z5;
    }

    public static /* synthetic */ void y(C0449l1 c0449l1, boolean z5) {
        c0449l1.zze |= 4;
        c0449l1.zzh = z5;
    }

    public final boolean B() {
        return this.zzl;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final boolean D() {
        return this.zzh;
    }

    public final boolean E() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new C0449l1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0443k1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0449l1.class) {
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

    public final boolean v() {
        return this.zzk;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzf;
    }
}
