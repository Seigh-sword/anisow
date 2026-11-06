package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0423h implements InterfaceC0459n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC0459n f6832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6833x;

    public C0423h(String str) {
        this.f6832w = InterfaceC0459n.f6885n;
        this.f6833x = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0423h)) {
            return false;
        }
        C0423h c0423h = (C0423h) obj;
        return this.f6833x.equals(c0423h.f6833x) && this.f6832w.equals(c0423h.f6832w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        return new C0423h(this.f6833x, this.f6832w.f());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.f6832w.hashCode() + (this.f6833x.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n j(String str, P0.h hVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Double p() {
        throw new IllegalStateException("Control is not a double");
    }

    public C0423h(String str, InterfaceC0459n interfaceC0459n) {
        this.f6832w = interfaceC0459n;
        this.f6833x = str;
    }
}
