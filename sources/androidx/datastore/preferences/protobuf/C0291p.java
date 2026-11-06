package androidx.datastore.preferences.protobuf;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0291p extends AbstractC0292q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OutputStream f5499i;

    public C0291p(OutputStream outputStream, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i6, 20);
        this.f5496f = new byte[iMax];
        this.f5497g = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f5499i = outputStream;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void B(byte b6) {
        if (this.f5498h == this.f5497g) {
            a0();
        }
        int i6 = this.f5498h;
        this.f5498h = i6 + 1;
        this.f5496f[i6] = b6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void C(int i6, boolean z5) {
        b0(11);
        X(i6, 0);
        byte b6 = z5 ? (byte) 1 : (byte) 0;
        int i7 = this.f5498h;
        this.f5498h = i7 + 1;
        this.f5496f[i7] = b6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void D(byte[] bArr, int i6) throws IOException {
        S(i6);
        c0(bArr, 0, i6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void E(int i6, AbstractC0280i abstractC0280i) throws IOException {
        Q(i6, 2);
        F(abstractC0280i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void F(AbstractC0280i abstractC0280i) throws IOException {
        S(abstractC0280i.size());
        C0282j c0282j = (C0282j) abstractC0280i;
        c(c0282j.f5459z, c0282j.l(), c0282j.size());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void G(int i6, int i7) {
        b0(14);
        X(i6, 5);
        V(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void H(int i6) {
        b0(4);
        V(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void I(int i6, long j6) {
        b0(18);
        X(i6, 1);
        W(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void J(long j6) {
        b0(8);
        W(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void K(int i6, int i7) {
        b0(20);
        X(i6, 0);
        if (i7 >= 0) {
            Y(i7);
        } else {
            Z(i7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void L(int i6) {
        if (i6 >= 0) {
            S(i6);
        } else {
            U(i6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void M(int i6, AbstractC0266b abstractC0266b, InterfaceC0283j0 interfaceC0283j0) {
        Q(i6, 2);
        S(abstractC0266b.b(interfaceC0283j0));
        interfaceC0283j0.c(abstractC0266b, this.f5505c);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void N(AbstractC0266b abstractC0266b) {
        S(((C) abstractC0266b).b(null));
        abstractC0266b.c(this);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void O(int i6, String str) throws IOException {
        Q(i6, 2);
        P(str);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void P(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iX = AbstractC0292q.x(length);
            int i6 = iX + length;
            int i7 = this.f5497g;
            if (i6 > i7) {
                byte[] bArr = new byte[length];
                int iE = F0.f5371a.e(str, bArr, 0, length);
                S(iE);
                c0(bArr, 0, iE);
                return;
            }
            if (i6 > i7 - this.f5498h) {
                a0();
            }
            int iX2 = AbstractC0292q.x(str.length());
            int i8 = this.f5498h;
            byte[] bArr2 = this.f5496f;
            try {
                try {
                    if (iX2 == iX) {
                        int i9 = i8 + iX2;
                        this.f5498h = i9;
                        int iE2 = F0.f5371a.e(str, bArr2, i9, i7 - i9);
                        this.f5498h = i8;
                        Y((iE2 - i8) - iX2);
                        this.f5498h = iE2;
                    } else {
                        int iB = F0.b(str);
                        Y(iB);
                        this.f5498h = F0.f5371a.e(str, bArr2, this.f5498h, iB);
                    }
                } catch (E0 e6) {
                    this.f5498h = i8;
                    throw e6;
                }
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new C0290o(e7);
            }
        } catch (E0 e8) {
            A(str, e8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void Q(int i6, int i7) {
        S((i6 << 3) | i7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void R(int i6, int i7) {
        b0(20);
        X(i6, 0);
        Y(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void S(int i6) {
        b0(5);
        Y(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void T(int i6, long j6) {
        b0(20);
        X(i6, 0);
        Z(j6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0292q
    public final void U(long j6) {
        b0(10);
        Z(j6);
    }

    public final void V(int i6) {
        int i7 = this.f5498h;
        byte[] bArr = this.f5496f;
        bArr[i7] = (byte) (i6 & 255);
        bArr[i7 + 1] = (byte) ((i6 >> 8) & 255);
        bArr[i7 + 2] = (byte) ((i6 >> 16) & 255);
        this.f5498h = i7 + 4;
        bArr[i7 + 3] = (byte) ((i6 >> 24) & 255);
    }

    public final void W(long j6) {
        int i6 = this.f5498h;
        byte[] bArr = this.f5496f;
        bArr[i6] = (byte) (j6 & 255);
        bArr[i6 + 1] = (byte) ((j6 >> 8) & 255);
        bArr[i6 + 2] = (byte) ((j6 >> 16) & 255);
        bArr[i6 + 3] = (byte) (255 & (j6 >> 24));
        bArr[i6 + 4] = (byte) (((int) (j6 >> 32)) & 255);
        bArr[i6 + 5] = (byte) (((int) (j6 >> 40)) & 255);
        bArr[i6 + 6] = (byte) (((int) (j6 >> 48)) & 255);
        this.f5498h = i6 + 8;
        bArr[i6 + 7] = (byte) (((int) (j6 >> 56)) & 255);
    }

    public final void X(int i6, int i7) {
        Y((i6 << 3) | i7);
    }

    public final void Y(int i6) {
        boolean z5 = AbstractC0292q.f5504e;
        byte[] bArr = this.f5496f;
        if (z5) {
            while ((i6 & (-128)) != 0) {
                int i7 = this.f5498h;
                this.f5498h = i7 + 1;
                C0.n(bArr, i7, (byte) ((i6 & ModuleDescriptor.MODULE_VERSION) | 128));
                i6 >>>= 7;
            }
            int i8 = this.f5498h;
            this.f5498h = i8 + 1;
            C0.n(bArr, i8, (byte) i6);
            return;
        }
        while ((i6 & (-128)) != 0) {
            int i9 = this.f5498h;
            this.f5498h = i9 + 1;
            bArr[i9] = (byte) ((i6 & ModuleDescriptor.MODULE_VERSION) | 128);
            i6 >>>= 7;
        }
        int i10 = this.f5498h;
        this.f5498h = i10 + 1;
        bArr[i10] = (byte) i6;
    }

    public final void Z(long j6) {
        boolean z5 = AbstractC0292q.f5504e;
        byte[] bArr = this.f5496f;
        if (z5) {
            while ((j6 & (-128)) != 0) {
                int i6 = this.f5498h;
                this.f5498h = i6 + 1;
                C0.n(bArr, i6, (byte) ((((int) j6) & ModuleDescriptor.MODULE_VERSION) | 128));
                j6 >>>= 7;
            }
            int i7 = this.f5498h;
            this.f5498h = i7 + 1;
            C0.n(bArr, i7, (byte) j6);
            return;
        }
        while ((j6 & (-128)) != 0) {
            int i8 = this.f5498h;
            this.f5498h = i8 + 1;
            bArr[i8] = (byte) ((((int) j6) & ModuleDescriptor.MODULE_VERSION) | 128);
            j6 >>>= 7;
        }
        int i9 = this.f5498h;
        this.f5498h = i9 + 1;
        bArr[i9] = (byte) j6;
    }

    public final void a0() {
        this.f5499i.write(this.f5496f, 0, this.f5498h);
        this.f5498h = 0;
    }

    public final void b0(int i6) {
        if (this.f5497g - this.f5498h < i6) {
            a0();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void c(byte[] bArr, int i6, int i7) throws IOException {
        c0(bArr, i6, i7);
    }

    public final void c0(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = this.f5498h;
        int i9 = this.f5497g;
        int i10 = i9 - i8;
        byte[] bArr2 = this.f5496f;
        if (i10 >= i7) {
            System.arraycopy(bArr, i6, bArr2, i8, i7);
            this.f5498h += i7;
            return;
        }
        System.arraycopy(bArr, i6, bArr2, i8, i10);
        int i11 = i6 + i10;
        int i12 = i7 - i10;
        this.f5498h = i9;
        a0();
        if (i12 > i9) {
            this.f5499i.write(bArr, i11, i12);
        } else {
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            this.f5498h = i12;
        }
    }
}
