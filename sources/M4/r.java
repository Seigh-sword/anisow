package M4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1915b = AtomicIntegerFieldUpdater.newUpdater(r.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1916a;

    public r(Throwable th, boolean z5) {
        this.f1916a = th;
        this._handled$volatile = z5 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1916a + ']';
    }
}
