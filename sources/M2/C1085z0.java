package m2;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: m2.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1085z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1085z0 f11285c = new C1085z0(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f11286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11287b;

    public C1085z0(int i6) {
        EnumMap enumMap = new EnumMap(EnumC1083y0.class);
        this.f11286a = enumMap;
        EnumC1083y0 enumC1083y0 = EnumC1083y0.f11277x;
        B0 b02 = B0.f10493x;
        enumMap.put(enumC1083y0, b02);
        enumMap.put(EnumC1083y0.f11278y, b02);
        this.f11287b = i6;
    }

    public static char a(B0 b02) {
        if (b02 == null) {
            return '-';
        }
        int iOrdinal = b02.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static String b(int i6) {
        return i6 != -30 ? i6 != -20 ? i6 != -10 ? i6 != 0 ? i6 != 30 ? i6 != 90 ? i6 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static C1085z0 c(int i6, Bundle bundle) {
        if (bundle == null) {
            return new C1085z0(i6);
        }
        EnumMap enumMap = new EnumMap(EnumC1083y0.class);
        for (EnumC1083y0 enumC1083y0 : A0.STORAGE.f10482w) {
            enumMap.put(enumC1083y0, g(bundle.getString(enumC1083y0.f11280w)));
        }
        return new C1085z0(enumMap, i6);
    }

    public static C1085z0 d(int i6, String str) {
        EnumMap enumMap = new EnumMap(EnumC1083y0.class);
        if (str == null) {
            str = "";
        }
        A0 a02 = A0.STORAGE;
        int i7 = 0;
        while (true) {
            EnumC1083y0[] enumC1083y0Arr = a02.f10482w;
            if (i7 >= enumC1083y0Arr.length) {
                return new C1085z0(enumMap, i6);
            }
            int i8 = i7 + 2;
            enumMap.put(enumC1083y0Arr[i7], i8 < str.length() ? f(str.charAt(i8)) : B0.f10493x);
            i7++;
        }
    }

    public static B0 f(char c6) {
        return c6 != '+' ? c6 != '0' ? c6 != '1' ? B0.f10493x : B0.f10491A : B0.f10495z : B0.f10494y;
    }

    public static B0 g(String str) {
        B0 b02 = B0.f10493x;
        return str == null ? b02 : str.equals("granted") ? B0.f10491A : str.equals("denied") ? B0.f10495z : b02;
    }

    public static boolean h(int i6, int i7) {
        if (i6 == -20 && i7 == -30) {
            return true;
        }
        return (i6 == -30 && i7 == -20) || i6 == i7 || i6 < i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m2.C1085z0 e(m2.C1085z0 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<m2.y0> r1 = m2.EnumC1083y0.class
            r0.<init>(r1)
            m2.A0 r1 = m2.A0.STORAGE
            m2.y0[] r1 = r1.f10482w
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f11286a
            java.lang.Object r5 = r5.get(r4)
            m2.B0 r5 = (m2.B0) r5
            java.util.EnumMap r6 = r9.f11286a
            java.lang.Object r6 = r6.get(r4)
            m2.B0 r6 = (m2.B0) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            m2.B0 r7 = m2.B0.f10493x
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            m2.B0 r7 = m2.B0.f10494y
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            m2.B0 r7 = m2.B0.f10495z
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            m2.B0 r5 = m2.B0.f10491A
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            m2.z0 r9 = new m2.z0
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1085z0.e(m2.z0):m2.z0");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1085z0)) {
            return false;
        }
        C1085z0 c1085z0 = (C1085z0) obj;
        for (EnumC1083y0 enumC1083y0 : A0.STORAGE.f10482w) {
            if (this.f11286a.get(enumC1083y0) != c1085z0.f11286a.get(enumC1083y0)) {
                return false;
            }
        }
        return this.f11287b == c1085z0.f11287b;
    }

    public final int hashCode() {
        int iHashCode = this.f11287b * 17;
        Iterator it = this.f11286a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((B0) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(EnumC1083y0 enumC1083y0) {
        return ((B0) this.f11286a.get(enumC1083y0)) != B0.f10495z;
    }

    public final C1085z0 j(C1085z0 c1085z0) {
        EnumMap enumMap = new EnumMap(EnumC1083y0.class);
        for (EnumC1083y0 enumC1083y0 : A0.STORAGE.f10482w) {
            B0 b02 = (B0) this.f11286a.get(enumC1083y0);
            if (b02 == B0.f10493x) {
                b02 = (B0) c1085z0.f11286a.get(enumC1083y0);
            }
            if (b02 != null) {
                enumMap.put(enumC1083y0, b02);
            }
        }
        return new C1085z0(enumMap, this.f11287b);
    }

    public final boolean k(C1085z0 c1085z0, EnumC1083y0... enumC1083y0Arr) {
        for (EnumC1083y0 enumC1083y0 : enumC1083y0Arr) {
            B0 b02 = (B0) this.f11286a.get(enumC1083y0);
            B0 b03 = (B0) c1085z0.f11286a.get(enumC1083y0);
            B0 b04 = B0.f10495z;
            if (b02 == b04 && b03 != b04) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            m2.A0 r1 = m2.A0.STORAGE
            m2.y0[] r1 = r1.f10482w
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f11286a
            java.lang.Object r4 = r5.get(r4)
            m2.B0 r4 = (m2.B0) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1085z0.l():java.lang.String");
    }

    public final String m() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC1083y0 enumC1083y0 : A0.STORAGE.f10482w) {
            sb.append(a((B0) this.f11286a.get(enumC1083y0)));
        }
        return sb.toString();
    }

    public final boolean n() {
        return i(EnumC1083y0.f11278y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(b(this.f11287b));
        for (EnumC1083y0 enumC1083y0 : A0.STORAGE.f10482w) {
            sb.append(",");
            sb.append(enumC1083y0.f11280w);
            sb.append("=");
            B0 b02 = (B0) this.f11286a.get(enumC1083y0);
            if (b02 == null) {
                b02 = B0.f10493x;
            }
            sb.append(b02);
        }
        return sb.toString();
    }

    public C1085z0(EnumMap enumMap, int i6) {
        EnumMap enumMap2 = new EnumMap(EnumC1083y0.class);
        this.f11286a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f11287b = i6;
    }
}
