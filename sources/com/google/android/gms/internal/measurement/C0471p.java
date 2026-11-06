package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0471p implements InterfaceC0459n, Iterable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6918w;

    public C0471p(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f6918w = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Boolean c() {
        return Boolean.valueOf(!this.f6918w.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0471p) {
            return this.f6918w.equals(((C0471p) obj).f6918w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        return new C0471p(this.f6918w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final String g() {
        return this.f6918w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Iterator h() {
        return new r(1, this);
    }

    public final int hashCode() {
        return this.f6918w.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(0, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0143  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0459n j(java.lang.String r21, P0.h r22, java.util.ArrayList r23) {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0471p.j(java.lang.String, P0.h, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0459n
    public final Double p() {
        double d6;
        String str = this.f6918w;
        if (str.isEmpty()) {
            d6 = 0.0d;
        } else {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                d6 = Double.NaN;
            }
        }
        return Double.valueOf(d6);
    }

    public final String toString() {
        return AbstractC0628i.m(new StringBuilder("\""), this.f6918w, "\"");
    }
}
