package m2;

import X1.C0244l;
import X1.C0248p;
import X1.C0249q;
import android.content.Context;
import android.os.SystemClock;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import v0.C1401j;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static M f10692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Duration f10693e = Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1051k0 f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.c f10695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f10696c = new AtomicLong(-1);

    public M(Context context, C1051k0 c1051k0) {
        this.f10695b = new Z1.c(context, Z1.c.f4955i, new C0249q("measurement:api"), V1.f.f3708b);
        this.f10694a = c1051k0;
    }

    public final synchronized void a(int i6, int i7, long j6, long j7) {
        this.f10694a.f10988J.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f10696c.get() != -1 && jElapsedRealtime - this.f10696c.get() <= f10693e.toMillis()) {
            return;
        }
        q2.s sVarB = this.f10695b.b(new C0248p(0, Arrays.asList(new C0244l(36301, i6, 0, j6, j7, null, null, 0, i7))));
        C1401j c1401j = new C1401j(this, jElapsedRealtime);
        sVarB.getClass();
        sVarB.a(q2.k.f12352a, c1401j);
    }
}
