package H4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1066z;

    public b(int i6, int i7, int i8) {
        this.f1063w = i8;
        this.f1064x = i7;
        boolean z5 = true;
        if (i8 <= 0 ? i6 < i7 : i6 > i7) {
            z5 = false;
        }
        this.f1065y = z5;
        this.f1066z = z5 ? i6 : i7;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public final int b() {
        int i6 = this.f1066z;
        if (i6 != this.f1064x) {
            this.f1066z = this.f1063w + i6;
        } else {
            if (!this.f1065y) {
                throw new NoSuchElementException();
            }
            this.f1065y = false;
        }
        return i6;
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1065y;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
