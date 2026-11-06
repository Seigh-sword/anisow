package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONArray f7593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f7594b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        return AbstractC1305a.c(this.f7593a, j02.f7593a) && AbstractC1305a.c(this.f7594b, j02.f7594b);
    }

    public final int hashCode() {
        JSONArray jSONArray = this.f7593a;
        int iHashCode = (jSONArray != null ? jSONArray.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f7594b;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f7593a + ", jsonData=" + this.f7594b + ")";
    }
}
