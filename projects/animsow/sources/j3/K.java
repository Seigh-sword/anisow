package J3;

import a2.C0259a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import d.RunnableC0632m;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ThreadFactoryC1140c;

/* JADX INFO: loaded from: classes.dex */
public final class K implements ServiceConnection {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public I f1371A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f1372B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Intent f1374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ScheduledExecutorService f1375y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayDeque f1376z;

    public K(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC1140c("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f1376z = new ArrayDeque();
        this.f1372B = false;
        Context applicationContext = context.getApplicationContext();
        this.f1373w = applicationContext;
        this.f1374x = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f1375y = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f1376z.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                I i6 = this.f1371A;
                if (i6 == null || !i6.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f1371A.a((J) this.f1376z.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized q2.s b(Intent intent) {
        J j6;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            j6 = new J(intent);
            ScheduledExecutorService scheduledExecutorService = this.f1375y;
            j6.f1370b.f12351a.h(scheduledExecutorService, new G(2, scheduledExecutorService.schedule(new RunnableC0632m(22, j6), 20L, TimeUnit.SECONDS)));
            this.f1376z.add(j6);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return j6.f1370b.f12351a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f1372B);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f1372B) {
            return;
        }
        this.f1372B = true;
        try {
            if (C0259a.b().a(this.f1373w, this.f1374x, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e6) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e6);
        }
        this.f1372B = false;
        while (true) {
            ArrayDeque arrayDeque = this.f1376z;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((J) arrayDeque.poll()).f1370b.c(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f1372B = false;
            if (iBinder instanceof I) {
                this.f1371A = (I) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f1376z;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((J) arrayDeque.poll()).f1370b.c(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
