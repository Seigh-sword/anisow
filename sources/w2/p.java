package W2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends A {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f4439x;

    public p(Object obj) {
        this.f4439x = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4438w;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4438w) {
            throw new NoSuchElementException();
        }
        this.f4438w = true;
        return this.f4439x;
    }
}
