package s;

/* JADX INFO: renamed from: s.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1283e implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Object f12506A = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12507w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long[] f12508x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object[] f12509y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12510z;

    public C1283e() {
        int i6;
        int i7 = 4;
        while (true) {
            i6 = 80;
            if (i7 >= 32) {
                break;
            }
            int i8 = (1 << i7) - 12;
            if (80 <= i8) {
                i6 = i8;
                break;
            }
            i7++;
        }
        int i9 = i6 / 8;
        this.f12508x = new long[i9];
        this.f12509y = new Object[i9];
    }

    public final void a() {
        int i6 = this.f12510z;
        Object[] objArr = this.f12509y;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f12510z = 0;
        this.f12507w = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1283e clone() {
        try {
            C1283e c1283e = (C1283e) super.clone();
            c1283e.f12508x = (long[]) this.f12508x.clone();
            c1283e.f12509y = (Object[]) this.f12509y.clone();
            return c1283e;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final void e() {
        int i6 = this.f12510z;
        long[] jArr = this.f12508x;
        Object[] objArr = this.f12509y;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (obj != f12506A) {
                if (i8 != i7) {
                    jArr[i7] = jArr[i8];
                    objArr[i7] = obj;
                    objArr[i8] = null;
                }
                i7++;
            }
        }
        this.f12507w = false;
        this.f12510z = i7;
    }

    public final Object f(long j6, Long l5) {
        Object obj;
        int iB = AbstractC1282d.b(this.f12508x, this.f12510z, j6);
        return (iB < 0 || (obj = this.f12509y[iB]) == f12506A) ? l5 : obj;
    }

    public final void i(long j6, Object obj) {
        int iB = AbstractC1282d.b(this.f12508x, this.f12510z, j6);
        if (iB >= 0) {
            this.f12509y[iB] = obj;
            return;
        }
        int i6 = ~iB;
        int i7 = this.f12510z;
        if (i6 < i7) {
            Object[] objArr = this.f12509y;
            if (objArr[i6] == f12506A) {
                this.f12508x[i6] = j6;
                objArr[i6] = obj;
                return;
            }
        }
        if (this.f12507w && i7 >= this.f12508x.length) {
            e();
            i6 = ~AbstractC1282d.b(this.f12508x, this.f12510z, j6);
        }
        int i8 = this.f12510z;
        if (i8 >= this.f12508x.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] jArr = new long[i12];
            Object[] objArr2 = new Object[i12];
            long[] jArr2 = this.f12508x;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12509y;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12508x = jArr;
            this.f12509y = objArr2;
        }
        int i13 = this.f12510z - i6;
        if (i13 != 0) {
            long[] jArr3 = this.f12508x;
            int i14 = i6 + 1;
            System.arraycopy(jArr3, i6, jArr3, i14, i13);
            Object[] objArr4 = this.f12509y;
            System.arraycopy(objArr4, i6, objArr4, i14, this.f12510z - i6);
        }
        this.f12508x[i6] = j6;
        this.f12509y[i6] = obj;
        this.f12510z++;
    }

    public final int j() {
        if (this.f12507w) {
            e();
        }
        return this.f12510z;
    }

    public final Object k(int i6) {
        if (this.f12507w) {
            e();
        }
        return this.f12509y[i6];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12510z * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f12510z; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            if (this.f12507w) {
                e();
            }
            sb.append(this.f12508x[i6]);
            sb.append('=');
            Object objK = k(i6);
            if (objK != this) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
