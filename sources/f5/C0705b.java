package f5;

import d2.AbstractC0651b;
import java.io.IOException;
import java.io.OutputStream;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0705b implements C {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8442w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f8443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f8444y;

    public C0705b(D d6, C0705b c0705b) {
        this.f8443x = d6;
        this.f8444y = c0705b;
    }

    @Override // f5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i6 = this.f8442w;
        Object obj = this.f8443x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0707d c0707d = (C0707d) obj;
                C c6 = (C) this.f8444y;
                c0707d.h();
                try {
                    c6.close();
                    if (c0707d.i()) {
                        throw c0707d.j(null);
                    }
                    return;
                } catch (IOException e6) {
                    if (!c0707d.i()) {
                        throw e6;
                    }
                    throw c0707d.j(e6);
                } finally {
                    c0707d.i();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // f5.C
    public final G d() {
        switch (this.f8442w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (C0707d) this.f8443x;
            default:
                return (G) this.f8444y;
        }
    }

    @Override // f5.C, java.io.Flushable
    public final void flush() throws IOException {
        int i6 = this.f8442w;
        Object obj = this.f8443x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0707d c0707d = (C0707d) obj;
                C c6 = (C) this.f8444y;
                c0707d.h();
                try {
                    c6.flush();
                    if (c0707d.i()) {
                        throw c0707d.j(null);
                    }
                    return;
                } catch (IOException e6) {
                    if (!c0707d.i()) {
                        throw e6;
                    }
                    throw c0707d.j(e6);
                } finally {
                    c0707d.i();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) throws IOException {
        int i6 = this.f8442w;
        Object obj = this.f8443x;
        Object obj2 = this.f8444y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(c0710g, "source");
                AbstractC0651b.g(c0710g.f8461x, 0L, j6);
                while (j6 > 0) {
                    z zVar = c0710g.f8460w;
                    AbstractC1305a.l(zVar);
                    long j7 = 0;
                    while (true) {
                        if (j7 < 65536) {
                            j7 += (long) (zVar.f8502c - zVar.f8501b);
                            if (j7 >= j6) {
                                j7 = j6;
                            } else {
                                zVar = zVar.f8505f;
                                AbstractC1305a.l(zVar);
                            }
                        }
                    }
                    C0707d c0707d = (C0707d) obj;
                    C c6 = (C) obj2;
                    c0707d.h();
                    try {
                        c6.q(c0710g, j7);
                        if (c0707d.i()) {
                            throw c0707d.j(null);
                        }
                        j6 -= j7;
                    } catch (IOException e6) {
                        if (!c0707d.i()) {
                            throw e6;
                        }
                        throw c0707d.j(e6);
                    } finally {
                        c0707d.i();
                    }
                }
                return;
            default:
                AbstractC1305a.o(c0710g, "source");
                AbstractC0651b.g(c0710g.f8461x, 0L, j6);
                while (j6 > 0) {
                    ((G) obj2).f();
                    z zVar2 = c0710g.f8460w;
                    AbstractC1305a.l(zVar2);
                    int iMin = (int) Math.min(j6, zVar2.f8502c - zVar2.f8501b);
                    ((OutputStream) obj).write(zVar2.f8500a, zVar2.f8501b, iMin);
                    int i7 = zVar2.f8501b + iMin;
                    zVar2.f8501b = i7;
                    long j8 = iMin;
                    j6 -= j8;
                    c0710g.f8461x -= j8;
                    if (i7 == zVar2.f8502c) {
                        c0710g.f8460w = zVar2.a();
                        A.a(zVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f8442w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "AsyncTimeout.sink(" + ((C) this.f8444y) + ')';
            default:
                return "sink(" + ((OutputStream) this.f8443x) + ')';
        }
    }

    public C0705b(OutputStream outputStream, D d6) {
        this.f8443x = outputStream;
        this.f8444y = d6;
    }
}
