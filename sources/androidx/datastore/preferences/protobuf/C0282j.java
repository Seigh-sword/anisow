package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0282j extends AbstractC0280i {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte[] f5459z;

    public C0282j(byte[] bArr) {
        this.f5454w = 0;
        bArr.getClass();
        this.f5459z = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0280i
    public byte b(int i6) {
        return this.f5459z[i6];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0280i) || size() != ((AbstractC0280i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0282j)) {
            return obj.equals(this);
        }
        C0282j c0282j = (C0282j) obj;
        int i6 = this.f5454w;
        int i7 = c0282j.f5454w;
        if (i6 != 0 && i7 != 0 && i6 != i7) {
            return false;
        }
        int size = size();
        if (size > c0282j.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0282j.size()) {
            StringBuilder sbL = H1.a.l("Ran off end of other: 0, ", size, ", ");
            sbL.append(c0282j.size());
            throw new IllegalArgumentException(sbL.toString());
        }
        int iL = l() + size;
        int iL2 = l();
        int iL3 = c0282j.l();
        while (iL2 < iL) {
            if (this.f5459z[iL2] != c0282j.f5459z[iL3]) {
                return false;
            }
            iL2++;
            iL3++;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0280i
    public void f(int i6, byte[] bArr) {
        System.arraycopy(this.f5459z, 0, bArr, 0, i6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0280i
    public byte h(int i6) {
        return this.f5459z[i6];
    }

    public int l() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0280i
    public int size() {
        return this.f5459z.length;
    }
}
