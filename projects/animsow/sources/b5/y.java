package b5;

import f5.C0707d;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class y extends C0707d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f6073m;

    public y(z zVar) {
        this.f6073m = zVar;
    }

    @Override // f5.C0707d
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // f5.C0707d
    public final void k() {
        this.f6073m.e(EnumC0346b.CANCEL);
        s sVar = this.f6073m.f6077d;
        synchronized (sVar) {
            try {
                long j6 = sVar.f6030J;
                long j7 = sVar.f6029I;
                if (j6 < j7) {
                    return;
                }
                sVar.f6029I = j7 + 1;
                sVar.f6031K = System.nanoTime() + 1000000000;
                try {
                    sVar.f6024D.execute(new j(sVar, "OkHttp %s ping", new Object[]{sVar.f6043z}, 0));
                } catch (RejectedExecutionException unused) {
                }
            } finally {
            }
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
