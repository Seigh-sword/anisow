package t4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: t4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1350g implements Collection, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object[] f12748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12749x;

    public C1350g(Object[] objArr, boolean z5) {
        AbstractC1305a.o(objArr, "values");
        this.f12748w = objArr;
        this.f12749x = z5;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i6;
        Object[] objArr = this.f12748w;
        AbstractC1305a.o(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i6 = 0;
            while (i6 < length) {
                if (objArr[i6] != null) {
                    i6++;
                }
            }
            return false;
        }
        int length2 = objArr.length;
        for (int i7 = 0; i7 < length2; i7++) {
            if (AbstractC1305a.c(obj, objArr[i7])) {
                i6 = i7;
            }
        }
        return false;
        return i6 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1305a.o(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12748w.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.f12748w;
        AbstractC1305a.o(objArr, "array");
        return new C1345b(objArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12748w.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f12748w;
        AbstractC1305a.o(objArr, "<this>");
        if (this.f12749x && AbstractC1305a.c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC1305a.n(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1305a.o(objArr, "array");
        return D4.e.b(this, objArr);
    }
}
