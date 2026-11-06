package s;

import java.util.Collection;
import java.util.Iterator;
import l.AbstractC0911d;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Collection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC0911d f12527w;

    public j(AbstractC0911d abstractC0911d) {
        this.f12527w = abstractC0911d;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f12527w.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12527w.h(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12527w.f() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1285g(this.f12527w, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC0911d abstractC0911d = this.f12527w;
        int iH = abstractC0911d.h(obj);
        if (iH < 0) {
            return false;
        }
        abstractC0911d.j(iH);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC0911d abstractC0911d = this.f12527w;
        int iF = abstractC0911d.f();
        int i6 = 0;
        boolean z5 = false;
        while (i6 < iF) {
            if (collection.contains(abstractC0911d.d(i6, 1))) {
                abstractC0911d.j(i6);
                i6--;
                iF--;
                z5 = true;
            }
            i6++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC0911d abstractC0911d = this.f12527w;
        int iF = abstractC0911d.f();
        int i6 = 0;
        boolean z5 = false;
        while (i6 < iF) {
            if (!collection.contains(abstractC0911d.d(i6, 1))) {
                abstractC0911d.j(i6);
                i6--;
                iF--;
                z5 = true;
            }
            i6++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12527w.f();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        AbstractC0911d abstractC0911d = this.f12527w;
        int iF = abstractC0911d.f();
        Object[] objArr = new Object[iF];
        for (int i6 = 0; i6 < iF; i6++) {
            objArr[i6] = abstractC0911d.d(i6, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f12527w.o(1, objArr);
    }
}
