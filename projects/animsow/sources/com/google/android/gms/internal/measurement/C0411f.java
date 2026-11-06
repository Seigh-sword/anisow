package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0411f implements InterfaceC0459n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6795w;

    public C0411f(Boolean bool) {
        this.f6795w = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        return Boolean.valueOf(this.f6795w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0411f) && this.f6795w == ((C0411f) obj).f6795w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        return new C0411f(Boolean.valueOf(this.f6795w));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        return Boolean.toString(this.f6795w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f6795w).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n j(String str, P0.h hVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z5 = this.f6795w;
        if (zEquals) {
            return new C0471p(Boolean.toString(z5));
        }
        throw new IllegalArgumentException(Boolean.toString(z5) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Double p() {
        return Double.valueOf(this.f6795w ? 1.0d : 0.0d);
    }

    public final String toString() {
        return String.valueOf(this.f6795w);
    }
}
