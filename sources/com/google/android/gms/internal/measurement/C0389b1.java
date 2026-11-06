package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389b1 extends I2 {
    private static final C0389b1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C0389b1 c0389b1 = new C0389b1();
        zzc = c0389b1;
        I2.h(C0389b1.class, c0389b1);
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        Object obj = null;
        switch (AbstractC0401d1.f6783a[i6 - 1]) {
            case 1:
                return new C0389b1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new I0(10, obj);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (C0389b1.class) {
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

    public final String q() {
        return this.zzf;
    }

    public final String r() {
        return this.zzg;
    }
}
