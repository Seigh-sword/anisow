package com.onesignal;

import d.AbstractC0628i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends AbstractC0571l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7547g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f7550j;

    public F1(i2 i2Var, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f7550j = i2Var;
        this.f7548h = jSONObject;
        this.f7549i = jSONObject2;
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void H(int i6, String str, Throwable th) {
        switch (this.f7547g) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (i6 == 403) {
                    AbstractC0603w1.b(EnumC0600v1.f7996x, "403 error getting OneSignal params, omitting further retries!", null);
                    return;
                } else {
                    new Thread(new D(5, this), "OS_PARAMS_REQUEST").start();
                    return;
                }
            default:
                EnumC0600v1 enumC0600v1 = EnumC0600v1.f7997y;
                AbstractC0603w1.b(enumC0600v1, "Failed PUT sync request with status code: " + i6 + " and response: " + str, null);
                synchronized (((i2) this.f7550j).f7842a) {
                    try {
                        if (i2.a((i2) this.f7550j, i6, str, "No user with this id found")) {
                            i2.c((i2) this.f7550j);
                        } else {
                            i2.d((i2) this.f7550j, i6);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (((JSONObject) this.f7548h).has("tags")) {
                    AbstractC0628i.p(((i2) this.f7550j).f7846e.poll());
                }
                if (((JSONObject) this.f7548h).has("external_user_id")) {
                    AbstractC0603w1.b(enumC0600v1, "Error setting external user id for push with status code: " + i6 + " and message: " + str, null);
                    AbstractC0628i.p(((i2) this.f7550j).f7847f.poll());
                }
                if (((JSONObject) this.f7548h).has("language")) {
                    AbstractC0628i.p(((i2) this.f7550j).f7848g.poll());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0221  */
    @Override // com.onesignal.AbstractC0571l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.F1.I(java.lang.String):void");
    }

    public F1(String str, String str2, C0597u1 c0597u1) {
        this.f7548h = str;
        this.f7549i = str2;
        this.f7550j = c0597u1;
    }
}
