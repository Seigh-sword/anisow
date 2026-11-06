package m2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import b2.AbstractC0339d;
import b2.C0337b;
import com.google.android.gms.internal.measurement.C0460n0;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.InterfaceC0400d0;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.SharedPreferencesOnSharedPreferenceChangeListenerC0456m2;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m.RunnableC0969k;
import p1.C1243i;
import r0.C1271d;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends X {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CopyOnWriteArraySet f10612A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10613B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AtomicReference f10614C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f10615D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f10616E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f10617F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public K0 f10618G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PriorityQueue f10619H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10620I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1085z0 f10621J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final AtomicLong f10622K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f10623L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C1060n0 f10624M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f10625N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public K0 f10626O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SharedPreferencesOnSharedPreferenceChangeListenerC0456m2 f10627P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public K0 f10628Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C1243i f10629R;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0460n0 f10630y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1358b f10631z;

    public G0(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10612A = new CopyOnWriteArraySet();
        this.f10615D = new Object();
        this.f10616E = false;
        this.f10617F = 1;
        this.f10625N = true;
        this.f10629R = new C1243i(10, this);
        this.f10614C = new AtomicReference();
        this.f10621J = C1085z0.f11285c;
        this.f10623L = -1L;
        this.f10622K = new AtomicLong(0L);
        this.f10624M = new C1060n0(c1051k0);
    }

    public static void M(G0 g02, C1085z0 c1085z0, long j6, boolean z5, boolean z6) {
        g02.r();
        g02.y();
        C1085z0 c1085z0C = g02.p().C();
        if (j6 <= g02.f10623L) {
            if (C1085z0.h(c1085z0C.f11287b, c1085z0.f11287b)) {
                g02.f().f10721H.c(c1085z0, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        Y yP = g02.p();
        yP.r();
        int i6 = c1085z0.f11287b;
        if (!C1085z0.h(i6, yP.A().getInt("consent_source", 100))) {
            N nF = g02.f();
            nF.f10721H.c(Integer.valueOf(c1085z0.f11287b), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = yP.A().edit();
        editorEdit.putString("consent_settings", c1085z0.m());
        editorEdit.putInt("consent_source", i6);
        editorEdit.apply();
        g02.f().f10723J.c(c1085z0, "Setting storage consent(FE)");
        g02.f10623L = j6;
        Y0 y0W = g02.w();
        y0W.r();
        y0W.y();
        if (y0W.K() && y0W.q().v0() < 241200) {
            g02.w().F(z5);
        } else {
            Y0 y0W2 = g02.w();
            y0W2.r();
            y0W2.y();
            I3.a();
            if (!y0W2.n().D(null, AbstractC1078w.f11165W0) && z5) {
                y0W2.t().D();
            }
            y0W2.B(new X0(y0W2, 0));
        }
        if (z6) {
            g02.w().C(new AtomicReference());
        }
    }

    public static void N(G0 g02, C1085z0 c1085z0, C1085z0 c1085z02) {
        I3.a();
        if (g02.n().D(null, AbstractC1078w.f11165W0)) {
            return;
        }
        EnumC1083y0 enumC1083y0 = EnumC1083y0.f11278y;
        EnumC1083y0 enumC1083y02 = EnumC1083y0.f11277x;
        EnumC1083y0[] enumC1083y0Arr = {enumC1083y0, enumC1083y02};
        c1085z0.getClass();
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            EnumC1083y0 enumC1083y03 = enumC1083y0Arr[i6];
            if (!c1085z02.i(enumC1083y03) && c1085z0.i(enumC1083y03)) {
                z5 = true;
                break;
            }
            i6++;
        }
        boolean zK = c1085z0.k(c1085z02, enumC1083y0, enumC1083y02);
        if (z5 || zK) {
            g02.s().D();
        }
    }

    @Override // m2.X
    public final boolean A() {
        return false;
    }

    public final void B(long j6, Bundle bundle, String str, String str2) {
        r();
        E(str, str2, j6, bundle, true, this.f10631z == null || K1.w0(str2), true, null);
    }

    public final void C(Bundle bundle, int i6, long j6) {
        String string;
        B0 b02;
        y();
        C1085z0 c1085z0 = C1085z0.f11285c;
        EnumC1083y0[] enumC1083y0Arr = A0.STORAGE.f10482w;
        int length = enumC1083y0Arr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                string = null;
                break;
            }
            EnumC1083y0 enumC1083y0 = enumC1083y0Arr[i7];
            if (bundle.containsKey(enumC1083y0.f11280w) && (string = bundle.getString(enumC1083y0.f11280w)) != null) {
                if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i7++;
        }
        if (string != null) {
            f().f10720G.c(string, "Ignoring invalid consent setting");
            f().f10720G.d("Valid consent values are 'granted', 'denied'");
        }
        boolean zC = g().C();
        C1085z0 c1085z0C = C1085z0.c(i6, bundle);
        Iterator it = c1085z0C.f11286a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            b02 = B0.f10493x;
            if (!zHasNext) {
                break;
            } else if (((B0) it.next()) != b02) {
                L(c1085z0C, j6, zC);
                break;
            }
        }
        C1062o c1062oB = C1062o.b(i6, bundle);
        Iterator it2 = c1062oB.f11046e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((B0) it2.next()) != b02) {
                J(c1062oB, zC);
                break;
            }
        }
        Boolean boolA = C1062o.a(bundle);
        if (boolA != null) {
            String str = i6 == -30 ? "tcf" : "app";
            if (n().D(null, AbstractC1078w.f11155R0) && zC) {
                H(str, "allow_personalized_ads", boolA.toString(), j6);
            } else {
                I(str, "allow_personalized_ads", boolA.toString(), false, j6);
            }
        }
    }

    public final void D(Boolean bool, boolean z5) {
        r();
        y();
        f().f10722I.c(bool, "Setting app measurement enabled (FE)");
        Y yP = p();
        yP.r();
        SharedPreferences.Editor editorEdit = yP.A().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z5) {
            Y yP2 = p();
            yP2.r();
            SharedPreferences.Editor editorEdit2 = yP2.A().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C1051k0 c1051k0 = (C1051k0) this.f1668w;
        C1042h0 c1042h0 = c1051k0.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        if (c1051k0.f11004Z || !(bool == null || bool.booleanValue())) {
            V();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r31v3 */
    public final void E(String str, String str2, long j6, Bundle bundle, boolean z5, boolean z6, boolean z7, String str3) {
        boolean z8;
        boolean zB;
        ArrayList arrayList;
        long j7;
        Bundle[] bundleArr;
        String str4;
        String str5;
        boolean zC;
        Bundle[] bundleArr2;
        Object[] array;
        AbstractC1332d.g(str);
        AbstractC1332d.m(bundle);
        r();
        y();
        Object obj = this.f1668w;
        C1051k0 c1051k0 = (C1051k0) obj;
        if (!c1051k0.j()) {
            f().f10722I.d("Event not sent since app measurement is disabled");
            return;
        }
        List list = s().f10656E;
        if (list != null && !list.contains(str2)) {
            f().f10722I.b(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f10613B) {
            this.f10613B = true;
            try {
                try {
                    (!((C1051k0) obj).f10979A ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, a());
                } catch (Exception e6) {
                    f().f10718E.c(e6, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                f().f10721H.d("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            ((C0337b) h()).getClass();
            z8 = false;
            H("auto", "_lgclid", string, System.currentTimeMillis());
        } else {
            z8 = false;
        }
        if (z5 && (!K1.f10677F[z8 ? 1 : 0].equals(str2))) {
            q().J(bundle, p().f10822V.s());
        }
        C1243i c1243i = this.f10629R;
        if (!z7 && !"_iap".equals(str2)) {
            K1 k12 = c1051k0.f10986H;
            C1051k0.e(k12);
            char c6 = 2;
            c6 = 2;
            if (k12.r0("event", str2)) {
                if (!k12.f0("event", C0.f10530a, C0.f10531b, str2)) {
                    c6 = '\r';
                } else if (k12.X(40, "event", str2)) {
                    c6 = z8 ? 1 : 0;
                }
            }
            if (c6 != 0) {
                f().f10717D.c(o().b(str2), "Invalid public event name. Event will not be logged (FE)");
                c1051k0.r();
                String strF = K1.F(40, str2, true);
                ?? length = z8;
                if (str2 != null) {
                    length = str2.length();
                }
                c1051k0.r();
                K1.V(c1243i, null, c6 == true ? 1 : 0, "_ev", strF, length == true ? 1 : 0);
                return;
            }
        }
        V0 v0C = v().C(z8);
        if (v0C != null && !bundle.containsKey("_sc")) {
            v0C.f10787d = true;
        }
        K1.U(v0C, bundle, (!z5 || z7) ? z8 ? 1 : 0 : true);
        boolean zEquals = "am".equals(str);
        boolean zW0 = K1.w0(str2);
        if (z5 && this.f10631z != null && !zW0 && !zEquals) {
            f().f10722I.b(o().b(str2), o().a(bundle), "Passing event to registered event handler (FE)");
            AbstractC1332d.m(this.f10631z);
            C1358b c1358b = this.f10631z;
            c1358b.getClass();
            try {
                ((InterfaceC0400d0) c1358b.f12822x).B(j6, bundle, str, str2);
                return;
            } catch (RemoteException e7) {
                C1051k0 c1051k02 = ((AppMeasurementDynamiteService) c1358b.f12823y).f7026c;
                if (c1051k02 != null) {
                    N n5 = c1051k02.f10983E;
                    C1051k0.i(n5);
                    n5.f10718E.c(e7, "Event interceptor threw exception");
                    return;
                }
                return;
            }
        }
        if (c1051k0.k()) {
            int iW = q().w(str2);
            if (iW != 0) {
                f().f10717D.c(o().b(str2), "Invalid event name. Event will not be logged (FE)");
                q();
                String strF2 = K1.F(40, str2, true);
                int length2 = str2 != null ? str2.length() : z8 ? 1 : 0;
                c1051k0.r();
                K1.V(c1243i, str3, iW, "_ev", strF2, length2 == true ? 1 : 0);
                return;
            }
            String str6 = "_o";
            Bundle bundleB = q().B(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z7);
            AbstractC1332d.m(bundleB);
            if (v().C(z8) != null && "_ae".equals(str2)) {
                C1064o1 c1064o1 = x().f11014B;
                ((C0337b) c1064o1.f11052d.h()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j8 = jElapsedRealtime - c1064o1.f11050b;
                c1064o1.f11050b = jElapsedRealtime;
                if (j8 > 0) {
                    q().I(bundleB, j8);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                K1 k1Q = q();
                String string2 = bundleB.getString("_ffr");
                int i6 = AbstractC0339d.f5920a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                if (Objects.equals(string2, k1Q.p().f10819S.d())) {
                    k1Q.f().f10722I.d("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                k1Q.p().f10819S.e(string2);
            } else if ("_ae".equals(str2)) {
                String strD = q().p().f10819S.d();
                if (!TextUtils.isEmpty(strD)) {
                    bundleB.putString("_ffr", strD);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleB);
            if (n().D(null, AbstractC1078w.f11147N0)) {
                C1052k1 c1052k1X = x();
                c1052k1X.r();
                zB = c1052k1X.f11017z;
            } else {
                zB = p().f10816P.b();
            }
            if (p().f10813M.a() > 0 && p().w(j6) && zB) {
                f().f10723J.d("Current session is expired, remove the session number, ID, and engagement time");
                ((C0337b) h()).getClass();
                arrayList = arrayList2;
                j7 = 0;
                bundleArr = null;
                H("auto", "_sid", null, System.currentTimeMillis());
                ((C0337b) h()).getClass();
                H("auto", "_sno", null, System.currentTimeMillis());
                ((C0337b) h()).getClass();
                H("auto", "_se", null, System.currentTimeMillis());
                p().f10814N.b(0L);
            } else {
                arrayList = arrayList2;
                j7 = 0;
                bundleArr = null;
            }
            if (bundleB.getLong("extend_session", j7) == 1) {
                f().f10723J.d("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                C1052k1 c1052k1 = c1051k0.f10985G;
                C1051k0.d(c1052k1);
                c1052k1.f11013A.B(true, j6);
            }
            ArrayList arrayList3 = new ArrayList(bundleB.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i7 = z8 ? 1 : 0;
            while (i7 < size) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                String str7 = (String) obj2;
                if (str7 != null) {
                    q();
                    Object obj3 = bundleB.get(str7);
                    if (obj3 instanceof Bundle) {
                        bundleArr2 = new Bundle[]{(Bundle) obj3};
                    } else {
                        if (obj3 instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj3;
                            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj3 instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj3;
                            array = arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr2 = bundleArr;
                        }
                        bundleArr2 = (Bundle[]) array;
                    }
                    if (bundleArr2 != null) {
                        bundleB.putParcelableArray(str7, bundleArr2);
                    }
                }
            }
            int i8 = z8 ? 1 : 0;
            while (i8 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundleA = (Bundle) arrayList5.get(i8);
                if (i8 != 0) {
                    str5 = "_ep";
                    str4 = str;
                } else {
                    str4 = str;
                    str5 = str2;
                }
                bundleA.putString(str6, str4);
                if (z6) {
                    bundleA = q().A(bundleA);
                }
                Bundle bundle2 = bundleA;
                String str8 = str6;
                C1076v c1076v = new C1076v(str5, new C1074u(bundle2), str, j6);
                Y0 y0W = w();
                y0W.getClass();
                y0W.r();
                y0W.y();
                I iT = y0W.t();
                iT.getClass();
                Parcel parcelObtain = Parcel.obtain();
                c1076v.writeToParcel(parcelObtain, z8 ? 1 : 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    iT.f().f10716C.d("Event is too long for local database. Sending event directly to service");
                    zC = z8 ? 1 : 0;
                } else {
                    zC = iT.C(z8 ? 1 : 0, bArrMarshall);
                }
                y0W.B(new RunnableC1031d1(y0W, y0W.N(true), zC, c1076v, str3));
                if (!zEquals) {
                    Iterator it = this.f10612A.iterator();
                    while (it.hasNext()) {
                        ((D0) it.next()).a(j6, new Bundle(bundle2), str, str2);
                    }
                }
                i8++;
                str6 = str8;
                arrayList = arrayList5;
            }
            if (v().C(z8) == null || !"_ae".equals(str2)) {
                return;
            }
            C1052k1 c1052k1X2 = x();
            ((C0337b) h()).getClass();
            c1052k1X2.f11014B.a(true, true, SystemClock.elapsedRealtime());
        }
    }

    public final void F(String str, String str2, Bundle bundle) {
        ((C0337b) h()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC1332d.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        g().A(new I0(this, bundle2, 1));
    }

    public final void G(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j6) {
        String strB;
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z7 = !z6 || this.f10631z == null || K1.w0(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i6 = 0; i6 < parcelableArr.length; i6++) {
                        if (parcelableArr[i6] instanceof Bundle) {
                            parcelableArr[i6] = new Bundle((Bundle) parcelableArr[i6]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        Object obj2 = list.get(i7);
                        if (obj2 instanceof Bundle) {
                            list.set(i7, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            g().A(new M0(this, str3, str2, j6, bundle3, z6, z7, z5));
            return;
        }
        U0 u0V = v();
        synchronized (u0V.f10778H) {
            try {
                if (u0V.f10777G) {
                    String string = bundle2.getString("screen_name");
                    if (string == null || (string.length() > 0 && string.length() <= u0V.n().t(null, false))) {
                        String string2 = bundle2.getString("screen_class");
                        if (string2 == null || (string2.length() > 0 && string2.length() <= u0V.n().t(null, false))) {
                            if (string2 == null) {
                                Activity activity = u0V.f10773C;
                                strB = activity != null ? u0V.B(activity.getClass()) : "Activity";
                            } else {
                                strB = string2;
                            }
                            V0 v02 = u0V.f10779y;
                            if (u0V.f10774D && v02 != null) {
                                u0V.f10774D = false;
                                boolean zEquals = Objects.equals(v02.f10785b, strB);
                                boolean zEquals2 = Objects.equals(v02.f10784a, string);
                                if (zEquals && zEquals2) {
                                    u0V.f().f10720G.d("Ignoring call to log screen view event with duplicate parameters.");
                                }
                            }
                            u0V.f().f10723J.b(string == null ? "null" : string, strB == null ? "null" : strB, "Logging screen view with name, class");
                            V0 v03 = u0V.f10779y == null ? u0V.f10780z : u0V.f10779y;
                            V0 v04 = new V0(string, strB, u0V.q().B0(), true, j6);
                            u0V.f10779y = v04;
                            u0V.f10780z = v03;
                            u0V.f10775E = v04;
                            ((C0337b) u0V.h()).getClass();
                            u0V.g().A(new RunnableC1071s0(u0V, bundle2, v04, v03, SystemClock.elapsedRealtime(), 2));
                            return;
                        }
                        u0V.f().f10720G.c(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    } else {
                        u0V.f().f10720G.c(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    }
                } else {
                    u0V.f().f10720G.d("Cannot log screen view event when the app is in the background.");
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.G0.H(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            r11 = this;
            r8 = r11
            r3 = r13
            r0 = r14
            if (r12 != 0) goto L9
            java.lang.String r1 = "app"
            r2 = r1
            goto La
        L9:
            r2 = r12
        La:
            r1 = 0
            r4 = 24
            m2.K1 r5 = r11.q()
            if (r15 == 0) goto L19
            int r5 = r5.j0(r13)
        L17:
            r9 = r5
            goto L37
        L19:
            java.lang.String r6 = "user property"
            boolean r7 = r5.r0(r6, r13)
            r9 = 6
            if (r7 != 0) goto L23
            goto L37
        L23:
            java.lang.String[] r7 = m2.C0.f10534e
            r10 = 0
            boolean r7 = r5.f0(r6, r7, r10, r13)
            if (r7 != 0) goto L2f
            r5 = 15
            goto L17
        L2f:
            boolean r5 = r5.X(r4, r6, r13)
            if (r5 != 0) goto L36
            goto L37
        L36:
            r9 = r1
        L37:
            p1.i r5 = r8.f10629R
            java.lang.Object r6 = r8.f1668w
            r7 = 1
            if (r9 == 0) goto L5f
            r11.q()
            java.lang.String r0 = m2.K1.F(r4, r13, r7)
            if (r3 == 0) goto L4b
            int r1 = r13.length()
        L4b:
            m2.k0 r6 = (m2.C1051k0) r6
            r6.r()
            r2 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r2
            r14 = r9
            r15 = r3
            r16 = r0
            r17 = r1
            m2.K1.V(r12, r13, r14, r15, r16, r17)
            return
        L5f:
            if (r0 == 0) goto Lb3
            m2.K1 r9 = r11.q()
            int r9 = r9.v(r14, r13)
            if (r9 == 0) goto L96
            r11.q()
            java.lang.String r2 = m2.K1.F(r4, r13, r7)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7a
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L82
        L7a:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r1 = r0.length()
        L82:
            m2.k0 r6 = (m2.C1051k0) r6
            r6.r()
            r0 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r0
            r14 = r9
            r15 = r3
            r16 = r2
            r17 = r1
            m2.K1.V(r12, r13, r14, r15, r16, r17)
            return
        L96:
            m2.K1 r1 = r11.q()
            java.lang.Object r4 = r1.p0(r14, r13)
            if (r4 == 0) goto Lb2
            m2.h0 r9 = r11.g()
            m2.s0 r10 = new m2.s0
            r7 = 1
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.A(r10)
        Lb2:
            return
        Lb3:
            m2.h0 r9 = r11.g()
            m2.s0 r10 = new m2.s0
            r7 = 1
            r4 = 0
            r0 = r10
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r9.A(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.G0.I(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void J(C1062o c1062o, boolean z5) {
        RunnableC0969k runnableC0969k = new RunnableC0969k(this, 28, c1062o);
        if (!z5) {
            g().A(runnableC0969k);
        } else {
            r();
            runnableC0969k.run();
        }
    }

    public final void K(C1085z0 c1085z0) {
        r();
        boolean z5 = (c1085z0.i(EnumC1083y0.f11278y) && c1085z0.i(EnumC1083y0.f11277x)) || w().J();
        C1051k0 c1051k0 = (C1051k0) this.f1668w;
        C1042h0 c1042h0 = c1051k0.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.r();
        if (z5 != c1051k0.f11004Z) {
            C1051k0 c1051k02 = (C1051k0) this.f1668w;
            C1042h0 c1042h02 = c1051k02.f10984F;
            C1051k0.i(c1042h02);
            c1042h02.r();
            c1051k02.f11004Z = z5;
            Y yP = p();
            yP.r();
            Boolean boolValueOf = yP.A().contains("measurement_enabled_from_api") ? Boolean.valueOf(yP.A().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z5 || boolValueOf == null || boolValueOf.booleanValue()) {
                D(Boolean.valueOf(z5), false);
            }
        }
    }

    public final void L(C1085z0 c1085z0, long j6, boolean z5) {
        C1085z0 c1085z02;
        boolean z6;
        boolean zK;
        boolean z7;
        C1085z0 c1085z0J = c1085z0;
        y();
        int i6 = c1085z0J.f11287b;
        if (i6 != -10) {
            B0 b02 = (B0) c1085z0J.f11286a.get(EnumC1083y0.f11277x);
            if (b02 == null) {
                b02 = B0.f10493x;
            }
            B0 b03 = B0.f10493x;
            if (b02 == b03) {
                B0 b04 = (B0) c1085z0J.f11286a.get(EnumC1083y0.f11278y);
                if (b04 == null) {
                    b04 = b03;
                }
                if (b04 == b03) {
                    f().f10720G.d("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f10615D) {
            try {
                c1085z02 = this.f10621J;
                z6 = false;
                if (C1085z0.h(i6, c1085z02.f11287b)) {
                    zK = c1085z0.k(this.f10621J, (EnumC1083y0[]) c1085z0J.f11286a.keySet().toArray(new EnumC1083y0[0]));
                    EnumC1083y0 enumC1083y0 = EnumC1083y0.f11278y;
                    if (c1085z0.i(enumC1083y0) && !this.f10621J.i(enumC1083y0)) {
                        z6 = true;
                    }
                    c1085z0J = c1085z0.j(this.f10621J);
                    this.f10621J = c1085z0J;
                    z7 = z6;
                    z6 = true;
                } else {
                    zK = false;
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z6) {
            f().f10721H.c(c1085z0J, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f10622K.getAndIncrement();
        if (zK) {
            X(null);
            O0 o02 = new O0(this, c1085z0J, j6, andIncrement, z7, c1085z02);
            if (!z5) {
                g().B(o02);
                return;
            } else {
                r();
                o02.run();
                return;
            }
        }
        P0 p02 = new P0(this, c1085z0J, andIncrement, z7, c1085z02);
        if (z5) {
            r();
            p02.run();
        } else if (i6 == 30 || i6 == -10) {
            g().B(p02);
        } else {
            g().A(p02);
        }
    }

    public final void O(boolean z5, long j6) {
        r();
        y();
        f().f10722I.d("Resetting analytics data (FE)");
        C1052k1 c1052k1X = x();
        c1052k1X.r();
        C1064o1 c1064o1 = c1052k1X.f11014B;
        c1064o1.f11051c.a();
        C1052k1 c1052k1 = c1064o1.f11052d;
        if (c1052k1.n().D(null, AbstractC1078w.f11174a1)) {
            ((C0337b) c1052k1.h()).getClass();
            c1064o1.f11049a = SystemClock.elapsedRealtime();
        } else {
            c1064o1.f11049a = 0L;
        }
        c1064o1.f11050b = c1064o1.f11049a;
        s().D();
        boolean zJ = ((C1051k0) this.f1668w).j();
        Y yP = p();
        yP.f10803C.b(j6);
        if (!TextUtils.isEmpty(yP.p().f10819S.d())) {
            yP.f10819S.e(null);
        }
        yP.f10813M.b(0L);
        yP.f10814N.b(0L);
        Boolean boolB = yP.n().B("firebase_analytics_collection_deactivated");
        if (boolB == null || !boolB.booleanValue()) {
            yP.y(!zJ);
        }
        yP.f10820T.e(null);
        yP.f10821U.b(0L);
        yP.f10822V.u(null);
        if (z5) {
            Y0 y0W = w();
            y0W.r();
            y0W.y();
            B1 b1N = y0W.N(false);
            y0W.t().D();
            y0W.B(new RunnableC1025b1(y0W, b1N, 0));
        }
        x().f11013A.D();
        this.f10625N = !zJ;
    }

    public final PriorityQueue P() {
        if (this.f10619H == null) {
            this.f10619H = new PriorityQueue(Comparator.comparing(new F0(), new B.h(3)));
        }
        return this.f10619H;
    }

    public final void Q() {
        r();
        y();
        Object obj = this.f1668w;
        if (((C1051k0) obj).k()) {
            Boolean boolB = n().B("google_analytics_deferred_deep_link_enabled");
            int i6 = 1;
            if (boolB != null && boolB.booleanValue()) {
                f().f10722I.d("Deferred Deep Link feature enabled.");
                g().A(new RunnableC1063o0(this, i6));
            }
            Y0 y0W = w();
            y0W.r();
            y0W.y();
            B1 b1N = y0W.N(true);
            y0W.t().C(3, new byte[0]);
            y0W.B(new RunnableC1025b1(y0W, b1N, i6));
            this.f10625N = false;
            Y yP = p();
            yP.r();
            String string = yP.A().getString("previous_os_version", null);
            ((C1051k0) yP.f1668w).n().s();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = yP.A().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ((C1051k0) obj).n().s();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            Y("auto", "_ou", bundle);
        }
    }

    public final void R() {
        if (!(a().getApplicationContext() instanceof Application) || this.f10630y == null) {
            return;
        }
        ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10630y);
    }

    public final void S() {
        J4.a();
        if (n().D(null, AbstractC1078w.f11135H0)) {
            if (g().C()) {
                f().f10715B.d("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (V0.m.h()) {
                f().f10715B.d("Cannot get trigger URIs from main thread");
                return;
            }
            y();
            f().f10723J.d("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            g().v(atomicReference, 5000L, "get trigger URIs", new H0(this, atomicReference, 0));
            List list = (List) atomicReference.get();
            if (list == null) {
                f().f10715B.d("Timed out waiting for get trigger URIs");
            } else {
                g().A(new RunnableC0969k(this, list, 24));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.G0.T():void");
    }

    public final void U() {
        r1 r1Var;
        C1271d c1271dC0;
        r();
        this.f10620I = false;
        if (P().isEmpty() || this.f10616E || (r1Var = (r1) P().poll()) == null || (c1271dC0 = q().C0()) == null) {
            return;
        }
        this.f10616E = true;
        P p5 = f().f10723J;
        String str = r1Var.f11073w;
        p5.c(str, "Registering trigger URI");
        X2.a aVarD = c1271dC0.d(Uri.parse(str));
        if (aVarD == null) {
            this.f10616E = false;
            P().add(r1Var);
            return;
        }
        if (!n().D(null, AbstractC1078w.f11145M0)) {
            SparseArray sparseArrayB = p().B();
            sparseArrayB.put(r1Var.f11075y, Long.valueOf(r1Var.f11074x));
            p().v(sparseArrayB);
        }
        aVarD.a(new RunnableC1028c1(aVarD, new C1358b(this, r1Var, 25), 11), new U0.a(2, this));
    }

    public final void V() {
        r();
        String strD = p().f10810J.d();
        if (strD != null) {
            if ("unset".equals(strD)) {
                ((C0337b) h()).getClass();
                H("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long lValueOf = Long.valueOf("true".equals(strD) ? 1L : 0L);
                ((C0337b) h()).getClass();
                H("app", "_npa", lValueOf, System.currentTimeMillis());
            }
        }
        if (((C1051k0) this.f1668w).j() && this.f10625N) {
            f().f10722I.d("Recording app launch after enabling measurement for the first time (FE)");
            Q();
            x().f11013A.D();
            g().A(new RunnableC1063o0(this, 2));
            return;
        }
        f().f10722I.d("Updating Scion state (FE)");
        Y0 y0W = w();
        y0W.r();
        y0W.y();
        y0W.B(new RunnableC1025b1(y0W, y0W.N(true), 3));
    }

    public final void W(Bundle bundle, long j6) {
        AbstractC1332d.m(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            f().f10718E.d("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        f2.h.M(bundle2, "app_id", String.class, null);
        f2.h.M(bundle2, "origin", String.class, null);
        f2.h.M(bundle2, "name", String.class, null);
        f2.h.M(bundle2, "value", Object.class, null);
        f2.h.M(bundle2, "trigger_event_name", String.class, null);
        f2.h.M(bundle2, "trigger_timeout", Long.class, 0L);
        f2.h.M(bundle2, "timed_out_event_name", String.class, null);
        f2.h.M(bundle2, "timed_out_event_params", Bundle.class, null);
        f2.h.M(bundle2, "triggered_event_name", String.class, null);
        f2.h.M(bundle2, "triggered_event_params", Bundle.class, null);
        f2.h.M(bundle2, "time_to_live", Long.class, 0L);
        f2.h.M(bundle2, "expired_event_name", String.class, null);
        f2.h.M(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1332d.g(bundle2.getString("name"));
        AbstractC1332d.g(bundle2.getString("origin"));
        AbstractC1332d.m(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j6);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (q().j0(string) != 0) {
            N nF = f();
            nF.f10715B.c(o().g(string), "Invalid conditional user property name");
            return;
        }
        if (q().v(obj, string) != 0) {
            N nF2 = f();
            nF2.f10715B.b(o().g(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objP0 = q().p0(obj, string);
        if (objP0 == null) {
            N nF3 = f();
            nF3.f10715B.b(o().g(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        f2.h.O(bundle2, objP0);
        long j7 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j7 > 15552000000L || j7 < 1)) {
            N nF4 = f();
            nF4.f10715B.b(o().g(string), Long.valueOf(j7), "Invalid conditional user property timeout");
            return;
        }
        long j8 = bundle2.getLong("time_to_live");
        if (j8 <= 15552000000L && j8 >= 1) {
            g().A(new I0(this, bundle2, 2));
            return;
        }
        N nF5 = f();
        nF5.f10715B.b(o().g(string), Long.valueOf(j8), "Invalid conditional user property time to live");
    }

    public final void X(String str) {
        this.f10614C.set(str);
    }

    public final void Y(String str, String str2, Bundle bundle) {
        r();
        ((C0337b) h()).getClass();
        B(System.currentTimeMillis(), bundle, str, str2);
    }
}
