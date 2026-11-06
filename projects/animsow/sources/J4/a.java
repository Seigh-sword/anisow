package J4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f1458a;

    public a(d dVar) {
        this.f1458a = new AtomicReference(dVar);
    }

    @Override // J4.d
    public final Iterator iterator() {
        d dVar = (d) this.f1458a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
