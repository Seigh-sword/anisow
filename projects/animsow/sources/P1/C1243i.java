package p1;

import N.C0;
import N.V;
import W1.InterfaceC0210d;
import X1.InterfaceC0234b;
import a3.C0261b;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import b2.C0337b;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.AbstractC0474p2;
import com.google.android.gms.internal.measurement.AbstractC0527y2;
import com.google.android.gms.internal.measurement.InterfaceC0403d3;
import com.google.android.gms.internal.measurement.InterfaceC0457m3;
import com.google.android.gms.internal.measurement.K2;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.onesignal.C0594t1;
import com.onesignal.E1;
import h5.InterfaceC0790q;
import i3.InterfaceC0833a;
import j1.InterfaceC0845c;
import j3.AbstractC0850C;
import j3.C0863m;
import j3.C0866p;
import j3.C0868r;
import j3.CallableC0861k;
import j3.RunnableC0867q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import k3.ExecutorC0896b;
import m1.C1010h;
import m2.C1017B;
import m2.C1018C;
import m2.C1051k0;
import m2.C1052k1;
import m2.EnumC1041h;
import m2.EnumC1083y0;
import m2.G0;
import m2.InterfaceC1027c0;
import m2.J1;
import m2.N;
import m2.T;
import m2.Y;
import m2.x1;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C1251c;
import q1.C1257a;
import r3.C1275a;
import t0.AbstractC1332d;
import v0.C1389b0;
import z2.InterfaceC1530a;

