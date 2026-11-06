package e3;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.AbstractC1324g;
import t.C1318a;

/* JADX INFO: renamed from: e3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC0671h extends AbstractC1324g implements ScheduledFuture {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f8280E = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ScheduledFuture f8281D;

    public ScheduledFutureC0671h(InterfaceC0670g interfaceC0670g) {
        this.f8281D = interfaceC0670g.a(new K1.b(14, this));
    }

    @Override // t.AbstractC1324g
    public final void c() {
        ScheduledFuture scheduledFuture = this.f8281D;
        Object obj = this.f12665w;
        scheduledFuture.cancel((obj instanceof C1318a) && ((C1318a) obj).f12645a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f8281D.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f8281D.getDelay(timeUnit);
    }
}
