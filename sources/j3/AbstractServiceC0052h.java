package J3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC1138a;
import n.ThreadFactoryC1140c;
import p1.C1243i;
import q2.InterfaceC1261d;

/* JADX INFO: renamed from: J3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0052h extends Service {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f1402B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1403A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ExecutorService f1404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public I f1405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f1406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1407z;

    public AbstractServiceC0052h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1140c("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1404w = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f1406y = new Object();
        this.f1403A = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            H.b(intent);
        }
        synchronized (this.f1406y) {
            try {
                int i6 = this.f1403A - 1;
                this.f1403A = i6;
                if (i6 == 0) {
                    stopSelfResult(this.f1407z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f1405x == null) {
                this.f1405x = new I(new C1243i(24, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1405x;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f1404w.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i6, int i7) {
        synchronized (this.f1406y) {
            this.f1407z = i7;
            this.f1403A++;
        }
        Intent intent2 = (Intent) ((Queue) w.k().f1444d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        q2.j jVar = new q2.j();
        this.f1404w.execute(new c0.n(this, intent2, jVar, 4));
        q2.s sVar = jVar.f12351a;
        if (sVar.e()) {
            a(intent);
            return 2;
        }
        sVar.h(new ExecutorC1138a(13), new InterfaceC1261d() { // from class: J3.g
            @Override // q2.InterfaceC1261d
            public final void c(q2.i iVar) {
                this.f1400w.a(intent);
            }
        });
        return 3;
    }
}
