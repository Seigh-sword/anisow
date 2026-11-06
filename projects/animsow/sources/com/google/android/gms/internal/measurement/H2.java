package com.google.android.gms.internal.measurement;

import h0.C0733A;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class H2 extends AbstractC0480q2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final I2 f6601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public I2 f6602x;

    public H2(I2 i22) {
        this.f6601w = i22;
        if (i22.o()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6602x = (I2) i22.e(4);
    }

    public final /* synthetic */ Object clone() {
        H2 h22 = (H2) this.f6601w.e(5);
        h22.f6602x = f();
        return h22;
    }

    public final H2 d(I2 i22) {
        I2 i23 = this.f6601w;
        if (i23.equals(i22)) {
            return this;
        }
        if (!this.f6602x.o()) {
            I2 i24 = (I2) i23.e(4);
            I2 i25 = this.f6602x;
            C0445k3 c0445k3 = C0445k3.f6859c;
            c0445k3.getClass();
            c0445k3.a(i24.getClass()).b(i24, i25);
            this.f6602x = i24;
        }
        I2 i26 = this.f6602x;
        C0445k3 c0445k32 = C0445k3.f6859c;
        c0445k32.getClass();
        c0445k32.a(i26.getClass()).b(i26, i22);
        return this;
    }

    public final I2 e() {
        I2 i2F = f();
        if (I2.i(i2F, true)) {
            return i2F;
        }
        throw new C0733A("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final I2 f() {
        if (this.f6602x.o()) {
            this.f6602x.m();
        }
        return this.f6602x;
    }

    public final void i() {
        if (this.f6602x.o()) {
            return;
        }
        I2 i22 = (I2) this.f6601w.e(4);
        I2 i23 = this.f6602x;
        C0445k3 c0445k3 = C0445k3.f6859c;
        c0445k3.getClass();
        c0445k3.a(i22.getClass()).b(i22, i23);
        this.f6602x = i22;
    }

    public final void j(byte[] bArr, int i6, C2 c22) throws Q2 {
        if (!this.f6602x.o()) {
            I2 i22 = (I2) this.f6601w.e(4);
            I2 i23 = this.f6602x;
            C0445k3 c0445k3 = C0445k3.f6859c;
            c0445k3.getClass();
            c0445k3.a(i22.getClass()).b(i22, i23);
            this.f6602x = i22;
        }
        try {
            C0445k3 c0445k32 = C0445k3.f6859c;
            I2 i24 = this.f6602x;
            c0445k32.getClass();
            c0445k32.a(i24.getClass()).e(this.f6602x, bArr, 0, i6, new C0503u2(c22));
        } catch (Q2 e6) {
            throw e6;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw Q2.d();
        }
    }
}
