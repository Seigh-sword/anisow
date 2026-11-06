package o0;

import java.util.concurrent.CancellationException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends CancellationException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1 f12067w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(w1 w1Var) {
        super("Cancelled isolated runner");
        AbstractC1305a.o(w1Var, "runner");
        this.f12067w = w1Var;
    }
}
