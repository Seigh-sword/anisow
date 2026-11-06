package J4;

import C4.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f1459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1460x = -2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f1461y;

    public b(c cVar) {
        this.f1461y = cVar;
    }

    public final void a() {
        Object objJ;
        int i6 = this.f1460x;
        c cVar = this.f1461y;
        if (i6 == -2) {
            objJ = ((C4.a) cVar.f1464c).b();
        } else {
            l lVar = cVar.f1463b;
            Object obj = this.f1459w;
            AbstractC1305a.l(obj);
            objJ = lVar.j(obj);
        }
        this.f1459w = objJ;
        this.f1460x = objJ == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1460x < 0) {
            a();
        }
        return this.f1460x == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1460x < 0) {
            a();
        }
        if (this.f1460x == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1459w;
        AbstractC1305a.m(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f1460x = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