/* JADX INFO: renamed from: p1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1243i implements y, InterfaceC0845c, J, InterfaceC0234b, J1, T, H2.o, InterfaceC1530a, h3.b, InterfaceC0833a, q2.h, b4.b, InterfaceC0790q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f12254x;

    public C1243i(int i6) {
        this.f12253w = i6;
        if (i6 == 3) {
            this.f12254x = new S0.f((Object) null);
            return;
        }
        if (i6 != 4) {
            if (i6 == 8) {
                this.f12254x = new EnumMap(EnumC1083y0.class);
            } else if (i6 != 20) {
                this.f12254x = new S0.f(25, this);
            }
        }
    }

    public static String r(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public final void A(EnumC1083y0 enumC1083y0, EnumC1041h enumC1041h) {
        ((EnumMap) this.f12254x).put(enumC1083y0, enumC1041h);
    }

    public final void B(boolean z5, long j6) {
        ((C1052k1) this.f12254x).r();
        ((C1052k1) this.f12254x).B();
        if (((C1052k1) this.f12254x).p().w(j6)) {
            ((C1052k1) this.f12254x).p().f10809I.a(true);
            ((C1052k1) this.f12254x).s().D();
        }
        ((C1052k1) this.f12254x).p().f10813M.b(j6);
        if (((C1052k1) this.f12254x).p().f10809I.b()) {
            H(j6);
        }
    }

    public final int C() {
        switch (this.f12253w) {
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 1;
            default:
                return ((AbstractC0527y2) this.f12254x).j();
        }
    }

    public final void D() {
        ((C1052k1) this.f12254x).r();
        Y yP = ((C1052k1) this.f12254x).p();
        ((C0337b) ((C1052k1) this.f12254x).h()).getClass();
        if (yP.w(System.currentTimeMillis())) {
            ((C1052k1) this.f12254x).p().f10809I.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ((C1052k1) this.f12254x).f().f10723J.d("Detected application was in foreground");
                ((C0337b) ((C1052k1) this.f12254x).h()).getClass();
                H(System.currentTimeMillis());
            }
        }
    }

    public final void E(int i6, int i7) {
        ((A2) this.f12254x).e(i6, i7);
    }

    public final void F(int i6, long j6) {
        ((A2) this.f12254x).r(i6, j6);
    }

    public final void G(int i6, InterfaceC0457m3 interfaceC0457m3, Object obj) {
        A2 a22 = (A2) this.f12254x;
        InterfaceC0403d3 interfaceC0403d3 = (InterfaceC0403d3) obj;
        a22.w(i6, 2);
        a22.v(((AbstractC0474p2) interfaceC0403d3).a(interfaceC0457m3));
        interfaceC0457m3.f(interfaceC0403d3, a22.f6443d);
    }

    public final void H(long j6) {
        ((C1052k1) this.f12254x).r();
        if (((C1051k0) ((C1052k1) this.f12254x).f1668w).j()) {
            ((C1052k1) this.f12254x).p().f10813M.b(j6);
            ((C0337b) ((C1052k1) this.f12254x).h()).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            N nF = ((C1052k1) this.f12254x).f();
            nF.f10723J.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j7 = j6 / 1000;
            ((C1052k1) this.f12254x).u().H("auto", "_sid", Long.valueOf(j7), j6);
            ((C1052k1) this.f12254x).p().f10814N.b(j7);
            ((C1052k1) this.f12254x).p().f10809I.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j7);
            ((C1052k1) this.f12254x).u().B(j6, bundle, "auto", "_s");
            String strD = ((C1052k1) this.f12254x).p().f10819S.d();
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strD);
            ((C1052k1) this.f12254x).u().B(j6, bundle2, "auto", "_ssr");
        }
    }

    public final void I(int i6, int i7) {
        ((A2) this.f12254x).q(i6, i7);
    }

    public final void J(int i6, long j6) {
        ((A2) this.f12254x).f(i6, j6);
    }

    public final void K(int i6, int i7) {
        ((A2) this.f12254x).e(i6, i7);
    }

    public final void L(int i6, long j6) {
        ((A2) this.f12254x).r(i6, (j6 >> 63) ^ (j6 << 1));
    }

    public final void M(int i6, int i7) {
        ((A2) this.f12254x).z(i6, (i7 >> 31) ^ (i7 << 1));
    }

    public final void N(int i6, long j6) {
        ((A2) this.f12254x).r(i6, j6);
    }

    public final void O(int i6, int i7) {
        ((A2) this.f12254x).z(i6, i7);
    }

    @Override // m2.J1
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ((C1051k0) ((G0) this.f12254x).f1668w).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        G0 g02 = (G0) this.f12254x;
        ((C0337b) g02.h()).getClass();
        g02.G("auto", str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // X1.InterfaceC0234b
    public final void b(int i6) {
        ((InterfaceC0210d) this.f12254x).b(i6);
    }

    @Override // i3.InterfaceC0833a
    public final void c(C0866p c0866p) {
        this.f12254x = c0866p;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p1.y
    public final x d(C1234C c1234c) {
        switch (this.f12253w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C1239e(1, (S0.f) this.f12254x);
            case 1:
            default:
                return new C1257a((S0.f) this.f12254x);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new K(this);
        }
    }

    @Override // H2.o
    public final C0 f(View view, C0 c02, C1389b0 c1389b0) {
        c1389b0.f13087d = c02.a() + c1389b0.f13087d;
        WeakHashMap weakHashMap = V.f1964a;
        boolean z5 = view.getLayoutDirection() == 1;
        int iB = c02.b();
        int iC = c02.c();
        int i6 = c1389b0.f13084a + (z5 ? iC : iB);
        c1389b0.f13084a = i6;
        int i7 = c1389b0.f13086c;
        if (!z5) {
            iB = iC;
        }
        int i8 = i7 + iB;
        c1389b0.f13086c = i8;
        view.setPaddingRelative(i6, c1389b0.f13085b, i8, c1389b0.f13087d);
        return c02;
    }

    @Override // m2.T
    public final void g(String str, int i6, Throwable th, byte[] bArr, Map map) {
        ((x1) this.f12254x).I(str, i6, th, bArr, map);
    }

    @Override // p1.J
    public final com.bumptech.glide.load.data.e h(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f12254x, uri, 1);
    }

    @Override // X1.InterfaceC0234b
    public final void i() {
        ((InterfaceC0210d) this.f12254x).D(null);
    }

    @Override // b4.b
    public final String j() {
        Object obj = this.f12254x;
        C0594t1 c0594t1 = (C0594t1) obj;
        ((C0594t1) obj).getClass();
        String str = E1.f7517a;
        c0594t1.getClass();
        return E1.e(str, "PREFS_OS_LANGUAGE", "en");
    }

    @Override // h5.InterfaceC0790q
    public final Object k(Object obj) {
        return Optional.ofNullable(((InterfaceC0790q) this.f12254x).k((V4.J) obj));
    }

    @Override // q2.h
    public final q2.s l(Object obj) {
        if (((C1275a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
        } else {
            C0863m.a((C0863m) ((C0261b) this.f12254x).f5012y);
            C0863m c0863m = (C0863m) ((C0261b) this.f12254x).f5012y;
            c0863m.f9498m.t(null, c0863m.f9490e.f9655a);
            ((C0863m) ((C0261b) this.f12254x).f5012y).f9502q.c(null);
        }
        return f2.h.l(null);
    }

    @Override // j1.InterfaceC0845c
    public final boolean m(Object obj, File file, j1.m mVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((C1010h) this.f12254x).c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i6 = inputStream.read(bArr);
                        if (i6 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i6);
                    } catch (IOException e6) {
                        e = e6;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        ((C1010h) this.f12254x).g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ((C1010h) this.f12254x).g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                ((C1010h) this.f12254x).g(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
        }
    }

    @Override // h3.b
    public final void n(String str, Bundle bundle) {
        C0866p c0866p = (C0866p) this.f12254x;
        if (c0866p != null) {
            try {
                String str2 = "$A$:" + r(str, bundle);
                C0868r c0868r = c0866p.f9508a;
                c0868r.getClass();
                c0868r.f9527o.f9655a.a(new RunnableC0867q(c0868r, System.currentTimeMillis() - c0868r.f9516d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public final void o(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((R2.j) this.f12254x).a(0);
    }

    public final void p(J0.l lVar, Thread thread, Throwable th) {
        q2.s sVarJ;
        C0863m c0863m = (C0863m) this.f12254x;
        synchronized (c0863m) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ExecutorC0896b executorC0896b = c0863m.f9490e.f9655a;
                CallableC0861k callableC0861k = new CallableC0861k(c0863m, jCurrentTimeMillis, th, thread, lVar);
                synchronized (executorC0896b.f9648x) {
                    sVarJ = executorC0896b.f9649y.j(executorC0896b.f9647w, new J3.G(22, callableC0861k));
                    executorC0896b.f9649y = sVarJ;
                }
                try {
                    try {
                        AbstractC0850C.a(sVarJ);
                    } catch (TimeoutException unused) {
                        Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                    }
                } catch (Exception e6) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C1275a q(JSONObject jSONObject) throws JSONException {
        r3.c c1018c;
        int i6 = jSONObject.getInt("settings_version");
        int i7 = 5;
        if (i6 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i6 + ". Using default settings values.", null);
            c1018c = new C1017B(i7, (Object) null);
        } else {
            c1018c = new C1018C(i7);
        }
        return c1018c.c((C1018C) this.f12254x, jSONObject);
    }

    public final void s(int i6, double d6) {
        A2 a22 = (A2) this.f12254x;
        a22.getClass();
        a22.f(i6, Double.doubleToRawLongBits(d6));
    }

    public final void t(int i6, float f6) {
        A2 a22 = (A2) this.f12254x;
        a22.getClass();
        a22.e(i6, Float.floatToRawIntBits(f6));
    }

    public final String toString() {
        switch (this.f12253w) {
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                StringBuilder sb = new StringBuilder("1");
                for (EnumC1083y0 enumC1083y0 : EnumC1083y0.values()) {
                    EnumC1041h enumC1041h = (EnumC1041h) ((EnumMap) this.f12254x).get(enumC1083y0);
                    if (enumC1041h == null) {
                        enumC1041h = EnumC1041h.UNSET;
                    }
                    sb.append(enumC1041h.f10927w);
                }
                return sb.toString();
            case 26:
                return ((Field) this.f12254x).toString();
            default:
                return super.toString();
        }
    }

    public final void u(int i6, int i7) {
        ((A2) this.f12254x).q(i6, i7);
    }

    public final void v(int i6, long j6) {
        ((A2) this.f12254x).f(i6, j6);
    }

    public final void w(int i6, AbstractC0527y2 abstractC0527y2) {
        A2 a22 = (A2) this.f12254x;
        a22.w(i6, 2);
        a22.h(abstractC0527y2);
    }

    public final void x(int i6, InterfaceC0457m3 interfaceC0457m3, Object obj) {
        A2 a22 = (A2) this.f12254x;
        a22.w(i6, 3);
        interfaceC0457m3.f((InterfaceC0403d3) obj, a22.f6443d);
        a22.w(i6, 4);
    }

    public final void y(int i6, boolean z5) {
        A2 a22 = (A2) this.f12254x;
        a22.w(i6, 0);
        a22.c(z5 ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(m2.EnumC1083y0 r3, int r4) {
        /*
            r2 = this;
            m2.h r0 = m2.EnumC1041h.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            m2.h r0 = m2.EnumC1041h.INITIALIZATION
            goto L20
        L18:
            m2.h r0 = m2.EnumC1041h.MANIFEST
            goto L20
        L1b:
            m2.h r0 = m2.EnumC1041h.API
            goto L20
        L1e:
            m2.h r0 = m2.EnumC1041h.TCF
        L20:
            java.lang.Object r4 = r2.f12254x
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1243i.z(m2.y0, int):void");
    }

    public /* synthetic */ C1243i(int i6, Object obj) {
        this.f12253w = i6;
        this.f12254x = obj;
    }

    public C1243i(Context context) {
        boolean zIsEmpty;
        this.f12253w = 25;
        this.f12254x = context.getSharedPreferences("com.google.android.gms.appid", 0);
        Object obj = E.f.f379a;
        File file = new File(E.a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = ((SharedPreferences) this.f12254x).getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    ((SharedPreferences) this.f12254x).edit().clear().commit();
                }
            }
        } catch (IOException e6) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e6.getMessage());
            }
        }
    }

    public C1243i(A2 a22) {
        this.f12253w = 6;
        Charset charset = K2.f6615a;
        if (a22 == null) {
            throw new NullPointerException("output");
        }
        this.f12254x = a22;
        a22.f6443d = this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1243i(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(14, materialButtonToggleGroup);
        this.f12253w = 14;
    }

    public C1243i(EnumMap enumMap) {
        this.f12253w = 8;
        EnumMap enumMap2 = new EnumMap(EnumC1083y0.class);
        this.f12254x = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public C1243i(InterfaceC1027c0 interfaceC1027c0) {
        this.f12253w = 9;
        AbstractC1332d.m(interfaceC1027c0);
        this.f12254x = interfaceC1027c0;
    }

    public C1243i(C1251c c1251c) {
        this.f12253w = 19;
        this.f12254x = c1251c;
    }
}
