package W1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import l1.C0924C;

/* JADX INFO: loaded from: classes.dex */
public final class T extends K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217k f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2.j f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I0.o f4275d;

    public T(C0217k c0217k, q2.j jVar, I0.o oVar) {
        super(2);
        this.f4274c = jVar;
        this.f4273b = c0217k;
        this.f4275d = oVar;
        if (c0217k.f4321c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // W1.V
    public final void a(Status status) {
        this.f4275d.getClass();
        this.f4274c.b(status.f6437y != null ? new V1.k(status) : new V1.e(status));
    }

    @Override // W1.V
    public final void b(RuntimeException runtimeException) {
        this.f4274c.b(runtimeException);
    }

    @Override // W1.V
    public final void c(E e6) throws DeadObjectException {
        q2.j jVar = this.f4274c;
        try {
            this.f4273b.b(e6.f4229d, jVar);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            a(V.e(e8));
        } catch (RuntimeException e9) {
            jVar.b(e9);
        }
    }

    @Override // W1.V
    public final void d(C0924C c0924c, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Map map = c0924c.f9843b;
        q2.j jVar = this.f4274c;
        map.put(jVar, boolValueOf);
        q2.s sVar = jVar.f12351a;
        C0219m c0219m = new C0219m(c0924c, jVar);
        sVar.getClass();
        sVar.f12375b.k(new q2.p(q2.k.f12352a, c0219m));
        sVar.p();
    }

    @Override // W1.K
    public final boolean f(E e6) {
        return this.f4273b.f4321c;
    }

    @Override // W1.K
    public final U1.d[] g(E e6) {
        return (U1.d[]) this.f4273b.f4320b;
    }
}
