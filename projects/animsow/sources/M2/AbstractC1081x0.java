package m2;

/* JADX INFO: renamed from: m2.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1081x0 extends L.i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11239x;

    public AbstractC1081x0(C1051k0 c1051k0) {
        super(c1051k0);
        ((C1051k0) this.f1668w).f11005a0++;
    }

    public final void s() {
        if (!this.f11239x) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (this.f11239x) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (u()) {
            return;
        }
        ((C1051k0) this.f1668w).f11007c0.incrementAndGet();
        this.f11239x = true;
    }

    public abstract boolean u();
}
