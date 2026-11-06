package Y4;

import J3.x;
import f5.C0710g;
import f5.E;
import f5.n;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4846A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ x f4847B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f4848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4849y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4850z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, E e6, long j6) {
        super(e6);
        this.f4847B = xVar;
        this.f4848x = j6;
        if (j6 == 0) {
            b(null);
        }
    }

    @Override // f5.n, f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        if (this.f4846A) {
            throw new IllegalStateException("closed");
        }
        try {
            long jG = this.f8473w.G(c0710g, j6);
            if (jG == -1) {
                b(null);
                return -1L;
            }
            long j7 = this.f4849y + jG;
            long j8 = this.f4848x;
            if (j8 == -1 || j7 <= j8) {
                this.f4849y = j7;
                if (j7 == j8) {
                    b(null);
                }
                return jG;
            }
            throw new ProtocolException("expected " + j8 + " bytes but received " + j7);
        } catch (IOException e6) {
            throw b(e6);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f4850z) {
            return iOException;
        }
        this.f4850z = true;
        return this.f4847B.a(true, false, iOException);
    }

    @Override // f5.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4846A) {
            return;
        }
        this.f4846A = true;
        try {
            super.close();
            b(null);
        } catch (IOException e6) {
            throw b(e6);
        }
    }
}
