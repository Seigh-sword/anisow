package o0;

import d.AbstractC0628i;
import h0.C0733A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G0 f11762e = new G0(M.f11802g);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11766d;

    public G0(int i6, int i7, List list) {
        AbstractC1305a.o(list, "pages");
        this.f11763a = t4.n.l0(list);
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((y1) it.next()).f12163b.size();
        }
        this.f11764b = size;
        this.f11765c = i6;
        this.f11766d = i7;
    }

    public final A1 a(int i6) {
        ArrayList arrayList;
        int i7 = 0;
        int size = i6 - this.f11765c;
        while (true) {
            arrayList = this.f11763a;
            if (size < ((y1) arrayList.get(i7)).f12163b.size() || i7 >= S3.a.u(arrayList)) {
                break;
            }
            size -= ((y1) arrayList.get(i7)).f12163b.size();
            i7++;
        }
        y1 y1Var = (y1) arrayList.get(i7);
        int i8 = i6 - this.f11765c;
        int iE = ((e() - i6) - this.f11766d) - 1;
        int iC = c();
        int iD = d();
        y1Var.getClass();
        return new A1(y1Var.f12164c, size, i8, iE, iC, iD);
    }

    public final Object b(int i6) {
        ArrayList arrayList = this.f11763a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int size2 = ((y1) arrayList.get(i7)).f12163b.size();
            if (size2 > i6) {
                break;
            }
            i6 -= size2;
            i7++;
        }
        return ((y1) arrayList.get(i7)).f12163b.get(i6);
    }

    public final int c() {
        Integer numValueOf;
        int[] iArr = ((y1) t4.n.b0(this.f11763a)).f12162a;
        AbstractC1305a.o(iArr, "<this>");
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i6 = iArr[0];
            H4.b it = new H4.c(1, iArr.length - 1, 1).iterator();
            while (it.f1065y) {
                int i7 = iArr[it.b()];
                if (i6 > i7) {
                    i6 = i7;
                }
            }
            numValueOf = Integer.valueOf(i6);
        }
        AbstractC1305a.l(numValueOf);
        return numValueOf.intValue();
    }

    public final int d() {
        Integer numValueOf;
        int[] iArr = ((y1) t4.n.g0(this.f11763a)).f12162a;
        AbstractC1305a.o(iArr, "<this>");
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i6 = iArr[0];
            H4.b it = new H4.c(1, iArr.length - 1, 1).iterator();
            while (it.f1065y) {
                int i7 = iArr[it.b()];
                if (i6 < i7) {
                    i6 = i7;
                }
            }
            numValueOf = Integer.valueOf(i6);
        }
        AbstractC1305a.l(numValueOf);
        return numValueOf.intValue();
    }

    public final int e() {
        return this.f11765c + this.f11764b + this.f11766d;
    }

    public final m3.v0 f(O o3) {
        m3.v0 p02;
        AbstractC1305a.o(o3, "pageEvent");
        boolean z5 = o3 instanceof M;
        ArrayList arrayList = this.f11763a;
        if (z5) {
            M m5 = (M) o3;
            List list = m5.f11804b;
            List list2 = list;
            Iterator it = list2.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((y1) it.next()).f12163b.size();
            }
            int iOrdinal = m5.f11803a.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C0733A();
                }
                int i6 = this.f11766d;
                int i7 = this.f11764b;
                arrayList.addAll(arrayList.size(), list);
                this.f11764b += size;
                this.f11766d = m5.f11806d;
                int i8 = this.f11765c + i7;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    t4.m.X(((y1) it2.next()).f12163b, arrayList2);
                }
                return new N0(i8, arrayList2, this.f11766d, i6);
            }
            int i9 = this.f11765c;
            arrayList.addAll(0, list);
            this.f11764b += size;
            this.f11765c = m5.f11805c;
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                t4.m.X(((y1) it3.next()).f12163b, arrayList3);
            }
            p02 = new Q0(this.f11765c, i9, arrayList3);
        } else {
            if (!(o3 instanceof L)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            L l5 = (L) o3;
            H4.c cVar = new H4.c(l5.f11797b, l5.f11798c, 1);
            Iterator it4 = arrayList.iterator();
            int size2 = 0;
            while (it4.hasNext()) {
                y1 y1Var = (y1) it4.next();
                int[] iArr = y1Var.f12162a;
                int length = iArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (cVar.c(iArr[i10])) {
                        size2 += y1Var.f12163b.size();
                        it4.remove();
                        break;
                    }
                    i10++;
                }
            }
            int i11 = this.f11764b - size2;
            this.f11764b = i11;
            I i12 = I.f11773x;
            I i13 = l5.f11796a;
            int i14 = l5.f11799d;
            if (i13 != i12) {
                int i15 = this.f11766d;
                this.f11766d = i14;
                return new O0(this.f11765c + i11, size2, i14, i15);
            }
            int i16 = this.f11765c;
            this.f11765c = i14;
            p02 = new P0(size2, i14, i16);
        }
        return p02;
    }

    public final String toString() {
        int i6 = this.f11764b;
        ArrayList arrayList = new ArrayList(i6);
        for (int i7 = 0; i7 < i6; i7++) {
            arrayList.add(b(i7));
        }
        String strF0 = t4.n.f0(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.f11765c);
        sb.append(" placeholders), ");
        sb.append(strF0);
        sb.append(", (");
        return AbstractC0628i.l(sb, this.f11766d, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G0(M m5) {
        this(m5.f11805c, m5.f11806d, m5.f11804b);
        AbstractC1305a.o(m5, "insertEvent");
    }
}
