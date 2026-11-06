package M4;

/* JADX INFO: loaded from: classes.dex */
public final class L implements V {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1853w;

    public L(boolean z5) {
        this.f1853w = z5;
    }

    @Override // M4.V
    public final boolean c() {
        return this.f1853w;
    }

    @Override // M4.V
    public final n0 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f1853w ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
