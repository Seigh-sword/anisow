package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public class OSSubscriptionState implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f7653A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1474r f7654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f7655x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f7656y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7657z;

    public final boolean a() {
        return (this.f7655x == null || this.f7656y == null || this.f7653A || !this.f7657z) ? false : true;
    }

    public void changed(S0 s02) {
        boolean z5 = s02.f7699x;
        boolean zA = a();
        this.f7657z = z5;
        if (zA != a()) {
            this.f7654w.h(this);
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f7655x;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("userId", obj);
            Object obj2 = this.f7656y;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("pushToken", obj2);
            jSONObject.put("isPushDisabled", this.f7653A);
            jSONObject.put("isSubscribed", a());
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        return d().toString();
    }
}
