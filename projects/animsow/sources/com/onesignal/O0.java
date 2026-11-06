package com.onesignal;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f7652a = OSUtils.q();

    public static void a(Context context, String str, int i6, String str2, long j6, boolean z5) throws Throwable {
        HashMap map = new HashMap();
        map.put("android_notif_id", Integer.valueOf(i6));
        map.put("json_payload", str2);
        map.put("timestamp", Long.valueOf(j6));
        map.put("is_restoring", Boolean.valueOf(z5));
        I0.g gVar = new I0.g(map);
        I0.g.b(gVar);
        I0.p pVar = new I0.p(OSNotificationWorkManager$NotificationWorker.class);
        pVar.f1113b.f2904e = gVar;
        I0.q qVarA = pVar.a();
        AbstractC0603w1.b(EnumC0600v1.f7992B, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2, null);
        AbstractC0571l1.q(context).I(str, Collections.singletonList(qVarA));
    }
}
