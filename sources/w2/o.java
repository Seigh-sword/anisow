package W2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends h implements Set {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f4436y = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient k f4437x;

    public static int g(int i6) {
        int iMax = Math.max(i6, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static o h(int i6, Object... objArr) {
        if (i6 == 0) {
            return w.f4458F;
        }
        if (i6 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new z(obj);
        }
        int iG = g(i6);
        Object[] objArr2 = new Object[iG];
        int i7 = iG - 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i10);
                throw new NullPointerException(sb.toString());
            }
            int iHashCode = obj2.hashCode();
            int iD = Y2.b.D(iHashCode);
            while (true) {
                int i11 = iD & i7;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i9] = obj2;
                    objArr2[i11] = obj2;
                    i8 += iHashCode;
                    i9++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iD++;
            }
        }
        Arrays.fill(objArr, i9, i6, (Object) null);
        if (i9 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new z(obj4);
        }
        if (g(i9) < iG / 2) {
            return h(i9, objArr);
        }
        int length = objArr.length;
        if (i9 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new w(i8, i7, i9, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o) && (this instanceof w)) {
            o oVar = (o) obj;
            oVar.getClass();
            if ((oVar instanceof w) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i6 = ~(~(i6 + (next != null ? next.hashCode() : 0)));
        }
        return i6;
    }
}
