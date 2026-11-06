package com.onesignal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f7641a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f7642b = new HashMap();

    public static c2 a() {
        HashMap map = f7642b;
        L1 l12 = L1.f7624x;
        if (!map.containsKey(l12) || map.get(l12) == null) {
            synchronized (f7641a) {
                try {
                    if (map.get(l12) == null) {
                        map.put(l12, new c2(l12));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (c2) map.get(l12);
    }

    public static d2 b() {
        HashMap map = f7642b;
        L1 l12 = L1.f7623w;
        if (!map.containsKey(l12) || map.get(l12) == null) {
            synchronized (f7641a) {
                try {
                    if (map.get(l12) == null) {
                        map.put(l12, new d2(l12));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (d2) map.get(l12);
    }

    public static e2 c() {
        HashMap map = f7642b;
        L1 l12 = L1.f7625y;
        if (!map.containsKey(l12) || map.get(l12) == null) {
            synchronized (f7641a) {
                try {
                    if (map.get(l12) == null) {
                        map.put(l12, new e2(l12));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (e2) map.get(l12);
    }

    public static C0598v d(boolean z5) {
        C0598v c0598v;
        JSONObject jSONObject;
        d2 d2VarB = b();
        if (z5) {
            d2VarB.getClass();
            AbstractC0571l1.D("players/" + AbstractC0603w1.v() + "?app_id=" + AbstractC0603w1.t(AbstractC0603w1.f8028b), null, null, new C0578o(1, d2VarB), 60000, "CACHE_KEY_GET_TAGS");
        }
        synchronized (d2VarB.f7842a) {
            boolean z6 = d2.f7784m;
            C cF = d2VarB.n().f();
            if (((JSONObject) cF.f7497b).has("tags")) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectOptJSONObject = ((JSONObject) cF.f7497b).optJSONObject("tags");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        Object obj = jSONObjectOptJSONObject.get(next);
                        if (!"".equals(obj)) {
                            jSONObject2.put(next, obj);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject = jSONObject2;
            } else {
                jSONObject = null;
            }
            c0598v = new C0598v();
            c0598v.f7984w = z6;
            c0598v.f7985x = jSONObject;
        }
        return c0598v;
    }

    public static void e(JSONObject jSONObject, AbstractC0571l1 abstractC0571l1) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b());
        if (!TextUtils.isEmpty(AbstractC0603w1.f8042i)) {
            arrayList.add(a());
        }
        if (!TextUtils.isEmpty(AbstractC0603w1.f8044j)) {
            arrayList.add(c());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0571l1.J("players/" + ((i2) it.next()).j() + "/on_purchase", jSONObject, abstractC0571l1);
        }
    }

    public static void f(K k5) {
        b().B(k5);
        a().B(k5);
        c().B(k5);
    }

    public static void g(JSONObject jSONObject) {
        d2 d2VarB = b();
        d2VarB.getClass();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", null));
            d2VarB.o().c(jSONObject2);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            a2 a2VarO = d2VarB.o();
            a2VarO.getClass();
            synchronized (a2.f7761d) {
                JSONObject jSONObject4 = a2VarO.f7764b;
                AbstractC0571l1.j(jSONObject4, jSONObject3, jSONObject4, null);
            }
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }
}
