package o0;

import java.util.Iterator;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: o0.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1175b1 extends AbstractC1178c1 implements Iterable, E4.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f11896A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f11897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f11898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f11899y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f11900z;

    static {
        new C1175b1(t4.p.f12756w, null, null, 0, 0);
    }

    public C1175b1(List list, Integer num, Integer num2, int i6, int i7) {
        this.f11897w = list;
        this.f11898x = num;
        this.f11899y = num2;
        this.f11900z = i6;
        this.f11896A = i7;
        if (i6 != Integer.MIN_VALUE && i6 < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
        }
        if (i7 != Integer.MIN_VALUE && i7 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175b1)) {
            return false;
        }
        C1175b1 c1175b1 = (C1175b1) obj;
        return AbstractC1305a.c(this.f11897w, c1175b1.f11897w) && AbstractC1305a.c(this.f11898x, c1175b1.f11898x) && AbstractC1305a.c(this.f11899y, c1175b1.f11899y) && this.f11900z == c1175b1.f11900z && this.f11896A == c1175b1.f11896A;
    }

    public final int hashCode() {
        int iHashCode = this.f11897w.hashCode() * 31;
        Object obj = this.f11898x;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f11899y;
        return Integer.hashCode(this.f11896A) + ((Integer.hashCode(this.f11900z) + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f11897w.listIterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.f11897w;
        sb.append(list.size());
        sb.append("\n                    |   first Item: ");
        sb.append(t4.n.c0(list));
        sb.append("\n                    |   last Item: ");
        sb.append(t4.n.h0(list));
        sb.append("\n                    |   nextKey: ");
        sb.append(this.f11899y);
        sb.append("\n                    |   prevKey: ");
        sb.append(this.f11898x);
        sb.append("\n                    |   itemsBefore: ");
        sb.append(this.f11900z);
        sb.append("\n                    |   itemsAfter: ");
        sb.append(this.f11896A);
        sb.append("\n                    |) ");
        return S3.a.Q(sb.toString());
    }
}
