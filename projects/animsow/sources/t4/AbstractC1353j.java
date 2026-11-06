package t4;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: t4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1353j extends AbstractC1305a {
    public static void b0(int i6, int i7, int i8, byte[] bArr, byte[] bArr2) {
        AbstractC1305a.o(bArr, "<this>");
        AbstractC1305a.o(bArr2, "destination");
        System.arraycopy(bArr, i7, bArr2, i6, i8 - i7);
    }

    public static void c0(int i6, int i7, int i8, Object[] objArr, Object[] objArr2) {
        AbstractC1305a.o(objArr, "<this>");
        AbstractC1305a.o(objArr2, "destination");
        System.arraycopy(objArr, i7, objArr2, i6, i8 - i7);
    }
}
