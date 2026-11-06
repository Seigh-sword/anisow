package S0;

import android.content.Context;
import androidx.work.ListenableWorker;
import i.C0803c;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f3089C = I0.o.y("WorkForegroundRunnable");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final I0.i f3090A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0803c f3091B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final T0.i f3092w = new T0.i();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f3093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final R0.i f3094y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ListenableWorker f3095z;

    public m(Context context, R0.i iVar, ListenableWorker listenableWorker, n nVar, C0803c c0803c) {
        this.f3093x = context;
        this.f3094y = iVar;
        this.f3095z = listenableWorker;
        this.f3090A = nVar;
        this.f3091B = c0803c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3094y.f2916q || J.b.a()) {
            this.f3092w.j(null);
            return;
        }
        T0.i iVar = new T0.i();
        C0803c c0803c = this.f3091B;
        ((Executor) c0803c.f9279z).execute(new l(this, iVar, 0));
        iVar.a(new l(this, iVar, 1), (Executor) c0803c.f9279z);
    }
}
