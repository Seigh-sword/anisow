package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a4.c f7683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f7684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f7687e;

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f7684b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", jSONArray);
        }
        jSONObject.put("id", this.f7685c);
        Float f6 = this.f7687e;
        if (f6.floatValue() > 0.0f) {
            jSONObject.put("weight", f6);
        }
        long j6 = this.f7686d;
        if (j6 > 0) {
            jSONObject.put("timestamp", j6);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q0.class != obj.getClass()) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return this.f7683a.equals(q02.f7683a) && this.f7684b.equals(q02.f7684b) && this.f7685c.equals(q02.f7685c) && this.f7686d == q02.f7686d && this.f7687e.equals(q02.f7687e);
    }

    public final int hashCode() {
        Object[] objArr = {this.f7683a, this.f7684b, this.f7685c, Long.valueOf(this.f7686d), this.f7687e};
        int iHashCode = 1;
        for (int i6 = 0; i6 < 5; i6++) {
            Object obj = objArr[i6];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        return "OutcomeEvent{session=" + this.f7683a + ", notificationIds=" + this.f7684b + ", name='" + this.f7685c + "', timestamp=" + this.f7686d + ", weight=" + this.f7687e + '}';
    }
}
