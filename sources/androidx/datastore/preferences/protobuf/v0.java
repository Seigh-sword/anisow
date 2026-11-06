package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements ListIterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ListIterator f5524w;

    public v0(x0 x0Var, int i6) {
        this.f5524w = x0Var.f5535w.listIterator(i6);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5524w.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5524w.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f5524w.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5524w.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f5524w.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5524w.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
