package O4;

import M4.InterfaceC0062g;
import j3.C0848A;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f2361a = new k(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2362b = S3.a.M("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2363c = S3.a.M("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0848A f2364d = new C0848A(2, "BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0848A f2365e = new C0848A(2, "SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0848A f2366f = new C0848A(2, "S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0848A f2367g = new C0848A(2, "RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0848A f2368h = new C0848A(2, "POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0848A f2369i = new C0848A(2, "DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0848A f2370j = new C0848A(2, "INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0848A f2371k = new C0848A(2, "INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0848A f2372l = new C0848A(2, "CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0848A f2373m = new C0848A(2, "SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0848A f2374n = new C0848A(2, "SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0848A f2375o = new C0848A(2, "FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0848A f2376p = new C0848A(2, "NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0848A f2377q = new C0848A(2, "CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0848A f2378r = new C0848A(2, "CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0848A f2379s = new C0848A(2, "NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0062g interfaceC0062g, Object obj, C4.l lVar) {
        C0848A c0848aQ = interfaceC0062g.q(obj, lVar);
        if (c0848aQ == null) {
            return false;
        }
        interfaceC0062g.r(c0848aQ);
        return true;
    }
}
