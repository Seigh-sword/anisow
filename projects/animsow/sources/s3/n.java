package S3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f3263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o f3264x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p f3266z;

    public n(p pVar) {
        this.f3266z = pVar;
        this.f3263w = pVar.f3278B.f3275z;
        this.f3265y = pVar.f3277A;
    }

    public final o a() {
        o oVar = this.f3263w;
        p pVar = this.f3266z;
        if (oVar == pVar.f3278B) {
            throw new NoSuchElementException();
        }
        if (pVar.f3277A != this.f3265y) {
            throw new ConcurrentModificationException();
        }
        this.f3263w = oVar.f3275z;
        this.f3264x = oVar;
        return oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3263w != this.f3266z.f3278B;
    }

    @Override // java.util.Iterator
    public final void remove() {
        o oVar = this.f3264x;
        if (oVar == null) {
            throw new IllegalStateException();
        }
        p pVar = this.f3266z;
        pVar.c(oVar, true);
        this.f3264x = null;
        this.f3265y = pVar.f3277A;
    }
}
