package com.onesignal;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends f2 {
    @Override // com.onesignal.i2
    public final void A(String str) {
        AbstractC0603w1.f8042i = str;
        if (AbstractC0603w1.f8028b != null) {
            E1.g(E1.f7517a, "OS_EMAIL_ID", "".equals(AbstractC0603w1.f8042i) ? null : AbstractC0603w1.f8042i);
        }
        C0543c0 c0543c0K = AbstractC0603w1.k(AbstractC0603w1.f8028b);
        boolean z5 = true;
        if (str != null ? str.equals(c0543c0K.f7774x) : c0543c0K.f7774x == null) {
            z5 = false;
        }
        c0543c0K.f7774x = str;
        if (z5) {
            c0543c0K.f7773w.h(c0543c0K);
        }
        try {
            M1.g(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.onesignal.f2
    public final void C() {
        ArrayList arrayList = AbstractC0603w1.f8026a;
    }

    @Override // com.onesignal.f2
    public final void D() {
        ArrayList arrayList = AbstractC0603w1.f8026a;
    }

    @Override // com.onesignal.f2
    public final String E() {
        return "email_auth_hash";
    }

    @Override // com.onesignal.f2
    public final String F() {
        return "email";
    }

    @Override // com.onesignal.f2
    public final int G() {
        return 11;
    }

    @Override // com.onesignal.i2
    public final String j() {
        return AbstractC0603w1.o();
    }

    @Override // com.onesignal.i2
    public final b2 q(String str) {
        return new b2(0, str, true);
    }
}
