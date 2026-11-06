package b5;

import f5.C0710g;
import f5.InterfaceC0711h;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import v0.C1409s;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Logger f5935C = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5936A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final e f5937B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC0711h f5938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f5939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0710g f5940y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5941z;

    public A(InterfaceC0711h interfaceC0711h, boolean z5) {
        this.f5938w = interfaceC0711h;
        this.f5939x = z5;
        C0710g c0710g = new C0710g();
        this.f5940y = c0710g;
        this.f5937B = new e(c0710g);
        this.f5941z = 16384;
    }

    public final synchronized void b(C1409s c1409s) {
        try {
            if (this.f5936A) {
                throw new IOException("closed");
            }
            int i6 = this.f5941z;
            int i7 = c1409s.f13228a;
            if ((i7 & 32) != 0) {
                i6 = c1409s.f13229b[5];
            }
            this.f5941z = i6;
            if (((i7 & 2) != 0 ? c1409s.f13229b[1] : -1) != -1) {
                e eVar = this.f5937B;
                int i8 = (i7 & 2) != 0 ? c1409s.f13229b[1] : -1;
                eVar.getClass();
                int iMin = Math.min(i8, 16384);
                int i9 = eVar.f5976d;
                if (i9 != iMin) {
                    if (iMin < i9) {
                        eVar.f5974b = Math.min(eVar.f5974b, iMin);
                    }
                    eVar.f5975c = true;
                    eVar.f5976d = iMin;
                    int i10 = eVar.f5980h;
                    if (iMin < i10) {
                        if (iMin == 0) {
                            Arrays.fill(eVar.f5977e, (Object) null);
                            eVar.f5978f = eVar.f5977e.length - 1;
                            eVar.f5979g = 0;
                            eVar.f5980h = 0;
                        } else {
                            eVar.a(i10 - iMin);
                        }
                    }
                }
            }
            g(0, 0, (byte) 4, (byte) 1);
            this.f5938w.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z5, int i6, C0710g c0710g, int i7) {
        if (this.f5936A) {
            throw new IOException("closed");
        }
        g(i6, i7, (byte) 0, z5 ? (byte) 1 : (byte) 0);
        if (i7 > 0) {
            this.f5938w.q(c0710g, i7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5936A = true;
        this.f5938w.close();
    }

    public final synchronized void flush() {
        if (this.f5936A) {
            throw new IOException("closed");
        }
        this.f5938w.flush();
    }

    public final void g(int i6, int i7, byte b6, byte b7) {
        Level level = Level.FINE;
        Logger logger = f5935C;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i6, i7, b6, b7));
        }
        int i8 = this.f5941z;
        if (i7 > i8) {
            g.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i8), Integer.valueOf(i7));
            throw null;
        }
        if ((Integer.MIN_VALUE & i6) != 0) {
            g.b("reserved bit set: %s", Integer.valueOf(i6));
            throw null;
        }
        InterfaceC0711h interfaceC0711h = this.f5938w;
        interfaceC0711h.F((i7 >>> 16) & 255);
        interfaceC0711h.F((i7 >>> 8) & 255);
        interfaceC0711h.F(i7 & 255);
        interfaceC0711h.F(b6 & 255);
        interfaceC0711h.F(b7 & 255);
        interfaceC0711h.w(i6 & Integer.MAX_VALUE);
    }

    public final synchronized void h(int i6, EnumC0346b enumC0346b, byte[] bArr) {
        try {
            if (this.f5936A) {
                throw new IOException("closed");
            }
            if (enumC0346b.f5955w == -1) {
                g.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            g(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f5938w.w(i6);
            this.f5938w.w(enumC0346b.f5955w);
            if (bArr.length > 0) {
                this.f5938w.e(bArr);
            }
            this.f5938w.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(int i6, int i7, boolean z5) {
        if (this.f5936A) {
            throw new IOException("closed");
        }
        g(0, 8, (byte) 6, z5 ? (byte) 1 : (byte) 0);
        this.f5938w.w(i6);
        this.f5938w.w(i7);
        this.f5938w.flush();
    }

    public final synchronized void l(int i6, EnumC0346b enumC0346b) {
        if (this.f5936A) {
            throw new IOException("closed");
        }
        if (enumC0346b.f5955w == -1) {
            throw new IllegalArgumentException();
        }
        g(i6, 4, (byte) 3, (byte) 0);
        this.f5938w.w(enumC0346b.f5955w);
        this.f5938w.flush();
    }

    public final synchronized void n(int i6, long j6) {
        if (this.f5936A) {
            throw new IOException("closed");
        }
        if (j6 == 0 || j6 > 2147483647L) {
            g.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j6));
            throw null;
        }
        g(i6, 4, (byte) 8, (byte) 0);
        this.f5938w.w((int) j6);
        this.f5938w.flush();
    }

    public final void u(int i6, long j6) {
        while (j6 > 0) {
            int iMin = (int) Math.min(this.f5941z, j6);
            long j7 = iMin;
            j6 -= j7;
            g(i6, iMin, (byte) 9, j6 == 0 ? (byte) 4 : (byte) 0);
            this.f5938w.q(this.f5940y, j7);
        }
    }
}
