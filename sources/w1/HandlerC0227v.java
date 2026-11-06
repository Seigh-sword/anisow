package W1;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: W1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0227v extends com.google.android.gms.internal.measurement.X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0227v(Object obj, Looper looper, int i6) {
        super(looper, 0);
        this.f4371a = i6;
        this.f4372b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f4371a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i6 = message.what;
                Object obj = this.f4372b;
                if (i6 != 1) {
                    if (i6 == 2) {
                        C0229x.g((C0229x) obj);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i6);
                    return;
                }
                C0229x c0229x = (C0229x) obj;
                Lock lock = c0229x.f4374b;
                lock.lock();
                try {
                    if (c0229x.h()) {
                        c0229x.j();
                        break;
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                int i7 = message.what;
                if (i7 != 1) {
                    if (i7 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i7);
                    return;
                }
                AbstractC0231z abstractC0231z = (AbstractC0231z) message.obj;
                A a6 = (A) this.f4372b;
                abstractC0231z.getClass();
                a6.f4211c.lock();
                try {
                    if (a6.f4221m == abstractC0231z.f4396a) {
                        abstractC0231z.a();
                        break;
                    }
                    return;
                } finally {
                    a6.f4211c.unlock();
                }
        }
    }
}
