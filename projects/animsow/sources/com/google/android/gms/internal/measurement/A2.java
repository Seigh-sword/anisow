package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0290o;
import java.util.logging.Level;
import java.util.logging.Logger;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends W1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f6441h = Logger.getLogger(A2.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f6442i = AbstractC0492s3.f6955e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1243i f6443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6446g;

    public A2(byte[] bArr, int i6) {
        if (((bArr.length - i6) | i6) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i6)));
        }
        this.f6444e = bArr;
        this.f6446g = 0;
        this.f6445f = i6;
    }

    public static int A(int i6) {
        return K(i6 << 3) + 8;
    }

    public static int B(int i6, int i7) {
        return G(i7) + K(i6 << 3);
    }

    public static int C(int i6) {
        return K(i6 << 3) + 4;
    }

    public static int D(int i6, long j6) {
        return G((j6 >> 63) ^ (j6 << 1)) + K(i6 << 3);
    }

    public static int E(int i6, int i7) {
        return G(i7) + K(i6 << 3);
    }

    public static int F(int i6, long j6) {
        return G(j6) + K(i6 << 3);
    }

    public static int G(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public static int H(int i6) {
        return K(i6 << 3) + 4;
    }

    public static int I(int i6) {
        return K(i6 << 3);
    }

    public static int J(int i6, int i7) {
        return K((i7 >> 31) ^ (i7 << 1)) + K(i6 << 3);
    }

    public static int K(int i6) {
        return (352 - (Integer.numberOfLeadingZeros(i6) * 9)) >>> 6;
    }

    public static int L(int i6, int i7) {
        return K(i7) + K(i6 << 3);
    }

    public static int b(int i6) {
        return K(i6 << 3) + 8;
    }

    public static int j(int i6) {
        return K(i6 << 3) + 4;
    }

    public static int l(int i6) {
        return K(i6 << 3) + 1;
    }

    public static int m(int i6, InterfaceC0403d3 interfaceC0403d3, InterfaceC0457m3 interfaceC0457m3) {
        return ((AbstractC0474p2) interfaceC0403d3).a(interfaceC0457m3) + (K(i6 << 3) << 1);
    }

    public static int n(int i6, String str) {
        return o(str) + K(i6 << 3);
    }

    public static int o(String str) {
        int length;
        try {
            length = AbstractC0504u3.a(str);
        } catch (C0510v3 unused) {
            length = str.getBytes(K2.f6615a).length;
        }
        return K(length) + length;
    }

    public static int t(int i6) {
        return K(i6 << 3) + 8;
    }

    public static int u(int i6, AbstractC0527y2 abstractC0527y2) {
        int iK = K(i6 << 3);
        int iJ = abstractC0527y2.j();
        return K(iJ) + iJ + iK;
    }

    public static int y(int i6, long j6) {
        return G(j6) + K(i6 << 3);
    }

    public final void c(byte b6) {
        int i6 = this.f6446g;
        try {
            int i7 = i6 + 1;
            try {
                this.f6444e[i6] = b6;
                this.f6446g = i7;
            } catch (IndexOutOfBoundsException e6) {
                e = e6;
                i6 = i7;
                throw new C0290o(2, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i6), Integer.valueOf(this.f6445f), 1), e);
            }
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
        }
    }

    public final void d(int i6) throws C0290o {
        try {
            byte[] bArr = this.f6444e;
            int i7 = this.f6446g;
            bArr[i7] = (byte) i6;
            bArr[i7 + 1] = (byte) (i6 >> 8);
            bArr[i7 + 2] = (byte) (i6 >> 16);
            this.f6446g = i7 + 4;
            bArr[i7 + 3] = (byte) (i6 >>> 24);
        } catch (IndexOutOfBoundsException e6) {
            throw new C0290o(2, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6446g), Integer.valueOf(this.f6445f), 1), e6);
        }
    }

    public final void e(int i6, int i7) {
        w(i6, 5);
        d(i7);
    }

    public final void f(int i6, long j6) {
        w(i6, 1);
        g(j6);
    }

    public final void g(long j6) throws C0290o {
        try {
            byte[] bArr = this.f6444e;
            int i6 = this.f6446g;
            bArr[i6] = (byte) j6;
            bArr[i6 + 1] = (byte) (j6 >> 8);
            bArr[i6 + 2] = (byte) (j6 >> 16);
            bArr[i6 + 3] = (byte) (j6 >> 24);
            bArr[i6 + 4] = (byte) (j6 >> 32);
            bArr[i6 + 5] = (byte) (j6 >> 40);
            bArr[i6 + 6] = (byte) (j6 >> 48);
            this.f6446g = i6 + 8;
            bArr[i6 + 7] = (byte) (j6 >> 56);
        } catch (IndexOutOfBoundsException e6) {
            throw new C0290o(2, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6446g), Integer.valueOf(this.f6445f), 1), e6);
        }
    }

    public final void h(AbstractC0527y2 abstractC0527y2) {
        v(abstractC0527y2.j());
        C0533z2 c0533z2 = (C0533z2) abstractC0527y2;
        x(c0533z2.f7019z, c0533z2.l(), c0533z2.j());
    }

    public final void i(String str) throws C0290o {
        int i6 = this.f6446g;
        try {
            int iK = K(str.length() * 3);
            int iK2 = K(str.length());
            byte[] bArr = this.f6444e;
            if (iK2 != iK) {
                v(AbstractC0504u3.a(str));
                this.f6446g = AbstractC0504u3.b(str, bArr, this.f6446g, k());
                return;
            }
            int i7 = i6 + iK2;
            this.f6446g = i7;
            int iB = AbstractC0504u3.b(str, bArr, i7, k());
            this.f6446g = i6;
            v((iB - i6) - iK2);
            this.f6446g = iB;
        } catch (C0510v3 e6) {
            this.f6446g = i6;
            f6441h.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(K2.f6615a);
            try {
                v(bytes.length);
                x(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new C0290o(e7);
            }
        } catch (IndexOutOfBoundsException e8) {
            throw new C0290o(e8);
        }
    }

    public final int k() {
        return this.f6445f - this.f6446g;
    }

    public final void p(int i6) throws C0290o {
        if (i6 >= 0) {
            v(i6);
        } else {
            s(i6);
        }
    }

    public final void q(int i6, int i7) {
        w(i6, 0);
        p(i7);
    }

    public final void r(int i6, long j6) {
        w(i6, 0);
        s(j6);
    }

    public final void s(long j6) throws C0290o {
        boolean z5 = f6442i;
        byte[] bArr = this.f6444e;
        if (z5 && k() >= 10) {
            while ((j6 & (-128)) != 0) {
                int i6 = this.f6446g;
                this.f6446g = i6 + 1;
                AbstractC0492s3.g(bArr, i6, (byte) (((int) j6) | 128));
                j6 >>>= 7;
            }
            int i7 = this.f6446g;
            this.f6446g = i7 + 1;
            AbstractC0492s3.g(bArr, i7, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            try {
                int i8 = this.f6446g;
                this.f6446g = i8 + 1;
                bArr[i8] = (byte) (((int) j6) | 128);
                j6 >>>= 7;
            } catch (IndexOutOfBoundsException e6) {
                throw new C0290o(2, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6446g), Integer.valueOf(this.f6445f), 1), e6);
            }
        }
        int i9 = this.f6446g;
        this.f6446g = i9 + 1;
        bArr[i9] = (byte) j6;
    }

    public final void v(int i6) {
        while (true) {
            int i7 = i6 & (-128);
            byte[] bArr = this.f6444e;
            if (i7 == 0) {
                int i8 = this.f6446g;
                this.f6446g = i8 + 1;
                bArr[i8] = (byte) i6;
                return;
            } else {
                try {
                    int i9 = this.f6446g;
                    this.f6446g = i9 + 1;
                    bArr[i9] = (byte) (i6 | 128);
                    i6 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new C0290o(2, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6446g), Integer.valueOf(this.f6445f), 1), e6);
                }
            }
            throw new C0290o(2, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6446g), Integer.valueOf(this.f6445f), 1), e6);
        }
    }

    public final void w(int i6, int i7) {
        v((i6 << 3) | i7);
    }

    public final void x(byte[] bArr, int i6, int i7) throws C0290o {
        try {
            System.arraycopy(bArr, i6, this.f6444e, this.f6446g, i7);
            this.f6446g += i7;
        } catch (IndexOutOfBoundsException e6) {
            throw new C0290o(2, String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6446g), Integer.valueOf(this.f6445f), Integer.valueOf(i7)), e6);
        }
    }

    public final void z(int i6, int i7) {
        w(i6, 0);
        v(i7);
    }
}
