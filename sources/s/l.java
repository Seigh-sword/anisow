package s;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Cloneable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f12535z = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f12536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f12537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12538y;

    public l() {
        int i6;
        int i7 = 4;
        while (true) {
            i6 = 40;
            if (i7 >= 32) {
                break;
            }
            int i8 = (1 << i7) - 12;
            if (40 <= i8) {
                i6 = i8;
                break;
            }
            i7++;
        }
        int i9 = i6 / 4;
        this.f12536w = new int[i9];
        this.f12537x = new Object[i9];
    }

    public final void a(int i6, Object obj) {
        int i7 = this.f12538y;
        if (i7 != 0 && i6 <= this.f12536w[i7 - 1]) {
            f(i6, obj);
            return;
        }
        if (i7 >= this.f12536w.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArr = new int[i11];
            Object[] objArr = new Object[i11];
            int[] iArr2 = this.f12536w;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f12537x;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f12536w = iArr;
            this.f12537x = objArr;
        }
        this.f12536w[i7] = i6;
        this.f12537x[i7] = obj;
        this.f12538y = i7 + 1;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f12536w = (int[]) this.f12536w.clone();
            lVar.f12537x = (Object[]) this.f12537x.clone();
            return lVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final Object e(int i6, Integer num) {
        Object obj;
        int iA = AbstractC1282d.a(this.f12538y, i6, this.f12536w);
        return (iA < 0 || (obj = this.f12537x[iA]) == f12535z) ? num : obj;
    }

    public final void f(int i6, Object obj) {
        int iA = AbstractC1282d.a(this.f12538y, i6, this.f12536w);
        if (iA >= 0) {
            this.f12537x[iA] = obj;
            return;
        }
        int i7 = ~iA;
        int i8 = this.f12538y;
        if (i7 < i8) {
            Object[] objArr = this.f12537x;
            if (objArr[i7] == f12535z) {
                this.f12536w[i7] = i6;
                objArr[i7] = obj;
                return;
            }
        }
        if (i8 >= this.f12536w.length) {
            int i9 = (i8 + 1) * 4;
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
            int i12 = i9 / 4;
            int[] iArr = new int[i12];
            Object[] objArr2 = new Object[i12];
            int[] iArr2 = this.f12536w;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f12537x;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12536w = iArr;
            this.f12537x = objArr2;
        }
        int i13 = this.f12538y - i7;
        if (i13 != 0) {
            int[] iArr3 = this.f12536w;
            int i14 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i14, i13);
            Object[] objArr4 = this.f12537x;
            System.arraycopy(objArr4, i7, objArr4, i14, this.f12538y - i7);
        }
        this.f12536w[i7] = i6;
        this.f12537x[i7] = obj;
        this.f12538y++;
    }

    public final String toString() {
        int i6 = this.f12538y;
        if (i6 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i6 * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f12538y; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(this.f12536w[i7]);
            sb.append('=');
            Object obj = this.f12537x[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
