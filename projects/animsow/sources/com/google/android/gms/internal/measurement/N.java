package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N f6643d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6646c;

    static {
        M m5 = new M();
        m5.f6638a = "";
        m5.f6641d = (byte) (m5.f6641d | 1);
        m5.f6639b = 1;
        m5.f6640c = 1;
        m5.a();
        M m6 = new M();
        m6.f6638a = "";
        m6.f6641d = (byte) (m6.f6641d | 1);
        m6.f6639b = 4;
        m6.f6640c = 1;
        f6643d = m6.a();
        M m7 = new M();
        m7.f6638a = "";
        m7.f6641d = (byte) (m7.f6641d | 1);
        m7.f6639b = 2;
        m7.f6640c = 1;
        m7.a();
    }

    public N(String str, int i6, int i7) {
        this.f6644a = str;
        this.f6645b = i6;
        this.f6646c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N) {
            N n5 = (N) obj;
            if (this.f6644a.equals(n5.f6644a) && u.h.a(this.f6645b, n5.f6645b) && u.h.a(this.f6646c, n5.f6646c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f6644a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ u.h.b(this.f6645b)) * 583896283) ^ u.h.b(this.f6646c);
    }

    public final String toString() {
        String strF = H1.a.F(this.f6645b);
        String strE = H1.a.E(this.f6646c);
        StringBuilder sb = new StringBuilder("FileComplianceOptions{fileOwner=");
        sb.append(this.f6644a);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(strF);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        return AbstractC0628i.m(sb, strE, "}");
    }
}
