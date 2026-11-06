package H4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f1067z = new c(1, 0, 1);

    public final boolean c(int i6) {
        return this.f1060w <= i6 && i6 <= this.f1061x;
    }

    @Override // H4.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1060w == cVar.f1060w) {
                    if (this.f1061x == cVar.f1061x) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // H4.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1060w * 31) + this.f1061x;
    }

    @Override // H4.a
    public final boolean isEmpty() {
        return this.f1060w > this.f1061x;
    }

    @Override // H4.a
    public final String toString() {
        return this.f1060w + ".." + this.f1061x;
    }
}
