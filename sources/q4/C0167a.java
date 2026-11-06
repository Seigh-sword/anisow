package Q4;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Q4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0167a extends CancellationException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object f2829w;

    public C0167a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f2829w = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
