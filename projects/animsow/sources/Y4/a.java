package Y4;

import J3.x;
import f5.C;
import f5.C0710g;
import f5.G;
import java.io.IOException;
import java.net.ProtocolException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class a implements C {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4840A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ x f4841B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C f4842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f4844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4845z;

    public a(x xVar, C c6, long j6) {
        this.f4841B = xVar;
        AbstractC1305a.o(c6, "delegate");
        this.f4842w = c6;
        this.f4844y = j6;
    }

    public final void b() {
        this.f4842w.close();
    }

    public final IOException c(IOException iOException) {
        if (this.f4843x) {
            return iOException;
        }
        this.f4843x = true;
        return this.f4841B.a(false, true, iOException);
    }

    @Override // f5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4840A) {
            return;
        }
        this.f4840A = true;
        long j6 = this.f4844y;
        if (j6 != -1 && this.f4845z != j6) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            b();
            c(null);
        } catch (IOException e6) {
            throw c(e6);
        }
    }

    @Override // f5.C
    public final G d() {
        return this.f4842w.d();
    }

    @Override // f5.C, java.io.Flushable
    public final void flush() throws IOException {
        try {
            g();
        } catch (IOException e6) {
            throw c(e6);
        }
    }

    public final void g() {
        this.f4842w.flush();
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return a.class.getSimpleName() + '(' + this.f4842w + ')';
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) throws IOException {
        if (this.f4840A) {
            throw new IllegalStateException("closed");
        }
        long j7 = this.f4844y;
        if (j7 != -1 && this.f4845z + j6 > j7) {
            throw new ProtocolException("expected " + j7 + " bytes but received " + (this.f4845z + j6));
        }
        try {
            AbstractC1305a.o(c0710g, "source");
            this.f4842w.q(c0710g, j6);
            this.f4845z += j6;
        } catch (IOException e6) {
            throw c(e6);
        }
    }
}
