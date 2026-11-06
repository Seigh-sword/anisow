package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: s.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1281c implements Collection, Set {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f12494A = new int[0];

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Object[] f12495B = new Object[0];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Object[] f12496C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static int f12497D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static Object[] f12498E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static int f12499F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f12500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f12501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12502y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1279a f12503z;

    public C1281c(int i6) {
        if (i6 == 0) {
            this.f12500w = f12494A;
            this.f12501x = f12495B;
        } else {
            b(i6);
        }
        this.f12502y = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (C1281c.class) {
                try {
                    if (f12499F < 10) {
                        objArr[0] = f12498E;
                        objArr[1] = iArr;
                        for (int i7 = i6 - 1; i7 >= 2; i7--) {
                            objArr[i7] = null;
                        }
                        f12498E = objArr;
                        f12499F++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1281c.class) {
                try {
                    if (f12497D < 10) {
                        objArr[0] = f12496C;
                        objArr[1] = iArr;
                        for (int i8 = i6 - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f12496C = objArr;
                        f12497D++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i6;
        int iE;
        if (obj == null) {
            iE = f();
            i6 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i6 = iHashCode;
            iE = e(iHashCode, obj);
        }
        if (iE >= 0) {
            return false;
        }
        int i7 = ~iE;
        int i8 = this.f12502y;
        int[] iArr = this.f12500w;
        if (i8 >= iArr.length) {
            int i9 = 8;
            if (i8 >= 8) {
                i9 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f12501x;
            b(i9);
            int[] iArr2 = this.f12500w;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f12501x, 0, objArr.length);
            }
            c(iArr, objArr, this.f12502y);
        }
        int i10 = this.f12502y;
        if (i7 < i10) {
            int[] iArr3 = this.f12500w;
            int i11 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i11, i10 - i7);
            Object[] objArr2 = this.f12501x;
            System.arraycopy(objArr2, i7, objArr2, i11, this.f12502y - i7);
        }
        this.f12500w[i7] = i6;
        this.f12501x[i7] = obj;
        this.f12502y++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f12502y;
        int[] iArr = this.f12500w;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12501x;
            b(size);
            int i6 = this.f12502y;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.f12500w, 0, i6);
                System.arraycopy(objArr, 0, this.f12501x, 0, this.f12502y);
            }
            c(iArr, objArr, this.f12502y);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i6) {
        if (i6 == 8) {
            synchronized (C1281c.class) {
                try {
                    Object[] objArr = f12498E;
                    if (objArr != null) {
                        this.f12501x = objArr;
                        f12498E = (Object[]) objArr[0];
                        this.f12500w = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f12499F--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i6 == 4) {
            synchronized (C1281c.class) {
                try {
                    Object[] objArr2 = f12496C;
                    if (objArr2 != null) {
                        this.f12501x = objArr2;
                        f12496C = (Object[]) objArr2[0];
                        this.f12500w = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f12497D--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f12500w = new int[i6];
        this.f12501x = new Object[i6];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i6 = this.f12502y;
        if (i6 != 0) {
            c(this.f12500w, this.f12501x, i6);
            this.f12500w = f12494A;
            this.f12501x = f12495B;
            this.f12502y = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int e(int i6, Object obj) {
        int i7 = this.f12502y;
        if (i7 == 0) {
            return -1;
        }
        int iA = AbstractC1282d.a(i7, i6, this.f12500w);
        if (iA < 0 || obj.equals(this.f12501x[iA])) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.f12500w[i8] == i6) {
            if (obj.equals(this.f12501x[i8])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.f12500w[i9] == i6; i9--) {
            if (obj.equals(this.f12501x[i9])) {
                return i9;
            }
        }
        return ~i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f12502y != set.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.f12502y; i6++) {
                try {
                    if (!set.contains(this.f12501x[i6])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i6 = this.f12502y;
        if (i6 == 0) {
            return -1;
        }
        int iA = AbstractC1282d.a(i6, 0, this.f12500w);
        if (iA < 0 || this.f12501x[iA] == null) {
            return iA;
        }
        int i7 = iA + 1;
        while (i7 < i6 && this.f12500w[i7] == 0) {
            if (this.f12501x[i7] == null) {
                return i7;
            }
            i7++;
        }
        for (int i8 = iA - 1; i8 >= 0 && this.f12500w[i8] == 0; i8--) {
            if (this.f12501x[i8] == null) {
                return i8;
            }
        }
        return ~i7;
    }

    public final void g(int i6) {
        Object[] objArr = this.f12501x;
        Object obj = objArr[i6];
        int i7 = this.f12502y;
        if (i7 <= 1) {
            c(this.f12500w, objArr, i7);
            this.f12500w = f12494A;
            this.f12501x = f12495B;
            this.f12502y = 0;
            return;
        }
        int[] iArr = this.f12500w;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            int i8 = i7 - 1;
            this.f12502y = i8;
            if (i6 < i8) {
                int i9 = i6 + 1;
                System.arraycopy(iArr, i9, iArr, i6, i8 - i6);
                Object[] objArr2 = this.f12501x;
                System.arraycopy(objArr2, i9, objArr2, i6, this.f12502y - i6);
            }
            this.f12501x[this.f12502y] = null;
            return;
        }
        b(i7 > 8 ? i7 + (i7 >> 1) : 8);
        this.f12502y--;
        if (i6 > 0) {
            System.arraycopy(iArr, 0, this.f12500w, 0, i6);
            System.arraycopy(objArr, 0, this.f12501x, 0, i6);
        }
        int i10 = this.f12502y;
        if (i6 < i10) {
            int i11 = i6 + 1;
            System.arraycopy(iArr, i11, this.f12500w, i6, i10 - i6);
            System.arraycopy(objArr, i11, this.f12501x, i6, this.f12502y - i6);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f12500w;
        int i6 = this.f12502y;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += iArr[i8];
        }
        return i7;
    }

    public final int indexOf(Object obj) {
        return obj == null ? f() : e(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12502y <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i6 = 1;
        if (this.f12503z == null) {
            this.f12503z = new C1279a(1, this);
        }
        C1279a c1279a = this.f12503z;
        if (((h) c1279a.f9699b) == null) {
            c1279a.f9699b = new h(c1279a, i6);
        }
        return ((h) c1279a.f9699b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z5 = false;
        for (int i6 = this.f12502y - 1; i6 >= 0; i6--) {
            if (!collection.contains(this.f12501x[i6])) {
                g(i6);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f12502y;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i6 = this.f12502y;
        Object[] objArr = new Object[i6];
        System.arraycopy(this.f12501x, 0, objArr, 0, i6);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12502y * 14);
        sb.append('{');
        for (int i6 = 0; i6 < this.f12502y; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = this.f12501x[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f12502y) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f12502y);
        }
        System.arraycopy(this.f12501x, 0, objArr, 0, this.f12502y);
        int length = objArr.length;
        int i6 = this.f12502y;
        if (length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
