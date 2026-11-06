package T3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g extends X3.b {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final f f3462K = new f();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Q3.t f3463L = new Q3.t("closed");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f3464H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f3465I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Q3.p f3466J;

    public g() {
        super(f3462K);
        this.f3464H = new ArrayList();
        this.f3466J = Q3.r.f2818w;
    }

    @Override // X3.b
    public final X3.b J() {
        U(Q3.r.f2818w);
        return this;
    }

    @Override // X3.b
    public final void M(double d6) {
        if (this.f4691A || !(Double.isNaN(d6) || Double.isInfinite(d6))) {
            U(new Q3.t(Double.valueOf(d6)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d6);
        }
    }

    @Override // X3.b
    public final void N(long j6) {
        U(new Q3.t(Long.valueOf(j6)));
    }

    @Override // X3.b
    public final void O(Boolean bool) {
        if (bool == null) {
            U(Q3.r.f2818w);
        } else {
            U(new Q3.t(bool));
        }
    }

    @Override // X3.b
    public final void P(Number number) {
        if (number == null) {
            U(Q3.r.f2818w);
            return;
        }
        if (!this.f4691A) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        U(new Q3.t(number));
    }

    @Override // X3.b
    public final void Q(String str) {
        if (str == null) {
            U(Q3.r.f2818w);
        } else {
            U(new Q3.t(str));
        }
    }

    @Override // X3.b
    public final void R(boolean z5) {
        U(new Q3.t(Boolean.valueOf(z5)));
    }

    public final Q3.p T() {
        return (Q3.p) this.f3464H.get(r0.size() - 1);
    }

    public final void U(Q3.p pVar) {
        if (this.f3465I != null) {
            if (!(pVar instanceof Q3.r) || this.f4694D) {
                Q3.s sVar = (Q3.s) T();
                sVar.f2819w.put(this.f3465I, pVar);
            }
            this.f3465I = null;
            return;
        }
        if (this.f3464H.isEmpty()) {
            this.f3466J = pVar;
            return;
        }
        Q3.p pVarT = T();
        if (!(pVarT instanceof Q3.o)) {
            throw new IllegalStateException();
        }
        ((Q3.o) pVarT).f2817w.add(pVar);
    }

    @Override // X3.b
    public final void c() {
        Q3.o oVar = new Q3.o();
        U(oVar);
        this.f3464H.add(oVar);
    }

    @Override // X3.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f3464H;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f3463L);
    }

    @Override // X3.b
    public final void g() {
        Q3.s sVar = new Q3.s();
        U(sVar);
        this.f3464H.add(sVar);
    }

    @Override // X3.b
    public final void k() {
        ArrayList arrayList = this.f3464H;
        if (arrayList.isEmpty() || this.f3465I != null) {
            throw new IllegalStateException();
        }
        if (!(T() instanceof Q3.o)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // X3.b
    public final void l() {
        ArrayList arrayList = this.f3464H;
        if (arrayList.isEmpty() || this.f3465I != null) {
            throw new IllegalStateException();
        }
        if (!(T() instanceof Q3.s)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // X3.b
    public final void n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f3464H.isEmpty() || this.f3465I != null) {
            throw new IllegalStateException();
        }
        if (!(T() instanceof Q3.s)) {
            throw new IllegalStateException();
        }
        this.f3465I = str;
    }

    @Override // X3.b, java.io.Flushable
    public final void flush() {
    }
}
