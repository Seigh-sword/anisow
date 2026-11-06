package o0;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends m3.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f11831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f11832b;

    public R0(G0 g02, G0 g03) {
        this.f11831a = g02;
        this.f11832b = g03;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof R0) {
            h1 h1Var = this.f11831a;
            int i6 = ((G0) h1Var).f11765c;
            R0 r02 = (R0) obj;
            h1 h1Var2 = r02.f11831a;
            if (i6 == ((G0) h1Var2).f11765c && ((G0) h1Var).f11766d == ((G0) h1Var2).f11766d && ((G0) h1Var).e() == ((G0) r02.f11831a).e() && ((G0) h1Var).f11764b == ((G0) r02.f11831a).f11764b) {
                h1 h1Var3 = this.f11832b;
                int i7 = ((G0) h1Var3).f11765c;
                h1 h1Var4 = r02.f11832b;
                if (i7 == ((G0) h1Var4).f11765c && ((G0) h1Var3).f11766d == ((G0) h1Var4).f11766d && ((G0) h1Var3).e() == ((G0) r02.f11832b).e() && ((G0) h1Var3).f11764b == ((G0) r02.f11832b).f11764b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11832b.hashCode() + this.f11831a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        G0 g02 = (G0) this.f11831a;
        sb.append(g02.f11765c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(g02.f11766d);
        sb.append("\n                    |       size: ");
        sb.append(g02.e());
        sb.append("\n                    |       dataCount: ");
        sb.append(g02.f11764b);
        sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        G0 g03 = (G0) this.f11832b;
        sb.append(g03.f11765c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(g03.f11766d);
        sb.append("\n                    |       size: ");
        sb.append(g03.e());
        sb.append("\n                    |       dataCount: ");
        sb.append(g03.f11764b);
        sb.append("\n                    |   )\n                    |");
        return S3.a.Q(sb.toString());
    }
}
