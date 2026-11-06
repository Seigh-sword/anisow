package W2;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ k f4423A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f4424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient int f4425z;

    public j(k kVar, int i6, int i7) {
        this.f4423A = kVar;
        this.f4424y = i6;
        this.f4425z = i7;
    }

    @Override // W2.h
    public final Object[] c() {
        return this.f4423A.c();
    }

    @Override // W2.h
    public final int e() {
        return this.f4423A.f() + this.f4424y + this.f4425z;
    }

    @Override // W2.h
    public final int f() {
        return this.f4423A.f() + this.f4424y;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Y2.b.e(i6, this.f4425z);
        return this.f4423A.get(i6 + this.f4424y);
    }

    @Override // W2.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // W2.k, java.util.List
    /* JADX INFO: renamed from: j */
    public final k subList(int i6, int i7) {
        Y2.b.i(i6, i7, this.f4425z);
        int i8 = this.f4424y;
        return this.f4423A.subList(i6 + i8, i7 + i8);
    }

    @Override // W2.k, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4425z;
    }

    @Override // W2.k, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i6) {
        return listIterator(i6);
    }
}
