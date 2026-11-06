package com.onesignal;

import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
class OSSMSSubscriptionChangedInternalObserver {
    public void changed(V0 v02) {
        X1 x12 = new X1(AbstractC0603w1.f8035e0, (V0) v02.clone(), 12);
        if (AbstractC0603w1.f8037f0 == null) {
            AbstractC0603w1.f8037f0 = new C1474r("onSMSSubscriptionChanged", true);
        }
        if (AbstractC0603w1.f8037f0.h(x12)) {
            V0 v03 = (V0) v02.clone();
            AbstractC0603w1.f8035e0 = v03;
            v03.getClass();
            String str = E1.f7517a;
            E1.g(str, "PREFS_OS_SMS_ID_LAST", v03.f7716x);
            E1.g(str, "PREFS_OS_SMS_NUMBER_LAST", v03.f7717y);
        }
    }
}
