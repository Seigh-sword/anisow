package W2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4405y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g f4406z;

    public d(g gVar) {
        this.f4406z = gVar;
        this.f4403w = gVar.f4412A;
        this.f4404x = gVar.isEmpty() ? -1 : 0;
        this.f4405y = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4404x >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object eVar;
        g gVar = this.f4406z;
        if (gVar.f4412A != this.f4403w) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f4404x;
        this.f4405y = i6;
        b bVar = (b) this;
        int i7 = bVar.f4399A;
        g gVar2 = bVar.f4400B;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                eVar = gVar2.i()[i6];
                break;
            case 1:
                eVar = new e(gVar2, i6);
                break;
            default:
                eVar = gVar2.j()[i6];
                break;
        }
        int i8 = this.f4404x + 1;
        if (i8 >= gVar.f4413B) {
            i8 = -1;
        }
        this.f4404x = i8;
        return eVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        g gVar = this.f4406z;
        int i6 = gVar.f4412A;
        int i7 = this.f4403w;
        if (i6 != i7) {
            throw new ConcurrentModificationException();
        }
        int i8 = this.f4405y;
        if (!(i8 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f4403w = i7 + 32;
        gVar.remove(gVar.i()[i8]);
        this.f4404x--;
        this.f4405y = -1;
    }
}
