package v0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: v0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1399h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ExecutorC1398g f13129h = new ExecutorC1398g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f13130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1402k f13131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f13132c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f13134e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13136g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f13133d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f13135f = Collections.emptyList();

    public C1399h(C1390c c1390c, C1402k c1402k) {
        this.f13130a = c1390c;
        this.f13131b = c1402k;
        Executor executor = (Executor) c1402k.f13146b;
        this.f13132c = executor == null ? f13129h : executor;
    }

    public final void a(Runnable runnable) {
        Iterator it = this.f13133d.iterator();
        while (it.hasNext()) {
            ((C1384M) it.next()).f13056a.getClass();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
