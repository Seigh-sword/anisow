package x;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13632m;

    public g(p pVar) {
        super(pVar);
        this.f13624e = pVar instanceof k ? 2 : 3;
    }

    @Override // x.f
    public final void d(int i6) {
        if (this.f13629j) {
            return;
        }
        this.f13629j = true;
        this.f13626g = i6;
        for (d dVar : this.f13630k) {
            dVar.a(dVar);
        }
    }
}
