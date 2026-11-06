package W2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Object f4411F = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public transient int f4412A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public transient int f4413B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public transient c f4414C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public transient c f4415D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public transient f f4416E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient Object f4417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient int[] f4418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient Object[] f4419y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public transient Object[] f4420z;

    public static g a() {
        g gVar = new g();
        gVar.f4412A = C0.b(3, 1);
        return gVar;
    }

    public final Map b() {
        Object obj = this.f4417w;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f4412A & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f4412A += 32;
        Map mapB = b();
        if (mapB != null) {
            this.f4412A = C0.b(size(), 3);
            mapB.clear();
            this.f4417w = null;
        } else {
            Arrays.fill(i(), 0, this.f4413B, (Object) null);
            Arrays.fill(j(), 0, this.f4413B, (Object) null);
            Object obj = this.f4417w;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(h(), 0, this.f4413B, 0);
        }
        this.f4413B = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        return mapB != null ? mapB.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i6 = 0; i6 < this.f4413B; i6++) {
            if (C0.d(obj, j()[i6])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iE = Y2.b.E(obj);
        int iC = c();
        Object obj2 = this.f4417w;
        Objects.requireNonNull(obj2);
        int iF = Y2.b.F(iE & iC, obj2);
        if (iF == 0) {
            return -1;
        }
        int i6 = ~iC;
        int i7 = iE & i6;
        do {
            int i8 = iF - 1;
            int i9 = h()[i8];
            if ((i9 & i6) == i7 && C0.d(obj, i()[i8])) {
                return i8;
            }
            iF = i9 & iC;
        } while (iF != 0);
        return -1;
    }

    public final void e(int i6, int i7) {
        Object obj = this.f4417w;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i8 = size - 1;
        if (i6 >= i8) {
            objArrI[i6] = null;
            objArrJ[i6] = null;
            iArrH[i6] = 0;
            return;
        }
        Object obj2 = objArrI[i8];
        objArrI[i6] = obj2;
        objArrJ[i6] = objArrJ[i8];
        objArrI[i8] = null;
        objArrJ[i8] = null;
        iArrH[i6] = iArrH[i8];
        iArrH[i8] = 0;
        int iE = Y2.b.E(obj2) & i7;
        int iF = Y2.b.F(iE, obj);
        if (iF == size) {
            Y2.b.G(iE, i6 + 1, obj);
            return;
        }
        while (true) {
            int i9 = iF - 1;
            int i10 = iArrH[i9];
            int i11 = i10 & i7;
            if (i11 == size) {
                iArrH[i9] = Y2.b.u(i10, i6 + 1, i7);
                return;
            }
            iF = i11;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c cVar = this.f4415D;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this, 0);
        this.f4415D = cVar2;
        return cVar2;
    }

    public final boolean f() {
        return this.f4417w == null;
    }

    public final Object g(Object obj) {
        boolean zF = f();
        Object obj2 = f4411F;
        if (zF) {
            return obj2;
        }
        int iC = c();
        Object obj3 = this.f4417w;
        Objects.requireNonNull(obj3);
        int iY = Y2.b.y(obj, null, iC, obj3, h(), i(), null);
        if (iY == -1) {
            return obj2;
        }
        Object obj4 = j()[iY];
        e(iY, iC);
        this.f4413B--;
        this.f4412A += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.f4418x;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f4419y;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f4420z;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i6, int i7, int i8, int i9) {
        Object objK = Y2.b.k(i7);
        int i10 = i7 - 1;
        if (i9 != 0) {
            Y2.b.G(i8 & i10, i9 + 1, objK);
        }
        Object obj = this.f4417w;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i11 = 0; i11 <= i6; i11++) {
            int iF = Y2.b.F(i11, obj);
            while (iF != 0) {
                int i12 = iF - 1;
                int i13 = iArrH[i12];
                int i14 = ((~i6) & i13) | i11;
                int i15 = i14 & i10;
                int iF2 = Y2.b.F(i15, objK);
                Y2.b.G(i15, iF, objK);
                iArrH[i12] = Y2.b.u(i14, iF2, i10);
                iF = i13 & i6;
            }
        }
        this.f4417w = objK;
        this.f4412A = Y2.b.u(this.f4412A, 32 - Integer.numberOfLeadingZeros(i10), 31);
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        c cVar = this.f4414C;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this, 1);
        this.f4414C = cVar2;
        return cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0102 -> B:41:0x00e8). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.g.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f4411F) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.f4413B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        f fVar = this.f4416E;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f4416E = fVar2;
        return fVar2;
    }
}
