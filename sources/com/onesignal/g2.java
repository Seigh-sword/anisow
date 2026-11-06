package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends AbstractC0571l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f7821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i2 f7822j;

    public g2(i2 i2Var, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        this.f7822j = i2Var;
        this.f7819g = jSONObject;
        this.f7820h = jSONObject2;
        this.f7821i = str;
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void H(int i6, String str, Throwable th) {
        synchronized (this.f7822j.f7842a) {
            try {
                this.f7822j.f7851j = false;
                AbstractC0603w1.b(EnumC0600v1.f7998z, "Failed last request. statusCode: " + i6 + "\nresponse: " + str, null);
                if (i2.a(this.f7822j, i6, str, "not a valid device_type")) {
                    i2.c(this.f7822j);
                } else {
                    i2.d(this.f7822j, i6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void I(String str) {
        synchronized (this.f7822j.f7842a) {
            try {
                i2 i2Var = this.f7822j;
                i2Var.f7851j = false;
                i2Var.i().j(this.f7819g, this.f7820h);
                try {
                    AbstractC0603w1.b(EnumC0600v1.f7992B, "doCreateOrNewSession:response: " + str, null);
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("id")) {
                        String strOptString = jSONObject.optString("id");
                        this.f7822j.A(strOptString);
                        AbstractC0603w1.b(EnumC0600v1.f7991A, "Device registered, UserId = " + strOptString, null);
                    } else {
                        AbstractC0603w1.b(EnumC0600v1.f7991A, "session sent, UserId = " + this.f7821i, null);
                    }
                    this.f7822j.o().k(Boolean.FALSE, "session");
                    this.f7822j.o().i();
                    if (jSONObject.has("in_app_messages")) {
                        AbstractC0603w1.q().o0(jSONObject.getJSONArray("in_app_messages"));
                    }
                    this.f7822j.r(this.f7820h);
                } catch (JSONException e6) {
                    AbstractC0603w1.b(EnumC0600v1.f7997y, "ERROR parsing on_session or create JSON Response.", e6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
