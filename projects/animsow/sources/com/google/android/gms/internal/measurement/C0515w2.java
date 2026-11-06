package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0515w2 extends C0533z2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f6988A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f6989B;

    public C0515w2(byte[] bArr, int i6, int i7) {
        super(bArr);
        AbstractC0527y2.f(i6, i6 + i7, bArr.length);
        this.f6988A = i6;
        this.f6989B = i7;
    }

    @Override // com.google.android.gms.internal.measurement.C0533z2, com.google.android.gms.internal.measurement.AbstractC0527y2
    public final byte e(int i6) {
        int i7 = this.f6989B;
        if (((i7 - (i6 + 1)) | i6) >= 0) {
            return this.f7019z[this.f6988A + i6];
        }
        if (i6 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0628i.f("Index < 0: ", i6));
        }
        throw new ArrayIndexOutOfBoundsException(H1.a.k("Index > length: ", i6, ", ", i7));
    }

    @Override // com.google.android.gms.internal.measurement.C0533z2, com.google.android.gms.internal.measurement.AbstractC0527y2
    public final byte h(int i6) {
        return this.f7019z[this.f6988A + i6];
    }

    @Override // com.google.android.gms.internal.measurement.C0533z2, com.google.android.gms.internal.measurement.AbstractC0527y2
    public final int j() {
        return this.f6989B;
    }

    @Override // com.google.android.gms.internal.measurement.C0533z2
    public final int l() {
        return this.f6988A;
    }
}
