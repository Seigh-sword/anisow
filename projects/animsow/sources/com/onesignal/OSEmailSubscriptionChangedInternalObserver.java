package com.onesignal;

import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
class OSEmailSubscriptionChangedInternalObserver {
    public void changed(C0543c0 c0543c0) {
        X1 x12 = new X1(AbstractC0603w1.f8029b0, (C0543c0) c0543c0.clone(), 4);
        if (AbstractC0603w1.f8031c0 == null) {
            AbstractC0603w1.f8031c0 = new C1474r("onOSEmailSubscriptionChanged", true);
        }
        if (AbstractC0603w1.f8031c0.h(x12)) {
            C0543c0 c0543c02 = (C0543c0) c0543c0.clone();
            AbstractC0603w1.f8029b0 = c0543c02;
            c0543c02.getClass();
            String str = E1.f7517a;
            E1.g(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", c0543c02.f7774x);
            E1.g(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", c0543c02.f7775y);
        }
    }
}
