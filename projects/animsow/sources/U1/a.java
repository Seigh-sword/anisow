package U1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3572w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedBlockingQueue f3573x = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) throws TimeoutException {
        AbstractC1332d.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f3572w) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f3572w = true;
        IBinder iBinder = (IBinder) this.f3573x.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3573x.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
