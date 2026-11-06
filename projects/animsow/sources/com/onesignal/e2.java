package com.onesignal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends f2 {
    @Override // com.onesignal.i2
    public final void A(String str) {
        AbstractC0603w1.f8044j = str;
        if (AbstractC0603w1.f8028b != null) {
            E1.g(E1.f7517a, "PREFS_OS_SMS_ID", "".equals(AbstractC0603w1.f8044j) ? null : AbstractC0603w1.f8044j);
        }
        V0 v0M = AbstractC0603w1.m(AbstractC0603w1.f8028b);
        boolean z5 = true;
        if (str != null ? str.equals(v0M.f7716x) : v0M.f7716x == null) {
            z5 = false;
        }
        v0M.f7716x = str;
        if (z5) {
            v0M.f7715w.h(v0M);
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
        return "sms_auth_hash";
    }

    @Override // com.onesignal.f2
    public final String F() {
        return "sms_number";
    }

    @Override // com.onesignal.f2
    public final int G() {
        return 14;
    }

    @Override // com.onesignal.i2
    public final String j() {
        return AbstractC0603w1.s();
    }

    @Override // com.onesignal.i2
    public final b2 q(String str) {
        return new b2(2, str, true);
    }
}
