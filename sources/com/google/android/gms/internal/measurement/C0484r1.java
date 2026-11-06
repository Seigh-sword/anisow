package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0484r1 extends I2 {
    private static final C0484r1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private R2 zzf = C0439j3.f6848A;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C0484r1 c0484r1 = new C0484r1();
        zzc = c0484r1;
        I2.h(C0484r1.class, c0484r1);
    }

    public static C0479q1 C() {
        return (C0479q1) zzc.k();
    }

    public static /* synthetic */ void r(int i6, C0484r1 c0484r1) {
        c0484r1.I();
        c0484r1.zzf.remove(i6);
    }

    public static /* synthetic */ void s(long j6, C0484r1 c0484r1) {
        c0484r1.zze |= 4;
        c0484r1.zzi = j6;
    }

    public static void t(C0484r1 c0484r1) {
        c0484r1.zzf = C0439j3.f6848A;
    }

    public static /* synthetic */ void u(C0484r1 c0484r1, int i6, C0508v1 c0508v1) {
        c0484r1.I();
        c0484r1.zzf.set(i6, c0508v1);
    }

    public static /* synthetic */ void v(C0484r1 c0484r1, C0508v1 c0508v1) {
        c0508v1.getClass();
        c0484r1.I();
        c0484r1.zzf.add(c0508v1);
    }

    public static /* synthetic */ void w(C0484r1 c0484r1, Iterable iterable) {
        c0484r1.I();
        AbstractC0474p2.b(iterable, c0484r1.zzf);
    }

    public static /* synthetic */ void x(C0484r1 c0484r1, String str) {
        str.getClass();
        c0484r1.zze |= 1;
        c0484r1.zzg = str;
    }

    public static /* synthetic */ void z(long j6, C0484r1 c0484r1) {
        c0484r1.zze |= 2;
        c0484r1.zzh = j6;
    }

    public final long A() {
        return this.zzi;
    }

    public final long B() {
        return this.zzh;
    }

    public final String D() {
        return this.zzg;
    }

    public final R2 E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 4) != 0;
    }

    public final boolean H() {
        return (this.zze & 2) != 0;
    }

    public final void I() {
        R2 r22 = this.zzf;
        if (((AbstractC0485r2) r22).f6940w) {
            return;
        }
        this.zzf = r22.d(r22.size() << 1);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new C0484r1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0479q1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C0508v1.class, "zzg", "zzh", "zzi", "zzj"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0484r1.class) {
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
        return this.zzj;
    }

    public final C0508v1 q(int i6) {
        return (C0508v1) this.zzf.get(i6);
    }

    public final int y() {
        return this.zzf.size();
    }
}
