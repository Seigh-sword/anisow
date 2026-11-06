package f5;

import d.AbstractC0628i;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class p implements E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CRC32 f8475A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f8476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f8477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Inflater f8478y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q f8479z;

    public p(E e6) {
        AbstractC1305a.o(e6, "source");
        y yVar = new y(e6);
        this.f8477x = yVar;
        Inflater inflater = new Inflater(true);
        this.f8478y = inflater;
        this.f8479z = new q(yVar, inflater);
        this.f8475A = new CRC32();
    }

    public static void b(String str, int i6, int i7) throws IOException {
        if (i7 != i6) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i7), Integer.valueOf(i6)}, 3)));
        }
    }

    @Override // f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        y yVar;
        long j7;
        AbstractC1305a.o(c0710g, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6).toString());
        }
        if (j6 == 0) {
            return 0L;
        }
        byte b6 = this.f8476w;
        CRC32 crc32 = this.f8475A;
        y yVar2 = this.f8477x;
        if (b6 == 0) {
            yVar2.y(10L);
            C0710g c0710g2 = yVar2.f8498x;
            byte bU = c0710g2.u(3L);
            boolean z5 = ((bU >> 1) & 1) == 1;
            if (z5) {
                c(0L, 10L, yVar2.f8498x);
            }
            b("ID1ID2", 8075, yVar2.readShort());
            yVar2.a(8L);
            if (((bU >> 2) & 1) == 1) {
                yVar2.y(2L);
                if (z5) {
                    c(0L, 2L, yVar2.f8498x);
                }
                long jQ = c0710g2.Q() & 65535;
                yVar2.y(jQ);
                if (z5) {
                    c(0L, jQ, yVar2.f8498x);
                    j7 = jQ;
                } else {
                    j7 = jQ;
                }
                yVar2.a(j7);
            }
            if (((bU >> 3) & 1) == 1) {
                long jB = yVar2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    yVar = yVar2;
                    c(0L, jB + 1, yVar2.f8498x);
                } else {
                    yVar = yVar2;
                }
                yVar.a(jB + 1);
            } else {
                yVar = yVar2;
            }
            if (((bU >> 4) & 1) == 1) {
                long jB2 = yVar.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    c(0L, jB2 + 1, yVar.f8498x);
                }
                yVar.a(jB2 + 1);
            }
            if (z5) {
                b("FHCRC", yVar.g(), (short) crc32.getValue());
                crc32.reset();
            }
            this.f8476w = (byte) 1;
        } else {
            yVar = yVar2;
        }
        if (this.f8476w == 1) {
            long j8 = c0710g.f8461x;
            long jG = this.f8479z.G(c0710g, j6);
            if (jG != -1) {
                c(j8, jG, c0710g);
                return jG;
            }
            this.f8476w = (byte) 2;
        }
        if (this.f8476w != 2) {
            return -1L;
        }
        b("CRC", yVar.A(), (int) crc32.getValue());
        b("ISIZE", yVar.A(), (int) this.f8478y.getBytesWritten());
        this.f8476w = (byte) 3;
        if (yVar.E()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    public final void c(long j6, long j7, C0710g c0710g) {
        z zVar = c0710g.f8460w;
        while (true) {
            AbstractC1305a.l(zVar);
            int i6 = zVar.f8502c;
            int i7 = zVar.f8501b;
            if (j6 < i6 - i7) {
                break;
            }
            j6 -= (long) (i6 - i7);
            zVar = zVar.f8505f;
        }
        while (j7 > 0) {
            int i8 = (int) (((long) zVar.f8501b) + j6);
            int iMin = (int) Math.min(zVar.f8502c - i8, j7);
            this.f8475A.update(zVar.f8500a, i8, iMin);
            j7 -= (long) iMin;
            zVar = zVar.f8505f;
            AbstractC1305a.l(zVar);
            j6 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8479z.close();
    }

    @Override // f5.E
    public final G d() {
        return this.f8477x.f8497w.d();
    }
}
