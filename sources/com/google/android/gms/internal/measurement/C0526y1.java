package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0526y1 extends I2 {
    private static final C0526y1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private R2 zzf = C0439j3.f6848A;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        C0526y1 c0526y1 = new C0526y1();
        zzc = c0526y1;
        I2.h(C0526y1.class, c0526y1);
    }

    public static C0520x1 q(C0526y1 c0526y1) {
        H2 h2K = zzc.k();
        h2K.d(c0526y1);
        return (C0520x1) h2K;
    }

    public static void s(C0526y1 c0526y1, A1 a12) {
        R2 r22 = c0526y1.zzf;
        if (!((AbstractC0485r2) r22).f6940w) {
            c0526y1.zzf = r22.d(r22.size() << 1);
        }
        c0526y1.zzf.add(a12);
    }

    public static /* synthetic */ void t(C0526y1 c0526y1, String str) {
        str.getClass();
        c0526y1.zze |= 1;
        c0526y1.zzg = str;
    }

    public static void u(C0526y1 c0526y1, ArrayList arrayList) {
        R2 r22 = c0526y1.zzf;
        if (!((AbstractC0485r2) r22).f6940w) {
            c0526y1.zzf = r22.d(r22.size() << 1);
        }
        AbstractC0474p2.b(arrayList, c0526y1.zzf);
    }

    public static C0520x1 v() {
        return (C0520x1) zzc.k();
    }

    public static void w(C0526y1 c0526y1) {
        c0526y1.zzf = C0439j3.f6848A;
    }

    public static /* synthetic */ void x(C0526y1 c0526y1, String str) {
        str.getClass();
        c0526y1.zze |= 2;
        c0526y1.zzh = str;
    }

    public final List A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new C0526y1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0520x1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", A1.class, "zzg", "zzh", "zzi", J1.f6609a});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0526y1.class) {
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
        return this.zzf.size();
    }

    public final A1 r() {
        return (A1) this.zzf.get(0);
    }

    public final String y() {
        return this.zzg;
    }

    public final String z() {
        return this.zzh;
    }
}
