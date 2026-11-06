package com.onesignal;

import android.content.Context;
import org.json.JSONException;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
class OSPermissionChangedInternalObserver {
    public static void a(S0 s02) {
        if (!s02.f7699x) {
            Context context = AbstractC0603w1.f8028b;
            if (AbstractC0571l1.e(context)) {
                try {
                    e4.c.a(context, 0);
                } catch (e4.b unused) {
                }
            }
        }
        AbstractC0603w1.f8057w.getClass();
        boolean zA = E1.b(E1.f7517a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true) ? OSUtils.a() : true;
        d2 d2VarB = M1.b();
        d2VarB.getClass();
        try {
            d2VarB.o().k(Boolean.valueOf(zA), "androidPermission");
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public void changed(S0 s02) {
        a(s02);
        X1 x12 = new X1(AbstractC0603w1.f8021V, (S0) s02.clone(), 11);
        if (AbstractC0603w1.f8022W == null) {
            AbstractC0603w1.f8022W = new C1474r("onOSPermissionChanged", true);
        }
        if (AbstractC0603w1.f8022W.h(x12)) {
            S0 s03 = (S0) s02.clone();
            AbstractC0603w1.f8021V = s03;
            s03.getClass();
            E1.h(E1.f7517a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", s03.f7699x);
        }
    }
}
