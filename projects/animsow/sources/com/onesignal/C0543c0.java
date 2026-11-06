package com.onesignal;

import org.json.JSONObject;
import w1.C1474r;

/* JADX INFO: renamed from: com.onesignal.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0543c0 implements Cloneable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1474r f7773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f7774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7775y;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f7774x;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("emailUserId", obj);
            Object obj2 = this.f7775y;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("emailAddress", obj2);
            jSONObject.put("isSubscribed", (this.f7774x == null || this.f7775y == null) ? false : true);
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
