package S3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final B.h f3276E = new B.h(6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f3277A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final o f3278B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public m f3279C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public m f3280D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Comparator f3281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f3283y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3284z;

    public p(boolean z5) {
        B.h hVar = f3276E;
        this.f3284z = 0;
        this.f3277A = 0;
        this.f3281w = hVar;
        this.f3282x = z5;
        this.f3278B = new o(z5);
    }

    public final o a(Object obj, boolean z5) {
        int iCompareTo;
        o oVar;
        o oVar2 = this.f3283y;
        B.h hVar = f3276E;
        Comparator comparator = this.f3281w;
        if (oVar2 != null) {
            Comparable comparable = comparator == hVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = oVar2.f3268B;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return oVar2;
                }
                o oVar3 = iCompareTo < 0 ? oVar2.f3273x : oVar2.f3274y;
                if (oVar3 == null) {
                    break;
                }
                oVar2 = oVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z5) {
            return null;
        }
        o oVar4 = this.f3278B;
        if (oVar2 != null) {
            oVar = new o(this.f3282x, oVar2, obj, oVar4, oVar4.f3267A);
            if (iCompareTo < 0) {
                oVar2.f3273x = oVar;
            } else {
                oVar2.f3274y = oVar;
            }
            b(oVar2, true);
        } else {
            if (comparator == hVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            oVar = new o(this.f3282x, oVar2, obj, oVar4, oVar4.f3267A);
            this.f3283y = oVar;
        }
        this.f3284z++;
        this.f3277A++;
        return oVar;
    }

    public final void b(o oVar, boolean z5) {
        while (oVar != null) {
            o oVar2 = oVar.f3273x;
            o oVar3 = oVar.f3274y;
            int i6 = oVar2 != null ? oVar2.f3271E : 0;
            int i7 = oVar3 != null ? oVar3.f3271E : 0;
            int i8 = i6 - i7;
            if (i8 == -2) {
                o oVar4 = oVar3.f3273x;
                o oVar5 = oVar3.f3274y;
                int i9 = (oVar4 != null ? oVar4.f3271E : 0) - (oVar5 != null ? oVar5.f3271E : 0);
                if (i9 != -1 && (i9 != 0 || z5)) {
                    f(oVar3);
                }
                e(oVar);
                if (z5) {
                    return;
                }
            } else if (i8 == 2) {
                o oVar6 = oVar2.f3273x;
                o oVar7 = oVar2.f3274y;
                int i10 = (oVar6 != null ? oVar6.f3271E : 0) - (oVar7 != null ? oVar7.f3271E : 0);
                if (i10 != 1 && (i10 != 0 || z5)) {
                    e(oVar2);
                }
                f(oVar);
                if (z5) {
                    return;
                }
            } else if (i8 == 0) {
                oVar.f3271E = i6 + 1;
                if (z5) {
                    return;
                }
            } else {
                oVar.f3271E = Math.max(i6, i7) + 1;
                if (!z5) {
                    return;
                }
            }
            oVar = oVar.f3272w;
        }
    }

    public final void c(o oVar, boolean z5) {
        o oVar2;
        o oVar3;
        int i6;
        if (z5) {
            o oVar4 = oVar.f3267A;
            oVar4.f3275z = oVar.f3275z;
            oVar.f3275z.f3267A = oVar4;
        }
        o oVar5 = oVar.f3273x;
        o oVar6 = oVar.f3274y;
        o oVar7 = oVar.f3272w;
        int i7 = 0;
        if (oVar5 == null || oVar6 == null) {
            if (oVar5 != null) {
                d(oVar, oVar5);
                oVar.f3273x = null;
            } else if (oVar6 != null) {
                d(oVar, oVar6);
                oVar.f3274y = null;
            } else {
                d(oVar, null);
            }
            b(oVar7, false);
            this.f3284z--;
            this.f3277A++;
            return;
        }
        if (oVar5.f3271E > oVar6.f3271E) {
            do {
                oVar3 = oVar5;
                oVar5 = oVar5.f3274y;
            } while (oVar5 != null);
        } else {
            do {
                oVar2 = oVar6;
                oVar6 = oVar6.f3273x;
            } while (oVar6 != null);
            oVar3 = oVar2;
        }
        c(oVar3, false);
        o oVar8 = oVar.f3273x;
        if (oVar8 != null) {
            i6 = oVar8.f3271E;
            oVar3.f3273x = oVar8;
            oVar8.f3272w = oVar3;
            oVar.f3273x = null;
        } else {
            i6 = 0;
        }
        o oVar9 = oVar.f3274y;
        if (oVar9 != null) {
            i7 = oVar9.f3271E;
            oVar3.f3274y = oVar9;
            oVar9.f3272w = oVar3;
            oVar.f3274y = null;
        }
        oVar3.f3271E = Math.max(i6, i7) + 1;
        d(oVar, oVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3283y = null;
        this.f3284z = 0;
        this.f3277A++;
        o oVar = this.f3278B;
        oVar.f3267A = oVar;
        oVar.f3275z = oVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        o oVarA = null;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return oVarA != null;
    }

    public final void d(o oVar, o oVar2) {
        o oVar3 = oVar.f3272w;
        oVar.f3272w = null;
        if (oVar2 != null) {
            oVar2.f3272w = oVar3;
        }
        if (oVar3 == null) {
            this.f3283y = oVar2;
        } else if (oVar3.f3273x == oVar) {
            oVar3.f3273x = oVar2;
        } else {
            oVar3.f3274y = oVar2;
        }
    }

    public final void e(o oVar) {
        o oVar2 = oVar.f3273x;
        o oVar3 = oVar.f3274y;
        o oVar4 = oVar3.f3273x;
        o oVar5 = oVar3.f3274y;
        oVar.f3274y = oVar4;
        if (oVar4 != null) {
            oVar4.f3272w = oVar;
        }
        d(oVar, oVar3);
        oVar3.f3273x = oVar;
        oVar.f3272w = oVar3;
        int iMax = Math.max(oVar2 != null ? oVar2.f3271E : 0, oVar4 != null ? oVar4.f3271E : 0) + 1;
        oVar.f3271E = iMax;
        oVar3.f3271E = Math.max(iMax, oVar5 != null ? oVar5.f3271E : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.f3279C;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 0);
        this.f3279C = mVar2;
        return mVar2;
    }

    public final void f(o oVar) {
        o oVar2 = oVar.f3273x;
        o oVar3 = oVar.f3274y;
        o oVar4 = oVar2.f3273x;
        o oVar5 = oVar2.f3274y;
        oVar.f3273x = oVar5;
        if (oVar5 != null) {
            oVar5.f3272w = oVar;
        }
        d(oVar, oVar2);
        oVar2.f3274y = oVar;
        oVar.f3272w = oVar2;
        int iMax = Math.max(oVar3 != null ? oVar3.f3271E : 0, oVar5 != null ? oVar5.f3271E : 0) + 1;
        oVar.f3271E = iMax;
        oVar2.f3271E = Math.max(iMax, oVar4 != null ? oVar4.f3271E : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        o oVarA;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
                oVarA = null;
            }
        } else {
            oVarA = null;
        }
        if (oVarA != null) {
            return oVarA.f3270D;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.f3280D;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 1);
        this.f3280D = mVar2;
        return mVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f3282x) {
            throw new NullPointerException("value == null");
        }
        o oVarA = a(obj, true);
        Object obj3 = oVarA.f3270D;
        oVarA.f3270D = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o oVarA;
        if (obj != null) {
            try {
                oVarA = a(obj, false);
            } catch (ClassCastException unused) {
                oVarA = null;
            }
        } else {
            oVarA = null;
        }
        if (oVarA != null) {
            c(oVarA, true);
        }
        if (oVarA != null) {
            return oVarA.f3270D;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3284z;
    }
}
