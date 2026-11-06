package T1;

import a2.C0259a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.X;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m.RunnableC0969k;
import t0.AbstractC1332d;
import u1.C1358b;
import u1.C1364h;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ q f3435B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C1358b f3438y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3436w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Messenger f3437x = new Messenger(new X(Looper.getMainLooper(), new C1364h(1, this), 1));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayDeque f3439z = new ArrayDeque();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final SparseArray f3434A = new SparseArray();

    public /* synthetic */ m(q qVar) {
        this.f3435B = qVar;
    }

    public final synchronized void a(int i6, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i6 = this.f3436w;
            if (i6 == 0) {
                throw new IllegalStateException();
            }
            if (i6 != 1 && i6 != 2) {
                if (i6 != 3) {
                    return;
                }
                this.f3436w = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f3436w = 4;
            C0259a.b().c((Context) this.f3435B.f3447b, this);
            p pVar = new p(str, securityException);
            Iterator it = this.f3439z.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(pVar);
            }
            this.f3439z.clear();
            for (int i7 = 0; i7 < this.f3434A.size(); i7++) {
                ((o) this.f3434A.valueAt(i7)).a(pVar);
            }
            this.f3434A.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f3436w == 2 && this.f3439z.isEmpty() && this.f3434A.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f3436w = 3;
                C0259a.b().c((Context) this.f3435B.f3447b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(n nVar) {
        int i6 = this.f3436w;
        int i7 = 0;
        int i8 = 1;
        if (i6 != 0) {
            if (i6 == 1) {
                this.f3439z.add(nVar);
                return true;
            }
            if (i6 != 2) {
                return false;
            }
            this.f3439z.add(nVar);
            ((ScheduledExecutorService) this.f3435B.f3448c).execute(new l(this, i7));
            return true;
        }
        this.f3439z.add(nVar);
        AbstractC1332d.p(this.f3436w == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f3436w = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C0259a.b().a((Context) this.f3435B.f3447b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f3435B.f3448c).schedule(new l(this, i8), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e6) {
            b("Unable to bind to service", e6);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f3435B.f3448c).execute(new RunnableC0969k(this, iBinder, 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i6 = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f3435B.f3448c).execute(new l(this, i6));
    }
}
