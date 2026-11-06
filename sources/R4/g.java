package R4;

import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends RuntimeException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient InterfaceC1432j f3013w;

    public g(InterfaceC1432j interfaceC1432j) {
        this.f3013w = interfaceC1432j;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3013w.toString();
    }
}
