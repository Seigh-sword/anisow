package X1;

import a2.C0259a;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class O implements ServiceConnection {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N f4540A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ComponentName f4541B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ P f4542C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f4543w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4544x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4545y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public IBinder f4546z;

    public O(P p5, N n5) {
        this.f4542C = p5;
        this.f4540A = n5;
    }

    public final void a(String str, Executor executor) {
        this.f4544x = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            P p5 = this.f4542C;
            C0259a c0259a = p5.f4553d;
            Context context = p5.f4551b;
            boolean zD = c0259a.d(context, str, this.f4540A.a(context), this, 4225, executor);
            this.f4545y = zD;
            if (zD) {
                this.f4542C.f4552c.sendMessageDelayed(this.f4542C.f4552c.obtainMessage(1, this.f4540A), this.f4542C.f4555f);
            } else {
                this.f4544x = 2;
                try {
                    P p6 = this.f4542C;
                    p6.f4553d.c(p6.f4551b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4542C.f4550a) {
            try {
                this.f4542C.f4552c.removeMessages(1, this.f4540A);
                this.f4546z = iBinder;
                this.f4541B = componentName;
                Iterator it = this.f4543w.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f4544x = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4542C.f4550a) {
            try {
                this.f4542C.f4552c.removeMessages(1, this.f4540A);
                this.f4546z = null;
                this.f4541B = componentName;
                Iterator it = this.f4543w.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f4544x = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
