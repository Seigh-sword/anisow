package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0439j3 extends AbstractC0485r2 implements RandomAccess {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0439j3 f6848A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object[] f6849z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f6850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6851y;

    static {
        Object[] objArr = new Object[0];
        f6849z = objArr;
        f6848A = new C0439j3(objArr, 0, false);
    }

    public C0439j3(Object[] objArr, int i6, boolean z5) {
        super(z5);
        this.f6850x = objArr;
        this.f6851y = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        b();
        if (i6 < 0 || i6 > (i7 = this.f6851y)) {
            throw new IndexOutOfBoundsException(H1.a.k("Index:", i6, ", Size:", this.f6851y));
        }
        Object[] objArr = this.f6850x;
        if (i7 < objArr.length) {
            System.arraycopy(objArr, i6, objArr, i6 + 1, i7 - i6);
        } else {
            Object[] objArr2 = new Object[Math.max(((objArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6850x, 0, objArr2, 0, i6);
            System.arraycopy(this.f6850x, i6, objArr2, i6 + 1, this.f6851y - i6);
            this.f6850x = objArr2;
        }
        this.f6850x[i6] = obj;
        this.f6851y++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.R2
    public final /* synthetic */ R2 d(int i6) {
        if (i6 >= this.f6851y) {
            return new C0439j3(i6 == 0 ? f6849z : Arrays.copyOf(this.f6850x, i6), this.f6851y, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i6) {
        if (i6 < 0 || i6 >= this.f6851y) {
            throw new IndexOutOfBoundsException(H1.a.k("Index:", i6, ", Size:", this.f6851y));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        e(i6);
        return this.f6850x[i6];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0485r2, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        b();
        e(i6);
        Object[] objArr = this.f6850x;
        Object obj = objArr[i6];
        if (i6 < this.f6851y - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f6851y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        b();
        e(i6);
        Object[] objArr = this.f6850x;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6851y;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i6 = this.f6851y;
        Object[] objArr = this.f6850x;
        if (i6 == objArr.length) {
            this.f6850x = Arrays.copyOf(this.f6850x, Math.max(((objArr.length * 3) / 2) + 1, 10));
        }
        Object[] objArr2 = this.f6850x;
        int i7 = this.f6851y;
        this.f6851y = i7 + 1;
        objArr2[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
