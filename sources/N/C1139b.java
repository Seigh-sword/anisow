package n;

import d2.AbstractC0651b;

/* JADX INFO: renamed from: n.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1139b extends AbstractC0651b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C1139b f11674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ExecutorC1138a f11675j = new ExecutorC1138a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1142e f11676h = new C1142e();

    public static C1139b I() {
        if (f11674i != null) {
            return f11674i;
        }
        synchronized (C1139b.class) {
            try {
                if (f11674i == null) {
                    f11674i = new C1139b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11674i;
    }

    public final void H(Runnable runnable) {
        this.f11676h.I(runnable);
    }

    public final void J(Runnable runnable) {
        this.f11676h.K(runnable);
    }
}
