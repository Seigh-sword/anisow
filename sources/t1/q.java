package T1;

import P4.InterfaceC0146g;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import n.ThreadFactoryC1140c;
import q2.s;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static q f3445e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3449d;

    public q(int i6, InterfaceC1432j interfaceC1432j, O4.a aVar, InterfaceC0146g interfaceC0146g) {
        this.f3447b = interfaceC0146g;
        this.f3446a = i6;
        this.f3448c = aVar;
        this.f3449d = interfaceC1432j;
    }

    public static synchronized q a(Context context) {
        try {
            if (f3445e == null) {
                f3445e = new q(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC1140c("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3445e;
    }

    public final synchronized s b(n nVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(nVar.toString()));
            }
            if (!((m) this.f3449d).d(nVar)) {
                m mVar = new m(this);
                this.f3449d = mVar;
                mVar.d(nVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return nVar.f3442b.f12351a;
    }

    public q(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f3449d = new m(this);
        this.f3446a = 1;
        this.f3448c = scheduledExecutorService;
        this.f3447b = context.getApplicationContext();
    }
}
