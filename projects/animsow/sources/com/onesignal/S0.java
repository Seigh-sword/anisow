package com.onesignal;

import org.json.JSONObject;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements Cloneable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1474r f7698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7699x;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.f7699x);
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
