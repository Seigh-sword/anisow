package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class A1 extends I2 {
    private static final A1 zzc;
    private static volatile InterfaceC0427h3 zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private R2 zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private B1 zzas;
    private P2 zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private C0514w1 zzbc;
    private String zzbd;
    private R2 zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private C0449l1 zzbn;
    private int zzbo;
    private C0431i1 zzbp;
    private String zzbq;
    private int zze;
    private int zzf;
    private int zzg;
    private R2 zzh;
    private R2 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        A1 a12 = new A1();
        zzc = a12;
        I2.h(A1.class, a12);
    }

    public A1() {
        C0439j3 c0439j3 = C0439j3.f6848A;
        this.zzh = c0439j3;
        this.zzi = c0439j3;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = c0439j3;
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = L2.f6623A;
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = c0439j3;
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
        this.zzbq = "";
    }

    public static /* synthetic */ void A(A1 a12, String str) {
        str.getClass();
        a12.zzf |= 4;
        a12.zzar = str;
    }

    public static /* synthetic */ void A1(A1 a12, long j6) {
        a12.zzf |= 32768;
        a12.zzbg = j6;
    }

    public static void B(A1 a12, ArrayList arrayList) {
        R2 r22 = a12.zzag;
        if (!((AbstractC0485r2) r22).f6940w) {
            a12.zzag = r22.d(r22.size() << 1);
        }
        AbstractC0474p2.b(arrayList, a12.zzag);
    }

    public static /* synthetic */ void B1(A1 a12, String str) {
        str.getClass();
        a12.zze |= Integer.MIN_VALUE;
        a12.zzao = str;
    }

    public static /* synthetic */ void C(A1 a12, boolean z5) {
        a12.zzf |= 65536;
        a12.zzbh = z5;
    }

    public static /* synthetic */ void D1(A1 a12) {
        a12.zze &= -65537;
        a12.zzy = zzc.zzy;
    }

    public static /* synthetic */ void E1(A1 a12, long j6) {
        a12.zze |= 2;
        a12.zzj = j6;
    }

    public static /* synthetic */ void F1(A1 a12, String str) {
        str.getClass();
        a12.zzf |= 16384;
        a12.zzbf = str;
    }

    public static /* synthetic */ void H1(A1 a12) {
        a12.zzf &= -8193;
        a12.zzbd = zzc.zzbd;
    }

    public static /* synthetic */ void I1(A1 a12, String str) {
        a12.zze |= 16777216;
        a12.zzah = str;
    }

    public static /* synthetic */ void J1(A1 a12) {
        a12.zze |= 32768;
        a12.zzx = 106000L;
    }

    public static void K0(A1 a12) {
        a12.zzag = C0439j3.f6848A;
    }

    public static /* synthetic */ void L0(A1 a12, int i6) {
        a12.zzf |= 1048576;
        a12.zzbl = i6;
    }

    public static /* synthetic */ void L1(A1 a12) {
        a12.zze &= -268435457;
        a12.zzal = zzc.zzal;
    }

    public static /* synthetic */ void M0(A1 a12, long j6) {
        a12.zze |= 524288;
        a12.zzab = j6;
    }

    public static /* synthetic */ void M1(A1 a12, String str) {
        str.getClass();
        a12.zze |= 4194304;
        a12.zzae = str;
    }

    public static /* synthetic */ void N0(A1 a12, String str) {
        a12.zze |= 262144;
        a12.zzaa = str;
    }

    public static void O0(A1 a12, ArrayList arrayList) {
        R2 r22 = a12.zzat;
        if (!((AbstractC0485r2) r22).f6940w) {
            a12.zzat = ((L2) r22).d(r22.size() << 1);
        }
        AbstractC0474p2.b(arrayList, a12.zzat);
    }

    public static /* synthetic */ void O1(A1 a12, String str) {
        a12.zze |= 2097152;
        a12.zzad = str;
    }

    public static /* synthetic */ void P0(A1 a12, boolean z5) {
        a12.zze |= 131072;
        a12.zzz = z5;
    }

    public static /* synthetic */ void Q1(A1 a12, String str) {
        str.getClass();
        a12.zze |= 128;
        a12.zzp = str;
    }

    public static /* synthetic */ void S1(A1 a12) {
        a12.zze |= 64;
        a12.zzo = "android";
    }

    public static /* synthetic */ void T0(A1 a12) {
        a12.zze &= -257;
        a12.zzq = zzc.zzq;
    }

    public static /* synthetic */ void U0(A1 a12, int i6) {
        a12.zze |= 33554432;
        a12.zzai = i6;
    }

    public static /* synthetic */ void U1(A1 a12, String str) {
        str.getClass();
        a12.zze |= 65536;
        a12.zzy = str;
    }

    public static /* synthetic */ void V0(A1 a12, long j6) {
        a12.zzf |= 16;
        a12.zzau = j6;
    }

    public static /* synthetic */ void W0(A1 a12, String str) {
        str.getClass();
        a12.zze |= 2048;
        a12.zzt = str;
    }

    public static /* synthetic */ void W1(A1 a12, String str) {
        str.getClass();
        a12.zzf |= 8192;
        a12.zzbd = str;
    }

    public static void X0(A1 a12, Set set) {
        R2 r22 = a12.zzbe;
        if (!((AbstractC0485r2) r22).f6940w) {
            a12.zzbe = r22.d(r22.size() << 1);
        }
        AbstractC0474p2.b(set, a12.zzbe);
    }

    public static /* synthetic */ void Y0(A1 a12) {
        a12.zze |= 8388608;
        a12.zzaf = false;
    }

    public static /* synthetic */ void Y1(A1 a12, String str) {
        str.getClass();
        a12.zze |= 512;
        a12.zzr = str;
    }

    public static /* synthetic */ void a1(A1 a12) {
        a12.zze &= Integer.MAX_VALUE;
        a12.zzao = zzc.zzao;
    }

    public static /* synthetic */ void b1(A1 a12, int i6) {
        a12.zze |= 1048576;
        a12.zzac = i6;
    }

    public static /* synthetic */ void c1(A1 a12, long j6) {
        a12.zze |= 8;
        a12.zzl = j6;
    }

    public static C0532z1 c2() {
        return (C0532z1) zzc.k();
    }

    public static /* synthetic */ void d1(A1 a12, String str) {
        str.getClass();
        a12.zze |= 8192;
        a12.zzv = str;
    }

    public static /* synthetic */ void f0(A1 a12) {
        a12.zze &= -262145;
        a12.zzaa = zzc.zzaa;
    }

    public static void f1(A1 a12) {
        a12.zzh = C0439j3.f6848A;
    }

    public static /* synthetic */ void g0(A1 a12, int i6) {
        a12.R0();
        a12.zzi.remove(i6);
    }

    public static /* synthetic */ void g1(A1 a12, int i6) {
        a12.zzf |= 8388608;
        a12.zzbo = i6;
    }

    public static /* synthetic */ void h0(A1 a12, long j6) {
        a12.zze |= 536870912;
        a12.zzam = j6;
    }

    public static /* synthetic */ void h1(A1 a12, long j6) {
        a12.zze |= 16384;
        a12.zzw = j6;
    }

    public static /* synthetic */ void i0(A1 a12, String str) {
        str.getClass();
        a12.zze |= 4096;
        a12.zzu = str;
    }

    public static /* synthetic */ void i1(A1 a12, String str) {
        str.getClass();
        a12.zzf |= 131072;
        a12.zzbi = str;
    }

    public static /* synthetic */ void j0(A1 a12, ArrayList arrayList) {
        a12.Q0();
        AbstractC0474p2.b(arrayList, a12.zzh);
    }

    public static /* synthetic */ void k0(A1 a12, boolean z5) {
        a12.zzf |= 262144;
        a12.zzbj = z5;
    }

    public static /* synthetic */ void k1(A1 a12) {
        a12.zze &= -2097153;
        a12.zzad = zzc.zzad;
    }

    public static /* synthetic */ void l1(A1 a12, long j6) {
        a12.zze |= 32;
        a12.zzn = j6;
    }

    public static /* synthetic */ void m1(A1 a12, String str) {
        str.getClass();
        a12.zzf |= 128;
        a12.zzax = str;
    }

    public static /* synthetic */ void n1(A1 a12) {
        a12.zze |= 1;
        a12.zzg = 1;
    }

    public static /* synthetic */ void p1(A1 a12) {
        a12.zze &= -131073;
        a12.zzz = false;
    }

    public static /* synthetic */ void q1(A1 a12, int i6) {
        a12.zzf |= 2;
        a12.zzaq = i6;
    }

    public static C0532z1 r(A1 a12) {
        H2 h2K = zzc.k();
        h2K.d(a12);
        return (C0532z1) h2K;
    }

    public static /* synthetic */ void r1(A1 a12, long j6) {
        a12.zze |= 16;
        a12.zzm = j6;
    }

    public static /* synthetic */ void s(A1 a12, int i6) {
        a12.Q0();
        a12.zzh.remove(i6);
    }

    public static /* synthetic */ void s1(A1 a12, String str) {
        str.getClass();
        a12.zzf |= 524288;
        a12.zzbk = str;
    }

    public static /* synthetic */ void t(A1 a12, int i6, C0484r1 c0484r1) {
        a12.Q0();
        a12.zzh.set(i6, c0484r1);
    }

    public static /* synthetic */ void u(A1 a12, int i6, H1 h12) {
        a12.R0();
        a12.zzi.set(i6, h12);
    }

    public static /* synthetic */ void u1(A1 a12) {
        a12.zze &= -33;
        a12.zzn = 0L;
    }

    public static /* synthetic */ void v(A1 a12, long j6) {
        a12.zzf |= 32;
        a12.zzav = j6;
    }

    public static /* synthetic */ void v1(A1 a12, int i6) {
        a12.zze |= 1024;
        a12.zzs = i6;
    }

    public static /* synthetic */ void w(A1 a12, C0431i1 c0431i1) {
        a12.zzbp = c0431i1;
        a12.zzf |= 16777216;
    }

    public static /* synthetic */ void w1(A1 a12, long j6) {
        a12.zze |= 4;
        a12.zzk = j6;
    }

    public static /* synthetic */ void x(A1 a12, C0449l1 c0449l1) {
        a12.zzbn = c0449l1;
        a12.zzf |= 4194304;
    }

    public static /* synthetic */ void x1(A1 a12, String str) {
        str.getClass();
        a12.zze |= 256;
        a12.zzq = str;
    }

    public static /* synthetic */ void y(A1 a12, C0484r1 c0484r1) {
        a12.Q0();
        a12.zzh.add(c0484r1);
    }

    public static /* synthetic */ void z(A1 a12, H1 h12) {
        a12.R0();
        a12.zzi.add(h12);
    }

    public static /* synthetic */ void z1(A1 a12) {
        a12.zze &= -17;
        a12.zzm = 0L;
    }

    public final boolean A0() {
        return (this.zze & 1) != 0;
    }

    public final boolean B0() {
        return (this.zzf & 2) != 0;
    }

    public final boolean C0() {
        return (this.zze & 8388608) != 0;
    }

    public final long C1() {
        return this.zzab;
    }

    public final String D() {
        return this.zzaa;
    }

    public final boolean D0() {
        return (this.zzf & 8192) != 0;
    }

    public final String E() {
        return this.zzt;
    }

    public final boolean E0() {
        return (this.zze & 4) != 0;
    }

    public final String F() {
        return this.zzv;
    }

    public final boolean F0() {
        return (this.zzf & 32768) != 0;
    }

    public final String G() {
        return this.zzbi;
    }

    public final boolean G0() {
        return (this.zze & 1024) != 0;
    }

    public final long G1() {
        return this.zzau;
    }

    public final String H() {
        return this.zzax;
    }

    public final boolean H0() {
        return (this.zze & 2) != 0;
    }

    public final String I() {
        return this.zzbk;
    }

    public final boolean I0() {
        return (this.zze & 32768) != 0;
    }

    public final String J() {
        return this.zzq;
    }

    public final int J0() {
        return this.zzac;
    }

    public final String K() {
        return this.zzao;
    }

    public final long K1() {
        return this.zzl;
    }

    public final String L() {
        return this.zzah;
    }

    public final String M() {
        return this.zzae;
    }

    public final String N() {
        return this.zzad;
    }

    public final long N1() {
        return this.zzw;
    }

    public final String O() {
        return this.zzp;
    }

    public final String P() {
        return this.zzo;
    }

    public final long P1() {
        return this.zzn;
    }

    public final String Q() {
        return this.zzy;
    }

    public final void Q0() {
        R2 r22 = this.zzh;
        if (((AbstractC0485r2) r22).f6940w) {
            return;
        }
        this.zzh = r22.d(r22.size() << 1);
    }

    public final String R() {
        return this.zzbd;
    }

    public final void R0() {
        R2 r22 = this.zzi;
        if (((AbstractC0485r2) r22).f6940w) {
            return;
        }
        this.zzi = r22.d(r22.size() << 1);
    }

    public final long R1() {
        return this.zzm;
    }

    public final String S() {
        return this.zzr;
    }

    public final int S0() {
        return this.zzbo;
    }

    public final R2 T() {
        return this.zzag;
    }

    public final long T1() {
        return this.zzk;
    }

    public final R2 U() {
        return this.zzh;
    }

    public final R2 V() {
        return this.zzi;
    }

    public final long V1() {
        return this.zzbg;
    }

    public final boolean W() {
        return this.zzbh;
    }

    public final boolean X() {
        return this.zzbj;
    }

    public final long X1() {
        return this.zzj;
    }

    public final boolean Y() {
        return this.zzz;
    }

    public final boolean Z() {
        return this.zzaf;
    }

    public final int Z0() {
        return this.zzh.size();
    }

    public final long Z1() {
        return this.zzx;
    }

    public final boolean a0() {
        return (this.zzf & 16777216) != 0;
    }

    public final C0431i1 a2() {
        C0431i1 c0431i1 = this.zzbp;
        return c0431i1 == null ? C0431i1.C() : c0431i1;
    }

    public final boolean b0() {
        return (this.zze & 33554432) != 0;
    }

    public final C0449l1 b2() {
        C0449l1 c0449l1 = this.zzbn;
        return c0449l1 == null ? C0449l1.s() : c0449l1;
    }

    public final boolean c0() {
        return (this.zzf & 4194304) != 0;
    }

    public final int d0() {
        return this.zzai;
    }

    public final String d2() {
        return this.zzar;
    }

    @Override // com.google.android.gms.internal.measurement.I2
    public final Object e(int i6) {
        switch (AbstractC0419g1.f6816a[i6 - 1]) {
            case 1:
                return new A1();
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0532z1(zzc);
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0451l3(zzc, "\u0004?\u0000\u0002\u0001P?\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9", new Object[]{"zze", "zzf", "zzg", "zzh", C0484r1.class, "zzi", H1.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", C0461n1.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", I1.f6606a, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp", "zzbq"});
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0427h3 j22 = zzd;
                if (j22 == null) {
                    synchronized (A1.class) {
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

    public final H1 e0(int i6) {
        return (H1) this.zzi.get(i6);
    }

    public final int e1() {
        return this.zzg;
    }

    public final String e2() {
        return this.zzu;
    }

    public final int j1() {
        return this.zzaq;
    }

    public final boolean l0() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean m0() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean n0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean o0() {
        return (this.zzf & 128) != 0;
    }

    public final int o1() {
        return this.zzs;
    }

    public final int p() {
        return this.zzbl;
    }

    public final boolean p0() {
        return (this.zzf & 524288) != 0;
    }

    public final C0484r1 q(int i6) {
        return (C0484r1) this.zzh.get(i6);
    }

    public final boolean q0() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean r0() {
        return (this.zze & 524288) != 0;
    }

    public final boolean s0() {
        return (this.zze & Integer.MIN_VALUE) != 0;
    }

    public final boolean t0() {
        return (this.zzf & 16) != 0;
    }

    public final int t1() {
        return this.zzi.size();
    }

    public final boolean u0() {
        return (this.zze & 8) != 0;
    }

    public final boolean v0() {
        return (this.zze & 16384) != 0;
    }

    public final boolean w0() {
        return (this.zzf & 262144) != 0;
    }

    public final boolean x0() {
        return (this.zze & 131072) != 0;
    }

    public final boolean y0() {
        return (this.zze & 32) != 0;
    }

    public final long y1() {
        return this.zzam;
    }

    public final boolean z0() {
        return (this.zze & 16) != 0;
    }
}
