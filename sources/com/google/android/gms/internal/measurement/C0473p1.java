package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0473p1 extends I2 {
    private static final C0473p1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C0473p1 c0473p1 = new C0473p1();
        zzc = c0473p1;
        I2.h(C0473p1.class, c0473p1);
    }

    public static /* synthetic */ void q(C0473p1 c0473p1, int i6) {
        c0473p1.zze |= 1;
        c0473p1.zzf = i6;
    }

    public static /* synthetic */ void r(C0473p1 c0473p1, long j6) {
        c0473p1.zze |= 2;
        c0473p1.zzg = j6;
    }

    public static C0467o1 t() {
        return (C0467o1) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new C0473p1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0467o1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0473p1.class) {
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

    public final long s() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zze & 2) != 0;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }
}
