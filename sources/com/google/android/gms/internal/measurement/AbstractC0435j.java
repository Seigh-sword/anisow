package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0435j implements InterfaceC0429i, InterfaceC0459n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f6839x = new HashMap();

    public AbstractC0435j(String str) {
        this.f6838w = str;
    }

    public abstract InterfaceC0459n a(P0.h hVar, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final InterfaceC0459n b(String str) {
        HashMap map = this.f6839x;
        return map.containsKey(str) ? (InterfaceC0459n) map.get(str) : InterfaceC0459n.f6885n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final boolean e(String str) {
        return this.f6839x.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0435j)) {
            return false;
        }
        AbstractC0435j abstractC0435j = (AbstractC0435j) obj;
        String str = this.f6838w;
        if (str != null) {
            return str.equals(abstractC0435j.f6838w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public InterfaceC0459n f() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        return this.f6838w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return new C0441k(this.f6839x.keySet().iterator());
    }

    public final int hashCode() {
        String str = this.f6838w;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n j(String str, P0.h hVar, ArrayList arrayList) {
        return "toString".equals(str) ? new C0471p(this.f6838w) : F2.d(this, new C0471p(str), hVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final void l(String str, InterfaceC0459n interfaceC0459n) {
        HashMap map = this.f6839x;
        if (interfaceC0459n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0459n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Double p() {
        return Double.valueOf(Double.NaN);
    }
}
