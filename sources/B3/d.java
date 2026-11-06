package B3;

import J.m;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import q2.s;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D3.c f94a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f95b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D3.c f96c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f97d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f98e;

    public d(Context context, String str, Set set, D3.c cVar, Executor executor) {
        this.f94a = new Y2.c(context, str);
        this.f97d = set;
        this.f98e = executor;
        this.f96c = cVar;
        this.f95b = context;
    }

    public final s a() {
        if (!m.a(this.f95b)) {
            return f2.h.l("");
        }
        return f2.h.f(this.f98e, new c(this, 0));
    }

    public final void b() {
        if (this.f97d.size() <= 0) {
            f2.h.l(null);
        } else if (!m.a(this.f95b)) {
            f2.h.l(null);
        } else {
            f2.h.f(this.f98e, new c(this, 1));
        }
    }
}
