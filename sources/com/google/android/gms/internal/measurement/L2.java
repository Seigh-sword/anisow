package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class L2 extends AbstractC0485r2 implements P2, InterfaceC0433i3, RandomAccess {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final L2 f6623A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f6624z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f6625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6626y;

    static {
        int[] iArr = new int[0];
        f6624z = iArr;
        f6623A = new L2(iArr, 0, false);
    }

    public L2(int[] iArr, int i6, boolean z5) {
        super(z5);
        this.f6625x = iArr;
        this.f6626y = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i6 < 0 || i6 > (i7 = this.f6626y)) {
            throw new IndexOutOfBoundsException(H1.a.k("Index:", i6, ", Size:", this.f6626y));
        }
        int[] iArr = this.f6625x;
        if (i7 < iArr.length) {
            System.arraycopy(iArr, i6, iArr, i6 + 1, i7 - i6);
        } else {
            int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6625x, 0, iArr2, 0, i6);
            System.arraycopy(this.f6625x, i6, iArr2, i6 + 1, this.f6626y - i6);
            this.f6625x = iArr2;
        }
        this.f6625x[i6] = iIntValue;
        this.f6626y++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = K2.f6615a;
        collection.getClass();
        if (!(collection instanceof L2)) {
            return super.addAll(collection);
        }
        L2 l22 = (L2) collection;
        int i6 = l22.f6626y;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f6626y;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        int[] iArr = this.f6625x;
        if (i8 > iArr.length) {
            this.f6625x = Arrays.copyOf(iArr, i8);
        }
        System.arraycopy(l22.f6625x, 0, this.f6625x, this.f6626y, l22.f6626y);
        this.f6626y = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i6) {
        j(i6);
        return this.f6625x[i6];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return super.equals(obj);
        }
        L2 l22 = (L2) obj;
        if (this.f6626y != l22.f6626y) {
            return false;
        }
        int[] iArr = l22.f6625x;
        for (int i6 = 0; i6 < this.f6626y; i6++) {
            if (this.f6625x[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.R2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final L2 d(int i6) {
        if (i6 >= this.f6626y) {
            return new L2(i6 == 0 ? f6624z : Arrays.copyOf(this.f6625x, i6), this.f6626y, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i6) {
        b();
        int i7 = this.f6626y;
        int[] iArr = this.f6625x;
        if (i7 == iArr.length) {
            int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6625x, 0, iArr2, 0, this.f6626y);
            this.f6625x = iArr2;
        }
        int[] iArr3 = this.f6625x;
        int i8 = this.f6626y;
        this.f6626y = i8 + 1;
        iArr3[i8] = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        return Integer.valueOf(e(i6));
    }

    public final void h(int i6) {
        int[] iArr = this.f6625x;
        if (i6 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f6625x = new int[Math.max(i6, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i6) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f6625x = Arrays.copyOf(this.f6625x, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.f6626y; i7++) {
            i6 = (i6 * 31) + this.f6625x[i7];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i6 = this.f6626y;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f6625x[i7] == iIntValue) {
                return i7;
            }
        }
        return -1;
    }

    public final void j(int i6) {
        if (i6 < 0 || i6 >= this.f6626y) {
            throw new IndexOutOfBoundsException(H1.a.k("Index:", i6, ", Size:", this.f6626y));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i6) {
        b();
        j(i6);
        int[] iArr = this.f6625x;
        int i7 = iArr[i6];
        if (i6 < this.f6626y - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (r2 - i6) - 1);
        }
        this.f6626y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        b();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6625x;
        System.arraycopy(iArr, i7, iArr, i6, this.f6626y - i7);
        this.f6626y -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i6, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        j(i6);
        int[] iArr = this.f6625x;
        int i7 = iArr[i6];
        iArr[i6] = iIntValue;
        return Integer.valueOf(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6626y;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
