package m2;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import d2.C0652c;
import java.lang.reflect.InvocationTargetException;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1032e extends L.i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Boolean f10884A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f10885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10886y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC1035f f10887z;

    public final String A(String str, E e6) {
        return TextUtils.isEmpty(str) ? (String) e6.a(null) : (String) e6.a(this.f10887z.b(str, e6.f10546a));
    }

    public final Boolean B(String str) {
        AbstractC1332d.g(str);
        Bundle bundleW = w();
        if (bundleW == null) {
            f().f10715B.d("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleW.containsKey(str)) {
            return Boolean.valueOf(bundleW.getBoolean(str));
        }
        return null;
    }

    public final boolean C(String str, E e6) {
        return D(str, e6);
    }

    public final boolean D(String str, E e6) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e6.a(null)).booleanValue();
        }
        String strB = this.f10887z.b(str, e6.f10546a);
        return TextUtils.isEmpty(strB) ? ((Boolean) e6.a(null)).booleanValue() : ((Boolean) e6.a(Boolean.valueOf("1".equals(strB)))).booleanValue();
    }

    public final boolean E(String str) {
        return "1".equals(this.f10887z.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean F() {
        Boolean boolB = B("google_analytics_automatic_screen_reporting_enabled");
        return boolB == null || boolB.booleanValue();
    }

    public final boolean G() {
        if (this.f10885x == null) {
            Boolean boolB = B("app_measurement_lite");
            this.f10885x = boolB;
            if (boolB == null) {
                this.f10885x = Boolean.FALSE;
            }
        }
        return this.f10885x.booleanValue() || !((C1051k0) this.f1668w).f10979A;
    }

    public final double s(String str, E e6) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e6.a(null)).doubleValue();
        }
        String strB = this.f10887z.b(str, e6.f10546a);
        if (TextUtils.isEmpty(strB)) {
            return ((Double) e6.a(null)).doubleValue();
        }
        try {
            return ((Double) e6.a(Double.valueOf(Double.parseDouble(strB)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e6.a(null)).doubleValue();
        }
    }

    public final int t(String str, boolean z5) {
        if (z5) {
            return Math.max(Math.min(x(str, AbstractC1078w.f11158T), 500), 100);
        }
        return 500;
    }

    public final String u(String str) {
        N nF;
        String str2;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC1332d.m(str3);
            return str3;
        } catch (ClassNotFoundException e6) {
            e = e6;
            nF = f();
            str2 = "Could not find SystemProperties class";
            nF.f10715B.c(e, str2);
            return "";
        } catch (IllegalAccessException e7) {
            e = e7;
            nF = f();
            str2 = "Could not access SystemProperties.get()";
            nF.f10715B.c(e, str2);
            return "";
        } catch (NoSuchMethodException e8) {
            e = e8;
            nF = f();
            str2 = "Could not find SystemProperties.get() method";
            nF.f10715B.c(e, str2);
            return "";
        } catch (InvocationTargetException e9) {
            e = e9;
            nF = f();
            str2 = "SystemProperties.get() threw an exception";
            nF.f10715B.c(e, str2);
            return "";
        }
    }

    public final boolean v(E e6) {
        return D(null, e6);
    }

    public final Bundle w() {
        try {
            if (a().getPackageManager() == null) {
                f().f10715B.d("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoF = C0652c.a(a()).f(128, a().getPackageName());
            if (applicationInfoF != null) {
                return applicationInfoF.metaData;
            }
            f().f10715B.d("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            f().f10715B.c(e6, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final int x(String str, E e6) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e6.a(null)).intValue();
        }
        String strB = this.f10887z.b(str, e6.f10546a);
        if (TextUtils.isEmpty(strB)) {
            return ((Integer) e6.a(null)).intValue();
        }
        try {
            return ((Integer) e6.a(Integer.valueOf(Integer.parseInt(strB)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e6.a(null)).intValue();
        }
    }

    public final long y(String str, E e6) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e6.a(null)).longValue();
        }
        String strB = this.f10887z.b(str, e6.f10546a);
        if (TextUtils.isEmpty(strB)) {
            return ((Long) e6.a(null)).longValue();
        }
        try {
            return ((Long) e6.a(Long.valueOf(Long.parseLong(strB)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e6.a(null)).longValue();
        }
    }

    public final B0 z(String str, boolean z5) {
        Object obj;
        AbstractC1332d.g(str);
        Bundle bundleW = w();
        if (bundleW == null) {
            f().f10715B.d("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleW.get(str);
        }
        B0 b02 = B0.f10493x;
        if (obj == null) {
            return b02;
        }
        if (Boolean.TRUE.equals(obj)) {
            return B0.f10491A;
        }
        if (Boolean.FALSE.equals(obj)) {
            return B0.f10495z;
        }
        if (z5 && "eu_consent_policy".equals(obj)) {
            return B0.f10494y;
        }
        f().f10718E.c(str, "Invalid manifest metadata for");
        return b02;
    }
}
