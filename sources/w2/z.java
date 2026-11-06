package W2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z extends o {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient Object f4471z;

    public z(Object obj) {
        this.f4471z = obj;
    }

    @Override // W2.h
    public final int b(Object[] objArr) {
        objArr[0] = this.f4471z;
        return 1;
    }

    @Override // W2.h, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4471z.equals(obj);
    }

    @Override // W2.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4471z.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new p(this.f4471z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f4471z.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
