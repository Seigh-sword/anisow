package S4;

import I0.o;
import M4.B;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f3326y;

    public j(Runnable runnable, long j6, o oVar) {
        super(j6, oVar);
        this.f3326y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3326y.run();
        } finally {
            this.f3325x.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3326y;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(B.d(runnable));
        sb.append(", ");
        sb.append(this.f3324w);
        sb.append(", ");
        sb.append(this.f3325x);
        sb.append(']');
        return sb.toString();
    }
}
