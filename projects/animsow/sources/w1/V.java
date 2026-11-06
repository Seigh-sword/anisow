package W1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import l1.C0924C;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4277a;

    public V(int i6) {
        this.f4277a = i6;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(E e6);

    public abstract void d(C0924C c0924c, boolean z5);
}
