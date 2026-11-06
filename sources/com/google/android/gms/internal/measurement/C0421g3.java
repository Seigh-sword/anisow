package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import p1.C1243i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421g3 implements InterfaceC0457m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0403d3 f6827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f6828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2 f6829c;

    public C0421g3(InterfaceC0403d3 interfaceC0403d3) {
        J2 j22 = W.f6728b;
        J2 j23 = W.f6727a;
        this.f6828b = j22;
        this.f6829c = j23;
        this.f6827a = interfaceC0403d3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final I2 a() {
        InterfaceC0403d3 interfaceC0403d3 = this.f6827a;
        return interfaceC0403d3 instanceof I2 ? (I2) ((I2) interfaceC0403d3).e(4) : ((H2) ((I2) interfaceC0403d3).e(5)).f();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final void b(Object obj, Object obj2) {
        W.h(this.f6828b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final int c(Object obj) {
        this.f6828b.getClass();
        C0475p3 c0475p3 = ((I2) obj).zzb;
        int i6 = c0475p3.f6926d;
        if (i6 != -1) {
            return i6;
        }
        int iU = 0;
        for (int i7 = 0; i7 < c0475p3.f6923a; i7++) {
            int i8 = c0475p3.f6924b[i7] >>> 3;
            iU += A2.u(3, (AbstractC0527y2) c0475p3.f6925c[i7]) + A2.L(2, i8) + (A2.K(8) << 1);
        }
        c0475p3.f6926d = iU;
        return iU;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final boolean d(Object obj) {
        this.f6829c.getClass();
        AbstractC0628i.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final void e(Object obj, byte[] bArr, int i6, int i7, C0503u2 c0503u2) {
        I2 i22 = (I2) obj;
        if (i22.zzb == C0475p3.f6922f) {
            i22.zzb = C0475p3.f();
        }
        AbstractC0628i.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final void f(Object obj, C1243i c1243i) {
        this.f6829c.getClass();
        AbstractC0628i.p(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final boolean g(Object obj, Object obj2) {
        J2 j22 = this.f6828b;
        j22.getClass();
        C0475p3 c0475p3 = ((I2) obj).zzb;
        j22.getClass();
        return c0475p3.equals(((I2) obj2).zzb);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final int h(Object obj) {
        this.f6828b.getClass();
        return ((I2) obj).zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final void i(Object obj) {
        this.f6828b.getClass();
        J2.p(obj);
        this.f6829c.getClass();
        AbstractC0628i.p(obj);
        throw null;
    }
}
