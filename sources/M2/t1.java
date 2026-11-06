package m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 extends u1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11107y;

    public t1(x1 x1Var) {
        super(x1Var);
        this.f11112x.f11254N++;
    }

    public final void v() {
        if (!this.f11107y) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.f11107y) {
            throw new IllegalStateException("Can't initialize twice");
        }
        x();
        this.f11112x.f11255O++;
        this.f11107y = true;
    }

    public abstract boolean x();
}
