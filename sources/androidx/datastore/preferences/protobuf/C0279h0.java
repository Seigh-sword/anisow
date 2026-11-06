package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0279h0 extends AbstractC0268c implements RandomAccess {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0279h0 f5449z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f5450x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5451y;

    static {
        C0279h0 c0279h0 = new C0279h0(0, new Object[0]);
        f5449z = c0279h0;
        c0279h0.f5436w = false;
    }

    public C0279h0(int i6, Object[] objArr) {
        this.f5450x = objArr;
        this.f5451y = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int i7;
        b();
        if (i6 < 0 || i6 > (i7 = this.f5451y)) {
            StringBuilder sbL = H1.a.l("Index:", i6, ", Size:");
            sbL.append(this.f5451y);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        Object[] objArr = this.f5450x;
        if (i7 < objArr.length) {
            System.arraycopy(objArr, i6, objArr, i6 + 1, i7 - i6);
        } else {
            Object[] objArr2 = new Object[((i7 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i6);
            System.arraycopy(this.f5450x, i6, objArr2, i6 + 1, this.f5451y - i6);
            this.f5450x = objArr2;
        }
        this.f5450x[i6] = obj;
        this.f5451y++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i6) {
        if (i6 < 0 || i6 >= this.f5451y) {
            StringBuilder sbL = H1.a.l("Index:", i6, ", Size:");
            sbL.append(this.f5451y);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        c(i6);
        return this.f5450x[i6];
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final E n(int i6) {
        if (i6 < this.f5451y) {
            throw new IllegalArgumentException();
        }
        return new C0279h0(this.f5451y, Arrays.copyOf(this.f5450x, i6));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0268c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        b();
        c(i6);
        Object[] objArr = this.f5450x;
        Object obj = objArr[i6];
        if (i6 < this.f5451y - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f5451y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        b();
        c(i6);
        Object[] objArr = this.f5450x;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5451y;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0268c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i6 = this.f5451y;
        Object[] objArr = this.f5450x;
        if (i6 == objArr.length) {
            this.f5450x = Arrays.copyOf(objArr, ((i6 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5450x;
        int i7 = this.f5451y;
        this.f5451y = i7 + 1;
        objArr2[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
