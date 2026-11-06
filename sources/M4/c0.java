package M4;

import java.util.concurrent.CancellationException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends CancellationException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient b0 f1879w;

    public c0(String str, Throwable th, b0 b0Var) {
        super(str);
        this.f1879w = b0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!AbstractC1305a.c(c0Var.getMessage(), getMessage()) || !AbstractC1305a.c(c0Var.f1879w, this.f1879w) || !AbstractC1305a.c(c0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC1305a.l(message);
        int iHashCode = (this.f1879w.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1879w;
    }
}
