package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0527y2 implements Serializable, Iterable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0533z2 f7008x = new C0533z2(K2.f6616b);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final J2 f7009y = new J2();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7010w;

    public static int f(int i6, int i7, int i8) {
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

    public static C0533z2 g(byte[] bArr, int i6, int i7) {
        f(i6, i6 + i7, bArr.length);
        f7009y.getClass();
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, i6, bArr2, 0, i7);
        return new C0533z2(bArr2);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i6 = this.f7010w;
        if (i6 == 0) {
            int iJ = j();
            C0533z2 c0533z2 = (C0533z2) this;
            int iL = c0533z2.l();
            int i7 = iJ;
            for (int i8 = iL; i8 < iL + iJ; i8++) {
                i7 = (i7 * 31) + c0533z2.f7019z[i8];
            }
            i6 = i7 == 0 ? 1 : i7;
            this.f7010w = i6;
        }
        return i6;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String strI;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iJ = j();
        if (j() <= 50) {
            strI = F2.j(this);
        } else {
            C0533z2 c0533z2 = (C0533z2) this;
            int iF = f(0, 47, c0533z2.j());
            strI = AbstractC0628i.i(F2.j(iF == 0 ? f7008x : new C0515w2(c0533z2.f7019z, c0533z2.l(), iF)), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iJ);
        sb.append(" contents=\"");
        return AbstractC0628i.m(sb, strI, "\">");
    }

    public abstract byte e(int i6);

    public abstract byte h(int i6);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0509v2(this);
    }

    public abstract int j();
}
