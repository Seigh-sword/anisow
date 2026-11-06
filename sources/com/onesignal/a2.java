package com.onesignal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f7761d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f7762e = new HashSet(Arrays.asList("lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f7764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f7765c;

    public a2(String str, boolean z5) {
        boolean z6;
        this.f7763a = str;
        if (!z5) {
            this.f7764b = new JSONObject();
            this.f7765c = new JSONObject();
            return;
        }
        String strE = E1.e(E1.f7517a, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + str, null);
        if (strE == null) {
            JSONObject jSONObject = new JSONObject();
            synchronized (f7761d) {
                this.f7764b = jSONObject;
            }
            try {
                int i6 = 1;
                int iC = E1.c(1, str.equals("CURRENT_STATE") ? "ONESIGNAL_SUBSCRIPTION" : "ONESIGNAL_SYNCED_SUBSCRIPTION");
                if (iC == -2) {
                    z6 = false;
                } else {
                    i6 = iC;
                    z6 = true;
                }
                HashMap map = new HashMap();
                map.put("subscribableStatus", Integer.valueOf(i6));
                map.put("userSubscribePref", Boolean.valueOf(z6));
                l(this.f7764b, map);
            } catch (JSONException unused) {
            }
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(strE);
                synchronized (f7761d) {
                    this.f7764b = jSONObject2;
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
        String str2 = E1.f7517a;
        String strE2 = E1.e(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + str, null);
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (strE2 == null) {
                jSONObject3.put("identifier", E1.e(str2, "GT_REGISTRATION_ID", null));
            } else {
                jSONObject3 = new JSONObject(strE2);
            }
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        synchronized (f7761d) {
            this.f7765c = jSONObject3;
        }
    }

    public static void l(JSONObject jSONObject, HashMap map) {
        synchronized (f7761d) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public final JSONObject b(a2 a2Var, boolean z5) {
        HashSet hashSet;
        JSONObject jSONObjectJ;
        a();
        a2Var.a();
        if (this.f7764b.optLong("loc_time_stamp") != a2Var.f7764b.getLong("loc_time_stamp")) {
            HashMap map = new HashMap();
            map.put("loc_bg", a2Var.f7764b.opt("loc_bg"));
            map.put("loc_time_stamp", a2Var.f7764b.opt("loc_time_stamp"));
            l(a2Var.f7765c, map);
            hashSet = f7762e;
        } else {
            hashSet = null;
        }
        JSONObject jSONObject = this.f7765c;
        JSONObject jSONObject2 = a2Var.f7765c;
        synchronized (f7761d) {
            jSONObjectJ = AbstractC0571l1.j(jSONObject, jSONObject2, null, hashSet);
        }
        if (!z5 && jSONObjectJ.toString().equals("{}")) {
            return null;
        }
        try {
            if (!jSONObjectJ.has("app_id")) {
                jSONObjectJ.put("app_id", this.f7765c.optString("app_id"));
            }
            if (this.f7765c.has("email_auth_hash")) {
                jSONObjectJ.put("email_auth_hash", this.f7765c.optString("email_auth_hash"));
            }
            if (this.f7765c.has("sms_auth_hash")) {
                jSONObjectJ.put("sms_auth_hash", this.f7765c.optString("sms_auth_hash"));
            }
            if (this.f7765c.has("external_user_id_auth_hash") && !jSONObjectJ.has("external_user_id_auth_hash")) {
                jSONObjectJ.put("external_user_id_auth_hash", this.f7765c.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return jSONObjectJ;
    }

    public final void c(JSONObject jSONObject) {
        synchronized (f7761d) {
            JSONObject jSONObject2 = this.f7765c;
            AbstractC0571l1.j(jSONObject2, jSONObject, jSONObject2, null);
        }
    }

    public final C d() {
        try {
            return new C(4, e());
        } catch (JSONException e6) {
            e6.printStackTrace();
            return new C(4);
        }
    }

    public final JSONObject e() {
        JSONObject jSONObject;
        synchronized (f7761d) {
            jSONObject = new JSONObject(this.f7764b.toString());
        }
        return jSONObject;
    }

    public final C f() {
        try {
            return new C(4, g());
        } catch (JSONException e6) {
            e6.printStackTrace();
            return new C(4);
        }
    }

    public final JSONObject g() {
        JSONObject jSONObject;
        synchronized (f7761d) {
            jSONObject = new JSONObject(this.f7765c.toString());
        }
        return jSONObject;
    }

    public final void h(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        if (jSONObject.has("tags")) {
            try {
                JSONObject jSONObjectG = g();
                if (jSONObjectG.has("tags")) {
                    try {
                        jSONObject3 = new JSONObject(jSONObjectG.optString("tags"));
                    } catch (JSONException unused) {
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    jSONObject3 = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("".equals(jSONObjectOptJSONObject.optString(next))) {
                        jSONObject3.remove(next);
                    } else if (jSONObject2 == null || !jSONObject2.has(next)) {
                        jSONObject3.put(next, jSONObjectOptJSONObject.optString(next));
                    }
                }
                synchronized (f7761d) {
                    try {
                        if (jSONObject3.toString().equals("{}")) {
                            this.f7765c.remove("tags");
                        } else {
                            this.f7765c.put("tags", jSONObject3);
                        }
                    } finally {
                    }
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: all -> 0x002c, JSONException -> 0x002e, TRY_LEAVE, TryCatch #1 {JSONException -> 0x002e, blocks: (B:4:0x0007, B:6:0x0011, B:8:0x001b, B:17:0x003a, B:15:0x0030), top: B:25:0x0007, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r5 = this;
            java.lang.String r0 = "ONESIGNAL_USERSTATE_DEPENDVALYES_"
            java.lang.String r1 = "ONESIGNAL_USERSTATE_SYNCVALYES_"
            java.lang.Object r2 = com.onesignal.a2.f7761d
            monitor-enter(r2)
            org.json.JSONObject r3 = r5.f7765c     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            java.lang.String r4 = "external_user_id_auth_hash"
            boolean r3 = r3.has(r4)     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            if (r3 == 0) goto L45
            org.json.JSONObject r3 = r5.f7765c     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            java.lang.String r4 = "external_user_id"
            boolean r3 = r3.has(r4)     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            if (r3 == 0) goto L30
            org.json.JSONObject r3 = r5.f7765c     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            java.lang.String r4 = "external_user_id"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            java.lang.String r4 = ""
            if (r3 == r4) goto L3a
            goto L30
        L2c:
            r0 = move-exception
            goto L77
        L2e:
            r3 = move-exception
            goto L42
        L30:
            org.json.JSONObject r3 = r5.f7765c     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            java.lang.String r4 = "external_user_id"
            boolean r3 = r3.has(r4)     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            if (r3 != 0) goto L45
        L3a:
            org.json.JSONObject r3 = r5.f7765c     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            java.lang.String r4 = "external_user_id_auth_hash"
            r3.remove(r4)     // Catch: java.lang.Throwable -> L2c org.json.JSONException -> L2e
            goto L45
        L42:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L2c
        L45:
            java.lang.String r3 = com.onesignal.E1.f7517a     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r5.f7763a     // Catch: java.lang.Throwable -> L2c
            r4.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r4 = r5.f7765c     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            com.onesignal.E1.g(r3, r1, r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r5.f7763a     // Catch: java.lang.Throwable -> L2c
            r1.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r1 = r5.f7764b     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            com.onesignal.E1.g(r3, r0, r1)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            return
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.a2.i():void");
    }

    public final void j(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f7764b;
            synchronized (f7761d) {
                AbstractC0571l1.j(jSONObject3, jSONObject, jSONObject3, null);
            }
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f7765c;
            synchronized (f7761d) {
                AbstractC0571l1.j(jSONObject4, jSONObject2, jSONObject4, null);
            }
            h(jSONObject2, null);
        }
        if (jSONObject == null && jSONObject2 == null) {
            return;
        }
        i();
    }

    public final void k(Boolean bool, String str) {
        synchronized (f7761d) {
            this.f7764b.put(str, bool);
        }
    }

    public final void m(String str) {
        synchronized (f7761d) {
            this.f7764b.remove(str);
        }
    }

    public final void n(String str) {
        synchronized (f7761d) {
            this.f7765c.remove(str);
        }
    }

    public final String toString() {
        return "UserState{persistKey='" + this.f7763a + "', dependValues=" + this.f7764b + ", syncValues=" + this.f7765c + '}';
    }
}
