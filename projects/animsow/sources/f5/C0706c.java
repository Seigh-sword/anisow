package f5;

import d.AbstractC0628i;
import java.io.IOException;
import java.io.InputStream;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0706c implements E {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8445w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f8446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f8447y;

    public C0706c(D d6, C0706c c0706c) {
        this.f8446x = d6;
        this.f8447y = c0706c;
    }

    @Override // f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        int i6 = this.f8445w;
        Object obj = this.f8446x;
        Object obj2 = this.f8447y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(c0710g, "sink");
                C0707d c0707d = (C0707d) obj;
                E e6 = (E) obj2;
                c0707d.h();
                try {
                    long jG = e6.G(c0710g, j6);
                    if (c0707d.i()) {
                        throw c0707d.j(null);
                    }
                    return jG;
                } catch (IOException e7) {
                    if (c0707d.i()) {
                        throw c0707d.j(e7);
                    }
                    throw e7;
                } finally {
                    c0707d.i();
                }
            default:
                AbstractC1305a.o(c0710g, "sink");
                if (j6 == 0) {
                    return 0L;
                }
                if (j6 < 0) {
                    throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6).toString());
                }
                try {
                    ((G) obj2).f();
                    z zVarT = c0710g.T(1);
                    int i7 = ((InputStream) obj).read(zVarT.f8500a, zVarT.f8502c, (int) Math.min(j6, 8192 - zVarT.f8502c));
                    if (i7 == -1) {
                        if (zVarT.f8501b == zVarT.f8502c) {
                            c0710g.f8460w = zVarT.a();
                            A.a(zVarT);
                        }
                        return -1L;
                    }
                    zVarT.f8502c += i7;
                    long j7 = i7;
                    c0710g.f8461x += j7;
                    return j7;
                } catch (AssertionError e8) {
                    if (f2.h.u(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i6 = this.f8445w;
        Object obj = this.f8446x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0707d c0707d = (C0707d) obj;
                E e6 = (E) this.f8447y;
                c0707d.h();
                try {
                    e6.close();
                    if (c0707d.i()) {
                        throw c0707d.j(null);
                    }
                    return;
                } catch (IOException e7) {
                    if (!c0707d.i()) {
                        throw e7;
                    }
                    throw c0707d.j(e7);
                } finally {
                    c0707d.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // f5.E
    public final G d() {
        switch (this.f8445w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (C0707d) this.f8446x;
            default:
                return (G) this.f8447y;
        }
    }

    public final String toString() {
        switch (this.f8445w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "AsyncTimeout.source(" + ((E) this.f8447y) + ')';
            default:
                return "source(" + ((InputStream) this.f8446x) + ')';
        }
    }

    public C0706c(InputStream inputStream, G g4) {
        this.f8446x = inputStream;
        this.f8447y = g4;
    }
}
