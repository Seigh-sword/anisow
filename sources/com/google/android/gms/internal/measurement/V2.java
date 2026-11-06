package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class V2 extends AbstractC0485r2 implements N2, InterfaceC0433i3, RandomAccess {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final V2 f6718A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long[] f6719z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long[] f6720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6721y;

    static {
        long[] jArr = new long[0];
        f6719z = jArr;
        f6718A = new V2(jArr, 0, false);
    }

    public V2(long[] jArr, int i6, boolean z5) {
        super(z5);
        this.f6720x = jArr;
        this.f6721y = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i6 < 0 || i6 > (i7 = this.f6721y)) {
            throw new IndexOutOfBoundsException(H1.a.k("Index:", i6, ", Size:", this.f6721y));
        }
        long[] jArr = this.f6720x;
        if (i7 < jArr.length) {
            System.arraycopy(jArr, i6, jArr, i6 + 1, i7 - i6);
        } else {
            long[] jArr2 = new long[Math.max(((jArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6720x, 0, jArr2, 0, i6);
            System.arraycopy(this.f6720x, i6, jArr2, i6 + 1, this.f6721y - i6);
            this.f6720x = jArr2;
        }
        this.f6720x[i6] = jLongValue;
        this.f6721y++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = K2.f6615a;
        collection.getClass();
        if (!(collection instanceof V2)) {
            return super.addAll(collection);
        }
        V2 v22 = (V2) collection;
        int i6 = v22.f6721y;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.f6721y;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        long[] jArr = this.f6720x;
        if (i8 > jArr.length) {
            this.f6720x = Arrays.copyOf(jArr, i8);
        }
        System.arraycopy(v22.f6720x, 0, this.f6720x, this.f6721y, v22.f6721y);
        this.f6721y = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j6) {
        b();
        int i6 = this.f6721y;
        long[] jArr = this.f6720x;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[Math.max(((jArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6720x, 0, jArr2, 0, this.f6721y);
            this.f6720x = jArr2;
        }
        long[] jArr3 = this.f6720x;
        int i7 = this.f6721y;
        this.f6721y = i7 + 1;
        jArr3[i7] = j6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V2)) {
            return super.equals(obj);
        }
        V2 v22 = (V2) obj;
        if (this.f6721y != v22.f6721y) {
            return false;
        }
        long[] jArr = v22.f6720x;
        for (int i6 = 0; i6 < this.f6721y; i6++) {
            if (this.f6720x[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i6) {
        j(i6);
        return this.f6720x[i6];
    }

    @Override // com.google.android.gms.internal.measurement.R2
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V2 d(int i6) {
        if (i6 >= this.f6721y) {
            return new V2(i6 == 0 ? f6719z : Arrays.copyOf(this.f6720x, i6), this.f6721y, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i6) {
        return Long.valueOf(f(i6));
    }

    public final void h(int i6) {
        long[] jArr = this.f6720x;
        if (i6 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f6720x = new long[Math.max(i6, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i6) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f6720x = Arrays.copyOf(this.f6720x, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i6 = 0; i6 < this.f6721y; i6++) {
            iA = (iA * 31) + K2.a(this.f6720x[i6]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i6 = this.f6721y;
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.f6720x[i7] == jLongValue) {
                return i7;
            }
        }
        return -1;
    }

    public final void j(int i6) {
        if (i6 < 0 || i6 >= this.f6721y) {
            throw new IndexOutOfBoundsException(H1.a.k("Index:", i6, ", Size:", this.f6721y));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i6) {
        b();
        j(i6);
        long[] jArr = this.f6720x;
        long j6 = jArr[i6];
        if (i6 < this.f6721y - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (r3 - i6) - 1);
        }
        this.f6721y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        b();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6720x;
        System.arraycopy(jArr, i7, jArr, i6, this.f6721y - i7);
        this.f6721y -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i6, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        j(i6);
        long[] jArr = this.f6720x;
        long j6 = jArr[i6];
        jArr[i6] = jLongValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6721y;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
