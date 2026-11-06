package com.onesignal;

import D.AbstractC0000a;
import D.AbstractC0001b;
import D.AbstractC0002c;
import D.AbstractC0005f;
import D.C0013n;
import a3.C0261b;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import d.AbstractC0628i;
import h0.C0733A;
import java.io.IOException;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: com.onesignal.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0571l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f7876a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Resources f7877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f7878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f7879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Integer f7880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f7881f;

    public static Cursor A(Context context, C1 c12, String str, boolean z5) throws IllegalAccessException, NoSuchFieldException, InstantiationException, IOException, ClassNotFoundException {
        Cursor cursorU = c12.u("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, "_id DESC");
        int count = cursorU.getCount();
        Cursor cursorU2 = null;
        if (count == 0 && !str.equals("os_group_undefined")) {
            cursorU.close();
            Integer numX = x(c12, str);
            if (numX == null) {
                return cursorU;
            }
            t(context).cancel(numX.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z5 ? "dismissed" : "opened", (Integer) 1);
            c12.M("notification", contentValues, "android_notification_id = " + numX, null);
            return cursorU;
        }
        if (count == 1) {
            cursorU.close();
            if (x(c12, str) == null) {
                return cursorU;
            }
            try {
                cursorU2 = C1.c(context).u("notification", N0.f7645a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null);
                N0.b(context, cursorU2, 0);
            } catch (Throwable th) {
                try {
                    AbstractC0603w1.b(EnumC0600v1.f7997y, "Error restoring notification records! ", th);
                    if (cursorU2 != null && !cursorU2.isClosed()) {
                    }
                } catch (Throwable th2) {
                    if (cursorU2 != null && !cursorU2.isClosed()) {
                        cursorU2.close();
                    }
                    throw th2;
                }
            }
            if (!cursorU2.isClosed()) {
                cursorU2.close();
            }
            return cursorU;
        }
        try {
            cursorU.moveToFirst();
            Long lValueOf = Long.valueOf(cursorU.getLong(cursorU.getColumnIndex("created_time")));
            String string = cursorU.getString(cursorU.getColumnIndex("full_data"));
            cursorU.close();
            if (x(c12, str) == null) {
                return cursorU;
            }
            I0 i02 = new I0(context);
            i02.f7585d = true;
            i02.f7587f = lValueOf;
            i02.f7584c = new JSONObject(string);
            Context context2 = i02.f7583b;
            f7878c = context2;
            f7879d = context2.getPackageName();
            f7877b = f7878c.getResources();
            i(i02, null);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return cursorU;
    }

    public static boolean B(Bundle bundle) throws JSONException {
        String strV = null;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", null);
            if (string != null) {
                strV = v(string);
            } else {
                AbstractC0603w1.b(EnumC0600v1.f7992B, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.", null);
            }
        }
        return strV != null;
    }

    public static void C(String str, String str2, C0597u1 c0597u1) {
        F1 f12 = new F1(str, str2, c0597u1);
        String strJ = AbstractC0628i.j("apps/", str, "/android_params.js");
        if (str2 != null) {
            strJ = strJ + "?player_id=" + str2;
        }
        AbstractC0603w1.b(EnumC0600v1.f7992B, "Starting request to get Android parameters.", null);
        new Thread(new RunnableC0576n0(strJ, f12, "CACHE_KEY_REMOTE_PARAMS"), "OS_REST_ASYNC_GET").start();
    }

    public static void D(String str, String str2, JSONObject jSONObject, AbstractC0571l1 abstractC0571l1, int i6, String str3) {
        if (OSUtils.p()) {
            throw new C0733A(AbstractC0628i.j("Method: ", str2, " was called from the Main Thread!"));
        }
        if (str2 == null || !AbstractC0603w1.S(null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new J1(threadArr, str, str2, jSONObject, abstractC0571l1, i6, str3), "OS_HTTPConnection");
            thread.start();
            try {
                thread.join(i6 + 5000);
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                Thread thread2 = threadArr[0];
                if (thread2 != null) {
                    thread2.join();
                }
            } catch (InterruptedException e6) {
                e6.printStackTrace();
            }
        }
    }

    public static void E(I0 i02) throws PackageManager.NameNotFoundException {
        if (i02.f7586e) {
            AbstractC0603w1.b(EnumC0600v1.f7992B, "Marking restored or disabled notifications as dismissed: " + i02.toString(), null);
            String str = "android_notification_id = " + i02.a();
            C1 c1C = C1.c(i02.f7583b);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", (Integer) 1);
            c1C.M("notification", contentValues, str, null);
            Y(i02.f7583b);
        }
    }

    public static Object F(Object obj) {
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.class) ? Long.valueOf(((Integer) obj).intValue()) : cls.equals(Float.class) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    public static final boolean G(Activity activity, JSONObject jSONObject) throws JSONException {
        AbstractC1305a.o(activity, "activity");
        String strZ = z(jSONObject);
        if (strZ == null) {
            return false;
        }
        AbstractC0603w1.I(activity, new JSONArray().put(jSONObject));
        AbstractC0603w1.q().e0(strZ);
        return true;
    }

    public static void J(String str, JSONObject jSONObject, AbstractC0571l1 abstractC0571l1) {
        new Thread(new I1(str, jSONObject, abstractC0571l1, 1), "OS_REST_ASYNC_POST").start();
    }

    public static void K(Context context, Bundle bundle, S s5) throws JSONException, IllegalAccessException, NoSuchFieldException, InstantiationException, IOException, ClassNotFoundException {
        String str;
        String str2;
        T t5 = new T();
        if (!B(bundle)) {
            s5.b(t5);
            return;
        }
        t5.f7703a = true;
        String str3 = "n";
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
                JSONObject jSONObject2 = jSONObject.has("a") ? jSONObject.getJSONObject("a") : new JSONObject();
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                int i6 = 0;
                while (i6 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                    String string = jSONObject3.getString(str3);
                    jSONObject3.remove(str3);
                    if (jSONObject3.has("i")) {
                        String string2 = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                        str = str3;
                        str2 = string2;
                    } else {
                        str = str3;
                        str2 = string;
                    }
                    jSONObject3.put("id", str2);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                    i6++;
                    str3 = str;
                }
                jSONObject2.put("actionButtons", jSONArray);
                jSONObject2.put("actionId", "__DEFAULT__");
                if (!jSONObject.has("a")) {
                    jSONObject.put("a", jSONObject2);
                }
                bundle.putString("custom", jSONObject.toString());
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
        JSONObject jSONObjectF = f(bundle);
        String strZ = z(jSONObjectF);
        if (strZ == null) {
            X1 x12 = new X1(t5, s5, 3);
            JSONObject jSONObjectF2 = f(bundle);
            AbstractC0603w1.f8056v.getClass();
            AbstractC0603w1.G(context, jSONObjectF2, new Q(bundle.getBoolean("is_restoring", false), context, bundle, x12, jSONObjectF2, System.currentTimeMillis() / 1000, Integer.parseInt(bundle.getString("pri", "0")) > 9, t5));
            return;
        }
        if (AbstractC0603w1.f8048n && AbstractC0603w1.f8049o) {
            AbstractC0603w1.q().e0(strZ);
        } else {
            B0 b02 = new B0(jSONObjectF);
            I0 i02 = new I0();
            i02.f7583b = context;
            i02.f7584c = jSONObjectF;
            i02.b(b02);
            Context context2 = i02.f7583b;
            f7878c = context2;
            f7879d = context2.getPackageName();
            f7877b = f7878c.getResources();
            V(i02);
        }
        t5.f7705c = true;
        s5.b(t5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void L(android.content.Context r26, android.content.Intent r27) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.InstantiationException, java.io.IOException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC0571l1.L(android.content.Context, android.content.Intent):void");
    }

    public static int M(D0 d02, boolean z5) throws Throwable {
        boolean zV;
        AbstractC0603w1.b(EnumC0600v1.f7992B, "Starting processJobForDisplay opened: false fromBackgroundLogic: " + z5, null);
        I0 i02 = d02.f7506a;
        if (!i02.f7585d && i02.f7584c.has("collapse_key") && !"do_not_collapse".equals(i02.f7584c.optString("collapse_key"))) {
            Cursor cursorU = C1.c(i02.f7583b).u("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{i02.f7584c.optString("collapse_key")}, null);
            if (cursorU.moveToFirst()) {
                i02.f7582a.f7472c = cursorU.getInt(cursorU.getColumnIndex("android_notification_id"));
            }
            cursorU.close();
        }
        int iIntValue = i02.a().intValue();
        i02.f7582a.getClass();
        if (!TextUtils.isEmpty(i02.f7584c.optString("alert"))) {
            i02.f7586e = true;
            if (z5) {
                AbstractC0603w1.b(EnumC0600v1.f7991A, !AbstractC0603w1.f8049o ? "App is in background, show notification" : "No NotificationWillShowInForegroundHandler setup, show notification", null);
            }
            Context context = i02.f7583b;
            f7878c = context;
            f7879d = context.getPackageName();
            f7877b = f7878c.getResources();
            if (OSUtils.p()) {
                throw new C0733A("Process for showing a notification should never been done on Main Thread!");
            }
            f7880e = 2;
            zV = V(i02);
        } else {
            zV = false;
        }
        if (!i02.f7585d) {
            N(i02, false, zV);
            String strU = u(i02.f7584c);
            Set set = O0.f7652a;
            if (!TextUtils.isEmpty(strU)) {
                O0.f7652a.remove(strU);
            }
            AbstractC0603w1.z(i02);
        }
        return iIntValue;
    }

    public static void N(I0 i02, boolean z5, boolean z6) throws Throwable {
        JSONObject jSONObject;
        String strOptString;
        U0 u02;
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        AbstractC0603w1.b(enumC0600v1, "Saving Notification job: " + i02.toString(), null);
        Context context = i02.f7583b;
        JSONObject jSONObject2 = i02.f7584c;
        try {
            JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("custom"));
            C1 c1C = C1.c(i02.f7583b);
            if (i02.f7586e) {
                String str = "android_notification_id = " + i02.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", (Integer) 1);
                c1C.M("notification", contentValues, str, null);
                Y(context);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", jSONObject3.optString("i"));
            if (jSONObject2.has("grp")) {
                contentValues2.put("group_id", jSONObject2.optString("grp"));
            }
            if (jSONObject2.has("collapse_key") && !"do_not_collapse".equals(jSONObject2.optString("collapse_key"))) {
                contentValues2.put("collapse_id", jSONObject2.optString("collapse_key"));
            }
            contentValues2.put("opened", Integer.valueOf(z5 ? 1 : 0));
            if (!z5) {
                contentValues2.put("android_notification_id", i02.a());
            }
            String str2 = i02.f7582a.f7476g;
            if (str2 != null) {
                contentValues2.put("title", str2.toString());
            }
            String str3 = i02.f7582a.f7477h;
            if (str3 != null) {
                contentValues2.put("message", str3.toString());
            }
            AbstractC0603w1.f8056v.getClass();
            contentValues2.put("expire_time", Long.valueOf((jSONObject2.optLong("google.sent_time", System.currentTimeMillis()) / 1000) + ((long) jSONObject2.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", jSONObject2.toString());
            c1C.l(contentValues2);
            AbstractC0603w1.b(enumC0600v1, "Notification saved values: " + contentValues2.toString(), null);
            if (!z5) {
                Y(context);
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        if (!z6) {
            E(i02);
            return;
        }
        JSONObject jSONObject4 = i02.f7584c;
        C0594t1 c0594t1 = AbstractC0603w1.f8053s;
        if (jSONObject4 == null) {
            strOptString = null;
        } else {
            try {
                jSONObject = new JSONObject(jSONObject4.getString("custom"));
            } catch (JSONException unused) {
                c0594t1.getClass();
                C0594t1.d("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
            }
            if (jSONObject.has("i")) {
                strOptString = jSONObject.optString("i", null);
            } else {
                c0594t1.getClass();
                C0594t1.d("Not a OneSignal formatted FCM message. No 'i' field in custom.");
                strOptString = null;
            }
        }
        Context context2 = i02.f7583b;
        synchronized (U0.class) {
            try {
                if (U0.f7711b == null) {
                    U0.f7711b = new U0();
                }
                u02 = U0.f7711b;
            } catch (Throwable th) {
                throw th;
            }
        }
        u02.f7712a.getClass();
        boolean zB = E1.b(E1.f7517a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
        EnumC0600v1 enumC0600v12 = EnumC0600v1.f7992B;
        if (zB) {
            int iNextInt = new Random().nextInt(26);
            HashMap map = new HashMap();
            map.put("os_notification_id", strOptString);
            I0.g gVar = new I0.g(map);
            I0.g.b(gVar);
            I0.e eVar = new I0.e();
            I0.c cVar = new I0.c();
            cVar.f1086a = 1;
            cVar.f1091f = -1L;
            cVar.f1092g = -1L;
            new HashSet();
            cVar.f1087b = false;
            cVar.f1088c = false;
            cVar.f1086a = 2;
            cVar.f1089d = false;
            cVar.f1090e = false;
            cVar.f1093h = eVar;
            cVar.f1091f = -1L;
            cVar.f1092g = -1L;
            I0.p pVar = new I0.p(OSReceiveReceiptController$ReceiveReceiptWorker.class);
            pVar.f1113b.f2909j = cVar;
            I0.p pVarB = pVar.b(iNextInt, TimeUnit.SECONDS);
            pVarB.f1113b.f2904e = gVar;
            I0.q qVarA = pVarB.a();
            AbstractC0603w1.b(enumC0600v12, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + strOptString + " and delay: " + iNextInt + " seconds", null);
            q(context2).I(AbstractC0628i.i(strOptString, "_receive_receipt"), Collections.singletonList(qVarA));
        } else {
            AbstractC0603w1.b(enumC0600v12, "sendReceiveReceipt disabled", null);
        }
        C0584q c0584q = AbstractC0603w1.f8002C;
        ((C0594t1) c0584q.f7950y).getClass();
        C0594t1.d("OneSignal SessionManager onNotificationReceived notificationId: " + strOptString);
        if (strOptString == null || strOptString.isEmpty()) {
            return;
        }
        ((C0261b) c0584q.f7948w).i().i(strOptString);
    }

    public static Bitmap O(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f7877b.getDimension(R.dimen.notification_large_icon_height);
            int dimension2 = (int) f7877b.getDimension(R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public static void P(P0 p02) {
        OSUtils.u(p02);
    }

    public static void Q(AbstractRunnableC0563j abstractRunnableC0563j, String str) {
        if (OSUtils.p()) {
            new Thread(abstractRunnableC0563j, str).start();
        } else {
            abstractRunnableC0563j.run();
        }
    }

    public static void R(Z z5, String str, long j6) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "scheduleTrigger: " + str + " delay: " + j6, null);
        new Timer(AbstractC0628i.q("trigger_timer:", str)).schedule(z5, j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void S(android.widget.RemoteViews r1, org.json.JSONObject r2, int r3, java.lang.String r4, java.lang.String r5) {
        /*
            if (r2 == 0) goto L1c
            boolean r0 = r2.has(r4)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r2.optString(r4)     // Catch: java.lang.Throwable -> L1c
            r4 = 16
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L1c
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L27
            int r2 = r2.intValue()
        L23:
            r1.setTextColor(r3, r2)
            goto L3a
        L27:
            android.content.res.Resources r2 = com.onesignal.AbstractC0571l1.f7877b
            java.lang.String r4 = "color"
            java.lang.String r0 = com.onesignal.AbstractC0571l1.f7879d
            int r2 = r2.getIdentifier(r5, r4, r0)
            if (r2 == 0) goto L3a
            android.content.Context r4 = com.onesignal.AbstractC0571l1.f7878c
            int r2 = r4.getColor(r2)
            goto L23
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC0571l1.S(android.widget.RemoteViews, org.json.JSONObject, int, java.lang.String, java.lang.String):void");
    }

    public static boolean T(Activity activity, String str) {
        int i6 = AbstractC0005f.f190b;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i7 >= 32 ? AbstractC0002c.a(activity, str) : i7 == 31 ? AbstractC0001b.b(activity, str) : AbstractC0000a.c(activity, str);
        }
        return false;
    }

    public static void U(Activity activity, String str, String str2, N n5) {
        String string = activity.getString(com.xo.anilab.R.string.permission_not_available_title);
        AbstractC1305a.n(string, "activity.getString(R.str…sion_not_available_title)");
        String str3 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        String string2 = activity.getString(com.xo.anilab.R.string.permission_not_available_message);
        AbstractC1305a.n(string2, "activity.getString(R.str…on_not_available_message)");
        new AlertDialog.Builder(activity).setTitle(str3).setMessage(String.format(string2, Arrays.copyOf(new Object[]{str2}, 1))).setPositiveButton(com.xo.anilab.R.string.permission_not_available_open_settings_option, new DialogInterfaceOnClickListenerC0560i(0, n5)).setNegativeButton(R.string.no, new DialogInterfaceOnClickListenerC0560i(1, n5)).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean V(com.onesignal.I0 r26) throws java.lang.IllegalAccessException, org.json.JSONException, java.lang.NoSuchFieldException, java.lang.InstantiationException, java.io.IOException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC0571l1.V(com.onesignal.I0):boolean");
    }

    public static void W() {
        if (OSUtils.b() == 1) {
            try {
                PackageManager packageManager = AbstractC0603w1.f8028b.getPackageManager();
                if (!((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market")) {
                    AbstractC0603w1.f8057w.getClass();
                    String str = E1.f7517a;
                    int i6 = 0;
                    if (E1.b(str, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false) || E1.b(str, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
                        return;
                    }
                    OSUtils.u(new RunnableC0604x(i6));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    public static String X(JSONArray jSONArray) {
        String str = "[";
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                str = str + "\"" + jSONArray.getString(i6) + "\"";
            } catch (JSONException unused) {
            }
        }
        return AbstractC0628i.i(str, "]");
    }

    public static void Y(Context context) throws PackageManager.NameNotFoundException {
        if (e(context) && OSUtils.a()) {
            int i6 = 0;
            for (StatusBarNotification statusBarNotification : l(context)) {
                String str = V.f7714a;
                if ((statusBarNotification.getNotification().flags & 512) == 0) {
                    i6++;
                }
            }
            if (e(context)) {
                try {
                    e4.c.a(context, i6);
                } catch (e4.b unused) {
                }
            }
        }
    }

    public static void b(JSONObject jSONObject, D.t tVar) throws IllegalAccessException, JSONException, NoSuchFieldException, IOException {
        Bitmap bitmapO;
        JSONObject jSONObject2;
        String string;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            AbstractC0603w1.b(EnumC0600v1.f7993C, "Cannot use background images in notifications for device on version: " + i6, null);
            return;
        }
        String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            jSONObject2 = new JSONObject(strOptString);
            bitmapO = n(jSONObject2.optString("img", null));
        } else {
            bitmapO = null;
            jSONObject2 = null;
        }
        if (bitmapO == null) {
            bitmapO = o("onesignal_bgimage_default_image");
        }
        if (bitmapO != null) {
            RemoteViews remoteViews = new RemoteViews(f7878c.getPackageName(), com.xo.anilab.R.layout.onesignal_bgimage_notif_layout);
            CharSequence charSequenceOptString = jSONObject.optString("title", null);
            if (charSequenceOptString == null) {
                charSequenceOptString = f7878c.getPackageManager().getApplicationLabel(f7878c.getApplicationInfo());
            }
            remoteViews.setTextViewText(com.xo.anilab.R.id.os_bgimage_notif_title, charSequenceOptString);
            remoteViews.setTextViewText(com.xo.anilab.R.id.os_bgimage_notif_body, jSONObject.optString("alert"));
            S(remoteViews, jSONObject2, com.xo.anilab.R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            S(remoteViews, jSONObject2, com.xo.anilab.R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f7877b.getIdentifier("onesignal_bgimage_notif_image_align", "string", f7879d);
                string = identifier != 0 ? f7877b.getString(identifier) : null;
            } else {
                string = jSONObject2.getString("img_align");
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(com.xo.anilab.R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(com.xo.anilab.R.id.os_bgimage_notif_bgimage_right_aligned, bitmapO);
                remoteViews.setViewVisibility(com.xo.anilab.R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(com.xo.anilab.R.id.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(com.xo.anilab.R.id.os_bgimage_notif_bgimage, bitmapO);
            }
            tVar.f240v.contentView = remoteViews;
            tVar.g(null);
        }
    }

    public static void c(int i6, D.t tVar, C0584q c0584q, String str, JSONObject jSONObject) throws JSONException, IllegalAccessException, NoSuchFieldException {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i7);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent intentH = c0584q.h(i6);
                        intentH.setAction("" + i7);
                        intentH.putExtra("action_button", true);
                        jSONObject4.put("actionId", jSONObjectOptJSONObject.optString("id"));
                        intentH.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            intentH.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            intentH.putExtra("grp", jSONObject.optString("grp"));
                        }
                        tVar.f220b.add(new C0013n(jSONObjectOptJSONObject.has("icon") ? w(jSONObjectOptJSONObject.optString("icon")) : 0, jSONObjectOptJSONObject.optString("text"), c0584q.g(intentH, i6)));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(C0598v c0598v, Notification notification) throws IllegalAccessException, NoSuchFieldException, InstantiationException, ClassNotFoundException {
        if (c0598v.f7984w) {
            try {
                Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean e(Context context) throws PackageManager.NameNotFoundException {
        int i6 = f7876a;
        if (i6 != -1) {
            return i6 == 1;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                f7876a = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                f7876a = 1;
            }
        } catch (PackageManager.NameNotFoundException e6) {
            f7876a = 0;
            AbstractC0603w1.b(EnumC0600v1.f7997y, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e6);
        }
        return f7876a == 1;
    }

    public static JSONObject f(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e6) {
                AbstractC0603w1.b(EnumC0600v1.f7997y, "bundleAsJSONObject error for key: " + str, e6);
            }
        }
        return jSONObject;
    }

    public static int g(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    public static void h(C1 c12, String str, int i6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i6));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", (Integer) 1);
        c12.l(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0112 A[EDGE_INSN: B:113:0x0112->B:33:0x0112 BREAK  A[LOOP:0: B:15:0x008a->B:40:0x0123], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[LOOP:0: B:15:0x008a->B:40:0x0123, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(com.onesignal.I0 r24, com.onesignal.C0598v r25) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.InstantiationException, java.io.IOException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC0571l1.i(com.onesignal.I0, com.onesignal.v):void");
    }

    public static JSONObject j(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, HashSet hashSet) {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        JSONObject jSONObject5 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String string = j(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), hashSet).toString();
                        if (!string.equals("{}")) {
                            jSONObject4 = new JSONObject(string);
                            jSONObject5.put(next, jSONObject4);
                        }
                    } else if (obj instanceof JSONArray) {
                        y(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject5);
                    } else {
                        if (hashSet == null || !hashSet.contains(next)) {
                            Object obj2 = jSONObject.get(next);
                            if (obj.equals(obj2) || ((obj2 instanceof Number) && (obj instanceof Number) && ((Number) obj2).doubleValue() == ((Number) obj).doubleValue())) {
                            }
                        }
                        jSONObject5.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4 = new JSONObject(obj.toString());
                    jSONObject5.put(next, jSONObject4);
                } else if (obj instanceof JSONArray) {
                    y(next, (JSONArray) obj, null, jSONObject5);
                } else {
                    jSONObject5.put(next, obj);
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
        return jSONObject5;
    }

    public static BigInteger k(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String strE = OSUtils.e(AbstractC0603w1.f8028b, "onesignal_notification_accent_color", null);
            if (strE != null) {
                return new BigInteger(strE, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            Bundle bundleC = OSUtils.c(AbstractC0603w1.f8028b);
            String string = bundleC != null ? bundleC.getString("com.onesignal.NotificationAccentColor.DEFAULT") : null;
            if (string != null) {
                return new BigInteger(string, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static StatusBarNotification[] l(Context context) {
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            return t(context).getActiveNotifications();
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.onesignal.C0598v m(com.onesignal.I0 r14) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC0571l1.m(com.onesignal.I0):com.onesignal.v");
    }

    public static Bitmap n(String str) throws IllegalAccessException, NoSuchFieldException, IOException {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            return o(str);
        }
        try {
            return BitmapFactory.decodeStream(new URL(strTrim).openConnection().getInputStream());
        } catch (Throwable th) {
            AbstractC0603w1.b(EnumC0600v1.f7998z, "Could not download image!", th);
            return null;
        }
    }

    public static Bitmap o(String str) throws IllegalAccessException, NoSuchFieldException, IOException {
        Bitmap bitmapDecodeStream;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(f7878c.getAssets().open(str));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(f7878c.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int iW = w(str);
            if (iW != 0) {
                return BitmapFactory.decodeResource(f7877b, iW);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static int p() {
        int identifier = f7877b.getIdentifier("ic_stat_onesignal_default", "drawable", f7879d);
        if (identifier != 0) {
            return identifier;
        }
        int identifier2 = f7877b.getIdentifier("corona_statusbar_icon_default", "drawable", f7879d);
        if (identifier2 != 0) {
            return identifier2;
        }
        int identifier3 = f7877b.getIdentifier("ic_os_notification_fallback_white_24dp", "drawable", f7879d);
        return identifier3 != 0 ? identifier3 : R.drawable.ic_popup_reminder;
    }

    public static final synchronized J0.k q(Context context) {
        J0.k kVar;
        AbstractC1305a.o(context, "context");
        synchronized (J0.k.f1205s) {
            try {
                kVar = J0.k.f1203q;
                if (kVar == null) {
                    kVar = J0.k.f1204r;
                }
            } finally {
            }
        }
        if (kVar == null) {
            J0.k.K(context, new I0.b(new B3.e()));
        }
        return J0.k.J(context);
    }

    public static Integer r(C1 c12, String str, boolean z5) {
        Cursor cursorJ = c12.J("notification", null, (z5 ? "group_id IS NULL" : "group_id = ?").concat(" AND dismissed = 0 AND opened = 0 AND is_summary = 0"), z5 ? null : new String[]{str}, "created_time DESC", "1");
        if (!cursorJ.moveToFirst()) {
            cursorJ.close();
            return null;
        }
        Integer numValueOf = Integer.valueOf(cursorJ.getInt(cursorJ.getColumnIndex("android_notification_id")));
        cursorJ.close();
        return numValueOf;
    }

    public static Intent s(int i6) {
        return new Intent(f7878c, (Class<?>) NotificationDismissReceiver.class).putExtra("androidNotificationId", i6).putExtra("dismissed", true);
    }

    public static NotificationManager t(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    public static String u(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return v(jSONObject.optString("custom", null));
    }

    public static String v(String str) throws JSONException {
        JSONObject jSONObject;
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            AbstractC0603w1.b(enumC0600v1, "Not a OneSignal formatted JSON String, error parsing string as JSON.", null);
        }
        if (jSONObject.has("i")) {
            return jSONObject.optString("i", null);
        }
        AbstractC0603w1.b(enumC0600v1, "Not a OneSignal formatted JSON string. No 'i' field in custom.", null);
        return null;
    }

    public static int w(String str) throws IllegalAccessException, NoSuchFieldException {
        String strTrim;
        if (str != null && (strTrim = str.trim()) != null && !strTrim.matches("^[0-9]")) {
            int identifier = f7877b.getIdentifier(strTrim, "drawable", f7879d);
            if (identifier != 0) {
                return identifier;
            }
            try {
                return R.drawable.class.getField(str).getInt(null);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Integer x(C1 c12, String str) {
        Integer num;
        Cursor cursor = null;
        try {
            Cursor cursorU = c12.u("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{str}, null);
            try {
                if (!cursorU.moveToFirst()) {
                    cursorU.close();
                    if (!cursorU.isClosed()) {
                        cursorU.close();
                    }
                    return null;
                }
                Integer numValueOf = Integer.valueOf(cursorU.getInt(cursorU.getColumnIndex("android_notification_id")));
                cursorU.close();
                if (cursorU.isClosed()) {
                    return numValueOf;
                }
                cursorU.close();
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                cursor = cursorU;
                num = null;
                try {
                    AbstractC0603w1.b(EnumC0600v1.f7997y, "Error getting android notification id for summary notification group: ".concat(str), th);
                    return num;
                } finally {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            num = null;
        }
    }

    public static void y(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String strX = X(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String strX2 = jSONArray2 == null ? null : X(jSONArray2);
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            String str2 = (String) jSONArray.get(i6);
            if (jSONArray2 == null || !strX2.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                String string = jSONArray2.getString(i7);
                if (!strX.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str.concat("_a"), jSONArray3);
        }
        if (jSONArray4.toString().equals("[]")) {
            return;
        }
        jSONObject.put(str.concat("_d"), jSONArray4);
    }

    public static final String z(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a") && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("a")) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void I(String str) {
    }

    public void H(int i6, String str, Throwable th) {
    }
}
