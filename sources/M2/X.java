package m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class X extends AbstractC1016A {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10797x;

    public X(C1051k0 c1051k0) {
        super(c1051k0);
        ((C1051k0) this.f1668w).f11005a0++;
    }

    public abstract boolean A();

    public final void y() {
        if (!this.f10797x) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void z() {
        if (this.f10797x) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (A()) {
            return;
        }
        ((C1051k0) this.f1668w).f11007c0.incrementAndGet();
        this.f10797x = true;
    }
}
