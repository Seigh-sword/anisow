package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f11934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J0 f11935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11936d;

    public f1(List list, Integer num, J0 j02, int i6) {
        AbstractC1305a.o(j02, "config");
        this.f11933a = list;
        this.f11934b = num;
        this.f11935c = j02;
        this.f11936d = i6;
    }

    public final C1175b1 a(int i6) {
        List list = this.f11933a;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((C1175b1) it.next()).f11897w.isEmpty()) {
                int size = i6 - this.f11936d;
                int i7 = 0;
                while (i7 < S3.a.u(list) && size > S3.a.u(((C1175b1) list.get(i7)).f11897w)) {
                    size -= ((C1175b1) list.get(i7)).f11897w.size();
                    i7++;
                }
                return (C1175b1) (size < 0 ? t4.n.b0(list) : list.get(i7));
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (AbstractC1305a.c(this.f11933a, f1Var.f11933a) && AbstractC1305a.c(this.f11934b, f1Var.f11934b) && AbstractC1305a.c(this.f11935c, f1Var.f11935c) && this.f11936d == f1Var.f11936d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11933a.hashCode();
        Integer num = this.f11934b;
        return Integer.hashCode(this.f11936d) + this.f11935c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PagingState(pages=" + this.f11933a + ", anchorPosition=" + this.f11934b + ", config=" + this.f11935c + ", leadingPlaceholderCount=" + this.f11936d + ')';
    }
}
