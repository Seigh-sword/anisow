package H4;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1061x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1062y;

    public a(int i6, int i7, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1060w = i6;
        if (i8 > 0) {
            if (i6 < i7) {
                int i9 = i7 % i8;
                int i10 = i6 % i8;
                int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
                i7 -= i11 < 0 ? i11 + i8 : i11;
            }
        } else {
            if (i8 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i6 > i7) {
                int i12 = -i8;
                int i13 = i6 % i12;
                int i14 = i7 % i12;
                int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                i7 += i15 < 0 ? i15 + i12 : i15;
            }
        }
        this.f1061x = i7;
        this.f1062y = i8;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b iterator() {
        return new b(this.f1060w, this.f1061x, this.f1062y);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f1060w != aVar.f1060w || this.f1061x != aVar.f1061x || this.f1062y != aVar.f1062y) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1060w * 31) + this.f1061x) * 31) + this.f1062y;
    }

    public boolean isEmpty() {
        int i6 = this.f1062y;
        int i7 = this.f1061x;
        int i8 = this.f1060w;
        if (i6 > 0) {
            if (i8 <= i7) {
                return false;
            }
        } else if (i8 >= i7) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i6 = this.f1061x;
        int i7 = this.f1060w;
        int i8 = this.f1062y;
        if (i8 > 0) {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append("..");
            sb.append(i6);
            sb.append(" step ");
            sb.append(i8);
        } else {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append(" downTo ");
            sb.append(i6);
            sb.append(" step ");
            sb.append(-i8);
        }
        return sb.toString();
    }
}
