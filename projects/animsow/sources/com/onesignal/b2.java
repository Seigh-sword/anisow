package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b2 extends a2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(int i6, String str, boolean z5) {
        super("email".concat(str), z5);
        this.f7772f = i6;
        if (i6 == 1) {
            super(str, z5);
        } else if (i6 != 2) {
        } else {
            super("sms".concat(str), z5);
        }
    }

    @Override // com.onesignal.a2
    public final void a() {
        switch (this.f7772f) {
            case 1:
                try {
                    int i6 = 1;
                    int iOptInt = ((JSONObject) d().f7497b).optInt("subscribableStatus", 1);
                    if (iOptInt < -2) {
                        i6 = iOptInt;
                    } else if (!((JSONObject) d().f7497b).optBoolean("androidPermission", true)) {
                        i6 = 0;
                    } else if (!((JSONObject) d().f7497b).optBoolean("userSubscribePref", true)) {
                        i6 = -2;
                    }
                    Integer numValueOf = Integer.valueOf(i6);
                    synchronized (a2.f7761d) {
                        this.f7765c.put("notification_types", numValueOf);
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
        }
    }
}
