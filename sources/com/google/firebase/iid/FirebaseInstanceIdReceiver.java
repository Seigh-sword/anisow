package com.google.firebase.iid;

import T1.k;
import Y2.b;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n.ThreadFactoryC1140c;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SoftReference f7434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SoftReference f7435b;

    public static int b(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
        if (b.C(intentPutExtras)) {
            b.s("_nd", intentPutExtras.getExtras());
        }
        return -1;
    }

    @Override // android.content.BroadcastReceiver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        boolean zIsOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (FirebaseInstanceIdReceiver.class) {
            try {
                SoftReference softReference = f7434a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC1140c("firebase-iid-executor")));
                    f7434a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new k(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync));
    }
}
