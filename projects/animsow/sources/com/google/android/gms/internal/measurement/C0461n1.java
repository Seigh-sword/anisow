package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0461n1 extends I2 {
    private static final C0461n1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private D1 zzg;
    private D1 zzh;
    private boolean zzi;

    static {
        C0461n1 c0461n1 = new C0461n1();
        zzc = c0461n1;
        I2.h(C0461n1.class, c0461n1);
    }

    public static /* synthetic */ void q(C0461n1 c0461n1, int i6) {
        c0461n1.zze |= 1;
        c0461n1.zzf = i6;
    }

    public static /* synthetic */ void r(C0461n1 c0461n1, D1 d12) {
        c0461n1.zzg = d12;
        c0461n1.zze |= 2;
    }

    public static /* synthetic */ void s(C0461n1 c0461n1, boolean z5) {
        c0461n1.zze |= 8;
        c0461n1.zzi = z5;
    }

    public static C0455m1 t() {
        return (C0455m1) zzc.k();
    }

    public static /* synthetic */ void u(C0461n1 c0461n1, D1 d12) {
        d12.getClass();
        c0461n1.zzh = d12;
        c0461n1.zze |= 4;
    }

    public final boolean A() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new C0461n1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0455m1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0461n1.class) {
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

    public final D1 v() {
        D1 d12 = this.zzg;
        return d12 == null ? D1.C() : d12;
    }

    public final D1 w() {
        D1 d12 = this.zzh;
        return d12 == null ? D1.C() : d12;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }

    public final boolean z() {
        return (this.zze & 8) != 0;
    }
}
