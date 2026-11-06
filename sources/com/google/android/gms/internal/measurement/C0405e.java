package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0405e implements InterfaceC0429i, InterfaceC0459n, Iterable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TreeMap f6787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TreeMap f6788x;

    public C0405e() {
        this.f6787w = new TreeMap();
        this.f6788x = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final InterfaceC0459n b(String str) {
        InterfaceC0459n interfaceC0459n;
        return "length".equals(str) ? new C0417g(Double.valueOf(s())) : (!e(str) || (interfaceC0459n = (InterfaceC0459n) this.f6788x.get(str)) == null) ? InterfaceC0459n.f6885n : interfaceC0459n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final boolean e(String str) {
        return "length".equals(str) || this.f6788x.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0405e)) {
            return false;
        }
        C0405e c0405e = (C0405e) obj;
        if (s() != c0405e.s()) {
            return false;
        }
        TreeMap treeMap = this.f6787w;
        if (treeMap.isEmpty()) {
            return c0405e.f6787w.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!q(iIntValue).equals(c0405e.q(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        Integer num;
        InterfaceC0459n interfaceC0459nF;
        C0405e c0405e = new C0405e();
        for (Map.Entry entry : this.f6787w.entrySet()) {
            boolean z5 = entry.getValue() instanceof InterfaceC0429i;
            TreeMap treeMap = c0405e.f6787w;
            if (z5) {
                num = (Integer) entry.getKey();
                interfaceC0459nF = (InterfaceC0459n) entry.getValue();
            } else {
                num = (Integer) entry.getKey();
                interfaceC0459nF = ((InterfaceC0459n) entry.getValue()).f();
            }
            treeMap.put(num, interfaceC0459nF);
        }
        return c0405e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        return t(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return new C0399d(this.f6787w.keySet().iterator(), this.f6788x.keySet().iterator());
    }

    public final int hashCode() {
        return this.f6787w.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0392, code lost:
    
        if (s() == 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03d0, code lost:
    
        if (com.google.android.gms.internal.measurement.F2.b(r26, r28, (com.google.android.gms.internal.measurement.C0465o) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).s() != s()) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r1v69, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0459n j(java.lang.String r27, P0.h r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instruction units count: 2340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0405e.j(java.lang.String, P0.h, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0429i
    public final void l(String str, InterfaceC0459n interfaceC0459n) {
        TreeMap treeMap = this.f6788x;
        if (interfaceC0459n == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0459n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Double p() {
        TreeMap treeMap = this.f6787w;
        return treeMap.size() == 1 ? q(0).p() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final InterfaceC0459n q(int i6) {
        InterfaceC0459n interfaceC0459n;
        if (i6 < s()) {
            return (!w(i6) || (interfaceC0459n = (InterfaceC0459n) this.f6787w.get(Integer.valueOf(i6))) == null) ? InterfaceC0459n.f6885n : interfaceC0459n;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void r(InterfaceC0459n interfaceC0459n) {
        v(s(), interfaceC0459n);
    }

    public final int s() {
        TreeMap treeMap = this.f6787w;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String t(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f6787w.isEmpty()) {
            for (int i6 = 0; i6 < s(); i6++) {
                InterfaceC0459n interfaceC0459nQ = q(i6);
                sb.append(str);
                if (!(interfaceC0459nQ instanceof C0494t) && !(interfaceC0459nQ instanceof C0447l)) {
                    sb.append(interfaceC0459nQ.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return t(",");
    }

    public final void u(int i6) {
        TreeMap treeMap = this.f6787w;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i6 > iIntValue || i6 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i6));
        if (i6 == iIntValue) {
            int i7 = i6 - 1;
            if (treeMap.containsKey(Integer.valueOf(i7)) || i7 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i7), InterfaceC0459n.f6885n);
            return;
        }
        while (true) {
            i6++;
            if (i6 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            InterfaceC0459n interfaceC0459n = (InterfaceC0459n) treeMap.get(Integer.valueOf(i6));
            if (interfaceC0459n != null) {
                treeMap.put(Integer.valueOf(i6 - 1), interfaceC0459n);
                treeMap.remove(Integer.valueOf(i6));
            }
        }
    }

    public final void v(int i6, InterfaceC0459n interfaceC0459n) {
        if (i6 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0628i.f("Out of bounds index: ", i6));
        }
        TreeMap treeMap = this.f6787w;
        Integer numValueOf = Integer.valueOf(i6);
        if (interfaceC0459n == null) {
            treeMap.remove(numValueOf);
        } else {
            treeMap.put(numValueOf, interfaceC0459n);
        }
    }

    public final boolean w(int i6) {
        if (i6 >= 0) {
            TreeMap treeMap = this.f6787w;
            if (i6 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i6));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC0628i.f("Out of bounds index: ", i6));
    }

    public final Iterator x() {
        return this.f6787w.keySet().iterator();
    }

    public final ArrayList y() {
        ArrayList arrayList = new ArrayList(s());
        for (int i6 = 0; i6 < s(); i6++) {
            arrayList.add(q(i6));
        }
        return arrayList;
    }

    public C0405e(List list) {
        this();
        if (list != null) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                v(i6, (InterfaceC0459n) list.get(i6));
            }
        }
    }

    public C0405e(InterfaceC0459n... interfaceC0459nArr) {
        this(Arrays.asList(interfaceC0459nArr));
    }
}
