package o0;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends m3.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11826c;

    public P0(int i6, int i7, int i8) {
        this.f11824a = i6;
        this.f11825b = i7;
        this.f11826c = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P0) {
            P0 p02 = (P0) obj;
            if (this.f11824a == p02.f11824a && this.f11825b == p02.f11825b && this.f11826c == p02.f11826c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11826c) + Integer.hashCode(this.f11825b) + Integer.hashCode(this.f11824a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i6 = this.f11824a;
        sb.append(i6);
        sb.append(" items (\n                    |   dropCount: ");
        sb.append(i6);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.f11825b);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.f11826c);
        sb.append("\n                    |)\n                    |");
        return S3.a.Q(sb.toString());
    }
}
