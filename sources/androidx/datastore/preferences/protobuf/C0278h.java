package androidx.datastore.preferences.protobuf;

import d.AbstractC0628i;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0278h extends C0282j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f5447A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f5448B;

    public C0278h(byte[] bArr, int i6, int i7) {
        super(bArr);
        AbstractC0280i.c(i6, i6 + i7, bArr.length);
        this.f5447A = i6;
        this.f5448B = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.C0282j, androidx.datastore.preferences.protobuf.AbstractC0280i
    public final byte b(int i6) {
        int i7 = this.f5448B;
        if (((i7 - (i6 + 1)) | i6) >= 0) {
            return this.f5459z[this.f5447A + i6];
        }
        if (i6 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0628i.f("Index < 0: ", i6));
        }
        throw new ArrayIndexOutOfBoundsException(H1.a.k("Index > length: ", i6, ", ", i7));
    }

    @Override // androidx.datastore.preferences.protobuf.C0282j, androidx.datastore.preferences.protobuf.AbstractC0280i
    public final void f(int i6, byte[] bArr) {
        System.arraycopy(this.f5459z, this.f5447A, bArr, 0, i6);
    }

    @Override // androidx.datastore.preferences.protobuf.C0282j, androidx.datastore.preferences.protobuf.AbstractC0280i
    public final byte h(int i6) {
        return this.f5459z[this.f5447A + i6];
    }

    @Override // androidx.datastore.preferences.protobuf.C0282j
    public final int l() {
        return this.f5447A;
    }

    @Override // androidx.datastore.preferences.protobuf.C0282j, androidx.datastore.preferences.protobuf.AbstractC0280i
    public final int size() {
        return this.f5448B;
    }
}
