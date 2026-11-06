package u4;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: u4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1370a implements ListIterator, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f12920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12921x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12922y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12923z;

    public C1370a(b bVar, int i6) {
        AbstractC1305a.o(bVar, "list");
        this.f12920w = bVar;
        this.f12921x = i6;
        this.f12922y = -1;
        this.f12923z = ((AbstractList) bVar).modCount;
    }

    public final void a() {
        if (((AbstractList) this.f12920w).modCount != this.f12923z) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i6 = this.f12921x;
        this.f12921x = i6 + 1;
        b bVar = this.f12920w;
        bVar.add(i6, obj);
        this.f12922y = -1;
        this.f12923z = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12921x < this.f12920w.f12929y;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12921x > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i6 = this.f12921x;
        b bVar = this.f12920w;
        if (i6 >= bVar.f12929y) {
            throw new NoSuchElementException();
        }
        this.f12921x = i6 + 1;
        this.f12922y = i6;
        return bVar.f12927w[bVar.f12928x + i6];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12921x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i6 = this.f12921x;
        if (i6 <= 0) {
            throw new NoSuchElementException();
        }
        int i7 = i6 - 1;
        this.f12921x = i7;
        this.f12922y = i7;
        b bVar = this.f12920w;
        return bVar.f12927w[bVar.f12928x + i7];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12921x - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i6 = this.f12922y;
        if (i6 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        b bVar = this.f12920w;
        bVar.c(i6);
        this.f12921x = this.f12922y;
        this.f12922y = -1;
        this.f12923z = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i6 = this.f12922y;
        if (i6 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f12920w.set(i6, obj);
    }
}
