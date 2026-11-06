package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class f2 extends i2 {
    public abstract void C();

    public abstract void D();

    public abstract String E();

    public abstract String F();

    public abstract int G();

    @Override // com.onesignal.i2
    public final void e(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", G());
            jSONObject.putOpt("device_player_id", AbstractC0603w1.v());
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.onesignal.i2
    public final void g(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            C();
        }
    }

    @Override // com.onesignal.i2
    public final EnumC0600v1 k() {
        return EnumC0600v1.f7991A;
    }

    @Override // com.onesignal.i2
    public final void r(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(F(), jSONObject.get("identifier"));
                if (jSONObject.has(E())) {
                    jSONObject2.put(E(), jSONObject.get(E()));
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            D();
        }
    }

    @Override // com.onesignal.i2
    public final void v() {
        if ((j() == null && m() == null) || AbstractC0603w1.v() == null) {
            return;
        }
        l().a();
    }
}
