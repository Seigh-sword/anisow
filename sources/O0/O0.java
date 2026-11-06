package o0;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends m3.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11820d;

    public O0(int i6, int i7, int i8, int i9) {
        this.f11817a = i6;
        this.f11818b = i7;
        this.f11819c = i8;
        this.f11820d = i9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O0) {
            O0 o02 = (O0) obj;
            if (this.f11817a == o02.f11817a && this.f11818b == o02.f11818b && this.f11819c == o02.f11819c && this.f11820d == o02.f11820d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11820d) + Integer.hashCode(this.f11819c) + Integer.hashCode(this.f11818b) + Integer.hashCode(this.f11817a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i6 = this.f11818b;
        sb.append(i6);
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.f11817a);
        sb.append("\n                    |   dropCount: ");
        sb.append(i6);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f11819c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f11820d);
        sb.append("\n                    |)\n                    |");
        return S3.a.Q(sb.toString());
    }
}
