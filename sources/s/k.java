package s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static int f12528A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static Object[] f12529B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static int f12530C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static Object[] f12531z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f12532w = AbstractC1282d.f12504a;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f12533x = AbstractC1282d.f12505b;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12534y = 0;

    public static void c(int[] iArr, Object[] objArr, int i6) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f12530C < 10) {
                        objArr[0] = f12529B;
                        objArr[1] = iArr;
                        for (int i7 = (i6 << 1) - 1; i7 >= 2; i7--) {
                            objArr[i7] = null;
                        }
                        f12529B = objArr;
                        f12530C++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f12528A < 10) {
                        objArr[0] = f12531z;
                        objArr[1] = iArr;
                        for (int i8 = (i6 << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f12531z = objArr;
                        f12528A++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i6) {
        if (i6 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f12529B;
                    if (objArr != null) {
                        this.f12533x = objArr;
                        f12529B = (Object[]) objArr[0];
                        this.f12532w = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f12530C--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i6 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f12531z;
                    if (objArr2 != null) {
                        this.f12533x = objArr2;
                        f12531z = (Object[]) objArr2[0];
                        this.f12532w = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f12528A--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f12532w = new int[i6];
        this.f12533x = new Object[i6 << 1];
    }

    public final void b(int i6) {
        int i7 = this.f12534y;
        int[] iArr = this.f12532w;
        if (iArr.length < i6) {
            Object[] objArr = this.f12533x;
            a(i6);
            if (this.f12534y > 0) {
                System.arraycopy(iArr, 0, this.f12532w, 0, i7);
                System.arraycopy(objArr, 0, this.f12533x, 0, i7 << 1);
            }
            c(iArr, objArr, i7);
        }
        if (this.f12534y != i7) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i6 = this.f12534y;
        if (i6 > 0) {
            int[] iArr = this.f12532w;
            Object[] objArr = this.f12533x;
            this.f12532w = AbstractC1282d.f12504a;
            this.f12533x = AbstractC1282d.f12505b;
            this.f12534y = 0;
            c(iArr, objArr, i6);
        }
        if (this.f12534y > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i6, Object obj) {
        int i7 = this.f12534y;
        if (i7 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC1282d.a(i7, i6, this.f12532w);
            if (iA < 0 || obj.equals(this.f12533x[iA << 1])) {
                return iA;
            }
            int i8 = iA + 1;
            while (i8 < i7 && this.f12532w[i8] == i6) {
                if (obj.equals(this.f12533x[i8 << 1])) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = iA - 1; i9 >= 0 && this.f12532w[i9] == i6; i9--) {
                if (obj.equals(this.f12533x[i9 << 1])) {
                    return i9;
                }
            }
            return ~i8;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f12534y != kVar.f12534y) {
                return false;
            }
            for (int i6 = 0; i6 < this.f12534y; i6++) {
                try {
                    Object objH = h(i6);
                    Object objL = l(i6);
                    Object orDefault = kVar.getOrDefault(objH, null);
                    if (objL == null) {
                        if (orDefault != null || !kVar.containsKey(objH)) {
                            return false;
                        }
                    } else if (!objL.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f12534y != map.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f12534y; i7++) {
                try {
                    Object objH2 = h(i7);
                    Object objL2 = l(i7);
                    Object obj2 = map.get(objH2);
                    if (objL2 == null) {
                        if (obj2 != null || !map.containsKey(objH2)) {
                            return false;
                        }
                    } else if (!objL2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i6 = this.f12534y;
        if (i6 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC1282d.a(i6, 0, this.f12532w);
            if (iA < 0 || this.f12533x[iA << 1] == null) {
                return iA;
            }
            int i7 = iA + 1;
            while (i7 < i6 && this.f12532w[i7] == 0) {
                if (this.f12533x[i7 << 1] == null) {
                    return i7;
                }
                i7++;
            }
            for (int i8 = iA - 1; i8 >= 0 && this.f12532w[i8] == 0; i8--) {
                if (this.f12533x[i8 << 1] == null) {
                    return i8;
                }
            }
            return ~i7;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i6 = this.f12534y * 2;
        Object[] objArr = this.f12533x;
        if (obj == null) {
            for (int i7 = 1; i7 < i6; i7 += 2) {
                if (objArr[i7] == null) {
                    return i7 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i6; i8 += 2) {
            if (obj.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f12533x[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i6) {
        return this.f12533x[i6 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f12532w;
        Object[] objArr = this.f12533x;
        int i6 = this.f12534y;
        int i7 = 1;
        int i8 = 0;
        int iHashCode = 0;
        while (i8 < i6) {
            Object obj = objArr[i7];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i8];
            i8++;
            i7 += 2;
        }
        return iHashCode;
    }

    public void i(C1280b c1280b) {
        int i6 = c1280b.f12534y;
        b(this.f12534y + i6);
        if (this.f12534y != 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                put(c1280b.h(i7), c1280b.l(i7));
            }
        } else if (i6 > 0) {
            System.arraycopy(c1280b.f12532w, 0, this.f12532w, 0, i6);
            System.arraycopy(c1280b.f12533x, 0, this.f12533x, 0, i6 << 1);
            this.f12534y = i6;
        }
    }

    public final boolean isEmpty() {
        return this.f12534y <= 0;
    }

    public Object j(int i6) {
        Object[] objArr = this.f12533x;
        int i7 = i6 << 1;
        Object obj = objArr[i7 + 1];
        int i8 = this.f12534y;
        int i9 = 0;
        if (i8 <= 1) {
            c(this.f12532w, objArr, i8);
            this.f12532w = AbstractC1282d.f12504a;
            this.f12533x = AbstractC1282d.f12505b;
        } else {
            int i10 = i8 - 1;
            int[] iArr = this.f12532w;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i6 < i10) {
                    int i11 = i6 + 1;
                    int i12 = i10 - i6;
                    System.arraycopy(iArr, i11, iArr, i6, i12);
                    Object[] objArr2 = this.f12533x;
                    System.arraycopy(objArr2, i11 << 1, objArr2, i7, i12 << 1);
                }
                Object[] objArr3 = this.f12533x;
                int i13 = i10 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                a(i8 > 8 ? i8 + (i8 >> 1) : 8);
                if (i8 != this.f12534y) {
                    throw new ConcurrentModificationException();
                }
                if (i6 > 0) {
                    System.arraycopy(iArr, 0, this.f12532w, 0, i6);
                    System.arraycopy(objArr, 0, this.f12533x, 0, i7);
                }
                if (i6 < i10) {
                    int i14 = i6 + 1;
                    int i15 = i10 - i6;
                    System.arraycopy(iArr, i14, this.f12532w, i6, i15);
                    System.arraycopy(objArr, i14 << 1, this.f12533x, i7, i15 << 1);
                }
            }
            i9 = i10;
        }
        if (i8 != this.f12534y) {
            throw new ConcurrentModificationException();
        }
        this.f12534y = i9;
        return obj;
    }

    public Object k(int i6, Object obj) {
        int i7 = (i6 << 1) + 1;
        Object[] objArr = this.f12533x;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final Object l(int i6) {
        return this.f12533x[(i6 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i6;
        int iD;
        int i7 = this.f12534y;
        if (obj == null) {
            iD = f();
            i6 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i6 = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i8 = (iD << 1) + 1;
            Object[] objArr = this.f12533x;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~iD;
        int[] iArr = this.f12532w;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            Object[] objArr2 = this.f12533x;
            a(i10);
            if (i7 != this.f12534y) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f12532w;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f12533x, 0, objArr2.length);
            }
            c(iArr, objArr2, i7);
        }
        if (i9 < i7) {
            int[] iArr3 = this.f12532w;
            int i11 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i11, i7 - i9);
            Object[] objArr3 = this.f12533x;
            System.arraycopy(objArr3, i9 << 1, objArr3, i11 << 1, (this.f12534y - i9) << 1);
        }
        int i12 = this.f12534y;
        if (i7 == i12) {
            int[] iArr4 = this.f12532w;
            if (i9 < iArr4.length) {
                iArr4[i9] = i6;
                Object[] objArr4 = this.f12533x;
                int i13 = i9 << 1;
                objArr4[i13] = obj;
                objArr4[i13 + 1] = obj2;
                this.f12534y = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return j(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return k(iE, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f12534y;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12534y * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f12534y; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object objH = h(i6);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objL = l(i6);
            if (objL != this) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objL = l(iE);
        if (obj2 != objL && (obj2 == null || !obj2.equals(objL))) {
            return false;
        }
        j(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objL = l(iE);
        if (objL != obj2 && (obj2 == null || !obj2.equals(objL))) {
            return false;
        }
        k(iE, obj3);
        return true;
    }
}
