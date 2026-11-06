package com.onesignal;

import org.json.JSONObject;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements Cloneable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1474r f7715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f7716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7717y;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f7716x;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("smsUserId", obj);
            Object obj2 = this.f7717y;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("smsNumber", obj2);
            jSONObject.put("isSubscribed", (this.f7716x == null || this.f7717y == null) ? false : true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return a().toString();
    }
}
