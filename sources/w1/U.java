package W1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import d.AbstractC0628i;
import l1.C0924C;

/* JADX INFO: loaded from: classes.dex */
public final class U extends K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.j f4276b;

    public U(q2.j jVar) {
        super(4);
        this.f4276b = jVar;
    }

    @Override // W1.V
    public final void a(Status status) {
        this.f4276b.b(new V1.e(status));
    }

    @Override // W1.V
    public final void b(RuntimeException runtimeException) {
        this.f4276b.b(runtimeException);
    }

    @Override // W1.V
    public final void c(E e6) throws DeadObjectException {
        try {
            h(e6);
        } catch (DeadObjectException e7) {
            a(V.e(e7));
            throw e7;
        } catch (RemoteException e8) {
            a(V.e(e8));
        } catch (RuntimeException e9) {
            this.f4276b.b(e9);
        }
    }

    @Override // W1.K
    public final boolean f(E e6) {
        AbstractC0628i.p(e6.f4233h.get(null));
        return false;
    }

    @Override // W1.K
    public final U1.d[] g(E e6) {
        AbstractC0628i.p(e6.f4233h.get(null));
        return null;
    }

    public final void h(E e6) {
        AbstractC0628i.p(e6.f4233h.remove(null));
        this.f4276b.c(Boolean.FALSE);
    }

    @Override // W1.V
    public final /* bridge */ /* synthetic */ void d(C0924C c0924c, boolean z5) {
    }
}
