package W2;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractCollection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f4410w;

    public f(g gVar) {
        this.f4410w = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f4410w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        g gVar = this.f4410w;
        Map mapB = gVar.b();
        return mapB != null ? mapB.values().iterator() : new b(gVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4410w.size();
    }
}
