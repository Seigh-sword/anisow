package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0463n3;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Iterator {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f5506A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5508x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5509y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Iterator f5510z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(C0287l0 c0287l0) {
        this(c0287l0, 0);
        this.f5507w = 0;
    }

    public final Iterator a() {
        if (this.f5510z == null) {
            this.f5510z = ((C0287l0) this.f5506A).f5484y.entrySet().iterator();
        }
        return this.f5510z;
    }

    public final Iterator b() {
        if (this.f5510z != null) {
            return this.f5510z;
        }
        ((AbstractC0463n3) this.f5506A).getClass();
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f5507w;
        AbstractMap abstractMap = this.f5506A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0287l0 c0287l0 = (C0287l0) abstractMap;
                return this.f5508x + 1 < c0287l0.f5483x.size() || (!c0287l0.f5484y.isEmpty() && a().hasNext());
            default:
                int i7 = this.f5508x + 1;
                AbstractC0463n3 abstractC0463n3 = (AbstractC0463n3) abstractMap;
                abstractC0463n3.getClass();
                if (i7 < 0) {
                    return true;
                }
                abstractC0463n3.getClass();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.f5507w;
        AbstractMap abstractMap = this.f5506A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                this.f5509y = true;
                int i7 = this.f5508x + 1;
                this.f5508x = i7;
                C0287l0 c0287l0 = (C0287l0) abstractMap;
                return (Map.Entry) (i7 < c0287l0.f5483x.size() ? c0287l0.f5483x.get(this.f5508x) : a().next());
            default:
                this.f5509y = true;
                int i8 = this.f5508x + 1;
                this.f5508x = i8;
                AbstractC0463n3 abstractC0463n3 = (AbstractC0463n3) abstractMap;
                abstractC0463n3.getClass();
                if (i8 >= 0) {
                    return (Map.Entry) b().next();
                }
                abstractC0463n3.getClass();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i6 = this.f5507w;
        AbstractMap abstractMap = this.f5506A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!this.f5509y) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f5509y = false;
                C0287l0 c0287l0 = (C0287l0) abstractMap;
                int i7 = C0287l0.f5479C;
                c0287l0.b();
                if (this.f5508x >= c0287l0.f5483x.size()) {
                    a().remove();
                    return;
                }
                int i8 = this.f5508x;
                this.f5508x = i8 - 1;
                c0287l0.n(i8);
                return;
            default:
                if (!this.f5509y) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f5509y = false;
                AbstractC0463n3 abstractC0463n3 = (AbstractC0463n3) abstractMap;
                int i9 = AbstractC0463n3.f6902w;
                abstractC0463n3.g();
                int i10 = this.f5508x;
                abstractC0463n3.getClass();
                if (i10 >= 0) {
                    b().remove();
                    return;
                } else {
                    this.f5508x = i10 - 1;
                    abstractC0463n3.f(i10);
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(AbstractC0463n3 abstractC0463n3) {
        this(abstractC0463n3, 1);
        this.f5507w = 1;
    }

    public /* synthetic */ q0(AbstractMap abstractMap, int i6) {
        this.f5507w = i6;
        this.f5506A = abstractMap;
        this.f5508x = -1;
    }
}
