package u4;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m2.C1017B;
import s4.AbstractC1305a;
import t4.AbstractC1349f;
import t4.AbstractC1353j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1349f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final b f12924C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f12925A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b f12926B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f12927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12928x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12929y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12930z;

    static {
        b bVar = new b(0);
        bVar.f12930z = true;
        f12924C = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i6) {
        this(new Object[i6], 0, 0, false, null, null);
        if (i6 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        j();
        h();
        C1017B.k(i6, this.f12929y);
        g(this.f12928x + i6, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        AbstractC1305a.o(collection, "elements");
        j();
        h();
        C1017B.k(i6, this.f12929y);
        int size = collection.size();
        f(this.f12928x + i6, collection, size);
        return size > 0;
    }

    @Override // t4.AbstractC1349f
    public final int b() {
        h();
        return this.f12929y;
    }

    @Override // t4.AbstractC1349f
    public final Object c(int i6) {
        j();
        h();
        C1017B.j(i6, this.f12929y);
        return p(this.f12928x + i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        h();
        q(this.f12928x, this.f12929y);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f12927w;
            int i6 = this.f12929y;
            if (i6 != list.size()) {
                return false;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                if (!AbstractC1305a.c(objArr[this.f12928x + i7], list.get(i7))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(int i6, Collection collection, int i7) {
        ((AbstractList) this).modCount++;
        b bVar = this.f12925A;
        if (bVar != null) {
            bVar.f(i6, collection, i7);
            this.f12927w = bVar.f12927w;
            this.f12929y += i7;
        } else {
            l(i6, i7);
            Iterator it = collection.iterator();
            for (int i8 = 0; i8 < i7; i8++) {
                this.f12927w[i6 + i8] = it.next();
            }
        }
    }

    public final void g(int i6, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f12925A;
        if (bVar == null) {
            l(i6, 1);
            this.f12927w[i6] = obj;
        } else {
            bVar.g(i6, obj);
            this.f12927w = bVar.f12927w;
            this.f12929y++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        h();
        C1017B.j(i6, this.f12929y);
        return this.f12927w[this.f12928x + i6];
    }

    public final void h() {
        b bVar = this.f12926B;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.f12927w;
        int i6 = this.f12929y;
        int iHashCode = 1;
        for (int i7 = 0; i7 < i6; i7++) {
            Object obj = objArr[this.f12928x + i7];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i6 = 0; i6 < this.f12929y; i6++) {
            if (AbstractC1305a.c(this.f12927w[this.f12928x + i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.f12929y == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        b bVar;
        if (this.f12930z || ((bVar = this.f12926B) != null && bVar.f12930z)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(int i6, int i7) {
        int i8 = this.f12929y + i7;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f12927w;
        if (i8 > objArr.length) {
            int length = objArr.length;
            int i9 = length + (length >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            AbstractC1305a.o(objArr, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i9);
            AbstractC1305a.n(objArrCopyOf, "copyOf(...)");
            this.f12927w = objArrCopyOf;
        }
        Object[] objArr2 = this.f12927w;
        AbstractC1353j.c0(i6 + i7, i6, this.f12928x + this.f12929y, objArr2, objArr2);
        this.f12929y += i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i6 = this.f12929y - 1; i6 >= 0; i6--) {
            if (AbstractC1305a.c(this.f12927w[this.f12928x + i6], obj)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object p(int i6) {
        ((AbstractList) this).modCount++;
        b bVar = this.f12925A;
        if (bVar != null) {
            this.f12929y--;
            return bVar.p(i6);
        }
        Object[] objArr = this.f12927w;
        Object obj = objArr[i6];
        int i7 = this.f12929y;
        int i8 = this.f12928x;
        AbstractC1353j.c0(i6, i6 + 1, i7 + i8, objArr, objArr);
        Object[] objArr2 = this.f12927w;
        int i9 = (i8 + this.f12929y) - 1;
        AbstractC1305a.o(objArr2, "<this>");
        objArr2[i9] = null;
        this.f12929y--;
        return obj;
    }

    public final void q(int i6, int i7) {
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f12925A;
        if (bVar != null) {
            bVar.q(i6, i7);
        } else {
            Object[] objArr = this.f12927w;
            AbstractC1353j.c0(i6, i6 + i7, this.f12929y, objArr, objArr);
            Object[] objArr2 = this.f12927w;
            int i8 = this.f12929y;
            AbstractC1305a.o(objArr2, "<this>");
            for (int i9 = i8 - i7; i9 < i8; i9++) {
                objArr2[i9] = null;
            }
        }
        this.f12929y -= i7;
    }

    public final int r(int i6, int i7, Collection collection, boolean z5) {
        int iR;
        b bVar = this.f12925A;
        if (bVar != null) {
            iR = bVar.r(i6, i7, collection, z5);
        } else {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7) {
                int i10 = i6 + i8;
                if (collection.contains(this.f12927w[i10]) == z5) {
                    Object[] objArr = this.f12927w;
                    i8++;
                    objArr[i9 + i6] = objArr[i10];
                    i9++;
                } else {
                    i8++;
                }
            }
            int i11 = i7 - i9;
            Object[] objArr2 = this.f12927w;
            AbstractC1353j.c0(i6 + i9, i7 + i6, this.f12929y, objArr2, objArr2);
            Object[] objArr3 = this.f12927w;
            int i12 = this.f12929y;
            AbstractC1305a.o(objArr3, "<this>");
            for (int i13 = i12 - i11; i13 < i12; i13++) {
                objArr3[i13] = null;
            }
            iR = i11;
        }
        if (iR > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f12929y -= iR;
        return iR;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC1305a.o(collection, "elements");
        j();
        h();
        return r(this.f12928x, this.f12929y, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC1305a.o(collection, "elements");
        j();
        h();
        return r(this.f12928x, this.f12929y, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        j();
        h();
        C1017B.j(i6, this.f12929y);
        Object[] objArr = this.f12927w;
        int i7 = this.f12928x + i6;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i6, int i7) {
        C1017B.l(i6, i7, this.f12929y);
        Object[] objArr = this.f12927w;
        int i8 = this.f12928x + i6;
        int i9 = i7 - i6;
        boolean z5 = this.f12930z;
        b bVar = this.f12926B;
        return new b(objArr, i8, i9, z5, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.f12927w;
        int i6 = this.f12929y;
        int i7 = this.f12928x;
        int i8 = i6 + i7;
        AbstractC1305a.o(objArr, "<this>");
        AbstractC1305a.t(i8, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        AbstractC1305a.n(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        Object[] objArr = this.f12927w;
        int i6 = this.f12929y;
        StringBuilder sb = new StringBuilder((i6 * 3) + 2);
        sb.append("[");
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f12928x + i7];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC1305a.n(string, "toString(...)");
        return string;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        h();
        g(this.f12928x + this.f12929y, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1305a.o(collection, "elements");
        j();
        h();
        int size = collection.size();
        f(this.f12928x + this.f12929y, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        h();
        C1017B.k(i6, this.f12929y);
        return new C1370a(this, i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1305a.o(objArr, "destination");
        h();
        int length = objArr.length;
        int i6 = this.f12929y;
        int i7 = this.f12928x;
        if (length < i6) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f12927w, i7, i6 + i7, objArr.getClass());
            AbstractC1305a.n(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        AbstractC1353j.c0(0, i7, i6 + i7, this.f12927w, objArr);
        int i8 = this.f12929y;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    public b(Object[] objArr, int i6, int i7, boolean z5, b bVar, b bVar2) {
        this.f12927w = objArr;
        this.f12928x = i6;
        this.f12929y = i7;
        this.f12930z = z5;
        this.f12925A = bVar;
        this.f12926B = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }
}
