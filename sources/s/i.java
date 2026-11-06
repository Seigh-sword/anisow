package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import l.AbstractC0911d;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12523w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AbstractC0911d f12526z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12525y = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12524x = -1;

    public i(AbstractC0911d abstractC0911d) {
        this.f12526z = abstractC0911d;
        this.f12523w = abstractC0911d.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f12525y) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i6 = this.f12524x;
        AbstractC0911d abstractC0911d = this.f12526z;
        Object objD = abstractC0911d.d(i6, 0);
        if (key != objD && (key == null || !key.equals(objD))) {
            return false;
        }
        Object value = entry.getValue();
        Object objD2 = abstractC0911d.d(this.f12524x, 1);
        return value == objD2 || (value != null && value.equals(objD2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f12525y) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f12526z.d(this.f12524x, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f12525y) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f12526z.d(this.f12524x, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12524x < this.f12523w;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f12525y) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i6 = this.f12524x;
        AbstractC0911d abstractC0911d = this.f12526z;
        Object objD = abstractC0911d.d(i6, 0);
        Object objD2 = abstractC0911d.d(this.f12524x, 1);
        return (objD == null ? 0 : objD.hashCode()) ^ (objD2 != null ? objD2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12524x++;
        this.f12525y = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12525y) {
            throw new IllegalStateException();
        }
        this.f12526z.j(this.f12524x);
        this.f12524x--;
        this.f12523w--;
        this.f12525y = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12525y) {
            return this.f12526z.k(this.f12524x, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
