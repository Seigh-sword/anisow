package m2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b2.C0337b;
import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import com.google.android.gms.internal.measurement.Q4;
import d.AbstractC0628i;
import d2.C0652c;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p0.C1231a;
import r0.C1271d;
import s0.C1288c;
import s4.AbstractC1305a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends AbstractC1081x0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f10676E = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f10677F = {"_err"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10678A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1271d f10679B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Boolean f10680C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Integer f10681D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SecureRandom f10682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicLong f10683z;

    public K1(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10681D = null;
        this.f10683z = new AtomicLong(0L);
    }

    public static Bundle C(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G1 g12 = (G1) it.next();
            String str = g12.f10632A;
            String str2 = g12.f10636x;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l5 = g12.f10638z;
                if (l5 != null) {
                    bundle.putLong(str2, l5.longValue());
                } else {
                    Double d6 = g12.f10634C;
                    if (d6 != null) {
                        bundle.putDouble(str2, d6.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest E0() {
        MessageDigest messageDigest;
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static String F(int i6, String str, boolean z5) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i6) {
            return str;
        }
        if (z5) {
            return AbstractC0628i.i(str.substring(0, str.offsetByCodePoints(0, i6)), "...");
        }
        return null;
    }

    public static void H(Bundle bundle, int i6, String str, Object obj) {
        if (m0(i6, bundle)) {
            bundle.putString("_ev", F(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void U(V0 v02, Bundle bundle, boolean z5) {
        if (bundle == null || v02 == null || (bundle.containsKey("_sc") && !z5)) {
            if (bundle != null && v02 == null && z5) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = v02.f10784a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = v02.f10785b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", v02.f10786c);
    }

    public static void V(J1 j12, String str, int i6, String str2, String str3, int i7) {
        Bundle bundle = new Bundle();
        m0(i6, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i6 == 6 || i6 == 7 || i6 == 2) {
            bundle.putLong("_el", i7);
        }
        j12.a(str, "_err", bundle);
    }

    public static boolean Y(Context context) {
        ActivityInfo receiverInfo;
        AbstractC1332d.m(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean a0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean d0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC1332d.m(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean e0(String str, String[] strArr) {
        AbstractC1332d.m(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] g0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList l0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1029d c1029d = (C1029d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c1029d.f10871w);
            bundle.putString("origin", c1029d.f10872x);
            bundle.putLong("creation_timestamp", c1029d.f10874z);
            bundle.putString("name", c1029d.f10873y.f10636x);
            Object objA = c1029d.f10873y.a();
            AbstractC1332d.m(objA);
            f2.h.O(bundle, objA);
            bundle.putBoolean("active", c1029d.f10864A);
            String str = c1029d.f10865B;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C1076v c1076v = c1029d.f10866C;
            if (c1076v != null) {
                bundle.putString("timed_out_event_name", c1076v.f11113w);
                C1074u c1074u = c1076v.f11114x;
                if (c1074u != null) {
                    bundle.putBundle("timed_out_event_params", c1074u.c());
                }
            }
            bundle.putLong("trigger_timeout", c1029d.f10867D);
            C1076v c1076v2 = c1029d.f10868E;
            if (c1076v2 != null) {
                bundle.putString("triggered_event_name", c1076v2.f11113w);
                C1074u c1074u2 = c1076v2.f11114x;
                if (c1074u2 != null) {
                    bundle.putBundle("triggered_event_params", c1074u2.c());
                }
            }
            bundle.putLong("triggered_timestamp", c1029d.f10873y.f10637y);
            bundle.putLong("time_to_live", c1029d.f10869F);
            C1076v c1076v3 = c1029d.f10870G;
            if (c1076v3 != null) {
                bundle.putString("expired_event_name", c1076v3.f11113w);
                C1074u c1074u3 = c1076v3.f11114x;
                if (c1074u3 != null) {
                    bundle.putBundle("expired_event_params", c1074u3.c());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean m0(int i6, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i6);
        return true;
    }

    public static boolean q0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean u0(String str) {
        String str2 = (String) AbstractC1078w.f11233z0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean w0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean x0(String str) {
        AbstractC1332d.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static long y(C1074u c1074u) {
        long length = 0;
        if (c1074u == null) {
            return 0L;
        }
        Bundle bundle = c1074u.f11108w;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) obj).length;
            }
        }
        return length;
    }

    public static long z(byte[] bArr) {
        AbstractC1332d.m(bArr);
        int i6 = 0;
        AbstractC1332d.p(bArr.length > 0);
        long j6 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j6 += (((long) bArr[length]) & 255) << i6;
            i6 += 8;
        }
        return j6;
    }

    public static int z0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    public final Bundle A(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objK0 = k0(bundle.get(str), str);
                if (objK0 == null) {
                    N nF = f();
                    nF.f10720G.c(o().f(str), "Param value can't be null");
                } else {
                    K(bundle2, str, objK0);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A0() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.K1.A0():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle B(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.K1.B(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final long B0() {
        long andIncrement;
        long j6;
        if (this.f10683z.get() != 0) {
            synchronized (this.f10683z) {
                this.f10683z.compareAndSet(-1L, 1L);
                andIncrement = this.f10683z.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f10683z) {
            long jNanoTime = System.nanoTime();
            ((C0337b) h()).getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i6 = this.f10678A + 1;
            this.f10678A = i6;
            j6 = jNextLong + ((long) i6);
        }
        return j6;
    }

    public final C1271d C0() {
        if (this.f10679B == null) {
            Context contextA = a();
            AbstractC1305a.o(contextA, "context");
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i6 = Build.VERSION.SDK_INT;
            C1231a c1231a = C1231a.f12210a;
            sb.append(i6 >= 30 ? c1231a.a() : 0);
            Log.d("MeasurementManager", sb.toString());
            C1288c c1288c = (i6 < 30 || c1231a.a() < 5) ? null : new C1288c(contextA);
            this.f10679B = c1288c != null ? new C1271d(c1288c) : null;
        }
        return this.f10679B;
    }

    public final Bundle D(boolean z5, Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z5 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z5 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z5 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z5 && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e6) {
            f().f10718E.c(e6, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final String D0() {
        byte[] bArr = new byte[16];
        F0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object E(int i6, Object obj, boolean z5, boolean z6) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return F(i6, String.valueOf(obj), z5);
        }
        if (!z6 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleA = A((Bundle) parcelable);
                if (!bundleA.isEmpty()) {
                    arrayList.add(bundleA);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final SecureRandom F0() {
        r();
        if (this.f10682y == null) {
            this.f10682y = new SecureRandom();
        }
        return this.f10682y;
    }

    public final C1076v G(String str, Bundle bundle, String str2, long j6, boolean z5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (w(str) != 0) {
            f().f10715B.c(o().g(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleB = B(str, bundle2, Collections.singletonList("_o"), true);
        if (z5) {
            bundleB = A(bundleB);
        }
        AbstractC1332d.m(bundleB);
        return new C1076v(str, new C1074u(bundleB), str2, j6);
    }

    public final void I(Bundle bundle, long j6) {
        long j7 = bundle.getLong("_et");
        if (j7 != 0) {
            N nF = f();
            nF.f10718E.c(Long.valueOf(j7), "Params already contained engagement");
        }
        bundle.putLong("_et", j6 + j7);
    }

    public final void J(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                q().K(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void K(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            f().f10720G.b(o().f(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final void L(InterfaceC0394c0 interfaceC0394c0, int i6) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i6);
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = ((C1051k0) this.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning int value to wrapper");
        }
    }

    public final void M(InterfaceC0394c0 interfaceC0394c0, long j6) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j6);
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = ((C1051k0) this.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning long value to wrapper");
        }
    }

    public final void N(InterfaceC0394c0 interfaceC0394c0, Bundle bundle) {
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = ((C1051k0) this.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning bundle value to wrapper");
        }
    }

    public final void O(InterfaceC0394c0 interfaceC0394c0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = ((C1051k0) this.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning bundle list to wrapper");
        }
    }

    public final void P(InterfaceC0394c0 interfaceC0394c0, boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z5);
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = ((C1051k0) this.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning boolean value to wrapper");
        }
    }

    public final void Q(InterfaceC0394c0 interfaceC0394c0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = ((C1051k0) this.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning byte array to wrapper");
        }
    }

    public final void R(String str, InterfaceC0394c0 interfaceC0394c0) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = ((C1051k0) this.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(java.lang.String r19, java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.K1.S(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void T(S s5, int i6) {
        int i7 = 0;
        for (String str : new TreeSet(((Bundle) s5.f10757d).keySet())) {
            if (x0(str) && (i7 = i7 + 1) > i6) {
                f().f10717D.b(o().b((String) s5.f10755b), o().a((Bundle) s5.f10757d), H1.a.j("Event can't contain more than ", i6, " params"));
                m0(5, (Bundle) s5.f10757d);
                ((Bundle) s5.f10757d).remove(str);
            }
        }
    }

    public final void W(Parcelable[] parcelableArr, int i6) {
        AbstractC1332d.m(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i7 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (x0(str) && !e0(str, C0.f10539j) && (i7 = i7 + 1) > i6) {
                    f().f10717D.b(o().f(str), o().a(bundle), H1.a.j("Param can't contain more than ", i6, " item-scoped custom parameters"));
                    m0(28, bundle);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean X(int i6, String str, String str2) {
        if (str2 == null) {
            f().f10717D.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i6) {
            return true;
        }
        N nF = f();
        nF.f10717D.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i6), str2);
        return false;
    }

    public final boolean b0(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        Object obj = this.f1668w;
        if (!zIsEmpty) {
            AbstractC1332d.m(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(((C1051k0) obj).f11010x)) {
                N nF = f();
                nF.f10717D.c(N.x(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(((C1051k0) obj).f11010x)) {
                f().f10717D.d("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        AbstractC1332d.m(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        N nF2 = f();
        nF2.f10717D.c(N.x(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    public final boolean c0(String str, String str2, int i6, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i6) {
                N nF = f();
                nF.f10720G.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean f0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            f().f10717D.c(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f10676E;
        for (int i6 = 0; i6 < 3; i6++) {
            if (str2.startsWith(strArr3[i6])) {
                f().f10717D.b(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !e0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && e0(str2, strArr2)) {
            return true;
        }
        f().f10717D.b(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean h0(int i6) {
        Boolean bool = ((C1051k0) this.f1668w).q().f10825A;
        if (v0() < i6 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final void i0() {
        r();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                f().f10718E.d("Utils falling back to Random for random id");
            }
        }
        this.f10683z.set(jNextLong);
    }

    public final int j0(String str) {
        if (!o0("user property", str)) {
            return 6;
        }
        if (f0("user property", C0.f10534e, null, str)) {
            return !X(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Object k0(Object obj, String str) {
        if ("_ev".equals(str)) {
            return E(Math.max(n().t(null, false), 256), obj, true, true);
        }
        return E(w0(str) ? Math.max(n().t(null, false), 256) : n().t(null, false), obj, false, true);
    }

    public final boolean n0(Context context, String str) {
        N nF;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoG = C0652c.a(context).g(64, str);
            if (packageInfoG == null || (signatureArr = packageInfoG.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e6) {
            e = e6;
            nF = f();
            str2 = "Package name not found";
            nF.f10715B.c(e, str2);
            return true;
        } catch (CertificateException e7) {
            e = e7;
            nF = f();
            str2 = "Error obtaining certificate";
            nF.f10715B.c(e, str2);
            return true;
        }
    }

    public final boolean o0(String str, String str2) {
        if (str2 == null) {
            f().f10717D.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            f().f10717D.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            f().f10717D.b(str, str2, "Name must start with a letter or _ (underscore). Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                f().f10717D.b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object p0(Object obj, String str) {
        boolean zEquals = "_ldl".equals(str);
        int iZ0 = z0(str);
        return zEquals ? E(iZ0, obj, true, false) : E(iZ0, obj, false, false);
    }

    public final boolean r0(String str, String str2) {
        if (str2 == null) {
            f().f10717D.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            f().f10717D.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            f().f10717D.b(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                f().f10717D.b(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean s0(String str, String str2) {
        Q4.a();
        if (n().D(null, AbstractC1078w.f11229x0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return n().u("debug.firebase.analytics.app").equals(str);
    }

    public final boolean t0(String str) {
        r();
        if (C0652c.a(a()).f12256x.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        f().f10722I.c(str, "Permission not granted");
        return false;
    }

    @Override // m2.AbstractC1081x0
    public final boolean u() {
        return true;
    }

    public final int v(Object obj, String str) {
        return c0("_ldl".equals(str) ? "user property referrer" : "user property", str, z0(str), obj) ? 0 : 7;
    }

    public final int v0() {
        if (this.f10681D == null) {
            U1.f fVar = U1.f.f3588b;
            Context contextA = a();
            fVar.getClass();
            AtomicBoolean atomicBoolean = U1.h.f3590a;
            int i6 = 0;
            try {
                i6 = contextA.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f10681D = Integer.valueOf(i6 / 1000);
        }
        return this.f10681D.intValue();
    }

    public final int w(String str) {
        if (!o0("event", str)) {
            return 2;
        }
        if (f0("event", C0.f10530a, C0.f10531b, str)) {
            return !X(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.K1.x(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean y0(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }
}
