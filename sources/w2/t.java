package W2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t extends o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final transient k f4448A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient n f4449z;

    public t(n nVar, u uVar) {
        this.f4449z = nVar;
        this.f4448A = uVar;
    }

    @Override // W2.h
    public final int b(Object[] objArr) {
        return this.f4448A.b(objArr);
    }

    @Override // W2.h, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4449z.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f4448A.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((v) this.f4449z).f4455B;
    }
}
