package a5;

import V4.r;
import d.AbstractC0628i;
import f5.C0710g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f5034A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5035B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ g f5036C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r f5037z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, r rVar) {
        super(gVar);
        this.f5036C = gVar;
        this.f5034A = -1L;
        this.f5035B = true;
        this.f5037z = rVar;
    }

    @Override // a5.a, f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6));
        }
        if (this.f5029x) {
            throw new IllegalStateException("closed");
        }
        if (!this.f5035B) {
            return -1L;
        }
        long j7 = this.f5034A;
        g gVar = this.f5036C;
        if (j7 == 0 || j7 == -1) {
            if (j7 != -1) {
                gVar.f5046c.x();
            }
            try {
                this.f5034A = gVar.f5046c.H();
                String strTrim = gVar.f5046c.x().trim();
                if (this.f5034A < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5034A + strTrim + "\"");
                }
                if (this.f5034A == 0) {
                    this.f5035B = false;
                    Z4.e.d(gVar.f5044a.f3955D, this.f5037z, gVar.j());
                    b();
                }
                if (!this.f5035B) {
                    return -1L;
                }
            } catch (NumberFormatException e6) {
                throw new ProtocolException(e6.getMessage());
            }
        }
        long jG = super.G(c0710g, Math.min(j6, this.f5034A));
        if (jG != -1) {
            this.f5034A -= jG;
            return jG;
        }
        gVar.f5045b.h();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        b();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5029x) {
            return;
        }
        if (this.f5035B) {
            if (!W4.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f5036C.f5045b.h();
                b();
            }
        }
        this.f5029x = true;
    }
}
