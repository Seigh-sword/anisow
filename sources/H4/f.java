package H4;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f1068w == fVar.f1068w) {
                    if (this.f1069x == fVar.f1069x) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j6 = this.f1068w;
        long j7 = ((long) 31) * (j6 ^ (j6 >>> 32));
        long j8 = this.f1069x;
        return (int) (j7 + (j8 ^ (j8 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f1068w > this.f1069x;
    }

    public final String toString() {
        return this.f1068w + ".." + this.f1069x;
    }
}
