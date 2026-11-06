package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0533z2 extends AbstractC0527y2 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte[] f7019z;

    public C0533z2(byte[] bArr) {
        this.f7010w = 0;
        bArr.getClass();
        this.f7019z = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0527y2
    public byte e(int i6) {
        return this.f7019z[i6];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0527y2) || j() != ((AbstractC0527y2) obj).j()) {
            return false;
        }
        if (j() == 0) {
            return true;
        }
        if (!(obj instanceof C0533z2)) {
            return obj.equals(this);
        }
        C0533z2 c0533z2 = (C0533z2) obj;
        int i6 = this.f7010w;
        int i7 = c0533z2.f7010w;
        if (i6 != 0 && i7 != 0 && i6 != i7) {
            return false;
        }
        int iJ = j();
        if (iJ > c0533z2.j()) {
            throw new IllegalArgumentException("Length too large: " + iJ + j());
        }
        if (iJ > c0533z2.j()) {
            throw new IllegalArgumentException(H1.a.k("Ran off end of other: 0, ", iJ, ", ", c0533z2.j()));
        }
        int iL = l() + iJ;
        int iL2 = l();
        int iL3 = c0533z2.l();
        while (iL2 < iL) {
            if (this.f7019z[iL2] != c0533z2.f7019z[iL3]) {
                return false;
            }
            iL2++;
            iL3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0527y2
    public byte h(int i6) {
        return this.f7019z[i6];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0527y2
    public int j() {
        return this.f7019z.length;
    }

    public int l() {
        return 0;
    }
}
