package m2;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: renamed from: m2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1062o f11041f = new C1062o((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f11044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f11046e;

    public C1062o(Boolean bool, int i6, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC1083y0.class);
        this.f11046e = enumMap;
        enumMap.put(EnumC1083y0.f11279z, bool == null ? B0.f10493x : bool.booleanValue() ? B0.f10491A : B0.f10495z);
        this.f11042a = i6;
        this.f11043b = e();
        this.f11044c = bool2;
        this.f11045d = str;
    }

    public static Boolean a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i6 = r.f11069a[C1085z0.g(bundle.getString("ad_personalization")).ordinal()];
        if (i6 == 3) {
            return Boolean.FALSE;
        }
        if (i6 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static C1062o b(int i6, Bundle bundle) {
        if (bundle == null) {
            return new C1062o((Boolean) null, i6, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC1083y0.class);
        for (EnumC1083y0 enumC1083y0 : A0.DMA.f10482w) {
            enumMap.put(enumC1083y0, C1085z0.g(bundle.getString(enumC1083y0.f11280w)));
        }
        return new C1062o(enumMap, i6, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C1062o c(String str) {
        if (str == null || str.length() <= 0) {
            return f11041f;
        }
        String[] strArrSplit = str.split(":");
        int i6 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC1083y0.class);
        EnumC1083y0[] enumC1083y0Arr = A0.DMA.f10482w;
        int length = enumC1083y0Arr.length;
        int i7 = 1;
        int i8 = 0;
        while (i8 < length) {
            enumMap.put(enumC1083y0Arr[i8], C1085z0.f(strArrSplit[i7].charAt(0)));
            i8++;
            i7++;
        }
        return new C1062o(enumMap, i6, (Boolean) null, (String) null);
    }

    public final B0 d() {
        B0 b02 = (B0) this.f11046e.get(EnumC1083y0.f11279z);
        return b02 == null ? B0.f10493x : b02;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11042a);
        for (EnumC1083y0 enumC1083y0 : A0.DMA.f10482w) {
            sb.append(":");
            sb.append(C1085z0.a((B0) this.f11046e.get(enumC1083y0)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1062o)) {
            return false;
        }
        C1062o c1062o = (C1062o) obj;
        if (this.f11043b.equalsIgnoreCase(c1062o.f11043b) && Objects.equals(this.f11044c, c1062o.f11044c)) {
            return Objects.equals(this.f11045d, c1062o.f11045d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f11044c;
        int i6 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f11045d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i6 * 29) + this.f11043b.hashCode();
    }

    public final String toString() {
        int i6;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C1085z0.b(this.f11042a));
        for (EnumC1083y0 enumC1083y0 : A0.DMA.f10482w) {
            sb.append(",");
            sb.append(enumC1083y0.f11280w);
            sb.append("=");
            B0 b02 = (B0) this.f11046e.get(enumC1083y0);
            if (b02 == null || (i6 = r.f11069a[b02.ordinal()]) == 1) {
                sb.append("uninitialized");
            } else {
                if (i6 == 2) {
                    str = "eu_consent_policy";
                } else if (i6 == 3) {
                    str = "denied";
                } else if (i6 == 4) {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        Boolean bool = this.f11044c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str2 = this.f11045d;
        if (str2 != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str2);
        }
        return sb.toString();
    }

    public C1062o(EnumMap enumMap, int i6, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC1083y0.class);
        this.f11046e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f11042a = i6;
        this.f11043b = e();
        this.f11044c = bool;
        this.f11045d = str;
    }
}
