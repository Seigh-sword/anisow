package a5;

import d.AbstractC0628i;
import f5.C0710g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ g f5038A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5039z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, long j6) {
        super(gVar);
        this.f5038A = gVar;
        this.f5039z = j6;
        if (j6 == 0) {
            b();
        }
    }

    @Override // a5.a, f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6));
        }
        if (this.f5029x) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f5039z;
        if (j7 == 0) {
            return -1L;
        }
        long jG = super.G(c0710g, Math.min(j7, j6));
        if (jG == -1) {
            this.f5038A.f5045b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j8 = this.f5039z - jG;
        this.f5039z = j8;
        if (j8 == 0) {
            b();
        }
        return jG;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5029x) {
            return;
        }
        if (this.f5039z != 0) {
            if (!W4.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f5038A.f5045b.h();
                b();
            }
        }
        this.f5029x = true;
    }
}
