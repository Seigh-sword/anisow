package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0453m implements InterfaceC0429i, InterfaceC0459n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f6879w = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final InterfaceC0459n b(String str) {
        HashMap map = this.f6879w;
        return map.containsKey(str) ? (InterfaceC0459n) map.get(str) : InterfaceC0459n.f6885n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final boolean e(String str) {
        return this.f6879w.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0453m) {
            return this.f6879w.equals(((C0453m) obj).f6879w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        String str;
        InterfaceC0459n interfaceC0459nF;
        C0453m c0453m = new C0453m();
        for (Map.Entry entry : this.f6879w.entrySet()) {
            boolean z5 = entry.getValue() instanceof InterfaceC0429i;
            HashMap map = c0453m.f6879w;
            if (z5) {
                str = (String) entry.getKey();
                interfaceC0459nF = (InterfaceC0459n) entry.getValue();
            } else {
                str = (String) entry.getKey();
                interfaceC0459nF = ((InterfaceC0459n) entry.getValue()).f();
            }
            map.put(str, interfaceC0459nF);
        }
        return c0453m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return new C0441k(this.f6879w.keySet().iterator());
    }

    public final int hashCode() {
        return this.f6879w.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public InterfaceC0459n j(String str, P0.h hVar, ArrayList arrayList) {
        return "toString".equals(str) ? new C0471p(toString()) : F2.d(this, new C0471p(str), hVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final void l(String str, InterfaceC0459n interfaceC0459n) {
        HashMap map = this.f6879w;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f6879w;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
