package N4;

import M4.C0063h;
import M4.C0078x;
import M4.G;
import M4.J;
import M4.b0;
import M4.m0;
import R4.p;
import S4.e;
import android.os.Handler;
import android.os.Looper;
import d.AbstractC0628i;
import java.util.concurrent.CancellationException;
import m2.RunnableC1028c1;
import o0.k1;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m0 implements G {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f2281A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f2282B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f2283y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f2284z;

    public c(Handler handler) {
        this(handler, null, false);
    }

    @Override // M4.AbstractC0077w
    public final void J(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        if (this.f2283y.post(runnable)) {
            return;
        }
        M(interfaceC1432j, runnable);
    }

    @Override // M4.AbstractC0077w
    public final boolean L() {
        return (this.f2281A && AbstractC1305a.c(Looper.myLooper(), this.f2283y.getLooper())) ? false : true;
    }

    public final void M(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        b0 b0Var = (b0) interfaceC1432j.n(C0078x.f1930x);
        if (b0Var != null) {
            b0Var.b(cancellationException);
        }
        J.f1852b.J(interfaceC1432j, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f2283y == this.f2283y && cVar.f2281A == this.f2281A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2283y) ^ (this.f2281A ? 1231 : 1237);
    }

    @Override // M4.AbstractC0077w
    public final String toString() {
        c cVar;
        String str;
        e eVar = J.f1851a;
        m0 m0Var = p.f3037a;
        if (this == m0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = ((c) m0Var).f2282B;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f2284z;
        if (string == null) {
            string = this.f2283y.toString();
        }
        return this.f2281A ? AbstractC0628i.i(string, ".immediate") : string;
    }

    @Override // M4.G
    public final void u(long j6, C0063h c0063h) {
        RunnableC1028c1 runnableC1028c1 = new RunnableC1028c1(c0063h, this, 13);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f2283y.postDelayed(runnableC1028c1, j6)) {
            c0063h.x(new k1(this, 3, runnableC1028c1));
        } else {
            M(c0063h.f1889A, runnableC1028c1);
        }
    }

    public c(Handler handler, String str, boolean z5) {
        this.f2283y = handler;
        this.f2284z = str;
        this.f2281A = z5;
        this.f2282B = z5 ? this : new c(handler, str, true);
    }
}
