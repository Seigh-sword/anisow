package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0578o extends AbstractC0571l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7903h;

    public /* synthetic */ C0578o(int i6, Object obj) {
        this.f7902g = i6;
        this.f7903h = obj;
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void H(int i6, String str, Throwable th) {
        switch (this.f7902g) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0603w1.E("sending on_focus Failed", i6, th, str);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0603w1.b(EnumC0600v1.f7998z, "Failed last request. statusCode: " + i6 + "\nresponse: " + str, null);
                i2 i2Var = (i2) this.f7903h;
                if (i2.a(i2Var, i6, str, "already logged out of email")) {
                    i2.b(i2Var);
                } else if (!i2.a(i2Var, i6, str, "not a valid device_type")) {
                    i2.d(i2Var, i6);
                } else {
                    i2.c(i2Var);
                }
                break;
        }
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void I(String str) {
        JSONObject jSONObjectJ;
        switch (this.f7902g) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((AbstractC0581p) this.f7903h).g(0L);
                return;
            case 1:
                d2.f7784m = true;
                if (str == null || str.isEmpty()) {
                    str = "{}";
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("tags")) {
                        synchronized (((d2) this.f7903h).f7842a) {
                            Object obj = this.f7903h;
                            d2 d2Var = (d2) obj;
                            JSONObject jSONObjectOptJSONObject = ((JSONObject) ((d2) obj).i().f().f7497b).optJSONObject("tags");
                            JSONObject jSONObjectOptJSONObject2 = ((JSONObject) ((d2) this.f7903h).n().f().f7497b).optJSONObject("tags");
                            synchronized (d2Var.f7842a) {
                                jSONObjectJ = AbstractC0571l1.j(jSONObjectOptJSONObject, jSONObjectOptJSONObject2, null, null);
                                break;
                            }
                            a2 a2VarI = ((d2) this.f7903h).i();
                            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("tags");
                            a2VarI.getClass();
                            synchronized (a2.f7761d) {
                                a2VarI.f7765c.put("tags", jSONObjectOptJSONObject3);
                                break;
                            }
                            ((d2) this.f7903h).i().i();
                            ((d2) this.f7903h).n().h(jSONObject, jSONObjectJ);
                            ((d2) this.f7903h).n().i();
                        }
                        return;
                    }
                    return;
                } catch (JSONException e6) {
                    e6.printStackTrace();
                    return;
                }
            default:
                i2.b((i2) this.f7903h);
                return;
        }
    }
}
