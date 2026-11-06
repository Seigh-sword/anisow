package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0393c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W2.o f6769d = W2.o.h(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6772c;

    public C0393c(String str, long j6, HashMap map) {
        this.f6770a = str;
        this.f6771b = j6;
        HashMap map2 = new HashMap();
        this.f6772c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object a(Object obj, Object obj2, String str) {
        if (!f6769d.contains(str) || !(obj2 instanceof Double)) {
            if (str.startsWith("_")) {
                return ((obj instanceof String) || obj == null) ? obj2 : obj;
            }
            if (obj instanceof Double) {
                return obj2;
            }
            if (!(obj instanceof Long)) {
                return obj instanceof String ? obj2.toString() : obj2;
            }
        }
        return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final /* synthetic */ Object clone() {
        return new C0393c(this.f6770a, this.f6771b, new HashMap(this.f6772c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0393c)) {
            return false;
        }
        C0393c c0393c = (C0393c) obj;
        if (this.f6771b == c0393c.f6771b && this.f6770a.equals(c0393c.f6770a)) {
            return this.f6772c.equals(c0393c.f6772c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6770a.hashCode() * 31;
        long j6 = this.f6771b;
        return this.f6772c.hashCode() + ((iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f6770a;
        String strValueOf = String.valueOf(this.f6772c);
        StringBuilder sbN = AbstractC0628i.n("Event{name='", str, "', timestamp=");
        sbN.append(this.f6771b);
        sbN.append(", params=");
        sbN.append(strValueOf);
        sbN.append("}");
        return sbN.toString();
    }
}
