package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0292q extends o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f5503d = Logger.getLogger(AbstractC0292q.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f5504e = C0.f5365e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L3.c f5505c;

    public static int d(int i6) {
        return v(i6) + 1;
    }

    public static int e(int i6, AbstractC0280i abstractC0280i) {
        return f(abstractC0280i) + v(i6);
    }

    public static int f(AbstractC0280i abstractC0280i) {
        int size = abstractC0280i.size();
        return x(size) + size;
    }

    public static int g(int i6) {
        return v(i6) + 8;
    }

    public static int h(int i6, int i7) {
        return n(i7) + v(i6);
    }

    public static int i(int i6) {
        return v(i6) + 4;
    }

    public static int j(int i6) {
        return v(i6) + 8;
    }

    public static int k(int i6) {
        return v(i6) + 4;
    }

    public static int l(int i6, AbstractC0266b abstractC0266b, InterfaceC0283j0 interfaceC0283j0) {
        return abstractC0266b.b(interfaceC0283j0) + (v(i6) * 2);
    }

    public static int m(int i6, int i7) {
        return n(i7) + v(i6);
    }

    public static int n(int i6) {
        if (i6 >= 0) {
            return x(i6);
        }
        return 10;
    }

    public static int o(int i6, long j6) {
        return z(j6) + v(i6);
    }

    public static int p(int i6) {
        return v(i6) + 4;
    }

    public static int q(int i6) {
        return v(i6) + 8;
    }

    public static int r(int i6, int i7) {
        return x((i7 >> 31) ^ (i7 << 1)) + v(i6);
    }

    public static int s(int i6, long j6) {
        return z((j6 >> 63) ^ (j6 << 1)) + v(i6);
    }

    public static int t(int i6, String str) {
        return u(str) + v(i6);
    }

    public static int u(String str) {
        int length;
        try {
            length = F0.b(str);
        } catch (E0 unused) {
            length = str.getBytes(F.f5369a).length;
        }
        return x(length) + length;
    }

    public static int v(int i6) {
        return x(i6 << 3);
    }

    public static int w(int i6, int i7) {
        return x(i7) + v(i6);
    }

    public static int x(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        return (i6 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int y(int i6, long j6) {
        return z(j6) + v(i6);
    }

    public static int z(long j6) {
        int i6;
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if (((-34359738368L) & j6) != 0) {
            j6 >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j6) != 0) {
            i6 += 2;
            j6 >>>= 14;
        }
        return (j6 & (-16384)) != 0 ? i6 + 1 : i6;
    }

    public final void A(String str, E0 e02) throws C0290o {
        f5503d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e02);
        byte[] bytes = str.getBytes(F.f5369a);
        try {
            S(bytes.length);
            c(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e6) {
            throw new C0290o(e6);
        }
    }

    public abstract void B(byte b6);

    public abstract void C(int i6, boolean z5);

    public abstract void D(byte[] bArr, int i6);

    public abstract void E(int i6, AbstractC0280i abstractC0280i);

    public abstract void F(AbstractC0280i abstractC0280i);

    public abstract void G(int i6, int i7);

    public abstract void H(int i6);

    public abstract void I(int i6, long j6);

    public abstract void J(long j6);

    public abstract void K(int i6, int i7);

    public abstract void L(int i6);

    public abstract void M(int i6, AbstractC0266b abstractC0266b, InterfaceC0283j0 interfaceC0283j0);

    public abstract void N(AbstractC0266b abstractC0266b);

    public abstract void O(int i6, String str);

    public abstract void P(String str);

    public abstract void Q(int i6, int i7);

    public abstract void R(int i6, int i7);

    public abstract void S(int i6);

    public abstract void T(int i6, long j6);

    public abstract void U(long j6);
}
