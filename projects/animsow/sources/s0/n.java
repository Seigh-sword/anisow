package S0;

import androidx.work.impl.WorkDatabase;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public final class n implements I0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0803c f3096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q0.a f3097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R0.k f3098c;

    static {
        I0.o.y("WMFgUpdater");
    }

    public n(WorkDatabase workDatabase, Q0.a aVar, C0803c c0803c) {
        this.f3097b = aVar;
        this.f3096a = c0803c;
        this.f3098c = workDatabase.n();
    }
}
