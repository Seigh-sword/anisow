package J;

import M4.C0063h;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1427e f1163w;

    public f(C0063h c0063h) {
        super(false);
        this.f1163w = c0063h;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f1163w.o(S3.a.m(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f1163w.o(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
