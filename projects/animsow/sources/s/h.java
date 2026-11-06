package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l.AbstractC0911d;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Set {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractC0911d f12522x;

    public /* synthetic */ h(AbstractC0911d abstractC0911d, int i6) {
        this.f12521w = i6;
        this.f12522x = abstractC0911d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0911d abstractC0911d = this.f12522x;
                int iF = abstractC0911d.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    abstractC0911d.i(entry.getKey(), entry.getValue());
                }
                return iF != abstractC0911d.f();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i6 = this.f12521w;
        AbstractC0911d abstractC0911d = this.f12522x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                abstractC0911d.c();
                break;
            default:
                abstractC0911d.c();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i6 = this.f12521w;
        AbstractC0911d abstractC0911d = this.f12522x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = abstractC0911d.g(entry.getKey());
                    if (iG >= 0) {
                        Object objD = abstractC0911d.d(iG, 1);
                        Object value = entry.getValue();
                        if (objD == value || (objD != null && objD.equals(value))) {
                        }
                        break;
                    }
                }
                break;
            default:
                if (abstractC0911d.g(obj) >= 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C1280b c1280bE = this.f12522x.e();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c1280bE.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f12521w) {
        }
        return AbstractC0911d.l(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i6 = this.f12521w;
        AbstractC0911d abstractC0911d = this.f12522x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int iHashCode = 0;
                for (int iF = abstractC0911d.f() - 1; iF >= 0; iF--) {
                    Object objD = abstractC0911d.d(iF, 0);
                    Object objD2 = abstractC0911d.d(iF, 1);
                    iHashCode += (objD == null ? 0 : objD.hashCode()) ^ (objD2 == null ? 0 : objD2.hashCode());
                }
                return iHashCode;
            default:
                int iHashCode2 = 0;
                for (int iF2 = abstractC0911d.f() - 1; iF2 >= 0; iF2--) {
                    Object objD3 = abstractC0911d.d(iF2, 0);
                    iHashCode2 += objD3 == null ? 0 : objD3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i6 = this.f12521w;
        AbstractC0911d abstractC0911d = this.f12522x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (abstractC0911d.f() == 0) {
                }
                break;
            default:
                if (abstractC0911d.f() == 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i6 = this.f12521w;
        AbstractC0911d abstractC0911d = this.f12522x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new i(abstractC0911d);
            default:
                return new C1285g(abstractC0911d, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException();
            default:
                AbstractC0911d abstractC0911d = this.f12522x;
                int iG = abstractC0911d.g(obj);
                if (iG < 0) {
                    return false;
                }
                abstractC0911d.j(iG);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException();
            default:
                C1280b c1280bE = this.f12522x.e();
                int i6 = c1280bE.f12534y;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c1280bE.remove(it.next());
                }
                return i6 != c1280bE.f12534y;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return AbstractC0911d.n(collection, this.f12522x.e());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i6 = this.f12521w;
        AbstractC0911d abstractC0911d = this.f12522x;
        switch (i6) {
        }
        return abstractC0911d.f();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException();
            default:
                AbstractC0911d abstractC0911d = this.f12522x;
                int iF = abstractC0911d.f();
                Object[] objArr = new Object[iF];
                for (int i6 = 0; i6 < iF; i6++) {
                    objArr[i6] = abstractC0911d.d(i6, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f12521w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return this.f12522x.o(0, objArr);
        }
    }
}
