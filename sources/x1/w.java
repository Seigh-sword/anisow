package X1;

import W1.C0215i;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.X;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Handler.Callback {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final X f4652D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v f4654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f4655x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f4656y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f4657z = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile boolean f4649A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicInteger f4650B = new AtomicInteger(0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4651C = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f4653E = new Object();

    public w(Looper looper, C0215i c0215i) {
        this.f4654w = c0215i;
        this.f4652D = new X(looper, this, 0);
    }

    public final void a(V1.j jVar) {
        AbstractC1332d.m(jVar);
        synchronized (this.f4653E) {
            try {
                if (this.f4657z.contains(jVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(jVar) + " is already registered");
                } else {
                    this.f4657z.add(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = message.what;
        if (i6 != 1) {
            Log.wtf("GmsClientEvents", AbstractC0628i.f("Don't know how to handle message: ", i6), new Exception());
            return false;
        }
        V1.i iVar = (V1.i) message.obj;
        synchronized (this.f4653E) {
            try {
                if (this.f4649A && this.f4654w.a() && this.f4655x.contains(iVar)) {
                    iVar.D(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
