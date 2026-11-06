package f5;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class D extends C0707d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f8432m;

    public D(Socket socket) {
        AbstractC1305a.o(socket, "socket");
        this.f8432m = socket;
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
        Level level;
        StringBuilder sb;
        Logger logger;
        Throwable th;
        Socket socket = this.f8432m;
        try {
            socket.close();
        } catch (AssertionError e6) {
            if (!f2.h.u(e6)) {
                throw e6;
            }
            Logger logger2 = u.f8489a;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            th = e6;
            logger = logger2;
            sb.append(socket);
            logger.log(level, sb.toString(), th);
        } catch (Exception e7) {
            Logger logger3 = u.f8489a;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            th = e7;
            logger = logger3;
            sb.append(socket);
            logger.log(level, sb.toString(), th);
        }
    }
}
