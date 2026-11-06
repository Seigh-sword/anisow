package com.google.firebase.sessions;

import N3.U;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HandlerThread f7453w = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public U f7454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Messenger f7455y;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messenger = (Messenger) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : intent.getParcelableExtra("ClientCallbackMessenger"));
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            U u5 = this.f7454x;
            if (u5 != null) {
                u5.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f7455y;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f7453w;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        AbstractC1305a.n(looper, "handlerThread.looper");
        this.f7454x = new U(looper);
        this.f7455y = new Messenger(this.f7454x);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f7453w.quit();
    }
}
