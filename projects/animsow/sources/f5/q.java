package f5;

import d.AbstractC0628i;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class q implements E {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f8480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Inflater f8481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8482y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8483z;

    public q(y yVar, Inflater inflater) {
        this.f8480w = yVar;
        this.f8481x = inflater;
    }

    @Override // f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        long j7;
        AbstractC1305a.o(c0710g, "sink");
        while (j6 >= 0) {
            if (!(!this.f8483z)) {
                throw new IllegalStateException("closed".toString());
            }
            i iVar = this.f8480w;
            Inflater inflater = this.f8481x;
            if (j6 == 0) {
                j7 = 0;
            } else {
                try {
                    z zVarT = c0710g.T(1);
                    int iMin = (int) Math.min(j6, 8192 - zVarT.f8502c);
                    if (inflater.needsInput() && !iVar.E()) {
                        z zVar = iVar.D().f8460w;
                        AbstractC1305a.l(zVar);
                        int i6 = zVar.f8502c;
                        int i7 = zVar.f8501b;
                        int i8 = i6 - i7;
                        this.f8482y = i8;
                        inflater.setInput(zVar.f8500a, i7, i8);
                    }
                    int iInflate = inflater.inflate(zVarT.f8500a, zVarT.f8502c, iMin);
                    int i9 = this.f8482y;
                    if (i9 != 0) {
                        int remaining = i9 - inflater.getRemaining();
                        this.f8482y -= remaining;
                        iVar.a(remaining);
                    }
                    if (iInflate > 0) {
                        zVarT.f8502c += iInflate;
                        j7 = iInflate;
                        c0710g.f8461x += j7;
                    } else {
                        if (zVarT.f8501b == zVarT.f8502c) {
                            c0710g.f8460w = zVarT.a();
                            A.a(zVarT);
                        }
                        j7 = 0;
                    }
                } catch (DataFormatException e6) {
                    throw new IOException(e6);
                }
            }
            if (j7 > 0) {
                return j7;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (iVar.E()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f8483z) {
            return;
        }
        this.f8481x.end();
        this.f8483z = true;
        this.f8480w.close();
    }

    @Override // f5.E
    public final G d() {
        return this.f8480w.d();
    }
}
