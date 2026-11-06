package J4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Iterator f1466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f1467x;

    public h(c cVar) {
        this.f1467x = cVar;
        this.f1466w = ((d) cVar.f1464c).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1466w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1467x.f1463b.j(this.f1466w.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
