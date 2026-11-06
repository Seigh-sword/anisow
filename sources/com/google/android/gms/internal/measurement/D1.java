package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends I2 {
    private static final D1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private N2 zze;
    private N2 zzf;
    private R2 zzg;
    private R2 zzh;

    static {
        D1 d12 = new D1();
        zzc = d12;
        I2.h(D1.class, d12);
    }

    public D1() {
        V2 v22 = V2.f6718A;
        this.zze = v22;
        this.zzf = v22;
        C0439j3 c0439j3 = C0439j3.f6848A;
        this.zzg = c0439j3;
        this.zzh = c0439j3;
    }

    public static void A(D1 d12, List list) {
        R2 r22 = d12.zze;
        if (!((AbstractC0485r2) r22).f6940w) {
            d12.zze = ((V2) r22).d(r22.size() << 1);
        }
        AbstractC0474p2.b(list, d12.zze);
    }

    public static C1 B() {
        return (C1) zzc.k();
    }

    public static D1 C() {
        return zzc;
    }

    public static void q(D1 d12) {
        d12.zzg = C0439j3.f6848A;
    }

    public static void r(D1 d12, ArrayList arrayList) {
        R2 r22 = d12.zzg;
        if (!((AbstractC0485r2) r22).f6940w) {
            d12.zzg = r22.d(r22.size() << 1);
        }
        AbstractC0474p2.b(arrayList, d12.zzg);
    }

    public static void t(D1 d12) {
        d12.zzf = V2.f6718A;
    }

    public static void u(D1 d12, List list) {
        R2 r22 = d12.zzf;
        if (!((AbstractC0485r2) r22).f6940w) {
            d12.zzf = ((V2) r22).d(r22.size() << 1);
        }
        AbstractC0474p2.b(list, d12.zzf);
    }

    public static void w(D1 d12) {
        d12.zzh = C0439j3.f6848A;
    }

    public static void x(D1 d12, List list) {
        R2 r22 = d12.zzh;
        if (!((AbstractC0485r2) r22).f6940w) {
            d12.zzh = r22.d(r22.size() << 1);
        }
        AbstractC0474p2.b(list, d12.zzh);
    }

    public static void z(D1 d12) {
        d12.zze = V2.f6718A;
    }

    public final R2 D() {
        return this.zzg;
    }

    public final List E() {
        return this.zzf;
    }

    public final R2 F() {
        return this.zzh;
    }

    public final List G() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new D1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C0473p1.class, "zzh", F1.class});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (D1.class) {
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
        return this.zzg.size();
    }

    public final int s() {
        return this.zzf.size();
    }

    public final int v() {
        return this.zzh.size();
    }

    public final int y() {
        return this.zze.size();
    }
}
