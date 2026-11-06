package com.onesignal;

import a3.C0261b;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.Bundle;
import b3.C0343c;
import c4.AbstractC0377b;
import d4.C0657b;
import d4.C0658c;
import h1.C0764d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7505x;

    public /* synthetic */ D(int i6, Object obj) {
        this.f7504w = i6;
        this.f7505x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a4.c cVar;
        C0261b c0261b;
        C0261b c0261b2;
        a4.c cVar2;
        Method method;
        switch (this.f7504w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                F f6 = (F) this.f7505x;
                j2 j2Var = f6.f7542t;
                if (j2Var != null) {
                    C0579o0 c0579o0Q = AbstractC0603w1.q();
                    C0585q0 c0585q0 = j2Var.f7856a.f7942e;
                    c0579o0Q.f7906g.getClass();
                    C0594t1.h("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
                }
                if (f6.f7524b == null) {
                    f6.f7534l = true;
                    return;
                } else {
                    f6.e(null);
                    f6.f7543u = null;
                    return;
                }
            case 1:
                C0579o0 c0579o0 = (C0579o0) this.f7505x;
                c0579o0.f7906g.getClass();
                C0594t1.d("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
                c0579o0.f0();
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0603w1.b(EnumC0600v1.f7992B, "Running complete from OSNotificationReceivedEvent timeout runnable!", null);
                M0 m02 = (M0) this.f7505x;
                m02.a(m02.f7639d);
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                Thread.currentThread().setPriority(10);
                C0764d c0764d = (C0764d) this.f7505x;
                ((C0657b) c0764d.f8953z).f8226d = c0764d.f8950w;
                AbstractC0377b abstractC0377bL = ((J3.w) ((C0584q) c0764d.f8951x).f7949x).l();
                C0657b c0657b = (C0657b) ((C0764d) this.f7505x).f8953z;
                AbstractC1305a.o(c0657b, "event");
                C0343c c0343c = abstractC0377bL.f6239b;
                synchronized (c0343c) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        a4.c cVar3 = a4.c.f5026y;
                        C0658c c0658c = c0657b.f8224b;
                        if (c0658c == null || (c0261b2 = c0658c.f8227a) == null) {
                            cVar = cVar3;
                        } else {
                            JSONArray jSONArray3 = (JSONArray) c0261b2.f5011x;
                            if (jSONArray3 == null || jSONArray3.length() <= 0) {
                                cVar2 = cVar3;
                            } else {
                                cVar2 = a4.c.f5024w;
                                jSONArray = jSONArray3;
                            }
                            JSONArray jSONArray4 = (JSONArray) c0261b2.f5012y;
                            if (jSONArray4 != null && jSONArray4.length() > 0) {
                                cVar3 = a4.c.f5024w;
                                jSONArray2 = jSONArray4;
                            }
                            cVar = cVar3;
                            cVar3 = cVar2;
                        }
                        C0658c c0658c2 = c0657b.f8224b;
                        if (c0658c2 != null && (c0261b = c0658c2.f8228b) != null) {
                            JSONArray jSONArray5 = (JSONArray) c0261b.f5011x;
                            if (jSONArray5 != null && jSONArray5.length() > 0) {
                                cVar3 = a4.c.f5025x;
                                jSONArray = jSONArray5;
                            }
                            JSONArray jSONArray6 = (JSONArray) c0261b.f5012y;
                            if (jSONArray6 != null && jSONArray6.length() > 0) {
                                cVar = a4.c.f5025x;
                                jSONArray2 = jSONArray6;
                            }
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("notification_ids", jSONArray.toString());
                        contentValues.put("iam_ids", jSONArray2.toString());
                        String string = cVar3.toString();
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = string.toLowerCase();
                        AbstractC1305a.n(lowerCase, "(this as java.lang.String).toLowerCase()");
                        contentValues.put("notification_influence_type", lowerCase);
                        String string2 = cVar.toString();
                        if (string2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase2 = string2.toLowerCase();
                        AbstractC1305a.n(lowerCase2, "(this as java.lang.String).toLowerCase()");
                        contentValues.put("iam_influence_type", lowerCase2);
                        contentValues.put("name", c0657b.f8223a);
                        contentValues.put("weight", Float.valueOf(c0657b.f8225c));
                        contentValues.put("timestamp", Long.valueOf(c0657b.f8226d));
                        ((C1) ((B1) c0343c.f5931x)).k("outcome", contentValues);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                D1 d12 = (D1) this.f7505x;
                int i6 = D1.f7509z;
                d12.getClass();
                for (String str : E1.f7518b.keySet()) {
                    SharedPreferences.Editor editorEdit = E1.d(str).edit();
                    HashMap map = (HashMap) E1.f7518b.get(str);
                    synchronized (map) {
                        try {
                            for (String str2 : map.keySet()) {
                                Object obj = map.get(str2);
                                if (obj instanceof String) {
                                    editorEdit.putString(str2, (String) obj);
                                } else if (obj instanceof Boolean) {
                                    editorEdit.putBoolean(str2, ((Boolean) obj).booleanValue());
                                } else if (obj instanceof Integer) {
                                    editorEdit.putInt(str2, ((Integer) obj).intValue());
                                } else if (obj instanceof Long) {
                                    editorEdit.putLong(str2, ((Long) obj).longValue());
                                } else if (obj instanceof Set) {
                                    editorEdit.putStringSet(str2, (Set) obj);
                                } else if (obj == null) {
                                    editorEdit.remove(str2);
                                }
                                break;
                            }
                            map.clear();
                        } finally {
                        }
                    }
                    editorEdit.apply();
                }
                AbstractC0603w1.f8056v.getClass();
                d12.f7511x = System.currentTimeMillis();
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                int i7 = (AbstractC0571l1.f7881f * 10000) + 30000;
                if (i7 > 90000) {
                    i7 = 90000;
                }
                AbstractC0603w1.b(EnumC0600v1.f7991A, "Failed to get Android parameters, trying again in " + (i7 / 1000) + " seconds.", null);
                try {
                    Thread.sleep(i7);
                    AbstractC0571l1.f7881f++;
                    Object obj2 = this.f7505x;
                    AbstractC0571l1.C((String) ((F1) obj2).f7548h, (String) ((F1) obj2).f7549i, (C0597u1) ((F1) obj2).f7550j);
                    return;
                } catch (InterruptedException e6) {
                    e6.printStackTrace();
                    return;
                }
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Object obj3 = this.f7505x;
                Z1 z12 = (Z1) obj3;
                z12.f7756h = true;
                try {
                    if (((Z1) obj3).f7751c == null) {
                        Z1 z13 = (Z1) obj3;
                        Method[] methods = Z1.f7748j.getMethods();
                        int length = methods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                method = methods[i8];
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length != 4 || parameterTypes[0] != Integer.TYPE || parameterTypes[1] != String.class || parameterTypes[2] != String.class || parameterTypes[3] != String.class) {
                                    i8++;
                                }
                            } else {
                                method = null;
                            }
                        }
                        z13.f7751c = method;
                        ((Z1) obj3).f7751c.setAccessible(true);
                    }
                    Bundle bundle = (Bundle) ((Z1) obj3).f7751c.invoke(((Z1) obj3).f7750b, 3, ((Z1) obj3).f7753e.getPackageName(), "inapp", null);
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        for (int i9 = 0; i9 < stringArrayList2.size(); i9++) {
                            String str3 = stringArrayList2.get(i9);
                            String str4 = stringArrayList.get(i9);
                            String string3 = new JSONObject(str3).getString("purchaseToken");
                            if (!((Z1) obj3).f7754f.contains(string3) && !arrayList2.contains(string3)) {
                                arrayList2.add(string3);
                                arrayList.add(str4);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Z1.a((Z1) obj3, arrayList, arrayList2);
                        } else if (stringArrayList2.size() == 0) {
                            ((Z1) obj3).f7755g = false;
                            E1.h("GTPlayerPurchases", "ExistingPurchases", false);
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                z12.f7756h = false;
                return;
            default:
                h2 h2Var = (h2) this.f7505x;
                if (!h2Var.f7834z.f7845d.get()) {
                    h2Var.f7834z.y(false);
                    return;
                }
                return;
        }
    }
}
