package t4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m2.C1017B;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: t4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1351h extends AbstractC1349f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object[] f12750z = new Object[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f12752x = f12750z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12753y;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        int length;
        C1017B.k(i6, this.f12753y);
        int i7 = this.f12753y;
        if (i6 == i7) {
            addLast(obj);
            return;
        }
        if (i6 == 0) {
            addFirst(obj);
            return;
        }
        f(i7 + 1);
        int iH = h(this.f12751w + i6);
        int i8 = this.f12753y;
        if (i6 < ((i8 + 1) >> 1)) {
            if (iH == 0) {
                Object[] objArr = this.f12752x;
                AbstractC1305a.o(objArr, "<this>");
                iH = objArr.length;
            }
            int i9 = iH - 1;
            int i10 = this.f12751w;
            if (i10 == 0) {
                Object[] objArr2 = this.f12752x;
                AbstractC1305a.o(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i10 - 1;
            }
            int i11 = this.f12751w;
            Object[] objArr3 = this.f12752x;
            if (i9 >= i11) {
                objArr3[length] = objArr3[i11];
                AbstractC1353j.c0(i11, i11 + 1, i9 + 1, objArr3, objArr3);
            } else {
                AbstractC1353j.c0(i11 - 1, i11, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.f12752x;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC1353j.c0(0, 1, i9 + 1, objArr4, objArr4);
            }
            this.f12752x[i9] = obj;
            this.f12751w = length;
        } else {
            int iH2 = h(i8 + this.f12751w);
            Object[] objArr5 = this.f12752x;
            if (iH < iH2) {
                AbstractC1353j.c0(iH + 1, iH, iH2, objArr5, objArr5);
            } else {
                AbstractC1353j.c0(1, 0, iH2, objArr5, objArr5);
                Object[] objArr6 = this.f12752x;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1353j.c0(iH + 1, iH, objArr6.length - 1, objArr6, objArr6);
            }
            this.f12752x[iH] = obj;
        }
        this.f12753y++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        AbstractC1305a.o(collection, "elements");
        C1017B.k(i6, this.f12753y);
        if (collection.isEmpty()) {
            return false;
        }
        int i7 = this.f12753y;
        if (i6 == i7) {
            return addAll(collection);
        }
        f(collection.size() + i7);
        int iH = h(this.f12753y + this.f12751w);
        int iH2 = h(this.f12751w + i6);
        int size = collection.size();
        if (i6 < ((this.f12753y + 1) >> 1)) {
            int i8 = this.f12751w;
            int length = i8 - size;
            if (iH2 < i8) {
                Object[] objArr = this.f12752x;
                AbstractC1353j.c0(length, i8, objArr.length, objArr, objArr);
                Object[] objArr2 = this.f12752x;
                if (size >= iH2) {
                    AbstractC1353j.c0(objArr2.length - size, 0, iH2, objArr2, objArr2);
                } else {
                    AbstractC1353j.c0(objArr2.length - size, 0, size, objArr2, objArr2);
                    Object[] objArr3 = this.f12752x;
                    AbstractC1353j.c0(0, size, iH2, objArr3, objArr3);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.f12752x;
                AbstractC1353j.c0(length, i8, iH2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f12752x;
                length += objArr5.length;
                int i9 = iH2 - i8;
                int length2 = objArr5.length - length;
                if (length2 >= i9) {
                    AbstractC1353j.c0(length, i8, iH2, objArr5, objArr5);
                } else {
                    AbstractC1353j.c0(length, i8, i8 + length2, objArr5, objArr5);
                    Object[] objArr6 = this.f12752x;
                    AbstractC1353j.c0(0, this.f12751w + length2, iH2, objArr6, objArr6);
                }
            }
            this.f12751w = length;
            iH2 -= size;
            if (iH2 < 0) {
                iH2 += this.f12752x.length;
            }
        } else {
            int length3 = iH2 + size;
            if (iH2 < iH) {
                int i10 = size + iH;
                Object[] objArr7 = this.f12752x;
                if (i10 <= objArr7.length) {
                    AbstractC1353j.c0(length3, iH2, iH, objArr7, objArr7);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    AbstractC1353j.c0(length3, iH2, iH, objArr7, objArr7);
                } else {
                    int length4 = iH - (i10 - objArr7.length);
                    AbstractC1353j.c0(0, length4, iH, objArr7, objArr7);
                    Object[] objArr8 = this.f12752x;
                    AbstractC1353j.c0(length3, iH2, length4, objArr8, objArr8);
                }
            } else {
                Object[] objArr9 = this.f12752x;
                AbstractC1353j.c0(size, 0, iH, objArr9, objArr9);
                Object[] objArr10 = this.f12752x;
                if (length3 >= objArr10.length) {
                    AbstractC1353j.c0(length3 - objArr10.length, iH2, objArr10.length, objArr10, objArr10);
                } else {
                    AbstractC1353j.c0(0, objArr10.length - size, objArr10.length, objArr10, objArr10);
                    Object[] objArr11 = this.f12752x;
                    AbstractC1353j.c0(length3, iH2, objArr11.length - size, objArr11, objArr11);
                }
            }
        }
        e(iH2, collection);
        return true;
    }

    public final void addFirst(Object obj) {
        f(this.f12753y + 1);
        int length = this.f12751w;
        if (length == 0) {
            Object[] objArr = this.f12752x;
            AbstractC1305a.o(objArr, "<this>");
            length = objArr.length;
        }
        int i6 = length - 1;
        this.f12751w = i6;
        this.f12752x[i6] = obj;
        this.f12753y++;
    }

    public final void addLast(Object obj) {
        f(b() + 1);
        this.f12752x[h(b() + this.f12751w)] = obj;
        this.f12753y = b() + 1;
    }

    @Override // t4.AbstractC1349f
    public final int b() {
        return this.f12753y;
    }

    @Override // t4.AbstractC1349f
    public final Object c(int i6) {
        C1017B.j(i6, this.f12753y);
        if (i6 == S3.a.u(this)) {
            return removeLast();
        }
        if (i6 == 0) {
            return removeFirst();
        }
        int iH = h(this.f12751w + i6);
        Object[] objArr = this.f12752x;
        Object obj = objArr[iH];
        if (i6 < (this.f12753y >> 1)) {
            int i7 = this.f12751w;
            if (iH >= i7) {
                AbstractC1353j.c0(i7 + 1, i7, iH, objArr, objArr);
            } else {
                AbstractC1353j.c0(1, 0, iH, objArr, objArr);
                Object[] objArr2 = this.f12752x;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i8 = this.f12751w;
                AbstractC1353j.c0(i8 + 1, i8, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f12752x;
            int i9 = this.f12751w;
            objArr3[i9] = null;
            this.f12751w = g(i9);
        } else {
            int iH2 = h(S3.a.u(this) + this.f12751w);
            Object[] objArr4 = this.f12752x;
            int i10 = iH + 1;
            if (iH <= iH2) {
                AbstractC1353j.c0(iH, i10, iH2 + 1, objArr4, objArr4);
            } else {
                AbstractC1353j.c0(iH, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f12752x;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC1353j.c0(0, 1, iH2 + 1, objArr5, objArr5);
            }
            this.f12752x[iH2] = null;
        }
        this.f12753y--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iH = h(this.f12753y + this.f12751w);
        int i6 = this.f12751w;
        if (i6 < iH) {
            Object[] objArr = this.f12752x;
            AbstractC1305a.o(objArr, "<this>");
            Arrays.fill(objArr, i6, iH, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f12752x;
            Arrays.fill(objArr2, this.f12751w, objArr2.length, (Object) null);
            Object[] objArr3 = this.f12752x;
            AbstractC1305a.o(objArr3, "<this>");
            Arrays.fill(objArr3, 0, iH, (Object) null);
        }
        this.f12751w = 0;
        this.f12753y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i6, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f12752x.length;
        while (i6 < length && it.hasNext()) {
            this.f12752x[i6] = it.next();
            i6++;
        }
        int i7 = this.f12751w;
        for (int i8 = 0; i8 < i7 && it.hasNext(); i8++) {
            this.f12752x[i8] = it.next();
        }
        this.f12753y = collection.size() + b();
    }

    public final void f(int i6) {
        if (i6 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f12752x;
        if (i6 <= objArr.length) {
            return;
        }
        if (objArr == f12750z) {
            if (i6 < 10) {
                i6 = 10;
            }
            this.f12752x = new Object[i6];
            return;
        }
        int length = objArr.length;
        int i7 = length + (length >> 1);
        if (i7 - i6 < 0) {
            i7 = i6;
        }
        if (i7 - 2147483639 > 0) {
            i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i7];
        AbstractC1353j.c0(0, this.f12751w, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f12752x;
        int length2 = objArr3.length;
        int i8 = this.f12751w;
        AbstractC1353j.c0(length2 - i8, 0, i8, objArr3, objArr2);
        this.f12751w = 0;
        this.f12752x = objArr2;
    }

    public final int g(int i6) {
        AbstractC1305a.o(this.f12752x, "<this>");
        if (i6 == r0.length - 1) {
            return 0;
        }
        return i6 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        C1017B.j(i6, this.f12753y);
        return this.f12752x[h(this.f12751w + i6)];
    }

    public final int h(int i6) {
        Object[] objArr = this.f12752x;
        return i6 >= objArr.length ? i6 - objArr.length : i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iH = h(b() + this.f12751w);
        int length = this.f12751w;
        if (length < iH) {
            while (length < iH) {
                if (!AbstractC1305a.c(obj, this.f12752x[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.f12752x.length;
        while (true) {
            if (length >= length2) {
                for (int i6 = 0; i6 < iH; i6++) {
                    if (AbstractC1305a.c(obj, this.f12752x[i6])) {
                        length = i6 + this.f12752x.length;
                    }
                }
                return -1;
            }
            if (AbstractC1305a.c(obj, this.f12752x[length])) {
                break;
            }
            length++;
        }
        return length - this.f12751w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int iH = h(this.f12753y + this.f12751w);
        int i6 = this.f12751w;
        if (i6 < iH) {
            length = iH - 1;
            if (i6 <= length) {
                while (!AbstractC1305a.c(obj, this.f12752x[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                return length - this.f12751w;
            }
            return -1;
        }
        if (i6 > iH) {
            int i7 = iH - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.f12752x;
                    AbstractC1305a.o(objArr, "<this>");
                    length = objArr.length - 1;
                    int i8 = this.f12751w;
                    if (i8 <= length) {
                        while (!AbstractC1305a.c(obj, this.f12752x[length])) {
                            if (length != i8) {
                                length--;
                            }
                        }
                    }
                } else {
                    if (AbstractC1305a.c(obj, this.f12752x[i7])) {
                        length = i7 + this.f12752x.length;
                        break;
                    }
                    i7--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iH;
        AbstractC1305a.o(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f12752x.length != 0) {
            int iH2 = h(this.f12753y + this.f12751w);
            int i6 = this.f12751w;
            if (i6 < iH2) {
                iH = i6;
                while (i6 < iH2) {
                    Object obj = this.f12752x[i6];
                    if (!collection.contains(obj)) {
                        this.f12752x[iH] = obj;
                        iH++;
                    } else {
                        z5 = true;
                    }
                    i6++;
                }
                Object[] objArr = this.f12752x;
                AbstractC1305a.o(objArr, "<this>");
                Arrays.fill(objArr, iH, iH2, (Object) null);
            } else {
                int length = this.f12752x.length;
                boolean z6 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr2 = this.f12752x;
                    Object obj2 = objArr2[i6];
                    objArr2[i6] = null;
                    if (!collection.contains(obj2)) {
                        this.f12752x[i7] = obj2;
                        i7++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                iH = h(i7);
                for (int i8 = 0; i8 < iH2; i8++) {
                    Object[] objArr3 = this.f12752x;
                    Object obj3 = objArr3[i8];
                    objArr3[i8] = null;
                    if (!collection.contains(obj3)) {
                        this.f12752x[iH] = obj3;
                        iH = g(iH);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                int length2 = iH - this.f12751w;
                if (length2 < 0) {
                    length2 += this.f12752x.length;
                }
                this.f12753y = length2;
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f12752x;
        int i6 = this.f12751w;
        Object obj = objArr[i6];
        objArr[i6] = null;
        this.f12751w = g(i6);
        this.f12753y = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iH = h(S3.a.u(this) + this.f12751w);
        Object[] objArr = this.f12752x;
        Object obj = objArr[iH];
        objArr[iH] = null;
        this.f12753y = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iH;
        AbstractC1305a.o(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f12752x.length != 0) {
            int iH2 = h(this.f12753y + this.f12751w);
            int i6 = this.f12751w;
            if (i6 < iH2) {
                iH = i6;
                while (i6 < iH2) {
                    Object obj = this.f12752x[i6];
                    if (collection.contains(obj)) {
                        this.f12752x[iH] = obj;
                        iH++;
                    } else {
                        z5 = true;
                    }
                    i6++;
                }
                Object[] objArr = this.f12752x;
                AbstractC1305a.o(objArr, "<this>");
                Arrays.fill(objArr, iH, iH2, (Object) null);
            } else {
                int length = this.f12752x.length;
                boolean z6 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr2 = this.f12752x;
                    Object obj2 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj2)) {
                        this.f12752x[i7] = obj2;
                        i7++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                iH = h(i7);
                for (int i8 = 0; i8 < iH2; i8++) {
                    Object[] objArr3 = this.f12752x;
                    Object obj3 = objArr3[i8];
                    objArr3[i8] = null;
                    if (collection.contains(obj3)) {
                        this.f12752x[iH] = obj3;
                        iH = g(iH);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                int length2 = iH - this.f12751w;
                if (length2 < 0) {
                    length2 += this.f12752x.length;
                }
                this.f12753y = length2;
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        C1017B.j(i6, this.f12753y);
        int iH = h(this.f12751w + i6);
        Object[] objArr = this.f12752x;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1305a.o(objArr, "array");
        int length = objArr.length;
        int i6 = this.f12753y;
        if (length < i6) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i6);
            AbstractC1305a.m(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iH = h(this.f12753y + this.f12751w);
        int i7 = this.f12751w;
        if (i7 < iH) {
            AbstractC1353j.c0(0, i7, iH, this.f12752x, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f12752x;
            AbstractC1353j.c0(0, this.f12751w, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f12752x;
            AbstractC1353j.c0(objArr3.length - this.f12751w, 0, iH, objArr3, objArr);
        }
        int i8 = this.f12753y;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1305a.o(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        f(collection.size() + b());
        e(h(b() + this.f12751w), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }
}
