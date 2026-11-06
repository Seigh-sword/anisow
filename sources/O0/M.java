package o0;

import d.AbstractC0628i;
import java.util.Iterator;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class M extends O {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M f11802g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f11803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H f11807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H f11808f;

    static {
        List listD = S3.a.D(y1.f12161d);
        F f6 = F.f11748c;
        F f7 = F.f11747b;
        f11802g = new M(I.f11772w, listD, 0, 0, new H(f6, f7, f7), null);
    }

    public M(I i6, List list, int i7, int i8, H h4, H h6) {
        this.f11803a = i6;
        this.f11804b = list;
        this.f11805c = i7;
        this.f11806d = i8;
        this.f11807e = h4;
        this.f11808f = h6;
        if (i6 != I.f11774y && i7 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.f("Prepend insert defining placeholdersBefore must be > 0, but was ", i7).toString());
        }
        if (i6 != I.f11773x && i8 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.f("Append insert defining placeholdersAfter must be > 0, but was ", i8).toString());
        }
        if (i6 == I.f11772w && !(!list.isEmpty())) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m5 = (M) obj;
        return this.f11803a == m5.f11803a && AbstractC1305a.c(this.f11804b, m5.f11804b) && this.f11805c == m5.f11805c && this.f11806d == m5.f11806d && AbstractC1305a.c(this.f11807e, m5.f11807e) && AbstractC1305a.c(this.f11808f, m5.f11808f);
    }

    public final int hashCode() {
        int iHashCode = (this.f11807e.hashCode() + ((Integer.hashCode(this.f11806d) + ((Integer.hashCode(this.f11805c) + ((this.f11804b.hashCode() + (this.f11803a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        H h4 = this.f11808f;
        return iHashCode + (h4 == null ? 0 : h4.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.f11804b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((y1) it.next()).f12163b.size();
        }
        int i6 = this.f11805c;
        String strValueOf = i6 != -1 ? String.valueOf(i6) : "none";
        int i7 = this.f11806d;
        String strValueOf2 = i7 != -1 ? String.valueOf(i7) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.f11803a);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        y1 y1Var = (y1) t4.n.c0(list3);
        Object objH0 = null;
        sb.append((y1Var == null || (list2 = y1Var.f12163b) == null) ? null : t4.n.c0(list2));
        sb.append("\n                    |   last item: ");
        y1 y1Var2 = (y1) t4.n.h0(list3);
        if (y1Var2 != null && (list = y1Var2.f12163b) != null) {
            objH0 = t4.n.h0(list);
        }
        sb.append(objH0);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.f11807e);
        sb.append("\n                    ");
        String string = sb.toString();
        H h4 = this.f11808f;
        if (h4 != null) {
            string = string + "|   mediatorLoadStates: " + h4 + '\n';
        }
        return S3.a.Q(string + "|)");
    }
}
