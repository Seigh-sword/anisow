package m2;

import android.os.Bundle;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f10670b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f10671c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f10672d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1.b f10673a;

    public K(K1.b bVar) {
        this.f10673a = bVar;
    }

    public static String c(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC1332d.m(atomicReference);
        AbstractC1332d.c(strArr.length == strArr2.length);
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (Objects.equals(str, strArr[i6])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i6] == null) {
                            strArr3[i6] = strArr2[i6] + "(" + strArr[i6] + ")";
                        }
                        str2 = strArr3[i6];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f10673a.D()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f10673a.D() ? str : c(str, C0.f10532c, C0.f10530a, f10670b);
    }

    public final String d(C1076v c1076v) {
        K1.b bVar = this.f10673a;
        if (!bVar.D()) {
            return c1076v.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c1076v.f11115y);
        sb.append(",name=");
        sb.append(b(c1076v.f11113w));
        sb.append(",params=");
        C1074u c1074u = c1076v.f11114x;
        sb.append(c1074u == null ? null : !bVar.D() ? c1074u.f11108w.toString() : a(c1074u.c()));
        return sb.toString();
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strA);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f10673a.D() ? str : c(str, C0.f10537h, C0.f10536g, f10671c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        return !this.f10673a.D() ? str : str.startsWith("_exp_") ? AbstractC0628i.j("experiment_id(", str, ")") : c(str, C0.f10535f, C0.f10534e, f10672d);
    }
}
