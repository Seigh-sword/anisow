package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0477q implements InterfaceC0459n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f6929x;

    public C0477q(String str, ArrayList arrayList) {
        this.f6928w = str;
        ArrayList arrayList2 = new ArrayList();
        this.f6929x = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0477q)) {
            return false;
        }
        C0477q c0477q = (C0477q) obj;
        String str = this.f6928w;
        if (str == null ? c0477q.f6928w != null : !str.equals(c0477q.f6928w)) {
            return false;
        }
        ArrayList arrayList = this.f6929x;
        ArrayList arrayList2 = c0477q.f6929x;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        String str = this.f6928w;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f6929x;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n j(String str, P0.h hVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Double p() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
}
