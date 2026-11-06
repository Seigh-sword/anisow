package W2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: W2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0232a extends A implements ListIterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4398x;

    public AbstractC0232a(int i6, int i7) {
        Y2.b.h(i7, i6);
        this.f4397w = i6;
        this.f4398x = i7;
    }

    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public abstract Object b(int i6);

    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4398x < this.f4397w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4398x > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f4398x;
        this.f4398x = i6 + 1;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4398x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f4398x - 1;
        this.f4398x = i6;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4398x - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
