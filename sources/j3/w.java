package J3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import b3.C0343c;
import c4.AbstractC0377b;
import c4.C0378c;
import c4.C0379d;
import c4.C0380e;
import com.google.android.gms.internal.measurement.C0417g;
import com.google.android.gms.internal.measurement.C0465o;
import com.google.android.gms.internal.measurement.C0477q;
import com.google.android.gms.internal.measurement.CallableC0478q0;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.InterfaceC0459n;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.O1;
import com.google.android.gms.internal.measurement.e5;
import com.onesignal.C0594t1;
import com.onesignal.C1;
import h0.AbstractComponentCallbacksC0734B;
import h0.Z;
import h0.c0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k4.InterfaceC0900a;
import m2.AbstractC1078w;
import m2.P;
import m2.Y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC0900a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w f1440e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1444d;

    public w(int i6) {
        if (i6 != 1) {
            if (i6 == 3) {
                this.f1441a = new u.e(10, 1);
                this.f1442b = new s.k();
                this.f1443c = new ArrayList();
                this.f1444d = new HashSet();
                return;
            }
            if (i6 == 5) {
                this.f1441a = new ArrayList();
                this.f1442b = new HashMap();
                this.f1443c = new HashMap();
                return;
            }
            if (i6 != 9) {
                this.f1441a = null;
                this.f1442b = null;
                this.f1443c = null;
                this.f1444d = new ArrayDeque();
                return;
            }
            C1358b c1358b = new C1358b(20);
            this.f1441a = c1358b;
            P0.h hVar = new P0.h((P0.h) null, c1358b);
            this.f1443c = hVar;
            this.f1442b = hVar.h();
            I0.f fVar = new I0.f(2);
            this.f1444d = fVar;
            ((P0.h) this.f1443c).n("require", new e5(fVar));
            I0.f fVar2 = (I0.f) this.f1444d;
            fVar2.f1097a.put("internal.platform", new CallableC0478q0());
            ((P0.h) this.f1443c).n("runtime.counter", new C0417g(Double.valueOf(0.0d)));
        }
    }

    public static synchronized w k() {
        try {
            if (f1440e == null) {
                f1440e = new w(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1440e;
    }

    public final void a(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        if (((ArrayList) this.f1441a).contains(abstractComponentCallbacksC0734B)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0734B);
        }
        synchronized (((ArrayList) this.f1441a)) {
            ((ArrayList) this.f1441a).add(abstractComponentCallbacksC0734B);
        }
        abstractComponentCallbacksC0734B.f8596G = true;
    }

    public final AbstractC0377b b() {
        if (((C0343c) this.f1441a).r()) {
            C0594t1 c0594t1 = (C0594t1) this.f1443c;
            C0343c c0343c = (C0343c) this.f1441a;
            C0379d c0379d = new C0379d((C0594t1) this.f1444d, 1);
            AbstractC1305a.o(c0594t1, "logger");
            AbstractC1305a.o(c0343c, "outcomeEventsCache");
            return new C0380e(c0594t1, c0343c, c0379d);
        }
        C0594t1 c0594t12 = (C0594t1) this.f1443c;
        C0343c c0343c2 = (C0343c) this.f1441a;
        C0379d c0379d2 = new C0379d((C0594t1) this.f1444d, 0);
        AbstractC1305a.o(c0594t12, "logger");
        AbstractC1305a.o(c0343c2, "outcomeEventsCache");
        return new C0378c(c0594t12, c0343c2, c0379d2);
    }

    public final void c(String str) {
        ((w0.p) this.f1441a).b();
        B0.g gVarA = ((w0.t) this.f1443c).a();
        if (str == null) {
            gVarA.h(1);
        } else {
            gVarA.k(1, str);
        }
        ((w0.p) this.f1441a).c();
        try {
            gVarA.l();
            ((w0.p) this.f1441a).h();
        } finally {
            ((w0.p) this.f1441a).f();
            ((w0.t) this.f1443c).c(gVarA);
        }
    }

    public final void d() {
        ((w0.p) this.f1441a).b();
        B0.g gVarA = ((w0.t) this.f1444d).a();
        ((w0.p) this.f1441a).c();
        try {
            gVarA.l();
            ((w0.p) this.f1441a).h();
        } finally {
            ((w0.p) this.f1441a).f();
            ((w0.t) this.f1444d).c(gVarA);
        }
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((s.k) this.f1442b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                e(arrayList2.get(i6), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final AbstractComponentCallbacksC0734B f(String str) {
        c0 c0Var = (c0) ((HashMap) this.f1442b).get(str);
        if (c0Var != null) {
            return c0Var.f8787c;
        }
        return null;
    }

    public final AbstractComponentCallbacksC0734B g(String str) {
        for (c0 c0Var : ((HashMap) this.f1442b).values()) {
            if (c0Var != null) {
                AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734BG = c0Var.f8787c;
                if (!str.equals(abstractComponentCallbacksC0734BG.f8590A)) {
                    abstractComponentCallbacksC0734BG = abstractComponentCallbacksC0734BG.f8607R.f8697c.g(str);
                }
                if (abstractComponentCallbacksC0734BG != null) {
                    return abstractComponentCallbacksC0734BG;
                }
            }
        }
        return null;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : ((HashMap) this.f1442b).values()) {
            if (c0Var != null) {
                arrayList.add(c0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : ((HashMap) this.f1442b).values()) {
            arrayList.add(c0Var != null ? c0Var.f8787c : null);
        }
        return arrayList;
    }

    public final List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f1441a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1441a)) {
            arrayList = new ArrayList((ArrayList) this.f1441a);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((r0 instanceof c4.C0380e) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c4.AbstractC0377b l() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1442b
            c4.b r0 = (c4.AbstractC0377b) r0
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.f1441a
            b3.c r0 = (b3.C0343c) r0
            boolean r0 = r0.r()
            if (r0 != 0) goto L1c
            java.lang.Object r0 = r2.f1442b
            c4.b r0 = (c4.AbstractC0377b) r0
            boolean r1 = r0 instanceof c4.C0378c
            if (r1 == 0) goto L1c
        L18:
            s4.AbstractC1305a.l(r0)
            goto L38
        L1c:
            java.lang.Object r0 = r2.f1441a
            b3.c r0 = (b3.C0343c) r0
            boolean r0 = r0.r()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.f1442b
            c4.b r0 = (c4.AbstractC0377b) r0
            boolean r1 = r0 instanceof c4.C0380e
            if (r1 == 0) goto L2f
            goto L18
        L2f:
            c4.b r0 = r2.b()
            goto L38
        L34:
            c4.b r0 = r2.b()
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.w.l():c4.b");
    }

    public final boolean m(Context context) {
        if (((Boolean) this.f1443c) == null) {
            this.f1443c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f1442b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f1443c).booleanValue();
    }

    public final boolean n(Context context) {
        if (((Boolean) this.f1442b) == null) {
            this.f1442b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f1442b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f1442b).booleanValue();
    }

    public final void o(c0 c0Var) {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
        if (((HashMap) this.f1442b).get(abstractComponentCallbacksC0734B.f8590A) != null) {
            return;
        }
        ((HashMap) this.f1442b).put(abstractComponentCallbacksC0734B.f8590A, c0Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0734B);
        }
    }

    public final void p(c0 c0Var) {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = c0Var.f8787c;
        if (abstractComponentCallbacksC0734B.f8614Y) {
            ((Z) this.f1444d).h(abstractComponentCallbacksC0734B);
        }
        if (((HashMap) this.f1442b).get(abstractComponentCallbacksC0734B.f8590A) == c0Var && ((c0) ((HashMap) this.f1442b).put(abstractComponentCallbacksC0734B.f8590A, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0734B);
        }
    }

    public final void q(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        synchronized (((ArrayList) this.f1441a)) {
            ((ArrayList) this.f1441a).remove(abstractComponentCallbacksC0734B);
        }
        abstractComponentCallbacksC0734B.f8596G = false;
    }

    public final Bundle r(String str, Bundle bundle) {
        return (Bundle) (bundle != null ? ((HashMap) this.f1443c).put(str, bundle) : ((HashMap) this.f1443c).remove(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124 A[Catch: NumberFormatException | JSONException -> 0x012c, NumberFormatException | JSONException -> 0x012c, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x012c, blocks: (B:9:0x002b, B:42:0x0097, B:42:0x0097, B:43:0x00a8, B:43:0x00a8, B:45:0x00bb, B:45:0x00bb, B:47:0x00cd, B:47:0x00cd, B:48:0x00d6, B:48:0x00d6, B:49:0x00da, B:49:0x00da, B:51:0x00ed, B:51:0x00ed, B:53:0x00ff, B:53:0x00ff, B:54:0x0108, B:54:0x0108, B:55:0x010c, B:55:0x010c, B:56:0x0118, B:56:0x0118, B:57:0x0124, B:57:0x0124, B:20:0x0058, B:23:0x0062, B:26:0x006c, B:29:0x0076, B:32:0x0080), top: B:75:0x002b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle s() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.w.s():android.os.Bundle");
    }

    public final InterfaceC0459n t(P0.h hVar, O1... o1Arr) {
        InterfaceC0459n interfaceC0459nE = InterfaceC0459n.f6885n;
        for (O1 o12 : o1Arr) {
            interfaceC0459nE = F2.e(o12);
            F2.l((P0.h) this.f1443c);
            if ((interfaceC0459nE instanceof C0477q) || (interfaceC0459nE instanceof C0465o)) {
                interfaceC0459nE = ((C1358b) this.f1441a).k(hVar, interfaceC0459nE);
            }
        }
        return interfaceC0459nE;
    }

    public final void u(Bundle bundle) {
        P p5;
        Class<?> cls;
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        } else if (((Y) this.f1444d).n().D(null, AbstractC1078w.f11200j1)) {
            bundle = new Bundle(bundle);
        }
        SharedPreferences.Editor editorEdit = ((Y) this.f1444d).A().edit();
        if (bundle.size() == 0) {
            editorEdit.remove((String) this.f1441a);
        } else {
            String str2 = (String) this.f1441a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        J4.a();
                        if (!((Y) this.f1444d).n().D(null, AbstractC1078w.f11135H0)) {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                                jSONArray.put(jSONObject);
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                                jSONArray.put(jSONObject);
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                                jSONArray.put(jSONObject);
                            } else {
                                p5 = ((Y) this.f1444d).f().f10715B;
                                cls = obj.getClass();
                                p5.c(cls, "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "s");
                            jSONArray.put(jSONObject);
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "l");
                            jSONArray.put(jSONObject);
                        } else {
                            if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                str = "ia";
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                str = "la";
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "d");
                                jSONArray.put(jSONObject);
                            } else {
                                p5 = ((Y) this.f1444d).f().f10715B;
                                cls = obj.getClass();
                                p5.c(cls, "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONObject.put("t", str);
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e6) {
                        ((Y) this.f1444d).f().f10715B.c(e6, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str2, jSONArray.toString());
        }
        editorEdit.apply();
        this.f1443c = bundle;
    }

    public w(C0594t1 c0594t1, C0594t1 c0594t12, C1 c12, C0594t1 c0594t13) {
        AbstractC1305a.o(c0594t1, "logger");
        AbstractC1305a.o(c0594t12, "apiClient");
        this.f1443c = c0594t1;
        this.f1444d = c0594t12;
        AbstractC1305a.l(c12);
        AbstractC1305a.l(c0594t13);
        C0343c c0343c = new C0343c();
        c0343c.f5930w = c0594t1;
        c0343c.f5931x = c12;
        c0343c.f5932y = c0594t13;
        this.f1441a = c0343c;
    }

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1441a = obj;
        this.f1442b = obj2;
        this.f1443c = obj3;
        this.f1444d = obj4;
    }

    public w(Y y5, String str) {
        this.f1444d = y5;
        AbstractC1332d.g(str);
        this.f1441a = str;
        this.f1442b = y5.n().D(null, AbstractC1078w.f11200j1) ? new Bundle() : new Bundle();
    }
}
