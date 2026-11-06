package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SyncService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        Z0 z0C = Z0.c();
        W0 w02 = new W0(1);
        w02.f7718x = new WeakReference(this);
        z0C.getClass();
        AbstractC0603w1.b(EnumC0600v1.f7992B, "OSBackground sync, calling initWithContext", null);
        AbstractC0603w1.B(this);
        Thread thread = new Thread(w02, "OS_SYNCSRV_BG_SYNC");
        z0C.f7739b = thread;
        thread.start();
        return 1;
    }
}
