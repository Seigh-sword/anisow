package t4;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import m2.C1017B;

/* JADX INFO: renamed from: t4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1346c extends C1345b implements ListIterator {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AbstractC1348e f12744z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346c(AbstractC1348e abstractC1348e, int i6) {
        super(abstractC1348e);
        this.f12744z = abstractC1348e;
        C1017B.k(i6, abstractC1348e.b());
        this.f12742x = i6;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12742x > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12742x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f12742x - 1;
        this.f12742x = i6;
        return this.f12744z.get(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12742x - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
