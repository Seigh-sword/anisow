package R4;

import M4.AbstractC0077w;
import M4.B;
import M4.C0073s;
import M4.I;
import M4.Q;
import M4.u0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1313i;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends I implements x4.d, InterfaceC1427e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3014D = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC1427e f3015A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object f3016B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f3017C;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AbstractC0077w f3018z;

    public h(AbstractC0077w abstractC0077w, x4.c cVar) {
        super(-1);
        this.f3018z = abstractC0077w;
        this.f3015A = cVar;
        this.f3016B = a.f3003c;
        this.f3017C = a.e(cVar.i());
    }

    @Override // M4.I
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0073s) {
            ((C0073s) obj).f1918b.j(cancellationException);
        }
    }

    @Override // x4.d
    public final x4.d e() {
        InterfaceC1427e interfaceC1427e = this.f3015A;
        if (interfaceC1427e instanceof x4.d) {
            return (x4.d) interfaceC1427e;
        }
        return null;
    }

    @Override // v4.InterfaceC1427e
    public final InterfaceC1432j i() {
        return this.f3015A.i();
    }

    @Override // M4.I
    public final Object j() {
        Object obj = this.f3016B;
        this.f3016B = a.f3003c;
        return obj;
    }

    @Override // v4.InterfaceC1427e
    public final void o(Object obj) {
        InterfaceC1427e interfaceC1427e = this.f3015A;
        InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
        Throwable thA = AbstractC1313i.a(obj);
        Object rVar = thA == null ? obj : new M4.r(thA, false);
        AbstractC0077w abstractC0077w = this.f3018z;
        if (abstractC0077w.L()) {
            this.f3016B = rVar;
            this.f1850y = 0;
            abstractC0077w.J(interfaceC1432jI, this);
            return;
        }
        Q qA = u0.a();
        if (qA.Q()) {
            this.f3016B = rVar;
            this.f1850y = 0;
            qA.N(this);
            return;
        }
        qA.P(true);
        try {
            InterfaceC1432j interfaceC1432jI2 = interfaceC1427e.i();
            Object objF = a.f(interfaceC1432jI2, this.f3017C);
            try {
                interfaceC1427e.o(obj);
                while (qA.S()) {
                }
            } finally {
                a.b(interfaceC1432jI2, objF);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3018z + ", " + B.s(this.f3015A) + ']';
    }

    @Override // M4.I
    public final InterfaceC1427e c() {
        return this;
    }
}
