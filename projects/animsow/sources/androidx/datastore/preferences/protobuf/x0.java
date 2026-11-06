package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends AbstractList implements K, RandomAccess {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K f5535w;

    public x0(K k5) {
        this.f5535w = k5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        return (String) this.f5535w.get(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final K i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new w0(this);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final void k(AbstractC0280i abstractC0280i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        return new v0(this, i6);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final Object m(int i6) {
        return this.f5535w.m(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final List o() {
        return this.f5535w.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5535w.size();
    }
}
