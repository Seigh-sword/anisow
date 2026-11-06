package androidx.datastore.preferences.protobuf;

import d.AbstractC0628i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0280i implements Iterable, Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0282j f5452x = new C0282j(F.f5370b);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final I0.o f5453y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5454w;

    static {
        int i6 = 0;
        f5453y = AbstractC0270d.a() ? new I0.o(1, i6) : new I0.o(i6, i6);
    }

    public static int c(int i6, int i7, int i8) {
        int i9 = i7 - i6;
        if ((i6 | i7 | i9 | (i8 - i7)) >= 0) {
            return i9;
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(H1.a.j("Beginning index: ", i6, " < 0"));
        }
        if (i7 < i6) {
            throw new IndexOutOfBoundsException(H1.a.k("Beginning index larger than ending index: ", i6, ", ", i7));
        }
        throw new IndexOutOfBoundsException(H1.a.k("End index: ", i7, " >= ", i8));
    }

    public static C0282j e(byte[] bArr, int i6, int i7) {
        byte[] bArrCopyOfRange;
        int i8 = i6 + i7;
        c(i6, i8, bArr.length);
        switch (f5453y.f1108w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i6, i8);
                break;
            default:
                bArrCopyOfRange = new byte[i7];
                System.arraycopy(bArr, i6, bArrCopyOfRange, 0, i7);
                break;
        }
        return new C0282j(bArrCopyOfRange);
    }

    public abstract byte b(int i6);

    public abstract void f(int i6, byte[] bArr);

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i6 = this.f5454w;
        if (i6 == 0) {
            int size = size();
            C0282j c0282j = (C0282j) this;
            int iL = c0282j.l();
            int i7 = size;
            for (int i8 = iL; i8 < iL + size; i8++) {
                i7 = (i7 * 31) + c0282j.f5459z[i8];
            }
            i6 = i7 == 0 ? 1 : i7;
            this.f5454w = i6;
        }
        return i6;
    }

    public abstract byte h(int i6);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0274f(this);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        C0282j c0278h;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = o0.a(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C0282j c0282j = (C0282j) this;
            int iC = c(0, 47, c0282j.size());
            if (iC == 0) {
                c0278h = f5452x;
            } else {
                c0278h = new C0278h(c0282j.f5459z, c0282j.l(), iC);
            }
            sb.append(o0.a(c0278h));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AbstractC0628i.m(sb2, string, "\">");
    }

    public abstract int size();
}
