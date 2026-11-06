package com.onesignal;

import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
class OSSubscriptionChangedInternalObserver {
    public void changed(OSSubscriptionState oSSubscriptionState) {
        X1 x12 = new X1(AbstractC0603w1.f8024Y, (OSSubscriptionState) oSSubscriptionState.clone(), 13);
        if (AbstractC0603w1.f8025Z == null) {
            AbstractC0603w1.f8025Z = new C1474r("onOSSubscriptionChanged", true);
        }
        if (AbstractC0603w1.f8025Z.h(x12)) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            AbstractC0603w1.f8024Y = oSSubscriptionState2;
            oSSubscriptionState2.getClass();
            String str = E1.f7517a;
            E1.h(str, "ONESIGNAL_SUBSCRIPTION_LAST", oSSubscriptionState2.f7653A);
            E1.g(str, "ONESIGNAL_PLAYER_ID_LAST", oSSubscriptionState2.f7655x);
            E1.g(str, "ONESIGNAL_PUSH_TOKEN_LAST", oSSubscriptionState2.f7656y);
            E1.h(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", oSSubscriptionState2.f7657z);
        }
    }
}
