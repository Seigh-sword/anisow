package m2;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0422g4;
import com.google.android.gms.internal.measurement.InterfaceC0440j4;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC1081x0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f10714A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final P f10715B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final P f10716C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final P f10717D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final P f10718E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final P f10719F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final P f10720G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final P f10721H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final P f10722I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final P f10723J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public char f10724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10725z;

    public N(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10724y = (char) 0;
        this.f10725z = -1L;
        this.f10715B = new P(this, 6, false, false);
        this.f10716C = new P(this, 6, true, false);
        this.f10717D = new P(this, 6, false, true);
        this.f10718E = new P(this, 5, false, false);
        this.f10719F = new P(this, 5, true, false);
        this.f10720G = new P(this, 5, false, true);
        this.f10721H = new P(this, 4, false, false);
        this.f10722I = new P(this, 3, false, false);
        this.f10723J = new P(this, 2, false, false);
    }

    public static String A(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        ((InterfaceC0440j4) C0422g4.f6830x.get()).getClass();
        return ((Boolean) AbstractC1078w.f11131F0.a(null)).booleanValue() ? "" : str;
    }

    public static String v(Object obj, boolean z5) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i6 = 0;
        if (obj instanceof Long) {
            if (!z5) {
                return String.valueOf(obj);
            }
            Long l5 = (Long) obj;
            long jAbs = Math.abs(l5.longValue());
            String strValueOf = String.valueOf(obj);
            if (jAbs < 100) {
                return strValueOf;
            }
            String str = strValueOf.charAt(0) == '-' ? "-" : "";
            String strValueOf2 = String.valueOf(Math.abs(l5.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf2.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf2.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof O ? ((O) obj).f10735a : z5 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z5 ? th.getClass().getName() : th.toString());
        String strA = A(C1051k0.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i6];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && A(className).equals(strA)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i6++;
        }
        return sb.toString();
    }

    public static String w(boolean z5, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strV = v(obj, z5);
        String strV2 = v(obj2, z5);
        String strV3 = v(obj3, z5);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strV)) {
            sb.append(str2);
            sb.append(strV);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strV2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strV2);
        }
        if (!TextUtils.isEmpty(strV3)) {
            sb.append(str3);
            sb.append(strV3);
        }
        return sb.toString();
    }

    public static O x(String str) {
        if (str == null) {
            return null;
        }
        return new O(str);
    }

    public final P B() {
        return this.f10715B;
    }

    public final P C() {
        return this.f10723J;
    }

    public final P D() {
        return this.f10718E;
    }

    public final String E() {
        String str;
        synchronized (this) {
            try {
                if (this.f10714A == null) {
                    Object obj = this.f1668w;
                    this.f10714A = ((C1051k0) obj).f11012z != null ? ((C1051k0) obj).f11012z : "FA";
                }
                AbstractC1332d.m(this.f10714A);
                str = this.f10714A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // m2.AbstractC1081x0
    public final boolean u() {
        return false;
    }

    public final void y(int i6, boolean z5, boolean z6, String str, Object obj, Object obj2, Object obj3) {
        if (!z5 && z(i6)) {
            Log.println(i6, E(), w(false, str, obj, obj2, obj3));
        }
        if (z6 || i6 < 5) {
            return;
        }
        AbstractC1332d.m(str);
        C1042h0 c1042h0 = ((C1051k0) this.f1668w).f10984F;
        if (c1042h0 == null) {
            Log.println(6, E(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!c1042h0.f11239x) {
            Log.println(6, E(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 >= 9) {
            i6 = 8;
        }
        c1042h0.A(new h0.k0(this, i6, str, obj, obj2, obj3, 1));
    }

    public final boolean z(int i6) {
        return Log.isLoggable(E(), i6);
    }
}
