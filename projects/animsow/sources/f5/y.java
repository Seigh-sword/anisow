package f5;

import d.AbstractC0628i;
import java.io.EOFException;
import java.nio.ByteBuffer;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class y implements i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final E f8497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0710g f8498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8499y;

    public y(E e6) {
        AbstractC1305a.o(e6, "source");
        this.f8497w = e6;
        this.f8498x = new C0710g();
    }

    @Override // f5.i
    public final int A() {
        y(4L);
        return this.f8498x.A();
    }

    @Override // f5.i
    public final C0710g D() {
        return this.f8498x;
    }

    @Override // f5.i
    public final boolean E() {
        if (!(!this.f8499y)) {
            throw new IllegalStateException("closed".toString());
        }
        C0710g c0710g = this.f8498x;
        return c0710g.E() && this.f8497w.G(c0710g, 8192L) == -1;
    }

    @Override // f5.E
    public final long G(C0710g c0710g, long j6) {
        AbstractC1305a.o(c0710g, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6).toString());
        }
        if (!(!this.f8499y)) {
            throw new IllegalStateException("closed".toString());
        }
        C0710g c0710g2 = this.f8498x;
        if (c0710g2.f8461x == 0 && this.f8497w.G(c0710g2, 8192L) == -1) {
            return -1L;
        }
        return c0710g2.G(c0710g, Math.min(j6, c0710g2.f8461x));
    }

    @Override // f5.i
    public final long H() {
        C0710g c0710g;
        byte bU;
        y(1L);
        int i6 = 0;
        while (true) {
            int i7 = i6 + 1;
            boolean zK = k(i7);
            c0710g = this.f8498x;
            if (!zK) {
                break;
            }
            bU = c0710g.u(i6);
            if ((bU < 48 || bU > 57) && ((bU < 97 || bU > 102) && (bU < 65 || bU > 70))) {
                break;
            }
            i6 = i7;
        }
        if (i6 == 0) {
            AbstractC1305a.p(16);
            AbstractC1305a.p(16);
            String string = Integer.toString(bU, 16);
            AbstractC1305a.n(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return c0710g.H();
    }

    @Override // f5.i
    public final C0708e I() {
        return new C0708e(this, 1);
    }

    @Override // f5.i
    public final void a(long j6) {
        if (!(!this.f8499y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j6 > 0) {
            C0710g c0710g = this.f8498x;
            if (c0710g.f8461x == 0 && this.f8497w.G(c0710g, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j6, c0710g.f8461x);
            c0710g.a(jMin);
            j6 -= jMin;
        }
    }

    public final long b(byte b6, long j6, long j7) {
        if (!(!this.f8499y)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (0 > j7) {
            throw new IllegalArgumentException(AbstractC0628i.g("fromIndex=0 toIndex=", j7).toString());
        }
        while (jMax < j7) {
            long J5 = this.f8498x.J(b6, jMax, j7);
            if (J5 != -1) {
                return J5;
            }
            C0710g c0710g = this.f8498x;
            long j8 = c0710g.f8461x;
            if (j8 >= j7 || this.f8497w.G(c0710g, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j8);
        }
        return -1L;
    }

    public final void c(byte[] bArr) throws EOFException {
        C0710g c0710g = this.f8498x;
        try {
            y(bArr.length);
            c0710g.P(bArr);
        } catch (EOFException e6) {
            int i6 = 0;
            while (true) {
                long j6 = c0710g.f8461x;
                if (j6 <= 0) {
                    throw e6;
                }
                int iN = c0710g.N(bArr, i6, (int) j6);
                if (iN == -1) {
                    throw new AssertionError();
                }
                i6 += iN;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f8499y) {
            return;
        }
        this.f8499y = true;
        this.f8497w.close();
        this.f8498x.k();
    }

    @Override // f5.E
    public final G d() {
        return this.f8497w.d();
    }

    public final short g() {
        y(2L);
        return this.f8498x.Q();
    }

    public final String h(long j6) {
        y(j6);
        C0710g c0710g = this.f8498x;
        c0710g.getClass();
        return c0710g.R(j6, K4.a.f1637a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8499y;
    }

    public final boolean k(long j6) {
        C0710g c0710g;
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6).toString());
        }
        if (!(!this.f8499y)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            c0710g = this.f8498x;
            if (c0710g.f8461x >= j6) {
                return true;
            }
        } while (this.f8497w.G(c0710g, 8192L) != -1);
        return false;
    }

    @Override // f5.i
    public final j m(long j6) {
        y(j6);
        return this.f8498x.m(j6);
    }

    @Override // f5.i
    public final long o() {
        y(8L);
        return this.f8498x.o();
    }

    @Override // f5.i
    public final String p(long j6) throws EOFException {
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("limit < 0: ", j6).toString());
        }
        long j7 = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : j6 + 1;
        long jB = b((byte) 10, 0L, j7);
        C0710g c0710g = this.f8498x;
        if (jB != -1) {
            return g5.a.a(c0710g, jB);
        }
        if (j7 < Long.MAX_VALUE && k(j7) && c0710g.u(j7 - 1) == 13 && k(1 + j7) && c0710g.u(j7) == 10) {
            return g5.a.a(c0710g, j7);
        }
        C0710g c0710g2 = new C0710g();
        c0710g.n(0L, Math.min(32, c0710g.f8461x), c0710g2);
        throw new EOFException("\\n not found: limit=" + Math.min(c0710g.f8461x, j6) + " content=" + c0710g2.m(c0710g2.f8461x).e() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1305a.o(byteBuffer, "sink");
        C0710g c0710g = this.f8498x;
        if (c0710g.f8461x == 0 && this.f8497w.G(c0710g, 8192L) == -1) {
            return -1;
        }
        return c0710g.read(byteBuffer);
    }

    @Override // f5.i
    public final byte readByte() {
        y(1L);
        return this.f8498x.readByte();
    }

    @Override // f5.i
    public final int readInt() {
        y(4L);
        return this.f8498x.readInt();
    }

    @Override // f5.i
    public final short readShort() {
        y(2L);
        return this.f8498x.readShort();
    }

    @Override // f5.i
    public final long s(C0710g c0710g) {
        C0710g c0710g2;
        long j6 = 0;
        while (true) {
            E e6 = this.f8497w;
            c0710g2 = this.f8498x;
            if (e6.G(c0710g2, 8192L) == -1) {
                break;
            }
            long jL = c0710g2.l();
            if (jL > 0) {
                j6 += jL;
                c0710g.q(c0710g2, jL);
            }
        }
        long j7 = c0710g2.f8461x;
        if (j7 <= 0) {
            return j6;
        }
        long j8 = j6 + j7;
        c0710g.q(c0710g2, j7);
        return j8;
    }

    public final String toString() {
        return "buffer(" + this.f8497w + ')';
    }

    @Override // f5.i
    public final int v(v vVar) throws EOFException {
        AbstractC1305a.o(vVar, "options");
        if (!(!this.f8499y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            C0710g c0710g = this.f8498x;
            int iB = g5.a.b(c0710g, vVar, true);
            if (iB != -2) {
                if (iB != -1) {
                    c0710g.a(vVar.f8490w[iB].d());
                    return iB;
                }
            } else if (this.f8497w.G(c0710g, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // f5.i
    public final String x() {
        return p(Long.MAX_VALUE);
    }

    @Override // f5.i
    public final void y(long j6) {
        if (!k(j6)) {
            throw new EOFException();
        }
    }
}
