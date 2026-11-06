package s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import l.AbstractC0911d;

/* JADX INFO: renamed from: s.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1285g implements Iterator {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ AbstractC0911d f12516A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12518x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12519y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12520z = false;

    public C1285g(AbstractC0911d abstractC0911d, int i6) {
        this.f12516A = abstractC0911d;
        this.f12517w = i6;
        this.f12518x = abstractC0911d.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12519y < this.f12518x;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objD = this.f12516A.d(this.f12519y, this.f12517w);
        this.f12519y++;
        this.f12520z = true;
        return objD;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12520z) {
            throw new IllegalStateException();
        }
        int i6 = this.f12519y - 1;
        this.f12519y = i6;
        this.f12518x--;
        this.f12520z = false;
        this.f12516A.j(i6);
    }
}
