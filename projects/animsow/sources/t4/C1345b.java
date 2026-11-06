package t4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: t4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1345b implements Iterator, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12741w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12742x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f12743y;

    public C1345b(AbstractC1348e abstractC1348e) {
        this.f12743y = abstractC1348e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f12741w;
        Object obj = this.f12743y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (this.f12742x < ((AbstractC1348e) obj).b()) {
                }
                break;
            default:
                if (this.f12742x < ((Object[]) obj).length) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.f12741w;
        Object obj = this.f12743y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f12742x;
                this.f12742x = i7 + 1;
                return ((AbstractC1348e) obj).get(i7);
            default:
                try {
                    int i8 = this.f12742x;
                    this.f12742x = i8 + 1;
                    return ((Object[]) obj)[i8];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f12742x--;
                    throw new NoSuchElementException(e6.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12741w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1345b(Object[] objArr) {
        AbstractC1305a.o(objArr, "array");
        this.f12743y = objArr;
    }
}
