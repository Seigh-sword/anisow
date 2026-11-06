package Z1;

import V1.g;
import W1.C0211e;
import W1.C0217k;
import W1.M;
import W1.O;
import W1.T;
import X1.C0245m;
import X1.C0248p;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.X;
import h2.AbstractC0771c;
import java.util.concurrent.Executor;
import q2.j;
import q2.s;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final V1.d f4955i = new V1.d("ClientTelemetry.API", new b(0), new V1.c());

    public final s b(C0248p c0248p) {
        M m5;
        C0217k c0217k = new C0217k();
        U1.d[] dVarArr = {AbstractC0771c.f8978a};
        c0217k.f4320b = dVarArr;
        c0217k.f4321c = false;
        c0217k.f4323e = new K1.b(1, c0248p);
        C0217k c0217k2 = new C0217k(c0217k, dVarArr, false, c0217k.f4322d);
        j jVar = new j();
        C0211e c0211e = this.f3717h;
        c0211e.getClass();
        int i6 = c0217k2.f4322d;
        final X x5 = c0211e.f4312I;
        s sVar = jVar.f12351a;
        if (i6 != 0) {
            if (c0211e.a()) {
                C0245m.b().getClass();
                m5 = new M(c0211e, i6, this.f3714e, System.currentTimeMillis(), SystemClock.elapsedRealtime());
            } else {
                m5 = null;
            }
            if (m5 != null) {
                x5.getClass();
                sVar.h(new Executor() { // from class: W1.C
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        x5.post(runnable);
                    }
                }, m5);
            }
        }
        x5.sendMessage(x5.obtainMessage(4, new O(new T(c0217k2, jVar, this.f3716g), c0211e.f4308E.get(), this)));
        return sVar;
    }
}
